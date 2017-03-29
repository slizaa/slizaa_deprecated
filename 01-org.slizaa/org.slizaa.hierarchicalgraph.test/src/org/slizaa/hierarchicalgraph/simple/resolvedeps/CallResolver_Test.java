package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.simple.AbstractSimpleModelTest;
import org.slizaa.hierarchicalgraph.spi.IProxyDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class CallResolver_Test extends AbstractSimpleModelTest {

  /** - */
  private IProxyDependencyResolver _resolver;

  /** - */
  private HGAggregatedDependency            _aggregatedDependency;

  /**
   * {@inheritDoc}
   */
  @Override
  public void before() {
    super.before();

    //
    _resolver = mock(IProxyDependencyResolver.class);
    model().root().registerExtension(IProxyDependencyResolver.class, _resolver);

    // get the aggregated dependency
    _aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
    assertThat(_aggregatedDependency).isNotNull();
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testResolveProxyDependencies() {

    //
    _aggregatedDependency.resolveProxyDependencies();

    //
    verify(_resolver).resolveProxyDependency(model().a3_b3_core1());
    verifyNoMoreInteractions(_resolver);

    //
    reset(_resolver);

    // don't call 'createNewAggregatedDependencyResolver' again
    _aggregatedDependency.resolveProxyDependencies();

    //
    verify(_resolver, never()).resolveProxyDependency(any());
  }
}
