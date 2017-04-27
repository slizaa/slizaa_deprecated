package org.slizaa.ui.xref;

import static com.google.common.base.Preconditions.checkNotNull;

import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.hierarchicalgraph.selection.SelectionHolder;

public class XRefUtils {

  public static final SelectionHolder<NodeSelection> getOrCreateFilteredNodeSelectionHolder(HGRootNode rootNode) {

    //
    if (!checkNotNull(rootNode).hasExtension(Constants.XREF_MAIN_FILTER, SelectionHolder.class)) {

      //
      SelectionHolder selectionHolder = SelectionFactory.eINSTANCE.createSelectionHolder();
      
      //
      NodeSelection nodeSelection = SelectionFactory.eINSTANCE.createNodeSelection();
      selectionHolder.setSelection(nodeSelection);

      //
      rootNode.registerExtension(Constants.XREF_MAIN_FILTER, selectionHolder);
    }

    return rootNode.getExtension(Constants.XREF_MAIN_FILTER, SelectionHolder.class);
  }
}
