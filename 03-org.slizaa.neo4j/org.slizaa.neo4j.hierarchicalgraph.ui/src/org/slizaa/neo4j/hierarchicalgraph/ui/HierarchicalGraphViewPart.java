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
package org.slizaa.neo4j.hierarchicalgraph.ui;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
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
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.hierarchicalgraph.spi.INodeComparator;
import org.slizaa.ui.shared.NodeComparator2ViewerComparatorAdapter;
import org.slizaa.ui.shared.context.ContextHelper;
import org.slizaa.ui.shared.context.RootObject;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;

public class HierarchicalGraphViewPart {

  /** - */
  public static final String PART_ID = HierarchicalGraphViewPart.class.getName();

  @Inject
  private ESelectionService  _selectionService;

  @Inject
  private MApplication       _mApplication;

  /** - */
  private TreeViewer         _treeViewer;

  /** - */
  private HGRootNode         _currentRootNode;

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
    createTreeViewer(parent);
    if (_currentRootNode != null) {
      setRootNodeInViewer(_currentRootNode);
    }
  }

  @Inject
  public void handleChangedDependencies(@Optional
  @Named(SelectionIdentifier.CURRENT_ROOTNODE)
  final HGRootNode rootNode) {

    //
    if (_currentRootNode == rootNode) {
      return;
    }

    _currentRootNode = rootNode;
    setRootNodeInViewer(rootNode);
  }

  private void setRootNodeInViewer(final HGRootNode rootNode) {
    if (_treeViewer != null && !_treeViewer.getTree().isDisposed()) {
      if (_currentRootNode == null) {
        _treeViewer.setInput(null);
        _treeViewer.setComparator(null);
      } else {
        _treeViewer.setInput(new RootObject(rootNode));
        if (rootNode.hasExtension(INodeComparator.class)) {
          _treeViewer.setComparator(
              new NodeComparator2ViewerComparatorAdapter(_currentRootNode.getExtension(INodeComparator.class)));
        }
      }
    }
  }

  /**
   * <p>
   * </p>
   * 
   * @param parent
   * @param project
   * @return
   */
  private TreeViewer createTreeViewer(Composite parent) {

    _treeViewer = SlizaaTreeViewerFactory.createTreeViewer(parent, SWT.NO_BACKGROUND | SWT.NONE | SWT.MULTI, 2, null);

    // TODO: MOVE SORTER TO Graph module!!!
    _treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

      @Override
      public void selectionChanged(SelectionChangedEvent event) {

        //
        IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        _selectionService.setSelection(selection.size() == 1 ? selection.getFirstElement() : selection.toArray());

        //
        Set<HGNode> rep = new HashSet<>();
        for (Object s : selection.toList()) {
          if (!(s instanceof HGNode) || s instanceof HGRootNode) {
            rep.clear();
            break;
          } else {
            rep.add((HGNode) s);
          }
        }

        //
        ContextHelper.setNodesInContext(_mApplication.getContext(), SelectionIdentifier.CURRENT_MAIN_NODE_SELECTION,
            rep);
      }
    });

    _treeViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {

      @Override
      public void selectionChanged(SelectionChangedEvent event) {

        //
        IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        _selectionService.setPostSelection(selection.size() == 1 ? selection.getFirstElement() : selection.toArray());
      }
    });

    //
    return _treeViewer;
  }
}
