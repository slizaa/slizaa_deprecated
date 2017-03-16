package org.slizaa.ui.xref.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.TreeItem;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.SourceOrTarget;
import org.slizaa.hierarchicalgraph.selection.NodeSelections;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.hierarchicalgraph.selection.selector.DefaultDependencySelector;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelector.NodeType;
import org.slizaa.hierarchicalgraph.spi.INodeComparator;
import org.slizaa.ui.shared.NodeComparator2ViewerComparatorAdapter;
import org.slizaa.ui.shared.SlizaaCommonColors;
import org.slizaa.ui.shared.context.ContextHelper;
import org.slizaa.ui.shared.context.RootObject;
import org.slizaa.ui.tree.VisibleNodesFilter;
import org.slizaa.ui.tree.expand.DefaultExpandStrategy;
import org.slizaa.ui.tree.expand.NullExpandStrategy;
import org.slizaa.ui.tree.interceptors.DependencyResolvingTreeEventInterceptor;
import org.slizaa.ui.tree.interceptors.IInterceptableLabelProvider;
import org.slizaa.ui.tree.interceptors.ILabelProviderInterceptor;
import org.slizaa.ui.tree.interceptors.SelectedNodesLabelProviderInterceptor;

import com.google.common.collect.Iterables;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XRefComposite extends Composite {

  /** - */
  private HGRootNode                _rootNode;

  /** the label provider interceptor */
  private ILabelProviderInterceptor _labelProviderInterceptor;

  /** - */
  private Supplier<IEclipseContext> _eclipseContextSupplier;

  /** - */
  private TreeViewComposite         _fromTreeViewComposite;

  /** - */
  private TreeViewComposite         _centerTreeViewComposite;

  /** - */
  private TreeViewComposite         _toTreeViewComposite;

  /** - */
  private DefaultDependencySelector _outgoingDependencySelector;

  /** - */
  private DefaultDependencySelector _incomingDependencySelector;

  /** - */
  private Set<HGNode>               _filteredNodes;

  /** - */
  private SourceOrTarget            _selectedBackReferences;

  private ToolItem                  _setToSelectionToCenterToolItem;

  private ToolItem                  _setFromSelectionToCenterToolItem;

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

    _eclipseContextSupplier = checkNotNull(eclipseContextSupplier);

    //
    init();
  }

  /**
   * <p>
   * </p>
   *
   * @param filteredNodes
   */
  public void setFilteredNodes(List<HGNode> filteredNodes, boolean includeChildren) {

    //
    if (filteredNodes == null || filteredNodes.isEmpty()) {
      _filteredNodes = null;
    }
    //
    else {
      
      //
      _filteredNodes = NodeSelections.computeNodesWithParents(filteredNodes, includeChildren);

      //
      _outgoingDependencySelector.setDependencies(getSelectedOutGoingCoreDependenciesIfNotRoot(filteredNodes));
      _incomingDependencySelector.setDependencies(getSelectedIncomingCoreDependenciesIfNotRoot(filteredNodes));
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  public void setRootNode(HGRootNode rootNode) {

    //
    if (rootNode != null && rootNode.equals(_rootNode)) {
      return;
    }

    _rootNode = rootNode;

    // Set Tree Viewer input
    _fromTreeViewComposite.getTreeViewer().setInput(_rootNode != null ? new RootObject(_rootNode) : null);
    _centerTreeViewComposite.getTreeViewer().setInput(_rootNode != null ? new RootObject(_rootNode) : null);
    _toTreeViewComposite.getTreeViewer().setInput(_rootNode != null ? new RootObject(_rootNode) : null);

    // Make sure selected Artifacts are visible in Center Tree Viewer
    _fromTreeViewComposite.getTreeViewer().setSelection(new StructuredSelection());
    _centerTreeViewComposite.getTreeViewer()
        .setSelection(_rootNode != null ? new StructuredSelection(_rootNode) : new StructuredSelection());
    _toTreeViewComposite.getTreeViewer().setSelection(new StructuredSelection());

    //
    if (_rootNode != null && _rootNode.hasExtension(INodeComparator.class)) {
      _fromTreeViewComposite.getTreeViewer()
          .setComparator(new NodeComparator2ViewerComparatorAdapter(_rootNode.getExtension(INodeComparator.class)));
      _centerTreeViewComposite.getTreeViewer()
          .setComparator(new NodeComparator2ViewerComparatorAdapter(_rootNode.getExtension(INodeComparator.class)));
      _toTreeViewComposite.getTreeViewer()
          .setComparator(new NodeComparator2ViewerComparatorAdapter(_rootNode.getExtension(INodeComparator.class)));
    }

    // TODO
    _centerTreeViewComposite.getTreeViewer().setFilters(new VisibleNodesFilter(() -> _filteredNodes, true));

    // set focus to center tree viewer
    _centerTreeViewComposite.getTreeViewer().getTree().setFocus();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean setFocus() {
    return _centerTreeViewComposite.getTreeViewer().getTree().setFocus();
  }

  /**
   * <p>
   * </p>
   */
  public void refresh() {
    _centerTreeViewComposite.getTreeViewer().refresh();
    _fromTreeViewComposite.getTreeViewer().refresh();
    _toTreeViewComposite.getTreeViewer().refresh();
  }

  /**
   * <p>
   * </p>
   * 
   * @param selectedDetailDependencies
   */
  private void notifySelectedDependencies(Set<HGCoreDependency> dependencies) {
    Display.getDefault().syncExec(new Runnable() {
      @Override
      public void run() {
        try {
          Cursor cursor = Display.getDefault().getSystemCursor(SWT.CURSOR_WAIT);
          XRefComposite.this.setCursor(cursor);

          //
          ContextHelper.setDependenciesInContext(_eclipseContextSupplier.get(),
              SelectionIdentifier.CURRENT_MAIN_DEPENDENCY_SELECTION, dependencies);

          //
          ContextHelper.setDependenciesInContext(_eclipseContextSupplier.get(),
              SelectionIdentifier.CURRENT_DETAIL_DEPENDENCY_SELECTION, dependencies);

        } finally {
          XRefComposite.this.setCursor(null);
        }
      }
    });
  }

  /**
   * <p>
   * </p>
   */
  private void init() {

    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginWidth = 0;
    layout.marginHeight = 0;
    this.setLayout(layout);

    //
    SashForm sashForm = new SashForm(this, SWT.HORIZONTAL);
    sashForm.setBackground(SlizaaCommonColors.getSashBackgroundColor());
    GridData data = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
    sashForm.setLayoutData(data);

    //
    _outgoingDependencySelector = new DefaultDependencySelector();
    _incomingDependencySelector = new DefaultDependencySelector();
    _selectedBackReferences = null;

    //
    _fromTreeViewComposite = new TreeViewComposite(sashForm,
        new DependencyResolvingTreeEventInterceptor(
            (node) -> _incomingDependencySelector.getDependenciesForSourceNode(node)),
        new NullExpandStrategy(), SWT.END);

    _centerTreeViewComposite = new TreeViewComposite(sashForm, new DependencyResolvingTreeEventInterceptor((node) -> {
      Set<HGCoreDependency> result = new HashSet<>();
      Set<HGCoreDependency> in = _incomingDependencySelector.getDependenciesForTargetNode(node);
      if (in != null) {
        result.addAll(in);
      }
      Set<HGCoreDependency> out = _outgoingDependencySelector.getDependenciesForSourceNode(node);
      if (out != null) {
        result.addAll(out);
      }
      return result;
    }), new DefaultExpandStrategy((node) -> DefaultExpandStrategy.hasUnresolvedAggregatedCoreDependencies(
        Iterables.concat(node.getOutgoingCoreDependencies(), node.getIncomingCoreDependencies()))), SWT.FILL);

    _toTreeViewComposite = new TreeViewComposite(sashForm,
        new DependencyResolvingTreeEventInterceptor(
            (node) -> _outgoingDependencySelector.getDependenciesForTargetNode(node)),
        new NullExpandStrategy(), SWT.BEGINNING);

    // filter 'grayed' items
    // _centerTreeViewComposite.getTreeViewer().setFilters(new VisibleNodesFilter(() -> {
    // return _outgoingDependencySelector.getNodesWithParents(NodeType.SOURCE, true);
    // }, true));

    // the slizaa-id is used for actions and testing
    _fromTreeViewComposite.getTreeViewer().setData("slizaa-id", "xref-from-treeviewer");
    _centerTreeViewComposite.getTreeViewer().setData("slizaa-id", "xref-center-treeviewer");
    _toTreeViewComposite.getTreeViewer().setData("slizaa-id", "xref-to-treeviewer");

    _setFromSelectionToCenterToolItem = new ToolItem(_fromTreeViewComposite.getToolBar(), SWT.PUSH);
    _setFromSelectionToCenterToolItem.setImage(XRefImages.SELECT_FROM_SELECTION.getImage());
    _setFromSelectionToCenterToolItem.setDisabledImage(XRefImages.DISABLED_SELECT_FROM_SELECTION.getImage());
    _setFromSelectionToCenterToolItem.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(final SelectionEvent e) {
        ISelection selection = _fromTreeViewComposite.getTreeViewer().getSelection();
        _centerTreeViewComposite.getTreeViewer().setSelection(selection);
        _centerTreeViewComposite.getTreeViewer().getTree().setFocus();
      }
    });

    _setToSelectionToCenterToolItem = new ToolItem(_toTreeViewComposite.getToolBar(), SWT.PUSH);
    _setToSelectionToCenterToolItem.setImage(XRefImages.SELECT_TO_SELECTION.getImage());
    _setToSelectionToCenterToolItem.setDisabledImage(XRefImages.DISABLED_SELECT_TO_SELECTION.getImage());
    _setToSelectionToCenterToolItem.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(final SelectionEvent e) {
        ISelection selection = _toTreeViewComposite.getTreeViewer().getSelection();
        _centerTreeViewComposite.getTreeViewer().setSelection(selection);
        _centerTreeViewComposite.getTreeViewer().getTree().setFocus();
      }
    });

    //
    _outgoingDependencySelector.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent evt) {
        _centerTreeViewComposite.getTreeViewer().refresh();
        _toTreeViewComposite.getTreeViewer().refresh();
      }
    });

    //
    _incomingDependencySelector.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent evt) {
        _fromTreeViewComposite.getTreeViewer().refresh();
        _centerTreeViewComposite.getTreeViewer().refresh();
      }
    });

    //
    _fromTreeViewComposite.getTreeExpandStrategy().init(_fromTreeViewComposite.getTreeViewer());
    _centerTreeViewComposite.getTreeExpandStrategy().init(_centerTreeViewComposite.getTreeViewer());
    _toTreeViewComposite.getTreeExpandStrategy().init(_toTreeViewComposite.getTreeViewer());

    //
    _labelProviderInterceptor = new SelectedNodesLabelProviderInterceptor(() -> getBackReferencedCenterNodes());
    IBaseLabelProvider labelProvider = _centerTreeViewComposite.getTreeViewer().getLabelProvider();
    if (labelProvider instanceof IInterceptableLabelProvider) {
      ((IInterceptableLabelProvider) labelProvider).setLabelProviderInterceptor(_labelProviderInterceptor);
    }

    // add SelectionListeners
    _fromTreeViewComposite.getTreeViewer().addSelectionChangedListener(new FromArtifactsSelectionChangedListener());
    _centerTreeViewComposite.getTreeViewer().addSelectionChangedListener(new CenterArtifactsSelectionChangedListener());
    _toTreeViewComposite.getTreeViewer().addSelectionChangedListener(new ToArtifactSelectionChangedListener());
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private Collection<HGNode> getBackReferencedCenterNodes() {

    //
    if (_selectedBackReferences == null) {
      return null;
    }

    //
    switch (_selectedBackReferences) {
    case SOURCE:
      return _incomingDependencySelector.getNodesWithParents(NodeType.TARGET, true);
    case TARGET:
      return _outgoingDependencySelector.getNodesWithParents(NodeType.SOURCE, true);
    }

    //
    throw new RuntimeException();
  }

  /**
   * <p>
   * </p>
   *
   * @param structuredSelection
   * @return
   */
  private List<HGCoreDependency> getSelectedIncomingCoreDependenciesIfNotRoot(List<?> elements) {

    //
    if (elements.size() == 1 && _rootNode.equals(StructuredSelectionUtils.selectedNodes(elements).get(0))) {
      return Collections.emptyList();
    }

    //
    return StructuredSelectionUtils.selectedIncomingCoreDependencies(elements);
  }

  /**
   * <p>
   * </p>
   *
   * @param structuredSelection
   * @return
   */
  private List<HGCoreDependency> getSelectedOutGoingCoreDependenciesIfNotRoot(List<?> elements) {

    //
    if (elements.size() == 1 && _rootNode.equals(StructuredSelectionUtils.selectedNodes(elements).get(0))) {
      return Collections.emptyList();
    }

    //
    return StructuredSelectionUtils.selectedOutGoingCoreDependencies(elements);
  }

  /**
   * <p>
   * </p>
   * 
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private final class CenterArtifactsSelectionChangedListener implements ISelectionChangedListener {

    /**
     * {@inheritDoc}
     */
    @Override
    public void selectionChanged(SelectionChangedEvent event) {

      // return if noting is selected
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();
      if (structuredSelection.isEmpty()) {
        return;
      }

      // reset selections in from and to viewer
      _fromTreeViewComposite.getTreeViewer().setSelection(new StructuredSelection());
      _toTreeViewComposite.getTreeViewer().setSelection(new StructuredSelection());
      _setFromSelectionToCenterToolItem.setEnabled(false);
      _setToSelectionToCenterToolItem.setEnabled(false);

      // store the top item
      TreeItem toTreeTopItem = _toTreeViewComposite.getTreeViewer().getTree().getTopItem();
      TreeItem fromTreeTopItem = _fromTreeViewComposite.getTreeViewer().getTree().getTopItem();

      //
      _outgoingDependencySelector.setDependencies(getSelectedOutGoingCoreDependenciesIfNotRoot(structuredSelection.toList()));
      _incomingDependencySelector.setDependencies(getSelectedIncomingCoreDependenciesIfNotRoot(structuredSelection.toList()));

      // don't highlight anything
      _selectedBackReferences = null;
      notifySelectedDependencies(Collections.emptySet());

      //
      _fromTreeViewComposite.getTreeExpandStrategy()
          .expand(_incomingDependencySelector.getNodesWithParents(NodeType.SOURCE, false));
      _toTreeViewComposite.getTreeExpandStrategy()
          .expand(_outgoingDependencySelector.getNodesWithParents(NodeType.TARGET, false));

      //
      _fromTreeViewComposite.getTreeViewer().setFilters(
          new VisibleNodesFilter(() -> _incomingDependencySelector.getNodesWithParents(NodeType.SOURCE, false)));

      _toTreeViewComposite.getTreeViewer().setFilters(
          new VisibleNodesFilter(() -> _outgoingDependencySelector.getNodesWithParents(NodeType.TARGET, false)));

      // set the top item again
      if (toTreeTopItem != null && !toTreeTopItem.isDisposed()) {
        _toTreeViewComposite.getTreeViewer().getTree().setTopItem(toTreeTopItem);
      } else if (_toTreeViewComposite.getTreeViewer().getTree().getItemCount() > 0) {
        _toTreeViewComposite.getTreeViewer().getTree()
            .setTopItem(_toTreeViewComposite.getTreeViewer().getTree().getItem(0));
      }

      if (fromTreeTopItem != null && !fromTreeTopItem.isDisposed()) {
        _fromTreeViewComposite.getTreeViewer().getTree().setTopItem(fromTreeTopItem);
      } else if (_fromTreeViewComposite.getTreeViewer().getTree().getItemCount() > 0) {
        _fromTreeViewComposite.getTreeViewer().getTree()
            .setTopItem(_fromTreeViewComposite.getTreeViewer().getTree().getItem(0));
      }

      //
      _centerTreeViewComposite.getTreeViewer().refresh();
    }
  }

  /**
   * <p>
   * </p>
   * 
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private final class FromArtifactsSelectionChangedListener implements ISelectionChangedListener {

    /**
     * {@inheritDoc}
     */
    @Override
    public void selectionChanged(SelectionChangedEvent event) {

      //
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();

      //
      if (structuredSelection.isEmpty()) {
        _setFromSelectionToCenterToolItem.setEnabled(false);
        return;
      }

      //
      _setFromSelectionToCenterToolItem.setEnabled(true);

      // Reset Selection in 'to' Viewer
      _toTreeViewComposite.getTreeViewer().setSelection(new StructuredSelection());

      //
      _selectedBackReferences = SourceOrTarget.SOURCE;

      //
      _incomingDependencySelector.setSelectedNodes(NodeType.SOURCE,
          StructuredSelectionUtils.selectedNodes(structuredSelection));

      //
      notifySelectedDependencies(_incomingDependencySelector.getFilteredCoreDependencies());

      //
      _centerTreeViewComposite.getTreeViewer().refresh();
    }
  }

  /**
   * <p>
   * </p>
   * 
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private final class ToArtifactSelectionChangedListener implements ISelectionChangedListener {

    /**
     * {@inheritDoc}
     */
    @Override
    public void selectionChanged(SelectionChangedEvent event) {

      //
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();

      //
      if (structuredSelection.isEmpty()) {
        _setToSelectionToCenterToolItem.setEnabled(false);
        return;
      }

      //
      _setToSelectionToCenterToolItem.setEnabled(true);

      // Reset Selection in 'from' Viewer
      _fromTreeViewComposite.getTreeViewer().setSelection(new StructuredSelection());

      //
      _selectedBackReferences = SourceOrTarget.TARGET;

      //
      _outgoingDependencySelector.setSelectedNodes(NodeType.TARGET,
          StructuredSelectionUtils.selectedNodes(structuredSelection));

      //
      notifySelectedDependencies(_outgoingDependencySelector.getFilteredCoreDependencies());

      //
      _centerTreeViewComposite.getTreeViewer().refresh();
    }
  }
}