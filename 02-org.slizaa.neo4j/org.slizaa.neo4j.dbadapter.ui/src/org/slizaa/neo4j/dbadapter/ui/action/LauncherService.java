package org.slizaa.neo4j.dbadapter.ui.action;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.ILaunchesListener2;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.io.IOException;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class LauncherService {

  /**
   * <p>
   * </p>
   */
  public static boolean isJQAssistantInstalled() {
    return getJQAssistantBundle() != null;
  }

  /**
   * <p>
   * </p>
   */
  public static Bundle getJQAssistantBundle() {

    //
    BundleContext context = FrameworkUtil.getBundle(LauncherService.class).getBundleContext();
    for (Bundle bundle : context.getBundles()) {
      if (bundle.getSymbolicName().equals("org.slizaa.org.jqassistant.distribution")) {
        return bundle;
      }
    }

    //
    return null;
  }

  /**
   * <p>
   * </p>
   * 
   * @throws IOException
   */
  public static void scan(ManagedNeo4jInstance managedInstance) throws IOException {

    //
    checkNotNull(managedInstance);

    //
    Bundle jqassistantBundle = getJQAssistantBundle();
    String jqassistantHomeDirectory = FileLocator.getBundleFile(jqassistantBundle).getAbsolutePath();

    //
    try {

      //
      ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
      ILaunchConfigurationType type = manager
          .getLaunchConfigurationType("org.eclipse.ui.externaltools.ProgramLaunchConfigurationType");

      //
      ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(type);
      for (int i = 0; i < configurations.length; i++) {
        ILaunchConfiguration configuration = configurations[i];
        if (configuration.getName().equals("slizaa_server")) {
          configuration.delete();
          break;
        }
      }

      ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, "slizaa_server");
      // String exec = "mvn.sh";
      // if (nameOS.toLowerCase().contains("win")) {
      // exec = "mvn.bat";
      // }
      
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_LOCATION",
          jqassistantHomeDirectory + "\\bin\\jqassistant.cmd");
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_TOOL_ARGUMENTS", String.format(
          "scan -reset -f %s -s %s", managedInstance.getDirectoriesToScan().get(0), managedInstance.getStorageArea()));
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_WORKING_DIRECTORY", jqassistantHomeDirectory);
      ILaunch launch = workingCopy.launch(ILaunchManager.RUN_MODE, new NullProgressMonitor());
      System.out.println(launch);

      manager.addLaunchListener(new ILaunchesListener2() {

        @Override
        public void launchesRemoved(ILaunch[] launches) {
          // TODO Auto-generated method stub

        }

        @Override
        public void launchesChanged(ILaunch[] launches) {
          // TODO Auto-generated method stub

        }

        @Override
        public void launchesAdded(ILaunch[] launches) {
          // TODO Auto-generated method stub

        }

        @Override
        public void launchesTerminated(ILaunch[] launches) {
          for (ILaunch launch : launches) {
            System.out.println("launchesTerminated: " + launch);
          }
        }
      });

      // launch.terminate();

    } catch (CoreException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
