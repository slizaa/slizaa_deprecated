package org.slizaa.neo4j.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Optional;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedNeo4JBackedDependencySourceImpl extends Neo4JBackedDependencySourceImpl {

  @SuppressWarnings("unchecked")
  @Override
  public <T> Optional<T> getUserObject(Class<T> type) {
    return checkNotNull(type).isInstance(getUserObject()) ? Optional.of((T) getUserObject()) : Optional.empty();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EMap<String, String> getProperties() {

    // lazy load...
    if (properties == null) {
      reloadProperties();
    }

    // return the result
    return properties;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public EMap<String, String> reloadProperties() {

    //
    JsonObject jsonObject = getNeo4jRestClient().getPropertiesForRelationship((long) getIdentifier());

    // lazy init
    if (properties == null) {
      properties = new EcoreEMap<String, String>(HierarchicalgraphPackage.Literals.STRING_TO_STRING_MAP,
          org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl.class, this,
          Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__PROPERTIES);
    }

    // clear properties first
    properties.clear();

    // re-populate
    jsonObject.entrySet().forEach((e) -> {
      properties.put(e.getKey(), e.getValue().getAsString());
    });

    // return the result
    return properties;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Neo4jRestClient getNeo4jRestClient() {
    return (Neo4jRestClient) ((Neo4JBackedRootNodeSource) getDependency().getFrom().getRootNode().getNodeSource())
        .getRepository();
  }
}
