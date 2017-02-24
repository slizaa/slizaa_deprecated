package org.slizaa.ui.common.internal;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.slizaa.ui.common.SlizaaProjectNature;

public class SlizaaProjectUtils {

  public static final String XTEXT_PROJECT_NATURE_ID = "org.eclipse.xtext.ui.shared.xtextNature";
  
  public static void addXtextProjectNature(IProject project) throws CoreException {
    addNature(project, SlizaaProjectUtils.XTEXT_PROJECT_NATURE_ID);
  }
  
  public static void addSlizaaProjectNature(IProject project) throws CoreException {
    addNature(project, SlizaaProjectNature.NATURE_ID);
  }
  
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
