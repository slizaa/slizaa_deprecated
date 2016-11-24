package org.slizaa.neo4j.graphdb.testfwk;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface ITestJqaDatabaseCreatorService {

  /**
   * <p>
   * </p>
   *
   * @param testDB
   * @param databaseDirectory
   * @param delete
   * @return
   */
  public AutoCloseable createJqaServer(TestDB testDB);

  /**
   * <p>
   * </p>
   */
  void cleanUp();
}
