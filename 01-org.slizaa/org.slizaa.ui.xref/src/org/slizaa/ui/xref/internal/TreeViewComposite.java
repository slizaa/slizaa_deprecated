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
   * @param parent
   * @param interceptor
   * @param expandStrategy
   * @param hAlign horizontal alignment. One of SWT.BEGINNING, SWT.CENTER, SWT.END, or SWT.FILL.
   */
  public TreeViewComposite(Composite parent, DependencyResolvingTreeEventInterceptor interceptor,
      IExpandStrategy expandStrategy, int hAlign) {

    //
    Composite composite = new Composite(parent, SWT.NONE);
    GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).extendedMargins(0, 0, 0, 0).margins(0, 0)
        .applyTo(composite);

    //
    _toolBar = new ToolBar(composite, SWT.NONE);
    GridDataFactory.fillDefaults().align(hAlign, SWT.FILL).indent(0, 10).grab(true, false).applyTo(_toolBar);

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
