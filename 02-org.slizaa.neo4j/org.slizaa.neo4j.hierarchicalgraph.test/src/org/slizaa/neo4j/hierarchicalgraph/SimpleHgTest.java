package org.slizaa.neo4j.hierarchicalgraph;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

import com.google.common.base.Stopwatch;

public class SimpleHgTest {

  /**
   * <p>
   * </p>
   * 
   * @throws ExecutionException
   * @throws InterruptedException
   */
  @Test
  public void createModel() throws InterruptedException, ExecutionException {

    //
	  Neo4JRemoteRepository remoteService = Neo4JRemoteRepository.createJQAssistantRemoteService("dummy",
        "http://localhost:7474", 20);

    //
    HGRootNode rootNode = Queries.convert(remoteService);

    //
    Stopwatch stopwatch = Stopwatch.createStarted();
    System.out.println("Outgoing dependencies " + rootNode.getOutgoingCoreDependencies(true).size());
    stopwatch.stop();
    System.out.println("Model created in " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

    // TreeIterator<HGNode> iterator = EcoreUtil.getAllContents(rootNode, false);
    // while (iterator.hasNext()) {
    // iterator.next().initializeCaches();
    // }
    //

    // List<HGNode> children = rootNode.getChildren();
    //
    // for (int i = 0; i < children.size(); i++) {
    // System.out.println(i);
    // rootNode.getChildren().get(i).getOutgoingCoreDependencies(true);
    // }
    //
    // for (int i = 0; i < children.size(); i++) {
    // System.out.println(i);
    // System.out.println(rootNode.getChildren().get(i).getOutgoingCoreDependencies(true).size());
    // }

    //
    // dumpMatrix(rootNode);

    // dumpModel(rootNode);
  }

  public void dumpMatrix(HGRootNode rootNode) {
    int[][] matrix = AdjacencyMatrix.computeAdjacencyMatrix(rootNode.getChildren());
    AdjacencyMatrix.printMatrix(matrix);
  }

  /**
   * <p>
   * </p>
   *
   * @param rootNode
   */
  private void dumpModel(HGRootNode rootNode) {

    // modules
    for (HGNode moduleNode : rootNode.getChildren()) {
      System.out.println(((Neo4JBackedNodeSource) moduleNode.getNodeSource()).getProperties().get("fileName"));

      // directories
      for (HGNode directoryNode : moduleNode.getChildren()) {
        System.out
            .println(" - " + ((Neo4JBackedNodeSource) directoryNode.getNodeSource()).getProperties().get("fileName"));

        for (HGNode fileNode : directoryNode.getChildren()) {
          System.out
              .println(" - " + ((Neo4JBackedNodeSource) fileNode.getNodeSource()).getProperties().get("fileName"));

          for (HGNode elementNode : fileNode.getChildren()) {
            Neo4JBackedNodeSource source = (Neo4JBackedNodeSource) elementNode.getNodeSource();
            if (source.getLabels().contains("Method")) {
              System.out.println(" - " + source.getProperties().get("signature"));
            } else if (source.getLabels().contains("Field")) {
              System.out.println(" - " + source.getProperties().get("signature"));
            } else {
              System.out.println(" - " + source.getLabels());
            }
          }
        }
      }
    }
  }
}
