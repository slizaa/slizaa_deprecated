package org.slizaa.hierarchicalgraph.impl;

import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.removeDependency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class Utilities {

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   */
  public static void resolveAggregatedCoreDependencies(HGCoreDependency... dependencies) {
    resolveAggregatedCoreDependencies(Arrays.asList(dependencies));
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   */
  public static void resolveAggregatedCoreDependencies(List<? extends HGCoreDependency> dependencies) {

    //
    if (dependencies == null || dependencies.isEmpty()) {
      return;
    }

    //
    if (!dependencies.get(0).getRootNode().hasExtension(IAggregatedCoreDependencyResolver.class)) {
      return;
    }

    //
    List<Future<?>> futures = new ArrayList<>();
    List<HGCoreDependency> coreDependencies = new ArrayList<>(dependencies);
    List<ExtendedHGAggregatedCoreDependencyImpl> newlyResolvedAggregatedCoreDependencies = new ArrayList<>();

    //
    for (HGCoreDependency coreDependency : coreDependencies) {
      if (coreDependency instanceof ExtendedHGAggregatedCoreDependencyImpl
          && !((ExtendedHGAggregatedCoreDependencyImpl) coreDependency).isResolved()) {

        //
        newlyResolvedAggregatedCoreDependencies.add((ExtendedHGAggregatedCoreDependencyImpl) coreDependency);

        // get the future
        Future<?> future = ((ExtendedHGAggregatedCoreDependencyImpl) coreDependency)
            .onResolveAggregatedCoreDependency();
        if (future != null) {
          futures.add(future);
        }
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
    for (ExtendedHGAggregatedCoreDependencyImpl dep : newlyResolvedAggregatedCoreDependencies) {

      if (!dep.getResolvedCoreDependencies().isEmpty()) {
        removeDependency(dep, true);
      }

      //
      else {
        System.out.println("*****************************************************************************************");
        System.out.println("** WARNING: Aggregated Dependency has been resolved to ZERO core dependencies!         **");
        System.out.println("** " + dep.getFrom().getIdentifier() + " : " + dep.getTo().getIdentifier() + " **");
        System.out.println("*****************************************************************************************");
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static Optional<ExtendedHGNodeTrait> getTrait(HGNode hgNode) {

    // handle ExtendedHGNodeImpl
    if (hgNode instanceof ExtendedHGNodeImpl) {
      return Optional.of(((ExtendedHGNodeImpl) hgNode).getTrait());
    }
    // handle ExtendedHGRootNodeImpl
    else if (hgNode instanceof ExtendedHGRootNodeImpl) {
      return Optional.of(((ExtendedHGRootNodeImpl) hgNode).getTrait());
    }
    // should not happen
    return Optional.empty();
  }
}
