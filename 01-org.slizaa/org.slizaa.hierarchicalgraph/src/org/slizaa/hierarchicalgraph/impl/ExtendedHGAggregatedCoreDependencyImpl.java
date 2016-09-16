package org.slizaa.hierarchicalgraph.impl;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGAggregatedCoreDependencyImpl extends HGAggregatedCoreDependencyImpl {

  /**
   * {@inheritDoc}
   */
  @Override
  public HGRootNode getRootNode() {
    return getFrom().getRootNode();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void resolveAggregatedCoreDependencies() {

    //
    if (this.resolved) {
      return;
    }

    //
    // get the future
    Future<?> future = onResolveAggregatedCoreDependency();
    if (future != null) {
      try {
        future.get();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } catch (ExecutionException e) {
        throw new RuntimeException(e);
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Future<?> onResolveAggregatedCoreDependency() {

    //
    if (this.resolved) {
      return null;
    }

    //
    this.resolved = true;

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
