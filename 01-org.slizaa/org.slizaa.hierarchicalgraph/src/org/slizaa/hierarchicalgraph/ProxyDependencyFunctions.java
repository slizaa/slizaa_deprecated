package org.slizaa.hierarchicalgraph;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.slizaa.hierarchicalgraph.impl.Utilities;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ProxyDependencyFunctions {

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   * @return
   */
  public static boolean containsUnresolvedProxyDependencies(List<? extends AbstractHGDependency> dependencies) {

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
          if (coreDependency instanceof HGProxyDependency && !((HGProxyDependency) coreDependency).isResolved()) {
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
          if (coreDependency instanceof HGProxyDependency && !((HGProxyDependency) coreDependency).isResolved()) {
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

  /**
   * <p>
   * </p>
   *
   * @param nodes
   * @param incoming
   * @param outgoing
   * @param progressMonitor
   */
  public static void resolveProxyDependencies(Collection<HGNode> nodes, boolean incoming, boolean outgoing,
      IProgressMonitor progressMonitor) {

    //
    checkNotNull(nodes);

    //
    List<HGProxyDependency> proxyDependencies = new ArrayList<>();

    //
    for (HGNode hgNode : nodes) {
      addProxyDependencies(hgNode, incoming, outgoing, proxyDependencies);
    }

    //
    Utilities.resolveProxyDependencies(proxyDependencies, progressMonitor);
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @param incoming
   * @param outgoing
   * @param proxyDependencies
   * @return
   */
  private static List<HGProxyDependency> addProxyDependencies(HGNode node, boolean incoming, boolean outgoing, List<HGProxyDependency> proxyDependencies) {

    //
    checkNotNull(node);
    checkNotNull(proxyDependencies);

    //
    if (incoming) {
      proxyDependencies.addAll(filterProxyDependencies(node.getIncomingCoreDependencies()));
      for (HGNode predecessor : node.getPredecessors()) {
        proxyDependencies.addAll(filterProxyDependencies(predecessor.getIncomingCoreDependencies()));
      }
    }

    //
    if (outgoing) {
      proxyDependencies.addAll(filterProxyDependencies(node.getOutgoingCoreDependencies()));
      for (HGNode predecessor : node.getPredecessors()) {
        proxyDependencies.addAll(filterProxyDependencies(predecessor.getOutgoingCoreDependencies()));
      }
    }

    return proxyDependencies;
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   * @return
   */
  private static List<HGProxyDependency> filterProxyDependencies(List<HGCoreDependency> dependencies) {
    return checkNotNull(dependencies).stream().filter(dep -> dep instanceof HGProxyDependency)
        .map(dep -> (HGProxyDependency) dep).collect(Collectors.toList());
  }
}
