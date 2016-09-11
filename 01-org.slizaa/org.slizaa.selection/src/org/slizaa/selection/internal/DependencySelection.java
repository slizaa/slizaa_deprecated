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
package org.slizaa.selection.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.selection.IDependencySelection;
import org.slizaa.selection.IHierarchicalGraphSelection;

public class DependencySelection extends AbstractHierarchicalGraphSelection implements IDependencySelection {

  /** - */
  private List<AbstractHGDependency> _selection;

  public DependencySelection(String selectionId, IHierarchicalGraphSelection parentSelection,
      List<? extends AbstractHGDependency> selection) {
    super(selectionId, parentSelection);

    //
    checkState(!selection.isEmpty(), "Selection must not be empty.");
    _selection = Collections.unmodifiableList(new ArrayList<>(checkNotNull(selection)));
  }

  public DependencySelection(String selectionId, IHierarchicalGraphSelection parentSelection,
      AbstractHGDependency... selection) {
    super(selectionId, parentSelection);

    //
    checkState(selection.length > 0, "Selection must not be empty.");
    _selection = Collections.unmodifiableList(Arrays.asList(selection));
  }

  /**
   * <p>
   * Creates a new instance of type {@link DependencySelection}.
   * </p>
   *
   * @param selection
   */
  public DependencySelection(String selectionId, List<AbstractHGDependency> selection) {
    super(selectionId);

    checkState(!selection.isEmpty(), "Selection must not be empty.");
    _selection = Collections.unmodifiableList(new ArrayList<>(checkNotNull(selection)));
  }

  /**
   * <p>
   * Creates a new instance of type {@link DependencySelection}.
   * </p>
   *
   * @param selection
   */
  public DependencySelection(String selectionId, AbstractHGDependency... selection) {
    super(selectionId);

    checkState(selection.length > 0, "Selection must not be empty.");
    _selection = Collections.unmodifiableList(Arrays.asList(selection));
  }

  @Override
  public List<AbstractHGDependency> getSelectedDependencies() {
    return _selection;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "DependencySelection [_selection=" + _selection + "]";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected AbstractHierarchicalGraphSelection createClone(String selectionId) {
    return new DependencySelection(selectionId);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_selection == null) ? 0 : _selection.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    DependencySelection other = (DependencySelection) obj;
    if (_selection == null) {
      if (other._selection != null)
        return false;
    } else if (!_selection.equals(other._selection))
      return false;
    return true;
  }
}
