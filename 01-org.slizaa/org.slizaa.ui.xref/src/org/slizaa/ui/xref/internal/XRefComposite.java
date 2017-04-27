package org.slizaa.ui.xref.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolItem;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.hierarchicalgraph.selection.xref.IXRefListener;
import org.slizaa.hierarchicalgraph.selection.xref.XRefStack;
import org.slizaa.hierarchicalgraph.spi.INodeComparator;
import org.slizaa.ui.shared.NodeComparator2ViewerComparatorAdapter;
import org.slizaa.ui.shared.SlizaaCommonColors;
import org.slizaa.ui.shared.context.BusyCursor;
import org.slizaa.ui.shared.context.RootObject;
import org.slizaa.ui.tree.VisibleNodesFilter;
import org.slizaa.ui.tree.expand.NullExpandStrategy;
import org.slizaa.ui.tree.interceptors.DependencyResolvingTreeEventInterceptor;
import org.slizaa.ui.tree.interceptors.IInterceptableLabelProvider;
import org.slizaa.ui.tree.interceptors.SelectedNodesLabelProviderInterceptor;

public class XRefComposite extends Composite {

  public static enum ToolbarItems {
    EXPAND_ALL, COLLAPSE_ALL, CROP, UNCROP, BACK, FORWARD
  }

  /** - */
  private Supplier<IEclipseContext> _eclipseContextSupplier;

  /** - */
  private XRefStack                 _xRefStack;

  /** - */
  private TreeViewComposite         _leftsidedTreeViewComposite;

  /** - */
  private TreeViewComposite         _centeredTreeViewComposite;

  /** - */
  private TreeViewComposite         _rightsidedTreeViewComposite;

  /** - */
  private HGRootNode                _rootNode;

  /**
   * <p>
   * Creates a new instance of type {@link XRefComposite}.
   * </p>
   * 
   * @param parent
   * @param eclipseContextSupplier
   */
  public XRefComposite(Composite parent, Supplier<IEclipseContext> eclipseContextSupplier) {
    super(parent, SWT.NONE);

    //
    _eclipseContextSupplier = checkNotNull(eclipseContextSupplier);

    //
    GridLayoutFactory.fillDefaults().applyTo(this);

    //
    SashForm sashForm = new SashForm(this, SWT.HORIZONTAL);
    sashForm.setBackground(SlizaaCommonColors.getSashBackgroundColor());
    GridDataFactory.fillDefaults().grab(true, true).applyTo(sashForm);

    //
    _leftsidedTreeViewComposite = createLeftTree(sashForm);
    _centeredTreeViewComposite = createCenterTree(sashForm);
    _rightsidedTreeViewComposite = createRightTree(sashForm);

    //
    _xRefStack = new XRefStack();
    _xRefStack.addXRefListener(new IXRefListenerImplementation());
  }

  public void refresh() {
    // TODO
    _leftsidedTreeViewComposite.getTreeViewer().refresh();
    _centeredTreeViewComposite.getTreeViewer().refresh();
    _rightsidedTreeViewComposite.getTreeViewer().refresh();
  }

  /**
   * <p>
   * </p>
   *
   * @param filteredNodes
   */
  public void setFilteredNodes(List<HGNode> filteredNodes, boolean includeChildren) {

    //
    if (filteredNodes != null && !filteredNodes.isEmpty()) {

      //
      _xRefStack.pruneDependenciesForUncroppedCenterNodes(filteredNodes,
          getSelectedIncomingCoreDependenciesIfNotRoot(filteredNodes),
          getSelectedOutgoingCoreDependenciesIfNotRoot(filteredNodes));

      _xRefStack.cropSelection();
    }
    //
    else {
      //
      _xRefStack.uncropAll();
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param rootNode
   */
  public void setRootNode(HGRootNode rootNode) {

    //
    if (rootNode != null && rootNode.equals(_rootNode)) {
      return;
    }

    //
    _rootNode = rootNode;

    //
    if (_rootNode == null) {
      forEachTreeViewerComposite(t -> t.getTreeViewer().setInput(null));
      _xRefStack.pruneDependenciesForUncroppedCenterNodes(Collections.emptySet(), Collections.emptySet(),
          Collections.emptySet());
    }
    //
    else {

      // set the input
      forEachTreeViewerComposite(t -> t.getTreeViewer().setInput(new RootObject(rootNode)));

      //
      _leftsidedTreeViewComposite.getTreeViewer()
          .setFilters(new VisibleNodesFilter(() -> Collections.emptySet(), false));
      _rightsidedTreeViewComposite.getTreeViewer()
          .setFilters(new VisibleNodesFilter(() -> Collections.emptySet(), false));

      // set the viewer comparator
      if (rootNode.hasExtension(INodeComparator.class)) {
        forEachTreeViewerComposite(t -> t.getTreeViewer()
            .setComparator(new NodeComparator2ViewerComparatorAdapter(rootNode.getExtension(INodeComparator.class))));
      }
    }

    // deselect all
    forEachTreeViewerComposite(t -> t.getTreeViewer().setSelection(new StructuredSelection()));

    // set focus to center tree viewer
    _centeredTreeViewComposite.getTreeViewer().getTree().setFocus();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  XRefStack xRefStack() {
    return _xRefStack;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  TreeViewComposite centeredTreeViewComposite() {
    return _centeredTreeViewComposite;
  }

  /**
   * <p>
   * </p>
   *
   * @param consumer
   */
  private void forEachTreeViewerComposite(Consumer<TreeViewComposite> consumer) {
    consumer.accept(_leftsidedTreeViewComposite);
    consumer.accept(_centeredTreeViewComposite);
    consumer.accept(_rightsidedTreeViewComposite);
  }

  /**
   * <p>
   * </p>
   *
   * @param sashForm
   * @return
   */
  private TreeViewComposite createRightTree(SashForm sashForm) {

    //
    TreeViewComposite treeViewComposite = new TreeViewComposite(sashForm,
        new DependencyResolvingTreeEventInterceptor(
            (node) -> _xRefStack.outgoingDependencySelector().getDependenciesForTargetNode(node)),
        new NullExpandStrategy(), SWT.RIGHT);

    //
    treeViewComposite.getTreeViewer().getTree().setData("slizaa-id", "xref-to-treeviewer");

    // collapse all
    treeViewComposite.createToolItem(ToolbarItems.COLLAPSE_ALL, XRefImages.COLLAPSE_ALL.getImage(),
        XRefImages.DISABLED_COLLAPSE_ALL.getImage(), e -> {
          collapseAll(treeViewComposite.getTreeViewer());
        });

    //
    treeViewComposite.getTreeViewer().addSelectionChangedListener(event -> {
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();
      _xRefStack.setSelectedRightsidedNodes(structuredSelection.toList());
    });

    //
    return treeViewComposite;
  }

  /**
   * <p>
   * </p>
   *
   * @param sashForm
   * @return
   */
  private TreeViewComposite createCenterTree(SashForm sashForm) {

    //
    TreeViewComposite treeViewComposite = new TreeViewComposite(sashForm,
        new DependencyResolvingTreeEventInterceptor((node) -> {
          Set<HGCoreDependency> result = new HashSet<>();

          if (_xRefStack.hasCroppedSelections()) {
            result.addAll(_xRefStack.incomingDependencySelector().getDependenciesForTargetNode(node));
            result.addAll(_xRefStack.outgoingDependencySelector().getDependenciesForSourceNode(node));
          } else {
            result.addAll(node.getIncomingCoreDependencies());
            result.addAll(node.getOutgoingCoreDependencies());
          }

          return result;
        }), new NullExpandStrategy(), SWT.RIGHT);

    //
    treeViewComposite.getTreeViewer().getTree().setData("slizaa-id", "xref-center-treeviewer");

    // set label provider
    ((IInterceptableLabelProvider) treeViewComposite.getTreeViewer().getLabelProvider()).setLabelProviderInterceptor(
        new SelectedNodesLabelProviderInterceptor(() -> _xRefStack.getBackreferencedCenterNodes()));

    //
    treeViewComposite.getTreeViewer().addSelectionChangedListener(event -> {

      // return if noting is selected
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();

      if (!structuredSelection.isEmpty()) {

        BusyCursor.execute(this, () -> {

          // This is a performance optimization: if nothing has been 'cropped' yet, we set
          // the initial dependencies whenever the selection changes.
          if (_xRefStack.isCurrentSelectionCropped()) {
            _xRefStack.setSelectedCenterNodes(structuredSelection.toList());
          } else {
            _xRefStack.pruneDependenciesForUncroppedCenterNodes(structuredSelection.toList(),
                getSelectedIncomingCoreDependenciesIfNotRoot(structuredSelection.toList()),
                getSelectedOutgoingCoreDependenciesIfNotRoot(structuredSelection.toList()));
          }
        });

      }
    });

    // create the crop selection button
    treeViewComposite.createToolItem(ToolbarItems.CROP, XRefImages.CROP_SELECTION.getImage(),
        XRefImages.DISABLED_CROP_SELECTION.getImage(), (e) -> {
          _xRefStack.cropSelection();
        });

    // create the uncrop selection button
    treeViewComposite.createToolItem(ToolbarItems.UNCROP, XRefImages.UNCROP.getImage(),
        XRefImages.DISABLED_UNCROP.getImage(), (e) -> {
          _xRefStack.uncropAll();
        });

    // create the go back button
    treeViewComposite.createToolItem(ToolbarItems.BACK, XRefImages.CROP_SELECTION_BACK.getImage(),
        XRefImages.DISABLED_CROP_SELECTION_BACK.getImage(), (e) -> {
          _xRefStack.goBack();
        });

    // create the go forward button
    treeViewComposite.createToolItem(ToolbarItems.FORWARD, XRefImages.CROP_SELECTION_FORWARD.getImage(),
        XRefImages.DISABLED_CROP_SELECTION_FORWARD.getImage(), (e) -> {
          _xRefStack.goForward();
        });

    // separator
    new ToolItem(treeViewComposite.getToolBar(), SWT.SEPARATOR);

    // collapse all
    treeViewComposite.createToolItem(ToolbarItems.COLLAPSE_ALL, XRefImages.COLLAPSE_ALL.getImage(),
        XRefImages.DISABLED_COLLAPSE_ALL.getImage(), e -> {
          collapseAll(treeViewComposite.getTreeViewer());
        });

    //
    treeViewComposite.getToolItem(ToolbarItems.CROP).setEnabled(false);
    treeViewComposite.getToolItem(ToolbarItems.UNCROP).setEnabled(false);
    treeViewComposite.getToolItem(ToolbarItems.BACK).setEnabled(false);
    treeViewComposite.getToolItem(ToolbarItems.FORWARD).setEnabled(false);

    //
    return treeViewComposite;
  }

  /**
   * <p>
   * </p>
   *
   * @param sashForm
   * @return
   */
  private TreeViewComposite createLeftTree(SashForm sashForm) {

    //
    TreeViewComposite treeViewComposite = new TreeViewComposite(sashForm,
        new DependencyResolvingTreeEventInterceptor(
            (node) -> _xRefStack.incomingDependencySelector().getDependenciesForSourceNode(node)),
        new NullExpandStrategy(), SWT.RIGHT);

    //
    treeViewComposite.getTreeViewer().getTree().setData("slizaa-id", "xref-from-treeviewer");

    //
    treeViewComposite.getTreeViewer().addSelectionChangedListener(event -> {
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();
      _xRefStack.setSelectedLeftsidedNodes(structuredSelection.toList());
    });

    // collapse all
    treeViewComposite.createToolItem(ToolbarItems.COLLAPSE_ALL, XRefImages.COLLAPSE_ALL.getImage(),
        XRefImages.DISABLED_COLLAPSE_ALL.getImage(), e -> {
          collapseAll(treeViewComposite.getTreeViewer());
        });

    //
    return treeViewComposite;
  }

  private void collapseAll(TreeViewer treeViewer) {
    for (TreePath treePath : checkNotNull(treeViewer).getExpandedTreePaths()) {
      if (treePath.getSegmentCount() > 1) {
        treeViewer.setExpandedState(treePath, false);
      }
    }
  }

  /**
   * <p>
   * </p>
   */
  private void updateDetailsSelection() {

    Display.getDefault().syncExec(() -> {
      try {
        Cursor cursor = Display.getDefault().getSystemCursor(SWT.CURSOR_WAIT);
        XRefComposite.this.setCursor(cursor);

        IEclipseContext eclipseContext = _eclipseContextSupplier.get();

        //
        DependencySelection dependencySelection = SelectionFactory.eINSTANCE.createDependencySelection();
        dependencySelection.getDependencies().addAll(_xRefStack.getSelectedDependencies());
        eclipseContext.declareModifiable(SelectionIdentifier.CURRENT_MAIN_DEPENDENCY_SELECTION);
        eclipseContext.set(SelectionIdentifier.CURRENT_MAIN_DEPENDENCY_SELECTION, dependencySelection);

        //
        dependencySelection = SelectionFactory.eINSTANCE.createDependencySelection();
        dependencySelection.getDependencies().addAll(_xRefStack.getSelectedDependencies());
        eclipseContext.declareModifiable(SelectionIdentifier.CURRENT_DETAIL_DEPENDENCY_SELECTION);
        eclipseContext.set(SelectionIdentifier.CURRENT_DETAIL_DEPENDENCY_SELECTION, dependencySelection);

      } finally {
        XRefComposite.this.setCursor(null);
      }
    });
  }

  /**
   * <p>
   * </p>
   *
   * @param structuredSelection
   * @return
   */
  private static List<HGCoreDependency> getSelectedIncomingCoreDependenciesIfNotRoot(List<HGNode> elements) {

    //
    if (elements.size() == 1 && elements.get(0) instanceof HGRootNode) {
      return Collections.emptyList();
    }

    //
    return (List<HGCoreDependency>) checkNotNull(elements).stream().filter((e) -> e instanceof HGNode)
        .flatMap((node) -> ((HGNode) node).getAccumulatedIncomingCoreDependencies().stream())
        .collect(Collectors.toList());
  }

  /**
   * <p>
   * </p>
   *
   * @param structuredSelection
   * @return
   */
  private static List<HGCoreDependency> getSelectedOutgoingCoreDependenciesIfNotRoot(List<HGNode> elements) {

    //
    if (elements.size() == 1 && elements.get(0) instanceof HGRootNode) {
      return Collections.emptyList();
    }

    //
    return (List<HGCoreDependency>) checkNotNull(elements).stream().filter((e) -> e instanceof HGNode)
        .flatMap((node) -> ((HGNode) node).getAccumulatedOutgoingCoreDependencies().stream())
        .collect(Collectors.toList());

  }

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private final class IXRefListenerImplementation implements IXRefListener {

    /**
     * {@inheritDoc}
     */
    @Override
    public void croppedSelectionChanged() {

      //
      _leftsidedTreeViewComposite.getTreeViewer()
          .setFilters(new VisibleNodesFilter(() -> _xRefStack.getLeftsidedNodes(), false));
      _leftsidedTreeViewComposite.getTreeViewer().getTree().deselectAll();

      //
      if (_xRefStack.isCurrentSelectionCropped()) {
        _centeredTreeViewComposite.getTreeViewer()
            .setFilters(new VisibleNodesFilter(() -> _xRefStack.getVisibleCenterNodesWithParents(true), true));
      }
      //
      else {
        //
        IStructuredSelection selection = _centeredTreeViewComposite.getTreeViewer().getStructuredSelection();
        _centeredTreeViewComposite.getTreeViewer().resetFilters();
        _centeredTreeViewComposite.getTreeViewer().setSelection(selection);
      }
      _centeredTreeViewComposite.getTreeViewer().refresh();

      //
      _rightsidedTreeViewComposite.getTreeViewer()
          .setFilters(new VisibleNodesFilter(() -> _xRefStack.getRightsidedNodes(), false));
      _rightsidedTreeViewComposite.getTreeViewer().getTree().deselectAll();

      // update the toolbar
      updateToolbar();

      // set the selected detail dependencies in the context
      updateDetailsSelection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void coreDependenciesChanged() {

      //
      _leftsidedTreeViewComposite.getTreeViewer()
          .setFilters(new VisibleNodesFilter(() -> _xRefStack.getLeftsidedNodes(), false));
      _leftsidedTreeViewComposite.getTreeViewer().getTree().deselectAll();

      //
      if (_xRefStack.isCurrentSelectionCropped()) {
        _centeredTreeViewComposite.getTreeViewer()
            .setFilters(new VisibleNodesFilter(() -> _xRefStack.getVisibleCenterNodesWithParents(true), true));
      }
      //
      else {
        _centeredTreeViewComposite.getTreeViewer().refresh();
      }

      //
      _rightsidedTreeViewComposite.getTreeViewer()
          .setFilters(new VisibleNodesFilter(() -> _xRefStack.getRightsidedNodes(), false));
      _rightsidedTreeViewComposite.getTreeViewer().getTree().deselectAll();

      // update the toolbar
      updateToolbar();

      // set the selected detail dependencies in the context
      updateDetailsSelection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void centerNodeSelectionChanged() {

      // prepare left tree viewer
      _leftsidedTreeViewComposite.getTreeViewer()
          .setFilters(new VisibleNodesFilter(() -> _xRefStack.getLeftsidedNodes(), false));
      _leftsidedTreeViewComposite.getTreeViewer().getTree().deselectAll();

      //
      _centeredTreeViewComposite.getTreeViewer().update(_xRefStack.getVisibleCenterNodesWithParents(true).toArray(),
          null);

      // prepare right tree viewer
      _rightsidedTreeViewComposite.getTreeViewer()
          .setFilters(new VisibleNodesFilter(() -> _xRefStack.getRightsidedNodes(), false));
      _rightsidedTreeViewComposite.getTreeViewer().getTree().deselectAll();

      // update the toolbar
      updateToolbar();

      // set the selected detail dependencies in the context
      updateDetailsSelection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void leftsidedNodeSelectionChanged() {

      // update center...
      _centeredTreeViewComposite.getTreeViewer().update(_xRefStack.getVisibleCenterNodesWithParents(true).toArray(),
          null);

      // ...and deselect rightsided tree
      _rightsidedTreeViewComposite.getTreeViewer().getTree().deselectAll();

      // update the toolbar
      updateToolbar();

      // set the selected detail dependencies in the context
      updateDetailsSelection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void rightsidedNodeSelectionChanged() {

      // update center...
      _centeredTreeViewComposite.getTreeViewer().update(_xRefStack.getVisibleCenterNodesWithParents(true).toArray(),
          null);

      // ...and deselect leftsided tree
      _leftsidedTreeViewComposite.getTreeViewer().getTree().deselectAll();

      // update the toolbar
      updateToolbar();

      // set the selected detail dependencies in the context
      updateDetailsSelection();
    }

    /**
     * <p>
     * </p>
     */
    private void updateToolbar() {
      _centeredTreeViewComposite.getToolItem(ToolbarItems.CROP)
          .setEnabled(_xRefStack.isCurrentSelectionCropped()
              || !_xRefStack.incomingDependencySelector().getUnfilteredCoreDependencies().isEmpty()
              || !_xRefStack.outgoingDependencySelector().getUnfilteredCoreDependencies().isEmpty());
      _centeredTreeViewComposite.getToolItem(ToolbarItems.UNCROP).setEnabled(_xRefStack.hasCroppedSelections());
      _centeredTreeViewComposite.getToolItem(ToolbarItems.BACK).setEnabled(_xRefStack.canGoBack());
      _centeredTreeViewComposite.getToolItem(ToolbarItems.FORWARD).setEnabled(_xRefStack.canGoForward());
    }
  }
}
