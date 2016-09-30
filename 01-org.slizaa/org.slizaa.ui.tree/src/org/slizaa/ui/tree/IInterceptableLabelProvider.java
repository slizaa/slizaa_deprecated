package org.slizaa.ui.tree;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IInterceptableLabelProvider {

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public ILabelProviderInterceptor getLabelProviderInterceptor();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public boolean hasLabelProviderInterceptor();

  /**
   * <p>
   * </p>
   *
   * @param labelProviderInterceptor
   */
  public void setLabelProviderInterceptor(ILabelProviderInterceptor labelProviderInterceptor);
}
