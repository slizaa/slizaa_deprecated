package org.slizaa.neo4j.dbadapter.ui.internal.wizard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewDatabaseDefinitionFileWizardPage extends WizardNewFileCreationPage {

  public NewDatabaseDefinitionFileWizardPage(IStructuredSelection selection) {
    super("NewDatabaseDefinitionFileWizardPage", selection);
    setTitle("Database Definition File");
    setDescription("Creates a new Database Definition File");
    setFileExtension("dbdef");
  }

  // @Override
  // protected void createAdvancedControls(Composite parent) {
  // super.createAdvancedControls(parent);
  //
  // Composite container = new Composite(parent, SWT.NONE);
  // GridLayout layout = new GridLayout();
  // container.setLayout(layout);
  // layout.numColumns = 1;
  //
  // Combo combo = new Combo(parent, SWT.READ_ONLY);
  // combo.setItems("Managed Database (within slizaa)", "Unmanaged Database (outside slizaa)");
  // GridData gd = new GridData(GridData.FILL_HORIZONTAL);
  // combo.setLayoutData(gd);
  // // required to avoid an error in the system
  // setControl(container);
  // setPageComplete(false);
  // }

  @Override
  protected InputStream getInitialContents() {
    // Bundle bundle = FrameworkUtil.getBundle(this.getClass()).getBundleContext().getBundle();
    return new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
  }
}