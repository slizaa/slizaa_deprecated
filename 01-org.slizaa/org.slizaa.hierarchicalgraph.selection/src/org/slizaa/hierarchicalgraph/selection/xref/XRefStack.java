package org.slizaa.hierarchicalgraph.selection.xref;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;

import org.eclipse.core.runtime.ListenerList;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.SourceOrTarget;
import org.slizaa.hierarchicalgraph.selection.NodeSelections;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.hierarchicalgraph.selection.XReferenceSelection;
import org.slizaa.hierarchicalgraph.selection.selector.DefaultDependencySelector;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelector;
import org.slizaa.hierarchicalgraph.selection.xref.internal.UnmodifiableIDependencySelector;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XRefStack {

  /** - */
  private Collection<HGNode>          _additionalVisibleCenterNodes;

  /** - */
  private Collection<HGNode>          _selectedCenterNodes;

  /** - */
  private IDependencySelector         _outgoingDependencySelector;

  /** - */
  private IDependencySelector         _incomingDependencySelector;

  /** - */
  private IDependencySelector         _backReferencesFromOutgoingDependenciesSelector;

  /** - */
  private IDependencySelector         _backReferencesFromIncomingDependenciesSelector;

  /** - */
  private SourceOrTarget              _activeBackReferenceSelector;

  /** - */
  private List<XReferenceSelection>   _selectionStack;

  /** - */
  private int                         _currentCropPosition;

  /** - */
  private ListenerList<IXRefListener> _listenerList;

  /**
   * <p>
   * Creates a new instance of type {@link XRefStack}.
   * </p>
   */
  public XRefStack() {

    // initialize
    _incomingDependencySelector = new DefaultDependencySelector();
    _outgoingDependencySelector = new DefaultDependencySelector();
    _backReferencesFromIncomingDependenciesSelector = new DefaultDependencySelector();
    _backReferencesFromOutgoingDependenciesSelector = new DefaultDependencySelector();
    _additionalVisibleCenterNodes = Collections.emptyList();
    _selectedCenterNodes = Collections.emptyList();

    //
    _listenerList = new ListenerList<>();
    _selectionStack = new Stack<>();

    //
    _currentCropPosition = -1;
  }

  /**
   * <p>
   * </p>
   *
   * @param selectionListener
   */
  public void addXRefListener(IXRefListener selectionListener) {
    _listenerList.add(checkNotNull(selectionListener));
  }

  /**
   * <p>
   * </p>
   *
   * @param selectionListener
   */
  public void removeXRefListener(IXRefListener selectionListener) {
    _listenerList.remove(checkNotNull(selectionListener));
  }

  /**
   * <p>
   * </p>
   *
   * @param incomingDependencies
   * @param outgoingDependencies
   */
  public void pruneDependenciesForUncroppedCenterNodes(Collection<HGNode> selectedCenterNodes,
      Collection<HGCoreDependency> incomingDependencies, Collection<HGCoreDependency> outgoingDependencies) {

    //
    checkNotNull(selectedCenterNodes);
    checkNotNull(incomingDependencies);
    checkNotNull(outgoingDependencies);

    checkState(!isCurrentSelectionCropped());

    //
    _selectedCenterNodes = selectedCenterNodes;
    _incomingDependencySelector.setUnfilteredCoreDependencies(incomingDependencies);
    _outgoingDependencySelector.setUnfilteredCoreDependencies(outgoingDependencies);
    _activeBackReferenceSelector = null;
    _backReferencesFromIncomingDependenciesSelector.setUnfilteredCoreDependencies(incomingDependencies);
    _backReferencesFromOutgoingDependenciesSelector.setUnfilteredCoreDependencies(outgoingDependencies);

    //
    fireEvent(l -> l.coreDependenciesChanged());
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedCenterNodes
   */
  public void setSelectedCenterNodes(HGNode... selectedCenterNodes) {
    setSelectedCenterNodes(Arrays.asList(selectedCenterNodes));
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedCenterNodes
   */
  public void setSelectedCenterNodes(Collection<HGNode> selectedCenterNodes) {

    // set the new selection
    _selectedCenterNodes = checkNotNull(selectedCenterNodes);
    _incomingDependencySelector.setSelectedTargetNodes(selectedCenterNodes);
    _outgoingDependencySelector.setSelectedSourceNodes(selectedCenterNodes);
    _activeBackReferenceSelector = null;
    _backReferencesFromIncomingDependenciesSelector
        .setUnfilteredCoreDependencies(checkNotNull(_incomingDependencySelector.getFilteredCoreDependencies()));
    _backReferencesFromOutgoingDependenciesSelector
        .setUnfilteredCoreDependencies(checkNotNull(_outgoingDependencySelector.getFilteredCoreDependencies()));

    //
    fireEvent(l -> l.centerNodeSelectionChanged());
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedLeftsidedNodes
   */
  public void setSelectedLeftsidedNodes(HGNode... selectedLeftsidedNodes) {
    setSelectedLeftsidedNodes(Arrays.asList(selectedLeftsidedNodes));
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedLeftsidedNodes
   */
  public void setSelectedLeftsidedNodes(Collection<HGNode> selectedLeftsidedNodes) {

    //
    _activeBackReferenceSelector = SourceOrTarget.SOURCE;
    _backReferencesFromIncomingDependenciesSelector.setSelectedSourceNodes(selectedLeftsidedNodes);
    _backReferencesFromOutgoingDependenciesSelector.setSelectedTargetNodes(Collections.emptySet());

    // fire event
    Set<HGNode> affectedNodes = new HashSet<>(_incomingDependencySelector.getUnfilteredTargetNodesWithParents());
    affectedNodes.addAll(_outgoingDependencySelector.getUnfilteredSourceNodesWithParents());
    fireEvent(l -> l.leftsidedNodeSelectionChanged());
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedRightsidedNodes
   */
  public void setSelectedRightsidedNodes(HGNode... selectedRightsidedNodes) {
    setSelectedRightsidedNodes(Arrays.asList(selectedRightsidedNodes));
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedRightsidedNodes
   */
  public void setSelectedRightsidedNodes(Collection<HGNode> selectedRightsidedNodes) {

    //
    _activeBackReferenceSelector = SourceOrTarget.TARGET;
    _backReferencesFromIncomingDependenciesSelector.setSelectedSourceNodes(Collections.emptySet());
    _backReferencesFromOutgoingDependenciesSelector.setSelectedTargetNodes(selectedRightsidedNodes);

    // fire event
    Set<HGNode> affectedNodes = new HashSet<>(_incomingDependencySelector.getUnfilteredTargetNodesWithParents());
    affectedNodes.addAll(_outgoingDependencySelector.getUnfilteredSourceNodesWithParents());
    fireEvent(l -> l.rightsidedNodeSelectionChanged());
  }

  /**
   * <p>
   * </p>
   */
  public void cropSelection() {

    //
    XReferenceSelection selection = SelectionFactory.eINSTANCE.createXReferenceSelection();

    // we have to filter the 'opposite' selector as well
    if (SourceOrTarget.SOURCE.equals(_activeBackReferenceSelector)) {
      _backReferencesFromOutgoingDependenciesSelector.setSelectedSourceNodes(getBackreferencedCenterNodes());
    } else if (SourceOrTarget.TARGET.equals(_activeBackReferenceSelector)) {
      _backReferencesFromIncomingDependenciesSelector.setSelectedTargetNodes(getBackreferencedCenterNodes());
    }

    //
    if (_activeBackReferenceSelector != null) {
      selection.getIncomingDependencies()
          .addAll(_backReferencesFromIncomingDependenciesSelector.getFilteredCoreDependencies());
      selection.getOutgoingDependencies()
          .addAll(_backReferencesFromOutgoingDependenciesSelector.getFilteredCoreDependencies());
    }
    //
    else {
      selection.getNodes().addAll(_selectedCenterNodes);
      selection.getIncomingDependencies().addAll(_incomingDependencySelector.getFilteredCoreDependencies());
      selection.getOutgoingDependencies().addAll(_outgoingDependencySelector.getFilteredCoreDependencies());
    }

    // we have to cut the abandoned part of the list
    if (_currentCropPosition == -1) {
      _selectionStack.clear();
    } else {
      if (_currentCropPosition < _selectionStack.size()) {
        _selectionStack = _selectionStack.subList(0, _currentCropPosition + 1);
      }
    }
    _selectionStack.add(selection);
    _currentCropPosition++;

    //
    _additionalVisibleCenterNodes = selection.getNodes();
    _incomingDependencySelector.setUnfilteredCoreDependencies(selection.getIncomingDependencies());
    _outgoingDependencySelector.setUnfilteredCoreDependencies(selection.getOutgoingDependencies());

    //
    _activeBackReferenceSelector = null;

    //
    fireEvent(l -> l.croppedSelectionChanged());
  }

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  public void cropSelection(Collection<HGNode> selectedNodes) {

    //
    _uncropAll();

    //
    _incomingDependencySelector.setSelectedTargetNodes(checkNotNull(selectedNodes));
    _outgoingDependencySelector.setSelectedSourceNodes(checkNotNull(selectedNodes));

    //
    XReferenceSelection selection = SelectionFactory.eINSTANCE.createXReferenceSelection();
    selection.getNodes().addAll(selectedNodes);
    selection.getIncomingDependencies().addAll(_incomingDependencySelector.getFilteredCoreDependencies());
    selection.getOutgoingDependencies().addAll(_outgoingDependencySelector.getFilteredCoreDependencies());

    //
    System.out.println("OK: " + _incomingDependencySelector.getFilteredCoreDependencies());
    System.out.println("OK: " + _outgoingDependencySelector.getFilteredCoreDependencies());
    
    //
    _additionalVisibleCenterNodes = selectedNodes;
    _incomingDependencySelector.setUnfilteredCoreDependencies(selection.getIncomingDependencies());
    _outgoingDependencySelector.setUnfilteredCoreDependencies(selection.getOutgoingDependencies());
    _selectionStack.add(selection);
    _currentCropPosition++;

    //
    _activeBackReferenceSelector = null;

    //
    fireEvent(l -> l.croppedSelectionChanged());
  }

  /**
   * <p>
   * </p>
   */
  public void uncropAll() {

    //
    _uncropAll();

    //
    fireEvent(l -> l.croppedSelectionChanged());
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public boolean canGoBack() {
    return _currentCropPosition != -1;
  }

  /**
   * <p>
   * </p>
   */
  public void goBack() {

    //
    if (canGoBack()) {

      _currentCropPosition--;

      //
      if (_currentCropPosition == -1) {
        _additionalVisibleCenterNodes = Collections.emptyList();
        _incomingDependencySelector.setUnfilteredCoreDependencies(Collections.emptyList());
        _outgoingDependencySelector.setUnfilteredCoreDependencies(Collections.emptyList());
      }

      //
      else {
        _additionalVisibleCenterNodes = _selectionStack.get(_currentCropPosition).getNodes();
        _incomingDependencySelector
            .setUnfilteredCoreDependencies(_selectionStack.get(_currentCropPosition).getIncomingDependencies());
        _outgoingDependencySelector
            .setUnfilteredCoreDependencies(_selectionStack.get(_currentCropPosition).getOutgoingDependencies());
      }

      //
      fireEvent(l -> l.croppedSelectionChanged());
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public boolean canGoForward() {
    return _currentCropPosition + 1 < _selectionStack.size();
  }

  /**
   * <p>
   * </p>
   */
  public void goForward() {

    //
    if (canGoForward()) {

      _currentCropPosition++;

      //
      _additionalVisibleCenterNodes = _selectionStack.get(_currentCropPosition).getNodes();
      _incomingDependencySelector
          .setUnfilteredCoreDependencies(_selectionStack.get(_currentCropPosition).getIncomingDependencies());
      _outgoingDependencySelector
          .setUnfilteredCoreDependencies(_selectionStack.get(_currentCropPosition).getOutgoingDependencies());

      //
      fireEvent(l -> l.croppedSelectionChanged());
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public boolean hasCroppedSelections() {
    return _selectionStack.size() > 0;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public boolean isCurrentSelectionCropped() {
    return hasCroppedSelections() && _currentCropPosition != -1;
  }

//  /**
//   * <p>
//   * </p>
//   *
//   * @return
//   */
//  public Set<HGNode> getVisibleCenterNodes() {
//    Set<HGNode> union = new HashSet<HGNode>(_incomingDependencySelector.getSelectedTargetNodes());
//    union.addAll(_outgoingDependencySelector.getSelectedSourceNodes());
//    union.addAll(_additionalVisibleCenterNodes);
//    return union;
//  }

  /**
   * <p>
   * </p>
   */
  public Set<HGCoreDependency> getSelectedDependencies() {

    //
    if (_activeBackReferenceSelector == null) {
      return Collections.emptySet();
    }
    //
    else if (SourceOrTarget.SOURCE.equals(_activeBackReferenceSelector)) {
      return _backReferencesFromIncomingDependenciesSelector.getFilteredCoreDependencies();
    }
    //
    else if (SourceOrTarget.TARGET.equals(_activeBackReferenceSelector)) {
      return _backReferencesFromOutgoingDependenciesSelector.getFilteredCoreDependencies();
    }

    // should not happen
    return Collections.emptySet();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getVisibleCenterNodesWithParents(boolean includeChildren) {
    Set<HGNode> union = new HashSet<HGNode>(_incomingDependencySelector.getUnfilteredTargetNodesWithParents());
    union.addAll(_outgoingDependencySelector.getUnfilteredSourceNodesWithParents());
    union.addAll(NodeSelections.computeNodesWithParents(_additionalVisibleCenterNodes, true));
    return union;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getBackreferencedCenterNodesWithParents() {

    //
    if (_activeBackReferenceSelector == null) {
      return Collections.emptySet();
    }
    //
    else if (SourceOrTarget.SOURCE.equals(_activeBackReferenceSelector)) {
      return _backReferencesFromIncomingDependenciesSelector.getFilteredTargetNodesWithParents();
    }
    //
    else if (SourceOrTarget.TARGET.equals(_activeBackReferenceSelector)) {
      return _backReferencesFromOutgoingDependenciesSelector.getFilteredSourceNodesWithParents();
    }

    // should not happen
    return Collections.emptySet();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getBackreferencedCenterNodes() {

    //
    if (_activeBackReferenceSelector == null) {
      return Collections.emptySet();
    }
    //
    else if (SourceOrTarget.SOURCE.equals(_activeBackReferenceSelector)) {
      return _backReferencesFromIncomingDependenciesSelector.getFilteredTargetNodes();
    }
    //
    else if (SourceOrTarget.TARGET.equals(_activeBackReferenceSelector)) {
      return _backReferencesFromOutgoingDependenciesSelector.getFilteredSourceNodes();
    }

    // should not happen
    return Collections.emptySet();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getRightsidedNodesWithParents() {
    return _outgoingDependencySelector.getFilteredTargetNodesWithParents();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getLeftsidedNodesWithParents() {
    return _incomingDependencySelector.getFilteredSourceNodesWithParents();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public IDependencySelector incomingDependencySelector() {
    return new UnmodifiableIDependencySelector(_incomingDependencySelector);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public IDependencySelector outgoingDependencySelector() {
    return new UnmodifiableIDependencySelector(_outgoingDependencySelector);
  }

  private void _uncropAll() {
    //
    _selectionStack.clear();

    //
    _incomingDependencySelector.setUnfilteredCoreDependencies(Collections.emptyList());
    _outgoingDependencySelector.setUnfilteredCoreDependencies(Collections.emptyList());

    //
    _activeBackReferenceSelector = null;
    _backReferencesFromIncomingDependenciesSelector.setUnfilteredCoreDependencies(Collections.emptySet());
    _backReferencesFromOutgoingDependenciesSelector.setUnfilteredCoreDependencies(Collections.emptySet());

    //
    _selectionStack.clear();
    _currentCropPosition = -1;
  }

  /**
   * <p>
   * </p>
   *
   * @param c
   */
  private void fireEvent(Consumer<IXRefListener> c) {
    for (IXRefListener listener : _listenerList) {
      try {
        c.accept(listener);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
