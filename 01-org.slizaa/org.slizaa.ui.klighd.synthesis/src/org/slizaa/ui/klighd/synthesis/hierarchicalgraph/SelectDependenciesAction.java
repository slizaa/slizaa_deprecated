package org.slizaa.ui.klighd.synthesis.hierarchicalgraph;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.elk.graph.KGraphElement;
import org.slizaa.hierarchicalgraph.HGDependency;

import de.cau.cs.kieler.klighd.IAction;

public class SelectDependenciesAction implements IAction {

  /** The action ID. */
  public static final String ID = "org.slizaa.ui.klighd.synthesis.hierarchicalgraph.SelectDependenciesAction";

  /**
   * {@inheritDoc}
   */
  public ActionResult execute(final ActionContext context) {

    KGraphElement kGraphElement = context.getKGraphElement();

    if (kGraphElement != null) {

      Object sourceElement = context.getViewContext().getSourceElement(kGraphElement);

      if (sourceElement instanceof HGDependency) {
        HGDependency dependency = (HGDependency) sourceElement;
        List<HGDependency> dependencies = new LinkedList<>();
        if (dependency != null) {
          dependencies.add(dependency);
        }
        Activator.getDefault().getHierarchicalGraphSelectionService().setCurrentDependencySelection("TODO",
            dependencies);
      }
    }

    //
    return ActionResult.createResult(false);
  }
}
