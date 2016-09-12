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

  // /**
  // * {@inheritDoc}
  // */
  // @Override
  // public EList<HGDependency> getCoreDependencies() {
  // EList<HGDependency> result = new BasicEList<HGDependency>();
  // getLeafDependencies(result);
  // return result;
  // }
  //
  // /**
  // * {@inheritDoc}
  // */
  // @Override
  // public int getWeight() {
  // //
  // if (this.dependencies != null && !this.dependencies.isEmpty()) {
  // return DependencyType.CORE_DEPENDENCY.equals(this.getType()) ? this.dependencies.size() + 1
  // : this.dependencies.size();
  // } else {
  // return DependencyType.CORE_DEPENDENCY.equals(this.getType()) ? 1 : 0;
  // }
  // }
  //
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
  //
  // /**
  // * <p>
  // * </p>
  // *
  // * @param leafDependencies
  // */
  // private void getLeafDependencies(Collection<HGDependency> leafDependencies) {
  //
  // // AGGREGATED_CORE_DEPENDENCY
  // if (DependencyType.CORE_DEPENDENCY.equals(this.getType())
  // || (DependencyType.AGGREGATED_CORE_DEPENDENCY.equals(this.getType()) /* && !resolved */)) {
  // leafDependencies.add(this);
  // }
  //
  // //
  // else {
  // if (this.dependencies != null) {
  // for (HGDependency dependency : this.dependencies) {
  // ((ExtendedHGCoreDependencyImpl) dependency).getLeafDependencies(leafDependencies);
  // }
  // }
  // }
  // }

}
