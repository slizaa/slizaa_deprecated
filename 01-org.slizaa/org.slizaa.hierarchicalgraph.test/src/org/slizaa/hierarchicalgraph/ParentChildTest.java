package org.slizaa.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ParentChildTest extends AbstractHierarchicalTest {

  /** - */
  public static final Long ID_JAR_MAPSTRUCT          = new Long(1);

  /** - */
  public static final Long ID_PKG_ORG_MAPSTRUCT = new Long(21);
  
  /** - */
  public static final Long ID_TYPE_MAPPING = new Long(249);
  
  /**
   * <p>
   * </p>
   *
   */
  @Test
  public void testRootNode() {
    assertThat(node(ID_PKG_ORG_MAPSTRUCT).getRootNode()).isSameAs(rootNode());
    assertThat(node(ID_JAR_MAPSTRUCT).getRootNode()).isSameAs(rootNode());
    assertThat(rootNode().getRootNode()).isSameAs(rootNode());
  }

  @Test
  public void testPredecessorOf() {

    //
    assertFalse(rootNode().isPredecessorOf(rootNode()));
    assertTrue(rootNode().isPredecessorOf(node(ID_JAR_MAPSTRUCT)));
    assertTrue(rootNode().isPredecessorOf(node(ID_PKG_ORG_MAPSTRUCT)));

    //
    assertFalse(node(ID_JAR_MAPSTRUCT).isPredecessorOf(rootNode()));
    assertFalse(node(ID_JAR_MAPSTRUCT).isPredecessorOf(node(ID_JAR_MAPSTRUCT)));
    assertTrue(node(ID_JAR_MAPSTRUCT).isPredecessorOf(node(ID_PKG_ORG_MAPSTRUCT)));

    //
    assertFalse(node(ID_PKG_ORG_MAPSTRUCT).isPredecessorOf(rootNode()));
    assertFalse(node(ID_PKG_ORG_MAPSTRUCT).isPredecessorOf(node(ID_JAR_MAPSTRUCT)));
    assertFalse(node(ID_PKG_ORG_MAPSTRUCT).isPredecessorOf(node(ID_PKG_ORG_MAPSTRUCT)));
  }

  @Test
  public void testSuccessorOf() {

    //
    assertFalse(rootNode().isSuccessorOf(rootNode()));
    assertFalse(rootNode().isSuccessorOf(node(ID_JAR_MAPSTRUCT)));
    assertFalse(rootNode().isSuccessorOf(node(ID_PKG_ORG_MAPSTRUCT)));

    //
    assertTrue(node(ID_JAR_MAPSTRUCT).isSuccessorOf(rootNode()));
    assertFalse(node(ID_JAR_MAPSTRUCT).isSuccessorOf(node(ID_JAR_MAPSTRUCT)));
    assertFalse(node(ID_JAR_MAPSTRUCT).isSuccessorOf(node(ID_PKG_ORG_MAPSTRUCT)));

    //
    assertTrue(node(ID_PKG_ORG_MAPSTRUCT).isSuccessorOf(rootNode()));
    assertTrue(node(ID_PKG_ORG_MAPSTRUCT).isSuccessorOf(node(ID_JAR_MAPSTRUCT)));
    assertFalse(node(ID_PKG_ORG_MAPSTRUCT).isSuccessorOf(node(ID_PKG_ORG_MAPSTRUCT)));
  }
}
