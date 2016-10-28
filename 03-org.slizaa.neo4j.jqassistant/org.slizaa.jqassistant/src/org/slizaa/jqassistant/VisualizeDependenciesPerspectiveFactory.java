package org.slizaa.jqassistant;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class VisualizeDependenciesPerspectiveFactory implements IPerspectiveFactory {

  @Override
  public void createInitialLayout(IPageLayout layout) {

    //
    IFolderLayout folderLayout = layout.createFolder("left", IPageLayout.LEFT, 0.2f, IPageLayout.ID_OUTLINE);
    folderLayout.addView(IPageLayout.ID_OUTLINE);
    layout.createFolder("right", IPageLayout.RIGHT, 0.6f, IPageLayout.ID_OUTLINE);
    layout.createFolder("bottom", IPageLayout.BOTTOM, 0.8f, IPageLayout.ID_OUTLINE);
    layout.createFolder("top", IPageLayout.TOP, 0.6f, IPageLayout.ID_OUTLINE);
    
    //
    layout.setEditorAreaVisible(false);
  }
}
