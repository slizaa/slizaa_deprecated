package org.slizaa.neo4j.graphdb.ui.dialog;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class HostNameValidator implements IValidator {

  @Override
  public IStatus validate(Object value) {
    
    //
    String uriString = (String) value;

    //
    if (uriString == null || uriString.isEmpty()) {
      return ValidationStatus.info(UrlDialog.ENTER_LOCATION_OF_THE_JQASSISTANT_SERVER);
    }
    
    //
    return ValidationStatus.ok();
  }
}
