package org.slizaa.hierarchicalgraph;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.slizaa.hierarchicalgraph.impl.Utilities;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class HierarchicalgraphUtilityMethods {

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   * @return
   */
  public static void addAdapter(Collection<? extends AbstractHGDependency> dependencies, Adapter adapter) {
    checkNotNull(dependencies);
    checkNotNull(adapter);
    
    //
    for (AbstractHGDependency dep : dependencies) {
      dep.eAdapters().add(adapter);
    }
  }
  
  public static void removeAdapter(Collection<? extends AbstractHGDependency> dependencies, Adapter adapter) {
    checkNotNull(dependencies);
    checkNotNull(adapter);
    
    //
    for (AbstractHGDependency dep : dependencies) {
      dep.eAdapters().remove(adapter);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   * @return
   */
  public static boolean containsUnresolvedAggregatedCoreDependencies(List<AbstractHGDependency> dependencies) {

    //
    if (dependencies == null) {
      return false;
    }

    //
    for (AbstractHGDependency dependency : dependencies) {

      // HGAggregatedDependency
      if (dependency instanceof HGAggregatedDependency) {
        HGAggregatedDependency aggregatedDependency = (HGAggregatedDependency) dependency;
        for (HGCoreDependency coreDependency : aggregatedDependency.getCoreDependencies()) {
          if (coreDependency instanceof HGAggregatedCoreDependency
              && !((HGAggregatedCoreDependency) coreDependency).isResolved()) {
            return true;
          }
        }
      }

      // HGAggregatedCoreDependency
      if (dependency instanceof HGAggregatedCoreDependency) {
        return true;
      }
    }

    //
    return false;
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   */
  public static void resolveAggregatedCoreDependencies(List<AbstractHGDependency> dependencies,
      IProgressMonitor progressMonitor) {

    checkNotNull(dependencies);

    //
    List<HGAggregatedCoreDependency> aggregatedCoreDependencies = new ArrayList<>();

    //
    for (AbstractHGDependency dependency : dependencies) {
      if (dependency instanceof HGAggregatedDependency) {
        HGAggregatedDependency aggregatedDependency = (HGAggregatedDependency) dependency;
        for (HGCoreDependency coreDependency : aggregatedDependency.getCoreDependencies()) {
          if (coreDependency instanceof HGAggregatedCoreDependency
              && !((HGAggregatedCoreDependency) coreDependency).isResolved()) {
            aggregatedCoreDependencies.add(((HGAggregatedCoreDependency) coreDependency));
          }
        }
      }
      if (dependency instanceof HGAggregatedCoreDependency) {
        aggregatedCoreDependencies.add(((HGAggregatedCoreDependency) dependency));
      }
    }

    //
    Utilities.resolveAggregatedCoreDependencies(aggregatedCoreDependencies, progressMonitor);
  }
}
