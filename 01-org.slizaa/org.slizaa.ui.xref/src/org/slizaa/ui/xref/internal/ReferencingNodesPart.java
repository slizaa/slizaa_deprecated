package org.slizaa.ui.xref.internal;

import java.util.List;
import java.util.stream.Collectors;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.NodeSelections;

public class ReferencingNodesPart extends AbstractRefNodesPart {

  protected List<HGNode> getNodesToShow() {
    return NodeSelections.getAccumulatedIncomingCoreDependencies(getCurrentSelection()).stream()
        .map(dep -> dep.getFrom()).collect(Collectors.toList());
  }
}
