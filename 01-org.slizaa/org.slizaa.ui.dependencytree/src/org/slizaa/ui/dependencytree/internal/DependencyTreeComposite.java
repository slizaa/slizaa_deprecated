/*******************************************************************************
 * Copyright (c) Gerd Wütherich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd Wütherich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.ui.dependencytree.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emfforms.spi.swt.treemasterdetail.util.RootObject;
import org.eclipse.jface.viewers.IBaseLabelProvider;
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
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.hierarchicalgraph.selection.selector.DefaultDependencySelector;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelector.NodeType;
import org.slizaa.ui.common.context.ContextHelper;
import org.slizaa.ui.dependencytree.internal.expand.IExpandStrategy;
import org.slizaa.ui.tree.IEventInterceptor;
import org.slizaa.ui.tree.IInterceptableLabelProvider;
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

  /** - */
  private DefaultDependencySelector          _selector;

  /** - */
  private IExpandStrategy                    _fromExpandStrategy;

  /** - */
  private IExpandStrategy                    _toExpandStrategy;

  /** - */
  private IEclipseContext                    _eclipseContext;

  /** - */
  private boolean                            _filterSource;

  /** - */
  private boolean                            _filterTarget;

  /**
   * <p>
   * Creates a new instance of type {@link DependencyTreeComposite}.
   * </p>
   * 
   * @param parent
   */
  public DependencyTreeComposite(Composite parent, String providerId, IExpandStrategy fromExpandStrategy,
      IExpandStrategy toExpandStrategy, IEclipseContext eclipseContext) {
    super(parent, SWT.NONE);

    // _providerId = checkNotNull(providerId);
    _fromExpandStrategy = checkNotNull(fromExpandStrategy);
    _toExpandStrategy = checkNotNull(toExpandStrategy);
    _eclipseContext = eclipseContext;
    _selector = new DefaultDependencySelector();

    _selector.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent evt) {
        _fromTreeViewer.refresh();
        _toTreeViewer.refresh();
      }
    });

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
    _selector.setDependencies(dependencies);

    //
    _fromTreeViewer.collapseAll();
    _toTreeViewer.collapseAll();

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
    _fromTreeViewer.setSelection(null);
    _toTreeViewer.setSelection(null);

    expandArtifacts(_fromTreeViewer, _selector.getNodesWithParents(NodeType.SOURCE, false));
    expandArtifacts(_toTreeViewer, _selector.getNodesWithParents(NodeType.TARGET, false));
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
    SashForm sashForm = new SashForm(this, SWT.HORIZONTAL);
    GridData data = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
    sashForm.setLayoutData(data);

    //
    _fromTreeViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 3,
        new IEventInterceptor() {
          @Override
          public void handleSelect(HGNode node) {
            List<HGCoreDependency> dependencies = _selector.getDependenciesWithSourceNode(node);
            if (dependencies != null) {
              dependencies.stream().filter(dep -> dep instanceof HGAggregatedCoreDependency)
                  .map(dep -> (HGAggregatedCoreDependency) dep).forEach(dep -> dep.resolveAggregatedCoreDependencies());
            }
          }

          @Override
          public void handleTreeExpand(HGNode node) {
            List<HGCoreDependency> dependencies = _selector.getDependenciesWithSourceNode(node);
            if (dependencies != null) {
              dependencies.stream().filter(dep -> dep instanceof HGAggregatedCoreDependency)
                  .map(dep -> (HGAggregatedCoreDependency) dep).forEach(dep -> dep.resolveAggregatedCoreDependencies());
            }
          }

          @Override
          public void handleTreeCollapse(HGNode node) {
            // nothing
          }
        });

    _toTreeViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 3,
        new IEventInterceptor() {
          @Override
          public void handleSelect(HGNode node) {
            List<HGCoreDependency> dependencies = _selector.getDependenciesWithTargetNode(node);
            if (dependencies != null) {
              dependencies.stream().filter(dep -> dep instanceof HGAggregatedCoreDependency)
                  .map(dep -> (HGAggregatedCoreDependency) dep).forEach(dep -> dep.resolveAggregatedCoreDependencies());
            }
          }

          @Override
          public void handleTreeExpand(HGNode node) {
            List<HGCoreDependency> dependencies = _selector.getDependenciesWithTargetNode(node);
            if (dependencies != null) {
              dependencies.stream().filter(dep -> dep instanceof HGAggregatedCoreDependency)
                  .map(dep -> (HGAggregatedCoreDependency) dep).forEach(dep -> dep.resolveAggregatedCoreDependencies());
            }
          }

          @Override
          public void handleTreeCollapse(HGNode node) {
            // nothing
          }
        });

    IBaseLabelProvider labelProvider = _fromTreeViewer.getLabelProvider();
    if (labelProvider instanceof IInterceptableLabelProvider) {
      ((IInterceptableLabelProvider) labelProvider)
          .setLabelProviderInterceptor(new SelectedNodesLabelProviderInterceptor(() -> {
            return _selector.getNodesWithParents(NodeType.SOURCE, _filterSource);
          }));
    }

    labelProvider = _toTreeViewer.getLabelProvider();
    if (labelProvider instanceof IInterceptableLabelProvider) {
      ((IInterceptableLabelProvider) labelProvider)
          .setLabelProviderInterceptor(new SelectedNodesLabelProviderInterceptor(() -> {
            return _selector.getNodesWithParents(NodeType.TARGET, _filterTarget);
          }));
    }

    //
    _fromTreeViewer.setFilters(new VisibleNodesFilter(() -> {
      return _selector.getNodesWithParents(NodeType.SOURCE, false);
    }));

    _toTreeViewer.setFilters(new VisibleNodesFilter(() -> {
      return _selector.getNodesWithParents(NodeType.TARGET, false);
    }));

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
  private void setSelectedDetailDependencies(Collection<HGCoreDependency> dependencies) {
    ContextHelper.setValueInContext(_eclipseContext, SelectionIdentifier.CURRENT_DETAIL_DEPENDENCY_SELECTION,
        new ArrayList<>(dependencies));
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
        _selector.setSelectedNodes(NodeType.SOURCE, SelectionUtil.toArtifactList(structuredSelection));
        _filterSource = false;
        _filterTarget = true;
        setSelectedDetailDependencies(_selector.getFilteredCoreDependencies());

        // set the top item again
        if (treeItem != null && !treeItem.isDisposed()) {
          _toTreeViewer.getTree().setTopItem(treeItem);
        } else if (_toTreeViewer.getTree().getItemCount() > 0) {
          _toTreeViewer.getTree().setTopItem(_toTreeViewer.getTree().getItem(0));
        }

      } else {
        _filterSource = false;
        _filterTarget = false;
        setSelectedDetailDependencies(_selector.getUnfilteredCoreDependencies());
      }

      _fromTreeViewer.refresh(true);
      _toTreeViewer.refresh(true);
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
        _selector.setSelectedNodes(NodeType.TARGET, SelectionUtil.toArtifactList(structuredSelection));
        _filterSource = true;
        _filterTarget = false;
        setSelectedDetailDependencies(_selector.getFilteredCoreDependencies());

        // set the top item again
        try {
          _fromTreeViewer.getTree().setTopItem(treeItem);
        } catch (Exception e) {
          //
        }
      } else {
        _filterSource = false;
        _filterTarget = false;
        setSelectedDetailDependencies(_selector.getUnfilteredCoreDependencies());
      }

      _fromTreeViewer.refresh(true);
      _toTreeViewer.refresh(true);
    }

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
