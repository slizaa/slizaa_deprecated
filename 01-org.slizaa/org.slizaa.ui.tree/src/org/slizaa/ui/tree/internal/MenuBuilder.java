package org.slizaa.ui.tree.internal;

import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.FrameworkUtil;
import org.slizaa.ui.tree.ISlizaaActionContribution;
import org.slizaa.ui.tree.ISlizaaActionGroupContribution;

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
    List<ISlizaaActionContribution> defaultActionGroup = new LinkedList<ISlizaaActionContribution>();

    //
    LoadingCache<String, List<ISlizaaActionContribution>> contributionMap = CacheBuilder.newBuilder()
        .build(new CacheLoader<String, List<ISlizaaActionContribution>>() {
          public List<ISlizaaActionContribution> load(String key) {
            return new LinkedList<ISlizaaActionContribution>();
          }
        });

    //
    for (ISlizaaActionContribution slizaaActionContribution : Activator.getDefault().getSlizaaActionContributions()) {
      if (slizaaActionContribution.shouldShow(eSelectedObject)) {
        if (slizaaActionContribution.getGroupId() != null) {
          contributionMap.getUnchecked(slizaaActionContribution.getGroupId()).add(slizaaActionContribution);
        } else {
          defaultActionGroup.add(slizaaActionContribution);
        }
      }
    }

    //
    for (final ISlizaaActionContribution slizaaTreeAction : defaultActionGroup) {
      menuManager.add(wrapActionContribution(eSelectedObject, slizaaTreeAction));
    }

    //
    for (

    Entry<String, ISlizaaActionGroupContribution> entry : Activator.getDefault().getSlizaaActionGroupContributions()
        .entrySet()) {

      if (entry.getValue().shouldShow(eSelectedObject)) {

        MenuManager menu2 = new MenuManager(entry.getValue().getLabel(), entry.getValue().getId());
        menu2.add(new Action("Action 2") {
        });
        menuManager.add(menu2);
      }
    }

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

    // set action text
    newAction.setText(slizaaTreeAction.getLabel());

    // set enabled
    newAction.setEnabled(slizaaTreeAction.isEnabled(eSelectedObject));

    // return the result
    return newAction;
  }
}
