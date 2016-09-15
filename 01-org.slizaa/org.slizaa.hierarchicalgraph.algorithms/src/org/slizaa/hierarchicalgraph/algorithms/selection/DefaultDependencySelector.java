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
package org.slizaa.hierarchicalgraph.algorithms.selection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
public class DefaultDependencySelector implements IDependencySelector {

  /** - */
  private final EList<HGCoreDependency>                      _unfilteredCoreDependencies;

  /** - */
  private final EList<HGNode>                                _unfilteredSourceNodes;

  /** - */
  private final EList<HGNode>                                _unfilteredTargetNodes;

  /** - */
  private final EList<HGCoreDependency>                      _filteredCoreDependencies;

  /** - */
  private final EList<HGNode>                                _filteredSourceNodes;

  /** - */
  private final EList<HGNode>                                _filteredTargetNodes;

  /** - */
  private final EList<HGNode>                                _filteredSourceNodesWithParents;

  /** - */
  private final EList<HGNode>                                _filteredTargetNodesWithParents;

  /** - */
  private final EList<HGNode>                                _selectedNodes;

  /** - */
  private final LoadingCache<HGNode, List<HGCoreDependency>> _sourceNode2CoreDependenciesMap;

  /** - */
  private final LoadingCache<HGNode, List<HGCoreDependency>> _targetNode2CoreDependenciesMap;

  /** - */
  private NodeType                                           _selectedNodesType;

  /** - */
  private boolean                                            _initialized;

  /**
   * <p>
   * Creates a new instance of type {@link DefaultDependencySelector}.
   * </p>
   * 
   * @param dependencies
   */
  public DefaultDependencySelector(EList<HGCoreDependency> dependencies) {

    //
    _unfilteredCoreDependencies = checkNotNull(dependencies);

    //
    _filteredCoreDependencies = new BasicEList<>();
    _unfilteredSourceNodes = new BasicEList<>();
    _unfilteredTargetNodes = new BasicEList<>();
    _filteredSourceNodes = new BasicEList<>();
    _filteredTargetNodes = new BasicEList<>();
    _filteredSourceNodesWithParents = new BasicEList<HGNode>();
    _filteredTargetNodesWithParents = new BasicEList<HGNode>();
    _selectedNodes = new BasicEList<HGNode>();

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
   * {@inheritDoc}
   */
  @Override
  public EList<HGCoreDependency> getUnfilteredCoreDependencies() {
    init();
    return ECollections.unmodifiableEList(_unfilteredCoreDependencies);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EList<HGCoreDependency> getFilteredCoreDependencies() {
    init();
    return _filteredCoreDependencies;
  }

  @Override
  public EList<HGNode> getUnfilteredNodes(NodeType type) {
    init();
    return checkNotNull(type).equals(NodeType.SOURCE) ? _unfilteredSourceNodes : _unfilteredTargetNodes;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EList<HGNode> getFilteredNodes(NodeType type) {
    init();
    return checkNotNull(type).equals(NodeType.SOURCE) ? _filteredSourceNodes : _filteredTargetNodes;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EList<HGNode> getFilteredNodesWithParents(NodeType type) {
    init();
    return checkNotNull(type).equals(NodeType.SOURCE) ? _filteredSourceNodesWithParents
        : _filteredTargetNodesWithParents;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setSelectedNodes(NodeType type, HGNode... selectedNodes) {
    setSelectedNodes(type, Arrays.asList(selectedNodes));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setSelectedNodes(NodeType type, List<HGNode> selectedNodes) {
    ECollections.setEList(_selectedNodes, checkNotNull(selectedNodes));
    _selectedNodesType = checkNotNull(type);
    _initialized = false;
    init();
  }

  /**
   * <p>
   * </p>
   */
  private void init() {

    //
    if (!_initialized) {

      //
      _sourceNode2CoreDependenciesMap.invalidateAll();
      _targetNode2CoreDependenciesMap.invalidateAll();

      List<HGNode> unfilteredSourceNodes = new LinkedList<HGNode>();
      List<HGNode> unfilteredTargetNodes = new LinkedList<HGNode>();

      //
      _unfilteredCoreDependencies.forEach(dep -> {
        _sourceNode2CoreDependenciesMap.getUnchecked(dep.getFrom()).add(dep);
        _targetNode2CoreDependenciesMap.getUnchecked(dep.getTo()).add(dep);
        unfilteredSourceNodes.add(dep.getFrom());
        unfilteredTargetNodes.add(dep.getTo());
      });

      //
      ECollections.setEList(_unfilteredSourceNodes, unfilteredSourceNodes);
      ECollections.setEList(_unfilteredTargetNodes, unfilteredTargetNodes);

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
    List<HGCoreDependency> filteredCoreDependencies = new LinkedList<HGCoreDependency>();
    List<HGNode> filteredNodes = new LinkedList<HGNode>();

    //
    Map<HGNode, List<HGCoreDependency>> node2DependenciesMap = _selectedNodesType == NodeType.SOURCE
        ? _sourceNode2CoreDependenciesMap.asMap() : _targetNode2CoreDependenciesMap.asMap();

    //
    if (_selectedNodes != null) {
      _selectedNodes.forEach((node) -> {
        getSelfAndAllChildren(node).forEach((n) -> {
          if (node2DependenciesMap.containsKey(n)) {

            List<HGCoreDependency> dependencies = node2DependenciesMap.get(n);

            filteredCoreDependencies.addAll(dependencies);

            // compute the reverse side
            dependencies.forEach((dep) -> {
              filteredNodes.add(_selectedNodesType == NodeType.SOURCE ? dep.getTo() : dep.getFrom());
            });
          }
        });
      });
    }

    //
    ECollections.setEList(_filteredCoreDependencies, filteredCoreDependencies);

    //
    if (_selectedNodesType == NodeType.SOURCE) {
      _filteredSourceNodes.clear();
      ECollections.setEList(_filteredTargetNodes, filteredNodes);
    } else {
      ECollections.setEList(_filteredSourceNodes, filteredNodes);
      _filteredTargetNodes.clear();
    }
    ECollections.setEList(_filteredSourceNodesWithParents, computeNodesWithParents(_filteredSourceNodes, false));
    ECollections.setEList(_filteredTargetNodesWithParents, computeNodesWithParents(_filteredTargetNodes, false));
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @return
   */
  private static Collection<HGNode> getSelfAndAllChildren(HGNode node) {
    final Set<HGNode> result = new HashSet<HGNode>();
    result.add(node);
    EcoreUtil.getAllContents(node, false).forEachRemaining((child) -> {
      if (child instanceof HGNode) {
        result.add((HGNode) child);
      }
    });
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param elements
   * @return
   */
  private static List<HGNode> computeNodesWithParents(Collection<HGNode> nodes, boolean includeChildren) {
    // TODO rework
    Set<HGNode> result = new HashSet<>(checkNotNull(nodes));
    nodes.forEach((n) -> {
      result.addAll(n.getPredecessors());
      if (includeChildren) {
        EcoreUtil.getAllContents(n, false).forEachRemaining((child) -> {
          if (child instanceof HGNode) {
            result.add((HGNode) child);
          }
        });
      }
    });
    return new ArrayList<HGNode>(result);
  }
}
