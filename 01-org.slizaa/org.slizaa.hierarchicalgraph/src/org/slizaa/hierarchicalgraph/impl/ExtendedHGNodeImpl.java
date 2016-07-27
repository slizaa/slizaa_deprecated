package org.slizaa.hierarchicalgraph.impl;

import java.util.List;

import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

public class ExtendedHGNodeImpl extends HGNodeImpl {

  /** - */
  protected ExtendedHGNodeTrait _trait;

  public ExtendedHGNodeImpl() {
    _trait = new ExtendedHGNodeTrait(this);
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
}
