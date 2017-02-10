package org.slizaa.neo4j.dbadapter;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class QueryResultConverter {

  /**
   * <p>
   * Convert rows.
   * </p>
   *
   * @param jsonObject
   * @param function
   * @return
   */
  public static <T> List<T> convertRows(JsonObject jsonObject, Function<JsonArray, T> function) {

    // create the result list
    List<T> result = new LinkedList<>();

    //
    for (final JsonElement element : checkNotNull(jsonObject).getAsJsonArray("results").get(0).getAsJsonObject()
        .getAsJsonArray("data")) {

      //
      result.add(function.apply(((JsonObject) element).getAsJsonArray("row")));
    }

    // return the result
    return result;
  }
}
