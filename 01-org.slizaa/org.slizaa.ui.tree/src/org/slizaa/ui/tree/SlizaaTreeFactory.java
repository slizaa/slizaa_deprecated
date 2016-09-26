package org.slizaa.ui.tree;

import org.eclipse.emfforms.internal.swt.treemasterdetail.DefaultTreeViewerCustomization;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeViewerSWTFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl;
import org.slizaa.ui.common.context.BusyCursor;
import org.slizaa.ui.tree.internal.Activator;
import org.slizaa.ui.tree.internal.InterceptableAdapterFactoryLabelProvider;
import org.slizaa.ui.tree.internal.NullDNDProvider;
import org.slizaa.ui.tree.menu.SlizaaMenuProvider;

public class SlizaaTreeFactory {

  public static TreeViewer createTreeViewer(Composite parent, Object input) {
    return createTreeViewer(parent, input, SWT.NO_BACKGROUND | SWT.NONE | SWT.MULTI);
  }

  public static TreeViewer createTreeViewer(Composite parent, Object input, int style) {
    return createTreeViewer(parent, input, style, 3);
  }

  public static TreeViewer createTreeViewer(Composite parent, Object input, int style, int autoExpandLevel) {

    // create the result
    TreeViewer result = TreeViewerSWTFactory.fillDefaults(parent, input)
        .customizeTree(new DefaultTreeViewerCustomization() {

          @Override
          public TreeViewer createTree(Composite parent) {
            final TreeViewer treeViewer = new TreeViewer(parent, style) {

              @Override
              protected void handleSelect(SelectionEvent event) {
                if (event.item.getData() instanceof ExtendedHGNodeImpl) {

                  //
                  BusyCursor.execute(parent, () -> {
                    ExtendedHGNodeImpl hgNode = (ExtendedHGNodeImpl) event.item.getData();
                    hgNode.onSelect();
                  });
                }
                super.handleSelect(event);
              }

              @Override
              protected void handleTreeExpand(TreeEvent event) {
                if (event.item.getData() instanceof ExtendedHGNodeImpl) {

                  //
                  BusyCursor.execute(parent, () -> {
                    ExtendedHGNodeImpl hgNode = (ExtendedHGNodeImpl) event.item.getData();
                    hgNode.onExpand();
                  });
                }
                super.handleTreeExpand(event);
              }

              @Override
              protected void handleTreeCollapse(TreeEvent event) {
                if (event.item.getData() instanceof ExtendedHGNodeImpl) {

                  //
                  BusyCursor.execute(parent, () -> {
                    ExtendedHGNodeImpl hgNode = (ExtendedHGNodeImpl) event.item.getData();
                    hgNode.onCollapse();
                  });
                }
                super.handleTreeCollapse(event);
              }

            };
            treeViewer.setAutoExpandLevel(autoExpandLevel);
            treeViewer.setUseHashlookup(true);
            return treeViewer;
          }
        }).customizeMenu(new SlizaaMenuProvider()).customizeDragAndDrop(new NullDNDProvider()).create();

    //
    result.setLabelProvider(
        new InterceptableAdapterFactoryLabelProvider(Activator.getDefault().getComposedAdapterFactory(), result));

    // set the layout data
    result.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    // return result
    return result;
  }
}
