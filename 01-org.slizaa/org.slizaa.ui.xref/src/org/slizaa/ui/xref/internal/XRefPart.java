package org.slizaa.ui.xref.internal;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XRefPart {

  /** - */
  private XRefComposite _composite;

  /** - */
  private HGRootNode    _rootNode;

  /** - */
  @Inject
  private MPerspective  _perspective;

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
    _composite = new XRefComposite(parent, _perspective.getContext());
    _composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    _composite.setRootNode(_rootNode);
    // setFilter();
  }

  @Inject
  public void handleChangedDependencies(@Optional
  @Named(SelectionIdentifier.CURRENT_ROOTNODE)
  final HGRootNode rootNode) {

    // store the root node
    _rootNode = rootNode;

    // immediately set if composite is already created
    if (_composite != null && !_composite.isDisposed()) {
      _composite.setRootNode(_rootNode);
      // setFilter();
    }
  }

  // /**
  // * <p>
  // * </p>
  // */
  // private void setFilter() {
  //
  // ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
  // Display.getDefault().getActiveShell(),
  // new WorkbenchLabelProvider(),
  // new BaseWorkbenchContentProvider());
  //
  // dialog.setTitle("Tree Selection");
  // dialog.setMessage("Select the elements from the tree:");
  // dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
  // dialog.open();
  //
  // // todo
  // List<Long> filteredNodeIds = Arrays.asList(4365l, 4336l, 4447l, 4597l, 4604l, 4197l, 84633l);
  // List<HGNode> stuff = filteredNodeIds.stream().map(id -> _rootNode.lookupNode(id)).collect(Collectors.toList());
  // _composite.setFilteredNodes(stuff);
  // _composite.refresh();
  // }
}
