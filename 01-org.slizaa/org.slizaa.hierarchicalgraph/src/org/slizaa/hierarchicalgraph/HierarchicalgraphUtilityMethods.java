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
  public static boolean containsUnresolvedProxyDependencies(List<AbstractHGDependency> dependencies) {

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
          if (coreDependency instanceof HGProxyDependency
              && !((HGProxyDependency) coreDependency).isResolved()) {
            return true;
          }
        }
      }

      // HGProxyDependency
      if (dependency instanceof HGProxyDependency) {
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
  public static void resolveProxyDependencies(List<AbstractHGDependency> dependencies,
      IProgressMonitor progressMonitor) {

    checkNotNull(dependencies);

    //
    List<HGProxyDependency> proxyDependencies = new ArrayList<>();

    //
    for (AbstractHGDependency dependency : dependencies) {
      if (dependency instanceof HGAggregatedDependency) {
        HGAggregatedDependency aggregatedDependency = (HGAggregatedDependency) dependency;
        for (HGCoreDependency coreDependency : aggregatedDependency.getCoreDependencies()) {
          if (coreDependency instanceof HGProxyDependency
              && !((HGProxyDependency) coreDependency).isResolved()) {
            proxyDependencies.add(((HGProxyDependency) coreDependency));
          }
        }
      }
      if (dependency instanceof HGProxyDependency) {
        proxyDependencies.add(((HGProxyDependency) dependency));
      }
    }

    //
    Utilities.resolveProxyDependencies(proxyDependencies, progressMonitor);
  }
}
