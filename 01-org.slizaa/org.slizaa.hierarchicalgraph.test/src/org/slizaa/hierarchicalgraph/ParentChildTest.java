package org.slizaa.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParentChildTest extends AbstractHierarchicalTest {

  /**
   * <p>
   * </p>
   *
   */
  @Test
  public void testRootNode() {
    assertThat(greatGrandChild().getRootNode()).isSameAs(rootNode());
    assertThat(grandChild().getRootNode()).isSameAs(rootNode());
    assertThat(child().getRootNode()).isSameAs(rootNode());
    assertThat(rootNode().getRootNode()).isSameAs(rootNode());
  }

  @Test
  public void testPredecessorOf() {

    //
    assertFalse(rootNode().isPredecessorOf(rootNode()));
    assertTrue(rootNode().isPredecessorOf(child()));
    assertTrue(rootNode().isPredecessorOf(grandChild()));
    assertTrue(rootNode().isPredecessorOf(greatGrandChild()));

    //
    assertFalse(child().isPredecessorOf(rootNode()));
    assertFalse(child().isPredecessorOf(child()));
    assertTrue(child().isPredecessorOf(grandChild()));
    assertTrue(child().isPredecessorOf(greatGrandChild()));

    //
    assertFalse(grandChild().isPredecessorOf(rootNode()));
    assertFalse(grandChild().isPredecessorOf(child()));
    assertFalse(grandChild().isPredecessorOf(grandChild()));
    assertTrue(grandChild().isPredecessorOf(greatGrandChild()));

    //
    assertFalse(greatGrandChild().isPredecessorOf(rootNode()));
    assertFalse(greatGrandChild().isPredecessorOf(child()));
    assertFalse(greatGrandChild().isPredecessorOf(grandChild()));
    assertFalse(greatGrandChild().isPredecessorOf(greatGrandChild()));
  }

  @Test
  public void testSuccessorOf() {

    //
    assertFalse(rootNode().isSuccessorOf(rootNode()));
    assertFalse(rootNode().isSuccessorOf(child()));
    assertFalse(rootNode().isSuccessorOf(grandChild()));
    assertFalse(rootNode().isSuccessorOf(greatGrandChild()));

    //
    assertTrue(child().isSuccessorOf(rootNode()));
    assertFalse(child().isSuccessorOf(child()));
    assertFalse(child().isSuccessorOf(grandChild()));
    assertFalse(child().isSuccessorOf(greatGrandChild()));

    //
    assertTrue(grandChild().isSuccessorOf(rootNode()));
    assertTrue(grandChild().isSuccessorOf(child()));
    assertFalse(grandChild().isSuccessorOf(grandChild()));
    assertFalse(grandChild().isSuccessorOf(greatGrandChild()));

    //
    assertTrue(greatGrandChild().isSuccessorOf(rootNode()));
    assertTrue(greatGrandChild().isSuccessorOf(child()));
    assertTrue(greatGrandChild().isSuccessorOf(grandChild()));
    assertFalse(greatGrandChild().isSuccessorOf(greatGrandChild()));
  }
}
