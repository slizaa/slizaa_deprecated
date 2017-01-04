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
package org.slizaa.neo4j.queryresult.ui;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class QueryResultViewPart {

  /** - */
  public static final String                                         PART_ID = QueryResultViewPart.class.getName();

  /** - */
  private Browser                                                    _browser;

  /** - */
  private ServiceTracker<IQueryResultProvider, IQueryResultProvider> _tracker;

  /**
   * <p>
   * </p>
   *
   * @param parent
   */
  @PostConstruct
  public void createComposite(Composite parent) {

    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    parent.setLayout(layout);

    _browser = new Browser(parent, SWT.NONE);
    GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
    _browser.setLayoutData(gridData);

    final String html = "<html><title>Snippet</title><body><p id='myid'>Best Friends</p><p id='myid2'>Cat and Dog</p></body></html>";
    _browser.setText(html);

    _tracker = new ServiceTracker<IQueryResultProvider, IQueryResultProvider>(
        FrameworkUtil.getBundle(QueryResultViewPart.class).getBundleContext(), IQueryResultProvider.class, null) {

      @Override
      public IQueryResultProvider addingService(ServiceReference<IQueryResultProvider> reference) {
        IQueryResultProvider queryResultProvider = super.addingService(reference);
        queryResultProvider.registerQueryResultHandler((query, result) -> Display.getDefault().syncExec(() -> {
          _browser.setText(result.toString());
        }));
        return queryResultProvider;
      }

      @Override
      public void modifiedService(ServiceReference<IQueryResultProvider> reference, IQueryResultProvider service) {
        //
      }

      @Override
      public void removedService(ServiceReference<IQueryResultProvider> reference, IQueryResultProvider service) {
        service.registerQueryResultHandler(null);
      }
    };
    _tracker.open();
  }

  @PreDestroy
  public void dispose() {
    _tracker.close();
  }
}
