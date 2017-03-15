package org.slizaa.ui.xref.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

public class StructuredSelectionUtils {

  @SuppressWarnings("unchecked")
  static List<HGNode> selectedNodes(IStructuredSelection structuredSelection) {
    return (List<HGNode>) structuredSelection.toList().stream().filter((e) -> e instanceof HGNode)
        .collect(Collectors.toList());
  }

  @SuppressWarnings("unchecked")
  static List<HGCoreDependency> selectedOutGoingCoreDependencies(IStructuredSelection structuredSelection) {
    return (List<HGCoreDependency>) structuredSelection.toList().stream().filter((e) -> e instanceof HGNode)
        .flatMap((node) -> ((HGNode) node).getAccumulatedOutgoingCoreDependencies().stream())
        .collect(Collectors.toList());
  }

  @SuppressWarnings("unchecked")
  static List<HGCoreDependency> selectedIncomingCoreDependencies(IStructuredSelection structuredSelection) {
    return (List<HGCoreDependency>) structuredSelection.toList().stream().filter((e) -> e instanceof HGNode)
        .flatMap((node) -> ((HGNode) node).getAccumulatedIncomingCoreDependencies().stream())
        .collect(Collectors.toList());
  }

  @SuppressWarnings("unchecked")
  static List<HGNode> selectedNodes(List<?> selectedElements) {
    return (List<HGNode>) checkNotNull(selectedElements).stream().filter((e) -> e instanceof HGNode)
        .collect(Collectors.toList());
  }

  static List<HGCoreDependency> selectedOutGoingCoreDependencies(List<?> selectedElements) {
    return (List<HGCoreDependency>) checkNotNull(selectedElements).stream().filter((e) -> e instanceof HGNode)
        .flatMap((node) -> ((HGNode) node).getAccumulatedOutgoingCoreDependencies().stream())
        .collect(Collectors.toList());
  }

  static List<HGCoreDependency> selectedIncomingCoreDependencies(List<?> selectedElements) {
    return (List<HGCoreDependency>) checkNotNull(selectedElements).stream().filter((e) -> e instanceof HGNode)
        .flatMap((node) -> ((HGNode) node).getAccumulatedIncomingCoreDependencies().stream())
        .collect(Collectors.toList());
  }

}
