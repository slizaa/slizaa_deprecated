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

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.slizaa.neo4j.restclient.ui.dialog.UrlDialogModel.Protocol;

/**
 * <p>
 * The URL validator
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
final class UrlValidator implements IValidator {

  /** - */
  private UrlDialogModel _model;

  /**
   * <p>
   * Creates a new instance of type {@link UrlValidator}.
   * </p>
   *
   * @param model
   */
  public UrlValidator(UrlDialogModel model) {
    Assert.isNotNull(model);
    _model = model;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus validate(Object value) {

    String uriString = (String) value;

    if (uriString == null || uriString.isEmpty()) {
      return ValidationStatus.info(UrlDialog.ENTER_LOCATION_OF_THE_JQASSISTANT_SERVER);
    }

    try {

      URL url = new URL(uriString);

      //
      if (!(url.getProtocol().equals("http") || url.getProtocol().equals("https"))) {
        return ValidationStatus.error(
            String.format("Unsupported protocol '%s' (supported protocols: 'http', 'https').", url.getProtocol()));
      }
      _model.setProtocol(Protocol.valueOf(url.getProtocol()), false);

      //
      if (url.getHost() == null || url.getHost().isEmpty()) {
        return ValidationStatus.error("Host required.");
      }
      _model.setHostName(url.getHost(), false);

      if (url.getPort() == -1) {
        return ValidationStatus.error("Port required.");
      }
      _model.setPort(url.getPort() != -1 ? Integer.toString(url.getPort()) : "", false);

    } catch (MalformedURLException exception) {
      return ValidationStatus.error("Malformed URL.");
    }

    return ValidationStatus.ok();
  }
}
