package org.slizaa.hierarchicalgraph.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGAggregatedDependencyImpl extends HGAggregatedDependencyImpl {

  public void invalidate() {
    if (coreDependencies != null) {
      coreDependencies.clear();
    }
    initialized = false;
  }

  /**
   * <p>
   * </p>
   */
  public void initialize() {

    //
    if (initialized) {
      return;
    }

    if (coreDependencies == null) {
      coreDependencies = new EObjectResolvingEList<HGCoreDependency>(HGCoreDependency.class, this,
          HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES);
    }

    // add all incoming dependencies directly from the specified node
    if (((HGNodeImpl) to).incomingCoreDependenciesMap != null
        && ((HGNodeImpl) to).incomingCoreDependenciesMap.containsKey((HGNodeImpl) from)) {

      //
      coreDependencies.addAll(((HGNodeImpl) to).incomingCoreDependenciesMap.get((HGNodeImpl) from));
    }

    // add all incoming dependencies from successors of the specified node
    coreDependencies.addAll(((HGNodeImpl) to).getIncomingCoreDependencies(true).stream()
        .filter((dep) -> ((HGNodeImpl) from).isPredecessorOf(dep.getFrom())).collect(Collectors.toList()));

    //
    initialized = true;
  }

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
  public List<HGCoreDependency> getCoreDependencies() {
    
    initialize();

    return coreDependencies;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getAggregatedWeight() {

    //
    initialize();

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
    initialize();

    //
    List<Future<?>> futures = new ArrayList<>();
    List<HGCoreDependency> coreDependencies = new ArrayList(getCoreDependencies());

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
