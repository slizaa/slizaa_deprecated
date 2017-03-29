package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class NodeResolveIncoming_Test extends AbstractResolverTest {

  @Test
  public void nodeResolveIncoming() {
    resolve(() -> {
      model().b1().resolveIncomingProxyDependencies();
    });
  }
}