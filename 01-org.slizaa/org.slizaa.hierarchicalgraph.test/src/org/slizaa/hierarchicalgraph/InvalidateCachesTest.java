package org.slizaa.hierarchicalgraph;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
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
    rootNode().invalidateAllCaches();
    
    // TODO: Assertions!
    Assert.fail();
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
