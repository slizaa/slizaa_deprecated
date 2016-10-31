package org.slizaa.neo4j.restclient.ui;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String                                 PLUGIN_ID = "org.slizaa.ui.tree"; //$NON-NLS-1$

  // The shared instance
  private static Activator                                   plugin;

  private ComposedAdapterFactory      _adapterFactory;

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
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
          new AdapterFactory[] { new ReflectiveItemProviderAdapterFactory(),
              new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) });
    }
    return _adapterFactory;
  }
}
