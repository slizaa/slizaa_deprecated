package org.slizaa.ui.shared;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * <p>
 * Implementation of the slizaa project nature.
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 *
 */
public class SlizaaProjectNature implements IProjectNature {

  public static final String NATURE_ID = "org.slizaa.ui.shared.slizaanature";
  
  /** the associated slizaa project */
  private IProject _project;

  /**
   * {@inheritDoc}
   */
  public IProject getProject() {
    return _project;
  }

  /**
   * {@inheritDoc}
   */
  public void setProject(IProject value) {
    _project = value;
  }

  /**
   * {@inheritDoc}
   */
  public void configure() throws CoreException {
    // do nothing
  }

  /**
   * {@inheritDoc}
   */
  public void deconfigure() throws CoreException {
    // do nothing
  }
}
