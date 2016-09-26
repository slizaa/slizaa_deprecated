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
package org.slizaa.neo4j.hierarchicalgraph.ui;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.neo4j.workbenchmodel.MappedGraphs;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;
import org.slizaa.ui.common.context.ContextHelper;
import org.slizaa.ui.tree.SlizaaTreeFactory;

public class HierarchicalGraphViewPart {

  /** - */
  public static final String    PART_ID = HierarchicalGraphViewPart.class.getName();

  /** - */
  @Inject
  private WorkbenchModelService _workbenchModelService;

  @Inject
  private ESelectionService     _selectionService;

  @Inject
  private MApplication          _mApplication;

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
    createTreeViewer(parent, _workbenchModelService.getWorkbenchModel().getMappedGraphs());
  }

  /**
   * <p>
   * </p>
   * 
   * @param parent
   * @param project
   * @return
   */
  private TreeViewer createTreeViewer(Composite parent, MappedGraphs mappedGraphs) {

    TreeViewer treeViewer = SlizaaTreeFactory.createTreeViewer(parent, mappedGraphs,
        SWT.NO_BACKGROUND | SWT.NONE | SWT.MULTI, 2);

    // TODO: MOVE SORTER TO Graph module!!!
    treeViewer.setSorter(new CustomViewerSorter());
    treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

      @Override
      public void selectionChanged(SelectionChangedEvent event) {

        //
        IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        _selectionService.setSelection(selection.size() == 1 ? selection.getFirstElement() : selection.toArray());

        //
        List<HGNode> rep = new LinkedList<>();
        for (Object s : selection.toList()) {
          if (!(s instanceof HGNode)) {
            rep.clear();
            break;
          } else {
            rep.add((HGNode) s);
          }
        }

        //
        ContextHelper.setValueInContext(_mApplication.getContext(),
            SelectionIdentifier.CURRENT_MAIN_NODE_SELECTION, rep);
      }
    });

    treeViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {

      @Override
      public void selectionChanged(SelectionChangedEvent event) {

        //
        IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        _selectionService.setPostSelection(selection.size() == 1 ? selection.getFirstElement() : selection.toArray());
      }
    });

    //
    return treeViewer;
  }
}
