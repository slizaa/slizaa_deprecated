package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.restclient.Neo4jRestClient;
import org.slizaa.ui.tree.SlizaaTreeAction;

@Component
public class ExternalLauncherTreeAction implements SlizaaTreeAction {

  @Override
  public boolean shouldShow(EObject eObject) {
    return eObject instanceof Neo4jRestClient;
  }

  @Override
  public boolean isEnabled(EObject eSelectedObject) {
    Neo4jRestClient repository = (Neo4jRestClient) eSelectedObject;
    // return repository.getHierarchicalGraphs().size() == 0;
    return true;
  }

  @Override
  public void execute(EObject object) {

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
//       String exec = "mvn.sh";
      // TODO
      // if (nameOS.toLowerCase().contains("win")) {
      // exec = "mvn.bat";
      // }
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_LOCATION", "C:\\NOA\\JQAssistant\\jqassistant.distribution-1.1.3\\bin\\jqassistant.cmd");
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_TOOL_ARGUMENTS",
          "server -s .\\jqassistant\\mapstruct");
      workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_WORKING_DIRECTORY", "C:\\NOA\\JQAssistant\\jqassistant.distribution-1.1.3");
      ILaunch launch = workingCopy.launch(ILaunchManager.RUN_MODE, new NullProgressMonitor());
System.out.println(launch);

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
