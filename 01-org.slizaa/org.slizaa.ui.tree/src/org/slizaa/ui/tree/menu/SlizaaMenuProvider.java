package org.slizaa.ui.tree.menu;

import org.eclipse.emf.ecp.common.spi.ChildrenDescriptorCollector;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfforms.spi.swt.treemasterdetail.MenuProvider;
import org.eclipse.emfforms.spi.swt.treemasterdetail.util.CreateElementCallback;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Menu;

/**
 * The default menu provider.
 */
public final class SlizaaMenuProvider implements MenuProvider {

  private ChildrenDescriptorCollector childrenDescriptorCollector;

  private CreateElementCallback       createElementCallback;

  /**
   * Default constructor.
   */
  public SlizaaMenuProvider() {
    childrenDescriptorCollector = new ChildrenDescriptorCollector();
    createElementCallback = new CreateElementCallback() {
      @Override
      public boolean beforeCreateElement(Object newElement) {
        return true;
      }
    };
  }

  /**
   * Constructor.
   *
   * @param childrenDescriptorCollector
   *          the child description collector to use
   * @param rightClickActions
   *          the right click actions to use
   * @param createElementCallback
   *          the create element callback
   * @param deleteActionBuilder
   *          the delete action which will be added to the context menu
   */
  public SlizaaMenuProvider(ChildrenDescriptorCollector childrenDescriptorCollector,
      CreateElementCallback createElementCallback
  ) {
    this.childrenDescriptorCollector = childrenDescriptorCollector;
    this.createElementCallback = createElementCallback;
  }

  @Override
  public Menu getMenu(TreeViewer treeViewer, EditingDomain editingDomain) {
    final MenuManager menuMgr = new MenuManager();
    menuMgr.setRemoveAllWhenShown(true);
    menuMgr.addMenuListener(new SlizaaTreeMenuListener(childrenDescriptorCollector, menuMgr, treeViewer, editingDomain,
        createElementCallback /* , deleteActionBuilder */));
    final Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
    return menu;
  }

  /**
   *
   * @param createElementCallback
   *          the {@link CreateElementCallback}
   */
  public void setCreateElementCallback(CreateElementCallback createElementCallback) {
    this.createElementCallback = createElementCallback;
  }
}