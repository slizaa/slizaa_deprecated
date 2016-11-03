package org.slizaa.neo4j.restclient.ui;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.slizaa.neo4j.restclient.Neo4jRestClient;
import org.slizaa.neo4j.restclient.Neo4jRestClientContainer;
import org.slizaa.neo4j.restclient.Neo4jRestClientFactory;
import org.slizaa.neo4j.restclient.Neo4jRestClientRegistry;
import org.slizaa.neo4j.restclient.ui.handler.AddRemoteServerHandler;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;

public class GraphDatabasesView {

  /** - */
  public static final String PART_ID = GraphDatabasesView.class.getName();

  /** - */
  @Inject
  private ESelectionService  _selectionService;

  @Inject
  private MPart              part;

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

    Neo4jRestClientRegistry registry = Neo4jRestClientFactory.eINSTANCE.createNeo4jRestClientRegistry();

    Neo4jRestClientContainer restClientContainer = Neo4jRestClientFactory.eINSTANCE.createNeo4jRestClientContainer();
    restClientContainer.setName("Unmanaged");
    registry.getClients().add(restClientContainer);

    Neo4jRestClient restClient = Neo4jRestClientFactory.eINSTANCE.createNeo4jRestClient();
    restClient.setBaseURI("http://localhost:7474");
    restClient.setName("localhost");
    restClient.setThreadPoolSize(20);
    restClient.init();
    restClientContainer.getClients().add(restClient);

    //
    _treeViewer = createTreeViewer(parent, registry);

    createToolBar();
  }

  /**
   * <p>
   * </p>
   * 
   * @param parent
   * @param project
   * @return
   */
  private TreeViewer createTreeViewer(Composite parent, Neo4jRestClientRegistry registry) {

    TreeViewer treeViewer = SlizaaTreeViewerFactory.createTreeViewer(parent, registry);

    treeViewer.expandAll();

    // //
    // final TreeViewer treeViewer = new TreeViewer(parent, SWT.NO_SCROLL | SWT.V_SCROLL);
    //
    // //
    // GridDataFactory.fillDefaults().grab(true, true).applyTo(treeViewer.getControl());
    //
    // //
    // treeViewer
    // .setContentProvider(new AdapterFactoryContentProvider(Activator.getDefault().getComposedAdapterFactory()));
    // // treeViewer.getControl().setMenu(getMenu(treeViewer, editingDomain));
    // treeViewer.setInput(registry);
    //
    // //
    // treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(Activator.getDefault().getComposedAdapterFactory()));
    //
    // // set the layout data
    // treeViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    //
    return treeViewer;
  }

  private void createToolBar() {

    //
    MDirectToolItem one = MMenuFactory.INSTANCE.createDirectToolItem();
    one.setTooltip("Create a new rest client");
    one.setIconURI("platform:/plugin/org.slizaa.neo4j.restclient.ui/icons/obj16/newgraphdb.gif");
    one.setContributionURI(getURI(AddRemoteServerHandler.class));
    MToolBar toolBar = MMenuFactory.INSTANCE.createToolBar();
    List<MToolBarElement> children = toolBar.getChildren();
    children.add(one);
    part.setToolbar(toolBar);
  }

  private String getURI(Class<?> clazz) {
    Bundle bundle = FrameworkUtil.getBundle(clazz);
    if (bundle != null) {
      return "bundleclass://" + bundle.getSymbolicName() + "/" + clazz.getName();
    } else {
      return null;
    }
  }
}
