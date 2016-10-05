package org.slizaa.ui.xref.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TreeItem;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.SourceOrTarget;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.hierarchicalgraph.selection.selector.DefaultDependencySelector;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelector.NodeType;
import org.slizaa.ui.common.SlizaaCommonColors;
import org.slizaa.ui.common.context.ContextHelper;
import org.slizaa.ui.common.context.RootObject;
import org.slizaa.ui.tree.DependencyResolvingTreeEventInterceptor;
import org.slizaa.ui.tree.IInterceptableLabelProvider;
import org.slizaa.ui.tree.ILabelProviderInterceptor;
import org.slizaa.ui.tree.SelectedNodesLabelProviderInterceptor;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;
import org.slizaa.ui.tree.VisibleNodesFilter;
import org.slizaa.ui.tree.expand.DefaultExpandStrategy;
import org.slizaa.ui.tree.expand.IExpandStrategy;
import org.slizaa.ui.tree.expand.NullExpandStrategy;

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
  private IEclipseContext           _eclipseContext;

  /** the from tree viewer */
  private TreeViewer                _fromTreeViewer;

  /** - */
  private IExpandStrategy           _fromTreeExpandStrategy;

  /** the center tree viewer */
  private TreeViewer                _centerViewer;

  /** - */
  private IExpandStrategy           _centerTreeExpandStrategy;

  /** the to tree viewer */
  private TreeViewer                _toTreeViewer;

  /** - */
  private IExpandStrategy           _toTreeExpandStrategy;

  /** - */
  private DefaultDependencySelector _outgoingDependencySelector;

  /** - */
  private DefaultDependencySelector _incomingDependencySelector;

  /** - */
  private SourceOrTarget            _selectedBackReferences;

  /**
   * <p>
   * Creates a new instance of type {@link XRefComposite}.
   * </p>
   * 
   * @param parent
   * @param eclipseContext
   */
  public XRefComposite(Composite parent, IEclipseContext eclipseContext) {
    super(parent, SWT.NONE);

    _eclipseContext = checkNotNull(eclipseContext);

    //
    init();
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
    _fromTreeViewer.setInput(_rootNode != null ? new RootObject(_rootNode) : null);
    _centerViewer.setInput(_rootNode != null ? new RootObject(_rootNode) : null);
    _toTreeViewer.setInput(_rootNode != null ? new RootObject(_rootNode) : null);

    // Make sure selected Artifacts are visible in Center Tree Viewer
    _fromTreeViewer.setSelection(new StructuredSelection());
    _centerViewer.setSelection(_rootNode != null ? new StructuredSelection(_rootNode) : new StructuredSelection());
    _toTreeViewer.setSelection(new StructuredSelection());

    // set focus to center tree viewer
    _centerViewer.getTree().setFocus();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean setFocus() {
    return _centerViewer.getTree().setFocus();
  }

  /**
   * <p>
   * </p>
   */
  public void refresh() {
    _centerViewer.refresh();
    _fromTreeViewer.refresh();
    _toTreeViewer.refresh();
  }

  /**
   * <p>
   * </p>
   * 
   * @param selectedDetailDependencies
   */
  private void notifySelectedDependencies(Collection<HGCoreDependency> dependencies) {
    Display.getDefault().syncExec(new Runnable() {
      @Override
      public void run() {
        try {
          Cursor cursor = Display.getDefault().getSystemCursor(SWT.CURSOR_WAIT);
          XRefComposite.this.setCursor(cursor);

          //
          ContextHelper.setValueInContext(_eclipseContext, SelectionIdentifier.CURRENT_MAIN_DEPENDENCY_SELECTION,
              dependencies);

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
    _fromTreeViewer = SlizaaTreeViewerFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 2,
        new DependencyResolvingTreeEventInterceptor(
            (node) -> _incomingDependencySelector.getDependenciesWithSourceNode(node)));

    _centerViewer = SlizaaTreeViewerFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 2,
        new DependencyResolvingTreeEventInterceptor((node) -> {
          List<HGCoreDependency> result = new ArrayList<>();
          List<HGCoreDependency> in = _incomingDependencySelector.getDependenciesWithTargetNode(node);
          if (in != null) {
            result.addAll(in);
          }
          List<HGCoreDependency> out = _outgoingDependencySelector.getDependenciesWithSourceNode(node);
          if (out != null) {
            result.addAll(out);
          }
          return result;
        }));

    _toTreeViewer = SlizaaTreeViewerFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 2,
        new DependencyResolvingTreeEventInterceptor(
            (node) -> _outgoingDependencySelector.getDependenciesWithTargetNode(node)));

    //
    _outgoingDependencySelector.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent evt) {
        _centerViewer.refresh();
        _toTreeViewer.refresh();
      }
    });

    //
    _incomingDependencySelector.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent evt) {
        _fromTreeViewer.refresh();
        _centerViewer.refresh();
      }
    });

    _fromTreeExpandStrategy = new NullExpandStrategy();
    _centerTreeExpandStrategy = new DefaultExpandStrategy(
        (node) -> DefaultExpandStrategy.hasUnresolvedAggregatedCoreDependencies(
            Iterables.concat(node.getOutgoingCoreDependencies(), node.getIncomingCoreDependencies())));
    _toTreeExpandStrategy = new NullExpandStrategy();

    //
    _fromTreeExpandStrategy.init(_fromTreeViewer);
    _centerTreeExpandStrategy.init(_centerViewer);
    _toTreeExpandStrategy.init(_toTreeViewer);

    //
    _labelProviderInterceptor = new SelectedNodesLabelProviderInterceptor(() -> getBackReferencedCenterNodes());
    IBaseLabelProvider labelProvider = _centerViewer.getLabelProvider();
    if (labelProvider instanceof IInterceptableLabelProvider) {
      ((IInterceptableLabelProvider) labelProvider).setLabelProviderInterceptor(_labelProviderInterceptor);
    }

    // add SelectionListeners
    _fromTreeViewer.addSelectionChangedListener(new FromArtifactsSelectionChangedListener());
    _centerViewer.addSelectionChangedListener(new CenterArtifactsSelectionChangedListener());
    _toTreeViewer.addSelectionChangedListener(new ToArtifactSelectionChangedListener());
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
  private List<HGCoreDependency> getSelectedIncomingCoreDependenciesIfNotRoot(
      IStructuredSelection structuredSelection) {

    //
    if (structuredSelection.size() == 1
        && _rootNode.equals(StructuredSelectionUtils.selectedNodes(structuredSelection).get(0))) {
      return Collections.emptyList();
    }

    //
    return StructuredSelectionUtils.selectedIncomingCoreDependencies(structuredSelection);
  }

  /**
   * <p>
   * </p>
   *
   * @param structuredSelection
   * @return
   */
  private List<HGCoreDependency> getSelectedOutGoingCoreDependenciesIfNotRoot(
      IStructuredSelection structuredSelection) {

    //
    if (structuredSelection.size() == 1
        && _rootNode.equals(StructuredSelectionUtils.selectedNodes(structuredSelection).get(0))) {
      return Collections.emptyList();
    }

    return StructuredSelectionUtils.selectedOutGoingCoreDependencies(structuredSelection);
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
      _fromTreeViewer.setSelection(new StructuredSelection());
      _toTreeViewer.setSelection(new StructuredSelection());

      // store the top item
      TreeItem toTreeTopItem = _toTreeViewer.getTree().getTopItem();
      TreeItem fromTreeTopItem = _fromTreeViewer.getTree().getTopItem();

      //
      _outgoingDependencySelector.setDependencies(getSelectedOutGoingCoreDependenciesIfNotRoot(structuredSelection));
      _incomingDependencySelector.setDependencies(getSelectedIncomingCoreDependenciesIfNotRoot(structuredSelection));

      // don't highlight anything
      _selectedBackReferences = null;
      notifySelectedDependencies(Collections.emptyList());

      //
      _fromTreeExpandStrategy.expand(_incomingDependencySelector.getNodesWithParents(NodeType.SOURCE, false));
      _toTreeExpandStrategy.expand(_outgoingDependencySelector.getNodesWithParents(NodeType.TARGET, false));

      //
      _fromTreeViewer.setFilters(
          new VisibleNodesFilter(() -> _incomingDependencySelector.getNodesWithParents(NodeType.SOURCE, false)));

      _toTreeViewer.setFilters(
          new VisibleNodesFilter(() -> _outgoingDependencySelector.getNodesWithParents(NodeType.TARGET, false)));

      // set the top item again
      if (toTreeTopItem != null && !toTreeTopItem.isDisposed()) {
        _toTreeViewer.getTree().setTopItem(toTreeTopItem);
      } else if (_toTreeViewer.getTree().getItemCount() > 0) {
        _toTreeViewer.getTree().setTopItem(_toTreeViewer.getTree().getItem(0));
      }

      if (fromTreeTopItem != null && !fromTreeTopItem.isDisposed()) {
        _fromTreeViewer.getTree().setTopItem(fromTreeTopItem);
      } else if (_fromTreeViewer.getTree().getItemCount() > 0) {
        _fromTreeViewer.getTree().setTopItem(_fromTreeViewer.getTree().getItem(0));
      }

      //
      _centerViewer.refresh();
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
        return;
      }

      // Reset Selection in 'to' Viewer
      _toTreeViewer.setSelection(new StructuredSelection());

      //
      _selectedBackReferences = SourceOrTarget.SOURCE;

      //
      _incomingDependencySelector.setSelectedNodes(NodeType.SOURCE,
          StructuredSelectionUtils.selectedNodes(structuredSelection));

      //
      notifySelectedDependencies(_incomingDependencySelector.getFilteredCoreDependencies());

      //
      _centerViewer.refresh();
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
        return;
      }

      // Reset Selection in 'from' Viewer
      _fromTreeViewer.setSelection(new StructuredSelection());

      //
      _selectedBackReferences = SourceOrTarget.TARGET;

      //
      _outgoingDependencySelector.setSelectedNodes(NodeType.TARGET,
          StructuredSelectionUtils.selectedNodes(structuredSelection));

      //
      notifySelectedDependencies(_outgoingDependencySelector.getFilteredCoreDependencies());

      //
      _centerViewer.refresh();
    }
  }
}