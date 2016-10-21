package org.slizaa.hierarchicalgraph.selection;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencySelectionStackTest extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testDependencyStack() {

    //
    DependencySelectionStack selectionStack = SelectionFactory.eINSTANCE.createDependencySelectionStack();

    //
    assertThat(selectionStack.canGoBack()).isFalse();
    assertThat(selectionStack.canGoForward()).isFalse();
  }
}
