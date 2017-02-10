package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

public class CustomAggregatedDependencyResolver implements IAggregatedCoreDependencyResolver {

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Future<?>> resolveAggregatedDependency(final HGAggregatedCoreDependency dependency) {

    checkNotNull(dependency);

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
    Neo4jRestClient neo4jRepository = dependency.getRootNode().getExtension(Neo4jRestClient.class);

    //
    // TODO
    // return getDetailQueries(dependency).stream()
    // .map(query -> createFutureForQuery(neo4jRepository, dependency, query, params)).collect(Collectors.toList());
    return null;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  // TODO
  // private List<String> getDetailQueries(HGAggregatedCoreDependency dependency) {
  //
  // //
  // Optional<EList<String>> specificDetailQueries = dependency.getDependencySource(Neo4JBackedDependencySource.class)
  // .flatMap(s -> s.getUserObject(DependencyMapping.class)).map(depMap -> depMap.getDetailQueries());
  //
  // //
  // HierarchicalGraphMappingDescriptor mappingDescriptor = dependency.getRootNode()
  // .getExtension(HierarchicalGraphMappingDescriptor.class);
  //
  // //
  // return specificDetailQueries.orElse(mappingDescriptor.getDependencyMappings().get(0).getDetailQueries());
  // }

  /**
   * <p>
   * </p>
   *
   * @param neo4jRepository
   * @param dependency
   * @param query
   * @param params
   * @return
   */
  private Future<?> createFutureForQuery(Neo4jRestClient neo4jRepository, final HGAggregatedCoreDependency dependency,
      final String query, Map<String, String> params) {

    // return new future
    return neo4jRepository.executeCypherQuery(query, params, (queryResult) -> {

      //
      List<GraphFactoryFunctions.DependencyDefinition> dependencyDefinitions = Neo4jResultJsonConverter
          .extractDependencyDefinition(queryResult);

      if (dependencyDefinitions.size() > 0) {

        // create the dependencies
        List<HGCoreDependency> coreDependencies = GraphFactoryFunctions.createDependencies(dependencyDefinitions,
            dependency.getRootNode(), (id, type) -> GraphFactoryFunctions.createDependencySource(id, type), false,
            false, null);

        // and add them to the list of resolved dependencies
        dependency.getResolvedCoreDependencies().addAll(coreDependencies);
      }
    });
  }
}
