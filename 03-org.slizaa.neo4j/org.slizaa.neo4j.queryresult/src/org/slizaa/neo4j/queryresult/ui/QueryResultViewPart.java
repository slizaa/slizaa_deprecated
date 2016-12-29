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

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class QueryResultViewPart {

  /** - */
  public static final String PART_ID = QueryResultViewPart.class.getName();

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

    //
    Browser browser;
    browser = new Browser(parent, SWT.NONE);
    GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
    browser.setLayoutData(gridData);
    
    
    final String html = "<html><title>Snippet</title><body><p id='myid'>Best Friends</p><p id='myid2'>Cat and Dog</p></body></html>";
    browser.setText(html);
  }

  // @Inject
  // public void handleChangedDependencies(@Optional
  // @Named(SelectionIdentifier.CURRENT_ROOTNODE)
  // final HGRootNode rootNode) {
  //
  // //
  // if (_currentRootNode == rootNode) {
  // return;
  // }
  //
  // _currentRootNode = rootNode;
  // if (_treeViewer != null) {
  // if (_currentRootNode == null) {
  // _treeViewer.setInput(null);
  // _treeViewer.setComparator(null);
  // } else {
  // _treeViewer.setInput(new RootObject(rootNode));
  // if (rootNode.hasExtension(ViewerComparator.class)) {
  // _treeViewer.setComparator(_currentRootNode.getExtension(ViewerComparator.class));
  // }
  // }
  // }
  // }
}
