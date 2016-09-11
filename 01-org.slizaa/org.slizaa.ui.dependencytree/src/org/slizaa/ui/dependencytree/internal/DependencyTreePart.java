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
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.util.HierarchicalGraphUtils;
import org.slizaa.selection.IDependencySelection;
import org.slizaa.selection.IHierarchicalGraphSelection;
import org.slizaa.selection.IHierarchicalGraphSelectionListener;
import org.slizaa.selection.IHierarchicalGraphSelectionService;

public class DependencyTreePart implements IHierarchicalGraphSelectionListener {

  /** - */
  public static final String                                       ID                    = DependencyTreePart.class
      .getName();

  /** Id used to store view settings in preferences */
  private static final String                                      VIEW_SETTINGS_SECTION = "DependencyTreeView";

  /** - */
  private CropableDependencyTreeComposite                          _composite;

  /** - */
  private ServiceRegistration<IHierarchicalGraphSelectionListener> _serviceRegistration;

  @Inject
  private IHierarchicalGraphSelectionService                       _selectionService;

  @PostConstruct
  public void createComposite(Composite parent) {

    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    parent.setLayout(layout);

    //
    _composite = new CropableDependencyTreeComposite(parent, ID, false, true, _selectionService);
    _composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    // Restore User-made settings
    // loadViewSettings();

    // // Setup Actions and Menu in Action Bar
    // contributeToActionBars();

    //
    BundleContext bundleContext = FrameworkUtil.getBundle(DependencyTreePart.class).getBundleContext();
    _serviceRegistration = bundleContext.registerService(IHierarchicalGraphSelectionListener.class, this, null);
  }

  /**
   * <p>
   * </p>
   */
  @PreDestroy
  public void dispose() {
    _serviceRegistration.unregister();
  }

  @Override
  public String getSelectionProviderId() {
    return ID;
  }

  @Override
  public void currentSelectionChanged(IHierarchicalGraphSelection selection) {

    // init dependencies
    initDependencies(selection);
  }

  /**
   * <p>
   * </p>
   *
   * @param selection
   */
  private void initDependencies(IHierarchicalGraphSelection selection) {

    //
    if (_composite != null && selection != null) {

      IDependencySelection dependencySelection = selection.findFirstOccurrence(IDependencySelection.class);

      if (dependencySelection != null) {

        List<HGCoreDependency> dependencies = HierarchicalGraphUtils
            .getCoreDependencies(dependencySelection.getSelectedDependencies());

        _composite.setDependencies(dependencies);
      } else {
        Collection<HGCoreDependency> dependencies = Collections.emptyList();
        _composite.setDependencies(dependencies);
      }
    }
  }

  // public boolean isShowReferenceCount() {
  // return _showReferenceCount;
  // }
  //
  // public void setShowReferenceCount(boolean showReferenceCount) {
  // _showReferenceCount = showReferenceCount;
  // _composite.setShowReferenceCount(this._showReferenceCount);
  // saveViewSettings();
  // }
  //
  // private IDialogSettings getViewSettings() {
  // IDialogSettings settings = Activator.getDefault().getDialogSettings();
  // IDialogSettings section = settings.getSection(VIEW_SETTINGS_SECTION);
  // if (section == null) {
  // section = settings.addNewSection(VIEW_SETTINGS_SECTION);
  // }
  // return section;
  // }
  //
  // private void saveViewSettings() {
  // IDialogSettings dialogSettings = getViewSettings();
  //
  // dialogSettings.put("showReferenceCount", isShowReferenceCount());
  // }
  //
  // private void loadViewSettings() {
  // IDialogSettings dialogSettings = getViewSettings();
  //
  // this._showReferenceCount = dialogSettings.getBoolean("showReferenceCount");
  //
  // _composite.setShowReferenceCount(_showReferenceCount);
  //
  // }
  //
  // class ShowReferenceCountAction extends Action {
  //
  // public ShowReferenceCountAction() {
  // super("Show Reference Count", IAction.AS_CHECK_BOX);
  // setToolTipText("Show Reference Count on each Node. Warning: Might slow down the Tree.");
  // setChecked(isShowReferenceCount());
  // }
  //
  // @Override
  // public void run() {
  // setShowReferenceCount(isChecked());
  // }
  // }
}
