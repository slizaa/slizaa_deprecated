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
package org.slizaa.ui.dependencytree.internal;

import static com.google.common.base.Preconditions.checkNotNull;

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
public class VisibleAnalysisModelElementsFilter extends ViewerFilter {

  /**
   * <p>
   * </p>
   * 
   * @param treeViewer
   * @param visibleArtifacts
   * @return
   */
  public static VisibleAnalysisModelElementsFilter setVisibleArtifacts(TreeViewer treeViewer,
      Set<HGNode> visibleArtifacts) {
    Assert.isNotNull(treeViewer);

    //
    VisibleAnalysisModelElementsFilter result = null;

    // set redraw to false
    treeViewer.getTree().setRedraw(false);

    if (visibleArtifacts == null) {
      treeViewer.resetFilters();
    } else {
      // set the filter
      result = new VisibleAnalysisModelElementsFilter(visibleArtifacts);
      treeViewer.setFilters(new ViewerFilter[] { result });
    }

    // redraw again
    treeViewer.getTree().setRedraw(true);

    //
    return result;
  }

  /** - */
  private Set<HGNode> _artifacts;

  /**
   * <p>
   * Creates a new instance of type {@link VisibleAnalysisModelElementsFilter} .
   * </p>
   * 
   * @param visibleArtifacts
   */
  public VisibleAnalysisModelElementsFilter(Set<HGNode> visibleArtifacts) {
    _artifacts = checkNotNull(visibleArtifacts);
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public Set<HGNode> getArtifacts() {
    return Collections.unmodifiableSet(_artifacts);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean select(Viewer viewer, Object parentElement, Object element) {

    //
    if (element instanceof HGRootNode) {
      return true;
    } else if (_artifacts.contains(element)) {
      return true;
    } else {
      return false;
    }
  }
}
