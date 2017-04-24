package org.slizaa.ui.xref.internal.testfwk;

import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.ui.tree.interceptors.ILabelProviderInterceptor;
import org.slizaa.ui.tree.interceptors.SelectedNodesLabelProviderInterceptor;

public class XRefTestLabelProviderInterceptor implements ILabelProviderInterceptor {

  /** - */
  private SelectedNodesLabelProviderInterceptor _delegate;

  /**
   * <p>
   * Creates a new instance of type {@link XRefTestLabelProviderInterceptor}.
   * </p>
   *
   * @param delegate
   */
  public XRefTestLabelProviderInterceptor(SelectedNodesLabelProviderInterceptor delegate) {
    _delegate = checkNotNull(delegate);
  }

  /**
   * {@inheritDoc}
   */
  public String alterText(Object object, String text) {
    
    //
    if (_delegate.selectedNodes() != null) {
      if (_delegate.selectedNodes().contains(object) && !(object instanceof HGRootNode)) {
        return "*" + text + "*";
      } 
    }
    return _delegate.alterText(object, text);
  }

  /**
   * {@inheritDoc}
   */
  public Font alterFont(Object object, Font font) {
    return _delegate.alterFont(object, font);
  }

  /**
   * {@inheritDoc}
   */
  public StyledString alterStyledText(Object object, StyledString styledString) {
    return _delegate.alterStyledText(object, styledString);
  }

  /**
   * {@inheritDoc}
   */
  public Color alterForeground(Object object, Color color) {
    return _delegate.alterForeground(object, color);
  }

  /**
   * {@inheritDoc}
   */
  public Color alterBackground(Object object, Color color) {
    return _delegate.alterBackground(object, color);
  }
}
