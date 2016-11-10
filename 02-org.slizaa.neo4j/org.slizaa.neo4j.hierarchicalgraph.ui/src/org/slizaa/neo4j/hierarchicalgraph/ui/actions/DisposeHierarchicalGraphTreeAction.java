package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;
import org.slizaa.ui.common.context.ContextHelper;
import org.slizaa.ui.tree.ISlizaaAction;

@Component
public class DisposeHierarchicalGraphTreeAction implements ISlizaaAction {

  @Inject
  private WorkbenchModelService _workbenchModelService;

  @Inject
  private MApplication          _mApplication;

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
