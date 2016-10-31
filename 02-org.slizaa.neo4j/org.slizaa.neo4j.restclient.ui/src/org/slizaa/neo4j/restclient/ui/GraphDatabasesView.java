package org.slizaa.neo4j.restclient.ui;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.neo4j.restclient.Neo4jRestClient;
import org.slizaa.neo4j.restclient.Neo4jRestClientFactory;
import org.slizaa.neo4j.restclient.Neo4jRestClientRegistry;

public class GraphDatabasesView {

  /** - */
  public static final String PART_ID = GraphDatabasesView.class.getName();

  /** - */
  @Inject
  private ESelectionService  _selectionService;

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
    System.out.println("CREATED");
    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    parent.setLayout(layout);

    Neo4jRestClientRegistry registry = Neo4jRestClientFactory.eINSTANCE.createNeo4jRestClientRegistry();
    Neo4jRestClient restClient = Neo4jRestClientFactory.eINSTANCE.createNeo4jRestClient();
    restClient.setBaseURI("http://localhost:7474");
    restClient.setName("Local");
    restClient.setThreadPoolSize(20);
    registry.getClients().add(restClient);

    //
    _treeViewer = createTreeViewer(parent, registry);
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

    //
    final TreeViewer treeViewer = new TreeViewer(parent, SWT.NO_SCROLL | SWT.V_SCROLL);

    //
    GridDataFactory.fillDefaults().grab(true, true).applyTo(treeViewer.getControl());

    //
    treeViewer.setContentProvider(new AdapterFactoryContentProvider(Activator.getDefault().getComposedAdapterFactory()));
//    treeViewer.getControl().setMenu(getMenu(treeViewer, editingDomain));
    treeViewer.setInput(registry);

    //
    treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(Activator.getDefault().getComposedAdapterFactory()));

    // set the layout data
    treeViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    // treeViewer.addSelectionChangedListener(
    // ISelectionChangedListener() {
    //
    // @Override
    // public void selectionChanged(SelectionChangedEvent event) {
    //
    // //
    // IStructuredSelection selection = (IStructuredSelection)
    // event.getSelection();
    // _selectionService.setSelection(selection.size() == 1 ?
    // selection.getFirstElement() : selection.toArray());
    //
    // //
    // List<HGNode> rep = new LinkedList<>();
    // for (Object s : selection.toList()) {
    // if (!(s instanceof HGNode)) {
    // rep.clear();
    // break;
    // } else {
    // rep.add((HGNode) s);
    // }
    // }
    //
    // _hierarchicalGraphSelectionService.setCurrentNodeSelection(PART_ID,
    // rep);
    // }
    // });
    //
    // treeViewer.addPostSelectionChangedListener(new
    // ISelectionChangedListener() {
    //
    // @Override
    // public void selectionChanged(SelectionChangedEvent event) {
    //
    // //
    // IStructuredSelection selection = (IStructuredSelection)
    // event.getSelection();
    // _selectionService.setPostSelection(selection.size() == 1 ?
    // selection.getFirstElement() : selection.toArray());
    // }
    // });

    //
    return treeViewer;
  }
}
