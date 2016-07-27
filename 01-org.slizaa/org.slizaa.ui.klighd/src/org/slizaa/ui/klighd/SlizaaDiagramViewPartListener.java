package org.slizaa.ui.klighd;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.progress.UIJob;
import org.slizaa.selection.IHierarchicalGraphSelection;
import org.slizaa.selection.IHierarchicalGraphSelectionListener;
import org.slizaa.selection.INodeSelection;

import de.cau.cs.kieler.klighd.ui.DiagramViewManager;

/**
 * 
 */
class SlizaaDiagramViewPartListener implements IPartListener2, IHierarchicalGraphSelectionListener {

  private static final String         UPDATE_JOB = "Updating Diagram";

  /** The related diagram view. */
  private final SlizaaDiagramViewPart _diagramView;

  /** - */
  private INodeSelection              _currentNodeSelection;

  /**
   * Create a new listener handling events for the given {@link SlizaaDiagramViewPart}.
   * <p>
   *
   * @param diagramView
   *          The associated {@link SlizaaDiagramViewPart}
   */
  SlizaaDiagramViewPartListener(final SlizaaDiagramViewPart diagramView) {
    this._diagramView = diagramView;
  }

  /**
   * Activated this adapter.
   */
  public void activate() {
    _diagramView.getSite().getPage().addPartListener(this);
    Activator.getDefault().getHierarchicalGraphSelectionService().addHierarchicalGraphSelectionListener(this);
  }

  /**
   * Deactivated this adapter.
   */
  public void deactivate() {
    _diagramView.getSite().getPage().removePartListener(this);
    Activator.getDefault().getHierarchicalGraphSelectionService().removeHierarchicalGraphSelectionListener(this);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void partOpened(final IWorkbenchPartReference partRef) {

    //
    if (!SlizaaDiagramViewPart.ID.equals(partRef.getId())) {
      return;
    }

    _diagramView.updateDiagram();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void partClosed(final IWorkbenchPartReference partRef) {

    //
    if (!SlizaaDiagramViewPart.ID.equals(partRef.getId())) {
      return;
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void partActivated(final IWorkbenchPartReference partRef) {

    //
    if (!SlizaaDiagramViewPart.ID.equals(partRef.getId())) {
      return;
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void partBroughtToTop(final IWorkbenchPartReference partRef) {

    //
    if (!SlizaaDiagramViewPart.ID.equals(partRef.getId())) {
      return;
    }

    //
    IHierarchicalGraphSelection selection = Activator.getDefault().getHierarchicalGraphSelectionService()
        .getCurrentSelection();

    if (selection != null) {
      updateNodeSelection(selection);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void partDeactivated(final IWorkbenchPartReference partRef) {

    //
    if (!SlizaaDiagramViewPart.ID.equals(partRef.getId())) {
      return;
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void partHidden(final IWorkbenchPartReference partRef) {

    //
    if (!SlizaaDiagramViewPart.ID.equals(partRef.getId())) {
      return;
    }

    //
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void partVisible(final IWorkbenchPartReference partRef) {

    //
    if (!SlizaaDiagramViewPart.ID.equals(partRef.getId())) {
      return;
    }

    //
    IHierarchicalGraphSelection selection = Activator.getDefault().getHierarchicalGraphSelectionService()
        .getCurrentSelection();

    if (selection != null) {
      updateNodeSelection(selection);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void partInputChanged(final IWorkbenchPartReference partRef) {

    //
    if (!SlizaaDiagramViewPart.ID.equals(partRef.getId())) {
      return;
    }
  }

  @Override
  public String getSelectionProviderId() {
    return null;
  }

  @Override
  public void currentSelectionChanged(IHierarchicalGraphSelection selection) {

    if (_diagramView.getSite().getPage().isPartVisible(_diagramView)) {
      updateNodeSelection(selection);
    }
  }

  /**
   * @param selection
   */
  private void updateNodeSelection(IHierarchicalGraphSelection selection) {

    if (setCurrentNodeSelection(selection) && _currentNodeSelection != null) {

      // Start update job
      new UIJob(UPDATE_JOB) {

        @Override
        public IStatus runInUIThread(final IProgressMonitor monitor) {
          DiagramViewManager.updateView("org.slizaa.ui.klighd.SlizaaDiagramViewPart", null, _currentNodeSelection, null);
          return Status.OK_STATUS;
        }
      }.schedule();

    }
  }

  /**
   * <p>
   * </p>
   *
   * @param selection
   * @return
   */
  private boolean setCurrentNodeSelection(IHierarchicalGraphSelection selection) {

    //
    if (selection == null) {
      _currentNodeSelection = null;
      return true;
    }

    //
    INodeSelection nodeSelection = selection.findFirstOccurrence(INodeSelection.class);

    //
    if (nodeSelection != null) {
      if (! nodeSelection.equals(_currentNodeSelection)) {
        _currentNodeSelection = nodeSelection;
        return true;
      }
    }
    
    //
    return false;
  }
}
