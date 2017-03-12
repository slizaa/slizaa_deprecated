package org.slizaa.ui.xref.internal;

import java.util.Set;
import java.util.stream.Collectors;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.NodeSelections;

public class ReferencedNodesPart extends AbstractRefNodesPart {

  protected Set<HGNode> getNodesToShow() {
    return NodeSelections.getAccumulatedOutgoingCoreDependencies(getCurrentSelection()).stream().map(dep -> dep.getTo())
        .collect(Collectors.toSet());
  }
}
