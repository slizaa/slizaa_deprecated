package org.slizaa.ui.shared.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.PlatformUI;

public class DisableXTextDecorator implements IStartup {

  @Override
  public void earlyStartup() {
    try {
      System.out.println("DO IT");
      PlatformUI.getWorkbench().getDecoratorManager().setEnabled("org.eclipse.xtext.builder.nature.overlay", false);
    } catch (CoreException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
