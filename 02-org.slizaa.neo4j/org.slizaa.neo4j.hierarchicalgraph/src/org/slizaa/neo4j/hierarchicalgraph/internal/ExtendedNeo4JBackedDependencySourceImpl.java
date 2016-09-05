package org.slizaa.neo4j.hierarchicalgraph.internal;

import java.util.concurrent.Future;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.neo4j.hierarchicalgraph.IAggregatedDependencyResolver;
import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;
import org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl;

import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedNeo4JBackedDependencySourceImpl extends Neo4JBackedDependencySourceImpl {

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> onResolveAggregatedCoreDependency() {

    //
    if (resolved) {
      return null;
    }

    // get the aggregated dependency resolver
    IAggregatedDependencyResolver dependencyResolver = getAggregatedDependencyResolver();

    //
    return dependencyResolver == null ? null
        : dependencyResolver.createNewAggregatedDependencyResolver(getDependency());
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
    JsonObject jsonObject = getJQAssistantRemoteService().getRelationshipProperties((long) getIdentifier());

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
  public INeo4JRepository getJQAssistantRemoteService() {
    return (INeo4JRepository) ((Neo4JBackedRootNodeSource) getDependency().getFrom().getRootNode().getNodeSource())
        .getRepository();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public IAggregatedDependencyResolver getAggregatedDependencyResolver() {
    return (IAggregatedDependencyResolver) ((Neo4JBackedRootNodeSource) getDependency().getFrom().getRootNode()
        .getNodeSource()).getAggregatedDependencyResolver();
  }
}
