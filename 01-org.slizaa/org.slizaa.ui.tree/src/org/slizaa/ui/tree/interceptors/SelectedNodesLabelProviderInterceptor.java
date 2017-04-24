package org.slizaa.ui.tree.interceptors;

import java.util.Collection;
import java.util.function.Supplier;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

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
      if (selectedNodes.contains(object) && !(object instanceof HGRootNode)) {
        return JFaceResources.getFontRegistry().getBold(JFaceResources.DIALOG_FONT);
      } else {
        return font;
      }
    }

    //
    return font;
  }


  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Collection<HGNode> selectedNodes() {
    return _selectedNodesSupplier.get();
  }
}
