package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import static com.google.common.base.Preconditions.checkNotNull;

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
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.IHierarchicalGraphMappingService;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphViewPart;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorBasedItemLabelProviderImpl;
import org.slizaa.neo4j.hierarchicalgraph.ui.deprecated.Descriptors;
import org.slizaa.neo4j.hierarchicalgraph.ui.deprecated.Descriptors2;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;
import org.slizaa.ui.common.context.ContextHelper;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component
public class CreateHierarchicalGraphTreeAction implements ISlizaaActionContribution {

  private static final String              JAVA_MAPPING_FLAT_PACKAGES         = "Java mapping (flat packages)";

  private static final String              JAVA_MAPPING_HIERARCHICAL_PACKAGES = "Java mapping (hierarchical packages)";

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
    return 0;
  }

  @Override
  public boolean shouldShow(Object selection) {
    return selection instanceof Neo4jRestClient;
  }

  @Override
  public boolean isEnabled(Object selection) {
    return !_dbAdapterRegistry.hasHierarchicalGraph();
  }

  @Override
  public void execute(Object selection) {

    //
    Neo4jRestClient remoteRepository = (Neo4jRestClient) selection;

    ElementListSelectionDialog dialog = new ElementListSelectionDialog(Display.getCurrent().getActiveShell(),
        new LabelProvider());
    dialog.setElements(new String[] { JAVA_MAPPING_HIERARCHICAL_PACKAGES, JAVA_MAPPING_FLAT_PACKAGES });
    dialog.setTitle("Which mapping should be applied?");

    // user pressed cancel
    if (dialog.open() != Window.OK) {
      return;
    }

    HierarchicalGraphMappingDescriptor mapping = null;
    Object[] result = dialog.getResult();
    if (JAVA_MAPPING_HIERARCHICAL_PACKAGES.equals(result[0])) {
      mapping = Descriptors.createHierarchicalGraphMappingDescriptor();
    } else if (JAVA_MAPPING_FLAT_PACKAGES.equals(result[0])) {
      mapping = Descriptors2.createHierarchicalGraphMappingDescriptor();
    }

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
    private Neo4jRestClient                    _remoteRepository;

    /** - */
    private HierarchicalGraphMappingDescriptor _mappingDescriptor;

    /**
     * <p>
     * Creates a new instance of type {@link LoadModelFromGraphDatabaseJob}.
     * </p>
     *
     * @param remoteRepository
     */
    public LoadModelFromGraphDatabaseJob(Neo4jRestClient remoteRepository,
        HierarchicalGraphMappingDescriptor mappingDescriptor) {
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
