package org.slizaa.ui.tree.internal;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl;
import org.slizaa.ui.common.context.BusyCursor;
import org.slizaa.ui.tree.ITreeEventInterceptor;

import com.codeaffine.eclipse.swt.widget.scrollable.FlatScrollBarTree;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class SlizaaTreeViewer extends TreeViewer {

  /** - */
  private ITreeEventInterceptor _eventInterceptor;

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static SlizaaTreeViewer createSlizaaTreeViewer(Composite parent, int style,
      ITreeEventInterceptor eventInterceptor, int autoExpandLevel) {

    //
    FlatScrollBarTree flatScrollBarTree = new FlatScrollBarTree(parent, (adapter) -> new Tree(adapter, SWT.NO_SCROLL | SWT.V_SCROLL | style));
    flatScrollBarTree.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED));
    flatScrollBarTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    
    //
    return new SlizaaTreeViewer(flatScrollBarTree.getTree(), eventInterceptor, autoExpandLevel);
  }

  /**
   * <p>
   * Creates a new instance of type {@link SlizaaTreeViewer}.
   * </p>
   *
   * @param parent
   * @param style
   * @param eventInterceptor
   */
  SlizaaTreeViewer(Tree tree, ITreeEventInterceptor eventInterceptor, int autoExpandLevel) {
    super(tree);

    //
    _eventInterceptor = eventInterceptor;

    //
    setAutoExpandLevel(autoExpandLevel);
    setUseHashlookup(true);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void handleSelect(SelectionEvent event) {

    //
    if (event.item.getData() instanceof ExtendedHGNodeImpl) {

      //
      if (_eventInterceptor != null) {
        _eventInterceptor.handleSelect((ExtendedHGNodeImpl) event.item.getData());
      }

      BusyCursor.execute(getTree().getParent(), () -> {
        ExtendedHGNodeImpl hgNode = (ExtendedHGNodeImpl) event.item.getData();
        hgNode.onSelect();
      });
    }
    super.handleSelect(event);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void handleTreeExpand(TreeEvent event) {

    //
    if (event.item.getData() instanceof ExtendedHGNodeImpl) {

      //
      if (_eventInterceptor != null) {
        _eventInterceptor.handleTreeExpand((ExtendedHGNodeImpl) event.item.getData());
      }

      BusyCursor.execute(getTree().getParent(), () -> {
        ExtendedHGNodeImpl hgNode = (ExtendedHGNodeImpl) event.item.getData();
        hgNode.onExpand();
      });
    }
    super.handleTreeExpand(event);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void handleTreeCollapse(TreeEvent event) {

    //
    if (event.item.getData() instanceof ExtendedHGNodeImpl) {

      //
      if (_eventInterceptor != null) {
        _eventInterceptor.handleTreeCollapse((ExtendedHGNodeImpl) event.item.getData());
      }

      //
      BusyCursor.execute(getTree().getParent(), () -> {
        ExtendedHGNodeImpl hgNode = (ExtendedHGNodeImpl) event.item.getData();
        hgNode.onCollapse();
      });
    }
    super.handleTreeCollapse(event);
  }

}
