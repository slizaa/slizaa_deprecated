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
package org.slizaa.ui.tree;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.function.Supplier;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class VisibleNodesFilter extends ViewerFilter {

  /** - */
  private Supplier<Collection<HGNode>> _visibleNodesSupplier;

  private boolean                      _dontFilterIfNull = false;

  /**
   * <p>
   * Creates a new instance of type {@link VisibleNodesFilter} .
   * </p>
   * 
   * @param visibleNodesSupplier
   */
  public VisibleNodesFilter(Supplier<Collection<HGNode>> visibleNodesSupplier) {
    _visibleNodesSupplier = checkNotNull(visibleNodesSupplier);
  }

  public VisibleNodesFilter(Supplier<Collection<HGNode>> visibleNodesSupplier, boolean dontFilterIfNull) {
    _visibleNodesSupplier = checkNotNull(visibleNodesSupplier);
    _dontFilterIfNull = dontFilterIfNull;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean select(Viewer viewer, Object parentElement, Object element) {

    //
    if (element instanceof HGRootNode) {
      return true;
    }

    //
    Collection<HGNode> hgNodes = _visibleNodesSupplier.get();

    if (_dontFilterIfNull && (hgNodes == null || hgNodes.isEmpty())) {
      return true;
    } else if (hgNodes != null && hgNodes.contains(element)) {
      return true;
    } else {
      return false;
    }
  }
}
