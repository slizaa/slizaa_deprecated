package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.ui.tree.SlizaaTreeAction;

@Component
public class DisposeHierarchicalGraphTreeAction implements SlizaaTreeAction {
  //
  // /** - */
  // private IProjectModelService _projectMappingService;
  //
  // /** - */
  // private IHierarchicalGraphSelectionService _selectionService;
  //
  // @Reference
  // public void bindProjectModelService(IProjectModelService projectModelService) {
  // _projectMappingService = projectModelService;
  // }
  //
  // public void unbindProjectModelService(IProjectModelService projectModelService) {
  // _projectMappingService = null;
  // }
  //
  // @Reference
  // public void bindSelectionService(IHierarchicalGraphSelectionService selectionService) {
  // _selectionService = selectionService;
  // }
  //
  // public void unbindSelectionService(IHierarchicalGraphSelectionService selectionService) {
  // _selectionService = null;
  // }

  @Override
  public boolean shouldShow(EObject eObject) {
    return eObject instanceof HGRootNode;
  }

  @Override
  public boolean isEnabled(EObject eSelectedObject) {
    return true;
  }

  @Override
  public void execute(EObject object) {

    //
    // HGRootNode rootNode = (HGRootNode) object;
    //
    // //
    // for (Neo4JRemoteRepository remoteRepository : _projectMappingService.getCurrentProject().getRepositories()) {
    // if (remoteRepository.getHierarchicalGraphs().contains(rootNode)) {
    // remoteRepository.getHierarchicalGraphs().remove(rootNode);
    // break;
    // }
    // }
    //
    // //
    // _selectionService.setCurrentNodeSelection(HierarchicalGraphViewPart.PART_ID);
  }

  @Override
  public String getLabel() {
    return "Dispose";
  }

  @Override
  public String getImagePath() {
    return null;
  }
}
