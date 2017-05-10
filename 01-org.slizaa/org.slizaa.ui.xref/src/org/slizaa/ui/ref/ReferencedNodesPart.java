package org.slizaa.ui.ref;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.ProxyDependencyFunctions;
import org.slizaa.hierarchicalgraph.selection.NodeSelections;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ReferencedNodesPart extends AbstractRefNodesPart {

  /**
   * {@inheritDoc}
   */
  protected Set<HGNode> getNodesToShow(Collection<HGNode> selectedNodes) {

    //
    ProxyDependencyFunctions.resolveProxyDependencies(selectedNodes, false, true, null);

    //
    return NodeSelections.getAccumulatedOutgoingCoreDependencies(selectedNodes).stream().map(dep -> dep.getTo())
        .collect(Collectors.toSet());
  }
}
