package org.slizaa.hierarchicalgraph;

import org.junit.After;
import org.junit.Before;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class AbstractSimpleModelTest {

  /** - */
  private SimpleModel _simpleModel;

  /**
   * <p>
   * </p>
   */
  @Before
  public void before() {
    _simpleModel = new SimpleModel();
  }

  /**
   * <p>
   * </p>
   */
  @After
  public void after() {
    _simpleModel = null;
  }

  /**
   * <p>
   * </p>
   *
   * @return the simpleModel
   */
  public SimpleModel simpleModel() {
    return _simpleModel;
  }
}
