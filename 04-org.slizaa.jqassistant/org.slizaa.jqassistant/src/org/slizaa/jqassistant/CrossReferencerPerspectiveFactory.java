package org.slizaa.jqassistant;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class CrossReferencerPerspectiveFactory implements IPerspectiveFactory {

  /** - */
  private static final String FOLDER_TOP    = "top";

  /** - */
  private static final String FOLDER_BOTTOM = "bottom";

  @Override
  public void createInitialLayout(IPageLayout layout) {

    // top
    IFolderLayout folder = layout.createFolder(FOLDER_TOP, IPageLayout.TOP, 0.6f, IPageLayout.ID_EDITOR_AREA);
    folder.addView("org.slizaa.ui.xref.XRefPart");

    // bottom
    folder = layout.createFolder(FOLDER_BOTTOM, IPageLayout.BOTTOM, 0.4f, IPageLayout.ID_EDITOR_AREA);
    folder.addView("org.slizaa.ui.dependencytree.DependencyTreePart");
    folder.addView("org.slizaa.ui.dependencytable.DependencyTablePart");

    //
    layout.setEditorAreaVisible(false);
  }
}
