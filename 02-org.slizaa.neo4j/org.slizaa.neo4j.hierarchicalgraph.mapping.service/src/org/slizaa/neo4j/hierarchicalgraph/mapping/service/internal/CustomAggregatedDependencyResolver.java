package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;
import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;

public class CustomAggregatedDependencyResolver implements IAggregatedCoreDependencyResolver {

  // TODO!
  public static final String DETAIL_QUERY = "MATCH (n1)-[rel]->(n2) " + "WHERE id(n1) in {from} "
      + "AND id(n2) in {to} " + "AND ( " + "(n1:Type)-[rel:EXTENDS|:IMPLEMENTS]->(n2:Type) OR "
      + "(n1:Method)-[rel:INVOKES]->(n2:Method) OR " + "(n1:Method)-[rel:READS|:WRITES]->(n2:Field) OR "
      + "(n1:Field)-[rel:OF_TYPE]->(n2:Type) OR " + "(n1:Method)-[rel:THROWS]->(n2:Type) OR "
      + "(n1:Method)-[rel:RETURNS]->(n2:Type) OR " + "(n1:Method)-[rel:RETURNS]->(n2:Type) " + ") "
      + "RETURN id(n1), id(n2), id(rel), type(rel)";

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> resolveAggregatedDependency(final HGAggregatedCoreDependency dependency) {

    Set<Object> fromNodes = new HashSet<>();
    Set<Object> toNodes = new HashSet<>();

    //
    for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(dependency.getFrom())); iter.hasNext();) {
      Object containedElement = iter.next();
      if (containedElement instanceof HGNode) {
        fromNodes.add(((HGNode) containedElement).getIdentifier());
      }
    }

    for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(dependency.getTo())); iter.hasNext();) {
      Object containedElement = iter.next();
      if (containedElement instanceof HGNode) {
        toNodes.add(((HGNode) containedElement).getIdentifier());
      }
    }

    //
    Map<String, String> params = new HashMap<>();
    params.put("from", fromNodes.toString());
    params.put("to", toNodes.toString());

    //
    INeo4JRepository neo4jRepository = dependency.getRootNode().getExtension(INeo4JRepository.class);
    return neo4jRepository.executeCypherQuery(DETAIL_QUERY, params, (queryResult) -> {
      // JsonArray jsonArray = queryResult.getAsJsonArray("data");
      // if (jsonArray.size() > 0) {
      // List<HGCoreDependency> coreDependencies = createDependencies(jsonArray, dependency.getRootNode(),
      // HierarchicalgraphMappingServiceImpl.createDependencySourceFunction, false, false, null);
      // dependency.getResolvedCoreDependencies().addAll(coreDependencies);
      // }
    });
  }
}
