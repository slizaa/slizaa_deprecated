package org.slizaa.ui.klighd.action;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.ui.klighd.SlizaaDiagramViewPart;
import org.slizaa.ui.tree.ISlizaaActionContribution;

@Component
public class OpenKlighdDiagramTreeAction implements ISlizaaActionContribution {

  @Override
  public String getParentGroupId() {
    return null;
  }

  @Override
  public int getRanking() {
    return 10;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean shouldShow(Object selection) {
    return selection instanceof HGNode
        && PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().isEditorAreaVisible();
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

    Display.getDefault().syncExec(() -> {
      try {
        // PlatformUI.getWorkbench().showPerspective("org.slizaa.jqassistant.VisualizeDependenciesPerspective",
        // PlatformUI.getWorkbench().getActiveWorkbenchWindow());
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(SlizaaDiagramViewPart.ID);
      } catch (WorkbenchException e) {
        // do nothing
      }
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getLabel(Object selectedObject) {
    return "Open diagram viewer";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getImagePath(Object selectedObject) {
    return "icons/full/etool16/diagrams_view.gif";
  }
}
