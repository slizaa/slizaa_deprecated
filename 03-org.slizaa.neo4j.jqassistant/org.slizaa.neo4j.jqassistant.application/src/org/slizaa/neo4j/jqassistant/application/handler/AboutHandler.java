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
package org.slizaa.neo4j.jqassistant.application.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.FrameworkUtil;

public class AboutHandler {
  @Execute
  public void execute(Shell shell) {
    String version = FrameworkUtil.getBundle(this.getClass()).getVersion().toString();
    MessageDialog.openInformation(shell, "JQAssistant UI", String.format("JQAssistant UI (%s).", version));
  }
}
