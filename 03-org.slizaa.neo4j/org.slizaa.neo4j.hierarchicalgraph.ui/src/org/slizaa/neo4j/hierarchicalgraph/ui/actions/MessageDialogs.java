/*******************************************************************************
 * Copyright (c) Gerd W�therich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd W�therich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

public class MessageDialogs {

  public static void openCannotConnectToServerDialog(String serverName) {
    Display.getDefault().syncExec(new Runnable() {
      public void run() {
        MessageDialog.openError(Display.getDefault().getActiveShell(), "Error",
            "Cannot connect to server '" + serverName + "'.");
      }
    });
  }

  public static void openSuccessfullyConnectedToServer(String serverName) {
    Display.getDefault().syncExec(new Runnable() {
      public void run() {
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Info",
            "Successfully connected to server '" + serverName + "'.");
      }
    });
  }
}
