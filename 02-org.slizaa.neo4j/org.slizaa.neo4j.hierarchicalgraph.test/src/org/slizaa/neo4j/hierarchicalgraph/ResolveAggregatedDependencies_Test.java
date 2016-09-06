package org.slizaa.neo4j.hierarchicalgraph;

import static org.slizaa.neo4j.testfwk.testmodel.TestModelFactory.createGraphFromDefaultMapping;

import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ResolveAggregatedDependencies_Test extends AbstractRemoteRepositoryTest {

  /** - */
  private HGRootNode _rootNode;

  @Before
  public void init() throws Exception {
    super.init();

    //
    _rootNode = createGraphFromDefaultMapping(getNeo4JRemoteRepository());
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testGetProperties() {
    System.out.println(_rootNode.getNode(new Long(1)));
    throw new RuntimeException("BUMM!");
  }
}
