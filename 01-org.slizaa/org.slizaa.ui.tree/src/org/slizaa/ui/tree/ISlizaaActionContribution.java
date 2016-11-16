package org.slizaa.ui.tree;

import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface ISlizaaActionContribution {

  /**
   * <p>
   * </p>
   *
   * @return
   */
  String getParentGroupId();

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

  /**
   * <p>
   * </p>
   *
   * @return
   */
  int getRanking();

  /**
   * <p>
   * </p>
   * 
   * @param eObject
   *          the {@link EObject} on which to test if the action can be executed
   * @return <b>true</b> if the action can be executed on the parameter {@code eObject}
   */
  boolean shouldShow(Object selectedObject);

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
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  public static class DefaultActionContribution implements ISlizaaActionContribution {

    /** - */
    private String _groupId;

    /** - */
    private String _label;

    /** - */
    private String _imagePath;

    /** - */
    private int    _ranking;

    /**
     * <p>
     * Creates a new instance of type {@link DefaultActionContribution}.
     * </p>
     * @param label
     * @param parentGroupId
     */
    public DefaultActionContribution(String label, String parentGroupId) {
      this(label, parentGroupId, null, 0);
    }

    /**
     * <p>
     * Creates a new instance of type {@link DefaultActionContribution}.
     * </p>
     * @param label
     * @param parentGroupId
     * @param imagePath
     * @param ranking
     */
    public DefaultActionContribution(String label, String parentGroupId, String imagePath, int ranking) {
      _label = checkNotNull(label);
      _groupId = parentGroupId;
      _imagePath = imagePath;
      _ranking = ranking;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getRanking() {
      return _ranking;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getImagePath() {
      return _imagePath;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getParentGroupId() {
      return _groupId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLabel() {
      return _label;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean shouldShow(Object selectedObject) {
      return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEnabled(Object selectedObject) {
      return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(Object selectedObject) {
      // do nothing
    }
  }
}
