package org.slizaa.ui.xref;

import static com.google.common.base.Preconditions.checkNotNull;

import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;

public class XRefUtils {

  public static final NodeSelection getOrCreateFilteredNodeSelection(HGRootNode rootNode) {

    //
    if (!checkNotNull(rootNode).hasExtension(Constants.XREF_MAIN_FILTER, NodeSelection.class)) {

      //
      NodeSelection nodeSelection = SelectionFactory.eINSTANCE.createNodeSelection();

      //
      rootNode.registerExtension(Constants.XREF_MAIN_FILTER, nodeSelection);
    }

    return rootNode.getExtension(Constants.XREF_MAIN_FILTER, NodeSelection.class);
  }
}
