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
package org.slizaa.neo4j.restclient.impl;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.glassfish.jersey.client.ClientConfig;
import org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl;
import org.slizaa.neo4j.restclient.internal.Neo4JRemoteServiceRestApi;
import org.slizaa.neo4j.restclient.internal.QueryCallable;
import org.slizaa.neo4j.restclient.internal.QueryConsumerCallable;

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
public class ExtendedNeo4JRemoteRepositoryImpl extends Neo4jRestClientImpl {

  /** - */
  private ExecutorService           _executor;

  /** - */
  private Neo4JRemoteServiceRestApi _cypherQueryService;

  /**
   * {@inheritDoc}
   */
  @Override
  public void init() {

    //
    checkState(getThreadPoolSize() > 0, "threadPoolSize must not be <= 0.");

    //
    _executor = Executors.newFixedThreadPool(getThreadPoolSize());

    //
    ClientConfig config = new ClientConfig().register(new GsonProvider<>());
    _cypherQueryService = ConsumerFactory.createConsumer(getBaseURI(), config, Neo4JRemoteServiceRestApi.class);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void dispose() {

    //
    _executor.shutdown();

    //
    try {
      _executor.awaitTermination(20, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<JsonObject> executeCypherQuery(String query) {

    // create future task
    FutureTask<JsonObject> futureTask = new FutureTask<JsonObject>(
        new QueryCallable(_cypherQueryService, checkNotNull(query), null));

    // execute
    _executor.execute(futureTask);

    // return the running task
    return futureTask;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<JsonObject> executeCypherQuery(String query, Map<String, String> maps) {

    // create future task
    FutureTask<JsonObject> futureTask = new FutureTask<JsonObject>(
        new QueryCallable(_cypherQueryService, checkNotNull(query), maps));

    // execute
    _executor.execute(futureTask);

    // return the running task
    return futureTask;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> executeCypherQuery(String query, Consumer<JsonObject> consumer) {

    // create future task
    FutureTask<Void> futureTask = new FutureTask<Void>(
        new QueryConsumerCallable(_cypherQueryService, checkNotNull(query), null, checkNotNull(consumer)));

    // execute
    _executor.execute(futureTask);

    // return the running task
    return futureTask;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> executeCypherQuery(String query, Map<String, String> params, Consumer<JsonObject> consumer) {

    // create future task
    FutureTask<Void> futureTask = new FutureTask<Void>(
        new QueryConsumerCallable(_cypherQueryService, checkNotNull(query), params, checkNotNull(consumer)));

    // execute
    _executor.execute(futureTask);

    // return the running task
    return futureTask;
  }

  @Override
  public EList<String> getAllRelationshipTypes() {
    // http://localhost:7474/db/data/relationship/types
    return super.getAllRelationshipTypes();
  }

  @Override
  public EList<String> getAllPropertyKeys() {
    // http://localhost:7474/db/data/propertykeys
    return super.getAllPropertyKeys();
  }

  @Override
  public EList<String> getAllLabels() {
    // http://localhost:7474/db/data/labels
    return super.getAllLabels();
  }

  @Override
  public JsonArray getLabelsForNode(long nodeId) {
    return _cypherQueryService.getNodeLabels(nodeId);
  }

  @Override
  public JsonObject getPropertiesForNode(long nodeId) {
    return _cypherQueryService.getNodeProperties(nodeId);
  }

  @Override
  public JsonObject getPropertiesForRelationship(long relationshipId) {
    return _cypherQueryService.getRelationshipProperties(relationshipId);
  }
}
