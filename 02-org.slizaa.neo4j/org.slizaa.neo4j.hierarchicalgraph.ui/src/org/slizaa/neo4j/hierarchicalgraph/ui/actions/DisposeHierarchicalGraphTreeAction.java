package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.neo4j.restclient.Neo4jRestClient;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;
import org.slizaa.ui.common.context.ContextHelper;
import org.slizaa.ui.tree.SlizaaTreeAction;

@Component
public class DisposeHierarchicalGraphTreeAction implements SlizaaTreeAction {

  @Inject
  private WorkbenchModelService _workbenchModelService;

  @Inject
  private MApplication          _mApplication;

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean shouldShow(EObject eObject) {
    return eObject instanceof HGRootNode;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isEnabled(EObject eSelectedObject) {
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void execute(EObject object) {

    //
    HGRootNode rootNode = (HGRootNode) object;

    //
    _workbenchModelService.getWorkbenchModel().getMappedGraphs().getContent().remove(rootNode);

//    //
//    for (Neo4jRestClient neo4jRepository : _workbenchModelService.getWorkbenchModel().getDatabases().getContent()) {
//      if (neo4jRepository.getHierarchicalGraphs().contains(rootNode)) {
//        neo4jRepository.getHierarchicalGraphs().remove(rootNode);
//        break;
//      }
//    }

    //
    ContextHelper.setValueInContext(_mApplication.getContext(), SelectionIdentifier.CURRENT_ROOTNODE,
        null);
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
