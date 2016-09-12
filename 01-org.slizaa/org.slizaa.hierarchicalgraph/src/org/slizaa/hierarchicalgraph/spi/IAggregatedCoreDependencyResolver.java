package org.slizaa.hierarchicalgraph.spi;

import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGCoreDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IAggregatedCoreDependencyResolver {

  /**
   * <p>
   * </p>
   *
   * @param dependencyToResolve
   */
  Future<?> createNewAggregatedDependencyResolver(HGCoreDependency dependencyToResolve);
}
