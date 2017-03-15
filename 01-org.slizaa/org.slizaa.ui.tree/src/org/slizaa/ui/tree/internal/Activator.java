package org.slizaa.ui.tree.internal;

import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slizaa.ui.tree.ISlizaaActionContribution;
import org.slizaa.ui.tree.ISlizaaActionGroupContribution;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String                                                             PLUGIN_ID = "org.slizaa.ui.tree"; //$NON-NLS-1$

  // The shared instance
  private static Activator                                                               plugin;

  /** - */
  private static ComposedAdapterFactory                                                  _adapterFactory;

  /** - */
  private ServiceTracker<ISlizaaActionContribution, ISlizaaActionContribution>           _slizaaTreeActionTracker;

  /** - */
  private ServiceTracker<ISlizaaActionGroupContribution, ISlizaaActionGroupContribution> _slizaaActionGroupContribution;

  /** - */
  private ServiceTracker<IWorkbench, IWorkbench>                                         _workBenchServiceTracker;

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;

    //
    _slizaaTreeActionTracker = new ServiceTracker<>(context, ISlizaaActionContribution.class, null);
    _slizaaTreeActionTracker.open();

    //
    _slizaaActionGroupContribution = new ServiceTracker<>(context, ISlizaaActionGroupContribution.class, null);
    _slizaaActionGroupContribution.open();

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
  public ISlizaaActionContribution[] getSlizaaActionContributions() {
    return _slizaaTreeActionTracker.getServices(new ISlizaaActionContribution[0]);
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public ISlizaaActionGroupContribution[] getSlizaaActionGroupContributions() {
    return _slizaaActionGroupContribution.getServices(new ISlizaaActionGroupContribution[0]);
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
  public static ComposedAdapterFactory getComposedAdapterFactory() {
    if (_adapterFactory == null) {
      _adapterFactory = new ComposedAdapterFactory(new AdapterFactory[] { new ReflectiveItemProviderAdapterFactory(),
          new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) });
    }
    return _adapterFactory;
  }
  
  public static void setComposedAdapterFactory(ComposedAdapterFactory composedAdapterFactory) {
    _adapterFactory = composedAdapterFactory;
  }
}
