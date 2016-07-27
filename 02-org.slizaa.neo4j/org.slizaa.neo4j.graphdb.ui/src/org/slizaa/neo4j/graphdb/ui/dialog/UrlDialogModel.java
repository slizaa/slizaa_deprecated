/*******************************************************************************
 * Copyright (c) Gerd Wütherich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd Wütherich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.neo4j.graphdb.ui.dialog;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class UrlDialogModel extends AbstractModelObject {

  /** - */
  private static final String EMPTY_STRING = "";

  /** - */
  private static final String DEFAULT_PORT = "7474";

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  public enum Protocol {
    http,
    https;
  }

  /** - */
  private String   _uri;

  /** - */
  private String   _hostName;

  /** - */
  private Protocol _protocol;

  /** - */
  private String   _port;

  /** - */
  private boolean  _hasValidUrl;

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public String getUri() {
    return _uri;
  }

  /**
   * <p>
   * </p>
   *
   * @param uri
   */
  public void setUri(String uri) {
    firePropertyChange("uri", _uri, _uri = uri);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public String getHostName() {
    return _hostName;
  }

  /**
   * <p>
   * </p>
   *
   * @param hostName
   */
  public void setHostName(String hostName) {
    setHostName(hostName, true);
  }

  /**
   * <p>
   * </p>
   *
   * @param hostName
   * @param setUri
   */
  public void setHostName(String hostName, boolean setUri) {
    firePropertyChange("hostName", _hostName, _hostName = hostName);
    if (setUri) {
      setUri(createUrl());
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Protocol getProtocol() {
    return _protocol;
  }

  /**
   * <p>
   * </p>
   *
   * @param protocol
   */
  public void setProtocol(Protocol protocol) {
    setProtocol(protocol, true);
  }

  /**
   * <p>
   * </p>
   *
   * @param protocol
   * @param setUri
   */
  public void setProtocol(Protocol protocol, boolean setUri) {
    firePropertyChange("protocol", _protocol, _protocol = protocol);
    if (setUri) {
      setUri(createUrl());
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public String getPort() {
    return _port;
  }

  /**
   * <p>
   * </p>
   *
   * @param port
   */
  public void setPort(String port) {
    setPort(port, true);
  }

  /**
   * <p>
   * </p>
   *
   * @param port
   * @param setUri
   */
  public void setPort(String port, boolean setUri) {

    // set the default port if no port has been selected
    if (port == null || port.isEmpty()) {
      port = DEFAULT_PORT;
    }

    firePropertyChange("port", _port, _port = port);
    if (setUri) {
      setUri(createUrl());
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public boolean isValidUrl() {
    return _hasValidUrl;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public boolean testConnection() {
    try {
      URL baseUrl = getAsURL();
      String relativePath = "/db/data/";
      URL concatenatedUrl = new URL(baseUrl.toExternalForm() + relativePath);
      URLConnection connection = concatenatedUrl.openConnection();
      connection.connect();
    } catch (Exception e) {
      return false;
    }
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "UrlDialogModel [_uri=" + _uri + ", _hostName=" + _hostName + ", _protocol=" + _protocol + "]";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
    super.firePropertyChange(propertyName, oldValue, newValue);

    // check for valid URL
    try {

      getAsURL();

      // fire change
      if (!_hasValidUrl) {
        firePropertyChange("validUrl", false, _hasValidUrl = true);
      }
    } catch (Exception e) {

      // fire change
      if (_hasValidUrl) {
        firePropertyChange("validUrl", true, _hasValidUrl = false);
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private String createUrl() {

    // set the defaults
    if (_protocol == null) {
      setProtocol(Protocol.http, false);
    }
    if (_port == null) {
      setPort(DEFAULT_PORT, false);
    }
    if (_hostName == null) {
      setHostName(EMPTY_STRING, false);
    }

    //
    try {
      return getAsURL().toExternalForm();
    } catch (Exception e) {
      return EMPTY_STRING;
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   * @throws MalformedURLException
   */
  private URL getAsURL() throws MalformedURLException {
    return new URL(_protocol.name(), /*UrlEscapers.urlFragmentEscaper().escape(_hostName)*/ _hostName, Integer.parseInt(_port),
        EMPTY_STRING);
  }
}
