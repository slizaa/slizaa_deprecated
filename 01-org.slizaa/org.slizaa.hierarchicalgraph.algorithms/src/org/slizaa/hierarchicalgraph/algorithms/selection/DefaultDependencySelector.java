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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
  private Collection<HGCoreDependency>                       _unfilteredCoreDependencies;

  /** - */
  private Collection<HGNode>                                 _selectedNodes;

  /** - */
  private Set<HGNode>                                        _unfilteredSourceNodes;

  /** - */
  private Set<HGNode>                                        _unfilteredTargetNodes;

  // /** - */
  // private Set<HGNode> _unfilteredSourceNodesWithParents;
  //
  // /** - */
  // private Set<HGNode> _unfilteredTargetNodesWithParents;

  /** - */
  private Set<HGCoreDependency>                              _filteredCoreDependencies;

  /** - */
  private Set<HGNode>                                        _filteredSourceNodes;

  /** - */
  private Set<HGNode>                                        _filteredTargetNodes;

  // /** - */
  // private Set<HGNode> _filteredSourceNodesWithParents;
  //
  // /** - */
  // private Set<HGNode> _filteredTargetNodesWithParents;

  /** - */
  private Set<HGNode>                                        _filteredSourceNodesWithParentsAndChildren;

  /** - */
  private Set<HGNode>                                        _filteredTargetNodesWithParentsAndChildren;

  /** - */
  private Set<HGNode>                                        _unfilteredSourceNodesWithParentsAndChildren;

  /** - */
  private Set<HGNode>                                        _unfilteredTargetNodesWithParentsAndChildren;

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
  public DefaultDependencySelector() {

    //
    _unfilteredCoreDependencies = Collections.emptySet();
    _filteredCoreDependencies = new HashSet<>();
    _unfilteredSourceNodes = new HashSet<>();
    _unfilteredTargetNodes = new HashSet<>();
    _filteredSourceNodes = new HashSet<>();
    _filteredTargetNodes = new HashSet<>();
    // _filteredSourceNodesWithParents = new HashSet<HGNode>();
    // _filteredTargetNodesWithParents = new HashSet<HGNode>();
    // _unfilteredSourceNodesWithParents = new HashSet<HGNode>();
    // _unfilteredTargetNodesWithParents = new HashSet<HGNode>();
    _filteredSourceNodesWithParentsAndChildren = new HashSet<HGNode>();
    _filteredTargetNodesWithParentsAndChildren = new HashSet<HGNode>();
    _unfilteredSourceNodesWithParentsAndChildren = new HashSet<HGNode>();
    _unfilteredTargetNodesWithParentsAndChildren = new HashSet<HGNode>();
    _selectedNodes = new HashSet<HGNode>();

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
  public void setDependencies(Collection<HGCoreDependency> dependencies) {

    _unfilteredCoreDependencies = checkNotNull(dependencies);

    //
    _filteredCoreDependencies.clear();
    _filteredSourceNodes.clear();
    _filteredSourceNodesWithParentsAndChildren.clear();
    _filteredTargetNodes.clear();
    _filteredTargetNodesWithParentsAndChildren.clear();
    _selectedNodes.clear();
    _selectedNodesType = null;
    _sourceNode2CoreDependenciesMap.invalidateAll();
    _targetNode2CoreDependenciesMap.invalidateAll();
    _unfilteredSourceNodes.clear();
    _unfilteredSourceNodesWithParentsAndChildren.clear();
    _unfilteredTargetNodes.clear();
    _unfilteredTargetNodesWithParentsAndChildren.clear();

    //
    _initialized = false;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Collection<HGCoreDependency> getUnfilteredCoreDependencies() {
    init();
    return Collections.unmodifiableCollection(_unfilteredCoreDependencies);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGCoreDependency> getFilteredCoreDependencies() {
    init();
    return _filteredCoreDependencies;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGNode> getUnfilteredNodes(NodeType type) {
    init();
    return checkNotNull(type).equals(NodeType.SOURCE) ? _unfilteredSourceNodes : _unfilteredTargetNodes;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGNode> getFilteredNodes(NodeType type) {
    init();
    return checkNotNull(type).equals(NodeType.SOURCE) ? _filteredSourceNodes : _filteredTargetNodes;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGNode> getRootLeafPathNodes(NodeType type, boolean filtered) {
    init();

    switch (checkNotNull(type)) {

    case SOURCE: {

      if (filtered) {
        return _filteredSourceNodesWithParentsAndChildren;
      } else {
        return _unfilteredSourceNodesWithParentsAndChildren;
      }
    }
    case TARGET: {
      if (filtered) {
        return _filteredTargetNodesWithParentsAndChildren;
      } else {
        return _unfilteredTargetNodesWithParentsAndChildren;
      }
    }
    }
    // should never happen
    throw new RuntimeException();
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
  public void setSelectedNodes(NodeType type, Collection<HGNode> selectedNodes) {
    _selectedNodes = checkNotNull(selectedNodes);
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

      Set<HGNode> unfilteredSourceNodes = new HashSet<HGNode>();
      Set<HGNode> unfilteredTargetNodes = new HashSet<HGNode>();

      //
      _unfilteredCoreDependencies.forEach(dep -> {
        _sourceNode2CoreDependenciesMap.getUnchecked(dep.getFrom()).add(dep);
        _targetNode2CoreDependenciesMap.getUnchecked(dep.getTo()).add(dep);
        unfilteredSourceNodes.add(dep.getFrom());
        unfilteredTargetNodes.add(dep.getTo());
      });

      //
      _unfilteredSourceNodes = unfilteredSourceNodes;
      _unfilteredTargetNodes = unfilteredTargetNodes;
      // _unfilteredSourceNodesWithParents = computeNodesWithParents(unfilteredSourceNodes, false);
      // _unfilteredTargetNodesWithParents = computeNodesWithParents(unfilteredTargetNodes, false);
      _unfilteredSourceNodesWithParentsAndChildren = computeNodesWithParents(unfilteredSourceNodes, true);
      _unfilteredTargetNodesWithParentsAndChildren = computeNodesWithParents(unfilteredTargetNodes, true);

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
    Set<HGCoreDependency> filteredCoreDependencies = new HashSet<HGCoreDependency>();
    Set<HGNode> filteredNodes = new HashSet<HGNode>();

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
    _filteredCoreDependencies = filteredCoreDependencies;

    //
    if (_selectedNodesType == NodeType.SOURCE) {
      _filteredSourceNodes.clear();
      _filteredTargetNodes = filteredNodes;
    } else {
      _filteredSourceNodes = filteredNodes;
      _filteredTargetNodes.clear();
    }
    // _filteredSourceNodesWithParents = computeNodesWithParents(_filteredSourceNodes, false);
    // _filteredTargetNodesWithParents = computeNodesWithParents(_filteredTargetNodes, false);
    _filteredSourceNodesWithParentsAndChildren = computeNodesWithParents(_filteredSourceNodes, true);
    _filteredTargetNodesWithParentsAndChildren = computeNodesWithParents(_filteredTargetNodes, true);

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
  private static Set<HGNode> computeNodesWithParents(Collection<HGNode> nodes, boolean includeChildren) {
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
    return result;
  }
}
