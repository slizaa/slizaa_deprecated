package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mock;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.xref.IXRefListener;

public class XRefStack_6_Test extends AbstractXRefStack_Test {

  @Mock
  private IXRefListener _listener;

  @Test
  public void test() {

    //
    xRefStack().pruneDependenciesForUncroppedCenterNodes(rootNode().getAccumulatedIncomingCoreDependencies(),
        rootNode().getAccumulatedOutgoingCoreDependencies());

    //
    assertThat(xRefStack().getSelectedDependencies()).isEmpty();

    //
    xRefStack().setSelectedCenterNodes(node(1063));
    
    //
    assertThat(xRefStack().getSelectedDependencies()).isEmpty();

    //
    long[] ids = new long[] { 8329, 2869, 14746, 13683, 9618, 8222 };
    int[] sizes = new int[] { 9, 2, 7, 6, 6, 1 };

    xRefStack().addXRefListener(_listener);

    for (int i = 0; i < sizes.length; i++) {
      xRefStack().setSelectedLeftsidedNodes(node(ids[i]));
      assertThat(xRefStack().getSelectedDependencies()).hasSize(sizes[i]);
    }

    verify(_listener, times(6)).leftsidedNodeSelectionChanged();
  }
}
