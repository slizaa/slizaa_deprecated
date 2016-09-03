package org.slizaa.neo4j.testfwk.restserver.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import org.slizaa.neo4j.testfwk.restserver.ITestJqaDatabaseHandle;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class TestJqaDatabaseHandleImpl implements ITestJqaDatabaseHandle {

  /** - */
  private AutoCloseable _server;

  /**
   * <p>
   * Creates a new instance of type {@link TestJqaDatabaseHandleImpl}.
   * </p>
   *
   * @param server
   */
  public TestJqaDatabaseHandleImpl(AutoCloseable server) {
    _server = checkNotNull(server);
  }

  /**
   * <p>
   * </p>
   *
   * @throws Exception
   * @see java.lang.AutoCloseable#close()
   */
  @Override
  public void close() throws Exception {
    _server.close();
  }
}
