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
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.hierarchicalgraph.spi.INodeComparator;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.IHierarchicalGraphMappingService;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphViewPart;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorBasedItemLabelProviderImpl;
import org.slizaa.neo4j.hierarchicalgraph.ui.TEMPORARY_NodeComparator;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappings.ISlizaaMappingDescription;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappings.MappingDescriptorUtil;
import org.slizaa.ui.shared.context.ContextHelper;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component
public class CreateHierarchicalGraphTreeAction implements ISlizaaActionContribution {

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

    ElementListSelectionDialog dialog = new ElementListSelectionDialog(Display.getCurrent().getActiveShell(),
        new LabelProvider() {

          @Override
          public String getText(Object element) {
            ISlizaaMappingDescription mappingDescription = (ISlizaaMappingDescription) element;
            return mappingDescription.getMappingDescriptor().getMetaInformation() != null
                && mappingDescription.getMappingDescriptor().getMetaInformation().getName() != null
                    ? mappingDescription.getMappingDescriptor().getMetaInformation().getName()
                    : mappingDescription.getMappingDescriptor().getQualifiedName();
          }
        });

    dialog.setElements(MappingDescriptorUtil.getSlizaaMappingDescriptions().toArray());
    dialog.setTitle("Which mapping should be applied?");

    // user pressed cancel
    if (dialog.open() != Window.OK) {
      return;
    }

    Object[] result = dialog.getResult();

    //
    LoadModelFromGraphDatabaseJob myJob = new LoadModelFromGraphDatabaseJob(remoteRepository,
        (ISlizaaMappingDescription) result[0]);
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
    private Neo4jRestClient           _remoteRepository;

    /** - */
    private ISlizaaMappingDescription _slizaaMappingDescription;

    /**
     * <p>
     * Creates a new instance of type {@link LoadModelFromGraphDatabaseJob}.
     * </p>
     *
     * @param remoteRepository
     */
    public LoadModelFromGraphDatabaseJob(Neo4jRestClient remoteRepository,
        ISlizaaMappingDescription slizaaMappingDescription) {
      super("Creating hierarchical graph");

      //
      setUser(true);
      _remoteRepository = checkNotNull(remoteRepository);
      _slizaaMappingDescription = checkNotNull(slizaaMappingDescription);
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
      //
      try {

        // convert the model
        HGRootNode rootNode = _mappingService.convert(_slizaaMappingDescription.getMappingDescriptor(),
            _remoteRepository, monitor);

        // set label provider
        rootNode.registerExtension(INodeLabelProvider.class,
            new MappingDescriptorBasedItemLabelProviderImpl(_slizaaMappingDescription));

        // set comparator
        // TODO
        rootNode.registerExtension(INodeComparator.class, new TEMPORARY_NodeComparator());

        _remoteRepository.setHierarchicalGraph(rootNode);

        //
        ContextHelper.setRootNodeInContext(_mApplication.getContext(), SelectionIdentifier.CURRENT_ROOTNODE, rootNode);

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
