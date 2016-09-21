package org.slizaa.ui.tree.internal;

import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecp.view.model.common.edit.provider.CustomReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slizaa.ui.tree.SlizaaTreeAction;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String                                 PLUGIN_ID = "org.slizaa.ui.tree"; //$NON-NLS-1$

  // The shared instance
  private static Activator                                   plugin;

  /** - */
  private ServiceTracker<SlizaaTreeAction, SlizaaTreeAction> _slizaaTreeActionTracker;

  private ServiceTracker<IWorkbench, IWorkbench>             _workBenchServiceTracker;
  
  private ComposedAdapterFactory      _adapterFactory;

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;

    //
    _slizaaTreeActionTracker = new ServiceTracker<>(context, SlizaaTreeAction.class, null);
    _slizaaTreeActionTracker.open();

    //
    _workBenchServiceTracker = new ServiceTracker<>(context, IWorkbench.class, null);
    _workBenchServiceTracker.open();
  }

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);

    //
    _slizaaTreeActionTracker.close();
    _workBenchServiceTracker.close();
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public SlizaaTreeAction[] getSlizaaTreeActions() {
    return _slizaaTreeActionTracker.getServices(new SlizaaTreeAction[0]);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public IWorkbench getE4Workbench() {
    return _workBenchServiceTracker.getService();
  }

  /**
   * Returns the shared instance
   *
   * @return the shared instance
   */
  public static Activator getDefault() {
    return plugin;
  }
  
  /**
   * Gives access to the composed adapter factory.
   *
   * @return the adapter factory
   */
  public ComposedAdapterFactory getComposedAdapterFactory() {
    if (_adapterFactory == null) {
      _adapterFactory = new ComposedAdapterFactory(
          new AdapterFactory[] { new CustomReflectiveItemProviderAdapterFactory(),
              new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) });
    }
    return _adapterFactory;
  }
}
