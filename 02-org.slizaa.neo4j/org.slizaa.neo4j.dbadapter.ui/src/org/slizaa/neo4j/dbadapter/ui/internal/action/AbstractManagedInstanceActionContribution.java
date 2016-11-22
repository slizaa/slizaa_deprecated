package org.slizaa.neo4j.dbadapter.ui.internal.action;

import static com.google.common.base.Preconditions.checkNotNull;

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
  public final boolean shouldShow(Object object) {
    return object instanceof ManagedNeo4jInstance;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isEnabled(Object selectedObject) {
    ManagedNeo4jInstance managedInstance = (ManagedNeo4jInstance) selectedObject;
    return managedInstance.isDatabaseInstallationAvailable()
        && onIsEnabled((ManagedNeo4jInstance) selectedObject);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final void execute(Object selectedObject) {

    try {
      ManagedNeo4jInstance managedNeo4jInstance = (ManagedNeo4jInstance) selectedObject;
      onExecute(managedNeo4jInstance);
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
