package org.slizaa.ui.tree;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface ILabelProviderInterceptor {

  /**
   * <p>
   * </p>
   *
   * @param object
   * @param text
   * @return
   */
  String alterText(Object object, String text);

  /**
   * <p>
   * </p>
   *
   * @param object
   * @param font
   * @return
   */
  Font alterFont(Object object, Font font);

  /**
   * <p>
   * </p>
   *
   * @param object
   * @param styledString
   * @return
   */
  StyledString alterStyledText(Object object, StyledString styledString);

  /**
   * <p>
   * </p>
   *
   * @param object
   * @param color
   * @return
   */
  Color alterForeground(Object object, Color color);

  /**
   * <p>
   * </p>
   *
   * @param object
   * @param color
   * @return
   */
  Color alterBackground(Object object, Color color);

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  public static class Adapter implements ILabelProviderInterceptor {

    /**
     * {@inheritDoc}
     */
    @Override
    public String alterText(Object object, String text) {
      return text;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Font alterFont(Object object, Font font) {
      return font;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StyledString alterStyledText(Object object, StyledString styledString) {
      return styledString;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Color alterForeground(Object object, Color color) {
      return color;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Color alterBackground(Object object, Color color) {
      return color;
    }
  }
}
