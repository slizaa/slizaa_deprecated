package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mock;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelectorListener;
import org.slizaa.hierarchicalgraph.selection.selector.SelectedNodesChangedEvent;

public class DependencySelector_5_Test extends AbstractDependencySelector_Test {

  @Mock
  private IDependencySelectorListener _listener;
  
  @Test
  public void testWithTargetSelection() {

    //
    dependencySelector().addDependencySelectorListener(_listener);
    
    //
    assertThat(dependencySelector().getUnfilteredCoreDependencies()).hasSize(50);
    assertThat(dependencySelector().getUnfilteredSourceNodes()).hasSize(22);
    assertThat(dependencySelector().getUnfilteredTargetNodes()).hasSize(6);
    
    //
    dependencySelector().setSelectedTargetNodes(node(1383));

    //
    verify(_listener).selectedNodesChanged(any(SelectedNodesChangedEvent.class));
    
    //
    assertThat(dependencySelector().getFilteredCoreDependencies()).hasSize(7);
    assertThat(dependencySelector().getFilteredSourceNodes()).hasSize(7);
    assertThat(dependencySelector().getFilteredTargetNodes()).hasSize(6);
    
    //
    dependencySelector().unselectNodes();
    
    //
    verify(_listener, times(2)).selectedNodesChanged(any(SelectedNodesChangedEvent.class));
    
    //
    assertThat(dependencySelector().getUnfilteredCoreDependencies()).hasSize(50);
    assertThat(dependencySelector().getUnfilteredSourceNodes()).hasSize(22);
    assertThat(dependencySelector().getUnfilteredTargetNodes()).hasSize(6);
  }
  
  
}
