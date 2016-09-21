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
package org.slizaa.selection;

import java.util.List;

import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

public interface IHierarchicalGraphSelectionService {
  

  HGRootNode getCurrentRoot();
  
  void setCurrentRoot(HGRootNode rootNode);
  
  /**
   * <p>
   * </p>
   *
   * @param selectionListener
   */
  void addHierarchicalGraphSelectionListener(IHierarchicalGraphSelectionListener selectionListener);

  /**
   * <p>
   * </p>
   *
   * @param selectionListener
   */
  void removeHierarchicalGraphSelectionListener(IHierarchicalGraphSelectionListener selectionListener);

  /**
   * <p>
   * </p>
   *
   * @return
   */
  IHierarchicalGraphSelection getCurrentSelection();

  IHierarchicalGraphSelection getCurrentSelection(String selectionProviderId);

  void setCurrentNodeSelection(String selectionProviderId, List<HGNode> selectedNodes);

  void setCurrentNodeSelection(String selectionProviderId, HGNode... selectedNodes);

  void setCurrentDependencySelection(String selectionProviderId, List<? extends AbstractHGDependency> selectedDependencies);

  void setCurrentDependencySelection(String selectionProviderId, AbstractHGDependency... selectedDependencies);
}
