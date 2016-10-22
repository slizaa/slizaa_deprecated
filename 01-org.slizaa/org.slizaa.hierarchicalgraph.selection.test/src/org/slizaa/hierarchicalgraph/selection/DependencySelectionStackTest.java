package org.slizaa.hierarchicalgraph.selection;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.selection.selector.DefaultDependencySelector;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencySelectionStackTest extends AbstractSimpleModelTest {

  /** - */
  private HGAggregatedDependency _aggregatedDependency;

  @Before
  public void before() {
    super.before();

    // ap.internal.model -> ap.internal.util
    _aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
    assertThat(_aggregatedDependency).isNotNull();
    assertThat(_aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(_aggregatedDependency.getCoreDependencies()).isNotNull();
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testInitial() {

    //
    DependencySelectionStack selectionStack = SelectionFactory.eINSTANCE.createDependencySelectionStack();

    //
    assertThat(selectionStack.canGoBack()).isFalse();
    assertThat(selectionStack.canGoForward()).isFalse();
    assertThat(selectionStack.getCurrentSelection()).isEmpty();
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testSetDependencies() {

    //
    DependencySelectionStack selectionStack = SelectionFactory.eINSTANCE.createDependencySelectionStack();
    assertThat(selectionStack).isNotNull();
    
    //
    selectionStack.setSelection(_aggregatedDependency.getCoreDependencies());

    //
    assertThat(selectionStack.canGoBack()).isFalse();
    assertThat(selectionStack.canGoForward()).isFalse();
    assertThat(selectionStack.getCurrentSelection()).isEqualTo(_aggregatedDependency.getCoreDependencies());
  }
}
