package org.slizaa.hierarchicalgraph.simple;

import static org.slizaa.hierarchicalgraph.utils.NodeCacheHelper.assertCachesAreNotNull;
import static org.slizaa.hierarchicalgraph.utils.NodeCacheHelper.assertCachesAreNull;
import static org.slizaa.hierarchicalgraph.utils.NodeCacheHelper.populateCaches;

import java.util.Arrays;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class InvalidateCachesForNodes_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testGetCoreDependencies() {

    // 'activate' all caches
    populateCaches(model().root());
    EcoreUtil.getAllContents(model().root(), false).forEachRemaining((c) -> {
      populateCaches(c);
    });

    // assert that all caches are in use
    assertCachesAreNotNull(model().root());
    EcoreUtil.getAllContents(model().root(), false).forEachRemaining((c) -> {
      assertCachesAreNotNull(c);
    });

    // invalidate caches
    model().root().invalidateCaches(Arrays.asList(model().a3(), model().b3()));

    // assert that all caches are cleared
    assertCachesAreNull(model().root());
    EcoreUtil.getAllContents(model().root(), false).forEachRemaining((c) -> {
      assertCachesAreNull(c);
    });
  }
}
