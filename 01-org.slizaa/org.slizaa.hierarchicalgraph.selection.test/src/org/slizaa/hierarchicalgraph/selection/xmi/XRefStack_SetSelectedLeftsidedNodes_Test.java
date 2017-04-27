package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Collections;

import org.junit.Test;
import org.mockito.Mock;
import org.slizaa.hierarchicalgraph.selection.xref.IXRefListener;

public class XRefStack_SetSelectedLeftsidedNodes_Test extends AbstractXRefStack_Test {

  @Mock
  private IXRefListener _listener;

  @Test
  public void test() {

    //
    xRefStack().pruneDependenciesForUncroppedCenterNodes(Collections.singletonList(rootNode()), rootNode().getAccumulatedIncomingCoreDependencies(),
        rootNode().getAccumulatedOutgoingCoreDependencies());

    //
    assertThat(xRefStack().getSelectedDependencies()).isEmpty();

    // select "/WEB-INF/lib/archaius-core-0.7.3.jar (54411)"
    xRefStack().setSelectedCenterNodes(node(54411));
    
    //
    assertThat(xRefStack().getSelectedDependencies()).isEmpty();

    //
    long[] ids = new long[] { 6303, 44027, 54411, 23};
    int[] sizes = new int[] { 12, 9, 257, 22};

    xRefStack().addXRefListener(_listener);

    for (int i = 0; i < sizes.length; i++) {
      xRefStack().setSelectedLeftsidedNodes(node(ids[i]));
      assertThat(xRefStack().getSelectedDependencies()).hasSize(sizes[i]);
    }

    verify(_listener, times(4)).leftsidedNodeSelectionChanged();
  }
}
