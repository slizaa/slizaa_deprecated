/*******************************************************************************
 * Copyright (c) Gerd Wütherich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd Wütherich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.neo4j.graphdb.ui.handler;

import javax.inject.Inject;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.slizaa.neo4j.graphdb.ui.dialog.UrlDialog;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;

public class AddRemoteServerHandler {

	/** - */
	@Inject
	private WorkbenchModelService _workbenchService;

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

					Neo4JRemoteRepository remoteRepository = Neo4jHierarchicalgraphFactory.eINSTANCE
							.createNeo4JRemoteRepository();
					remoteRepository.setBaseURI(uri);
					remoteRepository.setThreadPoolSize(20);
					remoteRepository.setName(uri);
					remoteRepository.init();

					_workbenchService.getWorkbenchModel().getDatabases().getContent().add(remoteRepository);
				}
			}
		});
	}
}
