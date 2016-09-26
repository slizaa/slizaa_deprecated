package org.slizaa.ui.xref.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emfforms.spi.swt.treemasterdetail.util.RootObject;
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
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.ui.common.context.ContextHelper;
import org.slizaa.ui.tree.IInterceptableLabelProvider;
import org.slizaa.ui.tree.SlizaaTreeFactory;
import org.slizaa.ui.tree.VisibleNodesFilter;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XRefComposite extends Composite {

  private HGRootNode                   _rootNode;

  /** the from tree viewer */
  private TreeViewer                   _fromTreeViewer;

  /** the center tree viewer */
  private TreeViewer                   _centerViewer;

  /** the to tree viewer */
  private TreeViewer                   _toTreeViewer;

  /** the label provider interceptor */
  private XRefLabelProviderInterceptor _labelProviderInterceptor;

  /** - */
  private IEclipseContext              _eclipseContext;

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
    _centerViewer.setSelection(new StructuredSelection());
    _fromTreeViewer.setSelection(new StructuredSelection());
    _toTreeViewer.setSelection(new StructuredSelection());

    // expand
    _centerViewer.expandToLevel(1);
    _fromTreeViewer.expandToLevel(1);
    _toTreeViewer.expandToLevel(1);

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

  void setSelectedCenterNodes(Collection<HGNode> selectedNodes) {

    // store the top item
    TreeItem toTreeTopItem = _toTreeViewer.getTree().getTopItem();
    TreeItem fromTreeTopItem = _fromTreeViewer.getTree().getTopItem();

    //
    Set<HGNode> toArtifacts = new HashSet<HGNode>();
    for (HGNode node : selectedNodes) {
      Collection<HGCoreDependency> toDependencies = node.getAccumulatedOutgoingCoreDependencies();
      for (HGCoreDependency dep : toDependencies) {
        toArtifacts.add(dep.getTo());
        toArtifacts.addAll(dep.getTo().getPredecessors());
      }
    }

    //
    Set<HGNode> fromArtifacts = new HashSet<HGNode>();
    for (HGNode node : selectedNodes) {
      Collection<HGCoreDependency> fromDependencies = node.getAccumulatedIncomingCoreDependencies();
      for (HGCoreDependency dep : fromDependencies) {
        fromArtifacts.add(dep.getFrom());
        fromArtifacts.addAll(dep.getFrom().getPredecessors());
      }
    }

    //
    VisibleNodesFilter.setVisibleArtifacts(_toTreeViewer, toArtifacts);
    VisibleNodesFilter.setVisibleArtifacts(_fromTreeViewer, fromArtifacts);

    setSelectedDependencies(Collections.emptyList());

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
  }

  /**
   * @param structuredSelection
   * @param to
   */
  void highlightSelectedDependencies(IStructuredSelection structuredSelection, boolean to) {

    // Detect highlighted artifacts
    List<HGNode> selectedNodes = selectedNodes(checkNotNull(structuredSelection));
    List<HGNode> selectedCenterNodes = selectedNodes((StructuredSelection) _centerViewer.getSelection());

    //
    List<HGCoreDependency> selectedDependencies = selectedNodes.stream()
        .flatMap(node -> to ? node.getOutgoingDependenciesTo(selectedCenterNodes).stream()
            : node.getIncomingDependenciesFrom(selectedCenterNodes).stream())
        .flatMap(aggregatedDependency -> aggregatedDependency.getCoreDependencies().stream())
        .collect(Collectors.toList());

    //
    Set<HGNode> referencedNodes = selectedDependencies.stream().flatMap((dependency) -> {
      HGNode node = to ? dependency.getTo() : dependency.getFrom();
      return Stream.concat(Stream.of(node), node.getPredecessors().stream());
    }).collect(Collectors.toSet());

    //
    _labelProviderInterceptor.setNodes(referencedNodes);
    setSelectedDependencies(selectedDependencies);

    //
    _centerViewer.refresh();
  }

  /**
   * <p>
   * </p>
   * 
   * @param selectedDetailDependencies
   */
  private void setSelectedDependencies(List<HGCoreDependency> dependencies) {
    Display.getDefault().syncExec(new Runnable() {
      @Override
      public void run() {
        try {
          Cursor cursor = Display.getDefault().getSystemCursor(SWT.CURSOR_WAIT);
          XRefComposite.this.setCursor(cursor);

          //
          ContextHelper.setValueInContext(_eclipseContext,
              SelectionIdentifier.CURRENT_MAIN_DEPENDENCY_SELECTION, dependencies);

        } finally {
          XRefComposite.this.setCursor(null);
        }
      }
    });
  }

  @SuppressWarnings("unchecked")
  static List<HGNode> selectedNodes(IStructuredSelection structuredSelection) {
    return (List<HGNode>) structuredSelection.toList().stream().filter((e) -> e instanceof HGNode)
        .collect(Collectors.toList());
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
    GridData data = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
    sashForm.setLayoutData(data);

    //
    _fromTreeViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 2);
    _centerViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 2);
    _toTreeViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 2);

    //
    _labelProviderInterceptor = new XRefLabelProviderInterceptor();
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
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private final class CenterArtifactsSelectionChangedListener implements ISelectionChangedListener {

    /**
     * {@inheritDoc}
     */
    @Override
    public void selectionChanged(SelectionChangedEvent event) {

      //
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();
      if (structuredSelection.isEmpty()) {
        return;
      }

      // don't highlight anything
      _labelProviderInterceptor.setNodes(null);

      // reset selections in from and to viewer
      _fromTreeViewer.setSelection(new StructuredSelection());
      _toTreeViewer.setSelection(new StructuredSelection());

      //
      setSelectedCenterNodes(selectedNodes(structuredSelection));

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
      highlightSelectedDependencies(structuredSelection, true);
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
      highlightSelectedDependencies(structuredSelection, false);
    }
  }
}