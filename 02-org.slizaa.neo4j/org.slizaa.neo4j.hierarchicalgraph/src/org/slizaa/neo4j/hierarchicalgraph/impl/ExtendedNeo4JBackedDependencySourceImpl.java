package org.slizaa.neo4j.hierarchicalgraph.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;
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

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> onResolveAggregatedCoreDependency() {

    //
    if (resolved) {
      return null;
    }

    //
    Set<Object> fromNodes = new HashSet<>();
    Set<Object> toNodes = new HashSet<>();

    //
    List<HGDependency> coreDependencies = getDependency().getCoreDependencies();

    //
    for (HGDependency hgDependency : coreDependencies) {
      for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(hgDependency.getFrom())); iter
          .hasNext();) {
        Object containedElement = iter.next();
        if (containedElement instanceof HGNode) {
          fromNodes.add(((HGNode) containedElement).getIdentifier());
        }
      }
      for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(hgDependency.getTo())); iter.hasNext();) {
        Object containedElement = iter.next();
        if (containedElement instanceof HGNode) {
          toNodes.add(((HGNode) containedElement).getIdentifier());
        }
      }
    }

    //
    Map<String, String> params = new HashMap<>();
    params.put("from", fromNodes.toString());
    params.put("to", toNodes.toString());

    //
    Future<?> future = getJQAssistantRemoteService().executeCypherQuery(TEMP_HELPER.QUERY, params, (queryResult) -> {
      // TODO
      System.out.println(queryResult);
      resolved = true;
    });

    //
    return future;
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
    return (INeo4JRepository) ((Neo4JBackedRootNodeSource) getDependency().getFrom().getRootNode().getNodeSource())
        .getRepository();
  }
}
