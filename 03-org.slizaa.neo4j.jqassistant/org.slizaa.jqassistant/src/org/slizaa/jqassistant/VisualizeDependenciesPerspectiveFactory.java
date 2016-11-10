package org.slizaa.jqassistant;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.internal.e4.compatibility.ModeledPageLayout;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class VisualizeDependenciesPerspectiveFactory implements IPerspectiveFactory {

  /** - */
  private static final String FOLDER_UPPER_LEFT  = "upperleft";

  /** - */
  private static final String FOLDER_LOWER_LEFT  = "lowerleft";

  /** - */
  private static final String FOLDER_UPPER_RIGHT = "upperright";

  /** - */
  private static final String FOLDER_LOWER_RIGHT = "lowerright";

  /**
   * {@inheritDoc}
   */
  @Override
  public void createInitialLayout(IPageLayout layout) {

    //
    IFolderLayout folderLayout = layout.createFolder(FOLDER_UPPER_LEFT, IPageLayout.LEFT, 0.2f,
        IPageLayout.ID_EDITOR_AREA);
    folderLayout.addView("org.slizaa.neo4j.restclient.ui.GraphDatabasesView");
    folderLayout.addView("org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphViewPart");

    //
    folderLayout = layout.createFolder(FOLDER_LOWER_LEFT, IPageLayout.BOTTOM, 0.6f, FOLDER_UPPER_LEFT);
    folderLayout.addView(IPageLayout.ID_PROP_SHEET);
    
    // folderLayout = layout.createFolder(FOLDER_UPPER_RIGHT, IPageLayout.RIGHT, 0.8f, IPageLayout.ID_EDITOR_AREA);
    // http://stackoverflow.com/questions/26776802/eclipse-rcp-open-a-view-in-the-editor-area-3-8-e4-hybrid
    ((ModeledPageLayout)layout).stackView("org.slizaa.ui.klighd.SlizaaDiagramViewPart", IPageLayout.ID_EDITOR_AREA, true);
    ((ModeledPageLayout)layout).stackView("org.slizaa.ui.dsm.DsmPart", IPageLayout.ID_EDITOR_AREA, true);

    //
    folderLayout = layout.createFolder(FOLDER_LOWER_RIGHT, IPageLayout.BOTTOM, 0.6f, IPageLayout.ID_EDITOR_AREA);
    folderLayout.addView("org.slizaa.ui.dependencytree.DependencyTreePart");
    folderLayout.addView("org.slizaa.ui.dependencytable.DependencyTablePart");
    folderLayout.addView(IConsoleConstants.ID_CONSOLE_VIEW);

    //
//    layout.setEditorAreaVisible(false);

    //
    addViewShortCuts(layout);
  }

  /**
   * <p>
   * </p>
   *
   * @param layout
   */
  private void addViewShortCuts(IPageLayout layout) {

    // TODO
    // layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
    // layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
    // layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
    // layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
    // layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
    // layout.addShowViewShortcut(IPageLayout.ID_PROGRESS_VIEW);
    // layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
  }
}
