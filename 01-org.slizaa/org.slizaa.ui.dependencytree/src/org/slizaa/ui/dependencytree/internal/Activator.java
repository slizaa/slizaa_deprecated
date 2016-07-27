/*******************************************************************************
 * Copyright (c) Gerd W�therich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd W�therich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.ui.dependencytree.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "org.slizaa.core.eclipse.ui.view.dependencytree"; //$NON-NLS-1$

  // The shared instance
  private static Activator   plugin;

  /**
   * The constructor
   */
  public Activator() {
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;

  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  @Override
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
   * Creates a new {@link IStatus} object reporting a Warning
   * <p>
   * </p>
   * 
   * @param message
   *          The error message
   * @param throwable
   *          The causing throwable if applicable, otherwise null
   * @return
   */
  public static IStatus newWarning(String message, Throwable throwable) {
    return new Status(IStatus.WARNING, Activator.PLUGIN_ID, message, throwable);
  }

  /**
   * Creates a new {@link IStatus} object reporting an Error
   * <p>
   * </p>
   * 
   * @param message
   *          The error message
   * @param throwable
   *          The causing throwable if applicable, otherwise null
   * @return
   */
  public static IStatus newError(String message, Throwable throwable) {
    return new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, throwable);
  }

  /**
   * <p>
   * Constructs a new {@link IStatus} for the given {@link CoreException}.
   * </p>
   * 
   * @param coreException
   *          The coreException
   * @param message
   *          An optional message. If null the message from the coreException will be used
   * @return
   */
  public static IStatus newStatus(CoreException coreException, String message) {
    String actualMessage = (message == null ? coreException.getMessage() : message);
    return new Status(coreException.getStatus().getSeverity(), Activator.PLUGIN_ID, actualMessage, coreException);
  }

  /**
   * Logs the given error
   * <p>
   * </p>
   * 
   * @param message
   *          The message
   * @param throwable
   *          The causing throwable if applicable
   */
  public static void logError(String message, Throwable throwable) {
    IStatus error = newError(message, throwable);
    Activator.getDefault().getLog().log(error);
  }

  /**
   * <p>
   * </p>
   * 
   * @param message
   * @param args
   */
  public static void logErrorMessage(String message, Object... args) {
    IStatus error = newError(String.format(message, args), null);
    Activator.getDefault().getLog().log(error);
  }
}
