package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

public class CustomAggregatedDependencyResolver implements IAggregatedCoreDependencyResolver {

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> resolveAggregatedDependency(HGCoreDependency dependencyToResolve) {
    
    // Set<Object> fromNodes = new HashSet<>();
    // Set<Object> toNodes = new HashSet<>();
    //
    // //
    // List<HGDependency> coreDependencies = getDependency().getCoreDependencies();
    //
    // //
    // for (HGDependency hgDependency : coreDependencies) {
    // for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(hgDependency.getFrom())); iter
    // .hasNext();) {
    // Object containedElement = iter.next();
    // if (containedElement instanceof HGNode) {
    // fromNodes.add(((HGNode) containedElement).getIdentifier());
    // }
    // }
    // for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(hgDependency.getTo())); iter.hasNext();) {
    // Object containedElement = iter.next();
    // if (containedElement instanceof HGNode) {
    // toNodes.add(((HGNode) containedElement).getIdentifier());
    // }
    // }
    // }
    //
    // //
    // Map<String, String> params = new HashMap<>();
    // params.put("from", fromNodes.toString());
    // params.put("to", toNodes.toString());
    //
    // //
    // Future<?> future = getJQAssistantRemoteService().executeCypherQuery(TEMP_HELPER.QUERY, params, (queryResult) -> {
    // // TODO
    // System.out.println(queryResult);
    // resolved = true;
    // });

    
    return null;
  }
}
