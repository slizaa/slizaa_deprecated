package org.slizaa.hierarchicalgraph.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
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
      coreDependencies = new EObjectEList<HGCoreDependency>(HGCoreDependency.class, this,
          HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES);
    }

    //
    ExtendedHierarchicalGraphHelper.getTrait(to).ifPresent((trait) -> {

      List<HGCoreDependency> prototypeList = trait.cachedIncomingSelfAndSubTreeCoreDependencies().stream()
          .filter((dep) -> from.equals(dep.getFrom()) || from.isPredecessorOf(dep.getFrom()))
          .collect(Collectors.toList());

      List<HGCoreDependency> newCoreDependencies = prototypeList.stream()
          .filter(ExtendedHierarchicalGraphHelper.FILTER_REMOVE_RESOLVED_AGGREGATED_CORE_DEPENDENCIES)
          .collect(Collectors.toList());

      // add all incoming dependencies from successors of the specified node
      ECollections.setEList(coreDependencies, newCoreDependencies);

      // compute the aggregated weight
      int newAggregatedWeight = prototypeList.stream()
          .filter(ExtendedHierarchicalGraphHelper.FILTER_REMOVE_CORE_DEPENDENCIES_FROM_AGGREGATED_CORE_DEPENDENCIES)
          .mapToInt(coreDep -> coreDep.getWeight()).sum();

      setNewAggregatedWeight(newAggregatedWeight);
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
