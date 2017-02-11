package org.slizaa.neo4j.queryresult.ui.internal;

import static com.google.common.base.Preconditions.checkState;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "org.slizaa.neo4j.hierarchicalgraph.mapping.service"; //$NON-NLS-1$

  // The shared instance
  private static Activator   plugin;

  /** - */
  private String             _mainUrl;

  /** - */
  private String             _inProgressUrl;

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public String getMainUrl() {
    return _mainUrl;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public String getInProgressUrl() {
    return _inProgressUrl;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;

    //
    Bundle bundle = context.getBundle();

    Enumeration<String> contentEnumeration = bundle.getEntryPaths("content");

    checkState(contentEnumeration != null, "No bundle entry path 'content' found!");

    // extract content
    Collections.list(contentEnumeration).forEach((entry) -> {
      try {
        URL fileUrl = FileLocator.toFileURL(bundle.getEntry(entry));
        if (entry.endsWith("result.html")) {
          _mainUrl = fileUrl.toExternalForm();
        } else if (entry.endsWith("loader.html")) {
          _inProgressUrl = fileUrl.toExternalForm();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    });

    //
    if (_mainUrl == null) {
      throw new RuntimeException("Missing resource '/content/resource.html'.");
    }
  }

  /**
   * {@inheritDoc}
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
}
