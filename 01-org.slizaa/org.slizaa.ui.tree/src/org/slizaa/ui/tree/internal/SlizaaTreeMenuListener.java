package org.slizaa.ui.tree.internal;

import java.util.Collection;
import java.util.List;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
//import org.eclipse.emf.ecp.common.spi.ChildrenDescriptorCollector;
//import org.eclipse.emfforms.spi.swt.treemasterdetail.util.CreateChildAction;
//import org.eclipse.emfforms.spi.swt.treemasterdetail.util.CreateElementCallback;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.osgi.framework.FrameworkUtil;
import org.slizaa.ui.tree.SlizaaTreeAction;

/**
 * {@link IMenuListener Menu listener} added on the tree master detail.
 */
public class SlizaaTreeMenuListener implements IMenuListener {

//  private final ChildrenDescriptorCollector childrenDescriptorCollector;

  private final MenuManager                 menuMgr;

  private final TreeViewer                  treeViewer;

  private final EditingDomain               editingDomain;

//  private final CreateElementCallback       createElementCallback;

  // private final SlizaaDeleteActionBuilder deleteActionBuilder;

  public SlizaaTreeMenuListener(/* ChildrenDescriptorCollector childrenDescriptorCollector,*/ MenuManager menuMgr,
      TreeViewer treeViewer, EditingDomain editingDomain /*,
      CreateElementCallback createElementCallback  , SlizaaDeleteActionBuilder deleteActionBuilder */) {

//    this.childrenDescriptorCollector = childrenDescriptorCollector;
    this.menuMgr = menuMgr;
    this.treeViewer = treeViewer;
    this.editingDomain = editingDomain;
//    this.createElementCallback = createElementCallback;
    // this.deleteActionBuilder = deleteActionBuilder;
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
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
        if (domain == null) {
          return;
        }
//        final Collection<?> descriptors = childrenDescriptorCollector.getDescriptors(eObject);
//        fillContextMenu(manager, descriptors, editingDomain, eObject);
      }
//      manager.add(new Separator());

      // addDeleteActionToContextMenu(editingDomain, menuMgr, selection);

      // //
      // MenuManager menu1 = new MenuManager("Menu &1", "1");
      // menu1.add(new Action("Action 1") {
      // });
      // menu1.add(new Action("Action 2") {
      // });
      // manager.add(menu1);

      // IWorkbench iWorkbench = Activator.getDefault().getE4Workbench().getApplication().getContext();
      // EPartService partService = iWorkbench.getApplication().getContext().get(EPartService.class);
      // System.out.println(partService);

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
//
//  /**
//   * Fill context menu.
//   *
//   * @param manager
//   *          The menu manager responsible for the context menu
//   * @param descriptors
//   *          The menu items to be added
//   * @param domain
//   *          The editing domain of the current EObject
//   * @param eObject
//   *          The model element
//   */
//  private void fillContextMenu(IMenuManager manager, Collection<?> descriptors, final EditingDomain domain,
//      final EObject eObject) {
//    for (final Object descriptor : descriptors) {
//
//      if (!CommandParameter.class.isInstance(descriptor)) {
//        continue;
//      }
//      final CommandParameter cp = (CommandParameter) descriptor;
//      if (cp.getEReference() == null) {
//        continue;
//      }
//      if (filterDescriptor(cp)) {
//        continue;
//      }
//      if (!cp.getEReference().isMany() && eObject.eIsSet(cp.getEStructuralFeature())) {
//        continue;
//      } else if (cp.getEReference().isMany() && cp.getEReference().getUpperBound() != -1
//          && cp.getEReference().getUpperBound() <= ((List<?>) eObject.eGet(cp.getEReference())).size()) {
//        continue;
//      }
//
////      manager.add(new CreateChildAction(eObject, domain, treeViewer, cp, createElementCallback));
//    }
//
//  }

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

  // /**
  // * Adds the delete action to context menu.
  // *
  // * @param editingDomain
  // * the editing domain
  // * @param manager
  // * the manager
  // * @param selection
  // * the selection
  // */
  // private void addDeleteActionToContextMenu(final EditingDomain editingDomain, final IMenuManager manager,
  // final IStructuredSelection selection) {
  // final Action deleteAction = deleteActionBuilder.createDeleteAction(selection, editingDomain);
  // manager.add(deleteAction);
  // }

  /**
   * @return
   */
  private SlizaaTreeAction[] getRightClickActions() {
    return Activator.getDefault().getSlizaaTreeActions();
  }
}