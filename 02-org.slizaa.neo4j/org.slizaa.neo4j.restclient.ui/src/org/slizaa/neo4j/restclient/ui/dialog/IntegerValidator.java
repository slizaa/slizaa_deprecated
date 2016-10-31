/*******************************************************************************
 * Copyright (c) Gerd W�therich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd W�therich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.neo4j.restclient.ui.dialog;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

final class IntegerValidator implements IValidator {

  @Override
  public IStatus validate(Object value) {
    if (value.equals("")) {
      return ValidationStatus.ok();
    }
    try {
      Integer.parseInt(value.toString());
      return ValidationStatus.ok();
    } catch (NumberFormatException e) {
      return ValidationStatus.error(String.format("Invalid port '%s'.", value.toString()));
    }
  }
}
