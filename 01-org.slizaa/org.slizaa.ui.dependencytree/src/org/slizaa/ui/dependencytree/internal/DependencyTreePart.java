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

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.DependencySelections;
import org.slizaa.ui.shared.AbstractSlizaaWorkbenchModelComponent;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencyTreePart extends AbstractSlizaaWorkbenchModelComponent {

  /** - */
  public static final String      ID = DependencyTreePart.class.getName();

  /** - */
  private DependencyTreeComposite _composite;

  /**
   * <p>
   * </p>
   *
   * @param parent
   */
  @PostConstruct
  public void createComposite(Composite parent) {

    //
    GridLayoutFactory.fillDefaults().applyTo(parent);

    //
    _composite = new DependencyTreeComposite(parent, dependencySelection -> {
      getWorkbenchModel().setDetailDependencySelection(dependencySelection);
    });
    GridDataFactory.fillDefaults().grab(true, true).applyTo(_composite);

    //
    handleMainDependencySelectionChanged(null, getWorkbenchModel().getMainDependencySelection());
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void handleMainDependencySelectionChanged(DependencySelection oldValue, DependencySelection newValue) {

    // get the core dependencies
    Set<HGCoreDependency> coreDependencies = newValue != null
        ? DependencySelections.getCoreDependencies(newValue.getDependencies()) : Collections.emptySet();

    //
    if (_composite != null && !_composite.isDisposed()) {
      _composite.setDependencies(coreDependencies);
    }
  }
}
