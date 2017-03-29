package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class NodeResolveOutgoing_Test extends AbstractResolverTest {

  @Test
  public void nodeResolveOutgoing() {
    resolve(() -> {
      model().a1().resolveOutgoingProxyDependencies();
    });
  }
}