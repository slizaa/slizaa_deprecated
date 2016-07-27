package org.slizaa.ui.klighd;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slizaa.selection.IHierarchicalGraphSelectionService;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.slizaa.ui.klighd"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private ServiceTracker<IHierarchicalGraphSelectionService, IHierarchicalGraphSelectionService> _hierarchicalGraphSelectionserviceTracker;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}
	
	public IHierarchicalGraphSelectionService getHierarchicalGraphSelectionService() {
    return _hierarchicalGraphSelectionserviceTracker.getService();
  }

  /*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		//
		_hierarchicalGraphSelectionserviceTracker = new ServiceTracker<>(context, IHierarchicalGraphSelectionService.class, null);
		_hierarchicalGraphSelectionserviceTracker.open();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		
		//
    _hierarchicalGraphSelectionserviceTracker.close();
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
