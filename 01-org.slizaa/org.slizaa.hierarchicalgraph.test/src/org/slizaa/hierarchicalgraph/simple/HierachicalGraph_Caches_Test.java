package org.slizaa.hierarchicalgraph.simple;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class HierachicalGraph_Caches_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testInvalidateAllCaches() {

    //
    simpleModel().root().invalidateAllCaches();
  }
}
