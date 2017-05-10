package org.slizaa.ui.dependencytree.internal;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;

/**
 * <p>
 * </p>
 */
public class DependencyTreePartTest extends AbstractDependencyTreePartTest {

  /**
   * <p>
   * </p>
   * 
   * @throws InterruptedException
   */
  @Test
  public void test() throws InterruptedException {

    //
    DependencySelection dependencySelection = SelectionFactory.eINSTANCE.createDependencySelection();
    dependencySelection.getDependencies()
        .addAll(rootNode().getChildren().get(5).getAccumulatedOutgoingCoreDependencies());

    //
    part().handleMainDependencySelectionChanged(null, dependencySelection);

    // TODO

    //
    displaySleep();
  }
}