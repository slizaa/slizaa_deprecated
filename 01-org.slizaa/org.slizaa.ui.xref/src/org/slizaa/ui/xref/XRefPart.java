package org.slizaa.ui.xref;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.selection.IHierarchicalGraphSelection;
import org.slizaa.selection.IHierarchicalGraphSelectionListener;
import org.slizaa.selection.IHierarchicalGraphSelectionService;
import org.slizaa.selection.INodeSelection;

public class XRefPart implements IHierarchicalGraphSelectionListener {

  /** - */
  public static final String                 XREF_ID = XRefPart.class.getName();

  /** - */
  private XRefComposite                      _composite;

  /** - */
  @Inject
  private IHierarchicalGraphSelectionService _hierarchicalGraphSelectionService;

  /**
   * <p>
   * </p>
   *
   * @param parent
   */
  @PostConstruct
  public void createComposite(Composite parent) {
    
    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    parent.setLayout(layout);

    //
    _composite = new XRefComposite(parent, XREF_ID);
    _composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    
    // create the context menu
    // createContextMenu(_viewWidget);
    _hierarchicalGraphSelectionService.addHierarchicalGraphSelectionListener(this);
  }

  @Override
  public void currentSelectionChanged(IHierarchicalGraphSelection selection) {
    initSelection(selection);
  }

  @Override
  public String getSelectionProviderId() {
    return XREF_ID;
  }

  /**
   * <p>
   * </p>
   *
   * @param selection
   */
  private void initSelection(IHierarchicalGraphSelection selection) {

    if (_composite != null) {

      //
      INodeSelection nodeSelection = selection.cast(INodeSelection.class);

      if (nodeSelection != null && !nodeSelection.getSelectedNodes().isEmpty()) {

        // get the root node
        _composite.setSelectedArtifacts(nodeSelection.getSelectedNodes());
      }
    }
  }
}
