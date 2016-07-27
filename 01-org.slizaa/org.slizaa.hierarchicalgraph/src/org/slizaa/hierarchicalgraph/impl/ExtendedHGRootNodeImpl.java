package org.slizaa.hierarchicalgraph.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

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

  public Map<Object, HGNode> getIdToNodeMap() {
    return idToNodeMap();
  }

  public HGNode getNode(Object identifier) {

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

  public ExtendedHGNodeTrait getTrait() {
    return _trait;
  }

  @Override
  public HGRootNode getRootNode() {
    return _trait.getRootNode();
  }

  public Object getIdentifier() {
    return _trait.getIdentifier();
  }

  public void onInitializeCaches() {
    _trait.onInitializeCaches();
  }

  public HGDependency getIncomingDependenciesFrom(HGNode node) {
    return _trait.getIncomingDependenciesFrom(node);
  }

  public List<HGDependency> getIncomingDependenciesFrom(List<HGNode> nodes) {
    return _trait.getIncomingDependenciesFrom(nodes);
  }

  public HGDependency getOutgoingDependenciesTo(HGNode node) {
    return _trait.getOutgoingDependenciesTo(node);
  }

  public List<HGDependency> getOutgoingDependenciesTo(List<HGNode> nodes) {
    return _trait.getOutgoingDependenciesTo(nodes);
  }

  public List<HGDependency> getOutgoingCoreDependencies(boolean includeChildren) {
    return _trait.getOutgoingCoreDependencies(includeChildren);
  }

  public List<HGDependency> getIncomingCoreDependencies(boolean includeChildren) {
    return _trait.getIncomingCoreDependencies(includeChildren);
  }

  public boolean isPredecessorOf(HGNode node) {
    return _trait.isPredecessorOf(node);
  }

  public boolean isSuccessorOf(HGNode node) {
    return _trait.isSuccessorOf(node);
  }

  public void onExpand() {
    _trait.onExpand();
  }

  public void onCollapse() {
    _trait.onCollapse();
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
