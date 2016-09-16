package org.slizaa.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slizaa.testfwk.AbstractXmiBasedTest;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@RunWith(Parameterized.class)
public class LookupNodeTest extends AbstractXmiBasedTest {

  /**
   * <p>
   * Creates a new instance of type {@link LookupNodeTest}.
   * </p>
   */
  public LookupNodeTest(String xmiModelPath) {
    super(xmiModelPath);
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
