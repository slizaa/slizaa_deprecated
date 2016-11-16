package org.slizaa.neo4j.dbadapter.ui.internal.action;

import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.ui.tree.ISlizaaActionContribution;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@Component(service = ISlizaaActionContribution.class)
public class DisconnectActionContribution extends ISlizaaActionContribution.DefaultActionContribution {

  /**
   * <p>
   * Creates a new instance of type {@link DisconnectActionContribution}.
   * </p>
   */
  public DisconnectActionContribution() {
    super("Disconnect", null);
  }

  @Override
  public boolean shouldShow(Object selectedObject) {
    return selectedObject instanceof Neo4jRestClient;
  }

  @Override
  public boolean isEnabled(Object selectedObject) {
    Neo4jRestClient restClient = (Neo4jRestClient) selectedObject;
    return restClient.isActive();
  }

  @Override
  public void execute(Object selectedObject) {
    Neo4jRestClient restClient = (Neo4jRestClient) selectedObject;
    restClient.setActive(false);
  }
}
