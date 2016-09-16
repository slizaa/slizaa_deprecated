package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHierarchicalGraphHelper {

  /** - */
  public static final Predicate<HGCoreDependency> FILTER_REMOVE_RESOLVED_AGGREGATED_CORE_DEPENDENCIES               = (
      dep) -> {
                                                                                                                      return !(dep instanceof HGAggregatedCoreDependency)
                                                                                                                          || !(((HGAggregatedCoreDependency) dep)
                                                                                                                              .isResolved());
                                                                                                                    };

  /** - */
  public static final Predicate<HGCoreDependency> FILTER_REMOVE_CORE_DEPENDENCIES_FROM_AGGREGATED_CORE_DEPENDENCIES = (
      dep) -> {
                                                                                                                      return (dep instanceof HGAggregatedCoreDependency
                                                                                                                          || dep
                                                                                                                              .getAggregatedCoreDependencyParent() == null);
                                                                                                                    };

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   */
  public static void resolveAggregatedCoreDependencies(List<HGCoreDependency> dependencies) {

    //
    if (dependencies == null || dependencies.isEmpty()) {
      return;
    }

    //
    List<Future<?>> futures = new ArrayList<>();
    List<HGCoreDependency> coreDependencies = new ArrayList<>(dependencies);

    //
    for (HGCoreDependency coreDependency : coreDependencies) {
      if (coreDependency instanceof ExtendedHGAggregatedCoreDependencyImpl) {

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
    EList<HGNode> nodesToInvalidate = new BasicEList<HGNode>();
    for (HGCoreDependency hgCoreDependency : coreDependencies) {
      nodesToInvalidate.add(hgCoreDependency.getFrom());
      nodesToInvalidate.add(hgCoreDependency.getTo());
    }

    //
    coreDependencies.get(0).getRootNode().invalidateCaches(nodesToInvalidate);
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   * @return
   */
  public static List<HGCoreDependency> filterAggregatedCoreDependencies(List<HGCoreDependency> dependencies) {
    checkNotNull(dependencies);

    return dependencies.stream().filter(FILTER_REMOVE_RESOLVED_AGGREGATED_CORE_DEPENDENCIES)
        .collect(Collectors.toList());
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

  /**
   * <p>
   * </p>
   *
   * @param map
   * @return
   */
  public static EList<HGCoreDependency> flattenCoreDependencies(EMap<?, EList<HGCoreDependency>> map) {

    //
    if (map == null) {
      return ECollections.emptyEList();
    }

    //
    List<HGCoreDependency> result = new ArrayList<>();
    for (List<HGCoreDependency> dependencies : map.values()) {
      result.addAll(dependencies);
    }

    //
    return ECollections.unmodifiableEList(result);
  }
}
