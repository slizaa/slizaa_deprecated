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
package org.slizaa.hierarchicalgraph.selection.selector;

import static com.google.common.base.Preconditions.checkNotNull;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.HierarchicalgraphUtilityMethods;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * <p>
 * TODO: EMF!!!
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DefaultDependencySelector implements IDependencySelector {

  /** - */
  private Collection<HGCoreDependency>                       _coreDependencies;

  /** - */
  private Collection<HGNode>                                 _selectedNodes;

  /** - */
  private Set<HGNode>                                        _unfilteredSourceNodes;

  /** - */
  private Set<HGNode>                                        _unfilteredTargetNodes;

  /** - */
  private Set<HGNode>                                        _unfilteredSourceNodesWithParents;

  /** - */
  private Set<HGNode>                                        _unfilteredTargetNodesWithParents;

  /** - */
  private Set<HGCoreDependency>                              _filteredCoreDependencies;

  /** - */
  private Set<HGNode>                                        _filteredSourceNodes;

  /** - */
  private Set<HGNode>                                        _filteredTargetNodes;

  /** - */
  private Set<HGNode>                                        _filteredSourceNodesWithParents;

  /** - */
  private Set<HGNode>                                        _filteredTargetNodesWithParents;

  /** - */
  private final LoadingCache<HGNode, List<HGCoreDependency>> _sourceNode2CoreDependenciesMap;

  /** - */
  private final LoadingCache<HGNode, List<HGCoreDependency>> _targetNode2CoreDependenciesMap;

  /** - */
  private NodeType                                           _selectedNodesType;

  /** - */
  private boolean                                            _initialized;

  /** - */
  private PropertyChangeSupport                              _propertyChangeSupport = new PropertyChangeSupport(this);

  /** - */
  private Adapter                                            _adapter;

  /**
   * <p>
   * Creates a new instance of type {@link DefaultDependencySelector}.
   * </p>
   * 
   * @param dependencies
   */
  public DefaultDependencySelector() {

    //
    _coreDependencies = Collections.emptySet();
    _filteredCoreDependencies = new HashSet<>();
    _unfilteredSourceNodes = new HashSet<>();
    _unfilteredTargetNodes = new HashSet<>();
    _filteredSourceNodes = new HashSet<>();
    _filteredTargetNodes = new HashSet<>();
    _filteredSourceNodesWithParents = new HashSet<HGNode>();
    _filteredTargetNodesWithParents = new HashSet<HGNode>();
    _unfilteredSourceNodesWithParents = new HashSet<HGNode>();
    _unfilteredTargetNodesWithParents = new HashSet<HGNode>();
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

    //
    _adapter = new AdapterImpl() {
      @Override
      public void notifyChanged(Notification msg) {
        if (msg.getFeatureID(
            HGAggregatedCoreDependency.class) == HierarchicalgraphPackage.HG_AGGREGATED_CORE_DEPENDENCY__RESOLVED) {
          handleNotify();
        }
      }
    };
  }

  public void addPropertyChangeListener(PropertyChangeListener listener) {
    this._propertyChangeSupport.addPropertyChangeListener(listener);
  }

  public void removePropertyChangeListener(PropertyChangeListener listener) {
    this._propertyChangeSupport.removePropertyChangeListener(listener);
  }

  public void handleNotify() {
    _filteredCoreDependencies.clear();
    _filteredSourceNodes.clear();
    _filteredTargetNodes.clear();
    _sourceNode2CoreDependenciesMap.invalidateAll();
    _targetNode2CoreDependenciesMap.invalidateAll();
    _unfilteredSourceNodes.clear();
    _unfilteredTargetNodes.clear();
    _initialized = false;
    init();

    //
    _propertyChangeSupport.firePropertyChange("coreDependencies", "TODO-old", "TODO-new");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setDependencies(Collection<HGCoreDependency> dependencies) {

    //
    if (_coreDependencies != null) {
      HierarchicalgraphUtilityMethods.removeAdapter(_coreDependencies, _adapter);
    }

    //
    _coreDependencies = checkNotNull(dependencies);
    HierarchicalgraphUtilityMethods.addAdapter(_coreDependencies, _adapter);

    //
    _filteredCoreDependencies.clear();
    _filteredSourceNodes.clear();
    _filteredTargetNodes.clear();
    _selectedNodes.clear();
    _selectedNodesType = null;
    _sourceNode2CoreDependenciesMap.invalidateAll();
    _targetNode2CoreDependenciesMap.invalidateAll();
    _unfilteredSourceNodes.clear();
    _unfilteredTargetNodes.clear();

    //
    _initialized = false;
  }

  @Override
  public List<HGCoreDependency> getDependenciesWithSourceNode(HGNode sourceNode) {
    return _sourceNode2CoreDependenciesMap.getIfPresent(checkNotNull(sourceNode));
  }

  @Override
  public List<HGCoreDependency> getDependenciesWithTargetNode(HGNode targetNode) {
    return _targetNode2CoreDependenciesMap.getIfPresent(checkNotNull(targetNode));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Collection<HGCoreDependency> getUnfilteredCoreDependencies() {
    init();
    return Collections.unmodifiableCollection(getResolvedCoreDependenciesOrAggregatedCoreDependencyOtherwise());
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

  @Override
  public Set<HGNode> getNodesWithParents(NodeType type, boolean filtered) {
    init();

    switch (checkNotNull(type)) {

    case SOURCE: {

      if (filtered) {
        return _filteredSourceNodesWithParents;
      } else {
        return _unfilteredSourceNodesWithParents;
      }
    }
    case TARGET: {
      if (filtered) {
        return _filteredTargetNodesWithParents;
      } else {
        return _unfilteredTargetNodesWithParents;
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
      getResolvedCoreDependenciesOrAggregatedCoreDependencyOtherwise().forEach(dep -> {
        _sourceNode2CoreDependenciesMap.getUnchecked(dep.getFrom()).add(dep);
        _targetNode2CoreDependenciesMap.getUnchecked(dep.getTo()).add(dep);
        unfilteredSourceNodes.add(dep.getFrom());
        unfilteredTargetNodes.add(dep.getTo());
      });

      //
      _unfilteredSourceNodes = unfilteredSourceNodes;
      _unfilteredTargetNodes = unfilteredTargetNodes;
      _unfilteredSourceNodesWithParents = computeNodesWithParents(unfilteredSourceNodes, false);
      _unfilteredTargetNodesWithParents = computeNodesWithParents(unfilteredTargetNodes, false);

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
    _filteredSourceNodesWithParents = computeNodesWithParents(_filteredSourceNodes, false);
    _filteredTargetNodesWithParents = computeNodesWithParents(_filteredTargetNodes, false);
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

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private Collection<HGCoreDependency> getResolvedCoreDependenciesOrAggregatedCoreDependencyOtherwise() {

    //
    List<HGCoreDependency> coreDependencies = new ArrayList<>();

    _coreDependencies.forEach((c) -> {
      if (c instanceof HGAggregatedCoreDependency && ((HGAggregatedCoreDependency) c).isResolved()
          && ((HGAggregatedCoreDependency) c).getResolvedCoreDependencies().size() > 0) {
        coreDependencies.addAll(((HGAggregatedCoreDependency) c).getResolvedCoreDependencies());
      } else {
        coreDependencies.add(c);
      }
    });

    //
    return coreDependencies;
  }
}
