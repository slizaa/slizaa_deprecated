package org.slizaa.hierarchicalgraph.impl;

import java.util.List;

import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

public class ExtendedHGNodeImpl extends HGNodeImpl {

  /** - */
  protected ExtendedHGNodeTrait _trait;

  public ExtendedHGNodeImpl() {
    _trait = new ExtendedHGNodeTrait(this);
  }

  @Override
  public HGRootNode getRootNode() {
    return _trait.getRootNode();
  }

  @Override
  public Object getIdentifier() {
    return _trait.getIdentifier();
  }

  @Override
  public HGAggregatedDependency getIncomingDependenciesFrom(HGNode node) {
    return _trait.getIncomingDependenciesFrom(node);
  }

  @Override
  public List<HGAggregatedDependency> getIncomingDependenciesFrom(List<HGNode> nodes) {
    return _trait.getIncomingDependenciesFrom(nodes);
  }

  @Override
  public HGAggregatedDependency getOutgoingDependenciesTo(HGNode node) {
    return _trait.getOutgoingDependenciesTo(node);
  }

  @Override
  public List<HGAggregatedDependency> getOutgoingDependenciesTo(List<HGNode> nodes) {
    return _trait.getOutgoingDependenciesTo(nodes);
  }

  @Override
  public List<HGCoreDependency> getOutgoingCoreDependencies(boolean includeChildren) {
    return _trait.getOutgoingCoreDependencies(includeChildren);
  }

  @Override
  public List<HGCoreDependency> getIncomingCoreDependencies(boolean includeChildren) {
    return _trait.getIncomingCoreDependencies(includeChildren);
  }

  @Override
  public boolean isPredecessorOf(HGNode node) {
    return _trait.isPredecessorOf(node);
  }

  @Override
  public boolean isSuccessorOf(HGNode node) {
    return _trait.isSuccessorOf(node);
  }

  public ExtendedHGNodeTrait getTrait() {
    return _trait;
  }

  public void onExpand() {
    _trait.onExpand();
  }

  public void onCollapse() {
    _trait.onCollapse();
  }
  
  public void invalidateLocalCaches() {
    _trait.invalidateLocalCaches();
  }
}
