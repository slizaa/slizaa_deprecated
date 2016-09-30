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
package org.slizaa.neo4j.graphdb.ui;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.neo4j.workbenchmodel.WorkbenchModel;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;

public class GraphDbViewPart {

  /** - */
  public static final String    PART_ID = GraphDbViewPart.class.getName();

  /** - */
  @Inject
  private WorkbenchModelService _workbenchService;

  /** - */
  @Inject
  private ESelectionService     _selectionService;

  /** - */
  private TreeViewer            _treeViewer;

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
    _treeViewer = createTreeViewer(parent, _workbenchService.getWorkbenchModel());
  }

  /**
   * <p>
   * </p>
   * 
   * @param parent
   * @param project
   * @return
   */
  private TreeViewer createTreeViewer(Composite parent, WorkbenchModel workbenchModel) {

    // TODO!
    TreeViewer treeViewer = SlizaaTreeViewerFactory.createTreeViewer(parent,
        workbenchModel.getDatabases());

    // treeViewer.addSelectionChangedListener(
    // ISelectionChangedListener() {
    //
    // @Override
    // public void selectionChanged(SelectionChangedEvent event) {
    //
    // //
    // IStructuredSelection selection = (IStructuredSelection)
    // event.getSelection();
    // _selectionService.setSelection(selection.size() == 1 ?
    // selection.getFirstElement() : selection.toArray());
    //
    // //
    // List<HGNode> rep = new LinkedList<>();
    // for (Object s : selection.toList()) {
    // if (!(s instanceof HGNode)) {
    // rep.clear();
    // break;
    // } else {
    // rep.add((HGNode) s);
    // }
    // }
    //
    // _hierarchicalGraphSelectionService.setCurrentNodeSelection(PART_ID,
    // rep);
    // }
    // });
    //
    // treeViewer.addPostSelectionChangedListener(new
    // ISelectionChangedListener() {
    //
    // @Override
    // public void selectionChanged(SelectionChangedEvent event) {
    //
    // //
    // IStructuredSelection selection = (IStructuredSelection)
    // event.getSelection();
    // _selectionService.setPostSelection(selection.size() == 1 ?
    // selection.getFirstElement() : selection.toArray());
    // }
    // });

    //
    return treeViewer;
  }
}
