package org.slizaa.ui.tree.menu;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 *
 */
public interface SlizaaDeleteActionBuilder {

	/**
	 * This method creates an action which gets added to the context menu of elements in the TreeMasterDetail. The
	 * action is supposed to delete the selected element.
	 *
	 * @param selection the tree viewer selection
	 * @param editingDomain the editing domain
	 * @return the action which will be added
	 */
	Action createDeleteAction(IStructuredSelection selection, EditingDomain editingDomain);

}
