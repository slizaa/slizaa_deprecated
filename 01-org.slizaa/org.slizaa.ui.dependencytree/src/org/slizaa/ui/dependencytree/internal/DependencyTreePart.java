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

import java.util.Collections;
import java.util.List;
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
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.util.HierarchicalGraphUtils;
import org.slizaa.ui.common.context.HierarchicalGraphContextIdentifier;

public class DependencyTreePart {

  /** - */
  public static final String              ID = DependencyTreePart.class.getName();

  /** - */
  private CropableDependencyTreeComposite _composite;

  @Inject
  private MPerspective                    _mPerspective;

  @PostConstruct
  public void createComposite(Composite parent) {

    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    parent.setLayout(layout);

    //
    _composite = new CropableDependencyTreeComposite(parent, ID, false, true, _mPerspective.getContext());
    _composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
  }

  @Inject
  public void handleChangedDependencies(@Optional
  @Named(HierarchicalGraphContextIdentifier.CURRENT_MAIN_DEPENDENCY_SELECTION)
  final List<AbstractHGDependency> dependencies) {

    // get the core dependencies
    Set<HGCoreDependency> coreDependencies = dependencies != null
        ? HierarchicalGraphUtils.getCoreDependencies(dependencies) : Collections.emptySet();

    if (_composite != null  && !_composite.isDisposed()) {
      _composite.setDependencies(coreDependencies);
    }
  }
}
