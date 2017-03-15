package org.slizaa.ui.tree.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collections;
import java.util.List;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.osgi.framework.FrameworkUtil;
import org.slizaa.ui.tree.ISlizaaActionContribution;
import org.slizaa.ui.tree.ISlizaaActionContributionProvider;
import org.slizaa.ui.tree.ISlizaaActionGroupContribution;

import com.google.common.base.Supplier;
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

  /** - */
  private TreeViewer                        _treeViewer;

  /** - */
  private MenuManager                       _menuManager;

  /** - */
  private ISlizaaActionContributionProvider _slizaaActionContributionProvider;

  /** - */
  private Supplier<IEclipseContext>         _contextSupplier;

  /** - */
  private List<?>                           _currentObjectSelection;

  /**
   * <p>
   * Creates a new instance of type {@link SlizaaTreeMenuBuilder}.
   * </p>
   *
   * @param treeViewer
   */
  public SlizaaTreeMenuBuilder(TreeViewer treeViewer, ISlizaaActionContributionProvider contributionProvider,
      Supplier<IEclipseContext> contextSupplier) {
    _treeViewer = checkNotNull(treeViewer);
    _slizaaActionContributionProvider = checkNotNull(contributionProvider);
    _contextSupplier = checkNotNull(contextSupplier);
  }

  /**
   * <p>
   * </p>
   *
   * @param menuManager
   */
  public void populateMenu() {

    _menuManager = new MenuManager();
    _menuManager.setRemoveAllWhenShown(true);

    // the menu listener creates the menu on demand
    _menuManager.addMenuListener(new IMenuListener() {

      @Override
      public void menuAboutToShow(IMenuManager menuManager) {

        if (_treeViewer.getSelection().isEmpty()) {
          return;
        }
        if (_treeViewer.getSelection() instanceof IStructuredSelection) {

          _currentObjectSelection = ((IStructuredSelection) _treeViewer.getSelection()).toList();

          SlizaaTreeMenuGroup rootMenuGroup = computeInternalSlizaaMenuModel();

          populateMenuManager(rootMenuGroup, null);
        }
      }
    });

    // return the result
    _treeViewer.getControl().setMenu(_menuManager.createContextMenu(_treeViewer.getControl()));
  }

  /**
   * <p>
   * </p>
   *
   * @param menuManager
   * @param menuGroup
   * @param eSelectedObject
   */
  private void populateMenuManager(SlizaaTreeMenuGroup menuGroup, String currentGroup) {

    //
    Collections.sort(menuGroup.getMenuEntries(), (a, b) -> a.ranking() - b.ranking());

    //
    for (ISlizaaTreeMenuPart menuPart : menuGroup.getMenuEntries()) {

      if (menuPart instanceof SlizaaTreeMenuEntry) {
        SlizaaTreeMenuEntry menuEntry = (SlizaaTreeMenuEntry) menuPart;
        //
        if (currentGroup == null) {
          _menuManager.add(wrapActionContribution(menuEntry.getActionContribution()));
        }
        //
        else {
          _menuManager.appendToGroup(currentGroup, wrapActionContribution(menuEntry.getActionContribution()));
        }
      }
      //
      else if (menuPart instanceof SlizaaTreeMenuGroup) {

        SlizaaTreeMenuGroup group = (SlizaaTreeMenuGroup) menuPart;

        //
        if (group.isSubMenu()) {

          MenuManager menuManager2 = new MenuManager(group.getActionGroupContribution().getLabel(),
              group.getActionGroupContribution().getId());
          //
          if (currentGroup == null) {
            _menuManager.add(menuManager2);
          }
          //
          else {
            _menuManager.appendToGroup(currentGroup, menuManager2);
          }
          populateMenuManager(group, null);
        }

        //
        else {

          //
          if (currentGroup == null) {
            _menuManager.add(new GroupMarker(group.getId()));
          }
          //
          else {
            _menuManager.appendToGroup(currentGroup, new GroupMarker(group.getId()));
          }

          //
          populateMenuManager(group, group.getId());
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
  private SlizaaTreeMenuGroup computeInternalSlizaaMenuModel() {

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
    for (ISlizaaActionGroupContribution actionGroupContribution : _slizaaActionContributionProvider.getActionGroupContributions()) {

      if (actionGroupContribution.shouldShow(_currentObjectSelection)) {
        SlizaaTreeMenuGroup group = menuGroupMap.getUnchecked(actionGroupContribution.getId());
        group.setActionGroupContribution(actionGroupContribution);
        menuGroup.getMenuEntries().add(group);
      }
    }

    //
    for (ISlizaaActionContribution slizaaActionContribution : _slizaaActionContributionProvider.getActionContributions()) {
      if (slizaaActionContribution.shouldShow(_currentObjectSelection, _treeViewer)) {
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
  private Action wrapActionContribution(final ISlizaaActionContribution slizaaTreeAction) {

    // set enabled
    ContextInjectionFactory.inject(slizaaTreeAction, _contextSupplier.get());

    //
    final Action newAction = new Action() {
      @Override
      public void run() {
        ContextInjectionFactory.inject(slizaaTreeAction,  _contextSupplier.get());
        slizaaTreeAction.execute(_currentObjectSelection, _treeViewer);
      }
    };

    // set action image
    if (slizaaTreeAction.getImagePath(_currentObjectSelection) != null) {
      newAction.setImageDescriptor(ImageDescriptor.createFromURL(FrameworkUtil.getBundle(slizaaTreeAction.getClass())
          .getResource(slizaaTreeAction.getImagePath(_currentObjectSelection))));

    }

    //
    newAction.setEnabled(slizaaTreeAction.isEnabled(_currentObjectSelection, _treeViewer));

    // set action text
    newAction.setText(slizaaTreeAction.getLabel(_currentObjectSelection));

    // return the result
    return newAction;
  }
}
