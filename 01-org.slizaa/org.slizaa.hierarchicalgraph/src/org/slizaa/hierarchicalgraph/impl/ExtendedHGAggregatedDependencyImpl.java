package org.slizaa.hierarchicalgraph.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGCoreDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGAggregatedDependencyImpl extends HGAggregatedDependencyImpl {

  /**
   * {@inheritDoc}
   */
  @Override
  public int getAggregatedWeight() {
    return this.coreDependencies != null ? this.coreDependencies.size() : 0;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void resolveAggregatedCoreDependencies() {

    //
    List<Future<?>> futures = new ArrayList<>();

    //
    for (HGCoreDependency coreDependency : getCoreDependencies()) {

      //
      if (coreDependency instanceof ExtendedHGCoreDependencyImpl) {
        Future<?> future = ((ExtendedHGCoreDependencyImpl) coreDependency).onResolveAggregatedCoreDependency();
        if (future != null) {
          futures.add(future);
        }
      }
      
      //
      else {
        throw new RuntimeException("Wrong subclass!");
      }
    }

    // wait for completion the result
    for (Future<?> future : futures) {
      try {
        future.get();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } catch (ExecutionException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
