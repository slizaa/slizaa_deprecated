package org.slizaa.ui.tree;

import org.eclipse.emf.ecore.EObject;

public interface SlizaaTreeAction {

  /**
   * <p>
   * </p>
   * 
   * @param eObject
   *          the {@link EObject} on which to test if the action can be executed
   * @return <b>true</b> if the action can be executed on the parameter {@code eObject}
   */
  boolean shouldShow(EObject eObject);

  /**
   * @param eSelectedObject
   * @return
   */
  boolean isEnabled(EObject eSelectedObject);

  /**
   * <p>
   * </p>
   * 
   * @param object
   *          The {@link EObject} on which the action is executed
   **/
  void execute(EObject object);

  /**
   * <p>
   * </p>
   * 
   * @return the label of the action
   */
  String getLabel();

  /**
   * <p>
   * </p>
   * 
   * @return the imagePath
   */
  String getImagePath();
}
