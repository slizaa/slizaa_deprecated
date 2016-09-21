package org.slizaa.ui.tree.internal;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfforms.spi.swt.treemasterdetail.DNDProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.Transfer;

public class NullDNDProvider implements DNDProvider {

  @Override
  public boolean hasDND() {
    return false;
  }

  @Override
  public Transfer[] getDropTransferTypes() {
    return null;
  }

  @Override
  public int getDropOperations() {
    return 0;
  }

  @Override
  public DropTargetListener getDropListener(EditingDomain editingDomain, TreeViewer treeViewer) {
    return null;
  }

  @Override
  public Transfer[] getDragTransferTypes() {
    return null;
  }

  @Override
  public int getDragOperations() {
    return 0;
  }

  @Override
  public DragSourceListener getDragListener(TreeViewer treeViewer) {
    return null;
  }
}
