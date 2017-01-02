package org.slizaa.neo4j.dbadapter;

import java.io.IOException;

import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.slizaa.neo4j.dbadapter.internal.LauncherService;

public class GraphDatabaseUtil {

  /**
   * <p>
   * </p>
   *
   * @return
   * @throws IOException
   */
  public static String getGraphDatabaseHomeDirectory() {

    //
    Bundle jqassistantBundle = getGraphDatabaseBundle();
    if (jqassistantBundle != null) {
      try {
        return FileLocator.getBundleFile(jqassistantBundle).getAbsolutePath();
      } catch (IOException e) {
        return null;
      }
    }

    //
    return null;
  }

  /**
   * <p>
   * </p>
   */
  public static boolean isGraphDatabaseInstalled() {
    return getGraphDatabaseBundle() != null;
  }

  /**
   * <p>
   * </p>
   */
  public static Bundle getGraphDatabaseBundle() {

    //
    BundleContext context = FrameworkUtil.getBundle(LauncherService.class).getBundleContext();
    for (Bundle bundle : context.getBundles()) {
      // TODO
      if (bundle.getSymbolicName().equals("org.slizaa.org.jqassistant.distribution")) {
        return bundle;
      }
    }

    //
    return null;
  }
}
