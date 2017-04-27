package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.mockito.Mockito.verify;

import java.util.Collections;

import org.junit.Test;
import org.mockito.Mock;
import org.slizaa.hierarchicalgraph.selection.xref.IXRefListener;

public class XRefStack_SetSelctedNodes_Test extends AbstractXRefStack_Test {

  @Mock
  private IXRefListener _listener;

  @Test
  public void test() {

    //
    xRefStack().addXRefListener(_listener);

    //
    xRefStack().pruneDependenciesForUncroppedCenterNodes(Collections.singletonList(rootNode()),
        rootNode().getAccumulatedIncomingCoreDependencies(), rootNode().getAccumulatedOutgoingCoreDependencies());

    verify(_listener).coreDependenciesChanged();

    // select "/WEB-INF/lib/archaius-core-0.7.3.jar (54411)"
    xRefStack().setSelectedCenterNodes(node(54411));

    verify(_listener).centerNodeSelectionChanged();

    xRefStack().cropSelection();

    verify(_listener).croppedSelectionChanged();

    xRefStack().setSelectedLeftsidedNodes(node(54411));

    verify(_listener).leftsidedNodeSelectionChanged();
  }
}
