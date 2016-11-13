package org.slizaa.neo4j.dbadapter.ui.internal.action;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
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

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class LauncherService {

  /** - */
  private ILaunchManager                     _manager;

  /** - */
  private LauncherServiceLaunchesListener    _launchesListener;

  /** - */
  private ILaunchConfigurationType           _programLaunchConfigurationType;

  /** - */
  private Map<ILaunch, ManagedNeo4jInstance> _launch2managedNeo4jInstanceMap;

  /** - */
  private String                             _jqassistantHomeDirectory;

  /**
   * <p>
   * </p>
   */
  public void init() {

    //
    _manager = DebugPlugin.getDefault().getLaunchManager();

    //
    _programLaunchConfigurationType = _manager
        .getLaunchConfigurationType("org.eclipse.ui.externaltools.ProgramLaunchConfigurationType");

    //
    _launch2managedNeo4jInstanceMap = new HashMap<>();

    //
    _launchesListener = new LauncherServiceLaunchesListener();
    _manager.addLaunchListener(_launchesListener);
  }

  /**
   * <p>
   * </p>
   */
  public void dispose() {

    //
    _manager.removeLaunchListener(_launchesListener);

    //
    _launch2managedNeo4jInstanceMap.clear();
    _launch2managedNeo4jInstanceMap = null;
    _manager = null;
    _programLaunchConfigurationType = null;
  }

  /**
   * <p>
   * </p>
   */
  public boolean isJQAssistantInstalled() {
    return getJQAssistantBundle() != null;
  }

  /**
   * <p>
   * </p>
   */
  public Bundle getJQAssistantBundle() {

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
  public void scan(ManagedNeo4jInstance managedInstance) throws Exception {

    //
    checkNotNull(managedInstance);

    //
    execute("jQAssistant scan", managedInstance, workingCopy -> {
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_TOOL_ARGUMENTS", String.format(
          "scan -reset -f %s -s %s", managedInstance.getDirectoriesToScan().get(0), managedInstance.getStorageArea()));
    });
  }

  /**
   * <p>
   * </p>
   *
   * @param managedInstance
   * @return
   * @throws Exception
   */
  public ILaunch launch(ManagedNeo4jInstance managedInstance) throws Exception {

    //
    checkNotNull(managedInstance);

    //
    return execute("jQAssistant server", managedInstance, workingCopy -> {
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_TOOL_ARGUMENTS",
          String.format("server -s %s", managedInstance.getStorageArea()));
    });
  }

  /**
   * <p>
   * </p>
   *
   * @param managedInstance
   * @return
   * @throws Exception
   */
  public ILaunch enrich(ManagedNeo4jInstance managedInstance) throws Exception {

    //
    checkNotNull(managedInstance);

    return execute("Enrich", managedInstance, workingCopy -> {
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_TOOL_ARGUMENTS",
          String.format("analyze -concepts classpath:Resolve -s %s", managedInstance.getStorageArea()));
    });
  }

  /**
   * <p>
   * </p>
   *
   * @param name
   * @param managedInstance
   * @param consumer
   * @return
   * @throws Exception
   */
  private ILaunch execute(String name, ManagedNeo4jInstance managedInstance,
      Consumer<ILaunchConfigurationWorkingCopy> consumer) throws Exception {

    //
    checkNotNull(managedInstance);
    checkNotNull(name);
    checkNotNull(consumer);

    //
    deleteLaunchConfiguration(name);

    //
    ILaunchConfigurationWorkingCopy workingCopy = _programLaunchConfigurationType.newInstance(null, name);

    //
    String exec = "jqassistant.sh";
    if (Platform.getOS().toLowerCase().contains("win")) {
      exec = "jqassistant.cmd";
    }

    //
    workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_LOCATION",
        getJQAssistantHomeDirectory() + "\\bin\\" + exec);

    workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_WORKING_DIRECTORY", getJQAssistantHomeDirectory());
    
    consumer.accept(workingCopy);

    ILaunch launch = workingCopy.launch(ILaunchManager.RUN_MODE, new NullProgressMonitor());
    managedInstance.setLaunch(launch);
    _launch2managedNeo4jInstanceMap.put(launch, managedInstance);
    return launch;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   * @throws IOException
   */
  private String getJQAssistantHomeDirectory() {

    //
    if (_jqassistantHomeDirectory == null) {
      Bundle jqassistantBundle = getJQAssistantBundle();
      try {
        _jqassistantHomeDirectory = FileLocator.getBundleFile(jqassistantBundle).getAbsolutePath();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

    //
    return _jqassistantHomeDirectory;
  }

  /**
   * <p>
   * </p>
   *
   * @param name
   * @return
   * @throws CoreException
   */
  private void deleteLaunchConfiguration(String name) throws CoreException {

    //
    ILaunchConfiguration[] configurations = _manager.getLaunchConfigurations(_programLaunchConfigurationType);
    for (int i = 0; i < configurations.length; i++) {
      ILaunchConfiguration configuration = configurations[i];
      if (configuration.getName().equals(checkNotNull(name))) {
        configuration.delete();
        break;
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private class LauncherServiceLaunchesListener implements ILaunchesListener2 {

    @Override
    public void launchesRemoved(ILaunch[] launches) {

    }

    @Override
    public void launchesChanged(ILaunch[] launches) {

    }

    @Override
    public void launchesAdded(ILaunch[] launches) {

    }

    @Override
    public void launchesTerminated(ILaunch[] launches) {
      for (ILaunch iLaunch : launches) {
        ManagedNeo4jInstance managedNeo4jInstance = _launch2managedNeo4jInstanceMap.remove(iLaunch);
        if (managedNeo4jInstance != null) {
          managedNeo4jInstance.setLaunch(null);
        }
        try {
          iLaunch.getLaunchConfiguration().delete();
        } catch (CoreException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }
  }
}
