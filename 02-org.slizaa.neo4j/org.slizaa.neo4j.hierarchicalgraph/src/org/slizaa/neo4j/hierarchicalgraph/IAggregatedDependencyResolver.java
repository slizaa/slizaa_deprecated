package org.slizaa.neo4j.hierarchicalgraph;

import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGCoreDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IAggregatedDependencyResolver {

  /**
   * <p>
   * </p>
   *
   * @param dependencyToResolve
   */
  Future<?> createNewAggregatedDependencyResolver(HGCoreDependency dependencyToResolve);
}
