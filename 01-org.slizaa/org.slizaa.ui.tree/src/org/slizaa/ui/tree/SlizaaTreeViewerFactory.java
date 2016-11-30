package org.slizaa.ui.tree;

import org.eclipse.jface.viewers.CheckboxTreeViewer;
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
   * @param style
   * @return
   */
  public static CheckboxTreeViewer createCheckboxTreeViewer(Composite parent, int style) {
    return TreeCreator.createCheckboxTreeViewer(parent, style);
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param input
   * @return
   */
  public static TreeViewer createTreeViewer(Composite parent) {
    return createTreeViewer(parent, SWT.NO_BACKGROUND | SWT.NONE | SWT.MULTI);
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
  public static TreeViewer createTreeViewer(Composite parent, int style) {
    return createTreeViewer(parent, style, 3, null);
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
  public static TreeViewer createTreeViewer(Composite parent, int style, int autoExpandLevel,
      ITreeEventInterceptor eventInterceptor) {
    return TreeCreator.createTreeViewer(parent, style, autoExpandLevel, eventInterceptor);
  }
}
