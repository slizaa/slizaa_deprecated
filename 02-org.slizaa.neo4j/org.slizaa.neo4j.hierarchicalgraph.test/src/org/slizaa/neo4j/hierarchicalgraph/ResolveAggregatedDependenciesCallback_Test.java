package org.slizaa.neo4j.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.slizaa.neo4j.testfwk.testmodel.TestModelFactory.createGraphFromDefaultMapping;

import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ResolveAggregatedDependenciesCallback_Test extends AbstractRemoteRepositoryTest {

  /** - */
  private HGRootNode                    _rootNode;

  /** - */
  private IAggregatedCoreDependencyResolver _aggregatedDependencyResolver;

  /**
   * {@inheritDoc}
   */
  @Before
  public void init() throws Exception {
    super.init();

    //
    _rootNode = createGraphFromDefaultMapping(getNeo4JRemoteRepository());

    //
    _aggregatedDependencyResolver = mock(IAggregatedCoreDependencyResolver.class);

    //
    _rootNode.setAggregatedCoreDependencyResolver(_aggregatedDependencyResolver);
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testResolveAggregatedCoreDependencies() {

    //
    HGNode pkg_omaiconversion = _rootNode.lookupNode(new Long(611));
    HGNode pkg_omaimodelcommon = _rootNode.lookupNode(new Long(1634));

    //
    HGAggregatedDependency hgDependency = pkg_omaiconversion.getOutgoingDependenciesTo(pkg_omaimodelcommon);
    assertThat(hgDependency).isNotNull();
    assertThat(hgDependency.getAggregatedWeight()).isEqualTo(59);
    assertThat(hgDependency.getCoreDependencies().size()).isEqualTo(59);

    // resolve the dependency
    hgDependency.resolveAggregatedCoreDependencies();

    //
    for (HGCoreDependency dependency : hgDependency.getCoreDependencies()) {
      verify(_aggregatedDependencyResolver).createNewAggregatedDependencyResolver(dependency);
    }

    //
    assertThat(hgDependency.getAggregatedWeight()).isEqualTo(59);
    assertThat(hgDependency.getCoreDependencies().size()).isEqualTo(59);
  }
}
