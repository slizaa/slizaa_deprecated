package org.slizaa.ui.xref.internal;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.NodeSelections;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.ui.shared.context.RootObject;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;
import org.slizaa.ui.tree.VisibleNodesFilter;

public abstract class AbstractRefNodesPart {

  /** - */
  private TreeViewer   _treeViewer;

  /** - */
  private HGRootNode   _currentRootNode;

  /** - */
  private Set<HGNode> _currentSelectedNodes;

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
    _treeViewer = createTreeViewer(parent);

    //
    setSelection();
  }

  @Inject
  public void handleChangedDependencies(@Optional
  @Named(SelectionIdentifier.CURRENT_ROOTNODE)
  final HGRootNode rootNode, @Optional
  @Named(SelectionIdentifier.CURRENT_MAIN_NODE_SELECTION)
  final Set<HGNode> selectedNodes) {

    _currentRootNode = rootNode;
    _currentSelectedNodes = getVisibleNodes(selectedNodes);

    //
    setSelection();
  }

  private void setSelection() {

    if (_treeViewer == null || _treeViewer.getTree().isDisposed()) {
      return;
    }

    //
    if (_currentRootNode == null || getCurrentSelection() == null || getCurrentSelection().isEmpty()) {
      _treeViewer.setInput(null);
      return;
    }

    RootObject oldRoot = (RootObject) _treeViewer.getInput();
    if (oldRoot == null || oldRoot.getRoot() != _currentRootNode) {
      _treeViewer.setInput(new RootObject(_currentRootNode));
    }

    Set<HGNode> referencedNodes = getNodesToShow();
    Set<HGNode> visible = NodeSelections.computeNodesWithParents(getVisibleNodes(referencedNodes), false);
    _treeViewer.setFilters(new VisibleNodesFilter(() -> {
      return visible;
    }));
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  protected abstract Set<HGNode> getNodesToShow();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  protected Set<HGNode> getCurrentSelection() {
    return _currentSelectedNodes;
  }

  /**
   * <p>
   * </p>
   *
   * @param referencedNodes
   * @return
   */
  private Set<HGNode> getVisibleNodes(Set<HGNode> referencedNodes) {
    return referencedNodes;
  }

  /**
   * <p>
   * </p>
   * 
   * @param parent
   * @param project
   * @return
   */
  private TreeViewer createTreeViewer(Composite parent) {

    TreeViewer treeViewer = SlizaaTreeViewerFactory.createTreeViewer(parent, SWT.NO_BACKGROUND | SWT.NONE | SWT.MULTI,
        2, null);

    // _currentSelectedNodes

    // TODO: MOVE SORTER TO Graph module!!!
    // treeViewer.setSorter(new CustomViewerSorter());

    //
    return treeViewer;
  }
}
