package org.slizaa.ui.tree;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecp.view.model.common.edit.provider.CustomReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
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
import org.slizaa.ui.common.context.RootObject;
import org.slizaa.ui.tree.internal.Activator;
import org.slizaa.ui.tree.internal.InterceptableAdapterFactoryLabelProvider;
import org.slizaa.ui.tree.internal.NullDNDProvider;
import org.slizaa.ui.tree.menu.SlizaaMenuProvider;

public class SlizaaTreeFactory {

  public static TreeViewer createTreeViewer(Composite parent, Object input) {
    return createTreeViewer(parent, input, SWT.NO_BACKGROUND | SWT.NONE | SWT.MULTI);
  }

  public static TreeViewer createTreeViewer(Composite parent, Object input, int style) {
    return createTreeViewer(parent, input, style, 3, null);
  }

  public static TreeViewer createTreeViewer(Composite parent, Object input, int style, int autoExpandLevel,
      IEventInterceptor eventInterceptor) {

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
                  if (eventInterceptor != null) {
                    eventInterceptor.handleSelect((ExtendedHGNodeImpl) event.item.getData());
                  }

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
                  if (eventInterceptor != null) {
                    eventInterceptor.handleTreeExpand((ExtendedHGNodeImpl) event.item.getData());
                  }

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
                  if (eventInterceptor != null) {
                    eventInterceptor.handleTreeCollapse((ExtendedHGNodeImpl) event.item.getData());
                  }

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
        }).customizeMenu(new SlizaaMenuProvider()).customizeDragAndDrop(new NullDNDProvider())
        .customizeContentProvider(getAdapterFactoryContentProvider()).create();

    //
    result.setLabelProvider(
        new InterceptableAdapterFactoryLabelProvider(Activator.getDefault().getComposedAdapterFactory(), result));

    // set the layout data
    result.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    // return result
    return result;
  }

  /**
   * Returns the {@link AdapterFactoryContentProvider}.
   *
   * @return the content provider
   */
  protected static AdapterFactoryContentProvider getAdapterFactoryContentProvider() {
    final ComposedAdapterFactory adapterFactory = getComposedAdapterFactory();
    return new AdapterFactoryContentProvider(adapterFactory) {

      @Override
      public Object[] getElements(Object object) {
        if (RootObject.class.isInstance(object)) {
          return new Object[] { RootObject.class.cast(object).getRoot() };
        }
        return super.getElements(object);
      }

      @Override
      public boolean hasChildren(Object object) {
        return getChildren(object).length > 0;
      }
    };
  }

  /**
   * Gives access to the composed adapter factory.
   *
   * @return the adapter factory
   */
  protected static ComposedAdapterFactory getComposedAdapterFactory() {
    return new ComposedAdapterFactory(new AdapterFactory[] { new CustomReflectiveItemProviderAdapterFactory(),
        new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) });
  }
}
