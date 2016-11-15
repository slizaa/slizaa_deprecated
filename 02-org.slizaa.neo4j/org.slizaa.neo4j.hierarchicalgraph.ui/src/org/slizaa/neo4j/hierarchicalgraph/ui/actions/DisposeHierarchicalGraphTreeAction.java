package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.ui.common.context.ContextHelper;
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
    for (ManagedNeo4jInstance managedNeo4jInstance : _dbAdapterRegistry.getManaged().getChildren()) {
      if (rootNode.equals(managedNeo4jInstance.getHierarchicalGraph())) {
        managedNeo4jInstance.setHierarchicalGraph(null);
        break;
      }
    }

    for (Neo4jRestClient restClient : _dbAdapterRegistry.getUnmanaged().getChildren()) {
      if (rootNode.equals(restClient.getHierarchicalGraph())) {
        restClient.setHierarchicalGraph(null);
        break;
      }
    }

    //
    ContextHelper.setValueInContext(_mApplication.getContext(), SelectionIdentifier.CURRENT_ROOTNODE, null);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getLabel() {
    return "Dispose";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getImagePath() {
    return null;
  }
}
