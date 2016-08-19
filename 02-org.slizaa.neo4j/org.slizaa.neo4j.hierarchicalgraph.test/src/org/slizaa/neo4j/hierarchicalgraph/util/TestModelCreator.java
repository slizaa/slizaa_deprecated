package org.slizaa.neo4j.hierarchicalgraph.util;

import static org.slizaa.neo4j.hierarchicalgraph.util.TestModelCreatorFunctions.createDependencies;
import static org.slizaa.neo4j.hierarchicalgraph.util.TestModelCreatorFunctions.createFirstLevelElements;
import static org.slizaa.neo4j.hierarchicalgraph.util.TestModelCreatorFunctions.createHierarchy;
import static org.slizaa.neo4j.hierarchicalgraph.util.XmiUtils.save;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Function;

import org.slizaa.hierarchicalgraph.DefaultHGNodeSource;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;

import com.google.gson.JsonObject;

public class TestModelCreator {

  /** - */
  public static final String ROOT_MODULES     = "MATCH (module:Java:Artifact) WHERE (module:Directory OR module:Jar:Archive) RETURN id(module)";

  /** - */
  public static String       FLAT_DIRECTORIES = "MATCH (module:Java:Artifact)-[:CONTAINS]->(d:Directory)-[:CONTAINS]->(f:File) WHERE (module:Directory OR module:Jar:Archive)  AND NOT (f:Directory) RETURN DISTINCT id(module), id(d)";

  /** - */
  public static final String FILES            = "MATCH (d:Directory)-[:CONTAINS]->(f:File) WHERE NOT (f:Type) AND NOT (f:Directory) RETURN id(d), id(f)";

  /** - */
  public static final String TYPES            = "MATCH (d:Directory)-[:CONTAINS]->(t:Type) RETURN id(d), id(t)";

  /** - */
  public static final String DEPENDENCIES     = "MATCH (t1:File:Type:Java)-[:DEPENDS_ON]->(t2:File:Type:Java) RETURN id(t1),id(t2), 'DEPENDS_ON'";

  /**
   * <p>
   * </p>
   *
   * @throws InterruptedException
   * @throws ExecutionException
   * @throws IOException
   */
  public static void createTestModel(String fileName, String baseUri) throws Exception {

    // create the remote repository
    final Neo4JRemoteRepository remoteRepository = Neo4jHierarchicalgraphFactory.eINSTANCE
        .createNeo4JRemoteRepository();
    remoteRepository.setBaseURI(baseUri);
    remoteRepository.setThreadPoolSize(20);
    remoteRepository.init();

    // create the root element
    final HGRootNode rootElement = HierarchicalgraphFactory.eINSTANCE.createHGRootNode();
    DefaultHGNodeSource rootNodeSource = HierarchicalgraphFactory.eINSTANCE.createDefaultHGNodeSource();
    rootNodeSource.setIdentifier(-1l);
    rootElement.setNodeSource(rootNodeSource);

    // create the node source creator function
    Function<Long, HGNodeSource> createNodeSourceFunction = (id) -> {

      // create the node source
      DefaultHGNodeSource nodeSource = HierarchicalgraphFactory.eINSTANCE.createDefaultHGNodeSource();
      nodeSource.setIdentifier(id);

      // add properties
      remoteRepository.getNodeProperties(id).entrySet().forEach((e) -> {
        nodeSource.getProperties().put(e.getKey(), e.getValue().getAsString());
      });

      // add labels
      nodeSource.getProperties().put("labels", remoteRepository.getNodeLabels(id).toString().replace("\"", ""));

      // return the result
      return nodeSource;
    };

    //
    Future<JsonObject> resultRoot = remoteRepository.executeCypherQuery(ROOT_MODULES);
    Future<JsonObject> resultDirectories = remoteRepository.executeCypherQuery(FLAT_DIRECTORIES);
    Future<JsonObject> resultFiles = remoteRepository.executeCypherQuery(FILES);
    Future<JsonObject> resultTypes = remoteRepository.executeCypherQuery(TYPES);
    Future<JsonObject> dependencies = remoteRepository.executeCypherQuery(DEPENDENCIES);

    createFirstLevelElements(resultRoot.get().getAsJsonArray("data"), rootElement, createNodeSourceFunction);
    createHierarchy(resultDirectories.get().getAsJsonArray("data"), rootElement, createNodeSourceFunction);
    createHierarchy(resultFiles.get().getAsJsonArray("data"), rootElement, createNodeSourceFunction);
    createHierarchy(resultTypes.get().getAsJsonArray("data"), rootElement, createNodeSourceFunction);
    createDependencies(dependencies.get().getAsJsonArray("data"), rootElement);

    //
    save(fileName, rootElement);

    //
    remoteRepository.dispose();
  }

  /**
   * <p>
   * </p>
   *
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    TestModelCreator.createTestModel(new File(System.getProperty("user.dir"), "test.hggraph").getAbsolutePath(), "http://localhost:7474");
  }
}
