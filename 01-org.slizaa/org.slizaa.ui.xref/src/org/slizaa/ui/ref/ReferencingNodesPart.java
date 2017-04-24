package org.slizaa.ui.ref;

import java.util.Set;
import java.util.stream.Collectors;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.ProxyDependencyFunctions;
import org.slizaa.hierarchicalgraph.selection.NodeSelections;

public class ReferencingNodesPart extends AbstractRefNodesPart {

  protected Set<HGNode> getNodesToShow() {
    
    //
    ProxyDependencyFunctions.resolveProxyDependencies(getCurrentSelection(), true, false, null);
    
    //
    return NodeSelections.getAccumulatedIncomingCoreDependencies(getCurrentSelection()).stream()
        .map(dep -> dep.getFrom()).collect(Collectors.toSet());
  }
}
