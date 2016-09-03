package org.slizaa.neo4j.testfwk.restserver;

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
  public ITestJqaDatabaseHandle createJqaServer(TestDB testDB);

  /**
   * <p>
   * </p>
   */
  void cleanUp();
}
