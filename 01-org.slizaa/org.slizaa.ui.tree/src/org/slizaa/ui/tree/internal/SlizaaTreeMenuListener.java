package org.slizaa.ui.tree.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.slizaa.ui.tree.internal.menu.MenuBuilder;

/**
 * {@link IMenuListener Menu listener} added on the tree master detail.
 */
public class SlizaaTreeMenuListener implements IMenuListener {

  private final TreeViewer treeViewer;

  public SlizaaTreeMenuListener(TreeViewer treeViewer) {
    this.treeViewer = treeViewer;
  }

  @Override
  public void menuAboutToShow(IMenuManager menuManager) {

    //
    if (treeViewer.getSelection().isEmpty()) {
      return;
    }

    //
    if (treeViewer.getSelection() instanceof IStructuredSelection) {

      //
      final IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();

      //
      if (selection.size() > 0 && selection.getFirstElement() instanceof EObject) {
        final EObject eSelectedObject = (EObject) selection.getFirstElement();
        MenuBuilder.populateMenu(menuManager, eSelectedObject);
      }
    }
  }
}