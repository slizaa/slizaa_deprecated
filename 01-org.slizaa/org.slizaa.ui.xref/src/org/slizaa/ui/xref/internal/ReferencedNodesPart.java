package org.slizaa.ui.xref.internal;

import java.util.List;
import java.util.stream.Collectors;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.NodeSelections;

public class ReferencedNodesPart extends AbstractRefNodesPart {
  
  protected List<HGNode> getNodesToShow() {
    return NodeSelections.getAccumulatedOutgoingCoreDependencies(getCurrentSelection()).stream()
        .map(dep -> dep.getTo()).collect(Collectors.toList());
  }
}
