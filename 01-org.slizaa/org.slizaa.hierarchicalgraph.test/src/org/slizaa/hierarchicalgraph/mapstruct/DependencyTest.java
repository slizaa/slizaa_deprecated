package org.slizaa.hierarchicalgraph.mapstruct;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.slizaa.testfwk.AbstractXmiBasedTest;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencyTest extends AbstractXmiBasedTest {

  /** - */
  public static final Long ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER = new Long(6308);

  /** - */
  public static final Long ID_TYPE_MODEL_WRITER                    = new Long(5769);

  /**
   * <p>
   * Creates a new instance of type {@link DependencyTest}.
   * </p>
   *
   */
  public DependencyTest() {
    super("mapstruct_1-1-0-Beta2.hggraph");
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testOutgoingCoreDependencies() {

    // 'mapstruct-1.1.0.Beta2.jar'
    assertThat(node(1).getOutgoingCoreDependencies()).hasSize(0);
    assertThat(node(ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER).getOutgoingCoreDependencies(false)).hasSize(0);
    assertThat(node(ID_TYPE_MODEL_WRITER).getOutgoingCoreDependencies()).hasSize(11);

    // 'mapstruct--processor-1.1.0.Beta2.jar'
    assertThat(node(577).getOutgoingCoreDependencies(true)).hasSize(4983);
    assertThat(node(ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER).getOutgoingCoreDependencies(true)).hasSize(75);
    assertThat(node(ID_TYPE_MODEL_WRITER).getOutgoingCoreDependencies(true)).hasSize(11);
  }

  @Test
  public void testIncomingCoreDependencies() {

    // 'mapstruct--processor-1.1.0.Beta2.jar'
    assertThat(node(577).getIncomingCoreDependencies(false)).hasSize(0);
    assertThat(node(ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER).getIncomingCoreDependencies(false)).hasSize(0);
    assertThat(node(ID_TYPE_MODEL_WRITER).getIncomingCoreDependencies(false)).hasSize(3);

    // 'mapstruct--processor-1.1.0.Beta2.jar'
    assertThat(node(577).getIncomingCoreDependencies(true)).hasSize(4983);
    assertThat(node(ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER).getIncomingCoreDependencies(true)).hasSize(58);
    assertThat(node(ID_TYPE_MODEL_WRITER).getIncomingCoreDependencies(true)).hasSize(3);
  }

  @Test
  public void testAggregatedDependencies() {

    // '/mapstruct-processor-1.1.0.Beta2.jar' -> 'mapstruct-1.1.0.Beta2.jar'
    assertThat(node(577).getOutgoingDependenciesTo(node(1))).isNull();

    // '/mapstruct-processor-1.1.0.Beta2.jar/org.mapstrcut.ap.internal.model' ->
    // '/mapstruct-processor-1.1.0.Beta2.jar/org.mapstrcut.ap.internal.util'
    assertThat(node(1063).getOutgoingDependenciesTo(node(5922))).isNotNull();
    assertThat(node(1063).getOutgoingDependenciesTo(node(5922)).getAggregatedWeight()).isEqualTo(50);
  }
}
