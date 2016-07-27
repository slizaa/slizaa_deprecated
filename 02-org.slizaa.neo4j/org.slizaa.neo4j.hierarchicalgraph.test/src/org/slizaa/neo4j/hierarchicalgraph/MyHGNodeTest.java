package org.slizaa.neo4j.hierarchicalgraph;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;

import com.google.common.base.Stopwatch;

public class MyHGNodeTest {

  @Test
  public void testMeinModel() {

    List<HGNode> nodes = new LinkedList<>();

    HGRootNode rootNode = HierarchicalgraphFactory.eINSTANCE.createHGRootNode();
    HGNodeSource rootNodeSource = Neo4jFactory.eINSTANCE.createNeo4JBackedNodeSource();
    rootNodeSource.setIdentifier("ROOT_NODE");
    rootNode.setNodeSource(rootNodeSource);
    nodes.add(rootNode);

    for (int i = 0; i < 1000; i++) {

      //
      HGNode node = HierarchicalgraphFactory.eINSTANCE.createHGNode();

      HGNodeSource nodeSource = Neo4jFactory.eINSTANCE.createNeo4JBackedNodeSource();
      nodeSource.setIdentifier(i);
      node.setNodeSource(nodeSource);
      rootNode.getIdToNodeMap().put(node.getIdentifier(), node);

      //
      if (!nodes.isEmpty()) {
        HGNode parent = nodes.get(nodes.size() - 1);
        node.setParent(parent);
      }

      //
      nodes.add(node);
    }

    //
    // for (int i = 0; i < 500; i++) {
    // MyExtensionNodeSource myExtensionNodeSource = (MyExtensionNodeSource) rootNode.getIdToNodeMap().get(i * 100)
    // .getValue().getNodeSource();
    // System.out.println(myExtensionNodeSource.getHurzilein());
    // }

    // System.out.println(nodes.size());
    for (HGNode hgNode : nodes) {
      
      System.out.println("------------------------");
      System.out.println(hgNode);
      System.out.println(hgNode.getNodeSource());
      System.out.println(hgNode.getNodeSource().getNode());
      System.out.println(hgNode.getRootNode());
      System.out.println(hgNode.getRootNode().getNodeSource());
      
      // System.out.println(((Neo4JBackedNodeSource) hgNode.getNodeSource()).getProperties().keySet());
    }
  }

  public void requestPropertiesAndLabels() {

    // http://localhost:7474/db/data/node/172/properties
    // http://localhost:7474/db/data/node/44/labels
    // http://localhost:7474/db/data/relationship/465/properties
    JQAssistantRemoteService remoteService = JQAssistantRemoteServiceFactory.createJQAssistantRemoteService("dummy",
        "http://localhost:7474", 20);

    Stopwatch stopwatch = Stopwatch.createStarted();

    //
    try {
      for (int i = 0; i < 1000; i++) {
        //
        remoteService.getNodeProperties(i);
        remoteService.getNodeLabels(i);
        // System.out.println();
        // System.out.println();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    stopwatch.stop();
    System.out.println("Time: " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
  }
}
