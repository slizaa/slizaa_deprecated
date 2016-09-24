package org.slizaa.hierarchicalgraph.impl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGAggregatedDependencyImpl extends HGAggregatedDependencyImpl {

  /**
   * <p>
   * </p>
   *
   * @param keyExtractor
   * @return
   */
  public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
    Map<Object, Boolean> seen = new ConcurrentHashMap<>();
    return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
  }

  /** - */
  private boolean                 initialized = false;

  /** - */
  private EList<HGCoreDependency> coreDependencies;

  /**
   * <p>
   * Invalidates the contained core dependencies.
   * </p>
   */
  public void invalidate() {

    // return immediately if this dependency already has been uninitialized
    if (!initialized) {
      return;
    }

    // set initialized to false
    initialized = false;
  }

  /**
   * <p>
   * </p>
   */
  public void initialize() {

    // return immediately if this dependency already has been initialized
    if (initialized) {
      return;
    }

    // lazy create the core dependencies list
    if (coreDependencies == null) {
      coreDependencies = new EObjectEListWithoutUniqueCheck<HGCoreDependency>(HGCoreDependency.class, this,
          HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES);
    }

    //
    ExtendedHierarchicalGraphHelper.getTrait(to).ifPresent((trait) -> {

      List<HGCoreDependency> prototypeList = trait.getAccumulatedIncomingCoreDependencies().stream()
          .filter((dep) -> from.equals(dep.getFrom()) || from.isPredecessorOf(dep.getFrom()))
          .collect(Collectors.toList());

      // add all incoming dependencies from successors of the specified node
      ECollections.setEList(coreDependencies, prototypeList);

      // compute the aggregated weight
      int weightOfSimpleDependencies = prototypeList.stream()
          .filter((dep) -> (dep.getAggregatedCoreDependencyParent() == null)).mapToInt(coreDep -> coreDep.getWeight())
          .sum();

      // weightOfResovedCoreDependencies
      int weightOfResovedCoreDependencies = prototypeList.stream()
          .filter((dep) -> (dep.getAggregatedCoreDependencyParent() != null))
          .map(coreDep -> coreDep.getAggregatedCoreDependencyParent()).distinct()
          .mapToInt(coreDep -> coreDep.getWeight()).sum();

      setNewAggregatedWeight(weightOfSimpleDependencies + weightOfResovedCoreDependencies);
    });

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
  public EList<HGCoreDependency> getCoreDependencies() {

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
    return aggregatedWeight;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void resolveAggregatedCoreDependencies() {

    //
    initialize();

    //
    ExtendedHierarchicalGraphHelper.resolveAggregatedCoreDependencies(this.coreDependencies);
  }

  /**
   * <p>
   * </p>
   *
   * @param newAggregatedWeight
   */
  private void setNewAggregatedWeight(int newAggregatedWeight) {
    if (newAggregatedWeight != aggregatedWeight) {
      int oldAggregatedWeight = aggregatedWeight;
      aggregatedWeight = newAggregatedWeight;
      if (eNotificationRequired()) {
        eNotify(new ENotificationImpl(this, Notification.SET,
            HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__AGGREGATED_WEIGHT, oldAggregatedWeight,
            newAggregatedWeight));
      }
    }
  }

}
