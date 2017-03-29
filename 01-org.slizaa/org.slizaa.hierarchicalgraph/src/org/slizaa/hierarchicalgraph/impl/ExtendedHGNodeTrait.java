package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.spi.IProxyDependencyResolver;

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
  protected HGNodeImpl                           _hgNode;

  /** - */
  protected boolean                              _cachedParentsInitialized;

  /** - */
  protected EList<HGNode>                        _cachedParents;

  /** - */
  protected EMap<HGNode, HGAggregatedDependency> _cachedAggregatedOutgoingDependenciesMap;

  /** - */
  protected EMap<HGNode, HGAggregatedDependency> _cachedAggregatedIncomingDependenciesMap;

  /** - */
  protected boolean                              _accumulatedOutgoingCoreDependenciesInitialized;

  /** - */
  protected boolean                              _accumulatedIncomingCoreDependenciesInitialized;

  /** - */
  protected EList<HGCoreDependency>              _accumulatedOutgoingCoreDependencies;

  /** - */
  protected EList<HGCoreDependency>              _accumulatedIncomingCoreDependencies;

  /** - */
  protected EList<HGCoreDependency>              _incomingCoreDependencies;

  /** - */
  protected EList<HGCoreDependency>              _outgoingCoreDependencies;

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
      Utilities.getTrait(node).ifPresent((t) -> t.cachedAggregatedOutgoingDependenciesMap().put(_hgNode, dependency));
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
      Utilities.getTrait(node).ifPresent((t) -> t.cachedAggregatedIncomingDependenciesMap().put(_hgNode, dependency));
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
  public EList<HGAggregatedDependency> getOutgoingDependenciesTo(List<HGNode> nodes) {

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
   */
  public void resolveProxyDependencies() {

    //
    if (_hgNode.getRootNode().hasExtension(IProxyDependencyResolver.class)
        && (_incomingCoreDependencies != null || _outgoingCoreDependencies != null)) {

      //
      List<HGCoreDependency> dependencies = new ArrayList<>();
      if (_incomingCoreDependencies != null) {
        dependencies.addAll(_incomingCoreDependencies);
      }
      if (_outgoingCoreDependencies != null) {
        dependencies.addAll(_outgoingCoreDependencies);
      }

      //
      Utilities.resolveProxyDependencies(dependencies, null);
    }
  }

  /**
   * <p>
   * </p>
   */
  public void resolveIncomingProxyDependencies() {
    Utilities.resolveProxyDependencies(getAccumulatedIncomingCoreDependencies(), null);
  }

  /**
   * <p>
   * </p>
   */
  public void resolveOutgoingProxyDependencies() {
    Utilities.resolveProxyDependencies(getAccumulatedOutgoingCoreDependencies(), null);
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
          throw new RuntimeException("No root set for " + _hgNode.getIdentifier());
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
    _accumulatedIncomingCoreDependenciesInitialized = false;
    _accumulatedOutgoingCoreDependenciesInitialized = false;
    _cachedParentsInitialized = false;

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
    getAccumulatedOutgoingCoreDependencies();
    getAccumulatedIncomingCoreDependencies();
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

    //
    _hgNode.getNodeSource().onExpand();
  }

  /**
   * <p>
   * </p>
   */
  void onCollapse() {

    //
    _hgNode.getNodeSource().onCollapse();
  }

  /**
   * <p>
   * </p>
   */
  public void onSelect() {

    //
    _hgNode.getNodeSource().onSelect();
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
      }

      // created temporary list
      List<HGNode> temp = new ArrayList<>();

      //
      if (_hgNode.getParent() != null) {
        HGNode parent = _hgNode.getParent();
        temp.add(parent);
        temp.addAll(parent.getPredecessors());
      }

      // set EList
      ECollections.setEList(_cachedParents, temp);

      _cachedParentsInitialized = true;
    }

    //
    return this._cachedParents;
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
   */
  public EList<HGCoreDependency> getIncomingCoreDependencies() {

    //
    if (_incomingCoreDependencies == null) {
      _incomingCoreDependencies = new EObjectEListWithoutUniqueCheck<HGCoreDependency>(HGCoreDependency.class, _hgNode,
          HierarchicalgraphPackage.HG_NODE__INCOMING_CORE_DEPENDENCIES);
    }

    //
    return _incomingCoreDependencies;
  }

  /**
   */
  public EList<HGCoreDependency> getOutgoingCoreDependencies() {

    //
    if (_outgoingCoreDependencies == null) {
      _outgoingCoreDependencies = new EObjectEListWithoutUniqueCheck<HGCoreDependency>(HGCoreDependency.class, _hgNode,
          HierarchicalgraphPackage.HG_NODE__OUTGOING_CORE_DEPENDENCIES);
    }

    //
    return _outgoingCoreDependencies;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public EList<HGCoreDependency> getAccumulatedOutgoingCoreDependencies() {

    // lazy init
    if (!_accumulatedOutgoingCoreDependenciesInitialized || _accumulatedOutgoingCoreDependencies == null) {

      //
      if (_accumulatedOutgoingCoreDependencies == null) {
        _accumulatedOutgoingCoreDependencies = new EObjectEListWithoutUniqueCheck<HGCoreDependency>(
            HGCoreDependency.class, _hgNode, HierarchicalgraphPackage.HG_NODE__ACCUMULATED_OUTGOING_CORE_DEPENDENCIES);
      }

      // created temporary list
      List<HGCoreDependency> temp = new ArrayList<>();

      // add all direct dependencies
      temp.addAll(getOutgoingCoreDependencies());

      // add children
      if (_hgNode.children != null) {
        for (HGNode child : _hgNode.children) {
          Utilities.getTrait(child).ifPresent((t) -> temp.addAll(t.getAccumulatedOutgoingCoreDependencies()));
        }
      }

      // set EList
      ECollections.setEList(_accumulatedOutgoingCoreDependencies, temp);

      // done
      _accumulatedOutgoingCoreDependenciesInitialized = true;
    }

    //
    return _accumulatedOutgoingCoreDependencies;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public EList<HGCoreDependency> getAccumulatedIncomingCoreDependencies() {

    //
    if (!_accumulatedIncomingCoreDependenciesInitialized || _accumulatedIncomingCoreDependencies == null) {

      //
      if (_accumulatedIncomingCoreDependencies == null) {
        _accumulatedIncomingCoreDependencies = new EObjectEListWithoutUniqueCheck<HGCoreDependency>(
            HGCoreDependency.class, _hgNode, HierarchicalgraphPackage.HG_NODE__ACCUMULATED_INCOMING_CORE_DEPENDENCIES);
      }

      // created temporary list
      List<HGCoreDependency> temp = new ArrayList<>();

      // add all direct dependencies
      temp.addAll(_hgNode.getIncomingCoreDependencies());

      // and children
      if (_hgNode.children != null) {
        for (HGNode child : _hgNode.children) {
          Utilities.getTrait(child).ifPresent((t) -> temp.addAll(t.getAccumulatedIncomingCoreDependencies()));
        }
      }

      // set EList
      ECollections.setEList(_accumulatedIncomingCoreDependencies, temp);

      // done
      _accumulatedIncomingCoreDependenciesInitialized = true;
    }

    return _accumulatedIncomingCoreDependencies;
  }

  /**
   * <p>
   * </p>
   *
   * @param clazz
   * @return
   */
  public <T> Optional<T> getNodeSource(Class<T> clazz) {

    //
    if (checkNotNull(clazz).isInstance(_hgNode.nodeSource)) {
      return Optional.of(clazz.cast(_hgNode.nodeSource));
    }

    return Optional.empty();
  }
}
