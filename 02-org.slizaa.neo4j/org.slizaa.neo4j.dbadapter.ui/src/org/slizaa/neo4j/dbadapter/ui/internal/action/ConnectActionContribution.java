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
public class ConnectActionContribution extends ISlizaaActionContribution.DefaultActionContribution {

  /**
   * <p>
   * Creates a new instance of type {@link ConnectActionContribution}.
   * </p>
   */
  public ConnectActionContribution() {
    super("Connect", null);
  }

  @Override
  public boolean shouldShow(Object selectedObject) {
    return selectedObject instanceof Neo4jRestClient;
  }

  @Override
  public boolean isEnabled(Object selectedObject) {
    Neo4jRestClient restClient = (Neo4jRestClient) selectedObject;
    return !restClient.isActive() && !hasGlobaleActiveDbAdapter(restClient);
  }

  @Override
  public void execute(Object selectedObject) {
    Neo4jRestClient restClient = (Neo4jRestClient) selectedObject;
    restClient.setActive(true);
  }

  /**
   * <p>
   * </p>
   *
   * @param restClient
   * @return
   */
  private boolean hasGlobaleActiveDbAdapter(Neo4jRestClient restClient) {
    if (restClient.getParent() != null && restClient.getParent().getParent() != null) {
      return restClient.getParent().getParent().getActiveDbAdapter() != null;
    }
    return false;
  }
}
