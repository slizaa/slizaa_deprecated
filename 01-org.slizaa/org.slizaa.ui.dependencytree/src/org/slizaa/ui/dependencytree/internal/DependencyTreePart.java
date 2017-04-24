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

import java.util.Collections;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.DependencySelections;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencyTreePart {

  /** - */
  public static final String      ID = DependencyTreePart.class.getName();

  @Inject
  private MPerspective            _mPerspective;

  /** - */
  private DependencyTreeComposite _composite;

  /** - */
  private DependencySelection     _dependencySelection;

  /**
   * <p>
   * </p>
   *
   * @param parent
   */
  @PostConstruct
  public void createComposite(Composite parent) {

    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    parent.setLayout(layout);

    //
    _composite = new DependencyTreeComposite(parent, () -> _mPerspective.getContext());
    _composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    //
    if (_dependencySelection != null) {
      setDependencies(_dependencySelection);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   */
  @Inject
  public void handleChangedDependencies(@Optional
  @Named(SelectionIdentifier.CURRENT_MAIN_DEPENDENCY_SELECTION)
  final DependencySelection dependencySelection) {

    //
    _dependencySelection = dependencySelection;

    //
    setDependencies(_dependencySelection);
  }

  /**
   * <p>
   * ONLY FOR TESTING
   * </p>
   *
   * @param mPerspective
   */
  void setPerspective(MPerspective mPerspective) {
    _mPerspective = mPerspective;
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencySelection
   */
  private void setDependencies(final DependencySelection dependencySelection) {

    // get the core dependencies
    Set<HGCoreDependency> coreDependencies = dependencySelection != null
        ? DependencySelections.getCoreDependencies(dependencySelection.getDependencies()) : Collections.emptySet();

    //
    if (_composite != null && !_composite.isDisposed()) {
      _composite.setDependencies(coreDependencies);
    }
  }
}
