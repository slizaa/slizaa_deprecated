package org.slizaa.hierarchicalgraph.spi;

import java.util.List;
import java.util.concurrent.Future;

import org.slizaa.hierarchicalgraph.HGProxyDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IProxyDependencyResolver {

  /**
   * <p>
   * </p>
   *
   * @param dependencyToResolve
   */
  List<Future<?>> resolveProxyDependency(HGProxyDependency dependencyToResolve);
}
