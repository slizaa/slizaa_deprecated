package org.slizaa.ui.tree.internal.menu;

import java.util.Collections;
import java.util.List;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.Viewer;
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
public class SlizaaTreeMenuBuilder {

  /**
   * <p>
   * </p>
   *
   * @param menuManager
   */
  public static void populateMenu(IMenuManager menuManager, List<Object> eSelectedObjects, Viewer viewer) {

    //
    SlizaaTreeMenuGroup menuGroup = computeMenu(eSelectedObjects, viewer);

    //
    populateMenuManager(menuManager, menuGroup, null, eSelectedObjects, viewer);
  }

  /**
   * <p>
   * </p>
   *
   * @param menuManager
   * @param menuGroup
   * @param eSelectedObject
   */
  private static void populateMenuManager(IMenuManager menuManager, SlizaaTreeMenuGroup menuGroup, String groupName,
      List<Object> eSelectedObjects, Viewer viewer) {

    //
    Collections.sort(menuGroup.getMenuEntries(), (a, b) -> a.ranking() - b.ranking());

    //
    for (ISlizaaTreeMenuPart menuPart : menuGroup.getMenuEntries()) {

      if (menuPart instanceof SlizaaTreeMenuEntry) {
        SlizaaTreeMenuEntry menuEntry = (SlizaaTreeMenuEntry) menuPart;
        //
        if (groupName == null) {
          menuManager.add(wrapActionContribution(eSelectedObjects, menuEntry.getActionContribution(), viewer));
        }
        //
        else {
          menuManager.appendToGroup(groupName,
              wrapActionContribution(eSelectedObjects, menuEntry.getActionContribution(), viewer));
        }
      }
      //
      else if (menuPart instanceof SlizaaTreeMenuGroup) {

        SlizaaTreeMenuGroup group = (SlizaaTreeMenuGroup) menuPart;

        //
        if (((SlizaaTreeMenuGroup) menuPart).isSubMenu()) {

          MenuManager menuManager2 = new MenuManager(group.getActionGroupContribution().getLabel(),
              group.getActionGroupContribution().getId());
          //
          if (groupName == null) {
            menuManager.add(menuManager2);
          }
          //
          else {
            menuManager.appendToGroup(groupName, menuManager2);
          }
          populateMenuManager(menuManager2, group, null, eSelectedObjects, viewer);
        }

        //
        else {

          //
          if (groupName == null) {
            menuManager.add(new GroupMarker(group.getId()));
          }
          //
          else {
            menuManager.appendToGroup(groupName, new GroupMarker(group.getId()));
          }

          //
          populateMenuManager(menuManager, group, group.getId(), eSelectedObjects, viewer);
        }
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param menuManager
   */
  private static SlizaaTreeMenuGroup computeMenu(List<Object> eSelectedObjects, Viewer viewer) {

    //
    SlizaaTreeMenuGroup menuGroup = new SlizaaTreeMenuGroup(SlizaaTreeMenuBuilder.class.getName() + "#DEFAULT");

    //
    LoadingCache<String, SlizaaTreeMenuGroup> menuGroupMap = CacheBuilder.newBuilder()
        .build(new CacheLoader<String, SlizaaTreeMenuGroup>() {
          public SlizaaTreeMenuGroup load(String id) {
            return new SlizaaTreeMenuGroup(id);
          }
        });

    // TODO: HIERARCHIES
    for (ISlizaaActionGroupContribution actionGroupContribution : Activator.getDefault()
        .getSlizaaActionGroupContributions()) {
      if (actionGroupContribution.shouldShow(eSelectedObjects)) {
        SlizaaTreeMenuGroup group = menuGroupMap.getUnchecked(actionGroupContribution.getId());
        group.setActionGroupContribution(actionGroupContribution);
        menuGroup.getMenuEntries().add(group);
      }
    }

    //
    for (ISlizaaActionContribution slizaaActionContribution : Activator.getDefault().getSlizaaActionContributions()) {
      if (slizaaActionContribution.shouldShow(eSelectedObjects, viewer)) {
        if (slizaaActionContribution.getParentGroupId() != null) {
          SlizaaTreeMenuGroup group = menuGroupMap.getIfPresent(slizaaActionContribution.getParentGroupId());
          if (group != null) {
            group.getMenuEntries().add(new SlizaaTreeMenuEntry(slizaaActionContribution));
          }
        } else {
          menuGroup.getMenuEntries().add(new SlizaaTreeMenuEntry(slizaaActionContribution));
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
  private static Action wrapActionContribution(final List<Object> eSelectedObjects,
      final ISlizaaActionContribution slizaaTreeAction, Viewer viewer) {

    // set enabled
    ContextInjectionFactory.inject(slizaaTreeAction,
        Activator.getDefault().getE4Workbench().getApplication().getContext());

    //
    final Action newAction = new Action() {

      @Override
      public void run() {

        ContextInjectionFactory.inject(slizaaTreeAction,
            Activator.getDefault().getE4Workbench().getApplication().getContext());

        slizaaTreeAction.execute(eSelectedObjects, viewer);
      }
    };

    // set action image
    if (slizaaTreeAction.getImagePath(eSelectedObjects) != null) {

      newAction.setImageDescriptor(ImageDescriptor.createFromURL(FrameworkUtil.getBundle(slizaaTreeAction.getClass())
          .getResource(slizaaTreeAction.getImagePath(eSelectedObjects))));

    }

    //
    newAction.setEnabled(slizaaTreeAction.isEnabled(eSelectedObjects, viewer));

    // set action text
    newAction.setText(slizaaTreeAction.getLabel(eSelectedObjects));

    // return the result
    return newAction;
  }
}
