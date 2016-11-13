package org.slizaa.neo4j.dbadapter.ui.internal.action;

import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.ui.internal.Activator;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component(service = ISlizaaActionContribution.class)
public class EnrichActionContribution extends AbstractManagedInstanceActionContribution {

  /**
   * <p>
   * Creates a new instance of type {@link EnrichActionContribution}.
   * </p>
   */
  public EnrichActionContribution() {
    super("Enrich", 20);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected boolean onIsEnabled(ManagedNeo4jInstance managedNeo4jInstance) {
    return managedNeo4jInstance.isScanned() && managedNeo4jInstance.getLaunch() == null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void onExecute(ManagedNeo4jInstance managedNeo4jInstance) throws Exception {
    Activator.getDefault().getLauncherService().enrich(managedNeo4jInstance);
  }
}
