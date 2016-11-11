package org.slizaa.neo4j.dbadapter.ui.action;

import java.io.IOException;

import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component
public class ScanActionContribution implements ISlizaaActionContribution {
  
  @Override
  public String getGroupId() {
    return ManagedServerActionGroup.GROUP_ID_MANAGED_SERVER;
  }

  @Override
  public boolean shouldShow(Object object) {
    return object instanceof ManagedNeo4jInstance;
  }

  @Override
  public boolean isEnabled(Object selectedObject) {
    ManagedNeo4jInstance managedNeo4jInstance = (ManagedNeo4jInstance) selectedObject;
    return !managedNeo4jInstance.isScanned() && LauncherService.isJQAssistantInstalled();
  }

  @Override
  public void execute(Object selectedObject) {

    try {
      ManagedNeo4jInstance managedNeo4jInstance = (ManagedNeo4jInstance) selectedObject;
      LauncherService.scan(managedNeo4jInstance);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Override
  public String getLabel() {
    return "Re-Scan...";
  }

  @Override
  public String getImagePath() {
    return null;
  }
}
