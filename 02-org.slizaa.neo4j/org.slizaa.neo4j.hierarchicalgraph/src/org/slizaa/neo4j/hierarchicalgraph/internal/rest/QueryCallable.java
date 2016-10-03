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
package org.slizaa.neo4j.hierarchicalgraph.internal.rest;

import java.util.Map;
import java.util.concurrent.Callable;

import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class QueryCallable extends AbstractNeo4JCypherCallable implements Callable<JsonObject> {
  
  /**
   * <p>
   * Creates a new instance of type {@link QueryCallable}.
   * </p>
   *
   * @param service
   * @param query
   * @param params
   */
  public QueryCallable(Neo4JRemoteServiceRestApi service, String query, Map<String, String> params) {
    super(service, query, params);
  }

  /**
   * {@inheritDoc}
   */
  public JsonObject call() throws Exception {
    String query = asQuery(query(), params());
    return neo4JRemoteServiceRestApi().executeCypherQuery(query);
  }
}
