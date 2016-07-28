package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import java.lang.reflect.InvocationTargetException;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.IHierarchicalGraphMappingService;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphViewPart;
import org.slizaa.neo4j.hierarchicalgraph.ui.deprecated.Descriptors2;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;
import org.slizaa.ui.tree.SlizaaTreeAction;

@Component
public class CreateHierarchicalGraphTreeAction implements SlizaaTreeAction {

  @Inject
  private IHierarchicalGraphMappingService _mappingService;

  @Inject
  private WorkbenchModelService            _workbenchModelService;

  @Inject
  private EPartService                     _partService;

  @Override
  public boolean shouldShow(EObject eObject) {
    return eObject instanceof Neo4JRemoteRepository;
  }

  @Override
  public boolean isEnabled(EObject eSelectedObject) {
    Neo4JRemoteRepository repository = (Neo4JRemoteRepository) eSelectedObject;
    return repository.getHierarchicalGraphs().size() == 0;
  }

  @Override
  public void execute(EObject object) {

    Neo4JRemoteRepository remoteRepository = (Neo4JRemoteRepository) object;

    Display.getCurrent().asyncExec(() -> {

      ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(Display.getCurrent().getActiveShell());
      //
      try {
        progressDialog.run(false, false, new IRunnableWithProgress() {

          @Override
          public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
            monitor.beginTask("Creating internal model...", 50);
            try {

              // create the default mapping descriptor
              HierarchicalGraphMappingDescriptor mappingDescriptor = Descriptors2
                  .createHierarchicalGraphMappingDescriptor();

              // convert the model
              // TODO
              HGRootNode rootElement = _mappingService.convert(mappingDescriptor, remoteRepository);
              remoteRepository.getHierarchicalGraphs().add(rootElement);
              _workbenchModelService.getWorkbenchModel().getMappedGraphs().getContent().add(rootElement);

            } catch (Exception e) {
              MessageDialogs.openCannotConnectToServerDialog(remoteRepository.getBaseURI());
            }
            monitor.done();
          }
        });
      } catch (InvocationTargetException e) {
        e.printStackTrace();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      //
      try {
        MPart part = _partService.findPart(HierarchicalGraphViewPart.PART_ID);
        _partService.bringToTop(part);
      } catch (Exception e) {
        // simply ignore
      }
    });
  }

  @Override
  public String getLabel() {
    return "New Graph... ";
  }

  @Override
  public String getImagePath() {
    return null;
  }
}
