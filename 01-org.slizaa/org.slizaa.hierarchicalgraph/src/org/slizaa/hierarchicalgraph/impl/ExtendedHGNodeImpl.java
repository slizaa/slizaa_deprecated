package org.slizaa.hierarchicalgraph.impl;

import org.eclipse.emf.common.util.EList;
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
  public EList<HGNode> getPredecessors() {
    return _trait.getPredecessors();
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
  public EList<HGCoreDependency> getAccumulatedOutgoingCoreDependencies() {
    return _trait.getAccumulatedOutgoingCoreDependencies();
  }

  @Override
  public EList<HGCoreDependency> getAccumulatedIncomingCoreDependencies() {
    return _trait.getAccumulatedIncomingCoreDependencies();
  }

  @Override
  public HGAggregatedDependency getIncomingDependenciesFrom(HGNode node) {
    return _trait.getIncomingDependenciesFrom(node);
  }

  @Override
  public EList<HGAggregatedDependency> getIncomingDependenciesFrom(EList<HGNode> nodes) {
    return _trait.getIncomingDependenciesFrom(nodes);
  }

  @Override
  public HGAggregatedDependency getOutgoingDependenciesTo(HGNode node) {
    return _trait.getOutgoingDependenciesTo(node);
  }

  @Override
  public EList<HGAggregatedDependency> getOutgoingDependenciesTo(EList<HGNode> nodes) {
    return _trait.getOutgoingDependenciesTo(nodes);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void resolveIncomingAggregatedCoreDependencies(boolean includeChildren) {
    _trait.resolveIncomingAggregatedCoreDependencies(includeChildren);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void resolveOutgoingAggregatedCoreDependencies(boolean includeChildren) {
    _trait.resolveOutgoingAggregatedCoreDependencies(includeChildren);
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
