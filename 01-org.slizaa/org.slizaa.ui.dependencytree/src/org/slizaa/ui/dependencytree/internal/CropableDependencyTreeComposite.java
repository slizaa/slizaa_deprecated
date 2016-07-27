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

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Widget;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.selection.IHierarchicalGraphSelectionService;
import org.slizaa.ui.dependencytree.internal.expand.DefaultExpandStrategy;
import org.slizaa.ui.dependencytree.internal.expand.IExpandStrategy;

public class CropableDependencyTreeComposite extends Composite {

  /** - */
  private DependencyTreeComposite            _dependencyTreeComposite;

  /** - */
  private ToolItem                           _cropButton;

  /** - */
  private ToolItem                           _backButton;

  /** - */
  private ToolItem                           _forwardButton;

  /** - */
  private ToolItem                           _clearButton;

  /** - */
  private int                                _currentPosition = -1;

  /** - */
  private List<Collection<HGDependency>>      _dependencySelectionList;

  /** - */
  private String                             _detailDependencyProviderId;

  /** - */
  private IExpandStrategy                    _fromExpandStrategy;

  /** - */
  private IExpandStrategy                    _toExpandStrategy;

  private IHierarchicalGraphSelectionService _selectionService;

  /**
   * <p>
   * Creates a new instance of type {@link CropableDependencyTreeComposite}.
   * </p>
   * 
   * @param parent
   */
  public CropableDependencyTreeComposite(Composite parent, String detailDependencyProviderId, boolean showReferences,
      final boolean propagateSelectedDetailDependencies, IHierarchicalGraphSelectionService selectionService) {
    super(parent, SWT.NONE);

    //
    Assert.isNotNull(detailDependencyProviderId);

    //
    _detailDependencyProviderId = detailDependencyProviderId;
    _dependencySelectionList = new LinkedList<Collection<HGDependency>>();

    //
    _fromExpandStrategy = new DefaultExpandStrategy();
    _toExpandStrategy = new DefaultExpandStrategy();

    //
    _selectionService = selectionService;

    //
    GridLayout gridLayout = new GridLayout();
    gridLayout.marginHeight=0;
    gridLayout.marginWidth=0;
    this.setLayout(gridLayout);

    //
    ToolBar toolbar = new ToolBar(this, SWT.FLAT);

    // the dependency tree composite
    _dependencyTreeComposite = new DependencyTreeComposite(this, _detailDependencyProviderId, _fromExpandStrategy,
        _toExpandStrategy, showReferences, _selectionService) {

      @Override
      protected boolean propagateSelectedDetailDependencies() {
        return propagateSelectedDetailDependencies;
      }
    };

    createCropButtons(toolbar);
    new ToolItem(toolbar, SWT.SEPARATOR);

//    _dependencySelectionListener = new IDependencySelectionListener() {
//      @Override
//      public void dependencySelectionChanged(IDependencySelectionChangedEvent event) {
//        if (event.getProviderId().equals(DependencyTreePart.ID)) {
//          enableButtons();
//        }
//      }
//    };
//
//    //
//    Selection.instance().getDependencySelectionService()
//        .addDependencySelectionListener(Selection.DETAIL_DEPENDENCY_SELECTION_ID, _dependencySelectionListener);
  }

  // /**
  // * <p>
  // * </p>
  // *
  // * @param toolbar
  // */
  // private void createAutoExpandMenus(ToolBar toolbar) {
  //
  // //
  // Widget[] widgets = createAutoExpandMenu(toolbar);
  // _autoExpandFrom = (ToolItem) widgets[1];
  // _autoExpandFrom.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_MODULES.getImage());
  //
  // // the selection listener
  // SelectionListener selectionListener = new SelectionAdapter() {
  //
  // /**
  // * {@inheritDoc}
  // */
  // @Override
  // public void widgetSelected(SelectionEvent e) {
  // MenuItem item = (MenuItem) e.widget;
  // if (item.getSelection()) {
  //// if ("Group".equals(item.getText())) {
  //// _expandStrategy.setFromTreeViewerAutoExpandType(CoreModelElementType.Group);
  //// _autoExpandFrom.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_GROUPS.getImage());
  //// } else if ("Module".equals(item.getText())) {
  //// _expandStrategy.setFromTreeViewerAutoExpandType(CoreModelElementType.Module);
  //// _autoExpandFrom.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_MODULES.getImage());
  //// } else if ("Package".equals(item.getText())) {
  //// _expandStrategy.setFromTreeViewerAutoExpandType(CoreModelElementType.Directory);
  //// _autoExpandFrom.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_PACKAGES.getImage());
  //// } else if ("Resource".equals(item.getText())) {
  //// _expandStrategy.setFromTreeViewerAutoExpandType(CoreModelElementType.Resource);
  //// _autoExpandFrom.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_RESOURCES.getImage());
  //// }
  // }
  // }
  // };
  //
  // //
  // for (MenuItem menuItem : ((Menu) widgets[0]).getItems()) {
  // menuItem.addSelectionListener(selectionListener);
  // }
  //
  // //
  // widgets = createAutoExpandMenu(toolbar);
  // _autoExpandTo = (ToolItem) widgets[1];
  // _autoExpandTo.setImage(UIDependencyTreeImages.AUTO_EXPAND_TO_MODULES.getImage());
  //
  // //
  // selectionListener = new SelectionAdapter() {
  // @Override
  // public void widgetSelected(SelectionEvent e) {
  // MenuItem item = (MenuItem) e.widget;
  // if (item.getSelection()) {
  // // if ("Group".equals(item.getText())) {
  // // _expandStrategy.setToTreeViewerAutoExpandType(CoreModelElementType.Group);
  // // _autoExpandTo.setImage(UIDependencyTreeImages.AUTO_EXPAND_TO_GROUPS.getImage());
  // // } else if ("Module".equals(item.getText())) {
  // // _expandStrategy.setToTreeViewerAutoExpandType(CoreModelElementType.Module);
  // // _autoExpandTo.setImage(UIDependencyTreeImages.AUTO_EXPAND_TO_MODULES.getImage());
  // // } else if ("Package".equals(item.getText())) {
  // // _expandStrategy.setToTreeViewerAutoExpandType(CoreModelElementType.Directory);
  // // _autoExpandTo.setImage(UIDependencyTreeImages.AUTO_EXPAND_TO_PACKAGES.getImage());
  // // } else if ("Resource".equals(item.getText())) {
  // // _expandStrategy.setToTreeViewerAutoExpandType(CoreModelElementType.Resource);
  // // _autoExpandTo.setImage(UIDependencyTreeImages.AUTO_EXPAND_TO_RESOURCES.getImage());
  // // }
  // }
  // }
  // };
  //
  // //
  // for (MenuItem menuItem : ((Menu) widgets[0]).getItems()) {
  // menuItem.addSelectionListener(selectionListener);
  // }
  // }

  /**
   * <p>
   * </p>
   * 
   * @param toolbar
   */
  public void createCropButtons(ToolBar toolbar) {

    // the back button
    _backButton = new ToolItem(toolbar, SWT.NONE);
    _backButton.setImage(UIDependencyTreeImages.ENABLED_BACKWARD_NAV.getImage());
    _backButton.setDisabledImage(UIDependencyTreeImages.DISABLED_BACKWARD_NAV.getImage());

    // the forward button
    _forwardButton = new ToolItem(toolbar, SWT.NONE);
    _forwardButton.setImage(UIDependencyTreeImages.ENABLED_FORWARD_NAV.getImage());
    _forwardButton.setDisabledImage(UIDependencyTreeImages.DISABLED_FORWARD_NAV.getImage());

    // the clear button
    _clearButton = new ToolItem(toolbar, SWT.NONE);
    _clearButton.setImage(UIDependencyTreeImages.ENABLED_PIN_SELECTION_CLEAR.getImage());
    _clearButton.setDisabledImage(UIDependencyTreeImages.DISABLED_PIN_SELECTION_CLEAR.getImage());

    // the crop button
    _cropButton = new ToolItem(toolbar, SWT.NONE);
    _cropButton.setImage(UIDependencyTreeImages.ENABLED_PIN_SELECTION_ADD.getImage());
    _cropButton.setDisabledImage(UIDependencyTreeImages.DISABLED_PIN_SELECTION_ADD.getImage());

    //
    GridData gridData = new GridData(GridData.FILL, GridData.FILL, true, true);
    _dependencyTreeComposite.setLayoutData(gridData);

    //
    _cropButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {

        cropCurrentSelection();
      }
    });

    _backButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {

        if (_currentPosition > 0) {
          _currentPosition = _currentPosition - 1;
          _dependencyTreeComposite.setDependencies(_dependencySelectionList.get(_currentPosition));

          enableButtons();
        }
      }
    });

    _forwardButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {

        if (_currentPosition < _dependencySelectionList.size() - 1) {
          _currentPosition = _currentPosition + 1;
          _dependencyTreeComposite.setDependencies(_dependencySelectionList.get(_currentPosition));

          enableButtons();
        }
      }
    });

    _clearButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {

        _dependencyTreeComposite.setDependencies(_dependencySelectionList.get(0));

        // 'cut' the selection history
        for (int i = _dependencySelectionList.size() - 1; i > 0; i--) {
          _dependencySelectionList.remove(i);
        }

        _currentPosition = 0;

        enableButtons();
      }
    });

    enableButtons();
  }

  public Widget[] createAutoExpandMenu(final ToolBar toolbar) {

    // Rectangle clientArea = shell.getClientArea ();
    // toolBar.setLocation(clientArea.x, clientArea.y);
    final Menu menu = new Menu(toolbar.getShell(), SWT.POP_UP);

    final ToolItem toolItem = new ToolItem(toolbar, SWT.DROP_DOWN);

    MenuItem menuItemGroup = new MenuItem(menu, SWT.RADIO);
    menuItemGroup.setText("Group");

    MenuItem menuItemModule = new MenuItem(menu, SWT.RADIO);
    menuItemModule.setText("Module");

    MenuItem menuItemPackage = new MenuItem(menu, SWT.RADIO);
    menuItemPackage.setText("Package");

    MenuItem menuItemResource = new MenuItem(menu, SWT.RADIO);
    menuItemResource.setText("Resource");

    toolItem.addListener(SWT.Selection, new Listener() {
      @Override
      public void handleEvent(Event event) {
        if (event.detail == SWT.ARROW) {
          Rectangle rect = toolItem.getBounds();
          Point pt = new Point(rect.x, rect.y + rect.height);
          pt = toolbar.toDisplay(pt);
          menu.setLocation(pt.x, pt.y);
          menu.setVisible(true);
        }
      }
    });

    menuItemModule.setSelection(true);

    //
    return new Widget[] { menu, toolItem };
  }

  /**
   * <p>
   * </p>
   * 
   * @param dependencies
   */
  public void setDependencies(Collection<HGDependency> dependencies) {

    // check disposed
    if (checkDisposed()) {
      return;
    }

    _dependencyTreeComposite.setDependencies(dependencies);
    _currentPosition = 0;
    _dependencySelectionList.clear();
    _dependencySelectionList.add(dependencies);

    if (dependencies.size() > 0) {

      // HGDependency dependency = dependencies.get(0);

      // //
      // if (CoreModelElementType.Group.equals(dependency.getFrom().getElementType())) {
      // _expandStrategy.setFromTreeViewerAutoExpandType(CoreModelElementType.Group);
      // _autoExpandFrom.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_GROUPS.getImage());
      // } else if (CoreModelElementType.Module.equals(dependency.getFrom().getElementType())) {
      // _expandStrategy.setFromTreeViewerAutoExpandType(CoreModelElementType.Module);
      // _autoExpandFrom.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_MODULES.getImage());
      // } else if (CoreModelElementType.Directory.equals(dependency.getFrom().getElementType())) {
      // _expandStrategy.setFromTreeViewerAutoExpandType(CoreModelElementType.Directory);
      // _autoExpandFrom.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_PACKAGES.getImage());
      // } else if (CoreModelElementType.Resource.equals(dependency.getFrom().getElementType())) {
      // _expandStrategy.setFromTreeViewerAutoExpandType(CoreModelElementType.Resource);
      // _autoExpandFrom.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_RESOURCES.getImage());
      // }
      //
      // //
      // if (CoreModelElementType.Group.equals(dependency.getTo().getElementType())) {
      // _expandStrategy.setToTreeViewerAutoExpandType(CoreModelElementType.Group);
      // _autoExpandTo.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_GROUPS.getImage());
      // } else if (CoreModelElementType.Module.equals(dependency.getTo().getElementType())) {
      // _expandStrategy.setToTreeViewerAutoExpandType(CoreModelElementType.Module);
      // _autoExpandTo.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_MODULES.getImage());
      // } else if (CoreModelElementType.Directory.equals(dependency.getTo().getElementType())) {
      // _expandStrategy.setToTreeViewerAutoExpandType(CoreModelElementType.Directory);
      // _autoExpandTo.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_PACKAGES.getImage());
      // } else if (CoreModelElementType.Resource.equals(dependency.getTo().getElementType())) {
      // _expandStrategy.setToTreeViewerAutoExpandType(CoreModelElementType.Resource);
      // _autoExpandTo.setImage(UIDependencyTreeImages.AUTO_EXPAND_FROM_RESOURCES.getImage());
      // }
    }

    enableButtons();
  }

  @Override
  public void dispose() {

//    // dispose
//    Selection.instance().getDependencySelectionService()
//        .removeDependencySelectionListener(_dependencySelectionListener);

    //
    super.dispose();
  }

  private void enableButtons() {

    //
    boolean dependenciesSelected = _dependencyTreeComposite.getSelectedDetailDependencies() != null
        && _dependencyTreeComposite.getSelectedDetailDependencies().size() > 0;

    if (checkDisposed()) {
      return;
    }

    try {
      //
      _backButton.setEnabled(dependenciesSelected && _currentPosition > 0);
      _forwardButton.setEnabled(dependenciesSelected && _currentPosition < _dependencySelectionList.size() - 1);
      _clearButton.setEnabled(dependenciesSelected && _dependencySelectionList.size() > 1);
      _cropButton.setEnabled(dependenciesSelected);
    } catch (Exception e) {
      checkDisposed();
    }
  }

  /**
   * <p>
   * </p>
   */
  private boolean checkDisposed() {

    //
    if (_backButton.isDisposed() || _forwardButton.isDisposed() || _clearButton.isDisposed()
        || _cropButton.isDisposed()) {

      // //
      // Selection.instance().getDependencySelectionService()
      // .removeDependencySelectionListener(_dependencySelectionListener);

      //
      return true;
    }

    //
    return false;
  }

  private void cropCurrentSelection() {

    // 'cut' the selection history
    for (int i = _dependencySelectionList.size() - 1; i > _currentPosition; i--) {
      _dependencySelectionList.remove(i);
    }

    //
    Set<HGDependency> currentSelection = _dependencyTreeComposite.getSelectedDetailDependencies();
    _dependencySelectionList.add(currentSelection);
    _currentPosition = _currentPosition + 1;
    _dependencyTreeComposite.setDependencies(currentSelection);

    enableButtons();
  }

  public void setShowReferenceCount(boolean showReferenceCount) {
    _dependencyTreeComposite.setShowReferenceCount(showReferenceCount);
  }
}
