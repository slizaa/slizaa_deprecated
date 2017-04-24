package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mock;
import org.slizaa.hierarchicalgraph.selection.xref.IXRefListener;

public class XRefStack_5_Test extends AbstractXRefStack_Test {

  @Mock
  private IXRefListener _listener;

  @SuppressWarnings("unchecked")
  @Test
  public void test() {

    //
    xRefStack().addXRefListener(_listener);

    //
    xRefStack().setInitialDependencies(rootNode().getAccumulatedIncomingCoreDependencies(),
        rootNode().getAccumulatedOutgoingCoreDependencies());

    verify(_listener).coreDependenciesChanged();

    xRefStack().setSelectedCenterNodes(node(1063));

    verify(_listener).centerNodeSelectionChanged();

    xRefStack().cropSelection();

    verify(_listener).croppedSelectionChanged();
    
    xRefStack().setSelectedLeftsidedNodes(node(603));

    verify(_listener).leftsidedNodeSelectionChanged();
  }
}
