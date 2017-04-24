package org.slizaa.jqassistant.internal.actions;

import java.util.List;

import org.eclipse.jface.viewers.Viewer;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.jqassistant.internal.actions.filter.AbstractFilterAction;
import org.slizaa.ui.tree.ISlizaaActionContribution;
import org.slizaa.ui.xref.XRefUtils;

@Component(service = ISlizaaActionContribution.class)
public class ResetFilterAction extends AbstractFilterAction {

  @Override
  public void execute(List<?> selection, Viewer viewer) {
    HGNode node = (HGNode) selection.get(0);
    NodeSelection nodeSelection = XRefUtils.getOrCreateFilteredNodeSelection(node.getRootNode());
    nodeSelection.getNodes().clear();
  }

  @Override
  public String getLabel(List<?> selection) {
    return "Reset Filter";
  }
}
