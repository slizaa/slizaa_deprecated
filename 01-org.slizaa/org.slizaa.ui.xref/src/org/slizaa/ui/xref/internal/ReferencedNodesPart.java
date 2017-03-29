package org.slizaa.ui.xref.internal;

import java.util.Set;
import java.util.stream.Collectors;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.ProxyDependencyUtilities;
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
    ProxyDependencyUtilities.resolveProxyDependencies(getCurrentSelection(), false, true, null);
    
    //
    return NodeSelections.getAccumulatedOutgoingCoreDependencies(getCurrentSelection()).stream().map(dep -> dep.getTo())
        .collect(Collectors.toSet());
  }
}
