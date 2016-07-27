package org.slizaa.neo4j.hierarchicalgraph;

import org.junit.Test;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jFactory;
import org.slizaa.neo4j.hierarchicalgraph.provider.GraphCreator;

import de.gerd.wuetherich.jqassistant.remote.JQAssistantRemoteService;
import de.gerd.wuetherich.jqassistant.remote.test.JQAssistantRemoteServiceFactory;
import de.gerdwuetherich.hierarchicalgraph.HGNode;
import de.gerdwuetherich.hierarchicalgraph.HGNodeSource;
import de.gerdwuetherich.hierarchicalgraph.HGRootNode;

public class CreateModelTest {

  @Test
  public void createModel() {

    //
    GraphCreator creator = new GraphCreator();

    //
    creator.createNodeIfAbsent(createNodeSource(5497), creator.getRootNode());
    creator.createNodeIfAbsent(createNodeSource(12), creator.getRootNode());
    creator.createNodeIfAbsent(createNodeSource(13), creator.getRootNode());

    creator.createNodeIfAbsent(createNodeSource(21), createNodeSource(5497));
    creator.createNodeIfAbsent(createNodeSource(22), createNodeSource(5497));
    creator.createNodeIfAbsent(createNodeSource(23), createNodeSource(5497));

    creator.createNodeIfAbsent(createNodeSource(31), createNodeSource(12));
    creator.createNodeIfAbsent(createNodeSource(32), createNodeSource(12));
    creator.createNodeIfAbsent(createNodeSource(33), createNodeSource(12));

    creator.createNodeIfAbsent(createNodeSource(41), createNodeSource(13));
    creator.createNodeIfAbsent(createNodeSource(42), createNodeSource(13));
    creator.createNodeIfAbsent(createNodeSource(43), createNodeSource(13));

    //
    HGRootNode rootNode = creator.getRootNode();

    Object repo = ((Neo4JBackedRootNodeSource) rootNode.getChildren().get(0).getRootNode().getNodeSource())
        .getRepository();
    System.out.println(repo);

    for (HGNode hgNode : rootNode.getChildren()) {
      Neo4JBackedNodeSource nodeSource = (Neo4JBackedNodeSource) hgNode.getNodeSource();
      System.out.println("--------------------------");
      for (String key : nodeSource.getProperties().keySet()) {
        System.out.println(key + ": " + nodeSource.getProperties().get(key));
      }
      System.out.println(nodeSource.getLabels());
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param id
   * @return
   */
  private HGNodeSource createNodeSource(long id) {
    HGNodeSource nodeSource = Neo4jFactory.eINSTANCE.createNeo4JBackedNodeSource();
    nodeSource.setIdentifier(id);
    return nodeSource;
  }
}
