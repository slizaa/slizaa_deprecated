package org.slizaa.ui.klighd.synthesis.hierarchicalgraph;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.elk.graph.KGraphElement;
import org.eclipse.ui.internal.PartSite;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.workbench.model.SlizaaWorkbenchModel;

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
        Set<HGAggregatedDependency> dependencies = new HashSet<>();
        if (dependency != null) {
          dependencies.add(dependency);
        }

        // fetch the perspective context
        IEclipseContext eclipseContext = ((PartSite) context.getViewContext().getDiagramWorkbenchPart().getSite())
            .getContext().getParent();

        SlizaaWorkbenchModel workbenchModel = eclipseContext.get(SlizaaWorkbenchModel.class);

        //
        DependencySelection dependencySelection = SelectionFactory.eINSTANCE.createDependencySelection();
        dependencySelection.getDependencies().addAll(dependencies);
        workbenchModel.setMainDependencySelection(dependencySelection);
      }
    }

    //
    return ActionResult.createResult(false);
  }
}
