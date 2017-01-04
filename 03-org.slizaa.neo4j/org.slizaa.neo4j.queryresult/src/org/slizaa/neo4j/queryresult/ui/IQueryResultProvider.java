package org.slizaa.neo4j.queryresult.ui;

import java.util.function.BiConsumer;

import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IQueryResultProvider {

  void registerQueryResultHandler(BiConsumer<String, JsonObject> consumer);
}
