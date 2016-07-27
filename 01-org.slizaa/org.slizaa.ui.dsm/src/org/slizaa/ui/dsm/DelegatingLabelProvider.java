package org.slizaa.ui.dsm;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class DelegatingLabelProvider extends LabelProvider {

  private IItemLabelProvider _itemLabelProvider;

  public void setItemLabelProvider(IItemLabelProvider itemLabelProvider) {
    _itemLabelProvider = itemLabelProvider;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Image getImage(Object element) {

    //
    if (_itemLabelProvider == null) {
      return super.getImage(element);
    }

    //
    else {
      return (Image) _itemLabelProvider.getImage(element);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getText(Object element) {

    String result = null;
    
    //
    if (_itemLabelProvider == null) {
      result = super.getText(element);
    }

    //
    else {
      result = _itemLabelProvider.getText(element);
    }
    
    //
    return result != null ? result : "";
  }
}
