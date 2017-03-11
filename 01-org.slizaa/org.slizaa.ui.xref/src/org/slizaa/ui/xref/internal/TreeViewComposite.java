package org.slizaa.ui.xref.internal;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;
import org.slizaa.ui.tree.expand.IExpandStrategy;
import org.slizaa.ui.tree.interceptors.DependencyResolvingTreeEventInterceptor;

public class TreeViewComposite {

  /** the from tree viewer */
  private TreeViewer      _treeViewer;

  /** - */
  private IExpandStrategy _treeExpandStrategy;

  private ToolBar         _toolBar;

  /**
   * <p>
   * Creates a new instance of type {@link TreeViewComposite}.
   * </p>
   *
   * @param interceptor
   */
  public TreeViewComposite(Composite parent, DependencyResolvingTreeEventInterceptor interceptor,
      IExpandStrategy expandStrategy) {

    Composite composite = new Composite(parent, SWT.NONE);
    GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).margins(0, 0).applyTo(composite);

    //
    _toolBar = new ToolBar(composite, SWT.NONE);
    GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).grab(true, false).applyTo(_toolBar);

    Image image = new Image(Display.getCurrent(), 16, 16);
    ToolItem item = new ToolItem(_toolBar, SWT.PUSH);
    item.setImage(image);

    //
    _treeViewer = SlizaaTreeViewerFactory.createTreeViewer(composite, SWT.NO_BACKGROUND | SWT.MULTI, 2, interceptor);
    _treeExpandStrategy = expandStrategy;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public TreeViewer getTreeViewer() {
    return _treeViewer;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public ToolBar getToolBar() {
    return _toolBar;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public IExpandStrategy getTreeExpandStrategy() {
    return _treeExpandStrategy;
  }
}
