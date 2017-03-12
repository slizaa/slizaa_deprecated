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
package org.slizaa.hierarchicalgraph.selection.selector;

import static com.google.common.base.Preconditions.checkNotNull;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
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
import org.slizaa.hierarchicalgraph.selection.NodeSelections;

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

  /** _coreDependencies contains the dependencies that have been set from the outside */
  private Collection<HGCoreDependency>                       _coreDependencies;

  /** - */
  private Collection<HGNode>                                 _selectedNodesWithChildren;

  /** - */
  private NodeType                                           _selectedNodesType;

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
  private final LoadingCache<HGNode, Set<HGCoreDependency>> _sourceNode2CoreDependenciesMap;

  /** - */
  private final LoadingCache<HGNode, Set<HGCoreDependency>> _targetNode2CoreDependenciesMap;

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
    _selectedNodesWithChildren = new HashSet<HGNode>();

    //
    _sourceNode2CoreDependenciesMap = CacheBuilder.newBuilder()
        .build(new CacheLoader<HGNode, Set<HGCoreDependency>>() {
          public Set<HGCoreDependency> load(HGNode key) {
            return new HashSet<>();
          }
        });

    //
    _targetNode2CoreDependenciesMap = CacheBuilder.newBuilder()
        .build(new CacheLoader<HGNode, Set<HGCoreDependency>>() {
          public Set<HGCoreDependency> load(HGNode key) {
            return new HashSet<>();
          }
        });

    //
    _adapter = new AdapterImpl() {
      @Override
      public void notifyChanged(Notification msg) {
        if (msg.getFeatureID(
            HGAggregatedCoreDependency.class) == HierarchicalgraphPackage.HG_AGGREGATED_CORE_DEPENDENCY__RESOLVED) {

          handleNotify((HGAggregatedCoreDependency) msg.getNotifier());
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

  private void handleNotify(HGAggregatedCoreDependency aggregatedCoreDependency) {

    // remove the aggregated dependency
    _sourceNode2CoreDependenciesMap.getUnchecked(aggregatedCoreDependency.getFrom()).remove(aggregatedCoreDependency);
    _targetNode2CoreDependenciesMap.getUnchecked(aggregatedCoreDependency.getTo()).remove(aggregatedCoreDependency);
    _unfilteredSourceNodes.remove(aggregatedCoreDependency.getFrom());
    _unfilteredTargetNodes.remove(aggregatedCoreDependency.getTo());
    // _unfilteredSourceNodesWithParents - we don't have to change this here...
    // _unfilteredTargetNodesWithParents - we don't have to change this here...
    _filteredCoreDependencies.remove(aggregatedCoreDependency);

    // add the new core dependencies
    for (HGCoreDependency hgCoreDependency : aggregatedCoreDependency.getResolvedCoreDependencies()) {

      _sourceNode2CoreDependenciesMap.getUnchecked(hgCoreDependency.getFrom()).add(hgCoreDependency);
      _targetNode2CoreDependenciesMap.getUnchecked(hgCoreDependency.getTo()).add(hgCoreDependency);
      _unfilteredSourceNodes.add(hgCoreDependency.getFrom());
      _unfilteredTargetNodes.add(hgCoreDependency.getTo());
      _unfilteredSourceNodesWithParents.add(hgCoreDependency.getFrom());
      _unfilteredSourceNodesWithParents.addAll(hgCoreDependency.getFrom().getPredecessors());
      _unfilteredTargetNodesWithParents.add(hgCoreDependency.getTo());
      _unfilteredTargetNodesWithParents.addAll(hgCoreDependency.getTo().getPredecessors());


      //
        if (_selectedNodesWithChildren.contains(_selectedNodesType == NodeType.SOURCE ? hgCoreDependency.getFrom() : hgCoreDependency.getTo())) {
          _filteredCoreDependencies.add(hgCoreDependency);
          
          if (_selectedNodesType == NodeType.SOURCE) {
            _filteredTargetNodes.add(hgCoreDependency.getTo());
            _filteredTargetNodesWithParents.add(hgCoreDependency.getTo());
            _filteredTargetNodesWithParents.addAll(hgCoreDependency.getTo().getPredecessors());
          } 
          //
          else {
            _filteredTargetNodes.add(hgCoreDependency.getFrom());
            _filteredTargetNodesWithParents.add(hgCoreDependency.getFrom());
            _filteredTargetNodesWithParents.addAll(hgCoreDependency.getFrom().getPredecessors());
          }
        }
    }


    // TODO
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
    _selectedNodesWithChildren.clear();
    _selectedNodesType = null;
    _sourceNode2CoreDependenciesMap.invalidateAll();
    _targetNode2CoreDependenciesMap.invalidateAll();
    _unfilteredSourceNodes.clear();
    _unfilteredTargetNodes.clear();

    //
    _initialized = false;
  }

  @Override
  public Set<HGCoreDependency> getDependenciesForSourceNode(HGNode sourceNode) {
    return _sourceNode2CoreDependenciesMap.getIfPresent(checkNotNull(sourceNode));
  }

  @Override
  public Set<HGCoreDependency> getDependenciesForTargetNode(HGNode targetNode) {
    return _targetNode2CoreDependenciesMap.getIfPresent(checkNotNull(targetNode));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGCoreDependency> getUnfilteredCoreDependencies() {
    init();
    return Collections.unmodifiableSet(getResolvedCoreDependenciesOrAggregatedCoreDependencyOtherwise());
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

    //
    _selectedNodesWithChildren.clear();
    for (HGNode node : checkNotNull(selectedNodes)) {
      _selectedNodesWithChildren.addAll(getSelfAndAllChildren(node));
    }

    //
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
      _unfilteredSourceNodesWithParents = NodeSelections.computeNodesWithParents(unfilteredSourceNodes, false);
      _unfilteredTargetNodesWithParents = NodeSelections.computeNodesWithParents(unfilteredTargetNodes, false);

      // clear filtered dependencies
      _filteredCoreDependencies = new HashSet<HGCoreDependency>();
      Set<HGNode> filteredNodes = new HashSet<HGNode>();

      //
      if (_selectedNodesWithChildren != null) {

        Map<HGNode, Set<HGCoreDependency>> node2DependenciesMap = _selectedNodesType == NodeType.SOURCE
            ? _sourceNode2CoreDependenciesMap.asMap() : _targetNode2CoreDependenciesMap.asMap();

        //
        for (HGNode keyNode : node2DependenciesMap.keySet()) {
          if (_selectedNodesWithChildren.contains(keyNode)) {
            Set<HGCoreDependency> dependencies = node2DependenciesMap.get(keyNode);
            _filteredCoreDependencies.addAll(dependencies);

            // compute the reverse side
            dependencies.forEach((reverseDependency) -> {
              filteredNodes
                  .add(_selectedNodesType == NodeType.SOURCE ? reverseDependency.getTo() : reverseDependency.getFrom());
            });
          }
        }
      }

      //
      if (_selectedNodesType == NodeType.SOURCE) {
        _filteredSourceNodes.clear();
        _filteredTargetNodes = filteredNodes;
      } else {
        _filteredSourceNodes = filteredNodes;
        _filteredTargetNodes.clear();
      }
      _filteredSourceNodesWithParents = NodeSelections.computeNodesWithParents(_filteredSourceNodes, false);
      _filteredTargetNodesWithParents = NodeSelections.computeNodesWithParents(_filteredTargetNodes, false);

      //
      _initialized = true;
    }
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
   * @return
   */
  private Set<HGCoreDependency> getResolvedCoreDependenciesOrAggregatedCoreDependencyOtherwise() {

    //
    Set<HGCoreDependency> coreDependencies = new HashSet<>();

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
