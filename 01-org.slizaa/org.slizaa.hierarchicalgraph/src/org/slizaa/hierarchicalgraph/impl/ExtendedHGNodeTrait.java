package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;

import com.google.common.annotations.VisibleForTesting;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGNodeTrait {

  /** - */
  private HGNodeImpl                            _hgNode;

  /** - */
  protected List<HGNode>                        _cachedParents;

  /** - */
  protected List<HGCoreDependency>              _cachedOutgoingSubTreeCoreDependencies;

  /** - */
  protected List<HGCoreDependency>              _cachedIncomingSubTreeCoreDependencies;

  /** - */
  protected Map<HGNode, HGAggregatedDependency> _cachedAggregatedOutgoingDependenciesMap;

  /** - */
  protected Map<HGNode, HGAggregatedDependency> _cachedAggregatedIncomingDependenciesMap;

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
  public List<HGAggregatedDependency> getIncomingDependenciesFrom(List<HGNode> nodes) {

    //
    List<HGAggregatedDependency> result = new LinkedList<HGAggregatedDependency>();

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
  public List<HGAggregatedDependency> getOutgoingDependenciesTo(List<HGNode> nodes) {

    //
    List<HGAggregatedDependency> result = new LinkedList<>();

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
  public List<HGCoreDependency> getOutgoingCoreDependencies(boolean includeChildren) {

    //
    List<HGCoreDependency> result = includeChildren ? cachedOutgoingSelfAndSubTreeCoreDependencies()
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
  public List<HGCoreDependency> getIncomingCoreDependencies(boolean includeChildren) {

    //
    List<HGCoreDependency> result = includeChildren ? cachedIncomingSelfAndSubTreeCoreDependencies()
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
  public List<HGNode> getPredecessors() {
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
    if (_cachedParents != null) {
      _cachedParents.clear();
      _cachedParents = null;
    }
    if (_cachedOutgoingSubTreeCoreDependencies != null) {
      _cachedOutgoingSubTreeCoreDependencies.clear();
      _cachedOutgoingSubTreeCoreDependencies = null;
    }
    if (_cachedIncomingSubTreeCoreDependencies != null) {
      _cachedIncomingSubTreeCoreDependencies.clear();
      _cachedIncomingSubTreeCoreDependencies = null;
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

  /**
   * <p>
   * </p>
   *
   * @return
   */
  @VisibleForTesting
  public List<HGNode> rawUnmodifiableCachedParents() {
    return _cachedParents == null ? null : Collections.unmodifiableList(_cachedParents);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  @VisibleForTesting
  public List<HGCoreDependency> rawUnmodifiableCachedOutgoingSubTreeCoreDependencies() {
    return _cachedOutgoingSubTreeCoreDependencies == null ? null
        : Collections.unmodifiableList(_cachedOutgoingSubTreeCoreDependencies);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  @VisibleForTesting
  public List<HGCoreDependency> rawUnmodifiableCachedIncomingSubTreeCoreDependencies() {
    return _cachedIncomingSubTreeCoreDependencies == null ? null
        : Collections.unmodifiableList(_cachedIncomingSubTreeCoreDependencies);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  @VisibleForTesting
  public Map<HGNode, HGAggregatedDependency> rawUnmodifiableCachedAggregatedOutgoingDependenciesMap() {
    return _cachedAggregatedOutgoingDependenciesMap == null ? null
        : Collections.unmodifiableMap(_cachedAggregatedOutgoingDependenciesMap);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  @VisibleForTesting
  public Map<HGNode, HGAggregatedDependency> rawUnmodifiableCachedAggregatedIncomingDependenciesMap() {
    return _cachedAggregatedIncomingDependenciesMap == null ? null
        : Collections.unmodifiableMap(_cachedAggregatedIncomingDependenciesMap);
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
  private List<HGCoreDependency> filterCoreDependencies(List<HGCoreDependency> dependencies) {
    checkNotNull(dependencies);

    //
    List<HGCoreDependency> filteredDependencies = dependencies.stream()
        .filter(ExtendedHierarchicalGraphHelper.FILTER_AGGREGATED_CORE_DEPENDENCIES).collect(Collectors.toList());

    //
    return filteredDependencies;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private List<HGNode> cachedParents() {

    //
    if (this._cachedParents == null) {
      this._cachedParents = new ArrayList<>();
      if (_hgNode.getParent() != null) {
        HGNode parent = _hgNode.getParent();
        this._cachedParents.add(parent);
        if (parent instanceof ExtendedHGNodeImpl) {
          this._cachedParents.addAll(((ExtendedHGNodeImpl) _hgNode.getParent()).getTrait().cachedParents());
        }
      }
    }

    //
    return Collections.unmodifiableList(this._cachedParents);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private Map<HGNode, HGAggregatedDependency> cachedAggregatedOutgoingDependenciesMap() {

    //
    if (this._cachedAggregatedOutgoingDependenciesMap == null) {
      this._cachedAggregatedOutgoingDependenciesMap = new HashMap<>();
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
  private Map<HGNode, HGAggregatedDependency> cachedAggregatedIncomingDependenciesMap() {

    //
    if (this._cachedAggregatedIncomingDependenciesMap == null) {
      this._cachedAggregatedIncomingDependenciesMap = new HashMap<>();
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
  private List<HGCoreDependency> cachedOutgoingSelfAndSubTreeCoreDependencies() {

    // lazy init
    if (_cachedOutgoingSubTreeCoreDependencies == null) {

      //
      _cachedOutgoingSubTreeCoreDependencies = new ArrayList<>();

      // add all direct dependencies
      _hgNode.getOutgoingCoreDependenciesMap()
          .forEach((node, list) -> _cachedOutgoingSubTreeCoreDependencies.addAll(list));

      // add children
      if (_hgNode.children != null) {
        for (HGNode child : _hgNode.children) {
          ExtendedHierarchicalGraphHelper.getTrait(child).ifPresent(
              (t) -> _cachedOutgoingSubTreeCoreDependencies.addAll(t.cachedOutgoingSelfAndSubTreeCoreDependencies()));
        }
      }
    }

    //
    return Collections.unmodifiableList(_cachedOutgoingSubTreeCoreDependencies);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private List<HGCoreDependency> cachedIncomingSelfAndSubTreeCoreDependencies() {

    //
    if (_cachedIncomingSubTreeCoreDependencies == null) {

      //
      _cachedIncomingSubTreeCoreDependencies = new ArrayList<>();

      // add all direct dependencies
      _hgNode.getIncomingCoreDependenciesMap()
          .forEach((node, list) -> _cachedIncomingSubTreeCoreDependencies.addAll(list));

      // and children
      if (_hgNode.children != null) {
        for (HGNode child : _hgNode.children) {
          ExtendedHierarchicalGraphHelper.getTrait(child).ifPresent(
              (t) -> _cachedIncomingSubTreeCoreDependencies.addAll(t.cachedIncomingSelfAndSubTreeCoreDependencies()));
        }
      }
    }

    //
    return Collections.unmodifiableList(_cachedIncomingSubTreeCoreDependencies);
  }
}
