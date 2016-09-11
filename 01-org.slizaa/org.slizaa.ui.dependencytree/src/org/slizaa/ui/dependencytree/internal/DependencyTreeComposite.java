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

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emfforms.spi.swt.treemasterdetail.util.RootObject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.algorithms.DependencySelector;
import org.slizaa.hierarchicalgraph.algorithms.DependencySelector.SourceOrTarget;
import org.slizaa.selection.IHierarchicalGraphSelectionService;
import org.slizaa.ui.dependencytree.internal.expand.IExpandStrategy;
import org.slizaa.ui.tree.SlizaaTreeFactory;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencyTreeComposite extends Composite {

  /** - */
  private static final Set<HGCoreDependency> EMPTY_DEPENDENCY_SET = Collections.emptySet();

  /** the from tree viewer */
  private TreeViewer                         _fromTreeViewer;

  /** the to tree viewer */
  private TreeViewer                         _toTreeViewer;

  /** the to tree viewer */
  private TreeViewer                         _currentlySelectedTreeViewer;

  /** - */
  private DependencySelector                 _selector;

  /** - */
  private IExpandStrategy                    _fromExpandStrategy;

  /** - */
  private IExpandStrategy                    _toExpandStrategy;

  /** - */
  private boolean                            _showReferenceCount;

  private IHierarchicalGraphSelectionService _selectionService;

  /**
   * <p>
   * Creates a new instance of type {@link DependencyTreeComposite}.
   * </p>
   * 
   * @param parent
   */
  public DependencyTreeComposite(Composite parent, String providerId, IExpandStrategy fromExpandStrategy,
      IExpandStrategy toExpandStrategy, boolean showReferenceCount,
      IHierarchicalGraphSelectionService selectionService) {
    super(parent, SWT.NONE);

    // _providerId = checkNotNull(providerId);
    _fromExpandStrategy = checkNotNull(fromExpandStrategy);
    _toExpandStrategy = checkNotNull(toExpandStrategy);
    _showReferenceCount = showReferenceCount;
    _selectionService = selectionService;

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
    _selector = new DependencySelector(dependencies);

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
    _fromTreeViewer.collapseAll();
    _toTreeViewer.collapseAll();

    // update 'from' and 'to' tree, no filtering
    VisibleAnalysisModelElementsFilter.setVisibleArtifacts(_fromTreeViewer,
        _selector.getUnfilteredElementsWithParents(SourceOrTarget.SOURCE));
    VisibleAnalysisModelElementsFilter.setVisibleArtifacts(_toTreeViewer,
        _selector.getUnfilteredElementsWithParents(SourceOrTarget.TARGET));

    //
    _fromTreeViewer.setSelection(null);
    _toTreeViewer.setSelection(null);

    expandArtifacts(_fromTreeViewer, _selector.getUnfilteredElementsWithParents(SourceOrTarget.SOURCE));
    expandArtifacts(_toTreeViewer, _selector.getUnfilteredElementsWithParents(SourceOrTarget.TARGET));
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public final Set<HGCoreDependency> getSelectedDetailDependencies() {
    return _selector != null ? _selector.getFilteredDependencies() : EMPTY_DEPENDENCY_SET;
  }

  /**
   * Set wether reference count should by displayed on nodes
   * 
   * @param showReferenceCount
   */
  public void setShowReferenceCount(boolean showReferenceCount) {
    if (_showReferenceCount != showReferenceCount) {
      _showReferenceCount = showReferenceCount;

      _fromTreeViewer.refresh(true);
      _toTreeViewer.refresh(true);
    }
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
    _fromTreeViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI);
    _toTreeViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI);

    // add SelectionListeners
    _fromTreeViewer.addSelectionChangedListener(new FromArtifactsSelectionChangedListener());
    _toTreeViewer.addSelectionChangedListener(new ToArtifactSelectionChangedListener());

    //
    _fromExpandStrategy.init(_fromTreeViewer);
    _toExpandStrategy.init(_toTreeViewer);
  }

  /**
   * <p>
   * </p>
   * 
   * @param selectedDetailDependencies
   */
  private void setSelectedDetailDependencies(Set<HGCoreDependency> dependencies) {

    //
    if (propagateSelectedDetailDependencies() && !dependencies.isEmpty()) {
      _selectionService.setCurrentDependencySelection(DependencyTreePart.ID, dependencies.toArray(new HGCoreDependency[0]));
    }
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  protected boolean propagateSelectedDetailDependencies() {
    return true;
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

      //
      if (!structuredSelection.isEmpty() && _currentlySelectedTreeViewer != _fromTreeViewer) {
        fromViewerSelected(_fromTreeViewer, _toTreeViewer);
        _currentlySelectedTreeViewer = _fromTreeViewer;
      }

      // check for selected root element
      boolean containsRoot = false;
      for (Object object : structuredSelection.toList()) {
        if (object instanceof HGRootNode) {
          containsRoot = true;
          break;
        }
      }

      if (structuredSelection.size() > 0 && !containsRoot) {

        // store the top item
        TreeItem treeItem = _toTreeViewer.getTree().getTopItem();

        //
        _selector.setSelectedElements(SourceOrTarget.SOURCE, SelectionUtil.toArtifactList(structuredSelection));
        VisibleAnalysisModelElementsFilter.setVisibleArtifacts(_toTreeViewer,
            _selector.getFilteredElementsWithParents(SourceOrTarget.TARGET));
        setSelectedDetailDependencies(_selector.getFilteredDependencies());

        //
        expandArtifacts(_toTreeViewer, _selector.getFilteredElementsWithParents(SourceOrTarget.TARGET));

        // set the top item again
        if (treeItem != null && !treeItem.isDisposed()) {
          _toTreeViewer.getTree().setTopItem(treeItem);
        } else if (_toTreeViewer.getTree().getItemCount() > 0) {
          _toTreeViewer.getTree().setTopItem(_toTreeViewer.getTree().getItem(0));
        }

      } else {
        VisibleAnalysisModelElementsFilter.setVisibleArtifacts(_toTreeViewer,
            _selector.getUnfilteredElementsWithParents(SourceOrTarget.TARGET));
        setSelectedDetailDependencies(_selector.getUnfilteredDependencies());
      }
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
      if (!structuredSelection.isEmpty() && _currentlySelectedTreeViewer != _toTreeViewer) {
        toViewerSelected(_fromTreeViewer, _toTreeViewer);
        _currentlySelectedTreeViewer = _toTreeViewer;
      }

      // check for selected root element
      boolean containsRoot = false;
      for (Object object : structuredSelection.toList()) {
        if (object instanceof HGRootNode) {
          containsRoot = true;
          break;
        }
      }

      if (structuredSelection.size() > 0 && !containsRoot) {

        // store the top item
        TreeItem treeItem = _fromTreeViewer.getTree().getTopItem();

        //
        _selector.setSelectedElements(SourceOrTarget.TARGET, SelectionUtil.toArtifactList(structuredSelection));
        VisibleAnalysisModelElementsFilter.setVisibleArtifacts(_fromTreeViewer,
            _selector.getFilteredElementsWithParents(SourceOrTarget.SOURCE));
        setSelectedDetailDependencies(_selector.getFilteredDependencies());

        //
        expandArtifacts(_fromTreeViewer, _selector.getFilteredElementsWithParents(SourceOrTarget.SOURCE));

        // set the top item again
        try {
          _fromTreeViewer.getTree().setTopItem(treeItem);
        } catch (Exception e) {
          //
        }
      } else {
        VisibleAnalysisModelElementsFilter.setVisibleArtifacts(_fromTreeViewer,
            _selector.getUnfilteredElementsWithParents(SourceOrTarget.SOURCE));
        setSelectedDetailDependencies(_selector.getUnfilteredDependencies());
      }
    }

  }

  /**
   * <p>
   * </p>
   * 
   * @param toTreeViewer
   * @param fromTreeViewer
   */
  protected void toViewerSelected(TreeViewer fromTreeViewer, TreeViewer toTreeViewer) {

  }

  /**
   * <p>
   * </p>
   * 
   * @param fromTreeViewer
   * @param toTreeViewer
   */
  protected void fromViewerSelected(TreeViewer fromTreeViewer, TreeViewer toTreeViewer) {

  }

  /**
   * <p>
   * </p>
   * 
   * @param visibleArtifactsFilter
   * 
   */
  private void expandArtifacts(final TreeViewer treeViewer, final Set<HGNode> visibleElements) {
    Assert.isNotNull(treeViewer);

    // return if no expand strategy has been set
    if (treeViewer == _fromTreeViewer && _fromExpandStrategy == null) {
      return;
    }

    //
    if (treeViewer == _toTreeViewer && _toExpandStrategy == null) {
      return;
    }

    // disable redraw (performance)
    treeViewer.getTree().setRedraw(false);

    //
    if (treeViewer == _fromTreeViewer) {
      _fromExpandStrategy.expandTreeViewer(visibleElements);
    } else if (treeViewer == _toTreeViewer) {
      _toExpandStrategy.expandTreeViewer(visibleElements);
    }

    // enable redraw (performance)
    treeViewer.getTree().setRedraw(true);
  }
}
