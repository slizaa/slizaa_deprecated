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

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.slizaa.neo4j.dbadapter.DbadapterFactory;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.dbadapter.ui.dialog.UrlDialog;
import org.slizaa.neo4j.dbadapter.ui.internal.Activator;

public class AddRemoteServerHandler {

  @Execute
  public void execute(Shell shell) {

    // BundleContext bundleContext =
    // FrameworkUtil.getBundle(AddJqaServerHandler.class).getBundleContext();
    // IEclipseContext eclipseContext =
    // EclipseContextFactory.getServiceContext(bundleContext);
    // ContextInjectionFactory.inject(dialog, eclipseContext);

    //
    Realm.runWithDefault(DisplayRealm.getRealm(shell.getDisplay()), new Runnable() {
      @Override
      public void run() {

        // The SWT event loop
        Display display = Display.getCurrent();

        //
        UrlDialog dialog = new UrlDialog(display.getActiveShell());

        //
        if (dialog.open() == Dialog.OK) {
          String uri = dialog.getUri();

          Neo4jRestClient neo4RestClient = DbadapterFactory.eINSTANCE.createNeo4jRestClient();
          neo4RestClient.setBaseURI(uri);
          neo4RestClient.setThreadPoolSize(20);
          neo4RestClient.setName(uri);
          neo4RestClient.init();

          Activator.getDefault().getRestClientRegistry().getClients().add(neo4RestClient);
        }
      }
    });
  }
}
