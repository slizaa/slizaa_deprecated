package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 *
 */
public class ExtendedHGRootNodeImpl extends HGRootNodeImpl {

  /** - */
  protected ExtendedHGNodeTrait _trait;

  /** - */
  protected Map<Object, HGNode> _idToNodeMap;

  /**
   * <p>
   * Creates a new instance of type {@link ExtendedHGRootNodeImpl}.
   * </p>
   */
  public ExtendedHGRootNodeImpl() {
    _trait = new ExtendedHGNodeTrait(this);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public List<HGNode> getPredecessors() {
    return Collections.emptyList();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void invalidateAllCaches() {
    this.invalidateLocalCaches();
    EcoreUtil.getAllContents(this, false).forEachRemaining((c) -> {
      if (c instanceof ExtendedHGNodeImpl) {
        ((ExtendedHGNodeImpl) c).invalidateLocalCaches();
      }
    });
  }

  @Override
  public void invalidateCaches(List<HGNode> modifiedNodes) {

    checkNotNull(modifiedNodes);

    //
    List<HGNode> selfAndParentNodes = new ArrayList<HGNode>();

    //
    for (HGNode hgNode : modifiedNodes) {
      if (hgNode instanceof ExtendedHGNodeImpl) {
        ExtendedHGNodeImpl extendedHGNode = (ExtendedHGNodeImpl) hgNode;
        selfAndParentNodes.add(extendedHGNode);
        selfAndParentNodes.addAll(extendedHGNode.getPredecessors());
      }
    }

    //
    for (HGNode hgNode : selfAndParentNodes) {
      if (hgNode instanceof ExtendedHGNodeImpl) {
        ExtendedHGNodeImpl extendedHGNode = (ExtendedHGNodeImpl) hgNode;
        extendedHGNode.invalidateLocalCaches();
      } else if (hgNode instanceof ExtendedHGRootNodeImpl) {
        ExtendedHGRootNodeImpl extendedHGNode = (ExtendedHGRootNodeImpl) hgNode;
        extendedHGNode.invalidateLocalCaches();
      }
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGNode lookupNode(Object identifier) {

    if (_idToNodeMap == null) {
      EcoreUtil.getAllContents(this, false).forEachRemaining((c) -> {
        if (HierarchicalgraphPackage.eINSTANCE.getHGNode().isInstance(c)) {
          HGNode node = (HGNode) c;
          idToNodeMap().put(node.getIdentifier(), node);
        }
      });
    }

    return _idToNodeMap.get(identifier);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Object getIdentifier() {
    return _trait.getIdentifier();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGRootNode getRootNode() {
    return _trait.getRootNode();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGAggregatedDependency getIncomingDependenciesFrom(HGNode node) {
    return _trait.getIncomingDependenciesFrom(node);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<HGAggregatedDependency> getIncomingDependenciesFrom(List<HGNode> nodes) {
    return _trait.getIncomingDependenciesFrom(nodes);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGAggregatedDependency getOutgoingDependenciesTo(HGNode node) {
    return _trait.getOutgoingDependenciesTo(node);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<HGAggregatedDependency> getOutgoingDependenciesTo(List<HGNode> nodes) {
    return _trait.getOutgoingDependenciesTo(nodes);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<HGCoreDependency> getOutgoingCoreDependencies(boolean includeChildren) {
    return _trait.getOutgoingCoreDependencies(includeChildren);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<HGCoreDependency> getIncomingCoreDependencies(boolean includeChildren) {
    return _trait.getIncomingCoreDependencies(includeChildren);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isPredecessorOf(HGNode node) {
    return _trait.isPredecessorOf(node);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isSuccessorOf(HGNode node) {
    return _trait.isSuccessorOf(node);
  }

  public void onExpand() {
    _trait.onExpand();
  }

  public void onCollapse() {
    _trait.onCollapse();
  }

  public Map<Object, HGNode> getIdToNodeMap() {
    return idToNodeMap();
  }

  public ExtendedHGNodeTrait getTrait() {
    return _trait;
  }

  public void invalidateLocalCaches() {
    _trait.invalidateLocalCaches();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private Map<Object, HGNode> idToNodeMap() {
    if (_idToNodeMap == null) {
      _idToNodeMap = new HashMap<>();
    }
    return _idToNodeMap;
  }
}
