package org.slizaa.ui.shared.internal;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.slizaa.ui.shared.SlizaaProjectNature;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class SlizaaProjectUtils {

  /** - */
  public static final String XTEXT_PROJECT_NATURE_ID = "org.eclipse.xtext.ui.shared.xtextNature";
  
  /**
   * <p>
   * </p>
   *
   * @param project
   * @throws CoreException
   */
  public static void addXtextProjectNature(IProject project) throws CoreException {
    addNature(project, SlizaaProjectUtils.XTEXT_PROJECT_NATURE_ID);
  }
  
  /**
   * <p>
   * </p>
   *
   * @param project
   * @throws CoreException
   */
  public static void addSlizaaProjectNature(IProject project) throws CoreException {
    addNature(project, SlizaaProjectNature.NATURE_ID);
  }
  
  /**
   * <p>
   * </p>
   *
   * @param project
   * @param nature
   * @throws CoreException
   */
  public static void addNature(IProject project, String nature) throws CoreException {
    if (!project.hasNature(nature)) {

      // get the project description
      IProjectDescription description = project.getDescription();

      // set the new nature
      String[] prevNatures = description.getNatureIds();
      String[] newNatures = new String[prevNatures.length + 1];
      System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
      newNatures[prevNatures.length] = nature;
      description.setNatureIds(newNatures);

      // set the new description
      project.setDescription(description, null);
    }

  }
}
