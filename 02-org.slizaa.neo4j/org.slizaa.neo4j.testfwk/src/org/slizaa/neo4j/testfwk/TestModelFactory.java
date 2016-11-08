package org.slizaa.neo4j.testfwk;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewRootNode;
import static org.slizaa.neo4j.testfwk.internal.TestModelMappingFunctions.mapDependencies;
import static org.slizaa.neo4j.testfwk.internal.TestModelMappingFunctions.mapFirstLevelElements;
import static org.slizaa.neo4j.testfwk.internal.TestModelMappingFunctions.mapHierarchy;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.IDependencySource;
import org.slizaa.hierarchicalgraph.INodeSource;
import org.slizaa.neo4j.dbadapter.DbadapterFactory;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;

import com.google.gson.JsonObject;

public class TestModelFactory {

  /** - */
  private static final String ROOT_MODULES     = "MATCH (module:Java:Artifact) WHERE (module:Directory OR module:Jar:Archive) RETURN id(module)";

  /** - */
  private static String       FLAT_DIRECTORIES = "MATCH (module:Java:Artifact)-[:CONTAINS]->(d:Directory)-[:CONTAINS]->(f:File) WHERE (module:Directory OR module:Jar:Archive)  AND NOT (f:Directory) RETURN DISTINCT id(module), id(d)";

  /** - */
  private static final String FILES            = "MATCH (d:Directory)-[:CONTAINS]->(f:File) WHERE NOT (f:Type) AND NOT (f:Directory) RETURN id(d), id(f)";

  /** - */
  private static final String TYPES            = "MATCH (d:Directory)-[:CONTAINS]->(t:Type) RETURN id(d), id(t)";

  /** - */
  private static final String DEPENDENCIES     = "MATCH (t1:File:Type:Java)-[r:DEPENDS_ON]->(t2:File:Type:Java) RETURN id(t1),id(t2),id(r),type(r)";

  /**
   * <p>
   * </p>
   *
   * @param baseUri
   * @return
   */
  public static Neo4jRestClient createNeo4JRemoteRepository(String baseUri) {

    // create the remote repository
    final Neo4jRestClient remoteRepository = DbadapterFactory.eINSTANCE.createNeo4jRestClient();

    //
    remoteRepository.setBaseURI(checkNotNull(baseUri));
    remoteRepository.setThreadPoolSize(20);
    remoteRepository.init();

    //
    return remoteRepository;
  }

  /**
   * <p>
   * </p>
   *
   * @throws InterruptedException
   * @throws ExecutionException
   * @throws IOException
   */
  public static HGRootNode createGraphFromDefaultMapping(Neo4jRestClient remoteRepository) throws Exception {

    // create the root element
    final HGRootNode rootElement = createNewRootNode(() -> {
      Neo4JBackedRootNodeSource rootNodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE
          .createNeo4JBackedRootNodeSource();
      rootNodeSource.setIdentifier(-1l);
      return rootNodeSource;
    });

    // ***************************************************
    // create the node source creator function
    // ***************************************************
    Function<Long, INodeSource> createNodeSourceFunction = (id) -> {

      // create the node source
      Neo4JBackedNodeSource nodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE.createNeo4JBackedNodeSource();
      nodeSource.setIdentifier(id);

      // return the result
      return nodeSource;
    };

    // ***************************************************
    // create the node source creator function
    // ***************************************************
    BiFunction<Long, String, IDependencySource> createDependencySourceFunction = (id, type) -> {

      // create the dependency source
      Neo4JBackedDependencySource dependencySource = Neo4jHierarchicalgraphFactory.eINSTANCE
          .createNeo4JBackedDependencySource();
      dependencySource.setIdentifier(id);
      dependencySource.setType("DEPENDS_ON");

      // return the result
      return dependencySource;
    };

    //
    Future<JsonObject> resultRoot = remoteRepository.executeCypherQuery(ROOT_MODULES);
    Future<JsonObject> resultDirectories = remoteRepository.executeCypherQuery(FLAT_DIRECTORIES);
    Future<JsonObject> resultFiles = remoteRepository.executeCypherQuery(FILES);
    Future<JsonObject> resultTypes = remoteRepository.executeCypherQuery(TYPES);
    Future<JsonObject> dependencies = remoteRepository.executeCypherQuery(DEPENDENCIES);

    mapFirstLevelElements(resultRoot.get().getAsJsonArray("data"), rootElement, createNodeSourceFunction);
    mapHierarchy(resultDirectories.get().getAsJsonArray("data"), rootElement, createNodeSourceFunction);
    mapHierarchy(resultFiles.get().getAsJsonArray("data"), rootElement, createNodeSourceFunction);
    mapHierarchy(resultTypes.get().getAsJsonArray("data"), rootElement, createNodeSourceFunction);

    //
    mapDependencies(dependencies.get().getAsJsonArray("data"), rootElement, true, createDependencySourceFunction);

    //
    return rootElement;
  }
}
