/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;

import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage;
import org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace Based Mapping Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.WorkspaceBasedMappingDescriptorImpl#getMappingDescriptor <em>Mapping Descriptor</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.WorkspaceBasedMappingDescriptorImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.WorkspaceBasedMappingDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.WorkspaceBasedMappingDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.WorkspaceBasedMappingDescriptorImpl#getBasePath <em>Base Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkspaceBasedMappingDescriptorImpl extends MinimalEObjectImpl.Container implements WorkspaceBasedMappingDescriptor {
  /**
   * The cached value of the '{@link #getMappingDescriptor() <em>Mapping Descriptor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingDescriptor()
   * @generated
   * @ordered
   */
  protected MappingDescriptor mappingDescriptor;

  /**
   * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIED_NAME_EDEFAULT = null;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePath()
   * @generated
   * @ordered
   */
  protected static final String BASE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePath()
   * @generated
   * @ordered
   */
  protected String basePath = BASE_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkspaceBasedMappingDescriptorImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalGraphUIPackage.Literals.WORKSPACE_BASED_MAPPING_DESCRIPTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDescriptor getMappingDescriptor() {
    if (mappingDescriptor != null && mappingDescriptor.eIsProxy()) {
      InternalEObject oldMappingDescriptor = (InternalEObject)mappingDescriptor;
      mappingDescriptor = (MappingDescriptor)eResolveProxy(oldMappingDescriptor);
      if (mappingDescriptor != oldMappingDescriptor) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR, oldMappingDescriptor, mappingDescriptor));
      }
    }
    return mappingDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDescriptor basicGetMappingDescriptor() {
    return mappingDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappingDescriptor(MappingDescriptor newMappingDescriptor) {
    MappingDescriptor oldMappingDescriptor = mappingDescriptor;
    mappingDescriptor = newMappingDescriptor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR, oldMappingDescriptor, mappingDescriptor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifiedName() {
    // TODO: implement this method to return the 'Qualified Name' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    // TODO: implement this method to return the 'Name' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription() {
    // TODO: implement this method to return the 'Description' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBasePath() {
    return basePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasePath(String newBasePath) {
    String oldBasePath = basePath;
    basePath = newBasePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH, oldBasePath, basePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String resolveImage(String relativeImagePath) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR:
        if (resolve) return getMappingDescriptor();
        return basicGetMappingDescriptor();
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__QUALIFIED_NAME:
        return getQualifiedName();
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__NAME:
        return getName();
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__DESCRIPTION:
        return getDescription();
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH:
        return getBasePath();
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
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR:
        setMappingDescriptor((MappingDescriptor)newValue);
        return;
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH:
        setBasePath((String)newValue);
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
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR:
        setMappingDescriptor((MappingDescriptor)null);
        return;
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH:
        setBasePath(BASE_PATH_EDEFAULT);
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
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR:
        return mappingDescriptor != null;
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__NAME:
        return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH:
        return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR___RESOLVE_IMAGE__STRING:
        return resolveImage((String)arguments.get(0));
    }
    return super.eInvoke(operationID, arguments);
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
    result.append(" (basePath: ");
    result.append(basePath);
    result.append(')');
    return result.toString();
  }

} //WorkspaceBasedMappingDescriptorImpl
