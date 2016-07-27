package org.slizaa.neo4j.hierarchicalgraph.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 *
 */
public class ExtendedNeo4JBackedNodeSourceImpl extends Neo4JBackedNodeSourceImpl {

  /** - */
  private ExtendedNeo4JBackedNodeSourceTrait _trait;

  /**
   * <p>
   * Creates a new instance of type {@link ExtendedNeo4JBackedNodeSourceImpl}.
   * </p>
   */
  public ExtendedNeo4JBackedNodeSourceImpl() {
    _trait = new ExtendedNeo4JBackedNodeSourceTrait(this);
  }

  ExtendedNeo4JBackedNodeSourceTrait getTrait() {
    return _trait;
  }

  /**
   * {@inheritDoc}
   */
  public EMap<String, String> getProperties() {
    return _trait.getProperties();
  }

  /**
   * {@inheritDoc}
   */
  public EList<String> getLabels() {
    return _trait.getLabels();
  }

  public EMap<String, String> reloadProperties() {
    return _trait.reloadProperties();
  }

  public EList<String> reloadLabels() {
    return _trait.reloadLabels();
  }

  @Override
  public void onExpand() {
    _trait.onExpand();
  }

  @Override
  public void onCollapse() {
    _trait.onCollapse();
  }
  
  @Override
  public boolean isAutoExpand() {
    return _trait.isAutoExpand();
  }
}
