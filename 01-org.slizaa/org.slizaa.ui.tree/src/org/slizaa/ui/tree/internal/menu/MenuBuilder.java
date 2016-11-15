package org.slizaa.ui.tree.internal.menu;

import java.util.Collections;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.FrameworkUtil;
import org.slizaa.ui.tree.ISlizaaActionContribution;
import org.slizaa.ui.tree.ISlizaaActionGroupContribution;
import org.slizaa.ui.tree.internal.Activator;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * <p>
 * https://wiki.eclipse.org/FAQ_How_do_I_build_menus_and_toolbars_programmatically%3F
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class MenuBuilder {

  /**
   * <p>
   * </p>
   *
   * @param menuManager
   */
  public static void populateMenu(IMenuManager menuManager, Object eSelectedObject) {

    //
    MenuGroup menuGroup = computeMenu(eSelectedObject);

    //
    createMenuManager(menuManager, menuGroup, eSelectedObject);
  }

  /**
   * <p>
   * </p>
   *
   * @param menuManager
   * @param menuGroup
   * @param eSelectedObject
   */
  private static void createMenuManager(IMenuManager menuManager, MenuGroup menuGroup, Object eSelectedObject) {

    //
    Collections.sort(menuGroup.getMenuEntries(), (a, b) -> a.ranking() - b.ranking());

    //
    for (IMenuPart menuPart : menuGroup.getMenuEntries()) {
      if (menuPart instanceof MenuEntry) {
        MenuEntry menuEntry = (MenuEntry) menuPart;
        menuManager.add(wrapActionContribution(eSelectedObject, menuEntry.getActionContribution()));
      } else if (menuPart instanceof MenuGroup) {
        MenuGroup group = (MenuGroup) menuPart;
        MenuManager menuManager2 = new MenuManager(group.getActionGroupContribution().getLabel(),
            group.getActionGroupContribution().getId());
        menuManager.add(menuManager2);
        createMenuManager(menuManager2, group, eSelectedObject);
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param menuManager
   */
  private static MenuGroup computeMenu(Object eSelectedObject) {

    //
    MenuGroup menuGroup = new MenuGroup(MenuBuilder.class.getName() + "#DEFAULT");

    //
    LoadingCache<String, MenuGroup> menuGroupMap = CacheBuilder.newBuilder()
        .build(new CacheLoader<String, MenuGroup>() {
          public MenuGroup load(String id) {
            return new MenuGroup(id);
          }
        });

    // TODO: HIERARCHIES
    for (ISlizaaActionGroupContribution actionGroupContribution : Activator.getDefault()
        .getSlizaaActionGroupContributions()) {

      MenuGroup group = menuGroupMap.getUnchecked(actionGroupContribution.getId());
      group.setActionGroupContribution(actionGroupContribution);
      menuGroup.getMenuEntries().add(group);
    }

    //
    for (ISlizaaActionContribution slizaaActionContribution : Activator.getDefault().getSlizaaActionContributions()) {
      if (slizaaActionContribution.shouldShow(eSelectedObject)) {
        if (slizaaActionContribution.getParentGroupId() != null) {
          MenuGroup group = menuGroupMap.getIfPresent(slizaaActionContribution.getParentGroupId());
          if (group != null) {
            group.getMenuEntries().add(new MenuEntry(slizaaActionContribution));
          }
        } else {
          menuGroup.getMenuEntries().add(new MenuEntry(slizaaActionContribution));
        }
      }
    }

    //
    return menuGroup;
  }

  /**
   * <p>
   * </p>
   *
   * @param eSelectedObject
   * @param slizaaTreeAction
   * 
   * @return
   */
  private static Action wrapActionContribution(final Object eSelectedObject,
      final ISlizaaActionContribution slizaaTreeAction) {

    // set enabled
    ContextInjectionFactory.inject(slizaaTreeAction,
        Activator.getDefault().getE4Workbench().getApplication().getContext());

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

    //
    newAction.setEnabled(slizaaTreeAction.isEnabled(eSelectedObject));

    // set action text
    newAction.setText(slizaaTreeAction.getLabel());

    // return the result
    return newAction;
  }
}
