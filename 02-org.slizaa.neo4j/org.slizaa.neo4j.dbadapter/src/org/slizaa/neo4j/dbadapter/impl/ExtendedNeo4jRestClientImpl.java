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

import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedNeo4jRestClientImpl extends Neo4jRestClientImpl {

  /** - */
  private Neo4jClientTrait _neo4jClientTrait;

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<JsonObject> executeCypherQuery(String query) {
    return neo4jClientTrait().executeCypherQuery(query);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<JsonObject> executeCypherQuery(String query, Map<String, String> maps) {
    return neo4jClientTrait().executeCypherQuery(query, maps);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> executeCypherQuery(String query, Consumer<JsonObject> consumer) {
    return neo4jClientTrait().executeCypherQuery(query, consumer);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> executeCypherQuery(String query, Map<String, String> params, Consumer<JsonObject> consumer) {
    return neo4jClientTrait().executeCypherQuery(query, params, consumer);
  }

  @Override
  public EList<String> getAllRelationshipTypes() {
    return neo4jClientTrait().getAllRelationshipTypes();
  }

  @Override
  public EList<String> getAllPropertyKeys() {
    return neo4jClientTrait().getAllPropertyKeys();
  }

  @Override
  public EList<String> getAllLabels() {
    return neo4jClientTrait().getAllLabels();
  }

  @Override
  public JsonArray getLabelsForNode(long nodeId) {
    return neo4jClientTrait().getLabelsForNode(nodeId);
  }

  @Override
  public JsonObject getPropertiesForNode(long nodeId) {
    return neo4jClientTrait().getPropertiesForNode(nodeId);
  }

  @Override
  public JsonObject getPropertiesForRelationship(long relationshipId) {
    return neo4jClientTrait().getPropertiesForRelationship(relationshipId);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private Neo4jClientTrait neo4jClientTrait() {

    //
    if (_neo4jClientTrait == null) {
      _neo4jClientTrait = Neo4jClientTrait.create(getBaseURI());
    }

    //
    return _neo4jClientTrait;
  }
}
