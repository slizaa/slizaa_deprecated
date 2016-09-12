package org.slizaa.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@RunWith(Parameterized.class)
public class LookupTest extends AbstractXmiBasedTest {

  /**
   * <p>
   * Creates a new instance of type {@link LookupTest}.
   * </p>
   */
  public LookupTest(String xmiModelPath) {
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
    return Arrays.asList(new Object[][] { { "org/slizaa/hierarchicalgraph/mapstruct/mapstruct_1-1-0-Beta2.hggraph" } });
  }
}
