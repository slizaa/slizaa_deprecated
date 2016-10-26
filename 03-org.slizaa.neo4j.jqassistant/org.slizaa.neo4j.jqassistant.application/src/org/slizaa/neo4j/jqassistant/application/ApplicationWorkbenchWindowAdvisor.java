package org.slizaa.neo4j.jqassistant.application;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

  public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
    super(configurer);
  }

  @Override
  public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
    return new ApplicationActionBarAdvisor(configurer);
  }

  @Override
  public void preWindowOpen() {
    IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
    configurer.setInitialSize(new Point(1200, 900));
    configurer.setShowPerspectiveBar(false);
    configurer.setShowStatusLine(false);
    configurer.setTitle("Slizaa"); //$NON-NLS-1$
  }

  @Override
  public void postWindowCreate() {
    IWorkbenchWindow workbenchWindow = getWindowConfigurer().getWindow();
    for (IWorkbenchPage workbenchPage : workbenchWindow.getPages()) {
      workbenchPage.hideActionSet("org.eclipse.search.searchActionSet");
      workbenchPage.hideActionSet("org.eclipse.ui.externaltools.ExternalToolsSet");
    }
  }
}
