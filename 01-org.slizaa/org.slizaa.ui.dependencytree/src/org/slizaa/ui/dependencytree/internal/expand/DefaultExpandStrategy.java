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

import java.util.LinkedList;
import java.util.List;

import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DefaultExpandStrategy extends AbstractExpandStrategy implements IExpandStrategy {

  /** - */
  private int _maxExpanded       = 30;

  /** - */
  private int _currentlyExpanded = 0;

  /**
   * {@inheritDoc}
   */
  @Override
  protected List<Object> computeExpandedArtifacts(HGNode rootElement) {

    _currentlyExpanded = 0;

    //
    List<Object> result = new LinkedList<>();

    //
    _computeExpandedElements(rootElement, result);

    //
    return result;
  }

  private void _computeExpandedElements(HGNode elementToExpand, List<Object> result) {

    checkNotNull(elementToExpand);
    checkNotNull(result);

    //
    List<HGNode> visibleChildren = computeVisibleChildren(elementToExpand);
    _currentlyExpanded = visibleChildren.size();

    //
    result.add(elementToExpand);
    _computeExpandedElements(visibleChildren, result);
  }

  /**
   * <p>
   * </p>
   * 
   * @param result
   * @param element
   * @param visibleElements
   * @param maxExpanded
   */
  private void _computeExpandedElements(List<HGNode> elementsToExpand, List<Object> result) {

    //
    checkNotNull(elementsToExpand);
    checkNotNull(result);

    //
    if (elementsToExpand.size() == 0) {
      return;
    }

    //
    List<HGNode> newChildren = new LinkedList<>();

    //
    for (HGNode child : elementsToExpand) {

      // don't expand resources
      if (!child.getNodeSource().isAutoExpand()) {
        continue;
      }

      //
      List<HGNode> visibleChildren = computeVisibleChildren(child);

      //
      if (_currentlyExpanded + visibleChildren.size() < _maxExpanded) {
        result.add(child);
        newChildren.addAll(visibleChildren);
        _currentlyExpanded = _currentlyExpanded + visibleChildren.size();
      }
      //
      else {
        return;
      }
    }

    _computeExpandedElements(newChildren, result);
  }

  /**
   * <p>
   * </p>
   * 
   * @param elementToExpand
   * @return
   */
  private List<HGNode> computeVisibleChildren(HGNode elementToExpand) {

    //
    List<HGNode> result = new LinkedList<>();

    //
    for (HGNode element : elementToExpand.getChildren()) {
      if (getVisibleElements().contains(element)) {
        result.add(element);
      }
    }

    //
    return result;
  }
}
