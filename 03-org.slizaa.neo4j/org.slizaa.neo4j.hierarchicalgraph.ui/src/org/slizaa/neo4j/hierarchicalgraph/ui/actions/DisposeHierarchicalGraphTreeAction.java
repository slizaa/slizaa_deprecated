package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.jface.viewers.Viewer;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.neo4j.dbadapter.ContainerType;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.ui.tree.ISlizaaActionContribution;
import org.slizaa.workbench.model.SlizaaWorkbenchModel;

@Component
public class DisposeHierarchicalGraphTreeAction implements ISlizaaActionContribution {

  @Inject
  private SlizaaWorkbenchModel _workbenchModel;

  @Inject
  private DbAdapterRegistry    _dbAdapterRegistry;

  @Inject
  private MApplication         _mApplication;

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
  public boolean shouldShow(List<?> selection, Viewer viewer) {
    return selection.stream().allMatch(n -> n instanceof HGRootNode);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isEnabled(List<?> selection, Viewer viewer) {
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void execute(List<?> selection, Viewer viewer) {

    //
    HGRootNode rootNode = (HGRootNode) selection.get(0);

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

    _workbenchModel.setRootNode(null);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getLabel(List<?> selection) {
    return "Dispose";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getImagePath(List<?> selection) {
    return null;
  }
}
