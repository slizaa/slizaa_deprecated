package org.slizaa.hierarchicalgraph;

import static org.slizaa.hierarchicalgraph.impl.NodeCacheHelper.assertCachesAreNotNull;
import static org.slizaa.hierarchicalgraph.impl.NodeCacheHelper.*;

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
public class InvalidateCachesTest extends AbstractXmiBasedTest {

  /**
   * <p>
   * Creates a new instance of type {@link InvalidateCachesTest}.
   * </p>
   */
  public InvalidateCachesTest(String xmiModelPath) {
    super(xmiModelPath);
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testInvalidateAllCaches() {

    // 'activate' all caches
    populateCaches(rootNode());
    EcoreUtil.getAllContents(rootNode(), false).forEachRemaining((c) -> {
      populateCaches(c);
    });

    // assert that all caches are in use
    assertCachesAreNotNull(rootNode());
    EcoreUtil.getAllContents(rootNode(), false).forEachRemaining((c) -> {
      assertCachesAreNotNull(c);
    });

    // invalidate caches
    rootNode().invalidateAllCaches();

    // assert that all caches are cleared
    assertCachesAreInvalid(rootNode());
    EcoreUtil.getAllContents(rootNode(), false).forEachRemaining((c) -> {
      assertCachesAreInvalid(c);
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
