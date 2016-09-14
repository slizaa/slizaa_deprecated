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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
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
public class AggregatedDependencyDetailSelector {

  private static enum SourceOrTarget {
    SOURCE, TARGET;
  }

  /** - */
  private Collection<HGAggregatedDependency>           _aggregatedDependencies;

  /** - */
  private List<HGCoreDependency>                       _unfilteredCoreDependencies;

  /** - */
  private List<HGCoreDependency>                       _filteredCoreDependencies;

  /** - */
  private LoadingCache<HGNode, List<HGCoreDependency>> _sourceNode2CoreDependenciesMap;

  /** - */
  private LoadingCache<HGNode, List<HGCoreDependency>> _targetNode2CoreDependenciesMap;

  /** - */
  private Collection<HGNode>                           _selectedNodes;

  /** - */
  private SourceOrTarget                               _selectedNodesType;

  /** - */
  private List<HGNode>                                 _filteredSourceNodes;

  /** - */
  private List<HGNode>                                 _filteredTargetNodes;

  /** - */
  private Set<HGNode>                                  _filteredSourceNodesWithParents;

  /** - */
  private Set<HGNode>                                  _filteredTargetNodesWithParents;

  /** - */
  private boolean                                      _initialized;

  /**
   * <p>
   * Creates a new instance of type {@link AggregatedDependencyDetailSelector}.
   * </p>
   *
   * @param dependencies
   */
  public AggregatedDependencyDetailSelector(HGAggregatedDependency... dependencies) {
    this(Arrays.asList(checkNotNull(dependencies)));
  }

  /**
   * <p>
   * Creates a new instance of type {@link AggregatedDependencyDetailSelector}.
   * </p>
   * 
   * @param dependencies
   */
  public AggregatedDependencyDetailSelector(Collection<HGAggregatedDependency> dependencies) {

    //
    _aggregatedDependencies = checkNotNull(dependencies);
    _filteredCoreDependencies = new ArrayList<>();
    _filteredSourceNodes = new ArrayList<>();
    _filteredTargetNodes = new ArrayList<>();

    //
    _sourceNode2CoreDependenciesMap = CacheBuilder.newBuilder()
        .build(new CacheLoader<HGNode, List<HGCoreDependency>>() {
          public List<HGCoreDependency> load(HGNode key) {
            return new LinkedList<>();
          }
        });

    //
    _targetNode2CoreDependenciesMap = CacheBuilder.newBuilder()
        .build(new CacheLoader<HGNode, List<HGCoreDependency>>() {
          public List<HGCoreDependency> load(HGNode key) {
            return new LinkedList<>();
          }
        });
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public List<HGCoreDependency> getUnfilteredCoreDependencies() {
    init();
    return _unfilteredCoreDependencies;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getUnfilteredSourceNodes() {
    init();
    return _sourceNode2CoreDependenciesMap.asMap().keySet();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getUnfilteredTargetNodes() {
    init();
    return _targetNode2CoreDependenciesMap.asMap().keySet();
  }

  /**
   * <p>
   * </p>
   *
   * @return the filteredSourceNodes
   */
  public List<HGNode> getFilteredSourceNodes() {
    init();
    return _filteredSourceNodes;
  }

  /**
   * <p>
   * </p>
   *
   * @return the filteredTargetNodes
   */
  public List<HGNode> getFilteredTargetNodes() {
    init();
    return _filteredTargetNodes;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getFilteredSourceNodesWithParents() {
    init();
    return _filteredSourceNodesWithParents;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getFilteredTargetNodesWithParents() {
    init();
    return _filteredTargetNodesWithParents;
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public List<HGCoreDependency> getFilteredCoreDependencies() {
    init();
    return _filteredCoreDependencies;
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  public void setSelectedSourceElements(Collection<HGNode> selectedNodes) {
    setSelectedElements(SourceOrTarget.SOURCE, selectedNodes);
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  public void setSelectedSourceElements(HGNode... selectedNodes) {
    setSelectedElements(SourceOrTarget.SOURCE, Arrays.asList(selectedNodes));
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  public void setSelectedTargetElements(Collection<HGNode> selectedNodes) {
    setSelectedElements(SourceOrTarget.TARGET, selectedNodes);
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  public void setSelectedTargetElements(HGNode... selectedNodes) {
    setSelectedElements(SourceOrTarget.TARGET, Arrays.asList(selectedNodes));
  }

  /**
   * <p>
   * </p>
   *
   * @param sourceOrTarget
   * @param selectedNode
   */
  private void setSelectedElements(SourceOrTarget sourceOrTarget, Collection<HGNode> selectedNode) {
    _selectedNodes = checkNotNull(selectedNode);
    _selectedNodesType = checkNotNull(sourceOrTarget);
    _initialized = false;
    init();
  }

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
    result.add(node);

    EcoreUtil.getAllContents(node, false).forEachRemaining((child) -> {
      if (child instanceof HGNode) {
        result.add((HGNode) child);
      }
    });

    //
    return result;
  }

  /**
   * <p>
   * </p>
   */
  private void init() {

    //
    if (!_initialized) {

      //
      _unfilteredCoreDependencies = _aggregatedDependencies.stream().flatMap(dep -> dep.getCoreDependencies().stream())
          .collect(Collectors.toList());

      //
      _sourceNode2CoreDependenciesMap.invalidateAll();
      _targetNode2CoreDependenciesMap.invalidateAll();

      //
      _unfilteredCoreDependencies.forEach(dep -> {
        _sourceNode2CoreDependenciesMap.getUnchecked(dep.getFrom()).add(dep);
        _targetNode2CoreDependenciesMap.getUnchecked(dep.getTo()).add(dep);
      });

      //
      recomputeFilter();

      //
      _initialized = true;
    }
  }

  /**
   * <p>
   * </p>
   */
  private void recomputeFilter() {

    // clear filtered dependencies
    _filteredCoreDependencies.clear();

    //
    Map<HGNode, List<HGCoreDependency>> node2DependenciesMap = _selectedNodesType == SourceOrTarget.SOURCE
        ? _sourceNode2CoreDependenciesMap.asMap() : _targetNode2CoreDependenciesMap.asMap();

    //
    List<HGNode> filteredNodes = new ArrayList<HGNode>();

    //
    if (_selectedNodes != null) {
      _selectedNodes.forEach((node) -> {
        getSelfAndAllChildren(node).forEach((n) -> {
          if (node2DependenciesMap.containsKey(n)) {

            //
            List<HGCoreDependency> dependencies = node2DependenciesMap.get(n);

            //
            _filteredCoreDependencies.addAll(dependencies);

            // compute the reverse side
            dependencies.forEach((dep) -> {
              filteredNodes.add(_selectedNodesType == SourceOrTarget.SOURCE ? dep.getTo() : dep.getFrom());
            });
          }
        });
      });
    }

    //
    if (_selectedNodesType == SourceOrTarget.SOURCE) {
      _filteredSourceNodes.clear();
      _filteredTargetNodes = filteredNodes;
    } else {
      _filteredSourceNodes = filteredNodes;
      _filteredTargetNodes.clear();
    }
    _filteredSourceNodesWithParents = computeNodesWithParents(_filteredSourceNodes);
    _filteredTargetNodesWithParents = computeNodesWithParents(_filteredTargetNodes);
  }

  /**
   * <p>
   * </p>
   *
   * @param elements
   * @return
   */
  private static Set<HGNode> computeNodesWithParents(Collection<HGNode> nodes) {
    Set<HGNode> result = new HashSet<>(checkNotNull(nodes));
    nodes.forEach((n) -> result.addAll(n.getPredecessors()));
    return result;
  }
}
