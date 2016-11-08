package org.slizaa.neo4j.hierarchicalgraph.performance;

import java.util.concurrent.TimeUnit;

import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.testfwk.TestModelFactory;

import com.google.common.base.Stopwatch;

public class Main {

  public static void main(String[] args) throws Exception {

    //
    Neo4jRestClient restClient = TestModelFactory.createNeo4JRemoteRepository("http://localhost:7474");

    //
    System.out.println("Start");

    //
    Stopwatch stopwatch = Stopwatch.createStarted();

    //
    HGRootNode rootNode = TestModelFactory.createGraphFromDefaultMapping(restClient);

    //
    System.out.println("Create graph from default mapping: " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
    stopwatch.reset().start();

    //
    rootNode.getChildren().forEach((node) -> {
      node.getIncomingDependenciesFrom(rootNode.getChildren());
    });

    //
    System.out.println("Get incoming dependencies matrix: " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
    stopwatch.reset().start();

    rootNode.invalidateAllCaches();

    System.out.println("Invalidate caches: " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
    stopwatch.reset().start();

    //
    rootNode.getChildren().forEach((node) -> {
      node.getIncomingDependenciesFrom(rootNode.getChildren());
    });

    //
    System.out.println("Get incoming dependencies matrix: " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
    stopwatch.stop();

    //
    restClient.dispose();
  }
}
