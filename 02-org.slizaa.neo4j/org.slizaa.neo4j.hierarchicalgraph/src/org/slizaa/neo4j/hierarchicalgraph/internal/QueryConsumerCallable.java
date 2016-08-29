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
package org.slizaa.neo4j.hierarchicalgraph.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class QueryConsumerCallable extends AbstractNeo4JCypherCallable implements Callable<Void> {

  /** the consumer */
  private Consumer<JsonObject> _consumer;

  /**
   * <p>
   * Creates a new instance of type {@link QueryConsumerCallable}.
   * </p>
   *
   * @param service
   * @param query
   * @param params
   */
  public QueryConsumerCallable(Neo4JRemoteServiceRestApi service, String query, Map<String, String> params,
      Consumer<JsonObject> consumer) {
    super(service, query, params);

    //
    _consumer = checkNotNull(_consumer);
  }

  /**
   * {@inheritDoc}
   */
  public Void call() throws Exception {

    //
    JsonObject jsonObject = neo4JRemoteServiceRestApi().executeCypherQuery(asQuery(query(), params()));

    //
    _consumer.accept(jsonObject);

    //
    return null;
  }
}
