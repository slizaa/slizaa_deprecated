package org.slizaa.neo4j.ui.discovery;

import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.GraphDatabaseUtil;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component(service = ISlizaaActionContribution.class)
public class InstallLocalDatabaseSupportContribution extends ISlizaaActionContribution.DefaultActionContribution {

  public InstallLocalDatabaseSupportContribution() {
    super("Install Local Database Support...", null, null, 200);
  }

  @Override
  public boolean shouldShow(Object selectedObject) {
    return !GraphDatabaseUtil.isGraphDatabaseInstalled();
  }
}
