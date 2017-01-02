package org.slizaa.neo4j.ui.discovery;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

public class SlizaajQAssistantStartupClass implements IStartup {

  @Override
  public void earlyStartup() {
    // http://www.wickedshell.net/blog/2010/03/executing-commands-programatically/
    // https://wiki.eclipse.org/FAQ_How_do_I_load_and_save_plug-in_preferences%3F

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
