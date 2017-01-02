package org.slizaa.ui.tree.internal.menu;

import java.util.Collections;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
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
public class SlizaaTreeMenuBuilder {

  /**
   * <p>
   * </p>
   *
   * @param menuManager
   */
  public static void populateMenu(IMenuManager menuManager, Object eSelectedObject) {

    //
    SlizaaTreeMenuGroup menuGroup = computeMenu(eSelectedObject);

    //
    populateMenuManager(menuManager, menuGroup, null, eSelectedObject);
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
      Object eSelectedObject) {

    //
    Collections.sort(menuGroup.getMenuEntries(), (a, b) -> a.ranking() - b.ranking());

    //
    for (ISlizaaTreeMenuPart menuPart : menuGroup.getMenuEntries()) {

      if (menuPart instanceof SlizaaTreeMenuEntry) {
        SlizaaTreeMenuEntry menuEntry = (SlizaaTreeMenuEntry) menuPart;
        //
        if (groupName == null) {
          menuManager.add(wrapActionContribution(eSelectedObject, menuEntry.getActionContribution()));
        } 
        //
        else {
          menuManager.appendToGroup(groupName, wrapActionContribution(eSelectedObject, menuEntry.getActionContribution()));
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
          populateMenuManager(menuManager2, group, null, eSelectedObject);
        }
        
        //
        else {
          
          //
          if (groupName == null) {
            menuManager.add(new GroupMarker(group.getId()));
          } 
          //
          else {
            menuManager.appendToGroup(groupName,new GroupMarker(group.getId()));
          }
          
          //
          populateMenuManager(menuManager, group, group.getId(), eSelectedObject);
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
  private static SlizaaTreeMenuGroup computeMenu(Object eSelectedObject) {

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
      if (actionGroupContribution.shouldShow(eSelectedObject)) {
        SlizaaTreeMenuGroup group = menuGroupMap.getUnchecked(actionGroupContribution.getId());
        group.setActionGroupContribution(actionGroupContribution);
        menuGroup.getMenuEntries().add(group);
      }
    }

    //
    for (ISlizaaActionContribution slizaaActionContribution : Activator.getDefault().getSlizaaActionContributions()) {
      if (slizaaActionContribution.shouldShow(eSelectedObject)) {
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
    if (slizaaTreeAction.getImagePath(eSelectedObject) != null) {

      newAction.setImageDescriptor(ImageDescriptor.createFromURL(
          FrameworkUtil.getBundle(slizaaTreeAction.getClass()).getResource(slizaaTreeAction.getImagePath(eSelectedObject))));

    }

    //
    newAction.setEnabled(slizaaTreeAction.isEnabled(eSelectedObject));

    // set action text
    newAction.setText(slizaaTreeAction.getLabel(eSelectedObject));

    // return the result
    return newAction;
  }
}
