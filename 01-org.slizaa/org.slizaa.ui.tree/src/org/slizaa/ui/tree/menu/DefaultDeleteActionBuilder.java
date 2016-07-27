package org.slizaa.ui.tree.menu;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeMasterDetailComposite;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.osgi.framework.FrameworkUtil;

/**
 * The default delete action creates a remove command and wraps it's execution in the {@link Action#run() run} method.
 */
public class DefaultDeleteActionBuilder implements SlizaaDeleteActionBuilder {

	@Override
	public Action createDeleteAction(IStructuredSelection selection, final EditingDomain editingDomain) {
		final Command deleteCommand = DeleteCommand.create(editingDomain, selection.toList());

		final Action deleteAction = new Action() {
			@Override
			public void run() {
				super.run();
				editingDomain.getCommandStack().execute(deleteCommand);
			}
		};

		if (!deleteCommand.canExecute()) {
			deleteAction.setEnabled(false);
		}

		final String deleteImagePath = "icons/delete.png";//$NON-NLS-1$
		deleteAction.setImageDescriptor(ImageDescriptor
			.createFromURL(FrameworkUtil.getBundle(TreeMasterDetailComposite.class).getResource(deleteImagePath)));
		deleteAction.setText("Delete"); //$NON-NLS-1$

		return deleteAction;
	}

}
