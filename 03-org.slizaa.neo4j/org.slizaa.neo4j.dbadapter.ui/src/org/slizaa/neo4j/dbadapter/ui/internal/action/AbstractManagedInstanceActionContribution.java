package org.slizaa.neo4j.dbadapter.ui.internal.action;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import org.eclipse.jface.viewers.Viewer;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.ui.tree.ISlizaaActionContribution;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractManagedInstanceActionContribution
    extends ISlizaaActionContribution.DefaultActionContribution {

  /**
   * <p>
   * Creates a new instance of type {@link AbstractManagedInstanceActionContribution}.
   * </p>
   *
   * @param label
   * @param ranking
   */
  public AbstractManagedInstanceActionContribution(String label, int ranking) {
    super(checkNotNull(label), ManagedServerActionGroup.GROUP_ID_MANAGED_SERVER, null, ranking);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final boolean shouldShow(List<?> selection, Viewer viewer) {
    return selection.stream().allMatch(n -> n instanceof ManagedNeo4jInstance);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isEnabled(List<?> selection, Viewer viewer) {

    //
    if (selection.size() != 1) {
      return false;
    }

    //
    ManagedNeo4jInstance managedInstance = (ManagedNeo4jInstance) selection.get(0);
    return managedInstance.isDatabaseInstallationAvailable() && onIsEnabled(managedInstance);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final void execute(List<?> selection, Viewer viewer) {

    try {
      ManagedNeo4jInstance managedInstance = (ManagedNeo4jInstance) selection.get(0);
      onExecute(managedInstance);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param managedNeo4jInstance
   * @return
   * @throws Exception
   */
  protected abstract void onExecute(ManagedNeo4jInstance managedNeo4jInstance) throws Exception;

  /**
   * <p>
   * </p>
   *
   * @param selectedObject
   * @return
   */
  protected abstract boolean onIsEnabled(ManagedNeo4jInstance managedNeo4jInstance);
}
