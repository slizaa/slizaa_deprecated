package org.slizaa.neo4j.testfwk.restserver.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.concurrent.Callable;

/**
 * <p>
 * </p>
 */
public class TCCLExecuter {

  /**
   * <p>
   * </p>
   *
   * @param callable
   * @return
   * @throws Exception
   */
  public static <V> V execute(ClassLoader classLoader, Callable<V> callable) {

    //
    checkNotNull(callable);

    //
    ClassLoader tccl = Thread.currentThread().getContextClassLoader();

    try {
      Thread.currentThread().setContextClassLoader(classLoader);

      try {
        return callable.call();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }

    } finally {
      Thread.currentThread().setContextClassLoader(tccl);
    }
  }
}
