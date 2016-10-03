package org.slizaa.neo4j.hierarchicalgraph.mapping.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.slizaa.neo4j.testfwk.DependencyUtils.asStringList;
import static org.slizaa.neo4j.testfwk.DependencyUtils.outDeps;

import java.io.IOException;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

public class ResolveAggregatedCoreDependencies_15052 extends AbstractMappingServiceTest {

  @Test
  public void test() throws IOException {

    //
    HGRootNode rootNode = mappingService().convert(mappingDescriptor(), getNeo4JRemoteRepository(), null);
    assertThat(rootNode).isNotNull();

    //
    HGNode hgNode = rootNode.lookupNode(new Long(15052));
    assertThat(hgNode).isNotNull();
    assertThat(hgNode.getOutgoingCoreDependencies()).hasSize(5);
    assertThat(hgNode.getAccumulatedOutgoingCoreDependencies()).hasSize(5);
    assertThat(hgNode.getChildren()).hasSize(2);
    for (HGNode child : hgNode.getChildren()) {
      assertThat(child.getOutgoingCoreDependencies()).hasSize(0);
    }

    // @formatter:off
    assertThat(outDeps(hgNode)).containsOnly(
      "(15052)-[DEPENDS_ON]->(15015)", 
      "(15052)-[DEPENDS_ON]->(6312)", 
      "(15052)-[DEPENDS_ON]->(6319)",
      "(15052)-[DEPENDS_ON]->(6333)", 
      "(15052)-[DEPENDS_ON]->(9540)");
    // @formatter:on

    hgNode.resolveOutgoingAggregatedCoreDependencies();

    // @formatter:off
    assertThat(hgNode.getChildren()).hasSize(2);
    
    assertThat(outDeps(hgNode)).containsOnly(
      "(15052)-[DEPENDS_ON]->(6333)", 
      "(15052)-[DEPENDS_ON]->(9540)",
      "(15052)-[IMPLEMENTS]->(15015)");

    assertThat(outDeps(hgNode.getChildren().get(0))).containsOnly(
        "(15054)-[INVOKES]->(6335)", 
        "(15054)-[RETURNS]->(6319)");

    assertThat(outDeps(hgNode.getChildren().get(1))).isEmpty();
    
    assertThat(asStringList(hgNode.getAccumulatedOutgoingCoreDependencies())).containsOnly(
        "(15054)-[INVOKES]->(6335)", 
        "(15054)-[RETURNS]->(6319)",
        "(15052)-[DEPENDS_ON]->(6333)", 
        "(15052)-[DEPENDS_ON]->(9540)",
        "(15052)-[IMPLEMENTS]->(15015)");
    // @formatter:on
  }
}
