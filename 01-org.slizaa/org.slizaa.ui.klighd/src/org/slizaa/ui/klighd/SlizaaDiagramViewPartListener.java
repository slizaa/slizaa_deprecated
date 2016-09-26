package org.slizaa.ui.klighd;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.internal.PartSite;
import org.eclipse.ui.progress.UIJob;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;

import de.cau.cs.kieler.klighd.ui.DiagramViewManager;

/**
 * 
 */
class SlizaaDiagramViewPartListener implements IPartListener2 {

  private static final String         UPDATE_JOB = "Updating Diagram";

  /** The related diagram view. */
  private final SlizaaDiagramViewPart _diagramView;

  /** - */
  private List<HGNode>                _currentNodeSelection;
  
  /** - */
  private List<HGNode>                _shownNodeSelection;

  /**
   * Create a new listener handling events for the given {@link SlizaaDiagramViewPart}.
   * <p>
   *
   * @param diagramView
   *          The associated {@link SlizaaDiagramViewPart}
   */
  SlizaaDiagramViewPartListener(final SlizaaDiagramViewPart diagramView) {
    this._diagramView = checkNotNull(diagramView);
  }

  /**
   * Activated this adapter.
   */
  public void activate() {
    _diagramView.getSite().getPage().addPartListener(this);
    
    IEclipseContext context = ((PartSite) _diagramView.getSite()).getContext();
    ContextInjectionFactory.inject(this, context.getParent());
  }

  /**
   * Deactivated this adapter.
   */
  public void deactivate() {
    _diagramView.getSite().getPage().removePartListener(this);
    
    IEclipseContext context = ((PartSite) _diagramView.getSite()).getContext();
    ContextInjectionFactory.uninject(this, context.getParent());
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

    updateNodeSelection();
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
    updateNodeSelection();
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

  @Inject
  public void initSelection(
      @Optional @Named(SelectionIdentifier.CURRENT_MAIN_NODE_SELECTION) List<HGNode> selectedNodes) {
    
    //
    _currentNodeSelection = selectedNodes;
    
    //
    if (_diagramView.getSite().getPage().isPartVisible(_diagramView)) {
      updateNodeSelection();
    }
  }

  /**
   * @param selection
   */
  private void updateNodeSelection() {

      if (!equalLists(_currentNodeSelection, _shownNodeSelection)) {
        
        _shownNodeSelection = _currentNodeSelection;
        
        // Start update job
        new UIJob(UPDATE_JOB) {
          @Override
          public IStatus runInUIThread(final IProgressMonitor monitor) {
            DiagramViewManager.updateView("org.slizaa.ui.klighd.SlizaaDiagramViewPart", null, _currentNodeSelection,
                null);
            return Status.OK_STATUS;
          }
        }.schedule();
      }
  }

  public  boolean equalLists(List<HGNode> a, List<HGNode> b){     
    
    if (a == null && b == null) {
      return true;
    }
    
    //
    if ((a == null && b!= null) || (a != null && b== null) || (a.size() != b.size())){
        return false;
    }

    // Sort and compare the two lists          
//    Collections.sort(a);
//    Collections.sort(b);      
    return a.equals(b);
}
}
