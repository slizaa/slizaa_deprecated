package org.slizaa.neo4j.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewNode;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewRootNode;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedNeo4JBackedNodeSource_Test extends AbstractRemoteRepositoryTest {

  /** - */
  private HGRootNode _rootNode;

  /** - */
  private HGNode     _node;

  @Before
  public void init() throws Exception {
    super.init();

    //
    _rootNode = createNewRootNode(() -> {

      // create the
      Neo4JBackedRootNodeSource result = Neo4jHierarchicalgraphFactory.eINSTANCE.createNeo4JBackedRootNodeSource();

      // set the repository
      result.setRepository(getNeo4JRemoteRepository());

      // return the result
      return result;
    });

    //
    _node = createNewNode(_rootNode, _rootNode, () -> {

      // create the
      Neo4JBackedNodeSource nodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE.createNeo4JBackedNodeSource();

      // set the repository
      nodeSource.setIdentifier(7282l);

      // return the result
      return nodeSource;
    });
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testGetProperties() {

    //
    EMap<String, String> properties = ((Neo4JBackedNodeSource) _node.getNodeSource()).getProperties();

    assertThat(properties).isNotNull();
    assertThat(properties).hasSize(4);
    assertThat(properties.get("visibility")).isEqualTo("public");
    assertThat(properties.get("signature")).isEqualTo("void closeTemplateSource(java.lang.Object)");
    assertThat(properties.get("name")).isEqualTo("closeTemplateSource");
    assertThat(properties.get("cyclomaticComplexity")).isEqualTo("1");
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testGetLabels() {

    //
    EList<String> labels = ((Neo4JBackedNodeSource) _node.getNodeSource()).getLabels();

    assertThat(labels).isNotNull();
    assertThat(labels).hasSize(3);
    assertThat(labels).contains("Java", "Member", "Method");
  }
}
