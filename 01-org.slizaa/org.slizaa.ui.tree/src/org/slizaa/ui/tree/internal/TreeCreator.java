package org.slizaa.ui.tree.internal;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.slizaa.ui.shared.context.RootObject;
import org.slizaa.ui.tree.interceptors.ITreeEventInterceptor;

public class TreeCreator {

  public static CheckboxTreeViewer createCheckboxTreeViewer(Composite parent, int style) {

    //
    final CheckboxTreeViewer treeViewer = new CheckboxTreeViewer(parent, SWT.NO_SCROLL | SWT.V_SCROLL | style);

    //
    GridDataFactory.fillDefaults().grab(true, true).applyTo(treeViewer.getControl());

    //
    treeViewer.setContentProvider(getAdapterFactoryContentProvider());
    treeViewer.getControl().setMenu(getMenu(treeViewer /* , editingDomain */));
    
    // https://www.eclipse.org/forums/index.php/t/1082215/
    treeViewer.setLabelProvider(
        new InterceptableAdapterFactoryLabelProvider(Activator.getComposedAdapterFactory(), treeViewer));

    // set the layout data
    treeViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    //
    return treeViewer;
  }
  
  public static TreeViewer createTreeViewer(Composite parent) {
    return createTreeViewer(parent, SWT.NO_SCROLL | SWT.V_SCROLL | SWT.NO_BACKGROUND | SWT.MULTI);
  }

  public static TreeViewer createTreeViewer(Composite parent, int style) {
    return createTreeViewer(parent, style, 3, null);
  }

  public static TreeViewer createTreeViewer(Composite parent, int style, int autoExpandLevel,
      ITreeEventInterceptor eventInterceptor) {

    //
    /* EditingDomain editingDomain = getEditingDomain(input); */

    //
    final TreeViewer treeViewer = new SlizaaTreeViewer(parent, SWT.NO_SCROLL | SWT.V_SCROLL | style, eventInterceptor,
        autoExpandLevel);

    //
    GridDataFactory.fillDefaults().grab(true, true).applyTo(treeViewer.getControl());

    //
    treeViewer.setContentProvider(getAdapterFactoryContentProvider());

    treeViewer.getControl().setMenu(getMenu(treeViewer /* , editingDomain */));

    //
    treeViewer.setLabelProvider(
        new InterceptableAdapterFactoryLabelProvider(Activator.getDefault().getComposedAdapterFactory(), treeViewer));

    // set the layout data
    treeViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    //
    return treeViewer;
  }

  /**
   * @param input
   *          the input
   * @return the {@link EditingDomain}
   */
  static EditingDomain getEditingDomain(Object input) {
    if (input instanceof Resource) {
      return AdapterFactoryEditingDomain.getEditingDomainFor(((Resource) input).getContents().get(0));
    } else if (input instanceof RootObject) {
      return AdapterFactoryEditingDomain.getEditingDomainFor(RootObject.class.cast(input).getRoot());
    } else {
      return AdapterFactoryEditingDomain.getEditingDomainFor(input);
    }
  }

  /**
   * Returns the {@link AdapterFactoryContentProvider}.
   *
   * @return the content provider
   */
  protected static AdapterFactoryContentProvider getAdapterFactoryContentProvider() {
    final ComposedAdapterFactory adapterFactory = Activator.getComposedAdapterFactory();
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

  protected static Menu getMenu(TreeViewer treeViewer /* , EditingDomain editingDomain */) {
    final MenuManager menuMgr = new MenuManager();
    menuMgr.setRemoveAllWhenShown(true);
    menuMgr.addMenuListener(new SlizaaTreeMenuListener(treeViewer));
    final Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
    return menu;
  }
}
