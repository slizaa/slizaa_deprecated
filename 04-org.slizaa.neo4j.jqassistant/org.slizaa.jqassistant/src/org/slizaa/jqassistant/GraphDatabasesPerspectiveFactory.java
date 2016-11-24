package org.slizaa.jqassistant;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class GraphDatabasesPerspectiveFactory implements IPerspectiveFactory {

  /** - */
  private static final String FOLDER_LOWER_LEFT   = "lowerleft";

  /** - */
  private static final String FOLDER_UPPER_LEFT   = "upperleft";

  /** - */
  private static final String FOLDER_LOWER_MIDDLE = "lowermiddle";

  /** - */
  private static final String FOLDER_LOWER_RIGHT  = "lowerright";

  /** - */
  private static final String FOLDER_UPPER_RIGHT  = "upperright";

  /**
   * {@inheritDoc}
   */
  @Override
  public void createInitialLayout(IPageLayout layout) {

    // upper left
    IFolderLayout folder = layout.createFolder(FOLDER_UPPER_LEFT, IPageLayout.LEFT, 0.2f, IPageLayout.ID_EDITOR_AREA);
    folder.addView(IPageLayout.ID_PROJECT_EXPLORER);

    // lower left
    folder = layout.createFolder(FOLDER_LOWER_LEFT, IPageLayout.BOTTOM, 0.50f, FOLDER_UPPER_LEFT);
    folder.addView("org.slizaa.neo4j.restclient.ui.GraphDatabasesView");
    folder.addView(IPageLayout.ID_PROP_SHEET);

    // upper right
    folder = layout.createFolder(FOLDER_UPPER_RIGHT, IPageLayout.RIGHT, 0.75f, IPageLayout.ID_EDITOR_AREA);
    folder.addView("org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphViewPart");
//    folder.addView(IPageLayout.ID_PROP_SHEET);

    // lower right
    folder = layout.createFolder(FOLDER_LOWER_RIGHT, IPageLayout.BOTTOM, 0.50f, FOLDER_UPPER_RIGHT);
    folder.addView(IPageLayout.ID_TASK_LIST);

    // lower middle
    folder = layout.createFolder(FOLDER_LOWER_MIDDLE, IPageLayout.BOTTOM, 0.5f, IPageLayout.ID_EDITOR_AREA);
    folder.addView(IPageLayout.ID_PROBLEM_VIEW);
    folder.addView(IConsoleConstants.ID_CONSOLE_VIEW);

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
    // layout.addShowViewShortcut("com.packtpub.e4.migration.views.SampleView");
    // layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
  }
}