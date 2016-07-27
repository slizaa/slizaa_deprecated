package org.slizaa.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class LookupTest extends AbstractHierarchicalTest {

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
        assertThat(rootNode().getNode(node.getIdentifier())).isEqualTo(node);
      }
    });
  }
}
