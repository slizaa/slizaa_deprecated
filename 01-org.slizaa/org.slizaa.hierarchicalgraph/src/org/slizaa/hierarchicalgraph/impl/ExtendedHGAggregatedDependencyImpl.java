package org.slizaa.hierarchicalgraph.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

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
  public HGRootNode getRootNode() {
    return getFrom().getRootNode();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getAggregatedWeight() {

    //
    if (this.coreDependencies == null) {
      return 0;
    }

    //
    return this.coreDependencies.stream().mapToInt(i -> i.getWeight()).sum();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void resolveAggregatedCoreDependencies() {

    //
    List<Future<?>> futures = new ArrayList<>();
    List<HGCoreDependency> coreDependencies = getCoreDependencies();

    //
    for (HGCoreDependency coreDependency : coreDependencies) {
      if (coreDependency instanceof ExtendedHGCoreDependencyImpl) {
        if (coreDependency.isAggregatedCoreDependency()) {
          // get the future
          Future<?> future = ((ExtendedHGCoreDependencyImpl) coreDependency).onResolveAggregatedCoreDependency();
          if (future != null) {
            futures.add(future);
          }
        }
      } else {
        // should not happen here...
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

    //
    List<HGNode> nodesToInvalidate = new ArrayList<HGNode>();
    for (HGCoreDependency hgCoreDependency : coreDependencies) {
      nodesToInvalidate.add(hgCoreDependency.getFrom());
      nodesToInvalidate.add(hgCoreDependency.getTo());
    }
    getRootNode().invalidateCaches(nodesToInvalidate);
  }
}
