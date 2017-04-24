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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGProxyDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.SourceOrTarget;
import org.slizaa.hierarchicalgraph.selection.NodeSelections;

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

  /** _coreDependencies contains the dependencies that have been set from the outside */
  private Collection<HGCoreDependency>                      _unfilteredCoreDependencies;

  /** - */
  private Set<HGNode>                                       _selectedNodes;

  /** - */
  private Set<HGNode>                                       _selectedNodesWithChildren;

  /** - */
  private SourceOrTarget                                    _selectedNodesType;

  /** - */
  private Set<HGNode>                                       _unfilteredSourceNodes;

  /** - */
  private Set<HGNode>                                       _unfilteredTargetNodes;

  /** - */
  private Set<HGNode>                                       _unfilteredSourceNodesWithParents;

  /** - */
  private Set<HGNode>                                       _unfilteredTargetNodesWithParents;

  /** - */
  private Set<HGCoreDependency>                             _filteredCoreDependencies;

  /** - */
  private Set<HGNode>                                       _filteredSourceNodes;

  /** - */
  private Set<HGNode>                                       _filteredTargetNodes;

  /** - */
  private Set<HGNode>                                       _filteredSourceNodesWithParents;

  /** - */
  private Set<HGNode>                                       _filteredTargetNodesWithParents;

  /** - */
  private final LoadingCache<HGNode, Set<HGCoreDependency>> _sourceNode2CoreDependenciesMap;

  /** - */
  private final LoadingCache<HGNode, Set<HGCoreDependency>> _targetNode2CoreDependenciesMap;

  /** - */
  private boolean                                           _initialized;

  /** - */
  private Adapter                                           _adapter;

  /** - */
  private ListenerList<IDependencySelectorListener>         _listenerList;

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
    _filteredSourceNodesWithParents = new HashSet<HGNode>();
    _filteredTargetNodesWithParents = new HashSet<HGNode>();
    _unfilteredSourceNodesWithParents = new HashSet<HGNode>();
    _unfilteredTargetNodesWithParents = new HashSet<HGNode>();
    _selectedNodes = new HashSet<HGNode>();
    _selectedNodesWithChildren = new HashSet<HGNode>();
    _listenerList = new ListenerList<>();

    //
    _sourceNode2CoreDependenciesMap = CacheBuilder.newBuilder().build(new CacheLoader<HGNode, Set<HGCoreDependency>>() {
      public Set<HGCoreDependency> load(HGNode key) {
        return new HashSet<>();
      }
    });

    //
    _targetNode2CoreDependenciesMap = CacheBuilder.newBuilder().build(new CacheLoader<HGNode, Set<HGCoreDependency>>() {
      public Set<HGCoreDependency> load(HGNode key) {
        return new HashSet<>();
      }
    });

    //
    _adapter = new AdapterImpl() {
      @Override
      public void notifyChanged(Notification msg) {
        if (msg.getFeatureID(HGProxyDependency.class) == HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED) {
          handleNotify((HGProxyDependency) msg.getNotifier());
        }
      }
    };
  }

  private void handleNotify(HGProxyDependency proxyDependency) {

    // remove the aggregated dependency
    _sourceNode2CoreDependenciesMap.getUnchecked(proxyDependency.getFrom()).remove(proxyDependency);
    _targetNode2CoreDependenciesMap.getUnchecked(proxyDependency.getTo()).remove(proxyDependency);
    _unfilteredSourceNodes.remove(proxyDependency.getFrom());
    _unfilteredTargetNodes.remove(proxyDependency.getTo());
    // _unfilteredSourceNodesWithParents - we don't have to change this here...
    // _unfilteredTargetNodesWithParents - we don't have to change this here...
    _filteredCoreDependencies.remove(proxyDependency);

    // add the new core dependencies
    for (HGCoreDependency hgCoreDependency : proxyDependency.getResolvedCoreDependencies()) {

      _sourceNode2CoreDependenciesMap.getUnchecked(hgCoreDependency.getFrom()).add(hgCoreDependency);
      _targetNode2CoreDependenciesMap.getUnchecked(hgCoreDependency.getTo()).add(hgCoreDependency);
      _unfilteredSourceNodes.add(hgCoreDependency.getFrom());
      _unfilteredTargetNodes.add(hgCoreDependency.getTo());
      _unfilteredSourceNodesWithParents.add(hgCoreDependency.getFrom());
      _unfilteredSourceNodesWithParents.addAll(hgCoreDependency.getFrom().getPredecessors());
      _unfilteredTargetNodesWithParents.add(hgCoreDependency.getTo());
      _unfilteredTargetNodesWithParents.addAll(hgCoreDependency.getTo().getPredecessors());

      // if filtered -> updated filtered
      if (_selectedNodesWithChildren.contains(
          _selectedNodesType == SourceOrTarget.SOURCE ? hgCoreDependency.getFrom() : hgCoreDependency.getTo())) {

        _filteredCoreDependencies.add(hgCoreDependency);

        if (_selectedNodesType == SourceOrTarget.SOURCE) {
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
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void addDependencySelectorListener(IDependencySelectorListener listener) {
    _listenerList.add(checkNotNull(listener));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void removeDependencySelectorListener(IDependencySelectorListener listener) {
    _listenerList.remove(checkNotNull(listener));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setUnfilteredCoreDependencies(Collection<HGCoreDependency> dependencies) {

    //
    checkNotNull(dependencies);
    
    //
    if (_unfilteredCoreDependencies != null) {
      checkNotNull(_unfilteredCoreDependencies);
      checkNotNull(_adapter);

      //
      for (AbstractHGDependency dep1 : _unfilteredCoreDependencies) {
        dep1.eAdapters().remove(_adapter);
      }
    }

    // we have to copy the original dependencies set to avoid trouble calling
    // xy.setUnfilteredCoreDependencies(xy.getFilteredCoreDependencies())
    _unfilteredCoreDependencies = new HashSet<>(dependencies);
    checkNotNull(_unfilteredCoreDependencies);
    checkNotNull(_adapter);

    //
    for (AbstractHGDependency dep : _unfilteredCoreDependencies) {
      dep.eAdapters().add(_adapter);
    }

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
    init(new UnfilteredDependenciesChangedEvent());
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setSelectedSourceNodes(HGNode... selectedNodes) {
    setSelectedNodes(SourceOrTarget.SOURCE, Arrays.asList(selectedNodes));
  }

  @Override
  public void setSelectedSourceNodes(Collection<HGNode> selectedNodes) {
    setSelectedNodes(SourceOrTarget.SOURCE, selectedNodes);
  }

  @Override
  public void setSelectedTargetNodes(HGNode... selectedNodes) {
    setSelectedNodes(SourceOrTarget.TARGET, Arrays.asList(selectedNodes));
  }

  @Override
  public void setSelectedTargetNodes(Collection<HGNode> selectedNodes) {
    setSelectedNodes(SourceOrTarget.TARGET, selectedNodes);
  }

  /**
   * <p>
   * </p>
   */
  @Override
  public void unselectNodes() {
    _selectedNodesType = null;
    _selectedNodes.clear();
    _selectedNodesWithChildren.clear();
    _initialized = false;
    init(new SelectedNodesChangedEvent(null));
  }

  @Override
  public Set<HGNode> getSelectedSourceNodes() {
    return _selectedNodesType == SourceOrTarget.SOURCE ? Collections.unmodifiableSet(_selectedNodes)
        : Collections.emptySet();
  }

  @Override
  public Set<HGNode> getSelectedTargetNodes() {
    return _selectedNodesType == SourceOrTarget.TARGET ? Collections.unmodifiableSet(_selectedNodes)
        : Collections.emptySet();
  }

  @Override
  public Set<HGCoreDependency> getDependenciesForSourceNode(HGNode sourceNode) {
    Set<HGCoreDependency> result = _sourceNode2CoreDependenciesMap.getIfPresent(checkNotNull(sourceNode));
    return result != null ? result : Collections.emptySet();
  }

  @Override
  public Set<HGCoreDependency> getDependenciesForTargetNode(HGNode targetNode) {
    Set<HGCoreDependency> result = _targetNode2CoreDependenciesMap.getIfPresent(checkNotNull(targetNode));
    return result != null ? result : Collections.emptySet();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGCoreDependency> getUnfilteredCoreDependencies() {
    return Collections.unmodifiableSet(getResolvedCoreDependenciesOrProxyDependencyOtherwise());
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGCoreDependency> getFilteredCoreDependencies() {
    return _filteredCoreDependencies;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGNode> getUnfilteredSourceNodes() {
    return _unfilteredSourceNodes;
  }

  @Override
  public Set<HGNode> getUnfilteredTargetNodes() {
    return _unfilteredTargetNodes;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGNode> getFilteredSourceNodes() {
    return _filteredSourceNodes;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Set<HGNode> getFilteredTargetNodes() {
    return _filteredTargetNodes;
  }

  /**
   * <p>
   * </p>
   *
   * @param type
   * @param filtered
   * @return
   */
  @Override
  public Set<HGNode> getFilteredSourceNodesWithParents() {
    return _filteredSourceNodesWithParents;
  }

  @Override
  public Set<HGNode> getFilteredTargetNodesWithParents() {
    return _filteredTargetNodesWithParents;
  }

  @Override
  public Set<HGNode> getUnfilteredSourceNodesWithParents() {
    return _unfilteredSourceNodesWithParents;
  }

  @Override
  public Set<HGNode> getUnfilteredTargetNodesWithParents() {
    return _unfilteredTargetNodesWithParents;
  }

  /**
   * <p>
   * </p>
   */
  private void init(Object event) {

    //
    if (!_initialized) {

      //
      _sourceNode2CoreDependenciesMap.invalidateAll();
      _targetNode2CoreDependenciesMap.invalidateAll();

      Set<HGNode> unfilteredSourceNodes = new HashSet<HGNode>();
      Set<HGNode> unfilteredTargetNodes = new HashSet<HGNode>();

      //
      getResolvedCoreDependenciesOrProxyDependencyOtherwise().forEach(dep -> {
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
      _filteredCoreDependencies.clear();
      Set<HGNode> filteredNodes = new HashSet<HGNode>();

      //
      if (_selectedNodesType != null) {

        Map<HGNode, Set<HGCoreDependency>> node2DependenciesMap = _selectedNodesType == SourceOrTarget.SOURCE
            ? _sourceNode2CoreDependenciesMap.asMap() : _targetNode2CoreDependenciesMap.asMap();

        //
        for (HGNode keyNode : node2DependenciesMap.keySet()) {
          if (_selectedNodesWithChildren.contains(keyNode)) {
            Set<HGCoreDependency> dependencies = node2DependenciesMap.get(keyNode);
            _filteredCoreDependencies.addAll(dependencies);

            // compute the reverse side
            dependencies.forEach((reverseDependency) -> {
              filteredNodes.add(_selectedNodesType == SourceOrTarget.SOURCE ? reverseDependency.getTo()
                  : reverseDependency.getFrom());
            });
          }
        }
      }
      //
      else {
        _filteredCoreDependencies.addAll(_unfilteredCoreDependencies);
      }

      // source nodes selected?
      if (_selectedNodesType == SourceOrTarget.SOURCE) {
        _filteredSourceNodes.clear();
        _filteredSourceNodes.addAll(_unfilteredSourceNodes);
        _filteredTargetNodes = filteredNodes;
      }
      // target nodes selected?
      else if (_selectedNodesType == SourceOrTarget.TARGET) {
        _filteredSourceNodes = filteredNodes;
        _filteredTargetNodes.clear();
        _filteredTargetNodes.addAll(_unfilteredTargetNodes);
      }
      // no nodes selected
      else {
        _filteredSourceNodes.clear();
        _filteredSourceNodes.addAll(_unfilteredSourceNodes);

        _filteredTargetNodes.clear();
        _filteredTargetNodes.addAll(_unfilteredTargetNodes);
      }
      _filteredSourceNodesWithParents = NodeSelections.computeNodesWithParents(_filteredSourceNodes, false);
      _filteredTargetNodesWithParents = NodeSelections.computeNodesWithParents(_filteredTargetNodes, false);

      //
      _initialized = true;

      //
      if (event instanceof ProxyDependencyChangedEvent) {
        for (IDependencySelectorListener listener : _listenerList) {
          listener.proxyDependencyChanged((ProxyDependencyChangedEvent) event);
        }
      }
      //
      else if (event instanceof SelectedNodesChangedEvent) {
        for (IDependencySelectorListener listener : _listenerList) {
          listener.selectedNodesChanged((SelectedNodesChangedEvent) event);
        }
      }
      //
      else if (event instanceof UnfilteredDependenciesChangedEvent) {
        for (IDependencySelectorListener listener : _listenerList) {
          listener.unfilteredDependenciesChanged((UnfilteredDependenciesChangedEvent) event);
        }
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param type
   * @param selectedNodes
   */
  private void setSelectedNodes(SourceOrTarget type, Collection<HGNode> selectedNodes) {

    //
    _selectedNodes.clear();
    _selectedNodes.addAll(selectedNodes);

    _selectedNodesWithChildren.clear();
    for (HGNode node : checkNotNull(selectedNodes)) {
      _selectedNodesWithChildren.addAll(getSelfAndAllChildren(node));
    }

    //
    _selectedNodesType = checkNotNull(type);
    _initialized = false;
    init(new SelectedNodesChangedEvent(type));
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
  private Set<HGCoreDependency> getResolvedCoreDependenciesOrProxyDependencyOtherwise() {

    //
    Set<HGCoreDependency> coreDependencies = new HashSet<>();

    _unfilteredCoreDependencies.forEach((c) -> {
      if (c instanceof HGProxyDependency && ((HGProxyDependency) c).isResolved()
          && ((HGProxyDependency) c).getResolvedCoreDependencies().size() > 0) {
        coreDependencies.addAll(((HGProxyDependency) c).getResolvedCoreDependencies());
      } else {
        coreDependencies.add(c);
      }
    });

    //
    return coreDependencies;
  }
}
