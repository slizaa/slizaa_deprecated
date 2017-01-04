package org.slizaa.neo4j.ui.discovery;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.GraphDatabaseUtil;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component(service = ISlizaaActionContribution.class)
public class InstallLocalDatabaseSupportContribution extends ISlizaaActionContribution.DefaultActionContribution {

  public InstallLocalDatabaseSupportContribution() {
    super("Install Local Database Support...", null, null, 200);
  }

  @Override
  public boolean shouldShow(Object selectedObject) {
    return !GraphDatabaseUtil.isGraphDatabaseInstalled();
  }

  @Override
  public void execute(Object selectedObject) {
    Display.getDefault().syncExec(new Runnable() {
      public void run() {

        ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);
        try {
          Command command = commandService.getCommand("org.eclipse.equinox.p2.ui.discovery.commands.ShowBundleCatalog");
          Map<String, String> parameters = new HashMap<>();
          parameters.put("org.eclipse.equinox.p2.ui.discovery.commands.DirectoryParameter",
              "http://www.slizaa.org/p2/org.slizaa.org.jqassistant.distribution/directory.xml");
          command.executeWithChecks(new ExecutionEvent(command, parameters, null, null));
        } catch (Exception exception) {
          exception.printStackTrace();
        }
      }
    });
  }
}
