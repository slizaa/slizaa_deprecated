package org.slizaa.neo4j.dbadapter;

/**
 * <p>
 * The {@link IRestClientConnectionListener} can be used to hook in a additional steps if a rest client has been
 * connected or disconnected. Simply implement a service of this type and register it as an OSGi service at the OSGi
 * service registry.
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IRestClientConnectionListener {

  /**
   * <p>
   * </p>
   *
   * @param restClient
   */
  void restClientConnected(Neo4jRestClient restClient);

  /**
   * <p>
   * </p>
   *
   * @param restClient
   */
  void restClientDisconnected(Neo4jRestClient restClient);
}
