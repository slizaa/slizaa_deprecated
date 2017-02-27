package org.slizaa.ui.shared.internal.wizard;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * <p>
 * A wizard page to enter the required settings for a slizaa project.
 * </p>
 */
public class NewSlizaaProjectWizardCreationPage extends WizardNewProjectCreationPage {

  public NewSlizaaProjectWizardCreationPage() {
    super("NewSlizaaProjectWizardCreationPage");

    setTitle("Create a slizaa project");
//    setDescription("Set project name and JRE.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void createControl(Composite parent) {
    // add controls from default basic wizard page
    super.createControl(parent);
    // Composite control = (Composite) getControl();
  }



  /**
   * Sets the message from given IStatus as the dialog's error message, if status is not OK. Otherwise sets error
   * message to null.
   * 
   * @param status
   */
  private void setErrorMessageFromStatus(IStatus status) {
    if (status == null || status.isOK()) {
      setErrorMessage(null);
    } else {
      setErrorMessage(status.getMessage());
    }
  }

//  /*
//   * (non-Javadoc)
//   * 
//   * @see org.eclipse.ui.dialogs.WizardNewProjectCreationPage#validatePage()
//   */
//  @Override
//  protected boolean validatePage() {
//    if (!super.validatePage()) {
//      return false;
//    }
//
//    // Validate JRE selection
//    IStatus status = _jreComboBlock.getStatus();
//    setErrorMessageFromStatus(status);
//
//    return status.isOK();
//  }

}
