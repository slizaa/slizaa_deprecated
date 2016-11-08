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
package org.slizaa.neo4j.dbadapter.ui.handler;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Shell;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DeleteRemoteServerHandler {

  @Inject
  private ESelectionService _selectionService;

  @Execute
  public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) throws IOException {

//    SelectionUtils.doWithSelection(_selectionService.getSelection(), (remoteService) -> {
//
//			// //
//			// if (remoteService.hasAnalysisModel()) {
//			// if (!MessageDialog.openConfirm(shell, "Active Remote Server",
//			// "The remote server is in use. Deleting the server entry will also
//			// close any model created from this server. Delete?")) {
//			// return;
//			// }
//			// }
//			//
//			// //
//			// Configuration configuration;
//			// try {
//			// configuration =
//			// _configAdmin.getConfiguration(remoteService.getServicePID());
//			// configuration.delete();
//			// } catch (Exception e) {
//			// // TODO Auto-generated catch block
//			// e.printStackTrace();
//			// }
//    });
  }

  @CanExecute
  public boolean canExecute() {
    return SelectionUtils.onlyNeo4JRepositoriesSelected(_selectionService.getSelection());
  }
}
