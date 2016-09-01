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

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.selection.IHierarchicalGraphSelection;
import org.slizaa.selection.IHierarchicalGraphSelectionListener;
import org.slizaa.selection.IHierarchicalGraphSelectionService;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@Component(service = IHierarchicalGraphSelectionService.class, immediate = true)
public class HierarchicalGraphSelectionService implements IHierarchicalGraphSelectionService {

  /** - */
  private AbstractHierarchicalGraphSelection                        _currentSelection;

  /** - */
  private CopyOnWriteArrayList<IHierarchicalGraphSelectionListener> _listener;

  /** - */
  private Map<String, AbstractHierarchicalGraphSelection>           _lastDeliveredGraphSelection;

  /**
   * <p>
   * Creates a new instance of type {@link HierarchicalGraphSelectionService}.
   * </p>
   */
  public HierarchicalGraphSelectionService() {

    //
    _listener = new CopyOnWriteArrayList<>();
    _lastDeliveredGraphSelection = new HashMap<>();
    _currentSelection = NodeSelection.EMPTY_SELECTION;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
  public void addHierarchicalGraphSelectionListener(IHierarchicalGraphSelectionListener listener) {

    _listener.add(checkNotNull(listener));
    _notifyListener(listener);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void removeHierarchicalGraphSelectionListener(IHierarchicalGraphSelectionListener listener) {
    _listener.remove(checkNotNull(listener));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IHierarchicalGraphSelection getCurrentSelection() {
    return _currentSelection;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IHierarchicalGraphSelection getCurrentSelection(String selectionProviderId) {
    return _lastDeliveredGraphSelection.get(checkNotNull(selectionProviderId));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setCurrentNodeSelection(String selectionProviderId, HGNode... selectedNodes) {
    setCurrentNodeSelection(checkNotNull(selectionProviderId), Arrays.asList(selectedNodes));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setCurrentNodeSelection(String selectionProviderId, List<HGNode> selectedNodes) {

    //
    if (selectedNodes.isEmpty()) {
      removeSelection(selectionProviderId);
    } else {
      for (HGNode node : selectedNodes) {
        checkNotNull(node);
      }

      //
      _setCurrentSelection(new NodeSelection(selectionProviderId, _createParent(selectionProviderId), selectedNodes));
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setCurrentDependencySelection(String selectionProviderId, HGDependency... selectedDependencies) {
    setCurrentDependencySelection(selectionProviderId, Arrays.asList(selectedDependencies));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setCurrentDependencySelection(String selectionProviderId, List<HGDependency> selectedDependencies) {

    //
    if (selectedDependencies.isEmpty()) {
      removeSelection(selectionProviderId);
    }

    //
    else {

      // TODO: resolveAggregatedCoreDependency
      if (false) {
        for (HGDependency dependency : selectedDependencies) {
          checkNotNull(dependency).resolveAggregatedCoreDependencies();
        }
      }

      //
      _setCurrentSelection(
          new DependencySelection(selectionProviderId, _createParent(selectionProviderId), selectedDependencies));
    }
  }

  private void removeSelection(String selectionProviderId) {
    //
    if (_currentSelection.getRootSelection().getSelectionProviderId() == selectionProviderId) {
      _setCurrentSelection(NodeSelection.EMPTY_SELECTION);
    } else {
      IHierarchicalGraphSelection selection = _currentSelection.getRootSelection();
      while (selection.hasDetailSelection()
          && !(selectionProviderId.equals(selection.getDetailSelection().getSelectionProviderId()))) {
        selection = selection.getDetailSelection();
      }

      // found ?
      if (selection.hasDetailSelection()) {
        _setCurrentSelection(_createParent(selectionProviderId));
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param selection
   */
  private void _setCurrentSelection(AbstractHierarchicalGraphSelection selection) {

    //
    _currentSelection = (AbstractHierarchicalGraphSelection) checkNotNull(selection).getRootSelection();

    //
    Set<String> ids = _extractSelectionIds(selection);

    //
    for (IHierarchicalGraphSelectionListener listener : _listener) {
      if (!ids.contains(listener.getSelectionProviderId())) {
        _notifyListener(listener);
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param selectionProviderId
   * @return
   */
  private AbstractHierarchicalGraphSelection _createParent(String selectionProviderId) {

    //
    if (_lastDeliveredGraphSelection.containsKey(selectionProviderId)
        && !_lastDeliveredGraphSelection.get(selectionProviderId).equals(NodeSelection.EMPTY_SELECTION)) {

      return _lastDeliveredGraphSelection.get(selectionProviderId).clone();
    }

    //
    return null;
  }

  /**
   * <p>
   * </p>
   *
   * @param listener
   */
  private void _notifyListener(IHierarchicalGraphSelectionListener listener) {
    checkNotNull(listener).currentSelectionChanged(_currentSelection);
    _lastDeliveredGraphSelection.put(listener.getSelectionProviderId(), _currentSelection);
  }

  /**
   * <p>
   * </p>
   *
   * @param selection
   * @return
   */
  private static Set<String> _extractSelectionIds(IHierarchicalGraphSelection selection) {
    Set<String> result = new HashSet<>();
    selection = selection.getRootSelection();
    result.add(selection.getSelectionProviderId());
    while (selection.hasDetailSelection()) {
      selection = selection.getDetailSelection();
      result.add(selection.getSelectionProviderId());
    }
    return result;
  }
}
