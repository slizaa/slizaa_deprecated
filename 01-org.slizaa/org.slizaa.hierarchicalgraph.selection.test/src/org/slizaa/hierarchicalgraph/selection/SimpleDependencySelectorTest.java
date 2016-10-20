package org.slizaa.hierarchicalgraph.selection;

import static org.assertj.core.api.Assertions.assertThat;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.selection.selector.DefaultDependencySelector;
import org.slizaa.hierarchicalgraph.selection.testfwk.AbstractResolverTest;

public class SimpleDependencySelectorTest extends AbstractResolverTest {

  /** - */
  private DefaultDependencySelector _dependencySelector;

  /** - */
  private HGAggregatedDependency    _aggregatedDependency;

  @Before
  public void before() {
    super.before();

    // ap.internal.model -> ap.internal.util
    _aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
    assertThat(_aggregatedDependency).isNotNull();
    assertThat(_aggregatedDependency.getAggregatedWeight()).isEqualTo(4);

    //
    _dependencySelector = new DefaultDependencySelector();
    _dependencySelector.setDependencies(_aggregatedDependency.getCoreDependencies());
  }

  @Test
  public void testGetUnfilteredCoreDependencies() {

    assertThat(_dependencySelector.getUnfilteredCoreDependencies()).hasSize(4);

    _aggregatedDependency.resolveAggregatedCoreDependencies();

    assertThat(_dependencySelector.getUnfilteredCoreDependencies()).hasSize(5);
  }

  @Test
  public void testNotification() {
    
    //
    _dependencySelector.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent evt) {
        assertThat(_dependencySelector.getUnfilteredCoreDependencies()).hasSize(5);
      }
    });

    //
    assertThat(_dependencySelector.getUnfilteredCoreDependencies()).hasSize(4);
    
    //
    _aggregatedDependency.resolveAggregatedCoreDependencies();
  }
}
