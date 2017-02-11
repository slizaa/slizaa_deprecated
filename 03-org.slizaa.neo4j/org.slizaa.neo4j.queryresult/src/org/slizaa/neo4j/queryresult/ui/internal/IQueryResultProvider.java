package org.slizaa.neo4j.queryresult.ui.internal;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IQueryResultProvider {

  void onQueryStarted(Consumer<String> consumer);
  
  void onQueryResultReceived(BiConsumer<String, JsonObject> consumer);
}
