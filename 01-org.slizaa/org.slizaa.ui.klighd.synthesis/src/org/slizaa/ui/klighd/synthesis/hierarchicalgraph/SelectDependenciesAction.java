package org.slizaa.ui.klighd.synthesis.hierarchicalgraph;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.elk.graph.KGraphElement;
import org.eclipse.ui.internal.PartSite;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.ui.common.context.ContextHelper;

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

      if (sourceElement instanceof HGAggregatedDependency) {
        HGAggregatedDependency dependency = (HGAggregatedDependency) sourceElement;
        List<HGAggregatedDependency> dependencies = new LinkedList<>();
        if (dependency != null) {
          dependencies.add(dependency);
        }

        // fetch the perspective context
        IEclipseContext eclipseContext = ((PartSite) context.getViewContext().getDiagramWorkbenchPart().getSite())
            .getContext().getParent();

        ContextHelper.setValueInContext(eclipseContext,
            SelectionIdentifier.CURRENT_MAIN_DEPENDENCY_SELECTION, dependencies);
      }
    }

    //
    return ActionResult.createResult(false);
  }
}
