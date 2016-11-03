package org.slizaa.ui.tree.internal;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.osgi.framework.FrameworkUtil;
import org.slizaa.ui.tree.SlizaaTreeAction;

/**
 * {@link IMenuListener Menu listener} added on the tree master detail.
 */
public class SlizaaTreeMenuListener implements IMenuListener {

  private final MenuManager   menuMgr;

  private final TreeViewer    treeViewer;

  private final EditingDomain editingDomain;

  public SlizaaTreeMenuListener(MenuManager menuMgr, TreeViewer treeViewer, EditingDomain editingDomain) {

    this.menuMgr = menuMgr;
    this.treeViewer = treeViewer;
    this.editingDomain = editingDomain;
  }

  @Override
  public void menuAboutToShow(IMenuManager manager) {

    //
    if (treeViewer.getSelection().isEmpty()) {
      return;
    }

    //
    if (treeViewer.getSelection() instanceof IStructuredSelection) {
      final IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();

      if (selection.size() == 1 && selection.getFirstElement() instanceof EObject) {
        final EObject eObject = (EObject) selection.getFirstElement();
//        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
//        if (domain == null) {
//          return;
//        }
      }

      // collect the "right click actions"
      SlizaaTreeAction[] rightClickActions = getRightClickActions();

      if (selection.getFirstElement() instanceof EObject && rightClickActions != null && rightClickActions.length > 0) {

        // TODO: selections
        final EObject eSelectedObject = (EObject) selection.getFirstElement();

        //
        for (final SlizaaTreeAction slizaaTreeAction : rightClickActions) {

          ContextInjectionFactory.inject(slizaaTreeAction,
              Activator.getDefault().getE4Workbench().getApplication().getContext());

          // should show?
          if (slizaaTreeAction.shouldShow(eSelectedObject)) {

            //
            final Action newAction = new Action() {
              @Override
              public void run() {
                ContextInjectionFactory.inject(slizaaTreeAction,
                    Activator.getDefault().getE4Workbench().getApplication().getContext());
                slizaaTreeAction.execute(eSelectedObject);
              }
            };

            // set action image
            if (slizaaTreeAction.getImagePath() != null) {
              newAction.setImageDescriptor(ImageDescriptor.createFromURL(
                  FrameworkUtil.getBundle(slizaaTreeAction.getClass()).getResource(slizaaTreeAction.getImagePath())));
            }

            // set action text
            newAction.setText(slizaaTreeAction.getLabel());

            // set enabled
            newAction.setEnabled(slizaaTreeAction.isEnabled(eSelectedObject));

            // add to manager
            manager.add(newAction);
          }
        }

      }
    }
  }

  /**
   * Allows to prevent adding a create child action for the given {@link CommandParameter}.
   *
   * @param cp
   *          the descriptor
   * @return <code>true</code> if action should be filtered (=not created), <code>false</code> otherwise
   * @since 1.8
   */
  protected boolean filterDescriptor(CommandParameter cp) {
    return false;
  }

  /**
   * @return
   */
  private SlizaaTreeAction[] getRightClickActions() {
    return Activator.getDefault().getSlizaaTreeActions();
  }
}