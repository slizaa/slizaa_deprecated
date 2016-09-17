package org.slizaa.hierarchicalgraph.multi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.testfwk.AbstractXmiBasedTest;

@RunWith(Parameterized.class)
public class ParentChildTest extends AbstractXmiBasedTest {

  /**
   * <p>
   * Creates a new instance of type {@link ParentChildTest}.
   * </p>
   *
   * @param xmiModelPath
   */
  public ParentChildTest(String xmiModelPath) {
    super(xmiModelPath);
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testParentChild() {
    EcoreUtil.getAllContents(rootNode(), false).forEachRemaining((c) -> {
      if (HierarchicalgraphPackage.eINSTANCE.getHGNode().isInstance(c)) {
        HGNode node = (HGNode) c;
        checkParentChild(node);
        if (node.getParent() != null) {
          checkBloodline(node, node.getParent());
        }
      }
    });
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   */
  private void checkParentChild(HGNode node) {

    // check parent
    if (node.getParent() != null) {
      assertThat(node.getParent().getChildren()).contains(node);
    }

    // check children
    for (HGNode child : node.getChildren()) {
      assertThat(child.getParent()).isEqualTo(node);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @param predecessor
   */
  private void checkBloodline(HGNode node, HGNode predecessor) {
    if (predecessor != null) {
      assertThat(predecessor.isPredecessorOf(node));
      assertThat(!predecessor.isSuccessorOf(node));
      assertThat(!node.isPredecessorOf(predecessor));
      assertThat(node.isSuccessorOf(node));
      checkBloodline(node, predecessor.getParent());
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] { { "mapstruct_1-1-0-Beta2.hggraph" } });
  }
}
