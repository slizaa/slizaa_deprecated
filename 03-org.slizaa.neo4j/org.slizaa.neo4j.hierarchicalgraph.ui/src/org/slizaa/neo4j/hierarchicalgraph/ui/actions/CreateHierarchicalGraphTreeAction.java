package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.spi.INodeComparator;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.IHierarchicalGraphMappingService;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphViewPart;
import org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorBasedItemLabelProviderImpl;
import org.slizaa.neo4j.hierarchicalgraph.ui.TEMPORARY_NodeComparator;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappingsdialog.MappingDescriptorUtil;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappingsdialog.SelectMappingDialog;
import org.slizaa.ui.tree.ISlizaaActionContribution;
import org.slizaa.workbench.model.SlizaaWorkbenchModel;

@Component
public class CreateHierarchicalGraphTreeAction implements ISlizaaActionContribution {

  @Inject
  private SlizaaWorkbenchModel             _workbenchModel;

  @Inject
  private IHierarchicalGraphMappingService _mappingService;

  @Inject
  private EPartService                     _partService;

  @Inject
  private MApplication                     _mApplication;

  @Override
  public String getParentGroupId() {
    return null;
  }

  @Override
  public int getRanking() {
    return 100;
  }

  @Override
  public boolean shouldShow(List<?> selection, Viewer viewer) {
    return selection.stream().allMatch(n -> n instanceof Neo4jRestClient);
  }

  @Override
  public boolean isEnabled(List<?> selection, Viewer viewer) {
    return selection.size() == 1 && selection.get(0) instanceof Neo4jRestClient
        && ((Neo4jRestClient) selection.get(0)).isConnected()
        && ((Neo4jRestClient) selection.get(0)).getHierarchicalGraph() == null;
  }

  @Override
  public void execute(List<?> selection, Viewer viewer) {

    //
    Neo4jRestClient remoteRepository = (Neo4jRestClient) selection.get(0);

    SelectMappingDialog mappingDialog = new SelectMappingDialog(Display.getCurrent().getActiveShell(),
        MappingDescriptorUtil.getSlizaaMappingDescriptionContainer());

    // user pressed cancel
    if (mappingDialog.open() != Window.OK) {
      return;
    }

    //
    LoadModelFromGraphDatabaseJob myJob = new LoadModelFromGraphDatabaseJob(remoteRepository,
        mappingDialog.getMappingDescriptor());
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
  public String getLabel(List<?> selection) {
    return "New Graph... ";
  }

  @Override
  public String getImagePath(List<?> selection) {
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
    private Neo4jRestClient          _remoteRepository;

    /** - */
    private ISlizaaMappingDescriptor _slizaaMappingDescriptor;

    /**
     * <p>
     * Creates a new instance of type {@link LoadModelFromGraphDatabaseJob}.
     * </p>
     *
     * @param remoteRepository
     */
    public LoadModelFromGraphDatabaseJob(Neo4jRestClient remoteRepository,
        ISlizaaMappingDescriptor slizaaMappingDescriptor) {
      super("Creating hierarchical graph");

      //
      setUser(true);
      _remoteRepository = checkNotNull(remoteRepository);
      _slizaaMappingDescriptor = checkNotNull(slizaaMappingDescriptor);
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
      //
      try {

        // convert the model
        HGRootNode rootNode = _mappingService.convert(_slizaaMappingDescriptor.getMappingDescriptor(),
            _remoteRepository, monitor);

        // set label provider
        rootNode.registerExtension(INodeLabelProvider.class,
            new MappingDescriptorBasedItemLabelProviderImpl(_slizaaMappingDescriptor));

        // set comparator
        // TODO
        rootNode.registerExtension(INodeComparator.class, new TEMPORARY_NodeComparator());

        _remoteRepository.setHierarchicalGraph(rootNode);

        //
        _workbenchModel.setRootNode(rootNode);

      } catch (Exception e) {
        e.printStackTrace();
        Display.getDefault().syncExec(new Runnable() {
          public void run() {
            Throwable cause = e;
            while (cause.getCause() != null) {
              cause = cause.getCause();
            }
            MessageDialog.openError(Display.getDefault().getActiveShell(), "Error",
                "Cannot load model: " + cause.getMessage());
          }
        });
      }
      return Status.OK_STATUS;
    }
  }
}
