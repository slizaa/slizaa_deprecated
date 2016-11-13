package org.slizaa.ui.tree.internal.menu;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.LinkedList;
import java.util.List;

import org.slizaa.ui.tree.ISlizaaActionGroupContribution;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class MenuGroup implements IMenuPart {

  /** - */
  private ISlizaaActionGroupContribution _actionGroupContribution;

  /** - */
  private List<IMenuPart>                _menuEntries;

  /** - */
  private String                         _id;

  /**
   * <p>
   * Creates a new instance of type {@link MenuGroup}.
   * </p>
   *
   * @param id
   */
  public MenuGroup(String id) {
    _id = checkNotNull(id);
    _menuEntries = new LinkedList<>();
  }

  @Override
  public int ranking() {
    return _actionGroupContribution != null ? _actionGroupContribution.getRanking() : 0;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public ISlizaaActionGroupContribution getActionGroupContribution() {
    return _actionGroupContribution;
  }

  /**
   * <p>
   * </p>
   *
   * @param actionGroupContribution
   */
  public void setActionGroupContribution(ISlizaaActionGroupContribution actionGroupContribution) {
    this._actionGroupContribution = actionGroupContribution;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public List<IMenuPart> getMenuEntries() {
    return _menuEntries;
  }
}
