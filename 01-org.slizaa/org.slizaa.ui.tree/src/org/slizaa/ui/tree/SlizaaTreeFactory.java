package org.slizaa.ui.tree;

import org.eclipse.emfforms.internal.swt.treemasterdetail.DefaultTreeViewerCustomization;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeViewerSWTFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl;
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
              protected void handleTreeExpand(TreeEvent event) {
                if (event.item.getData() instanceof ExtendedHGNodeImpl) {
                  ExtendedHGNodeImpl hgNode = (ExtendedHGNodeImpl) event.item.getData();
                  hgNode.onExpand();
                  
                  //
                  System.out.println(hgNode.getOutgoingCoreDependencies(false));
                  System.out.println(hgNode.getIncomingCoreDependencies(false));
                }
                super.handleTreeExpand(event);
              }

              protected void handleTreeCollapse(TreeEvent event) {
                if (event.item.getData() instanceof ExtendedHGNodeImpl) {
                  ExtendedHGNodeImpl hgNode = (ExtendedHGNodeImpl) event.item.getData();
                  hgNode.onCollapse();
                }
                super.handleTreeCollapse(event);
              }

            };
            treeViewer.setAutoExpandLevel(autoExpandLevel);
            treeViewer.setUseHashlookup(true);
            return treeViewer;
          }
        }).customizeMenu(new SlizaaMenuProvider()).customizeDragAndDrop(new DefaultDNDProvider())
        // .customizeContentProvider(createAdapterFactoryContentProvider())
        .create();

    // set the layout data
    result.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    // set sorter
    // TODO
    // result.setSorter(new CustomViewerSorter());

    //
    // TODO
    // result.addSelectionChangedListener(new ISelectionChangedListener() {
    //
    // @Override
    // public void selectionChanged(SelectionChangedEvent event) {
    //
    // //
    // IStructuredSelection selection = (IStructuredSelection)
    // event.getSelection();
    // _selectionService.setSelection(selection.size() == 1 ?
    // selection.getFirstElement() : selection.toArray());
    //
    // //
    // // MOVE TO SELECTION SERVICE!!
    // if (selection.getFirstElement() instanceof HGNode) {
    //
    // // TODO MULTISELECT
    // HGNode hgNode = (HGNode) selection.getFirstElement();
    // if (hgNode.getNodeSource() instanceof
    // ExtendedNeo4JBackedNodeSourceImpl) {
    //
    // // TODO
    // List<?> sel = selection.toList();
    // List<HGNode> rep = new LinkedList<>();
    // for (Object s : sel) {
    // if (!(s instanceof HGNode)) {
    // return;
    // } else {
    // rep.add((HGNode) s);
    // }
    // }
    //
    // _hierarchicalGraphSelectionService.setCurrentNodeSelection(PART_ID,
    // rep);
    // }
    // }
    // }
    // });

    // return result
    return result;
  }

  // /**
  // * <p>
  // * </p>
  // *
  // * @return
  // */
  // private static IContentProvider createAdapterFactoryContentProvider() {
  //
  // //
  // ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
  // new AdapterFactory[] { new CustomReflectiveItemProviderAdapterFactory(),
  // new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) });
  //
  // AdapterFactoryContentProvider adapterFactoryContentProvider = new AdapterFactoryContentProvider(adapterFactory) {
  //
  // @Override
  // public Object[] getElements(Object object) {
  // if (RootObject.class.isInstance(object)) {
  // return new Object[] { RootObject.class.cast(object).getRoot() };
  // }
  // if (EListRootObject.class.isInstance(object)) {
  // return EListRootObject.class.cast(object).getEList().toArray();
  // }
  // return super.getElements(object);
  // }
  //
  // @Override
  // public boolean hasChildren(Object object) {
  // return getChildren(object).length > 0;
  // }
  // };
  // return adapterFactoryContentProvider;
  // }
}
