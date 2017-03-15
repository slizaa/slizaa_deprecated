package org.slizaa.testfwk.ui;

import org.eclipse.swt.graphics.Image;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IImageProvider {

  /**
   * <p>
   * </p>
   *
   * @param path
   * @return
   */
  Image getImage(String path);
}
