package org.slizaa.hierarchicalgraph.selection.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;

public class ExtendedDependencySelectionStack extends DependencySelectionStackImpl {

  /** - */
  protected List<EList<AbstractHGDependency>> _dependencySelectionStack;

  /** - */
  private int                                 _currentPosition = -1;

  @Override
  public boolean canGoForward() {
    return _currentPosition != -1 && _currentPosition < 0;
  }

  @Override
  public void goForward() {
    super.goForward();
  }

  @Override
  public boolean canGoBack() {
    return _currentPosition > 0;
  }

  @Override
  public void goBack() {
    super.goBack();
  }

  @Override
  public void clear() {

  }

  @Override
  public void setSelection(EList<AbstractHGDependency> selection) {

    //
    checkNotNull(currentSelection);

    // 'cut' the selection history
    if (_currentPosition != -1) {
      for (int i = dependencySelectionStack().size() - 1; i > _currentPosition; i--) {
        dependencySelectionStack().remove(i);
      }
    }

    //
    dependencySelectionStack().add(currentSelection);
    _currentPosition = _currentPosition + 1;

    // set currentSelection
    ECollections.setEList(getCurrentSelection(), selection);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private List<EList<AbstractHGDependency>> dependencySelectionStack() {

    //
    if (_dependencySelectionStack == null) {
      _dependencySelectionStack = new ArrayList<EList<AbstractHGDependency>>();
    }

    //
    return _dependencySelectionStack;
  }
}
