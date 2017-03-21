/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDslPackage;

import org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIFactory;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage;
import org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescription;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer;
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
  private EClass iSlizaaMappingDescriptionEClass = null;

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
  public EClass getISlizaaMappingDescription() {
    return iSlizaaMappingDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getISlizaaMappingDescription_MappingDescriptor() {
    return (EReference)iSlizaaMappingDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getISlizaaMappingDescription__ResolveImage__String() {
    return iSlizaaMappingDescriptionEClass.getEOperations().get(0);
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
  public EAttribute getBundleBasedMappingDescriptor_BundleSymbolicName() {
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
    iSlizaaMappingDescriptionEClass = createEClass(ISLIZAA_MAPPING_DESCRIPTION);
    createEReference(iSlizaaMappingDescriptionEClass, ISLIZAA_MAPPING_DESCRIPTION__MAPPING_DESCRIPTOR);
    createEOperation(iSlizaaMappingDescriptionEClass, ISLIZAA_MAPPING_DESCRIPTION___RESOLVE_IMAGE__STRING);

    bundleBasedMappingDescriptorEClass = createEClass(BUNDLE_BASED_MAPPING_DESCRIPTOR);
    createEAttribute(bundleBasedMappingDescriptorEClass, BUNDLE_BASED_MAPPING_DESCRIPTOR__BUNDLE_SYMBOLIC_NAME);
    createEAttribute(bundleBasedMappingDescriptorEClass, BUNDLE_BASED_MAPPING_DESCRIPTOR__BASE_PATH);

    workspaceBasedMappingDescriptorEClass = createEClass(WORKSPACE_BASED_MAPPING_DESCRIPTOR);
    createEAttribute(workspaceBasedMappingDescriptorEClass, WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH);

    mappingDescriptorContainerEClass = createEClass(MAPPING_DESCRIPTOR_CONTAINER);
    createEReference(mappingDescriptorContainerEClass, MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS);
    createEReference(mappingDescriptorContainerEClass, MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS);
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
    bundleBasedMappingDescriptorEClass.getESuperTypes().add(this.getISlizaaMappingDescription());
    workspaceBasedMappingDescriptorEClass.getESuperTypes().add(this.getISlizaaMappingDescription());

    // Initialize classes, features, and operations; add parameters
    initEClass(iSlizaaMappingDescriptionEClass, ISlizaaMappingDescription.class, "ISlizaaMappingDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getISlizaaMappingDescription_MappingDescriptor(), theMappingDslPackage.getMappingDescriptor(), null, "mappingDescriptor", null, 0, 1, ISlizaaMappingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getISlizaaMappingDescription__ResolveImage__String(), null, "resolveImage", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "relativeImagePath", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(bundleBasedMappingDescriptorEClass, BundleBasedMappingDescriptor.class, "BundleBasedMappingDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBundleBasedMappingDescriptor_BundleSymbolicName(), ecorePackage.getEString(), "bundleSymbolicName", null, 0, 1, BundleBasedMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBundleBasedMappingDescriptor_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, BundleBasedMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workspaceBasedMappingDescriptorEClass, WorkspaceBasedMappingDescriptor.class, "WorkspaceBasedMappingDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkspaceBasedMappingDescriptor_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, WorkspaceBasedMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingDescriptorContainerEClass, MappingDescriptorContainer.class, "MappingDescriptorContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingDescriptorContainer_BundleBasedMappingDescriptors(), this.getBundleBasedMappingDescriptor(), null, "bundleBasedMappingDescriptors", null, 0, -1, MappingDescriptorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingDescriptorContainer_WorkspaceBasedMappingDescriptors(), this.getWorkspaceBasedMappingDescriptor(), null, "workspaceBasedMappingDescriptors", null, 0, -1, MappingDescriptorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HierarchicalGraphUIPackageImpl
