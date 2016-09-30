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
package org.slizaa.ui.tree;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * Filter for IArtifact trees. This filter gets a white list of IArtifacts given in the constructor. Only these
 * artifacts and their parent nodes are displayed in the tree, everything else is hidden.
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class VisibleNodesFilter_Deprecated extends ViewerFilter {

  /**
   * <p>
   * </p>
   * 
   * @param treeViewer
   * @param visibleArtifacts
   * @return
   */
  public static VisibleNodesFilter_Deprecated setVisibleArtifacts(TreeViewer treeViewer, Set<HGNode> visibleNodes) {
    Assert.isNotNull(treeViewer);

    //
    VisibleNodesFilter_Deprecated result = null;

    // set redraw to false
    treeViewer.getTree().setRedraw(false);

    if (visibleNodes == null) {
      treeViewer.resetFilters();
    } else {
      // set the filter
      result = new VisibleNodesFilter_Deprecated(visibleNodes);
      treeViewer.setFilters(new ViewerFilter[] { result });
    }

    // redraw again
    treeViewer.getTree().setRedraw(true);

    //
    return result;
  }

  /** - */
  private Collection<HGNode> _nodes;

  /**
   * <p>
   * Creates a new instance of type {@link VisibleNodesFilter_Deprecated} .
   * </p>
   * 
   * @param visibleArtifacts
   */
  public VisibleNodesFilter_Deprecated(Collection<HGNode> visibleArtifacts) {
    _nodes = checkNotNull(visibleArtifacts);
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public Collection<HGNode> getArtifacts() {
    return Collections.unmodifiableCollection(_nodes);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean select(Viewer viewer, Object parentElement, Object element) {

    //
    if (element instanceof HGRootNode) {
      return true;
    } else if (_nodes.contains(element)) {
      return true;
    } else {
      return false;
    }
  }
}
