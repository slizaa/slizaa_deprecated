package org.slizaa.hierarchicalgraph.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
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
  public EList<HGCoreDependency> getCoreDependencies() {
    return ECollections.unmodifiableEList(this.dependencies);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getAggregatedWeight() {
    return this.dependencies != null ? this.dependencies.size() : 0;
  }

  // /**
  // * {@inheritDoc}
  // */
  // @Override
  // public void resolveAggregatedCoreDependencies() {
  //
  // //
  // List<Future<?>> futures = new ArrayList<>();
  //
  // //
  // if (DependencyType.AGGREGATED_DEPENDENCY.equals(getType())) {
  // for (HGDependency hgDependency : getCoreDependencies()) {
  // Future<?> future = hgDependency.getDependencySource().onResolveAggregatedCoreDependency();
  // if (future != null) {
  // futures.add(future);
  // }
  // }
  // } else if (DependencyType.AGGREGATED_CORE_DEPENDENCY.equals(getType())) {
  // Future<?> future = dependencySource.onResolveAggregatedCoreDependency();
  // if (future != null) {
  // futures.add(future);
  // }
  // }
  //
  // // wait for completion the result
  // for (Future<?> future : futures) {
  // try {
  // future.get();
  // } catch (InterruptedException e) {
  // e.printStackTrace();
  // } catch (ExecutionException e) {
  // e.printStackTrace();
  // }
  // }
  // }
}
