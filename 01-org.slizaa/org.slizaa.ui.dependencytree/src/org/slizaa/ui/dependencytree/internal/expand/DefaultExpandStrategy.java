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

import org.eclipse.emf.common.util.EList;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.SourceOrTarget;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DefaultExpandStrategy extends AbstractExpandStrategy implements IExpandStrategy {

  /** - */
  private int            _maxExpanded       = 30;

  /** - */
  private int            _currentlyExpanded = 0;

  /** - */
  private SourceOrTarget _sourceOrTarget;

  /**
   * <p>
   * Creates a new instance of type {@link DefaultExpandStrategy}.
   * </p>
   *
   * @param sourceOrTarget
   */
  public DefaultExpandStrategy(SourceOrTarget sourceOrTarget) {
    _sourceOrTarget = checkNotNull(sourceOrTarget);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected List<Object> computeExpandedArtifacts(HGNode rootElement) {
    checkNotNull(rootElement);

    _currentlyExpanded = 0;

    //
    List<Object> result = new LinkedList<>();

    //
    List<HGNode> visibleChildren = computeVisibleChildren(rootElement);
    _currentlyExpanded = visibleChildren.size();
    result.add(rootElement);

    //
    _computeExpandedElements(visibleChildren, result);

    //
    return result;
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

      if (hasUnresolvedAggregatedCoreDependencies(child, _sourceOrTarget)) {
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

  private boolean hasUnresolvedAggregatedCoreDependencies(HGNode child, SourceOrTarget sourceOrTarget) {

    //
    EList<HGCoreDependency> coreDependencies = checkNotNull(sourceOrTarget).equals(SourceOrTarget.SOURCE)
        ? checkNotNull(child).getOutgoingCoreDependencies(false) : child.getOutgoingCoreDependencies(false);

    //
    for (HGCoreDependency coreDependency : coreDependencies) {
      if (coreDependency instanceof HGAggregatedCoreDependency
          && !((HGAggregatedCoreDependency) coreDependency).isResolved()) {
        return true;
      }
    }
    return false;
  }
}
