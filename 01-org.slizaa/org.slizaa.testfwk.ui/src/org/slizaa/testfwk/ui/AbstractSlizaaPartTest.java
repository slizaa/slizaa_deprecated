package org.slizaa.testfwk.ui;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.swt.widgets.Shell;
import org.slizaa.hierarchicalgraph.provider.HierarchicalgraphItemProviderAdapterFactory;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;

public abstract class AbstractSlizaaPartTest extends AbstractSlizaaUITest {

  /** - */
  private IEclipseContext                   _eclipseContext;

  /** - */
  private DefaultActionContributionProvider _defaultActionContributionProvider;

  /**
   * {@inheritDoc}
   */
  public void beforeShellOpens(Shell shell) {
    
    _eclipseContext = EclipseContextFactory.create();
    _defaultActionContributionProvider = new DefaultActionContributionProvider();

    // manual add the adapter factory
    ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory();
    composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    composedAdapterFactory.addAdapterFactory(new HierarchicalgraphItemProviderAdapterFactory());
    configureComposedAdapterFactory(composedAdapterFactory);

    SlizaaTreeViewerFactory.setSlizaaTreeViewerCreator(_defaultActionContributionProvider, composedAdapterFactory,
        () -> eclipseContext());
  }
  
  /**
   * <p>
   * </p>
   *
   * @return
   */
  public final IEclipseContext eclipseContext() {
    return _eclipseContext;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public final DefaultActionContributionProvider defaultActionContributionProvider() {
    return _defaultActionContributionProvider;
  }

  /**
   * <p>
   * </p>
   *
   * @param composedAdapterFactory
   */
  protected void configureComposedAdapterFactory(ComposedAdapterFactory composedAdapterFactory) {
    // default
  }
}
