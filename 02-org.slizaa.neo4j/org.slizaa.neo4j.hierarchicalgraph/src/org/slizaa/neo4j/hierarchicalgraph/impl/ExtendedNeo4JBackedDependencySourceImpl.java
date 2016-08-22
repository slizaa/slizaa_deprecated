package org.slizaa.neo4j.hierarchicalgraph.impl;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

import com.google.gson.JsonObject;

public class ExtendedNeo4JBackedDependencySourceImpl extends Neo4JBackedDependencySourceImpl {

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
    JsonObject jsonObject = getJQAssistantRemoteService().getNodeProperties((long) getIdentifier());

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

    //
    Neo4JBackedRootNodeSource rootNodeSource = (Neo4JBackedRootNodeSource) getDependency().getFrom().getRootNode()
        .getNodeSource();

    //
    return (INeo4JRepository) rootNodeSource.getRepository();
  }
}
