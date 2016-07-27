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
package org.slizaa.ui.dependencytable;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.util.HierarchicalGraphUtils;
import org.slizaa.selection.IDependencySelection;
import org.slizaa.selection.IHierarchicalGraphSelection;
import org.slizaa.selection.IHierarchicalGraphSelectionListener;
import org.slizaa.selection.IHierarchicalGraphSelectionService;

public class DependencyTablePart implements IHierarchicalGraphSelectionListener {

  /** - */
  public static final String                 ID                    = DependencyTablePart.class.getName();

  /** - */
  private TableViewer                        _viewer;

  /** Comparator used to sort the columns */
  private DependencyComparator               _dependencyComparator;

  /** - */
  private ArtifactPathLabelGenerator         _fromLabelGenerator   = new ArtifactPathLabelGenerator();

  /** - */
  private ArtifactPathLabelGenerator         _toLabelGenerator     = new ArtifactPathLabelGenerator();

  /** - */
  @Inject
  private IHierarchicalGraphSelectionService _selectionService;

  @PostConstruct
  public void createComposite(Composite parent) {
    FillLayout fillLayout = new FillLayout();
    fillLayout.type = SWT.VERTICAL;

    parent.setLayout(fillLayout);

    Composite tableComposite = new Composite(parent, SWT.NONE);
    tableComposite.setLayout(new TableColumnLayout());

    _dependencyComparator = new DependencyComparator(_fromLabelGenerator, _toLabelGenerator);

    _viewer = new TableViewer(tableComposite,
        SWT.VIRTUAL | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.MULTI);
    final Table table = _viewer.getTable();
    table.setHeaderVisible(true);
    table.setLinesVisible(true);
    _viewer.setContentProvider(new LazyDependencyProvider(_viewer));

    createColumns(tableComposite, _viewer);

    // open editor on double click
    // _viewer.addDoubleClickListener(new IDoubleClickListener() {
    //
    // @Override
    // public void doubleClick(DoubleClickEvent event) {
    // openDependenciesInEditor();
    // }
    // });

//    _viewer.addSelectionChangedListener(new ISelectionChangedListener() {
//
//      @Override
//      public void selectionChanged(SelectionChangedEvent event) {
//
//        IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();
//
//        //
//        List<IDependency> dependencies = new LinkedList<IDependency>();
//
//        //
//        for (Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();) {
//          dependencies.add((IDependency) iterator.next());
//        }
//
//        //
//        _selectionService.addDependencySelection(ID, dependencies);
//      }
//    });

    // IDependencySelection dependencySelection = Selection.instance().getDependencySelectionService()
    // .getSelection(Selection.MAIN_DEPENDENCY_SELECTION_ID);
    // initDependencies(dependencySelection);

    //
    _selectionService.addHierarchicalGraphSelectionListener(this);
  }

  /**
   * <p>
   * </p>
   */
  @PreDestroy
  public void dispose() {
    _selectionService.removeHierarchicalGraphSelectionListener(this);
  }

  @Override
  public String getSelectionProviderId() {
    return ID;
  }

  @Override
  public void currentSelectionChanged(IHierarchicalGraphSelection selection) {

    if (_viewer == null || _viewer.getTable().isDisposed()) {
      return;
    }

    IDependencySelection currentDependencySelection = selection.findLastOccurrence(IDependencySelection.class);

    if (currentDependencySelection == null || currentDependencySelection.getSelectedDependencies().isEmpty()) {
      setColumnTitles("From", "To");
      _viewer.setInput(new HGDependency[0]);
      _viewer.getTable().redraw();
      return;
    } else {

      HGNode toBaseArtifact = currentDependencySelection.getSelectedDependencies().get(0)
          .getFrom();

      HGNode fromBaseArtifact = currentDependencySelection.getSelectedDependencies().get(0)
          .getTo();

      if (currentDependencySelection.getSelectedDependencies().size() != 1) {
        // TODO determine deepest common base of all dependencies
        toBaseArtifact = toBaseArtifact.getRootNode();
        fromBaseArtifact = fromBaseArtifact.getRootNode();
      }

      _fromLabelGenerator.setBaseArtifact(fromBaseArtifact);
      _toLabelGenerator.setBaseArtifact(toBaseArtifact);
      //
      String fromColumnTitle = "From " /* + _fromLabelGenerator.getTitle() */;
      String toColumnTitle = "To " /*+ _toLabelGenerator.getTitle() */;

      setColumnTitles(fromColumnTitle, toColumnTitle);

      List<HGDependency> leafDependencies = HierarchicalGraphUtils
          .getCoreDependencies(currentDependencySelection.getSelectedDependencies());

      HGDependency[] dependencies = leafDependencies.toArray(new HGDependency[0]);
      setOrderedDependencies(dependencies);
    }
  }

  private void createColumns(Composite parent, TableViewer viewer) {

    createTableViewerColumn(parent, viewer, 0, "From", 45, new DependencyColumnLabelProvider(_fromLabelGenerator) {
      @Override
      protected HGNode getArtifactElement(HGDependency dependency) {
        return dependency.getFrom();
      }
    });

    //
    createTableViewerColumn(parent, viewer, 1, "Type", 10, new ColumnLabelProvider() {
      @Override
      public String getText(Object element) {
        if (element instanceof HGDependency) {
          HGDependency dependency = (HGDependency) element;
          // TODO
          // return String.valueOf(dependency.getDependencyKind()).toLowerCase();
          return "depends on";
        }
        return super.getText(element);
      }

    });
    createTableViewerColumn(parent, viewer, 2, "To", 45, new DependencyColumnLabelProvider(_toLabelGenerator) {

      @Override
      public HGNode getArtifactElement(HGDependency dependency) {
        return dependency.getTo();
      }
    });

  }

  private TableViewerColumn createTableViewerColumn(Composite tableComposite, TableViewer viewer, int index,
      String title, int weight, CellLabelProvider labelProvider) {
    final TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
    final TableColumn column = viewerColumn.getColumn();
    column.setText(title);
    column.setResizable(true);
    column.setMoveable(false);

    TableColumnLayout tableLayout = (TableColumnLayout) tableComposite.getLayout();
    ColumnLayoutData columnLayoutData = new ColumnWeightData(weight);
    tableLayout.setColumnData(column, columnLayoutData);
    if (labelProvider != null) {
      viewerColumn.setLabelProvider(labelProvider);
    }
    column.addSelectionListener(getSelectionAdapter(column, index));
    return viewerColumn;

  }

  private SelectionAdapter getSelectionAdapter(final TableColumn column, final int index) {
    SelectionAdapter selectionAdapter = new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        _dependencyComparator.setColumn(index);
        int dir = _dependencyComparator.getDirection();
        _viewer.getTable().setSortDirection(dir);
        _viewer.getTable().setSortColumn(column);

        HGDependency[] currentDependencies = (HGDependency[]) _viewer.getInput();
        setOrderedDependencies(currentDependencies);

        _viewer.refresh();
      }
    };
    return selectionAdapter;
  }

  private void setColumnTitles(String fromColumnTitle, String toColumnTitle) {
    Table table = _viewer.getTable();

    table.getColumn(0).setText(fromColumnTitle);
    table.getColumn(2).setText(toColumnTitle);
  }

  private void setOrderedDependencies(HGDependency[] dependencies) {
    _dependencyComparator.sortDependencies(dependencies);

    _viewer.setInput(dependencies);
    _viewer.setItemCount(dependencies.length); // This is the difference when using a ILazyContentProvider
    _viewer.getTable().redraw();
  }
}
