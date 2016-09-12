package org.slizaa.hierarchicalgraph.impl;

import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGCoreDependencyImpl extends HGCoreDependencyImpl {

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Future<?> onResolveAggregatedCoreDependency() {

    //
    if (this.aggregatedCoreDependencyResolved) {
      return null;
    }

    //
    this.aggregatedCoreDependencyResolved = true;

    //
    IAggregatedCoreDependencyResolver resolver = getFrom().getRootNode().getAggregatedCoreDependencyResolver();

    //
    if (resolver == null) {
      return null;
    }

    //
    return resolver.createNewAggregatedDependencyResolver(this);
  }
}
