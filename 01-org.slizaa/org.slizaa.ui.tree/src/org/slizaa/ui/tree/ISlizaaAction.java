package org.slizaa.ui.tree;

import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface ISlizaaAction {

  /**
   * <p>
   * </p>
   * 
   * @param eObject
   *          the {@link EObject} on which to test if the action can be executed
   * @return <b>true</b> if the action can be executed on the parameter {@code eObject}
   */
  boolean shouldShow(Object object);

  /**
   * <p>
   * </p>
   *
   * @param eSelectedObject
   * @return
   */
  boolean isEnabled(Object selectedObject);

  /**
   * <p>
   * </p>
   * 
   * @param object
   *          The {@link EObject} on which the action is executed
   **/
  void execute(Object selectedObject);

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
