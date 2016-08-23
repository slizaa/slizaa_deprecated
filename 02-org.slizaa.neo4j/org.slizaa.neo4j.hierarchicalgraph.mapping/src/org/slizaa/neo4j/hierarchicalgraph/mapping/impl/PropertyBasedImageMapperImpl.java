/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition;
import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage;
import org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Based Image Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.PropertyBasedImageMapperImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.PropertyBasedImageMapperImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.PropertyBasedImageMapperImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.PropertyBasedImageMapperImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyBasedImageMapperImpl extends MinimalEObjectImpl.Container implements PropertyBasedImageMapper {
	/**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
	protected static final ImagePosition POSITION_EDEFAULT = ImagePosition.BASE;

	/**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
	protected ImagePosition position = POSITION_EDEFAULT;

	/**
   * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
	protected static final String PROPERTY_VALUE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
	protected String propertyValue = PROPERTY_VALUE_EDEFAULT;

	/**
   * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
	protected static final String IMAGE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
	protected String image = IMAGE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PropertyBasedImageMapperImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Neo4jHierarchicalGraphMappingPackage.Literals.PROPERTY_BASED_IMAGE_MAPPER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImagePosition getPosition() {
    return position;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPosition(ImagePosition newPosition) {
    ImagePosition oldPosition = position;
    position = newPosition == null ? POSITION_EDEFAULT : newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__POSITION, oldPosition, position));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getPropertyName() {
    return propertyName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPropertyName(String newPropertyName) {
    String oldPropertyName = propertyName;
    propertyName = newPropertyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME, oldPropertyName, propertyName));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getPropertyValue() {
    return propertyValue;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPropertyValue(String newPropertyValue) {
    String oldPropertyValue = propertyValue;
    propertyValue = newPropertyValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE, oldPropertyValue, propertyValue));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getImage() {
    return image;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setImage(String newImage) {
    String oldImage = image;
    image = newImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__IMAGE, oldImage, image));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__POSITION:
        return getPosition();
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME:
        return getPropertyName();
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE:
        return getPropertyValue();
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__IMAGE:
        return getImage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__POSITION:
        setPosition((ImagePosition)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME:
        setPropertyName((String)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE:
        setPropertyValue((String)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__IMAGE:
        setImage((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME:
        setPropertyName(PROPERTY_NAME_EDEFAULT);
        return;
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE:
        setPropertyValue(PROPERTY_VALUE_EDEFAULT);
        return;
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__IMAGE:
        setImage(IMAGE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__POSITION:
        return position != POSITION_EDEFAULT;
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME:
        return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE:
        return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__IMAGE:
        return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (position: ");
    result.append(position);
    result.append(", propertyName: ");
    result.append(propertyName);
    result.append(", propertyValue: ");
    result.append(propertyValue);
    result.append(", image: ");
    result.append(image);
    result.append(')');
    return result.toString();
  }

} //PropertyBasedImageMapperImpl
