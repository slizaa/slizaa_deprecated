package org.slizaa.neo4j.testfwk.internal.exporter.mapping;

import java.util.List;

import org.slizaa.neo4j.dbadapter.QueryResultConverter;
import org.slizaa.neo4j.testfwk.internal.exporter.mapping.GraphFactoryFunctions.Neo4jRelationship;

import com.google.gson.JsonObject;

public class Neo4jResultJsonConverter {

  /**
   * <p>
   * </p>
   *
   * @param jsonObject
   * @return
   */
  public static List<Neo4jRelationship> extractNeo4jRelationships(JsonObject jsonObject) {
    return QueryResultConverter.convertRows(jsonObject, row -> new Neo4jRelationship(row.get(0).getAsLong(),
        row.get(1).getAsLong(), row.get(2).getAsLong(), row.get(3).getAsString()));
  }

  /**
   * <p>
   * </p>
   *
   * @param jsonObject
   */
  public static List<Long[]> extractHierarchy(JsonObject jsonObject) {
    return QueryResultConverter.convertRows(jsonObject,
        row -> new Long[] { row.get(0).getAsLong(), row.get(1).getAsLong() });
  }

  /**
   * <p>
   * </p>
   *
   * @param jsonObject
   * @return
   */
  public static List<Long> extractRootNodes(JsonObject jsonObject) {
    return QueryResultConverter.convertRows(jsonObject, row -> row.get(0).getAsLong());
  }
}
