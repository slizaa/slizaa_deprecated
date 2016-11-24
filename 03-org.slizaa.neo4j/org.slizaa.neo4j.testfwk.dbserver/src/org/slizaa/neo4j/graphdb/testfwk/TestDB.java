package org.slizaa.neo4j.graphdb.testfwk;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public enum TestDB {
  
  /** - */
  MAPSTRUCT("mapstruct-db", "/mapstruct_1-1-0-Beta2-db.zip");
  
  /**
   * <p>
   * </p>
   *
   * @return the path
   */
  public String getPath() {
    return _path;
  }

  /**
   * <p>
   * </p>
   *
   * @return the name
   */
  public String getName() {
    return _name;
  }

  /** - */
  private String _name;
  
  /** - */
  private String _path;

  /**
   * <p>
   * Creates a new instance of type {@link TestDB}.
   * </p>
   *
   * @param name
   * @param path
   */
  private TestDB(String name, String path) {
    _name = checkNotNull(name);
    _path = checkNotNull(path);
  }
}
