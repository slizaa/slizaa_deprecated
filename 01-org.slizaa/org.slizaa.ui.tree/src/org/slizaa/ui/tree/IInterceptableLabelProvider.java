package org.slizaa.ui.tree;

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
