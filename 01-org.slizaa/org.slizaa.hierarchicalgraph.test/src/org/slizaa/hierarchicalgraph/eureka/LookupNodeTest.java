package org.slizaa.hierarchicalgraph.eureka;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.testfwk.AbstractXmiBasedTest;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class LookupNodeTest extends AbstractXmiBasedTest {

  /**
   * <p>
   * Creates a new instance of type {@link LookupNodeTest}.
   * </p>
   */
  public LookupNodeTest() {
    super("eureka_1-4-10.hggraph");
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testLookup() {
    EcoreUtil.getAllContents(rootNode(), false).forEachRemaining((c) -> {
      if (HierarchicalgraphPackage.eINSTANCE.getHGNode().isInstance(c)) {
        HGNode node = (HGNode) c;
        assertThat(node.getIdentifier()).isNotNull();
        assertThat(rootNode().lookupNode(node.getIdentifier())).isEqualTo(node);
      }
    });
  }
}
