package org.slizaa.neo4j.dbadapter.ui.internal.action;

import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.ui.tree.ISlizaaActionContribution;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@Component(service = ISlizaaActionContribution.class)
public class ScanActionContribution extends AbstractManagedInstanceActionContribution {

  /**
   * <p>
   * Creates a new instance of type {@link ScanActionContribution}.
   * </p>
   */
  public ScanActionContribution() {
    super("Scan", 10);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected boolean onIsEnabled(ManagedNeo4jInstance managedNeo4jInstance) {
    return  !managedNeo4jInstance.isInProgress() && !managedNeo4jInstance.isRunning();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void onExecute(ManagedNeo4jInstance managedNeo4jInstance) throws Exception {
    managedNeo4jInstance.scan();
  }
}
