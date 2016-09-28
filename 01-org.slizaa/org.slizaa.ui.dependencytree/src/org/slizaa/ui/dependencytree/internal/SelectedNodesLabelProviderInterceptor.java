package org.slizaa.ui.dependencytree.internal;

import java.util.Collection;
import java.util.function.Supplier;

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
public class SelectedNodesLabelProviderInterceptor extends ILabelProviderInterceptor.Adapter
    implements ILabelProviderInterceptor {

  /** - */
  private Supplier<Collection<HGNode>> _selectedNodesSupplier;

  /**
   * <p>
   * Creates a new instance of type {@link SelectedNodesLabelProviderInterceptor}.
   * </p>
   *
   * @param selectedNodesSupplier
   */
  public SelectedNodesLabelProviderInterceptor(Supplier<Collection<HGNode>> selectedNodesSupplier) {
    super();
    _selectedNodesSupplier = selectedNodesSupplier;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Font alterFont(Object object, Font font) {
    Collection<HGNode> selectedNodes = selectedNodes();
    //
    if (selectedNodes != null) {
      if (selectedNodes.contains(object)) {
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
    Collection<HGNode> selectedNodes = selectedNodes();
    if (selectedNodes != null && !selectedNodes.contains(object)) {
      return Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
    }
    return color;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private Collection<HGNode> selectedNodes() {
    return _selectedNodesSupplier.get();
  }
}
