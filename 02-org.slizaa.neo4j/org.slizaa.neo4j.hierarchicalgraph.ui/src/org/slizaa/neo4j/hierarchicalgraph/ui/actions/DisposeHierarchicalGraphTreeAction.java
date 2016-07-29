package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphViewPart;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;
import org.slizaa.selection.IHierarchicalGraphSelectionService;
import org.slizaa.ui.tree.SlizaaTreeAction;

@Component
public class DisposeHierarchicalGraphTreeAction implements SlizaaTreeAction {

  @Inject
  private WorkbenchModelService              _workbenchModelService;

  @Inject
  private IHierarchicalGraphSelectionService _selectionService;

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

    //
    for (INeo4JRepository neo4jRepository : _workbenchModelService.getWorkbenchModel().getDatabases().getContent()) {
      if (neo4jRepository.getHierarchicalGraphs().contains(rootNode)) {
        neo4jRepository.getHierarchicalGraphs().remove(rootNode);
        break;
      }
    }

    //
    _selectionService.setCurrentNodeSelection(HierarchicalGraphViewPart.PART_ID);
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
