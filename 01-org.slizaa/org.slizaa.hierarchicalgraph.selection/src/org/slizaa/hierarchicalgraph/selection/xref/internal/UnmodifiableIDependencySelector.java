package org.slizaa.hierarchicalgraph.selection.xref.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.Set;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelector;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelectorListener;

public class UnmodifiableIDependencySelector implements IDependencySelector {

  private IDependencySelector _target;

  public UnmodifiableIDependencySelector(IDependencySelector target) {
    _target = checkNotNull(target);
  }

  public void addDependencySelectorListener(IDependencySelectorListener listener) {
    throw new UnsupportedOperationException();
  }

  public void removeDependencySelectorListener(IDependencySelectorListener listener) {
    throw new UnsupportedOperationException();
  }

  public void setUnfilteredCoreDependencies(Collection<HGCoreDependency> dependencies) {
    throw new UnsupportedOperationException();
  }

  public void setSelectedSourceNodes(HGNode... selectedNodes) {
    throw new UnsupportedOperationException();
  }

  public void setSelectedSourceNodes(Collection<HGNode> selectedNodes) {
    throw new UnsupportedOperationException();
  }

  public void setSelectedTargetNodes(HGNode... selectedNodes) {
    throw new UnsupportedOperationException();
  }

  public void setSelectedTargetNodes(Collection<HGNode> selectedNodes) {
    throw new UnsupportedOperationException();
  }

  public void unselectNodes() {
    throw new UnsupportedOperationException();
  }

  public Set<HGNode> getSelectedSourceNodes() {
    return _target.getSelectedSourceNodes();
  }

  public Set<HGNode> getSelectedTargetNodes() {
    return _target.getSelectedTargetNodes();
  }

  public Set<HGCoreDependency> getUnfilteredCoreDependencies() {
    return _target.getUnfilteredCoreDependencies();
  }

  public Set<HGNode> getUnfilteredSourceNodes() {
    return _target.getUnfilteredSourceNodes();
  }

  public Set<HGNode> getUnfilteredSourceNodesWithParents() {
    return _target.getUnfilteredSourceNodesWithParents();
  }

  public Set<HGNode> getUnfilteredTargetNodes() {
    return _target.getUnfilteredTargetNodes();
  }

  public Set<HGNode> getUnfilteredTargetNodesWithParents() {
    return _target.getUnfilteredTargetNodesWithParents();
  }

  public Set<HGCoreDependency> getFilteredCoreDependencies() {
    return _target.getFilteredCoreDependencies();
  }

  public Set<HGNode> getFilteredSourceNodes() {
    return _target.getFilteredSourceNodes();
  }

  public Set<HGNode> getFilteredSourceNodesWithParents() {
    return _target.getFilteredSourceNodesWithParents();
  }

  public Set<HGNode> getFilteredTargetNodes() {
    return _target.getFilteredTargetNodes();
  }

  public Set<HGNode> getFilteredTargetNodesWithParents() {
    return _target.getFilteredTargetNodesWithParents();
  }

  public Set<HGCoreDependency> getDependenciesForSourceNode(HGNode fromNode) {
    return _target.getDependenciesForSourceNode(fromNode);
  }

  public Set<HGCoreDependency> getDependenciesForTargetNode(HGNode toNode) {
    return _target.getDependenciesForTargetNode(toNode);
  }

  
}
