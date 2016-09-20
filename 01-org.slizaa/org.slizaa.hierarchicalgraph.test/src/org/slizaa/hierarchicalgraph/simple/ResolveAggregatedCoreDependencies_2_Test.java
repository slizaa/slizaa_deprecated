package org.slizaa.hierarchicalgraph.simple;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ResolveAggregatedCoreDependencies_2_Test extends AbstractSimpleModelTest
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
   */
  @Test
  @Ignore
  public void testResolveAggregatedCoreDependencies_AggregatedDependency() {

    //
    HGAggregatedDependency aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
    assertThat(aggregatedDependency).isNotNull();

    //
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).isNotNull();
    assertThat(aggregatedDependency.getCoreDependencies()).hasSize(4).contains(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());

    //
    aggregatedDependency.resolveAggregatedCoreDependencies();

    //
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).isNotNull();
    assertThat(aggregatedDependency.getCoreDependencies()).hasSize(5).contains(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), _newDependency_1, _newDependency_2);
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testResolveAggregatedCoreDependencies_CoreDependency() {

    //
    List<HGCoreDependency> outgoingDependencies = model().a1().getAccumulatedOutgoingCoreDependencies();
    assertThat(outgoingDependencies).hasSize(4).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), model().a3_b3_core1());

    //
    for (HGCoreDependency outgoingDependency : new ArrayList<>(outgoingDependencies)) {
      if (outgoingDependency instanceof HGAggregatedCoreDependency) {
        ((HGAggregatedCoreDependency) outgoingDependency).resolveAggregatedCoreDependencies();
      }
    }

    // we have to re-read the aggregated dependency
    outgoingDependencies = model().a1().getAccumulatedOutgoingCoreDependencies();
    assertThat(outgoingDependencies).hasSize(5).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), _newDependency_1, _newDependency_2);
  }

  @Test
  public void testResolveOutgoingAggregatedCoreDependencies() {

    //
    List<HGCoreDependency> outgoingDependencies = model().a1().getAccumulatedOutgoingCoreDependencies();
    assertThat(outgoingDependencies).hasSize(4).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), model().a3_b3_core1());

    //
    model().a1().resolveOutgoingAggregatedCoreDependencies(true);

    // we have to re-read the aggregated dependency
    outgoingDependencies = model().a1().getAccumulatedOutgoingCoreDependencies();
    assertThat(outgoingDependencies).hasSize(5).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), _newDependency_1, _newDependency_2);
  }

  @Test
  public void resolveIncomingAggregatedCoreDependencies() {

    //
    List<HGCoreDependency> incomingDependencies = model().b1().getAccumulatedIncomingCoreDependencies();
    assertThat(incomingDependencies).hasSize(4).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), model().a3_b3_core1());

    //
    model().b1().resolveIncomingAggregatedCoreDependencies(true);

    // we have to re-read the aggregated dependency
    incomingDependencies = model().b1().getAccumulatedIncomingCoreDependencies();
    assertThat(incomingDependencies).hasSize(5).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), _newDependency_1, _newDependency_2);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> resolveAggregatedDependency(HGAggregatedCoreDependency dependencyToResolve) {

    _newDependency_1 = createNewCoreDependency(dependencyToResolve.getFrom(), dependencyToResolve.getTo(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultDependencySource(), false);

    _newDependency_2 = createNewCoreDependency(dependencyToResolve.getFrom(), dependencyToResolve.getTo(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultDependencySource(), false);

    dependencyToResolve.getResolvedCoreDependencies().add(_newDependency_1);
    dependencyToResolve.getResolvedCoreDependencies().add(_newDependency_2);

    removeDependency(dependencyToResolve, false);

    dependencyToResolve.getRootNode()
        .invalidateCaches(new BasicEList<HGNode>(asList(dependencyToResolve.getFrom(), dependencyToResolve.getTo())));

    // return null as we resolved the dependencies immediately
    return null;
  }
}
