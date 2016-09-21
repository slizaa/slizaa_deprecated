package org.slizaa.ui.tree.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.slizaa.ui.tree.IInterceptableLabelProvider;
import org.slizaa.ui.tree.ILabelProviderInterceptor;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class InterceptableAdapterFactoryLabelProvider extends AdapterFactoryLabelProvider.StyledLabelProvider
    implements IInterceptableLabelProvider {

  /** - */
  private ILabelProviderInterceptor _labelProviderInterceptor;

  /**
   * <p>
   * Creates a new instance of type {@link InterceptableAdapterFactoryLabelProvider}.
   * </p>
   *
   * @param adapterFactory
   * @param labelProviderInterceptor
   */
  public InterceptableAdapterFactoryLabelProvider(AdapterFactory adapterFactory, Viewer viewer) {
    super(checkNotNull(adapterFactory), checkNotNull(viewer));
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public ILabelProviderInterceptor getLabelProviderInterceptor() {
    return _labelProviderInterceptor;
  }

  /**
   * <p>
   * </p>
   *
   * @param labelProviderInterceptor
   */
  public void setLabelProviderInterceptor(ILabelProviderInterceptor labelProviderInterceptor) {
    this._labelProviderInterceptor = labelProviderInterceptor;
  }

  
  
  @Override
  public boolean hasLabelProviderInterceptor() {
    return this._labelProviderInterceptor != null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getText(Object object) {

    //
    if (_labelProviderInterceptor != null) {
      String text = super.getText(object);
      String alteredText = _labelProviderInterceptor.alterText(object, text);
      return alteredText != null ? alteredText : text;
    }
    //
    else {
      return super.getText(object);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Font getFont(Object object) {

    //
    if (_labelProviderInterceptor != null) {
      Font font = super.getFont(object);
      Font alteredFont = _labelProviderInterceptor.alterFont(object, font);
      return alteredFont != null ? alteredFont : font;
    }
    //
    else {
      return super.getFont(object);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public StyledString getStyledText(Object object) {

    //
    if (_labelProviderInterceptor != null) {
      StyledString styledString = super.getStyledText(object);
      StyledString alteredStyledString = _labelProviderInterceptor.alterStyledText(object, styledString);
      return alteredStyledString != null ? alteredStyledString : styledString;
    }
    //
    else {
      return super.getStyledText(object);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Color getForeground(Object object) {

    //
    if (_labelProviderInterceptor != null) {
      Color color = super.getForeground(object);
      Color alteredColor = _labelProviderInterceptor.alterForeground(object, color);
      return alteredColor != null ? alteredColor : color;
    }
    //
    else {
      return super.getForeground(object);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Color getBackground(Object object) {

    //
    if (_labelProviderInterceptor != null) {
      Color color = super.getBackground(object);
      Color alteredColor = _labelProviderInterceptor.alterBackground(object, color);
      return alteredColor != null ? alteredColor : color;
    }
    //
    else {
      return super.getBackground(object);
    }
  }
}
