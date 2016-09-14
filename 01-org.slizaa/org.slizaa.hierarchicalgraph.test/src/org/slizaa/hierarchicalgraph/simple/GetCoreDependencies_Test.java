package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.util.HierarchicalGraphUtils;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class GetCoreDependencies_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testGetCoreDependencies() {

    //
    Set<HGCoreDependency> coreDependencies = HierarchicalGraphUtils
        .getCoreDependencies(model().a1().getOutgoingDependenciesTo(model().b1()));

    //
    assertThat(coreDependencies).isNotNull();
    assertThat(coreDependencies).hasSize(4);
  }
}
