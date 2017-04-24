package org.slizaa.hierarchicalgraph.selection.selector;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IDependencySelectorListener {

  /**
   * <p>
   * </p>
   *
   */
  void selectedNodesChanged(SelectedNodesChangedEvent event);

  /**
   * <p>
   * </p>
   *
   */
  void unfilteredDependenciesChanged(UnfilteredDependenciesChangedEvent event);

  /**
   * <p>
   * </p>
   *
   */
  void proxyDependencyChanged(ProxyDependencyChangedEvent event);

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  public static class Adapter implements IDependencySelectorListener {

    @Override
    public void selectedNodesChanged(SelectedNodesChangedEvent event) {
      //
    }

    @Override
    public void unfilteredDependenciesChanged(UnfilteredDependenciesChangedEvent event) {
      //
    }

    @Override
    public void proxyDependencyChanged(ProxyDependencyChangedEvent event) {
      //
    }
  }
}
