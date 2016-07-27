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
package org.slizaa.ui.dependencytree.internal.expand;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emfforms.spi.swt.treemasterdetail.util.RootObject;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.slizaa.hierarchicalgraph.HGNode;

public abstract class AbstractExpandStrategy implements IExpandStrategy {

  /** - */
  private final Set<Object>   _manuallyCollapsedElements = new HashSet<Object>();

  /** - */
  private final Set<Object>   _manuallyExpandedElements  = new HashSet<Object>();

  /** - */
  private TreeViewer          _treeViewer;

  /** - */
  private Collection<HGNode>  _visibleElements;

  /** - */
  private ITreeViewerListener _treeViewerListener;

  /**
   * {@inheritDoc}
   */
  @Override
  public void init(TreeViewer treeViewer) {

    //
    _treeViewer = checkNotNull(treeViewer);

    //
    _treeViewerListener = new ITreeViewerListener() {

      @Override
      public void treeExpanded(TreeExpansionEvent event) {
        _manuallyExpandedElements.add((HGNode) event.getElement());
        _manuallyCollapsedElements.remove(event.getElement());
      }

      @Override
      public void treeCollapsed(TreeExpansionEvent event) {
        _manuallyExpandedElements.remove(event.getElement());
        _manuallyCollapsedElements.add((HGNode) event.getElement());
      }
    };

    //
    treeViewer.addTreeListener(_treeViewerListener);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void dispose(TreeViewer treeViewer) {

    //
    treeViewer.remove(_treeViewerListener);
  }

  @Override
  public void expandTreeViewer(Collection<HGNode> visibleElements) {

    //
    _visibleElements = visibleElements;

    //
    expandToTreeViewer(false);
  }

  public Collection<HGNode> getVisibleElements() {
    return _visibleElements;
  }

  private void expandToTreeViewer(boolean deleteManuallyExpandedElements) {

    //
    if (deleteManuallyExpandedElements) {
      _manuallyExpandedElements.clear();
      _manuallyCollapsedElements.clear();
    }

    //
//    if (_treeViewer.getInput() instanceof VirtualRootNode) {
//      VirtualRootNode node = (VirtualRootNode) _treeViewer.getInput();
//      if (!_manuallyExpandedElements.contains(node.getRootElement())) {
//        _manuallyExpandedElements.add(node.getRootElement());
//      }
//    }

    //
    Object input = _treeViewer.getInput();
    if (input == null) {
      return;
    }

    HGNode rootElement = null;
    if (input instanceof RootObject) {
      rootElement = (HGNode) ((RootObject) input).getRoot();
    } else
    	if (input instanceof HGNode) {
    		rootElement = (HGNode) input;
    } 
		// else {
		// rootElement = ((IJQAssistantRepository)
		// input).getHierarchicalGraphs().get(0);
		// }

    List<Object> expandedElements = computeExpandedArtifacts(rootElement);

    //
    expandedElements.addAll(_manuallyExpandedElements);
    expandedElements.removeAll(_manuallyCollapsedElements);

    //
    _treeViewer.setExpandedElements(expandedElements.toArray());
  }

  /**
   * <p>
   * </p>
   * 
   * @param rootElement
   * @param visibleArtifact
   * @return
   */
  protected abstract List<Object> computeExpandedArtifacts(HGNode rootElement);
}
