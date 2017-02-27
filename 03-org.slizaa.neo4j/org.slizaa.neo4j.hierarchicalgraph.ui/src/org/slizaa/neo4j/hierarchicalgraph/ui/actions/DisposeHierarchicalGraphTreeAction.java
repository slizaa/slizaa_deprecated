package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.neo4j.dbadapter.ContainerType;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.ui.shared.context.ContextHelper;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component
public class DisposeHierarchicalGraphTreeAction implements ISlizaaActionContribution {

  @Inject
  private DbAdapterRegistry _dbAdapterRegistry;

  @Inject
  private MApplication      _mApplication;

  @Override
  public String getParentGroupId() {
    return null;
  }

  @Override
  public int getRanking() {
    return 0;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean shouldShow(Object selection) {
    return selection instanceof HGRootNode;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isEnabled(Object selection) {
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void execute(Object selection) {

    //
    HGRootNode rootNode = (HGRootNode) selection;

    //
    for (Neo4jRestClient managedNeo4jInstance : _dbAdapterRegistry.getDbAdapterContainer(ContainerType.MANAGED)
        .getChildren()) {
      if (rootNode.equals(managedNeo4jInstance.getHierarchicalGraph())) {
        managedNeo4jInstance.setHierarchicalGraph(null);
        break;
      }
    }

    for (Neo4jRestClient restClient : _dbAdapterRegistry.getDbAdapterContainer(ContainerType.UNMANAGED).getChildren()) {
      if (rootNode.equals(restClient.getHierarchicalGraph())) {
        restClient.setHierarchicalGraph(null);
        break;
      }
    }

    ContextHelper.setValueInContext(_mApplication.getContext(), SelectionIdentifier.CURRENT_ROOTNODE, null);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getLabel(Object selectedObject) {
    return "Dispose";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getImagePath(Object selectedObject) {
    return null;
  }
}
