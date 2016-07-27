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
package org.slizaa.neo4j.hierarchicalgraph.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class Neo4JRemoteCypherCallable implements Callable<JsonObject> {

  /** - */
  private Neo4JRemoteServiceRestApi _service;

  /** - */
  private String                          _query;

  /** - */
  private Map<String, String>             _params;

  /**
   * <p>
   * Creates a new instance of type {@link Neo4JRemoteCypherCallable}.
   * </p>
   *
   * @param query
   */
  public Neo4JRemoteCypherCallable(Neo4JRemoteServiceRestApi service, String query, Map<String, String> params) {
    _service = checkNotNull(service);
    _query = checkNotNull(query);
    _params = params;
  }

  /**
   * {@inheritDoc}
   */
  public JsonObject call() throws Exception {
    return _service.executeCypherQuery(asQuery(_query, _params));
  }

  /**
   * <p>
   * </p>
   *
   * @param cypherQuery
   * @return
   */
  private static String asQuery(String cypherQuery, Map<String, String> params) {

    //
    if (params != null && !params.isEmpty()) {

      StringBuilder builder = new StringBuilder();
      Iterator<Entry<String, String>> iterator = params.entrySet().iterator();
      while (iterator.hasNext()) {
        Map.Entry<java.lang.String, java.lang.String> entry = iterator.next();
        builder.append("\"");
        builder.append(entry.getKey());
        builder.append("\":");
        builder.append(entry.getValue());
        if (iterator.hasNext()) {
          builder.append(",");
        }
      }

      return String.format("{\"query\" : \"%s\", \"params\": {%s}}", checkNotNull(cypherQuery), builder.toString());
    }

    //
    return String.format("{\"query\" : \"%s\"}", checkNotNull(cypherQuery));
  }
}
