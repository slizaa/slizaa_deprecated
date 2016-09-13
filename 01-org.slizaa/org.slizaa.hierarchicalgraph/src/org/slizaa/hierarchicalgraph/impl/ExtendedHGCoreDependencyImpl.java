package org.slizaa.hierarchicalgraph.impl;

import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGCoreDependencyImpl extends HGCoreDependencyImpl {

  /**
   * {@inheritDoc}
   */
  @Override
  public HGRootNode getRootNode() {
    return getFrom().getRootNode();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Future<?> onResolveAggregatedCoreDependency() {

    //
    if (!this.aggregatedCoreDependency || this.aggregatedCoreDependencyResolved) {
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
    return resolver.resolveAggregatedDependency(this);
  }
}
