package org.slizaa.workbench.model.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slizaa.workbench.model.ModelFactory;
import org.slizaa.workbench.model.SlizaaWorkbenchModel;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class Activator implements BundleActivator {

  /**
   * {@inheritDoc}
   */
  @Override
  public void start(BundleContext context) throws Exception {

    //
    SlizaaWorkbenchModel workbenchModel = ModelFactory.eINSTANCE.createSlizaaWorkbenchModel();

    //
    context.registerService(SlizaaWorkbenchModel.class, workbenchModel, null);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void stop(BundleContext context) throws Exception {

    //
  }
}
