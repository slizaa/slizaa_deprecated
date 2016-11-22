package org.slizaa.neo4j.dbadapter.ui;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.slizaa.neo4j.dbadapter.DbAdapterContainer;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;

public class GraphDatabasesView {

  /** - */
  public static final String PART_ID = GraphDatabasesView.class.getName();

  /** - */
  @Inject
  private ESelectionService  _selectionService;

  @Inject
  private MPart              part;

  @Inject
  private DbAdapterRegistry  _dbAdapterRegistry;

  /** - */
  private TreeViewer         _treeViewer;

  /**
   * <p>
   * </p>
   *
   * @param parent
   */
  @PostConstruct
  public void createComposite(Composite parent) {

    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    parent.setLayout(layout);

    //
    _treeViewer = SlizaaTreeViewerFactory.createTreeViewer(parent, _dbAdapterRegistry);
    _treeViewer.expandAll();
    _treeViewer.addDoubleClickListener(new IDoubleClickListener() {

      @Override
      public void doubleClick(DoubleClickEvent event) {
        IStructuredSelection thisSelection = (IStructuredSelection) event.getSelection();
        Object selectedNode = thisSelection.getFirstElement();
        if (selectedNode instanceof Neo4jRestClient) {
          Neo4jRestClient restClient = (Neo4jRestClient) selectedNode;
          try {
            openFileInEditor(restClient.getDefiningResource());
          } catch (PartInitException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }
    });
    _dbAdapterRegistry.eAdapters().add(new EContentAdapter() {
      @Override
      public void notifyChanged(Notification msg) {
        Display.getDefault().asyncExec(new Runnable() {
          public void run() {
            _treeViewer.refresh();
            _treeViewer.expandAll();
          }
        });
      }
    });
    _treeViewer.setFilters(new ViewerFilter() {
      @Override
      public boolean select(Viewer viewer, Object parentElement, Object element) {
        if (element instanceof DbAdapterContainer) {
          return !((DbAdapterContainer) element).getChildren().isEmpty();
        }
        return true;
      }
    });

    // createToolBar();
  }

  // private void createToolBar() {
  //
  // //
  // MDirectToolItem one = MMenuFactory.INSTANCE.createDirectToolItem();
  // one.setTooltip("Create a new rest client");
  // one.setIconURI("platform:/plugin/org.slizaa.neo4j.dbadapter.ui/icons/obj16/newgraphdb.gif");
  // one.setContributionURI(getURI(AddRemoteServerHandler.class));
  // MToolBar toolBar = MMenuFactory.INSTANCE.createToolBar();
  // List<MToolBarElement> children = toolBar.getChildren();
  // children.add(one);
  // part.setToolbar(toolBar);
  // }

  // private String getURI(Class<?> clazz) {
  // Bundle bundle = FrameworkUtil.getBundle(clazz);
  // if (bundle != null) {
  // return "bundleclass://" + bundle.getSymbolicName() + "/" + clazz.getName();
  // } else {
  // return null;
  // }
  // }

  /**
   * Open the given file in an appropriate editor.
   * 
   * @param file
   *          - The file to open.
   * 
   * @throws PartInitException
   */
  public static void openFileInEditor(IFile file) throws PartInitException {

    // Get the active page.
    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

    // Figure out the default editor for the file type based on extension.
    IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());

    page.openEditor(new FileEditorInput(file), desc.getId());
  }
}
