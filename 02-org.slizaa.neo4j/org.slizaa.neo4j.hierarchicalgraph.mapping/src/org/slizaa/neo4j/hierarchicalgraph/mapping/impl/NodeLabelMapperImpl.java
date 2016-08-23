/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage;
import org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper;
import org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Label Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.NodeLabelMapperImpl#getRequiredNeo4jLabel <em>Required Neo4j Label</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.NodeLabelMapperImpl#getDefaultImage <em>Default Image</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.NodeLabelMapperImpl#getTextPropertyName <em>Text Property Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.NodeLabelMapperImpl#getPropertyBasedImages <em>Property Based Images</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeLabelMapperImpl extends MinimalEObjectImpl.Container implements NodeLabelMapper {
	/**
   * The cached value of the '{@link #getRequiredNeo4jLabel() <em>Required Neo4j Label</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRequiredNeo4jLabel()
   * @generated
   * @ordered
   */
	protected EList<String> requiredNeo4jLabel;

	/**
   * The default value of the '{@link #getDefaultImage() <em>Default Image</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDefaultImage()
   * @generated
   * @ordered
   */
	protected static final String DEFAULT_IMAGE_EDEFAULT = "";

	/**
   * The cached value of the '{@link #getDefaultImage() <em>Default Image</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDefaultImage()
   * @generated
   * @ordered
   */
	protected String defaultImage = DEFAULT_IMAGE_EDEFAULT;

	/**
   * The default value of the '{@link #getTextPropertyName() <em>Text Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTextPropertyName()
   * @generated
   * @ordered
   */
	protected static final String TEXT_PROPERTY_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTextPropertyName() <em>Text Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTextPropertyName()
   * @generated
   * @ordered
   */
	protected String textPropertyName = TEXT_PROPERTY_NAME_EDEFAULT;

	/**
   * The cached value of the '{@link #getPropertyBasedImages() <em>Property Based Images</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPropertyBasedImages()
   * @generated
   * @ordered
   */
	protected EList<PropertyBasedImageMapper> propertyBasedImages;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NodeLabelMapperImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Neo4jHierarchicalGraphMappingPackage.Literals.NODE_LABEL_MAPPER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getRequiredNeo4jLabel() {
    if (requiredNeo4jLabel == null) {
      requiredNeo4jLabel = new EDataTypeUniqueEList<String>(String.class, this, Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__REQUIRED_NEO4J_LABEL);
    }
    return requiredNeo4jLabel;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDefaultImage() {
    return defaultImage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDefaultImage(String newDefaultImage) {
    String oldDefaultImage = defaultImage;
    defaultImage = newDefaultImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__DEFAULT_IMAGE, oldDefaultImage, defaultImage));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTextPropertyName() {
    return textPropertyName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTextPropertyName(String newTextPropertyName) {
    String oldTextPropertyName = textPropertyName;
    textPropertyName = newTextPropertyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__TEXT_PROPERTY_NAME, oldTextPropertyName, textPropertyName));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PropertyBasedImageMapper> getPropertyBasedImages() {
    if (propertyBasedImages == null) {
      propertyBasedImages = new EObjectContainmentEList<PropertyBasedImageMapper>(PropertyBasedImageMapper.class, this, Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__PROPERTY_BASED_IMAGES);
    }
    return propertyBasedImages;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__PROPERTY_BASED_IMAGES:
        return ((InternalEList<?>)getPropertyBasedImages()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__REQUIRED_NEO4J_LABEL:
        return getRequiredNeo4jLabel();
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__DEFAULT_IMAGE:
        return getDefaultImage();
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__TEXT_PROPERTY_NAME:
        return getTextPropertyName();
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__PROPERTY_BASED_IMAGES:
        return getPropertyBasedImages();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__REQUIRED_NEO4J_LABEL:
        getRequiredNeo4jLabel().clear();
        getRequiredNeo4jLabel().addAll((Collection<? extends String>)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__DEFAULT_IMAGE:
        setDefaultImage((String)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__TEXT_PROPERTY_NAME:
        setTextPropertyName((String)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__PROPERTY_BASED_IMAGES:
        getPropertyBasedImages().clear();
        getPropertyBasedImages().addAll((Collection<? extends PropertyBasedImageMapper>)newValue);
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
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__REQUIRED_NEO4J_LABEL:
        getRequiredNeo4jLabel().clear();
        return;
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__DEFAULT_IMAGE:
        setDefaultImage(DEFAULT_IMAGE_EDEFAULT);
        return;
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__TEXT_PROPERTY_NAME:
        setTextPropertyName(TEXT_PROPERTY_NAME_EDEFAULT);
        return;
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__PROPERTY_BASED_IMAGES:
        getPropertyBasedImages().clear();
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
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__REQUIRED_NEO4J_LABEL:
        return requiredNeo4jLabel != null && !requiredNeo4jLabel.isEmpty();
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__DEFAULT_IMAGE:
        return DEFAULT_IMAGE_EDEFAULT == null ? defaultImage != null : !DEFAULT_IMAGE_EDEFAULT.equals(defaultImage);
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__TEXT_PROPERTY_NAME:
        return TEXT_PROPERTY_NAME_EDEFAULT == null ? textPropertyName != null : !TEXT_PROPERTY_NAME_EDEFAULT.equals(textPropertyName);
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER__PROPERTY_BASED_IMAGES:
        return propertyBasedImages != null && !propertyBasedImages.isEmpty();
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
    result.append(" (requiredNeo4jLabel: ");
    result.append(requiredNeo4jLabel);
    result.append(", defaultImage: ");
    result.append(defaultImage);
    result.append(", textPropertyName: ");
    result.append(textPropertyName);
    result.append(')');
    return result.toString();
  }

} //NodeLabelMapperImpl
