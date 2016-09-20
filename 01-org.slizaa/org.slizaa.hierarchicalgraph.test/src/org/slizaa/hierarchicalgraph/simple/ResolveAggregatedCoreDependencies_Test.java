package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ResolveAggregatedCoreDependencies_Test extends AbstractSimpleModelTest {

  /** - */
  private IAggregatedCoreDependencyResolver _resolver;

  /** - */
  private HGAggregatedDependency            _aggregatedDependency;

  /**
   * {@inheritDoc}
   */
  @Override
  public void before() {
    super.before();

    //
    _resolver = mock(IAggregatedCoreDependencyResolver.class);
    model().root().registerExtension(IAggregatedCoreDependencyResolver.class, _resolver);

    // get the aggregated dependency
    _aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
    assertThat(_aggregatedDependency).isNotNull();
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testResolveAggregatedCoreDependencies() {

    //
    _aggregatedDependency.resolveAggregatedCoreDependencies();

    //
    verify(_resolver).resolveAggregatedDependency(model().a3_b3_core1());
    verifyNoMoreInteractions(_resolver);

    //
    reset(_resolver);

    // don't call 'createNewAggregatedDependencyResolver' again
    _aggregatedDependency.resolveAggregatedCoreDependencies();

    //
    verify(_resolver, never()).resolveAggregatedDependency(any());
  }
}
