/*******************************************************************************
 * Copyright (c) Gerd W�therich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd W�therich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.ui.dependencytree.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Supplier;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.hierarchicalgraph.selection.selector.DefaultDependencySelector;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelector;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelectorListener;
import org.slizaa.hierarchicalgraph.selection.selector.SelectedNodesChangedEvent;
import org.slizaa.hierarchicalgraph.selection.selector.UnfilteredDependenciesChangedEvent;
import org.slizaa.ui.shared.SlizaaCommonColors;
import org.slizaa.ui.shared.context.RootObject;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;
import org.slizaa.ui.tree.VisibleNodesFilter;
import org.slizaa.ui.tree.expand.DefaultExpandStrategy;
import org.slizaa.ui.tree.expand.IExpandStrategy;
import org.slizaa.ui.tree.interceptors.DependencyResolvingTreeEventInterceptor;
import org.slizaa.ui.tree.interceptors.IInterceptableLabelProvider;
import org.slizaa.ui.tree.interceptors.SelectedNodesLabelProviderInterceptor;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencyTreeComposite extends Composite {

  public static final String                 SLIZAA_ID_DEPENDENCY_TREE_TO_TREE   = "dependency-tree-to-tree";

  public static final String                 SLIZAA_ID_DEPENDENCY_TREE_FROM_TREE = "dependency-tree-from-tree";

  /** - */
  private static final Set<HGCoreDependency> EMPTY_DEPENDENCY_SET                = Collections.emptySet();

  /** the from tree viewer */
  private TreeViewer                         _fromTreeViewer;

  /** the to tree viewer */
  private TreeViewer                         _toTreeViewer;

  /** - */
  private IDependencySelector                _selector;

  /** - */
  private IExpandStrategy                    _fromExpandStrategy;

  /** - */
  private IExpandStrategy                    _toExpandStrategy;

  /** - */
  private Supplier<IEclipseContext>          _eclipseContextSupplier;

  /**
   * <p>
   * Creates a new instance of type {@link DependencyTreeComposite}.
   * </p>
   * 
   * @param parent
   */
  public DependencyTreeComposite(Composite parent, Supplier<IEclipseContext> eclipseContextSupplier) {
    super(parent, SWT.NONE);

    // TODO
    _fromExpandStrategy = new DefaultExpandStrategy(
        (node) -> DefaultExpandStrategy.hasUnresolvedProxyDependencies(node.getOutgoingCoreDependencies()));
    _toExpandStrategy = new DefaultExpandStrategy(
        (node) -> DefaultExpandStrategy.hasUnresolvedProxyDependencies(node.getIncomingCoreDependencies()));

    //
    _eclipseContextSupplier = eclipseContextSupplier;
    _selector = new DefaultDependencySelector();

    //
    _selector.addDependencySelectorListener(new IDependencySelectorListener.Adapter() {

      @Override
      public void unfilteredDependenciesChanged(UnfilteredDependenciesChangedEvent event) {

        // TODO: update!
        _fromTreeViewer.refresh();
        _toTreeViewer.refresh();

        //
        broadcastDetailDependencies(_selector.getFilteredCoreDependencies());
      }

      @Override
      public void selectedNodesChanged(SelectedNodesChangedEvent event) {

        // TODO: update!
        _fromTreeViewer.refresh();
        _toTreeViewer.refresh();

        // //
        // _fromExpandStrategy.expand(_selector.getFilteredSourceNodesWithParents());
        // _toExpandStrategy.expand(_selector.getFilteredTargetNodesWithParents());

        //
        broadcastDetailDependencies(_selector.getFilteredCoreDependencies());
      }
      //
      // @Override
      // public void proxyDependencyChanged(ProxyDependencyChangedEvent event) {
      // _fromTreeViewer.refresh();
      // _toTreeViewer.refresh();
      // }
    });

    //
    init();
  }

  /**
   * <p>
   * </p>
   * 
   * @param dependencies
   */
  public void setDependencies(Collection<HGCoreDependency> dependencies) {

    //
    _selector.setUnfilteredCoreDependencies(dependencies);

    //
    // _fromTreeViewer.collapseAll();
    // _toTreeViewer.collapseAll();

    // set the root if necessary...
    if (dependencies.size() > 0) {
      HGRootNode rootNode = dependencies.toArray(new AbstractHGDependency[0])[0].getFrom().getRootNode();
      if (!rootNode.equals(_fromTreeViewer.getInput()) && !rootNode.equals(_toTreeViewer.getInput())) {
        _fromTreeViewer.setInput(new RootObject(rootNode));
        _toTreeViewer.setInput(new RootObject(rootNode));
      }
    }
    // ... set input to null if no dependencies are defined
    else {
      _fromTreeViewer.setInput(null);
      _toTreeViewer.setInput(null);
    }

    //
    // _fromTreeViewer.setSelection(null);
    // _toTreeViewer.setSelection(null);

    // //
    // _fromExpandStrategy.expand(_selector.getUnfilteredSourceNodesWithParents());
    // _toExpandStrategy.expand(_selector.getUnfilteredTargetNodesWithParents());
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public final Set<HGCoreDependency> getSelectedDetailDependencies() {
    return _selector != null ? _selector.getFilteredCoreDependencies() : EMPTY_DEPENDENCY_SET;
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
    SashForm sashForm = new SashForm(this, SWT.HORIZONTAL | SWT.SMOOTH);
    sashForm.setBackground(SlizaaCommonColors.getSashBackgroundColor());
    GridData data = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
    sashForm.setLayoutData(data);

    //
    _fromTreeViewer = SlizaaTreeViewerFactory.createTreeViewer(sashForm, SWT.NO_BACKGROUND | SWT.MULTI, 3,
        new DependencyResolvingTreeEventInterceptor((node) -> _selector.getDependenciesForSourceNode(node)));

    _fromTreeViewer.getTree().setData("slizaa-id", SLIZAA_ID_DEPENDENCY_TREE_FROM_TREE);

    if (_fromTreeViewer.getLabelProvider() instanceof IInterceptableLabelProvider) {
      ((IInterceptableLabelProvider) _fromTreeViewer.getLabelProvider()).setLabelProviderInterceptor(
          new SelectedNodesLabelProviderInterceptor(() -> _selector.getSelectedTargetNodes().isEmpty()
              ? Collections.emptyList() : _selector.getFilteredSourceNodes()));
    }

    //
    _toTreeViewer = SlizaaTreeViewerFactory.createTreeViewer(sashForm, SWT.NO_BACKGROUND | SWT.MULTI, 3,
        new DependencyResolvingTreeEventInterceptor((node) -> _selector.getDependenciesForTargetNode(node)));

    _toTreeViewer.getTree().setData("slizaa-id", SLIZAA_ID_DEPENDENCY_TREE_TO_TREE);

    if (_toTreeViewer.getLabelProvider() instanceof IInterceptableLabelProvider) {
      ((IInterceptableLabelProvider) _toTreeViewer.getLabelProvider()).setLabelProviderInterceptor(
          new SelectedNodesLabelProviderInterceptor(() -> _selector.getSelectedSourceNodes().isEmpty()
              ? Collections.emptyList() : _selector.getFilteredTargetNodes()));
    }

    //
    _fromTreeViewer.setFilters(new VisibleNodesFilter(() -> _selector.getUnfilteredSourceNodes(), false));
    _toTreeViewer.setFilters(new VisibleNodesFilter(() -> _selector.getUnfilteredTargetNodes(), false));

    // add SelectionListeners
    _fromTreeViewer.addSelectionChangedListener(new FromArtifactsSelectionChangedListener());
    _toTreeViewer.addSelectionChangedListener(new ToArtifactSelectionChangedListener());

    // //
    // _fromExpandStrategy.init(_fromTreeViewer);
    // _toExpandStrategy.init(_toTreeViewer);
  }

  /**
   * <p>
   * </p>
   * 
   * @param selectedDetailDependencies
   */
  private void broadcastDetailDependencies(Set<HGCoreDependency> dependencies) {

    //
    DependencySelection dependencySelection = SelectionFactory.eINSTANCE.createDependencySelection();
    dependencySelection.getDependencies().addAll(dependencies);
    _eclipseContextSupplier.get().declareModifiable(SelectionIdentifier.CURRENT_DETAIL_DEPENDENCY_SELECTION);
    _eclipseContextSupplier.get().set(SelectionIdentifier.CURRENT_DETAIL_DEPENDENCY_SELECTION, dependencySelection);
  }

  /**
   * <p>
   * </p>
   * 
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private final class FromArtifactsSelectionChangedListener implements ISelectionChangedListener {

    @Override
    public void selectionChanged(SelectionChangedEvent event) {

      //
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();
      if (structuredSelection.isEmpty()) {
        return;
      }

      _selector.setSelectedSourceNodes(SelectionUtil.toArtifactList(structuredSelection));

      if (_selector.getFilteredSourceNodes().isEmpty() || _selector.getFilteredTargetNodes().isEmpty()) {
        System.out.println("HAE?");
      }

      // // check for selected root element
      // boolean containsRoot = false;
      // for (Object object : structuredSelection.toList()) {
      // if (object instanceof HGRootNode) {
      // containsRoot = true;
      // break;
      // }
      // }
      //
      // if (structuredSelection.size() > 0 && !containsRoot) {
      //
      // // store the top item
      // TreeItem treeItem = _toTreeViewer.getTree().getTopItem();
      //
      // //
      // _selector.setSelectedSourceNodes(SelectionUtil.toArtifactList(structuredSelection));
      // broadcastDetailDependencies(_selector.getFilteredCoreDependencies());
      //
      // // set the top item again
      // if (treeItem != null && !treeItem.isDisposed()) {
      // _toTreeViewer.getTree().setTopItem(treeItem);
      // } else if (_toTreeViewer.getTree().getItemCount() > 0) {
      // _toTreeViewer.getTree().setTopItem(_toTreeViewer.getTree().getItem(0));
      // }
      //
      // } else {
      // broadcastDetailDependencies(_selector.getUnfilteredCoreDependencies());
      // }
      //
      // _fromTreeViewer.refresh(true);
      // _toTreeViewer.refresh(true);

      //
      // _toExpandStrategy.expand(_selector.getNodesWithParents(NodeType.TARGET, _filterTarget));
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
      if (structuredSelection.isEmpty()) {
        return;
      }

      _selector.setSelectedTargetNodes(SelectionUtil.toArtifactList(structuredSelection));

      if (_selector.getFilteredSourceNodes().isEmpty() || _selector.getFilteredTargetNodes().isEmpty()) {
        System.out.println("HAE?");
      }

      // // check for selected root element
      // boolean containsRoot = false;
      // for (Object object : structuredSelection.toList()) {
      // if (object instanceof HGRootNode) {
      // containsRoot = true;
      // break;
      // }
      // }
      //
      // if (structuredSelection.size() > 0) {
      //
      // // store the top item
      // TreeItem treeItem = _fromTreeViewer.getTree().getTopItem();
      //
      // //
      // _selector.setSelectedTargetNodes(SelectionUtil.toArtifactList(structuredSelection));
      // setSelectedDetailDependencies(_selector.getFilteredCoreDependencies());
      //
      // // set the top item again
      // try {
      // _fromTreeViewer.getTree().setTopItem(treeItem);
      // } catch (Exception e) {
      // //
      // }
      // } else {
      //
      // setSelectedDetailDependencies(_selector.getUnfilteredCoreDependencies());
      // }
      //
      // _fromTreeViewer.refresh(true);
      // _toTreeViewer.refresh(true);

      //
      // _fromExpandStrategy.expand(_selector.getSourceWithParents(SourceOrTarget.SOURCE, _filterSource));
    }

  }
}
