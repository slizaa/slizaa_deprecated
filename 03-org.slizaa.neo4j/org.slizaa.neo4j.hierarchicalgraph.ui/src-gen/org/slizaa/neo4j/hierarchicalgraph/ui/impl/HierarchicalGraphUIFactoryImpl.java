/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osgi.framework.Bundle;
import org.slizaa.neo4j.hierarchicalgraph.ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchicalGraphUIFactoryImpl extends EFactoryImpl implements HierarchicalGraphUIFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HierarchicalGraphUIFactory init() {
    try {
      HierarchicalGraphUIFactory theHierarchicalGraphUIFactory = (HierarchicalGraphUIFactory)EPackage.Registry.INSTANCE.getEFactory(HierarchicalGraphUIPackage.eNS_URI);
      if (theHierarchicalGraphUIFactory != null) {
        return theHierarchicalGraphUIFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HierarchicalGraphUIFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalGraphUIFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case HierarchicalGraphUIPackage.BUNDLE_BASED_MAPPING_DESCRIPTOR: return createBundleBasedMappingDescriptor();
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR: return createWorkspaceBasedMappingDescriptor();
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER: return createMappingDescriptorContainer();
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_LIST: return createMappingDescriptorList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case HierarchicalGraphUIPackage.BUNDLE:
        return createBundleFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case HierarchicalGraphUIPackage.BUNDLE:
        return convertBundleToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public BundleBasedMappingDescriptor createBundleBasedMappingDescriptor() {
    BundleBasedMappingDescriptorImpl bundleBasedMappingDescriptor = new ExtendedBundleBasedMappingDescriptorImpl();
    return bundleBasedMappingDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public WorkspaceBasedMappingDescriptor createWorkspaceBasedMappingDescriptor() {
    WorkspaceBasedMappingDescriptorImpl workspaceBasedMappingDescriptor = new ExtendedWorkspaceBasedMappingDescriptorImpl();
    return workspaceBasedMappingDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDescriptorContainer createMappingDescriptorContainer() {
    MappingDescriptorContainerImpl mappingDescriptorContainer = new MappingDescriptorContainerImpl();
    return mappingDescriptorContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDescriptorList createMappingDescriptorList() {
    MappingDescriptorListImpl mappingDescriptorList = new MappingDescriptorListImpl();
    return mappingDescriptorList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bundle createBundleFromString(EDataType eDataType, String initialValue) {
    return (Bundle)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBundleToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalGraphUIPackage getHierarchicalGraphUIPackage() {
    return (HierarchicalGraphUIPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HierarchicalGraphUIPackage getPackage() {
    return HierarchicalGraphUIPackage.eINSTANCE;
  }

} //HierarchicalGraphUIFactoryImpl
