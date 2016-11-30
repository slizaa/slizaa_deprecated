package org.slizaa.neo4j.dbadapter.ui.internal.action.connect;

import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.ui.tree.ISlizaaActionContribution;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
//@Component(service = ISlizaaActionContribution.class)
public class ConnectActionContribution implements ISlizaaActionContribution {

  @Override
  public String getLabel(Object selectedObject) {
    return ((Neo4jRestClient) selectedObject).isConnected() ? "Disconnect" : "Connect";
  }

  @Override
  public String getImagePath(Object selectedObject) {
    return null;
  }

  @Override
  public int getRanking() {
    return 0;
  }

  @Override
  public String getParentGroupId() {
    return null;
  }

  @Override
  public boolean shouldShow(Object selectedObject) {
    return selectedObject instanceof Neo4jRestClient;
  }

  @Override
  public boolean isEnabled(Object selectedObject) {

    //
    Neo4jRestClient restClient = (Neo4jRestClient) selectedObject;

    //
    if (restClient instanceof ManagedNeo4jInstance && !((ManagedNeo4jInstance)restClient).isRunning()) {
      return false;
    }
    
    //
    if (restClient.isConnected() && restClient.getHierarchicalGraph() != null) {
      return false;
    }

    //
    if (restClient.getParent() == null || restClient.getParent().getParent() == null) {
      return false;
    }

    //
    return (restClient.isConnected() && restClient.getParent().getParent().getActiveDbAdapter() == restClient)
        || restClient.getParent().getParent().getActiveDbAdapter() == null;
  }

  @Override
  public void execute(Object selectedObject) {
    Neo4jRestClient restClient = (Neo4jRestClient) selectedObject;
    if (restClient == restClient.getParent().getParent().getActiveDbAdapter()) {
      restClient.getParent().getParent().setActiveDbAdapter(null);
    } else {
      restClient.getParent().getParent().setActiveDbAdapter(restClient);
    }
  }
}
