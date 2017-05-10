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
package org.slizaa.ui.dsm;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;
import org.slizaa.ui.shared.AbstractSlizaaWorkbenchModelComponent;
import org.slizaa.ui.shared.context.BusyCursor;
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
public class DsmPart extends AbstractSlizaaWorkbenchModelComponent {

  /**
   * This is used as the DSMView's providerId for the xxxSelectionServices
   */
  public static String            DSM_ID = DsmPart.class.getName();

  /** - */
  private DsmViewWidget           _viewWidget;

  /** - */
  private DsmDetailComposite      _detailComposite;

  /** - */
  private int[]                   _selectedCell;

  /** - */
  private HGNode                  _fromArtifact;

  /** - */
  private HGNode                  _toArtifact;

  /** - */
  private IDsmContentProvider     _dsmContentProvider;

  /** - */
  private DelegatingLabelProvider _labelProvider;

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

          BusyCursor.execute(_viewWidget, () -> {
            //
            DependencySelection dependencySelection = SelectionFactory.eINSTANCE.createDependencySelection();
            dependencySelection.getDependencies().addAll(dependencies);
            getWorkbenchModel().setMainDependencySelection(dependencySelection);
          });

          _fromArtifact = (HGNode) _dsmContentProvider.getNodes()[event.getX()];
          _toArtifact = (HGNode) _dsmContentProvider.getNodes()[event.getY()];
        }
      }

    });

    //
      handleNodeSelectionChanged(null, getWorkbenchModel().getNodeSelection());
  }

  protected String getName(Object object) {
    return _labelProvider.getText(object);
  }

  
  
  @Override
  protected void handleNodeSelectionChanged(NodeSelection oldValue, NodeSelection newValue) {


    if (_viewWidget != null && _detailComposite != null && !_viewWidget.isDisposed()) {

      List<HGNode> selectedNodes = newValue != null ? newValue.getNodes() : Collections.emptyList();

      if (selectedNodes != null && !selectedNodes.isEmpty()) {
        _dsmContentProvider = new DefaultAnalysisModelElementDsmContentProvider(selectedNodes);
        INodeLabelProvider itemLabelProvider = selectedNodes.toArray(new HGNode[0])[0].getRootNode()
            .getExtension(INodeLabelProvider.class);
        _labelProvider.setItemLabelProvider(itemLabelProvider);
      } else {
        _dsmContentProvider = new DefaultAnalysisModelElementDsmContentProvider();
      }

      //
      _viewWidget.setModel(_dsmContentProvider);

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
    
    DependencySelection dependencySelection = SelectionFactory.eINSTANCE.createDependencySelection();
    getWorkbenchModel().setMainDependencySelection(dependencySelection);
  }
}
