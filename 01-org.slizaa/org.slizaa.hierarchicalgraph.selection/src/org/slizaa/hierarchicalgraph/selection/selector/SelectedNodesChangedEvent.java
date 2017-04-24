package org.slizaa.hierarchicalgraph.selection.selector;

import org.slizaa.hierarchicalgraph.SourceOrTarget;

public class SelectedNodesChangedEvent {

  private SourceOrTarget _selectedNodesType;

  public SelectedNodesChangedEvent(SourceOrTarget selectedNodesType) {
    _selectedNodesType = selectedNodesType;
  }

  public boolean hasSelectedNodes() {
    return _selectedNodesType != null;
  }

  public SourceOrTarget getSelectedNodesType() {
    return _selectedNodesType;
  }
}
