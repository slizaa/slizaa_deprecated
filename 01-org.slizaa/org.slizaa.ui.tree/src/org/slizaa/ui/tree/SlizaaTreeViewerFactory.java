package org.slizaa.ui.tree;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.ui.tree.interceptors.ITreeEventInterceptor;
import org.slizaa.ui.tree.internal.SlizaaTreeViewerCreator;
import org.slizaa.ui.tree.internal.osgi.Activator;

import com.google.common.base.Supplier;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class SlizaaTreeViewerFactory {

  /** - */
  private static SlizaaTreeViewerCreator _creator;

  /**
   * <p>
   * </p>
   *
   * @param composedAdapterFactory
   */
  public static void setSlizaaTreeViewerCreator(ISlizaaActionContributionProvider slizaaActionContributionProvider,
      ComposedAdapterFactory adapterFactory, Supplier<IEclipseContext> contextSupplier) {

    checkState(_creator == null);

    //
    _creator = new SlizaaTreeViewerCreator(checkNotNull(slizaaActionContributionProvider), checkNotNull(adapterFactory),
        checkNotNull(contextSupplier));
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param style
   * @return
   */
  public static CheckboxTreeViewer createCheckboxTreeViewer(Composite parent, int style) {
    return slizaaTreeViewerCreator().createCheckboxTreeViewer(parent, style);
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
   * @return
   */
  public static TreeViewer createTreeViewer(Composite parent, int style, int autoExpandLevel,
      ITreeEventInterceptor eventInterceptor) {
    return slizaaTreeViewerCreator().createTreeViewer(parent, style, autoExpandLevel, eventInterceptor);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private static SlizaaTreeViewerCreator slizaaTreeViewerCreator() {

    //
    if (_creator == null) {

      // create the default OSGi based creator
      _creator = new SlizaaTreeViewerCreator(Activator.getDefault().getSlizaaActionContributionProvider(),
          Activator.getDefault().getComposedAdapterFactory(), () -> Activator.getDefault().getEclipseContext());
    }

    //
    return _creator;
  }
}
