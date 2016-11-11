package org.slizaa.ui.tree;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.ui.tree.interceptors.ITreeEventInterceptor;
import org.slizaa.ui.tree.internal.TreeCreator;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class SlizaaTreeViewerFactory {

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param input
   * @return
   */
  public static TreeViewer createTreeViewer(Composite parent, Object input) {
    return createTreeViewer(parent, input, SWT.NO_BACKGROUND | SWT.NONE | SWT.MULTI);
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param input
   * @param style
   * @return
   */
  public static TreeViewer createTreeViewer(Composite parent, Object input, int style) {
    return createTreeViewer(parent, input, style, 3, null);
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param input
   * @param style
   * @param autoExpandLevel
   * @param eventInterceptor
   * @return
   */
  public static TreeViewer createTreeViewer(Composite parent, Object input, int style, int autoExpandLevel,
      ITreeEventInterceptor eventInterceptor) {
    return TreeCreator.createTreeViewer(parent, input, style, autoExpandLevel, eventInterceptor);
  }
}
