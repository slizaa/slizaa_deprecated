package org.slizaa.neo4j.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.spi.IProxyDependencyResolver;
import org.slizaa.neo4j.testfwk.AbstractRemoteRepositoryTest;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ResolveAggregatedDependenciesResolver_Test extends AbstractRemoteRepositoryTest {

  /** - */
  private HGRootNode               _rootNode;

  /** - */
  private IProxyDependencyResolver _aggregatedDependencyResolver;

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
    _rootNode.registerExtension(IProxyDependencyResolver.class, _aggregatedDependencyResolver);
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testResolveProxyDependencies() {

    //
    HGNode pkg_omaiconversion = _rootNode.lookupNode(new Long(611));
    HGNode pkg_omaimodelcommon = _rootNode.lookupNode(new Long(1634));

    //
    HGAggregatedDependency hgDependency = pkg_omaiconversion.getOutgoingDependenciesTo(pkg_omaimodelcommon);
    assertThat(hgDependency).isNotNull();
    assertThat(hgDependency.getAggregatedWeight()).isEqualTo(59);
    assertThat(hgDependency.getCoreDependencies().size()).isEqualTo(59);

    // resolve the dependency
    hgDependency.resolveProxyDependencies();

    //
    assertThat(hgDependency.getAggregatedWeight()).isEqualTo(59);
    assertThat(hgDependency.getCoreDependencies().size()).isEqualTo(59);
  }
}
