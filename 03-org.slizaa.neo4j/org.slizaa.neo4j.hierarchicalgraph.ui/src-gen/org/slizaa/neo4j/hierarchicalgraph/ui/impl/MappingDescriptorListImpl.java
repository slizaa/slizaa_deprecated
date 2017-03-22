/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage;
import org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Descriptor List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorListImpl#getMappingDescriptors <em>Mapping Descriptors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingDescriptorListImpl extends MinimalEObjectImpl.Container implements MappingDescriptorList {
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
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;
  /**
   * The cached value of the '{@link #getMappingDescriptors() <em>Mapping Descriptors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingDescriptors()
   * @generated
   * @ordered
   */
  protected EList<ISlizaaMappingDescriptor> mappingDescriptors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingDescriptorListImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalGraphUIPackage.Literals.MAPPING_DESCRIPTOR_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ISlizaaMappingDescriptor> getMappingDescriptors() {
    if (mappingDescriptors == null) {
      mappingDescriptors = new EObjectResolvingEList<ISlizaaMappingDescriptor>(ISlizaaMappingDescriptor.class, this, HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__MAPPING_DESCRIPTORS);
    }
    return mappingDescriptors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__NAME:
        return getName();
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__MAPPING_DESCRIPTORS:
        return getMappingDescriptors();
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
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__NAME:
        setName((String)newValue);
        return;
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__MAPPING_DESCRIPTORS:
        getMappingDescriptors().clear();
        getMappingDescriptors().addAll((Collection<? extends ISlizaaMappingDescriptor>)newValue);
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
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__MAPPING_DESCRIPTORS:
        getMappingDescriptors().clear();
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
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST__MAPPING_DESCRIPTORS:
        return mappingDescriptors != null && !mappingDescriptors.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MappingDescriptorListImpl
