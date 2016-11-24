package org.slizaa.neo4j.hierarchicalgraph.provider.impl;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class CustomItemPropertyDescriptor implements IItemPropertyDescriptor {

  private Object _propertyValue;

  private String _propertyId;

  private String _category;

  /**
   * <p>
   * </p>
   * 
   * @param propertyValue
   * @param propertyId
   */
  public CustomItemPropertyDescriptor(Object propertyValue, String propertyId, String category) {
    this._propertyValue = propertyValue;
    this._propertyId = propertyId;
    this._category = category;
  }

  @Override
  public Object getPropertyValue(Object object) {
    return _propertyValue;
  }

  @Override
  public boolean isPropertySet(Object object) {
    return true;
  }

  @Override
  public boolean canSetProperty(Object object) {
    return false;
  }

  @Override
  public void resetPropertyValue(Object object) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void setPropertyValue(Object object, Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getCategory(Object object) {
    return _category;
  }

  @Override
  public String getDescription(Object object) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getDisplayName(Object object) {
    return _propertyId;
  }

  @Override
  public String[] getFilterFlags(Object object) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object getHelpContextIds(Object object) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getId(Object object) {
    return _propertyId;
  }

  @Override
  public IItemLabelProvider getLabelProvider(Object object) {
    return new IItemLabelProvider() {

      @Override
      public String getText(Object object) {
        return object.toString();
      }

      @Override
      public Object getImage(Object object) {
        return null;
      }
    };
  }

  @Override
  public boolean isCompatibleWith(Object object, Object anotherObject,
      IItemPropertyDescriptor anotherPropertyDescriptor) {
    return false;
  }

  @Override
  public Object getFeature(Object object) {
    return null;
  }

  @Override
  public boolean isMany(Object object) {
    return false;
  }

  @Override
  public Collection<?> getChoiceOfValues(Object object) {
    return Collections.emptyList();
  }

  @Override
  public boolean isMultiLine(Object object) {
    return false;
  }

  @Override
  public boolean isSortChoices(Object object) {
    return false;
  }
}
