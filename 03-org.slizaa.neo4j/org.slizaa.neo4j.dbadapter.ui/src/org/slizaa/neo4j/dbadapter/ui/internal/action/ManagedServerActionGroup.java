package org.slizaa.neo4j.dbadapter.ui.internal.action;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.GraphDatabaseUtil;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.ui.tree.ISlizaaActionGroupContribution;

@Component(service = ISlizaaActionGroupContribution.class)
public class ManagedServerActionGroup implements ISlizaaActionGroupContribution {

  public static final String GROUP_ID_MANAGED_SERVER = "GROUP_ID_MANAGED_SERVER";

  @Override
  public String getId() {
    return GROUP_ID_MANAGED_SERVER;
  }

  @Override
  public String getLabel() {
    return "Managed Server";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getRanking() {
    return 500;
  }

  @Override
  public boolean isSubMenu() {
    return true;
  }

  @Override
  public String getImagePath() {
    return null;
  }

  @Override
  public boolean shouldShow(Object object) {
    return ((List<?>) object).stream().allMatch(n -> n instanceof ManagedNeo4jInstance)  && GraphDatabaseUtil.isGraphDatabaseInstalled();
  }

  @Override
  public boolean isEnabled(Object selectedObject) {
    return true;
  }
}
