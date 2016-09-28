package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewCoreDependency;

import java.util.List;
import java.util.concurrent.Future;

import org.junit.Before;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.simple.AbstractSimpleModelTest;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractResolverTest extends AbstractSimpleModelTest
    implements IAggregatedCoreDependencyResolver {

  /** - */
  private HGCoreDependency _newDependency_1;

  /** - */
  private HGCoreDependency _newDependency_2;

  @Before
  @Override
  public void before() {
    super.before();

    //
    model().root().registerExtension(IAggregatedCoreDependencyResolver.class, this);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HGCoreDependency getNewDependency_1() {
    return _newDependency_1;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HGCoreDependency getNewDependency_2() {
    return _newDependency_2;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Future<?>> resolveAggregatedDependency(HGAggregatedCoreDependency dependencyToResolve) {

    _newDependency_1 = createNewCoreDependency(dependencyToResolve.getFrom(), dependencyToResolve.getTo(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultDependencySource(), false);

    _newDependency_2 = createNewCoreDependency(dependencyToResolve.getFrom(), dependencyToResolve.getTo(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultDependencySource(), false);

    dependencyToResolve.getResolvedCoreDependencies().add(_newDependency_1);
    dependencyToResolve.getResolvedCoreDependencies().add(_newDependency_2);

    // return null as we resolved the dependencies immediately
    return null;
  }

  /**
   * <p>
   * </p>
   *
   * @param runnable
   */
  protected void resolve(Runnable runnable) {

    //
    assertDependenciesBeforeResolve();

    //
    runnable.run();
    
    //
    assertDependenciesAfterResolve();
  }

  /**
   * <p>
   * </p>
   */
  private void assertDependenciesBeforeResolve() {

    //
    HGAggregatedDependency aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
    assertThat(aggregatedDependency).isNotNull();
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).isNotNull();
    assertThat(aggregatedDependency.getCoreDependencies()).hasSize(4).contains(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());

    //
    List<HGCoreDependency> outgoingDependencies = model().a1().getAccumulatedOutgoingCoreDependencies();
    assertThat(outgoingDependencies).hasSize(4).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), model().a3_b3_core1());

    //
    List<HGCoreDependency> incomingDependencies = model().b1().getAccumulatedIncomingCoreDependencies();
    assertThat(incomingDependencies).hasSize(4).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), model().a3_b3_core1());
  }

  /**
   * <p>
   * </p>
   */
  private void assertDependenciesAfterResolve() {

    // we have to re-read the aggregated dependency
    List<HGCoreDependency> incomingDeps = model().b1().getAccumulatedIncomingCoreDependencies();
    assertThat(incomingDeps).isNotNull();
    assertThat(incomingDeps).hasSize(5);
    assertThat(incomingDeps).contains(model().a1_b1_core1(), model().a1_b1_core2(), model().a2_b2_core1(),
        getNewDependency_1(), getNewDependency_2());

    List<HGCoreDependency> outgoingDeps = model().a1().getAccumulatedOutgoingCoreDependencies();
    assertThat(outgoingDeps).isNotNull();
    assertThat(outgoingDeps).hasSize(5);
    assertThat(outgoingDeps).contains(model().a1_b1_core1(), model().a1_b1_core2(), model().a2_b2_core1(),
        getNewDependency_1(), getNewDependency_2());

    //
    HGAggregatedDependency aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).isNotNull();
    assertThat(aggregatedDependency.getCoreDependencies()).hasSize(5).contains(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), getNewDependency_1(), getNewDependency_2());
  }
}