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

    //
    _treeViewer = SlizaaTreeViewerFactory.createTreeViewer(parent, Activator.getDefault().getRestClientRegistry());
    _treeViewer.expandAll();

    createToolBar();
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
