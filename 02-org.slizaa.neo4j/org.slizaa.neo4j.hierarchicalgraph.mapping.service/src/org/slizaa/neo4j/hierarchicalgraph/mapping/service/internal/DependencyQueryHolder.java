package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.concurrent.Future;

import org.slizaa.neo4j.hierarchicalgraph.mapping.DependencyMapping;

import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencyQueryHolder {

  /** - */
  private Future<JsonObject> _future;

  /** - */
  private DependencyMapping  _depencyMapping;

  /**
   * <p>
   * Creates a new instance of type {@link DependencyQueryHolder}.
   * </p>
   *
   * @param depencyMapping
   * @param future
   */
  public DependencyQueryHolder(DependencyMapping depencyMapping, Future<JsonObject> future) {
    this._future = checkNotNull(future);
    this._depencyMapping = checkNotNull(depencyMapping);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Future<JsonObject> getFuture() {
    return _future;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public DependencyMapping getDepencyMapping() {
    return _depencyMapping;
  }
}
