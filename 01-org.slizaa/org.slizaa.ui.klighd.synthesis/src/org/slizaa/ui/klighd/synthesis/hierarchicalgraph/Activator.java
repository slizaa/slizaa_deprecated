package org.slizaa.ui.klighd.synthesis.hierarchicalgraph;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slizaa.selection.IHierarchicalGraphSelectionService;

public class Activator implements BundleActivator {

  /** - */
  private static Activator                                                                       _activator;

  /** - */
  private ServiceTracker<IHierarchicalGraphSelectionService, IHierarchicalGraphSelectionService> _hierarchicalGraphSelectionServiceTracker;

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static Activator getDefault() {
    return _activator;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public IHierarchicalGraphSelectionService getHierarchicalGraphSelectionService() {
    return _hierarchicalGraphSelectionServiceTracker.getService();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void start(BundleContext context) throws Exception {
    _activator = this;

    //
    _hierarchicalGraphSelectionServiceTracker = new ServiceTracker<>(context, IHierarchicalGraphSelectionService.class,
        null);
    _hierarchicalGraphSelectionServiceTracker.open();

  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void stop(BundleContext context) throws Exception {
    _activator = null;

    //
    _hierarchicalGraphSelectionServiceTracker.close();
  }

}
