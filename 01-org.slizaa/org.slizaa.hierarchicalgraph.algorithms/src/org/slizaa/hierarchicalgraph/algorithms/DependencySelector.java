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
package org.slizaa.hierarchicalgraph.algorithms;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencySelector {

  public static enum DependencyDirection {
    OUTGOING, INCOMING;
  }

  public static enum SourceOrTarget {
    SOURCE, TARGET;
  }

  /** - */
  private LoadingCache<HGNode, List<HGDependency>> _sourceElementMap;

  /** - */
  private Set<HGNode>                              _unfilteredSourceElementsWithParents;

  /** - */
  private LoadingCache<HGNode, List<HGDependency>> _targetElementMap;

  /** - */
  private Set<HGNode>                              _unfilteredTargetElementsWithParents;

  /** - */
  private Set<HGDependency>                        _unfilteredDependencies;

  /** - */
  private Set<HGDependency>                        _filteredDependencies;

  /** - */
  private Set<HGNode>                              _filteredSourceElements;

  /** - */
  private Set<HGNode>                              _filteredSourceElementsWithParents;

  /** - */
  private Set<HGNode>                              _filteredTargetElements;

  /** - */
  private Set<HGNode>                              _filteredTargetElementsWithParents;

  /**
   * <p>
   * Creates a new instance of type {@link DependencySelector}.
   * </p>
   * 
   * @param dependencies
   */
  public DependencySelector(Collection<HGDependency> dependencies) {

    //
    checkNotNull(dependencies);

    //
    _filteredSourceElements = new HashSet<HGNode>();
    _filteredTargetElements = new HashSet<HGNode>();

    //
    _targetElementMap = CacheBuilder.newBuilder().build(new CacheLoader<HGNode, List<HGDependency>>() {
      public List<HGDependency> load(HGNode key) {
        return new LinkedList<HGDependency>();
      }
    });

    //
    _sourceElementMap = CacheBuilder.newBuilder().build(new CacheLoader<HGNode, List<HGDependency>>() {
      public List<HGDependency> load(HGNode key) {
        return new LinkedList<HGDependency>();
      }
    });

    //
    _unfilteredDependencies = getCoreDependencies(dependencies);
    _filteredDependencies = new HashSet<HGDependency>(_unfilteredDependencies);

    //
    for (HGDependency dependency : _unfilteredDependencies) {
      _sourceElementMap.getUnchecked(dependency.getFrom()).add(dependency);
      _targetElementMap.getUnchecked(dependency.getTo()).add(dependency);
    }

    //
    _unfilteredSourceElementsWithParents = computeArtifactsWithParents(_sourceElementMap.asMap().keySet());
    _unfilteredTargetElementsWithParents = computeArtifactsWithParents(_targetElementMap.asMap().keySet());
  }

  /**
   * <p>
   * Creates a new instance of type {@link DependencySelector}.
   * </p>
   * 
   * @param elements
   * @param direction
   */
  public DependencySelector(DependencyDirection direction, Collection<HGNode> elements) {
    this(getDependencies(elements, direction));
  }

  /**
   * <p>
   * Creates a new instance of type {@link DependencySelector}.
   * </p>
   * 
   * @param direction
   * @param elements
   */
  public DependencySelector(DependencyDirection direction, HGNode... elements) {
    this(getDependencies(new HashSet<HGNode>(asList(checkNotNull(elements))), direction));
  }

  /**
   * <p>
   * </p>
   * 
   * @param elementGroup
   * @param selectedElements
   * @return
   */
  public void setSelectedElements(SourceOrTarget elementGroup, HGNode... selectedElements) {
    setSelectedElements(elementGroup, asList(checkNotNull(selectedElements)));
  }

  /**
   * <p>
   * </p>
   * 
   * @param toArtifacts
   */
  public void setSelectedElements(SourceOrTarget sourceOrTarget, Collection<HGNode> selectedElements) {

    //
    checkNotNull(selectedElements);
    checkNotNull(sourceOrTarget);

    //
    Set<HGNode> filteredArtifacts = new HashSet<HGNode>();

    // clear filtered dependencies
    _filteredDependencies.clear();

    //
    Map<HGNode, List<HGDependency>> analysisModelElementMap = sourceOrTarget == SourceOrTarget.SOURCE
        ? _sourceElementMap.asMap() : _targetElementMap.asMap();

    //
    for (HGNode analysisModelElement : selectedElements) {

      // we have to find all children
      for (HGNode artifact : getSelfAndAllChildren(analysisModelElement)) {

        if (analysisModelElementMap.containsKey(artifact)) {

          List<HGDependency> dependencies = analysisModelElementMap.get(artifact);

          _filteredDependencies.addAll(dependencies);
          for (HGDependency dep : dependencies) {
            // compute the reverse side
            filteredArtifacts.add(sourceOrTarget == SourceOrTarget.SOURCE ? dep.getTo() : dep.getFrom());
          }
        }
      }
    }

    //
    if (sourceOrTarget == SourceOrTarget.SOURCE) {
      _filteredSourceElements.clear();
      _filteredSourceElementsWithParents = null;
      _filteredTargetElements = filteredArtifacts;
      _filteredTargetElementsWithParents = computeArtifactsWithParents(_filteredTargetElements);
    } else {
      _filteredSourceElements = filteredArtifacts;
      _filteredSourceElementsWithParents = computeArtifactsWithParents(_filteredSourceElements);
      _filteredTargetElements.clear();
      _filteredTargetElementsWithParents = null;
    }
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public Set<HGDependency> getUnfilteredDependencies() {
    return _unfilteredDependencies;
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public Set<HGDependency> getFilteredDependencies() {
    return _filteredDependencies;
  }

  public Set<HGNode> getUnfilteredElementsWithParents(SourceOrTarget sourceOrTarget) {

    if (checkNotNull(sourceOrTarget) == SourceOrTarget.SOURCE) {
      if (_unfilteredSourceElementsWithParents == null) {
        _unfilteredSourceElementsWithParents = computeArtifactsWithParents(_sourceElementMap.asMap().keySet());
      }
      return _unfilteredSourceElementsWithParents;
    }
    //
    else {
      if (_unfilteredTargetElementsWithParents == null) {
        _unfilteredTargetElementsWithParents = computeArtifactsWithParents(_targetElementMap.asMap().keySet());
      }
      return _unfilteredTargetElementsWithParents;
    }
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public Set<HGNode> getUnfilteredElements(SourceOrTarget sourceOrTarget) {
    return checkNotNull(sourceOrTarget) == SourceOrTarget.SOURCE ? _sourceElementMap.asMap().keySet()
        : _targetElementMap.asMap().keySet();
  }

  public Set<HGNode> getFilteredElements(SourceOrTarget sourceOrTarget) {
    return checkNotNull(sourceOrTarget) == SourceOrTarget.SOURCE ? _filteredSourceElements : _filteredTargetElements;
  }

  /**
   * <p>
   * </p>
   * 
   * @param sourceOrTarget
   * @return
   */
  public Set<HGNode> getFilteredElementsWithParents(SourceOrTarget sourceOrTarget) {

    if (checkNotNull(sourceOrTarget) == SourceOrTarget.SOURCE) {
      if (_filteredSourceElementsWithParents == null) {
        _filteredSourceElementsWithParents = computeArtifactsWithParents(_filteredSourceElements);
      }
      return _filteredSourceElementsWithParents;
    }
    //
    else {
      if (_filteredTargetElementsWithParents == null) {
        _filteredTargetElementsWithParents = computeArtifactsWithParents(_filteredTargetElements);
      }
      return _filteredTargetElementsWithParents;
    }
  }

  /**
   * <p>
   * </p>
   * 
   * @param visibleArtifacts
   * @return
   */
  private static Set<HGNode> computeArtifactsWithParents(Collection<HGNode> elements) {

    // add all visible artifacts
    Set<HGNode> result = new HashSet<>(checkNotNull(elements));

    // add the parent nodes as well
    for (HGNode element : elements) {
      HGNode parent = element.getParent();
      while (parent != null) {
        result.add(parent);
        parent = parent.getParent();
      }
    }

    //
    return result;
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  private static Set<HGDependency> getCoreDependencies(Collection<HGDependency> dependencies) {

    if (dependencies == null) {
      return Collections.emptySet();
    }

    //
    final Set<HGDependency> result = new HashSet<HGDependency>();

    for (HGDependency dependency : dependencies) {
      if (dependency == null) {
        System.out.println("BUMM");
      }
      for (HGDependency coreDependency : dependency.getCoreDependencies()) {
        result.add(coreDependency);
      }
    }

    return result;
  }

  // TODO MOVE!
  /**
   * <p>
   * </p>
   * 
   * @param node
   * @return
   */
  private static Collection<HGNode> getSelfAndAllChildren(HGNode node) {

    //
    final Set<HGNode> result = new HashSet<HGNode>();

    //
    result.add(node);

    //
    TreeIterator<EObject> treeIterator = EcoreUtil.getAllContents(node, false);
    while (treeIterator.hasNext()) {
      EObject child = treeIterator.next();
      if (child instanceof HGNode) {
        result.add((HGNode)child);
      }
    }

    //
    return result;
  }

  /**
   * <p>
   * </p>
   * 
   * @param elements
   * @param direction
   * @return
   */
  private static Set<HGDependency> getDependencies(Collection<HGNode> elements, DependencyDirection direction) {

    checkNotNull(elements);
    checkNotNull(direction);

    Set<HGDependency> result = new HashSet<>();
    for (HGNode node : elements) {
      result.addAll(direction == DependencyDirection.INCOMING ? node.getIncomingCoreDependencies(true)
          : node.getOutgoingCoreDependencies(true));
    }
    return result;
  }
}
