package org.slizaa.neo4j.dbadapter.ui.internal.action;

import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component(service = ISlizaaActionContribution.class)
public class StartActionContribution extends AbstractManagedInstanceActionContribution {

  public StartActionContribution() {
    super("Start", 30);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected boolean onIsEnabled(ManagedNeo4jInstance managedNeo4jInstance) {
    return managedNeo4jInstance.isScanned() && !managedNeo4jInstance.isInProgress() && !managedNeo4jInstance.isRunning();
  }

  @Override
  protected void onExecute(ManagedNeo4jInstance managedNeo4jInstance) throws Exception {
    managedNeo4jInstance.start();
  }
}
