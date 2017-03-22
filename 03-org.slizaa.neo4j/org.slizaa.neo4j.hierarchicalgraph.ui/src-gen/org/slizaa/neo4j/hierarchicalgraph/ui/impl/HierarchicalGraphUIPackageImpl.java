/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osgi.framework.Bundle;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDslPackage;

import org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIFactory;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage;
import org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList;
import org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchicalGraphUIPackageImpl extends EPackageImpl implements HierarchicalGraphUIPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iSlizaaMappingDescriptorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bundleBasedMappingDescriptorEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workspaceBasedMappingDescriptorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingDescriptorContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingDescriptorListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType bundleEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HierarchicalGraphUIPackageImpl() {
    super(eNS_URI, HierarchicalGraphUIFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link HierarchicalGraphUIPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HierarchicalGraphUIPackage init() {
    if (isInited) return (HierarchicalGraphUIPackage)EPackage.Registry.INSTANCE.getEPackage(HierarchicalGraphUIPackage.eNS_URI);

    // Obtain or create and register package
    HierarchicalGraphUIPackageImpl theHierarchicalGraphUIPackage = (HierarchicalGraphUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HierarchicalGraphUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HierarchicalGraphUIPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    MappingDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theHierarchicalGraphUIPackage.createPackageContents();

    // Initialize created meta-data
    theHierarchicalGraphUIPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHierarchicalGraphUIPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HierarchicalGraphUIPackage.eNS_URI, theHierarchicalGraphUIPackage);
    return theHierarchicalGraphUIPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getISlizaaMappingDescriptor() {
    return iSlizaaMappingDescriptorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getISlizaaMappingDescriptor_MappingDescriptor() {
    return (EReference)iSlizaaMappingDescriptorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getISlizaaMappingDescriptor_QualifiedName() {
    return (EAttribute)iSlizaaMappingDescriptorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getISlizaaMappingDescriptor_Name() {
    return (EAttribute)iSlizaaMappingDescriptorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getISlizaaMappingDescriptor_Description() {
    return (EAttribute)iSlizaaMappingDescriptorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getISlizaaMappingDescriptor__ResolveImage__String() {
    return iSlizaaMappingDescriptorEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBundleBasedMappingDescriptor() {
    return bundleBasedMappingDescriptorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBundleBasedMappingDescriptor_Bundle() {
    return (EAttribute)bundleBasedMappingDescriptorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBundleBasedMappingDescriptor_BasePath() {
    return (EAttribute)bundleBasedMappingDescriptorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkspaceBasedMappingDescriptor() {
    return workspaceBasedMappingDescriptorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkspaceBasedMappingDescriptor_BasePath() {
    return (EAttribute)workspaceBasedMappingDescriptorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingDescriptorContainer() {
    return mappingDescriptorContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingDescriptorContainer_BundleBasedMappingDescriptors() {
    return (EReference)mappingDescriptorContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingDescriptorContainer_WorkspaceBasedMappingDescriptors() {
    return (EReference)mappingDescriptorContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingDescriptorList() {
    return mappingDescriptorListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingDescriptorList_Name() {
    return (EAttribute)mappingDescriptorListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingDescriptorList_MappingDescriptors() {
    return (EReference)mappingDescriptorListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getBundle() {
    return bundleEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalGraphUIFactory getHierarchicalGraphUIFactory() {
    return (HierarchicalGraphUIFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    iSlizaaMappingDescriptorEClass = createEClass(ISLIZAA_MAPPING_DESCRIPTOR);
    createEReference(iSlizaaMappingDescriptorEClass, ISLIZAA_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR);
    createEAttribute(iSlizaaMappingDescriptorEClass, ISLIZAA_MAPPING_DESCRIPTOR__QUALIFIED_NAME);
    createEAttribute(iSlizaaMappingDescriptorEClass, ISLIZAA_MAPPING_DESCRIPTOR__NAME);
    createEAttribute(iSlizaaMappingDescriptorEClass, ISLIZAA_MAPPING_DESCRIPTOR__DESCRIPTION);
    createEOperation(iSlizaaMappingDescriptorEClass, ISLIZAA_MAPPING_DESCRIPTOR___RESOLVE_IMAGE__STRING);

    bundleBasedMappingDescriptorEClass = createEClass(BUNDLE_BASED_MAPPING_DESCRIPTOR);
    createEAttribute(bundleBasedMappingDescriptorEClass, BUNDLE_BASED_MAPPING_DESCRIPTOR__BUNDLE);
    createEAttribute(bundleBasedMappingDescriptorEClass, BUNDLE_BASED_MAPPING_DESCRIPTOR__BASE_PATH);

    workspaceBasedMappingDescriptorEClass = createEClass(WORKSPACE_BASED_MAPPING_DESCRIPTOR);
    createEAttribute(workspaceBasedMappingDescriptorEClass, WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH);

    mappingDescriptorContainerEClass = createEClass(MAPPING_DESCRIPTOR_CONTAINER);
    createEReference(mappingDescriptorContainerEClass, MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS);
    createEReference(mappingDescriptorContainerEClass, MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS);

    mappingDescriptorListEClass = createEClass(MAPPING_DESCRIPTOR_LIST);
    createEAttribute(mappingDescriptorListEClass, MAPPING_DESCRIPTOR_LIST__NAME);
    createEReference(mappingDescriptorListEClass, MAPPING_DESCRIPTOR_LIST__MAPPING_DESCRIPTORS);

    // Create data types
    bundleEDataType = createEDataType(BUNDLE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    MappingDslPackage theMappingDslPackage = (MappingDslPackage)EPackage.Registry.INSTANCE.getEPackage(MappingDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    bundleBasedMappingDescriptorEClass.getESuperTypes().add(this.getISlizaaMappingDescriptor());
    workspaceBasedMappingDescriptorEClass.getESuperTypes().add(this.getISlizaaMappingDescriptor());

    // Initialize classes, features, and operations; add parameters
    initEClass(iSlizaaMappingDescriptorEClass, ISlizaaMappingDescriptor.class, "ISlizaaMappingDescriptor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getISlizaaMappingDescriptor_MappingDescriptor(), theMappingDslPackage.getMappingDescriptor(), null, "mappingDescriptor", null, 0, 1, ISlizaaMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getISlizaaMappingDescriptor_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, ISlizaaMappingDescriptor.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getISlizaaMappingDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, ISlizaaMappingDescriptor.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getISlizaaMappingDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1, ISlizaaMappingDescriptor.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getISlizaaMappingDescriptor__ResolveImage__String(), ecorePackage.getEString(), "resolveImage", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "relativeImagePath", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(bundleBasedMappingDescriptorEClass, BundleBasedMappingDescriptor.class, "BundleBasedMappingDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBundleBasedMappingDescriptor_Bundle(), this.getBundle(), "bundle", null, 0, 1, BundleBasedMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBundleBasedMappingDescriptor_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, BundleBasedMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workspaceBasedMappingDescriptorEClass, WorkspaceBasedMappingDescriptor.class, "WorkspaceBasedMappingDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkspaceBasedMappingDescriptor_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, WorkspaceBasedMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingDescriptorContainerEClass, MappingDescriptorContainer.class, "MappingDescriptorContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingDescriptorContainer_BundleBasedMappingDescriptors(), this.getMappingDescriptorList(), null, "bundleBasedMappingDescriptors", null, 1, 1, MappingDescriptorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingDescriptorContainer_WorkspaceBasedMappingDescriptors(), this.getMappingDescriptorList(), null, "workspaceBasedMappingDescriptors", null, 1, 1, MappingDescriptorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingDescriptorListEClass, MappingDescriptorList.class, "MappingDescriptorList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingDescriptorList_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingDescriptorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingDescriptorList_MappingDescriptors(), this.getISlizaaMappingDescriptor(), null, "mappingDescriptors", null, 0, -1, MappingDescriptorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(bundleEDataType, Bundle.class, "Bundle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //HierarchicalGraphUIPackageImpl
