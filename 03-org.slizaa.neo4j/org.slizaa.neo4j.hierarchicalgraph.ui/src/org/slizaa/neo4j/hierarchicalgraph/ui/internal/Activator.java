package org.slizaa.neo4j.hierarchicalgraph.ui.internal;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappingsdialog.BundleBasedMappingsTracker;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String         PLUGIN_ID         = "org.slizaa.neo4j.hierarchicalgraph.mapping.service"; //$NON-NLS-1$

  // The shared instance
  private static Activator           plugin;

  /** - */
  private BundleBasedMappingsTracker _tracker;

  /**
   * {@inheritDoc}
   */
  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;

    _tracker = new BundleBasedMappingsTracker(context);
    _tracker.open();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);

    _tracker.close();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public BundleBasedMappingsTracker getMappingsTracker() {
    return _tracker;
  }

  /**
   * Returns the shared instance
   *
   * @return the shared instance
   */
  public static Activator getDefault() {
    return plugin;
  }
}
