package org.slizaa.ui.tree;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.function.Function;

import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencyResolvingTreeEventInterceptor implements ITreeEventInterceptor {

  /** - */
  private Function<HGNode, List<HGCoreDependency>> _coreDependencySupplier;

  /**
   * <p>
   * Creates a new instance of type {@link DependencyResolvingTreeEventInterceptor}.
   * </p>
   *
   * @param coreDependencySupplier
   */
  public DependencyResolvingTreeEventInterceptor(Function<HGNode, List<HGCoreDependency>> coreDependencySupplier) {
    _coreDependencySupplier = checkNotNull(coreDependencySupplier);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void handleSelect(HGNode node) {
    List<HGCoreDependency> dependencies = _coreDependencySupplier.apply(node);
    if (dependencies != null) {
      dependencies.stream().filter(dep -> dep instanceof HGAggregatedCoreDependency)
          .map(dep -> (HGAggregatedCoreDependency) dep).forEach(dep -> dep.resolveAggregatedCoreDependencies());
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void handleTreeExpand(HGNode node) {
    List<HGCoreDependency> dependencies = _coreDependencySupplier.apply(node);
    if (dependencies != null) {
      dependencies.stream().filter(dep -> dep instanceof HGAggregatedCoreDependency)
          .map(dep -> (HGAggregatedCoreDependency) dep).forEach(dep -> dep.resolveAggregatedCoreDependencies());
    }
  }

  @Override
  public void handleTreeCollapse(HGNode node) {
    // nothing
  }
}
