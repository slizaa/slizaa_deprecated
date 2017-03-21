/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BundleBasedMappingDescriptor createBundleBasedMappingDescriptor() {
    BundleBasedMappingDescriptorImpl bundleBasedMappingDescriptor = new BundleBasedMappingDescriptorImpl();
    return bundleBasedMappingDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkspaceBasedMappingDescriptor createWorkspaceBasedMappingDescriptor() {
    WorkspaceBasedMappingDescriptorImpl workspaceBasedMappingDescriptor = new WorkspaceBasedMappingDescriptorImpl();
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
