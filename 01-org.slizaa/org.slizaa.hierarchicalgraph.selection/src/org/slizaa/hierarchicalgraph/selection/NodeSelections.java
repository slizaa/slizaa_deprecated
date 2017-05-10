package org.slizaa.hierarchicalgraph.selection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

public class NodeSelections {

  /**
   * <p>
   * </p>
   *
   * @param elements
   * @return
   */
  public static Set<HGNode> computeNodesWithParents(Collection<HGNode> nodes, boolean includeChildren) {
    
    // TODO rework
    Set<HGNode> result = new HashSet<>(checkNotNull(nodes));
    nodes.forEach((n) -> {
      result.addAll(n.getPredecessors());
      if (includeChildren) {
        EcoreUtil.getAllContents(n, false).forEachRemaining((child) -> {
          if (child instanceof HGNode) {
            result.add((HGNode) child);
          }
        });
      }
    });
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param nodes
   * @return
   */
  public static Set<HGCoreDependency> getAccumulatedOutgoingCoreDependencies(Collection<HGNode> nodes) {
    return checkNotNull(nodes).stream().flatMap(node -> node.getAccumulatedOutgoingCoreDependencies().stream())
        .collect(Collectors.toSet());
  }

  /**
   * <p>
   * </p>
   *
   * @param nodes
   * @return
   */
  public static Set<HGCoreDependency> getAccumulatedIncomingCoreDependencies(Collection<HGNode> nodes) {
    return checkNotNull(nodes).stream().flatMap(node -> node.getAccumulatedIncomingCoreDependencies().stream())
        .collect(Collectors.toSet());
  }
}
