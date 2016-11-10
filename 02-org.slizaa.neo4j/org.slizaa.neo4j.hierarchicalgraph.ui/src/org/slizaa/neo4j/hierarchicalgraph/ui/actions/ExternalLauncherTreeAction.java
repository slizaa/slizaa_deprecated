package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.ILaunchesListener2;
import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.ui.tree.ISlizaaAction;

@Component
public class ExternalLauncherTreeAction implements ISlizaaAction {

  @Override
  public boolean shouldShow(Object selection) {
    return selection instanceof Neo4jRestClient;
  }

  @Override
  public boolean isEnabled(Object selection) {
    Neo4jRestClient repository = (Neo4jRestClient) selection;
    // return repository.getHierarchicalGraphs().size() == 0;
    return true;
  }

  @Override
  public void execute(Object selection) {

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
      // TODO
      // if (nameOS.toLowerCase().contains("win")) {
      // exec = "mvn.bat";
      // }
      String jqassistantHomeDirectory = "D:\\50-Development\\jqassistant-1.1.3-examples";

      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_LOCATION",
          jqassistantHomeDirectory + "\\bin\\jqassistant.cmd");
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_TOOL_ARGUMENTS",
          "server -s .\\jqassistant\\mapstructDB");
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

  @Override
  public String getLabel() {
    return "External launch... ";
  }

  @Override
  public String getImagePath() {
    return null;
  }
}
