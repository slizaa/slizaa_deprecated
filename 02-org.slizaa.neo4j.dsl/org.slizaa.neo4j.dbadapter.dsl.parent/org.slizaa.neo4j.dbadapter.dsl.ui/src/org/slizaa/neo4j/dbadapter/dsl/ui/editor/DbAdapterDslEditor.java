package org.slizaa.neo4j.dbadapter.dsl.ui.editor;

import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DbAdapterDslEditor extends XtextEditor {
  // https://www.eclipse.org/forums/index.php/t/161344/
  
  @Override
  public boolean isEditable() {
    return !getResource().isReadOnly();
  }
}
