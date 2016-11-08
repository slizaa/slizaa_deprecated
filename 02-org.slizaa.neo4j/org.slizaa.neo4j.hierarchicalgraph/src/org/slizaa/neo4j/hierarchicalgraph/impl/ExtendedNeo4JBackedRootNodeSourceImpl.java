package org.slizaa.neo4j.hierarchicalgraph.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedNeo4JBackedRootNodeSourceImpl extends Neo4JBackedRootNodeSourceImpl {

  /** - */
  private ExtendedNeo4JBackedNodeSourceTrait _trait;

  /**
   * <p>
   * Creates a new instance of type {@link ExtendedNeo4JBackedRootNodeSourceImpl}.
   * </p>
   */
  public ExtendedNeo4JBackedRootNodeSourceImpl() {
    _trait = new ExtendedNeo4JBackedNodeSourceTrait(this);
  }

  /**
   * {@inheritDoc}
   */
  public EMap<String, String> getProperties() {
    return ECollections.emptyEMap();
  }

  /**
   * {@inheritDoc}
   */
  public EList<String> getLabels() {
    return ECollections.emptyEList();
  }

  /**
   * {@inheritDoc}
   */
  public EMap<String, String> reloadProperties() {
    return ECollections.emptyEMap();
  }

  /**
   * {@inheritDoc}
   */
  public EList<String> reloadLabels() {
    return ECollections.emptyEList();
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void onExpand() {
    _trait.onExpand();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void onCollapse() {
    _trait.onCollapse();
  }

  @Override
  public boolean isAutoExpand() {
    return _trait.isAutoExpand();
  }
}
