package org.slizaa.ui.tree.internal;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl;
import org.slizaa.ui.common.context.BusyCursor;
import org.slizaa.ui.tree.ITreeEventInterceptor;

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
   * Creates a new instance of type {@link SlizaaTreeViewer}.
   * </p>
   *
   * @param parent
   * @param style
   * @param eventInterceptor
   */
  public SlizaaTreeViewer(Composite parent, int style, ITreeEventInterceptor eventInterceptor, int autoExpandLevel) {
    super(parent, style);

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

      BusyCursor.execute(getTree().getParent(), () -> {

        //
        if (_eventInterceptor != null) {
          _eventInterceptor.handleSelect((ExtendedHGNodeImpl) event.item.getData());
        }

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

      BusyCursor.execute(getTree().getParent(), () -> {

        //
        if (_eventInterceptor != null) {
          _eventInterceptor.handleTreeExpand((ExtendedHGNodeImpl) event.item.getData());
        }

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

      BusyCursor.execute(getTree().getParent(), () -> {

        //
        if (_eventInterceptor != null) {
          _eventInterceptor.handleTreeCollapse((ExtendedHGNodeImpl) event.item.getData());
        }

        //
        ExtendedHGNodeImpl hgNode = (ExtendedHGNodeImpl) event.item.getData();
        hgNode.onCollapse();
      });
    }
    super.handleTreeCollapse(event);
  }

}
