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
package org.slizaa.ui.dsm;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.selection.IHierarchicalGraphSelection;
import org.slizaa.selection.IHierarchicalGraphSelectionListener;
import org.slizaa.selection.IHierarchicalGraphSelectionService;
import org.slizaa.selection.INodeSelection;
import org.slizaa.ui.widget.dsm.DsmViewWidget;
import org.slizaa.ui.widget.dsm.IDsmContentProvider;
import org.slizaa.ui.widget.dsm.IMatrixListener;
import org.slizaa.ui.widget.dsm.MatrixEvent;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DsmPart implements IHierarchicalGraphSelectionListener {

  /**
   * This is used as the DSMView's providerId for the xxxSelectionServices
   */
  public static String                       DSM_EDITOR_ID = DsmPart.class.getName();

  /** - */
  private DsmViewWidget                      _viewWidget;

  /** - */
  private DsmDetailComposite                 _detailComposite;

  /** - */
  private int[]                              _selectedCell;

  /** - */
  private HGNode                             _fromArtifact;

  /** - */
  private HGNode                             _toArtifact;

  /** - */
  private IDsmContentProvider                _dsmContentProvider;

  /** - */
  private DelegatingLabelProvider            _labelProvider;

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
    parent.setLayout(new GridLayout(1, false));

    //
    _labelProvider = new DelegatingLabelProvider();
    _dsmContentProvider = new DefaultAnalysisModelElementDsmContentProvider();

    //
    _viewWidget = new DsmViewWidget(_dsmContentProvider, _labelProvider, new DefaultDependencyLabelProvider(), parent);
    GridDataFactory.swtDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(_viewWidget);
    _viewWidget.setZoom((50 + 10) * 0.02f);

    //
    _detailComposite = new DsmDetailComposite(parent);

    GridDataFactory.swtDefaults().grab(true, false).align(SWT.FILL, SWT.CENTER).applyTo(_detailComposite);
    setDefaultDependencyDescription();

    //
    _viewWidget.addMatrixListener(new IMatrixListener.Adapter() {

      @Override
      public void marked(MatrixEvent event) {

        // TODO!
        if (isCellSelected(event)) {

          HGAggregatedDependency dependency = (HGAggregatedDependency) _dsmContentProvider.getDependency(event.getX(),
              event.getY());

          if (dependency != null) {
            _detailComposite.setLabel(Integer.toString(dependency.getAggregatedWeight()),
                getName(_dsmContentProvider.getNodes()[event.getY()]),
                getName(_dsmContentProvider.getNodes()[event.getX()]));

            return;
          }
          // }
          //
          //
          // else if (_selectedCell != null) {
          // // TODO: use models
          // _detailComposite.getSelectionCountLabel().setText(Integer.toString(dependency.getWeight()));
          // _detailComposite.getSelectionCountLabel().setText(
          // getNullSafeString(_viewWidget.getDependenciesAsStrings()[_selectedCell[0]][_selectedCell[1]], "0"));
          // _detailComposite.getFromLabel().setText(getName(_dsmContentProvider.getNodes()[_selectedCell[1]]));
          // _detailComposite.getToLabel().setText(getName(_dsmContentProvider.getNodes()[_selectedCell[0]]));
        }

        setDefaultDependencyDescription();
      }

      /**
       * {@inheritDoc}
       */
      @Override
      public void singleClick(MatrixEvent event) {
        if (isCellSelected(event)) {

          _selectedCell = new int[] { event.getX(), event.getY() };

          HGAggregatedDependency dependency = (HGAggregatedDependency) _dsmContentProvider.getDependency(event.getX(),
              event.getY());

          final List<HGAggregatedDependency> dependencies = new LinkedList<>();
          if (dependency != null) {
            dependencies.add(dependency);
          }

          Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
              try {
                Cursor cursor = Display.getDefault().getSystemCursor(SWT.CURSOR_WAIT);
                _viewWidget.setCursor(cursor);
                _hierarchicalGraphSelectionService.setCurrentDependencySelection(DSM_EDITOR_ID, dependencies);
              } finally {
                _viewWidget.setCursor(null);
              }
            }
          });

          _fromArtifact = (HGNode) _dsmContentProvider.getNodes()[event.getX()];
          _toArtifact = (HGNode) _dsmContentProvider.getNodes()[event.getY()];
        }
      }
    });

    // create the context menu
    // createContextMenu(_viewWidget);
    _hierarchicalGraphSelectionService.addHierarchicalGraphSelectionListener(this);
  }

  protected String getName(Object object) {
    return _labelProvider.getText(object);
  }

  /**
   * <p>
   * </p>
   */
  @PreDestroy
  public void dispose() {
    _hierarchicalGraphSelectionService.removeHierarchicalGraphSelectionListener(this);
  }

  @Override
  public String getSelectionProviderId() {
    return DSM_EDITOR_ID;
  }

  @Override
  public void currentSelectionChanged(IHierarchicalGraphSelection selection) {
    initSelection(selection);
  }

  private void initSelection(IHierarchicalGraphSelection selection) {

    if (_viewWidget != null && _detailComposite != null) {

      //
      INodeSelection nodeSelection = selection.cast(INodeSelection.class);

      if (nodeSelection != null && !nodeSelection.getSelectedNodes().isEmpty()) {

        //
        _dsmContentProvider = new DefaultAnalysisModelElementDsmContentProvider(nodeSelection.getSelectedNodes());

        //
        IItemLabelProvider itemLabelProvider = nodeSelection.getSelectedNodes().get(0).getRootNode()
            .getExtension(IItemLabelProvider.class);
        _labelProvider.setItemLabelProvider(itemLabelProvider);

      } else {
        _dsmContentProvider = new DefaultAnalysisModelElementDsmContentProvider();
      }

      // _artifactLabelProvider.setLabelPresentationMode(_detailComposite.getLabelPresentationMode());
      _viewWidget.setModel(_dsmContentProvider);

      //

      // clear the dependency selection
      resetDependencySelection();

      setDefaultDependencyDescription();
    }
  }

  private boolean isCellSelected(MatrixEvent event) {
    return event.getX() <= _dsmContentProvider.getItemCount() && event.getX() >= 0
        && event.getY() <= _dsmContentProvider.getItemCount() && event.getY() >= 0;
  }

  /**
   * <p>
   * </p>
   * 
   */
  private void setDefaultDependencyDescription() {
    _detailComposite.unsetLabel();
  }

  private void resetDependencySelection() {

    //
    List<?> artifacts = Arrays.asList(_dsmContentProvider.getNodes());

    //
    if (_fromArtifact == null || _toArtifact == null || !artifacts.contains(_fromArtifact)
        || !artifacts.contains(_toArtifact)) {

      //
      clearDependencySelection();
    }

    //
    else {

      //
      _selectedCell = new int[] { artifacts.indexOf(_fromArtifact), artifacts.indexOf(_toArtifact) };

      HGAggregatedDependency dependency = (HGAggregatedDependency) _dsmContentProvider.getDependency(_selectedCell[0],
          _selectedCell[1]);

      // Selection.instance().getDependencySelectionService().setSelection(Selection.MAIN_DEPENDENCY_SELECTION_ID,
      // DsmPart.DSM_EDITOR_ID, dependency);
    }
  }

  private void clearDependencySelection() {
    _selectedCell = null;
    List<HGAggregatedDependency> dependencies = Collections.emptyList();
    // Selection.instance().getDependencySelectionService().setSelection(Selection.MAIN_DEPENDENCY_SELECTION_ID,
    // DSM_EDITOR_ID, dependencies);
  }

  private String getNullSafeString(String string, String defaultValue) {
    checkNotNull(defaultValue);
    return string != null ? string : defaultValue;
  }
}
