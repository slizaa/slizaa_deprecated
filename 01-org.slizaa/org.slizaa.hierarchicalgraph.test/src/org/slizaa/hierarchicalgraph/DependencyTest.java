package org.slizaa.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencyTest extends AbstractHierarchicalTest {

  /** - */
  public static final Long ID_JAR_MAPSTRUCT_PROCESSOR              = new Long(577);

  /** - */
  public static final Long ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER = new Long(6308);

  /** - */
  public static final Long ID_TYPE_MODEL_WRITER                    = new Long(5769);

  /**
   * <p>
   * </p>
   */
  @Test
  public void testOutgoingCoreDependencies() {

    //
    assertThat(node(ID_JAR_MAPSTRUCT_PROCESSOR).getOutgoingCoreDependencies(false)).hasSize(0);
    assertThat(node(ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER).getOutgoingCoreDependencies(false)).hasSize(0);
    assertThat(node(ID_TYPE_MODEL_WRITER).getOutgoingCoreDependencies(false)).hasSize(11);

    //
    assertThat(node(ID_JAR_MAPSTRUCT_PROCESSOR).getOutgoingCoreDependencies(true)).hasSize(4983);
    assertThat(node(ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER).getOutgoingCoreDependencies(true)).hasSize(75);
    assertThat(node(ID_TYPE_MODEL_WRITER).getOutgoingCoreDependencies(true)).hasSize(11);
  }

   @Test
   public void testIncomingCoreDependencies() {
  
     //
     assertThat(node(ID_JAR_MAPSTRUCT_PROCESSOR).getIncomingCoreDependencies(false)).hasSize(0);
     assertThat(node(ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER).getIncomingCoreDependencies(false)).hasSize(0);
     assertThat(node(ID_TYPE_MODEL_WRITER).getIncomingCoreDependencies(false)).hasSize(3);

     //
     assertThat(node(ID_JAR_MAPSTRUCT_PROCESSOR).getIncomingCoreDependencies(true)).hasSize(4983);
     assertThat(node(ID_PKG_ORG_MAPSTRUCT_AP_INTERNAL_WRITER).getIncomingCoreDependencies(true)).hasSize(58);
     assertThat(node(ID_TYPE_MODEL_WRITER).getIncomingCoreDependencies(true)).hasSize(3);
   }
  
  // @Test
  // public void testAggregatedDependencies() {
  //
  // //
  // assertThat(greatGrandChild().getOutgoingDependenciesTo(greatGrandChild2()).getWeight()).isEqualTo(1);
  // assertThat(grandChild().getOutgoingDependenciesTo(grandChild2()).getWeight()).isEqualTo(2);
  // assertThat(child().getOutgoingDependenciesTo(child2()).getWeight()).isEqualTo(3);
  //
  // //
  // assertThat(greatGrandChild2().getIncomingDependenciesFrom(greatGrandChild()).getWeight()).isEqualTo(1);
  // assertThat(grandChild2().getIncomingDependenciesFrom(grandChild()).getWeight()).isEqualTo(2);
  // assertThat(child2().getIncomingDependenciesFrom(child()).getWeight()).isEqualTo(3);
  // }
}
