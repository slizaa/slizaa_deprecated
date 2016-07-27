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

import org.slizaa.selection.IHierarchicalGraphSelection;

public abstract class AbstractHierarchicalGraphSelection implements IHierarchicalGraphSelection {

  /** - */
  private String                             _selectionProviderId;

  /** - */
  private AbstractHierarchicalGraphSelection _parentSelection;

  /** - */
  private AbstractHierarchicalGraphSelection _detailSelection;

  /**
   * <p>
   * Creates a new instance of type {@link AbstractHierarchicalGraphSelection}.
   * </p>
   *
   * @param selectionProviderId
   */
  public AbstractHierarchicalGraphSelection(String selectionProviderId) {
    checkNotNull(selectionProviderId);
    checkState(!selectionProviderId.isEmpty(), "Parameter 'selectionProviderId' must not be empty.");

    _selectionProviderId = selectionProviderId;
  }

  /**
   * <p>
   * Creates a new instance of type {@link AbstractHierarchicalGraphSelection}.
   * </p>
   *
   * @param parentSelection
   */
  public AbstractHierarchicalGraphSelection(String selectionProviderId, IHierarchicalGraphSelection parentSelection) {
    this(selectionProviderId);

    if (parentSelection != null) {

      checkState(parentSelection instanceof AbstractHierarchicalGraphSelection,
          "Parent selection has to be instance of AbstractHierarchicalGraphSelection");

      _parentSelection = (AbstractHierarchicalGraphSelection) parentSelection;
      _parentSelection._detailSelection = this;
    }
  }
  
  @Override
  public String getSelectionProviderId() {
    return _selectionProviderId;
  }

  @Override
  public boolean hasDetailSelection() {
    return _detailSelection != null;
  }

  @Override
  public IHierarchicalGraphSelection getDetailSelection() {
    return _detailSelection;
  }

  @Override
  public boolean hasParentSelection() {
    return _parentSelection != null;
  }

  @Override
  public IHierarchicalGraphSelection getParentSelection() {
    return _parentSelection;
  }

  public AbstractHierarchicalGraphSelection clone() {

    AbstractHierarchicalGraphSelection clonedSelection = createClone(_selectionProviderId);

    if (_parentSelection != null) {
      clonedSelection._parentSelection = _parentSelection.clone();
      ((AbstractHierarchicalGraphSelection) clonedSelection._parentSelection)._detailSelection = clonedSelection;
    }

    return clonedSelection;
  }

  @Override
  public boolean isRootSelection() {
    return _parentSelection == null;
  }

  @Override
  public IHierarchicalGraphSelection getRootSelection() {
    IHierarchicalGraphSelection result = this;
    while (result.hasParentSelection()) {
      result = result.getParentSelection();
    }
    return result;
  }

  @Override
  public boolean isLeafSelection() {
    return _detailSelection == null;
  }

  @Override
  public IHierarchicalGraphSelection getLeafSelection() {
    IHierarchicalGraphSelection result = this;
    while (result.hasDetailSelection()) {
      result = result.getDetailSelection();
    }
    return result;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends IHierarchicalGraphSelection> T findFirstOccurrence(Class<T> type) {

    //
    IHierarchicalGraphSelection result = getRootSelection();
    while ((!result.isCastable(type)) && result.hasDetailSelection()) {
      result = result.getDetailSelection();
    }

    //
    return result.isCastable(type) ? (T) result : null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends IHierarchicalGraphSelection> T findLastOccurrence(Class<T> type) {

    //
    IHierarchicalGraphSelection result = getLeafSelection();
    while ((!result.isCastable(type)) && result.hasParentSelection()) {
      result = result.getParentSelection();
    }

    //
    return result.isCastable(type) ? (T) result : null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends IHierarchicalGraphSelection> boolean isCastable(Class<T> clazz) {

    //
    if (clazz == null) {
      return false;
    }

    //
    return clazz.isAssignableFrom(this.getClass());
  }

  @Override
  public <T extends IHierarchicalGraphSelection> T cast(Class<T> clazz) {

    //
    if (isCastable(clazz)) {
      return (T) this;
    }

    //
    return null;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  protected abstract AbstractHierarchicalGraphSelection createClone(String selectionId);
}
