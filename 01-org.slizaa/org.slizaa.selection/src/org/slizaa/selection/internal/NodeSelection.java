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

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.selection.IHierarchicalGraphSelection;
import org.slizaa.selection.INodeSelection;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class NodeSelection extends AbstractHierarchicalGraphSelection implements INodeSelection {

  public static final NodeSelection    EMPTY_SELECTION = new NodeSelection("EMPTY_SELECTION");

  /** - */
  private List<HGNode> _selection;

  /**
   * <p>
   * Creates a new instance of type {@link NodeSelection}.
   * </p>
   *
   * @param selectionId
   */
  private NodeSelection(String selectionId) {
    super(selectionId);
    _selection = Collections.emptyList();
  }

  /**
   * <p>
   * Creates a new instance of type {@link NodeSelection}.
   * </p>
   *
   * @param parentSelection
   * @param selection
   */
  public NodeSelection(String selectionId, IHierarchicalGraphSelection parentSelection,
      List<HGNode> selection) {
    super(selectionId, parentSelection);

    //
    checkState(!selection.isEmpty(), "Selection must not be empty.");
    _selection = Collections.unmodifiableList(new ArrayList<>(checkNotNull(selection)));
  }

  /**
   * <p>
   * Creates a new instance of type {@link NodeSelection}.
   * </p>
   *
   * @param parentSelection
   * @param selection
   */
  public NodeSelection(String selectionId, IHierarchicalGraphSelection parentSelection,
      HGNode... selection) {
    super(selectionId, parentSelection);

    //
    checkState(selection.length > 0, "Selection must not be empty.");
    _selection = Collections.unmodifiableList(Arrays.asList(selection));
  }

  /**
   * <p>
   * Creates a new instance of type {@link NodeSelection}.
   * </p>
   *
   * @param selection
   */
  public NodeSelection(String selectionId, List<HGNode> selection) {
    super(selectionId);

    //
    checkState(!selection.isEmpty(), "Selection must not be empty.");
    _selection = Collections.unmodifiableList(new ArrayList<>(checkNotNull(selection)));
  }

  /**
   * <p>
   * Creates a new instance of type {@link NodeSelection}.
   * </p>
   *
   * @param selection
   */
  public NodeSelection(String selectionId, HGNode... selection) {
    super(selectionId);

    //
    checkState(selection.length > 0, "Selection must not be empty.");
    _selection = Collections.unmodifiableList(Arrays.asList(selection));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<HGNode> getSelectedNodes() {
    return _selection;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "NodeSelection [_selection=" + _selection + "]";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected AbstractHierarchicalGraphSelection createClone(String selectionId) {
    return new NodeSelection(selectionId, _selection);
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
    NodeSelection other = (NodeSelection) obj;
    if (_selection == null) {
      if (other._selection != null)
        return false;
    } else if (!_selection.equals(other._selection))
      return false;
    return true;
  }
}
