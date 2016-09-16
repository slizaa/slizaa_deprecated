package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGNodeTrait {
  
  /**
   * <p>
   * </p>
   *
   * @param o
   * @return
   */
  public static Optional<ExtendedHGNodeTrait> getTrait(Object o) {

    //
    if (o instanceof ExtendedHGNodeImpl) {
      return Optional.of(((ExtendedHGNodeImpl) o).getTrait());
    }

    //
    if (o instanceof ExtendedHGRootNodeImpl) {
      return Optional.of(((ExtendedHGRootNodeImpl) o).getTrait());
    }

    //
    return Optional.empty();
  }
  

  /** - */
  private HGNodeImpl                             _hgNode;

  /** - */
  protected boolean                              _cachedParentsInitialized;

  /** - */
  protected EList<HGNode>                        _cachedParents;

  /** - */
  protected boolean                              _cachedOutgoingSelfAndSubTreeCoreDependenciesInitialized;

  /** - */
  protected EList<HGCoreDependency>              _cachedOutgoingSelfAndSubTreeCoreDependencies;

  /** - */
  protected boolean                              _cachedIncomingSelfAndSubTreeCoreDependenciesInitialized;

  /** - */
  protected EList<HGCoreDependency>              _cachedIncomingSelfAndSubTreeCoreDependencies;

  /** - */
  protected EMap<HGNode, HGAggregatedDependency> _cachedAggregatedOutgoingDependenciesMap;

  /** - */
  protected EMap<HGNode, HGAggregatedDependency> _cachedAggregatedIncomingDependenciesMap;

  /**
   * <p>
   * Creates a new instance of type {@link ExtendedHGNodeTrait}.
   * </p>
   *
   * @param hgNode
   */
  public ExtendedHGNodeTrait(HGNodeImpl hgNode) {
    _hgNode = hgNode;
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @return
   */
  public HGAggregatedDependency getIncomingDependenciesFrom(HGNode node) {

    // 'aggregated' dependency
    if (!cachedAggregatedIncomingDependenciesMap().containsKey(node)) {

      // create new dependency
      ExtendedHGAggregatedDependencyImpl dependency = (ExtendedHGAggregatedDependencyImpl) HierarchicalgraphFactory.eINSTANCE
          .createHGAggregatedDependency();

      dependency.setFrom(node);
      dependency.setTo(_hgNode);
      dependency.initialize();

      // store dependency
      cachedAggregatedIncomingDependenciesMap().put(node, dependency);
      ExtendedHierarchicalGraphHelper.getTrait(node)
          .ifPresent((t) -> t.cachedAggregatedOutgoingDependenciesMap().put(_hgNode, dependency));
    }

    //
    HGAggregatedDependency dependency = cachedAggregatedIncomingDependenciesMap().get(node);

    //
    if (dependency != null && dependency.getAggregatedWeight() > 0) {
      return dependency;
    } else {
      return null;
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param nodes
   * @return
   */
  public EList<HGAggregatedDependency> getIncomingDependenciesFrom(EList<HGNode> nodes) {

    //
    EList<HGAggregatedDependency> result = new BasicEList<HGAggregatedDependency>();

    //
    for (HGNode node : nodes) {
      HGAggregatedDependency dependency = getIncomingDependenciesFrom(node);
      if (dependency != null) {
        result.add(dependency);
      }
    }

    //
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @return
   */
  public HGAggregatedDependency getOutgoingDependenciesTo(HGNode node) {

    //
    checkNotNull(node);

    // 'aggregated' dependency
    if (!cachedAggregatedOutgoingDependenciesMap().containsKey(node)) {

      // create new dependency
      ExtendedHGAggregatedDependencyImpl dependency = (ExtendedHGAggregatedDependencyImpl) HierarchicalgraphFactory.eINSTANCE
          .createHGAggregatedDependency();

      dependency.setFrom(_hgNode);
      dependency.setTo(node);
      dependency.initialize();

      // store dependency
      cachedAggregatedOutgoingDependenciesMap().put(node, dependency);
      ExtendedHierarchicalGraphHelper.getTrait(node)
          .ifPresent((t) -> t.cachedAggregatedIncomingDependenciesMap().put(_hgNode, dependency));
    }

    //
    HGAggregatedDependency dependency = cachedAggregatedOutgoingDependenciesMap().get(node);

    //
    if (dependency != null && dependency.getAggregatedWeight() > 0) {
      return dependency;
    } else {
      return null;
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param nodes
   * @return
   */
  public EList<HGAggregatedDependency> getOutgoingDependenciesTo(EList<HGNode> nodes) {

    //
    EList<HGAggregatedDependency> result = new BasicEList<>();

    //
    for (HGNode node : nodes) {
      HGAggregatedDependency dependency = getOutgoingDependenciesTo(node);
      if (dependency != null) {
        result.add(dependency);
      }
    }

    //
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param includeChildren
   * @return
   */
  public EList<HGCoreDependency> getOutgoingCoreDependencies(boolean includeChildren) {

    //
    EList<HGCoreDependency> result = includeChildren ? cachedOutgoingSelfAndSubTreeCoreDependencies()
        : ExtendedHierarchicalGraphHelper.flattenCoreDependencies(_hgNode.outgoingCoreDependenciesMap);

    //
    return filterCoreDependencies(result);
  }

  /**
   * <p>
   * </p>
   *
   * @param includeChildren
   * @return
   */
  public EList<HGCoreDependency> getIncomingCoreDependencies(boolean includeChildren) {

    //
    EList<HGCoreDependency> result = includeChildren ? cachedIncomingSelfAndSubTreeCoreDependencies()
        : ExtendedHierarchicalGraphHelper.flattenCoreDependencies(_hgNode.incomingCoreDependenciesMap);

    //
    return filterCoreDependencies(result);
  }

  /**
   * <p>
   * </p>
   *
   * @param includeChildren
   */
  public void resolveIncomingAggregatedCoreDependencies(boolean includeChildren) {
    ExtendedHierarchicalGraphHelper.resolveAggregatedCoreDependencies(getIncomingCoreDependencies(includeChildren));
  }

  /**
   * <p>
   * </p>
   *
   * @param includeChildren
   */
  public void resolveOutgoingAggregatedCoreDependencies(boolean includeChildren) {
    ExtendedHierarchicalGraphHelper.resolveAggregatedCoreDependencies(getOutgoingCoreDependencies(includeChildren));
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @return
   */
  public boolean isPredecessorOf(HGNode node) {

    //
    if (node == null) {
      return false;
    }

    //
    if (node instanceof ExtendedHGRootNodeImpl) {
      return ((ExtendedHGRootNodeImpl) node).getTrait().cachedParents().contains(_hgNode);
    } else if (node instanceof ExtendedHGNodeImpl) {
      return ((ExtendedHGNodeImpl) node).getTrait().cachedParents().contains(_hgNode);
    }

    //
    throw new RuntimeException(String.format("Unexpected node type %s.", node.getClass().getName()));
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @return
   */
  public boolean isSuccessorOf(HGNode node) {

    //
    if (node == null) {
      return false;
    }

    //
    return node.isPredecessorOf(_hgNode);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public EList<HGNode> getPredecessors() {
    return cachedParents();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Object getIdentifier() {
    return _hgNode.getNodeSource().getIdentifier();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HGRootNode getRootNode() {

    if (_hgNode.rootNode == null) {

      if (_hgNode.getParent() == null) {

        if (!(_hgNode instanceof HGRootNode)) {
          throw new RuntimeException("No root set.");
        }

        _hgNode.rootNode = (HGRootNode) _hgNode;
      } else {
        _hgNode.rootNode = _hgNode.getParent().getRootNode();
      }
    }

    return _hgNode.rootNode;
  }

  /**
   * <p>
   * </p>
   */
  public void invalidateLocalCaches() {

    //
    _cachedIncomingSelfAndSubTreeCoreDependenciesInitialized = false;
    _cachedOutgoingSelfAndSubTreeCoreDependenciesInitialized = false;
    _cachedParentsInitialized = false;

    if (_cachedParents != null) {
      _cachedParents.clear();
    }
    if (_cachedOutgoingSelfAndSubTreeCoreDependencies != null) {
      _cachedOutgoingSelfAndSubTreeCoreDependencies.clear();
    }
    if (_cachedIncomingSelfAndSubTreeCoreDependencies != null) {
      _cachedIncomingSelfAndSubTreeCoreDependencies.clear();
    }
    if (_cachedAggregatedOutgoingDependenciesMap != null) {
      _cachedAggregatedOutgoingDependenciesMap.values()
          .forEach((dep) -> ((ExtendedHGAggregatedDependencyImpl) dep).invalidate());
    }
    if (_cachedAggregatedIncomingDependenciesMap != null) {
      _cachedAggregatedIncomingDependenciesMap.values()
          .forEach((dep) -> ((ExtendedHGAggregatedDependencyImpl) dep).invalidate());
    }
  }

  public void initializeLocalCaches() {
    cachedParents();
    cachedOutgoingSelfAndSubTreeCoreDependencies();
    cachedIncomingSelfAndSubTreeCoreDependencies();
    if (_cachedAggregatedOutgoingDependenciesMap != null) {
      _cachedAggregatedOutgoingDependenciesMap.values()
          .forEach((dep) -> ((ExtendedHGAggregatedDependencyImpl) dep).initialize());
    }
    if (_cachedAggregatedIncomingDependenciesMap != null) {
      _cachedAggregatedIncomingDependenciesMap.values()
          .forEach((dep) -> ((ExtendedHGAggregatedDependencyImpl) dep).initialize());
    }
  }

  /**
   * <p>
   * </p>
   */
  void onExpand() {
    _hgNode.getNodeSource().onExpand();
  }

  /**
   * <p>
   * </p>
   */
  void onCollapse() {
    _hgNode.getNodeSource().onCollapse();
  }

  /**
   * <p>
   * </p>
   *
   * @param result
   * @return
   */
   // TODO: !!
  private EList<HGCoreDependency> filterCoreDependencies(EList<HGCoreDependency> dependencies) {
    checkNotNull(dependencies);

    //
    EList<HGCoreDependency> filteredDependencies = new BasicEList<HGCoreDependency>(dependencies.stream()
        .filter(ExtendedHierarchicalGraphHelper.FILTER_REMOVE_RESOLVED_AGGREGATED_CORE_DEPENDENCIES).collect(Collectors.toList()));

    //
    return filteredDependencies;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private EList<HGNode> cachedParents() {

    //
    if (!_cachedParentsInitialized || this._cachedParents == null) {

      //
      if (this._cachedParents == null) {
        this._cachedParents = new BasicEList<HGNode>();
      } else {
        _cachedParents.clear();
      }

      //
      if (_hgNode.getParent() != null) {
        HGNode parent = _hgNode.getParent();
        this._cachedParents.add(parent);
        if (parent instanceof ExtendedHGNodeImpl) {
          this._cachedParents.addAll(((ExtendedHGNodeImpl) _hgNode.getParent()).getTrait().cachedParents());
        }
      }

      _cachedParentsInitialized = true;
    }

    //
    return ECollections.unmodifiableEList(this._cachedParents);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private EMap<HGNode, HGAggregatedDependency> cachedAggregatedOutgoingDependenciesMap() {

    //
    if (this._cachedAggregatedOutgoingDependenciesMap == null) {
      this._cachedAggregatedOutgoingDependenciesMap = new BasicEMap<>();
    }

    //
    return this._cachedAggregatedOutgoingDependenciesMap;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private EMap<HGNode, HGAggregatedDependency> cachedAggregatedIncomingDependenciesMap() {

    //
    if (this._cachedAggregatedIncomingDependenciesMap == null) {
      this._cachedAggregatedIncomingDependenciesMap = new BasicEMap<>();
    }

    //
    return this._cachedAggregatedIncomingDependenciesMap;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  EList<HGCoreDependency> cachedOutgoingSelfAndSubTreeCoreDependencies() {

    // lazy init
    if (!_cachedOutgoingSelfAndSubTreeCoreDependenciesInitialized
        || _cachedOutgoingSelfAndSubTreeCoreDependencies == null) {

      //
      if (_cachedOutgoingSelfAndSubTreeCoreDependencies == null) {
        _cachedOutgoingSelfAndSubTreeCoreDependencies = new BasicEList<>();
      } else {
        _cachedOutgoingSelfAndSubTreeCoreDependencies.clear();
      }

      // add all direct dependencies
      for (Map.Entry<HGNode, EList<HGCoreDependency>> entry : _hgNode.getOutgoingCoreDependenciesMap()) {
        _cachedOutgoingSelfAndSubTreeCoreDependencies.addAll(entry.getValue());
      }

      // add children
      if (_hgNode.children != null) {
        for (HGNode child : _hgNode.children) {
          ExtendedHierarchicalGraphHelper.getTrait(child).ifPresent((t) -> _cachedOutgoingSelfAndSubTreeCoreDependencies
              .addAll(t.cachedOutgoingSelfAndSubTreeCoreDependencies()));
        }
      }

      _cachedOutgoingSelfAndSubTreeCoreDependenciesInitialized = true;
    }

    //
    return ECollections.unmodifiableEList(_cachedOutgoingSelfAndSubTreeCoreDependencies);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  EList<HGCoreDependency> cachedIncomingSelfAndSubTreeCoreDependencies() {

    //
    if (!_cachedIncomingSelfAndSubTreeCoreDependenciesInitialized
        || _cachedIncomingSelfAndSubTreeCoreDependencies == null) {

      //
      if (_cachedIncomingSelfAndSubTreeCoreDependencies == null) {
        _cachedIncomingSelfAndSubTreeCoreDependencies = new BasicEList<>();
      } else {
        _cachedIncomingSelfAndSubTreeCoreDependencies.clear();
      }

      // add all direct dependencies
      for (Map.Entry<HGNode, EList<HGCoreDependency>> entry : _hgNode.getIncomingCoreDependenciesMap()) {
        _cachedIncomingSelfAndSubTreeCoreDependencies.addAll(entry.getValue());
      }

      // and children
      if (_hgNode.children != null) {
        for (HGNode child : _hgNode.children) {
          ExtendedHierarchicalGraphHelper.getTrait(child).ifPresent((t) -> _cachedIncomingSelfAndSubTreeCoreDependencies
              .addAll(t.cachedIncomingSelfAndSubTreeCoreDependencies()));
        }
      }

      _cachedIncomingSelfAndSubTreeCoreDependenciesInitialized = true;
    }

    //
    return ECollections.unmodifiableEList(_cachedIncomingSelfAndSubTreeCoreDependencies);
  }
}
