package org.slizaa.neo4j.hierarchicalgraph.ui;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.spi.INodeComparator;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class TEMPORARY_NodeComparator implements INodeComparator {

  /**
   * {@inheritDoc}
   */
  @Override
  public int category(Object element) {

    //
    if (element instanceof HGNode) {
      HGNode hgNode = (HGNode) element;
      Neo4JBackedNodeSource nodeSource = (Neo4JBackedNodeSource) hgNode.getNodeSource();

      if (nodeSource.getLabels().contains("Field")) {
        return 1;
      } else if (nodeSource.getLabels().contains("Method")) {
        return 2;
      } else if (nodeSource.getLabels().contains("Directory")) {
        return 1;
      } else if (nodeSource.getLabels().contains("Package")) {
        return 2;
      } else if (nodeSource.getLabels().contains("File")) {
        return 3;
      } else if (nodeSource.getLabels().contains("Type")) {
        return 4;
      }
    }

    //
    return 1;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int compare(Object e1, Object e2) {

    //
    if (!(e1 instanceof HGNode && e2 instanceof HGNode)) {
      return 0;
    }

    //
    Neo4JBackedNodeSource nodeSource1 = (Neo4JBackedNodeSource) ((HGNode) e1).getNodeSource();
    Neo4JBackedNodeSource nodeSource2 = (Neo4JBackedNodeSource) ((HGNode) e2).getNodeSource();

    //
    if ((nodeSource1.getLabels().contains("Field") && nodeSource2.getLabels().contains("Field"))
        || (nodeSource1.getLabels().contains("Method") && nodeSource2.getLabels().contains("Method"))
        || (nodeSource1.getLabels().contains("Type") && nodeSource2.getLabels().contains("Type"))) {

      return nodeSource1.getProperties().get("name").compareTo(nodeSource2.getProperties().get("name"));
    }
    //
    else if (((nodeSource1.getLabels().contains("Directory") && nodeSource2.getLabels().contains("Directory"))
        || (nodeSource1.getLabels().contains("Artifact") && nodeSource2.getLabels().contains("Artifact")))
        && nodeSource1.getProperties().containsKey("fileName") && nodeSource2.getProperties().containsKey("fileName")) {
      return nodeSource1.getProperties().get("fileName").compareTo(nodeSource2.getProperties().get("fileName"));
    }

    //
    return -1;
  }
}
