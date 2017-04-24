package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
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
  
  @SuppressWarnings("unchecked")
  @Override
  public <T> T getExtension(Class<T> clazz) {
    return (T) getExtensionRegistry().get(checkNotNull(clazz).getName());
  }

  @Override
  public <T> void registerExtension(Class<T> clazz, T extension) {
    getExtensionRegistry().put(checkNotNull(clazz).getName(), extension);
  }

  @Override
  public <T> boolean hasExtension(Class<T> key) {
    return getExtensionRegistry().containsKey(checkNotNull(key).getName());
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T getExtension(String key, Class<T> type) {
    Object result = getExtensionRegistry().get(checkNotNull(key));
    
    if (result == null) {
      checkState(checkNotNull(type).isAssignableFrom(result.getClass()));
      return null;
    }
    
    return (T) result;
  }

  @Override
  public void registerExtension(String key, Object extension) {
    getExtensionRegistry().put(checkNotNull(key), extension);
  }

  @Override
  public <T> boolean hasExtension(String key, Class<T> type) {
    Object result = getExtensionRegistry().get(checkNotNull(key));
    
    if (result != null) {
      return checkNotNull(type).isAssignableFrom(result.getClass());
    }
    
    return false;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EList<HGNode> getPredecessors() {
    return ECollections.emptyEList();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void invalidateAllCaches() {
    _trait.invalidateLocalCaches();
    EcoreUtil.getAllContents(this, false).forEachRemaining((c) -> {
      ExtendedHGNodeTrait.getTrait(c).ifPresent((trait) -> trait.invalidateLocalCaches());
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void invalidateCaches(List<HGNode> modifiedNodes) {
    for (HGNode hgNode : getSelfAndParentNodes(checkNotNull(modifiedNodes))) {
      ExtendedHGNodeTrait.getTrait(hgNode).ifPresent((trait) -> trait.invalidateLocalCaches());
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void initializeCaches(List<HGNode> modifiedNodes) {
    for (HGNode hgNode : getSelfAndParentNodes(checkNotNull(modifiedNodes))) {
      ExtendedHGNodeTrait.getTrait(hgNode).ifPresent((trait) -> trait.initializeLocalCaches());
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

  public void resolveProxyDependencies() {
    _trait.resolveProxyDependencies();
  }

  public void resolveIncomingProxyDependencies() {
    _trait.resolveIncomingProxyDependencies();
  }

  public void resolveOutgoingProxyDependencies() {
    _trait.resolveOutgoingProxyDependencies();
  }

  public void invalidateLocalCaches() {
    _trait.invalidateLocalCaches();
  }

  public void initializeLocalCaches() {
    _trait.initializeLocalCaches();
  }

  public <T> Optional<T> getNodeSource(Class<T> clazz) {
    return _trait.getNodeSource(clazz);
  }

  @Override
  public EList<HGCoreDependency> getAccumulatedOutgoingCoreDependencies() {
    return _trait.getAccumulatedOutgoingCoreDependencies();
  }

  @Override
  public EList<HGCoreDependency> getAccumulatedIncomingCoreDependencies() {
    return _trait.getAccumulatedIncomingCoreDependencies();
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

  private List<HGNode> getSelfAndParentNodes(List<HGNode> modifiedNodes) {
    //
    List<HGNode> selfAndParentNodes = new ArrayList<HGNode>();
    for (HGNode hgNode : modifiedNodes) {
      if (hgNode instanceof ExtendedHGNodeImpl) {
        ExtendedHGNodeImpl extendedHGNode = (ExtendedHGNodeImpl) hgNode;
        selfAndParentNodes.add(extendedHGNode);
        selfAndParentNodes.addAll(extendedHGNode.getPredecessors());
      }
    }
    return selfAndParentNodes;
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

  public EList<HGCoreDependency> getIncomingCoreDependencies() {
    return _trait.getIncomingCoreDependencies();
  }

  public EList<HGCoreDependency> getOutgoingCoreDependencies() {
    return _trait.getOutgoingCoreDependencies();
  }
}
