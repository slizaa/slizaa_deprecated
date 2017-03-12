/*******************************************************************************
 * Copyright (c) Gerd Wuetherich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd W�therich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.neo4j.dbadapter.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.glassfish.jersey.client.ClientConfig;
import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.dbadapter.internal.DbAdapterActivator;
import org.slizaa.neo4j.dbadapter.internal.rest.Neo4JRemoteServiceRestApi;
import org.slizaa.neo4j.dbadapter.internal.rest.QueryCallable;
import org.slizaa.neo4j.dbadapter.internal.rest.QueryConsumerCallable;

import com.eclipsesource.jaxrs.consumer.ConsumerFactory;
import com.eclipsesource.jaxrs.provider.gson.GsonProvider;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
class Neo4jClientTrait {

  public static Neo4jClientTrait getNeo4jClientTrait(Neo4jRestClient neo4jRestClient) {
    if (neo4jRestClient instanceof ExtendedNeo4jRestClientImpl) {
      return ((ExtendedNeo4jRestClientImpl) neo4jRestClient).getTrait();
    }
    if (neo4jRestClient instanceof ExtendedManagedNeo4JInstanceImpl) {
      return ((ExtendedManagedNeo4JInstanceImpl) neo4jRestClient).getTrait();
    }
    return null;
  }

  /** - */
  private Neo4JRemoteServiceRestApi _cypherQueryService;

  /** - */
  private Neo4jRestClientImpl       _neo4jRestClient;

  /**
   * <p>
   * Creates a new instance of type {@link Neo4jClientTrait}.
   * </p>
   *
   * @param neo4jRestClient
   */
  public Neo4jClientTrait(Neo4jRestClientImpl neo4jRestClient) {
    this._neo4jRestClient = checkNotNull(neo4jRestClient);

    _cypherQueryService = ConsumerFactory.createConsumer(checkNotNull(_neo4jRestClient.baseURI),
        new ClientConfig().register(new GsonProvider<>()), Neo4JRemoteServiceRestApi.class);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setConnected(boolean newConnected) {
    boolean oldConnected = _neo4jRestClient.connected;
    _neo4jRestClient.connected = newConnected;
    if (_neo4jRestClient.eNotificationRequired()) {
      _neo4jRestClient.eNotify(new ENotificationImpl(_neo4jRestClient, Notification.SET,
          DbAdapterPackage.NEO4J_REST_CLIENT__CONNECTED, oldConnected, _neo4jRestClient.connected));
    }

    //
    _neo4jRestClient.getDefiningResource().setReadOnly(newConnected);
  }

  // @SuppressWarnings("deprecation")
  // public void setActive(boolean newActive) {
  //
  // /**
  // * <!-- begin-user-doc -->
  // * <!-- end-user-doc -->
  // * @generated
  // */
  // boolean oldActive = active;
  // active = newActive;
  // if (eNotificationRequired())
  // eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.NEO4J_REST_CLIENT__ACTIVE, oldActive,
  // active));
  //
  //
  // //
  // if (newActive) {
  // if (_neo4jRestClient.getParent() != null && _neo4jRestClient.getParent().getParent() != null) {
  // _neo4jRestClient.getParent().getParent().setActiveDbAdapter(_neo4jRestClient);
  // }
  // } else {
  // if (_neo4jRestClient.getParent() != null && _neo4jRestClient.getParent().getParent() != null) {
  // _neo4jRestClient.getParent().getParent().setActiveDbAdapter(null);
  // }
  // }
  //
  //
  // }

  /**
   * <p>
   * </p>
   *
   * @param storageArea
   * @return
   */
  public boolean isScanned(String storageArea) {
    return new File(checkNotNull(storageArea), "neostore").exists();
  }

  /**
   * {@inheritDoc}
   */

  public void dispose() {

  }

  /**
   * {@inheritDoc}
   */

  public Future<JsonObject> executeCypherQuery(String query) {

    // create future task
    FutureTask<JsonObject> futureTask = new FutureTask<JsonObject>(
        new QueryCallable(_cypherQueryService, checkNotNull(query), null));

    // execute
    getExecutor().execute(futureTask);

    // return the running task
    return futureTask;
  }

  /**
   * {@inheritDoc}
   */

  public Future<JsonObject> executeCypherQuery(String query, Map<String, String> maps) {

    // create future task
    FutureTask<JsonObject> futureTask = new FutureTask<JsonObject>(
        new QueryCallable(_cypherQueryService, checkNotNull(query), maps));

    // execute
    getExecutor().execute(futureTask);

    // return the running task
    return futureTask;
  }

  /**
   * {@inheritDoc}
   */

  public Future<?> executeCypherQuery(String query, Consumer<JsonObject> consumer) {

    // create future task
    FutureTask<Void> futureTask = new FutureTask<Void>(
        new QueryConsumerCallable(_cypherQueryService, checkNotNull(query), null, checkNotNull(consumer)));

    // execute
    getExecutor().execute(futureTask);

    // return the running task
    return futureTask;
  }

  /**
   * {@inheritDoc}
   */

  public Future<?> executeCypherQuery(String query, Map<String, String> params, Consumer<JsonObject> consumer) {

    // create future task
    FutureTask<Void> futureTask = new FutureTask<Void>(
        new QueryConsumerCallable(_cypherQueryService, checkNotNull(query), params, checkNotNull(consumer)));

    // execute
    getExecutor().execute(futureTask);

    // return the running task
    return futureTask;
  }

  public EList<String> getAllRelationshipTypes() {
    EList<String> result = new BasicEList<String>();
    _cypherQueryService.getRelationshipTypes().forEach(c -> result.add(c.getAsString()));
    return result;
  }

  public EList<String> getAllPropertyKeys() {
    EList<String> result = new BasicEList<String>();
    _cypherQueryService.getPropertyKeys().forEach(c -> result.add(c.getAsString()));
    return result;
  }

  public EList<String> getAllLabels() {
    EList<String> result = new BasicEList<String>();
    _cypherQueryService.getNodeLabels().forEach(c -> result.add(c.getAsString()));
    return result;
  }

  public JsonArray getLabelsForNode(long nodeId) {
    return _cypherQueryService.getNodeLabels(nodeId);
  }

  public JsonObject getPropertiesForNode(long nodeId) {
    return _cypherQueryService.getNodeProperties(nodeId);
  }

  public JsonObject getPropertiesForRelationship(long relationshipId) {
    return _cypherQueryService.getRelationshipProperties(relationshipId);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private ExecutorService getExecutor() {
    return DbAdapterActivator.getExecutor();
  }
}
