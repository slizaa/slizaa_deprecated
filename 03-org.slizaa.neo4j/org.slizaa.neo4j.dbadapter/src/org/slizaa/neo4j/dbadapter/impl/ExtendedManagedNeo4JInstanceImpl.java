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

import org.eclipse.debug.core.ILaunch;
import org.eclipse.emf.common.util.EList;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedManagedNeo4JInstanceImpl extends ManagedNeo4jInstanceImpl {

  /** - */
  private Neo4jClientTrait _neo4jClientTrait;

  /** - */
  private ILauncherService _launcherService;

  /** - */
  private ILaunch          _launch;

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public ILauncherService getLauncherService() {
    return _launcherService;
  }

  /**
   * <p>
   * </p>
   *
   * @param launcherService
   */
  public void setLauncherService(ILauncherService launcherService) {
    this._launcherService = launcherService;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public ILaunch getLaunch() {
    return _launch;
  }

  /**
   * <p>
   * </p>
   *
   * @param launch
   */
  public void setLaunch(ILaunch launch) {
    _launch = launch;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setActive(boolean newActive) {
    super.setActive(newActive);
    neo4jClientTrait().setActive(newActive);
  }

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

  @Override
  public boolean isScanned() {
    return _launcherService.isScanned(this);
  }

  @Override
  public void scan() {
    try {
      _launcherService.scan(this);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Override
  public void start() {
    try {
      _launcherService.start(this);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Override
  public void stop() {
    try {
      _launcherService.stop(this);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Override
  public void delete() {
    System.out.println("delete");
  }

  @Override
  public boolean isDatabaseInstallationAvailable() {
    return _launcherService.isJQAssistantInstalled();
  }

  @Override
  public void enrich() {
    try {
      _launcherService.enrich(this);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
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
      _neo4jClientTrait = new Neo4jClientTrait(this);
    }

    //
    return _neo4jClientTrait;
  }
}
