package org.slizaa.neo4j.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.slizaa.neo4j.testfwk.testmodel.TestModelFactory.createGraphFromDefaultMapping;

import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ResolveAggregatedDependenciesResolver_Test extends AbstractRemoteRepositoryTest {

  /** - */
  private HGRootNode                    _rootNode;

  /** - */
  private IAggregatedDependencyResolver _aggregatedDependencyResolver;

  /**
   * {@inheritDoc}
   */
  @Before
  public void init() throws Exception {
    super.init();

    //
    _rootNode = createGraphFromDefaultMapping(getNeo4JRemoteRepository());

    //
    _aggregatedDependencyResolver = null;

    //
    Neo4JBackedRootNodeSource rootNodeSource = (Neo4JBackedRootNodeSource) _rootNode.getNodeSource();
    rootNodeSource.setAggregatedDependencyResolver(_aggregatedDependencyResolver);
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testResolveAggregatedCoreDependencies() {

    //
    HGNode pkg_omaiconversion = _rootNode.getNode(new Long(611));
    HGNode pkg_omaimodelcommon = _rootNode.getNode(new Long(1634));

    //
    HGDependency hgDependency = pkg_omaiconversion.getOutgoingDependenciesTo(pkg_omaimodelcommon);
    assertThat(hgDependency).isNotNull();
    assertThat(hgDependency.getWeight()).isEqualTo(59);
    assertThat(hgDependency.getCoreDependencies().size()).isEqualTo(59);

    // resolve the dependency
    hgDependency.resolveAggregatedCoreDependencies();
    
   //
    assertThat(hgDependency.getWeight()).isEqualTo(59);
    assertThat(hgDependency.getCoreDependencies().size()).isEqualTo(59);
  }
}
