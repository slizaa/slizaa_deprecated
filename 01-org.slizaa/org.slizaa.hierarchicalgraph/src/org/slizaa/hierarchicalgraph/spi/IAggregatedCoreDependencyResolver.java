package org.slizaa.hierarchicalgraph.spi;

import java.util.List;
import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;

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
  List<Future<?>> resolveAggregatedDependency(HGAggregatedCoreDependency dependencyToResolve);
}
