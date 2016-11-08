package org.slizaa.neo4j.restclient.ui.handler;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 * @author
 */
public class SelectionUtils {

  /**
   * <p>
   * </p>
   * 
   * @param selection
   * @param consumer
   */
  public static void doWithSelection(Object selection, Consumer<Neo4jRestClient> consumer) {
    getNeo4JRepositories(selection).forEach(consumer);
  }

  /**
   * <p>
   * </p>
   *
   * @param selection
   * @return
   */
  public static List<Neo4jRestClient> getNeo4JRepositories(Object selection) {

    //
    List<Neo4jRestClient> result = new LinkedList<>();

    //
    if (selection instanceof Collection<?>) {
      for (Object element : (Collection<?>) selection) {
        result.add((Neo4jRestClient) element);
      }
    } else {
      result.add((Neo4jRestClient) selection);
    }

    //
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param selection
   * @return
   */
  public static boolean onlyNeo4JRepositoriesSelected(Object selection) {

    //
    if (selection instanceof Collection<?>) {
      for (Object element : (Collection<?>) selection) {
        if (!(element instanceof Neo4jRestClient)) {
          return false;
        }
      }
      return true;
    }

    //
    return selection instanceof Neo4jRestClient;
  }
}
