package org.slizaa.ui.ref;

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
  protected Set<HGNode> getNodesToShow() {
    
    //
    ProxyDependencyFunctions.resolveProxyDependencies(getCurrentSelection(), false, true, null);
    
    //
    return NodeSelections.getAccumulatedOutgoingCoreDependencies(getCurrentSelection()).stream().map(dep -> dep.getTo())
        .collect(Collectors.toSet());
  }
}
