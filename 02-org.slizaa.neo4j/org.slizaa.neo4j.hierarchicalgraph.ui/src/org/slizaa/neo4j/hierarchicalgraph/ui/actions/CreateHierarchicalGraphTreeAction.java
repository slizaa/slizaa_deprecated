package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.IHierarchicalGraphMappingService;
import org.slizaa.neo4j.hierarchicalgraph.mappingdsl.mappingDsl.MappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphViewPart;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorBasedItemLabelProviderImpl;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;
import org.slizaa.ui.common.context.ContextHelper;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component
public class CreateHierarchicalGraphTreeAction implements ISlizaaActionContribution {

  @Inject
  private IHierarchicalGraphMappingService _mappingService;

  @Inject
  private WorkbenchModelService            _workbenchModelService;

  @Inject
  private EPartService                     _partService;

  @Inject
  private MApplication                     _mApplication;

  @Inject
  private DbAdapterRegistry                _dbAdapterRegistry;

  @Override
  public String getParentGroupId() {
    return null;
  }

  @Override
  public int getRanking() {
    return 100;
  }

  @Override
  public boolean shouldShow(Object selection) {
    return selection instanceof Neo4jRestClient;
  }

  @Override
  public boolean isEnabled(Object selection) {
    Neo4jRestClient restClient = (Neo4jRestClient) selection;
    return restClient.isActive() && restClient.getHierarchicalGraph() == null;
  }

  @Override
  public void execute(Object selection) {

    //
    Neo4jRestClient remoteRepository = (Neo4jRestClient) selection;

    ElementListSelectionDialog dialog = new ElementListSelectionDialog(Display.getCurrent().getActiveShell(),
        new LabelProvider());

    List<String> names = new LinkedList<String>();
    List<MappingDescriptor> mappingDescriptors = ReadDescriptors.getMappingDescriptors();
    for (MappingDescriptor mappingDescriptor : mappingDescriptors) {
      names.add(mappingDescriptor.getQualifiedName());
    }
    dialog.setElements(names.toArray(new String[0]));
    dialog.setTitle("Which mapping should be applied?");

    // user pressed cancel
    if (dialog.open() != Window.OK) {
      return;
    }

    Object[] result = dialog.getResult();
    MappingDescriptor mapping = mappingDescriptors.stream().filter(md -> md.getQualifiedName().equals(result[0]))
        .findFirst().get();

    //
    LoadModelFromGraphDatabaseJob myJob = new LoadModelFromGraphDatabaseJob(remoteRepository, mapping);
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
  public String getLabel(Object selectedObject) {
    return "New Graph... ";
  }

  @Override
  public String getImagePath(Object selectedObject) {
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
    private Neo4jRestClient   _remoteRepository;

    /** - */
    private MappingDescriptor _mappingDescriptor;

    /**
     * <p>
     * Creates a new instance of type {@link LoadModelFromGraphDatabaseJob}.
     * </p>
     *
     * @param remoteRepository
     */
    public LoadModelFromGraphDatabaseJob(Neo4jRestClient remoteRepository, MappingDescriptor mappingDescriptor) {
      super("Creating hierarchical graph");

      //
      setUser(true);
      _remoteRepository = checkNotNull(remoteRepository);
      _mappingDescriptor = checkNotNull(mappingDescriptor);
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
      //
      try {

        // convert the model
        HGRootNode rootNode = _mappingService.convert(_mappingDescriptor, _remoteRepository, monitor);
        // set label provider
        rootNode.registerExtension(IItemLabelProvider.class,
            new MappingDescriptorBasedItemLabelProviderImpl(_mappingDescriptor));
        _remoteRepository.setHierarchicalGraph(rootNode);

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
