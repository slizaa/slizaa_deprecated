package org.slizaa.neo4j.dbadapter.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class GraphDatabasesPerspectiveFactory implements IPerspectiveFactory {

  @Override
  public void createInitialLayout(IPageLayout layout) {
    
    IFolderLayout folder = layout.createFolder("test",
        IPageLayout.LEFT, 0.25f, IPageLayout.ID_EDITOR_AREA);
    folder.addView(IPageLayout.ID_PROJECT_EXPLORER);
    
    folder = layout.createFolder("test2",
        IPageLayout.RIGHT, 0.70f, IPageLayout.ID_EDITOR_AREA);
    folder.addView(IPageLayout.ID_OUTLINE);
    
    //
    String folderId = "org.slizaa.jqassistant.graphdatabases.resultfolder";
 
    folder = layout.createFolder(folderId,
            IPageLayout.BOTTOM, 0.5f, IPageLayout.ID_EDITOR_AREA);
    folder.addView(IPageLayout.ID_PROBLEM_VIEW);
    folder.addView(IPageLayout.ID_PROP_SHEET);
    
    //
    addViewShortCuts(layout);
  }

  private void addViewShortCuts(IPageLayout layout) {

    layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
    layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
    layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
    layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
    layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
    layout.addShowViewShortcut(IPageLayout.ID_PROGRESS_VIEW);
    layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);

  }
}
  
//  @Override
//  public void createInitialLayout(IPageLayout layout) {
//
//    
//    //
//    IFolderLayout folderLayout = layout.createFolder("left", IPageLayout.LEFT, 0.2f, IPageLayout.ID_OUTLINE);
//    folderLayout.addView(IPageLayout.ID_PROBLEM_VIEW);
//    layout.createFolder("right", IPageLayout.RIGHT, 0.6f, IPageLayout.ID_OUTLINE);
//    layout.createFolder("bottom", IPageLayout.BOTTOM, 0.8f, IPageLayout.ID_OUTLINE);
//    layout.createFolder("top", IPageLayout.TOP, 0.6f, IPageLayout.ID_OUTLINE);
//    
//    //
//    layout.setEditorAreaVisible(false);
//  }