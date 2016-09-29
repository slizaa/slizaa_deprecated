package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.swt.widgets.Display;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.IHierarchicalGraphMappingService;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphViewPart;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorBasedItemLabelProviderImpl;
import org.slizaa.neo4j.hierarchicalgraph.ui.deprecated.Descriptors;
import org.slizaa.neo4j.hierarchicalgraph.ui.deprecated.Descriptors2;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;
import org.slizaa.ui.common.context.ContextHelper;
import org.slizaa.ui.tree.SlizaaTreeAction;

@Component
public class CreateHierarchicalGraphTreeAction implements SlizaaTreeAction {

  @Inject
  private IHierarchicalGraphMappingService _mappingService;

  @Inject
  private WorkbenchModelService            _workbenchModelService;

  @Inject
  private EPartService                     _partService;

  @Inject
  private MApplication                     _mApplication;

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

    //
    Neo4JRemoteRepository remoteRepository = (Neo4JRemoteRepository) object;

    //
    LoadModelFromGraphDatabaseJob myJob = new LoadModelFromGraphDatabaseJob(remoteRepository);
    myJob.schedule();

    //
    Display.getDefault().asyncExec(new Runnable() {
      public void run() {
        MPart part = _partService.findPart(HierarchicalGraphViewPart.PART_ID);
        _partService.bringToTop(part);
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

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private class LoadModelFromGraphDatabaseJob extends Job {

    /** - */
    private Neo4JRemoteRepository _remoteRepository;

    /**
     * <p>
     * Creates a new instance of type {@link LoadModelFromGraphDatabaseJob}.
     * </p>
     *
     * @param remoteRepository
     */
    public LoadModelFromGraphDatabaseJob(Neo4JRemoteRepository remoteRepository) {
      super("Creating hierarchical graph");
      setUser(true);
      _remoteRepository = remoteRepository;
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
      //
      try {

        // create the default mapping descriptor
        HierarchicalGraphMappingDescriptor mappingDescriptor = Descriptors.createHierarchicalGraphMappingDescriptor();

        // convert the model
        HGRootNode rootNode = _mappingService.convert(mappingDescriptor, _remoteRepository, monitor);
        // set label provider
        rootNode.registerExtension(IItemLabelProvider.class,
            new MappingDescriptorBasedItemLabelProviderImpl(mappingDescriptor));
        _remoteRepository.getHierarchicalGraphs().add(rootNode);
        _workbenchModelService.getWorkbenchModel().getMappedGraphs().getContent().add(rootNode);

        //
        ContextHelper.setValueInContext(_mApplication.getContext(), SelectionIdentifier.CURRENT_ROOTNODE, rootNode);

      } catch (Exception e) {
        e.printStackTrace();
        MessageDialogs.openCannotConnectToServerDialog(_remoteRepository.getBaseURI());
      }
      return Status.OK_STATUS;
    }
  }
}
