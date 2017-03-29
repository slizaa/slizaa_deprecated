package org.slizaa.hierarchicalgraph;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class HierarchicalgraphUtilityMethods {

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   * @return
   */
  public static void addAdapter(Collection<? extends AbstractHGDependency> dependencies, Adapter adapter) {
    checkNotNull(dependencies);
    checkNotNull(adapter);

    //
    for (AbstractHGDependency dep : dependencies) {
      dep.eAdapters().add(adapter);
    }
  }

  public static void removeAdapter(Collection<? extends AbstractHGDependency> dependencies, Adapter adapter) {
    checkNotNull(dependencies);
    checkNotNull(adapter);

    //
    for (AbstractHGDependency dep : dependencies) {
      dep.eAdapters().remove(adapter);
    }
  }
}
