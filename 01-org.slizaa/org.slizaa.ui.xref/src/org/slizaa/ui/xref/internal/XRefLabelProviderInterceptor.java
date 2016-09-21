package org.slizaa.ui.xref.internal;

import java.util.Set;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.ui.tree.ILabelProviderInterceptor;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XRefLabelProviderInterceptor extends ILabelProviderInterceptor.Adapter
    implements ILabelProviderInterceptor {

  /** - */
  private Set<HGNode> _nodes;

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Set<HGNode> getNodes() {
    return _nodes;
  }

  /**
   * <p>
   * </p>
   *
   * @param nodes
   */
  public void setNodes(Set<HGNode> nodes) {
    this._nodes = nodes;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Font alterFont(Object object, Font font) {

    //
    if (_nodes != null) {
      if (_nodes.contains(object)) {
        return font;
      } else {
        return JFaceResources.getFontRegistry().getItalic(JFaceResources.DIALOG_FONT);
      }
    }

    //
    return font;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Color alterForeground(Object object, Color color) {
    if (_nodes != null && !_nodes.contains(object)) {
      return Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
    }
    return color;
  }
}
