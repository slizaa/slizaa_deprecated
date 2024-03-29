package org.slizaa.ui.tree.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.ui.shared.context.RootObject;
import org.slizaa.ui.tree.ISlizaaActionContributionProvider;
import org.slizaa.ui.tree.interceptors.ITreeEventInterceptor;

import com.google.common.base.Supplier;

public class SlizaaTreeViewerCreator {

  /** - */
  private ISlizaaActionContributionProvider _slizaaActionContributionProvider;

  /** - */
  private Supplier<IEclipseContext>         _contextSupplier;

  /** - */
  private ComposedAdapterFactory            _adapterFactory;

  /**
   * <p>
   * Creates a new instance of type {@link SlizaaTreeViewerCreator}.
   * </p>
   *
   * @param slizaaActionContributionProvider
   * @param adapterFactory
   * @param contextSupplier
   */
  public SlizaaTreeViewerCreator(ISlizaaActionContributionProvider slizaaActionContributionProvider,
      ComposedAdapterFactory adapterFactory, Supplier<IEclipseContext> contextSupplier) {

    _slizaaActionContributionProvider = slizaaActionContributionProvider;
    _adapterFactory = adapterFactory;
    _contextSupplier = contextSupplier;
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param style
   * @param adapterFactory
   * @return
   */
  public CheckboxTreeViewer createCheckboxTreeViewer(Composite parent, int style) {

    //
    final CheckboxTreeViewer treeViewer = new CheckboxTreeViewer(checkNotNull(parent),
        SWT.NO_SCROLL | SWT.V_SCROLL | style);

    //
    GridDataFactory.fillDefaults().grab(true, true).applyTo(treeViewer.getControl());

    //
    treeViewer.setContentProvider(getAdapterFactoryContentProvider(checkNotNull(_adapterFactory)));
    new SlizaaTreeMenuBuilder(treeViewer, _slizaaActionContributionProvider, _contextSupplier).populateMenu();

    // https://www.eclipse.org/forums/index.php/t/1082215/
    treeViewer
        .setLabelProvider(new InterceptableAdapterFactoryLabelProvider(checkNotNull(_adapterFactory), treeViewer));

    // set the layout data
    treeViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    //
    return treeViewer;
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param adapterFactory
   * @return
   */
  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param adapterFactory
   * @return
   */
  public TreeViewer createTreeViewer(Composite parent) {
    return createTreeViewer(parent, SWT.NO_SCROLL | SWT.V_SCROLL | SWT.NO_BACKGROUND | SWT.MULTI);
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param style
   * @param adapterFactory
   * @return
   */
  public TreeViewer createTreeViewer(Composite parent, int style) {
    return createTreeViewer(parent, style, 3, null);
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param style
   * @param autoExpandLevel
   * @param eventInterceptor
   * @param adapterFactory
   * @return
   */
  public TreeViewer createTreeViewer(Composite parent, int style, int autoExpandLevel,
      ITreeEventInterceptor eventInterceptor) {

    //
    final TreeViewer treeViewer = new SlizaaTreeViewer(parent, SWT.NO_SCROLL | SWT.V_SCROLL | style, eventInterceptor,
        autoExpandLevel);
    
    treeViewer.setUseHashlookup(true);

    treeViewer.addDoubleClickListener(new IDoubleClickListener() {
      @Override
      public void doubleClick(DoubleClickEvent event) {

        //
        ISelection selection = event.getSelection();

        //
        if (selection instanceof IStructuredSelection) {

          //
          IStructuredSelection structuredSelection = (IStructuredSelection) selection;
          
          //
          for (Object selectedElement : structuredSelection.toList()) {
            if (selectedElement instanceof HGNode) {
              HGNode selectedNode = (HGNode) selectedElement;
              treeViewer.setExpandedState(selectedNode, !treeViewer.getExpandedState(selectedNode));
            }
          }
        }
      }
    });

    //
    GridDataFactory.fillDefaults().grab(true, true).applyTo(treeViewer.getControl());

    //
    treeViewer.setContentProvider(getAdapterFactoryContentProvider(checkNotNull(_adapterFactory)));
    new SlizaaTreeMenuBuilder(treeViewer, _slizaaActionContributionProvider, _contextSupplier).populateMenu();

    //
    treeViewer
        .setLabelProvider(new InterceptableAdapterFactoryLabelProvider(checkNotNull(_adapterFactory), treeViewer));

    // set the layout data
    treeViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    //
    return treeViewer;
  }

  /**
   * Returns the {@link AdapterFactoryContentProvider}.
   *
   * @return the content provider
   */
  protected static AdapterFactoryContentProvider getAdapterFactoryContentProvider(
      ComposedAdapterFactory adapterFactory) {

    return new AdapterFactoryContentProvider(checkNotNull(adapterFactory)) {

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

}
