/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.slizaa.hierarchicalgraph.DefaultHGDependencySource;
import org.slizaa.hierarchicalgraph.DefaultHGNodeSource;
import org.slizaa.hierarchicalgraph.DependencyType;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGDependencySource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchicalgraphPackageImpl extends EPackageImpl implements HierarchicalgraphPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hgNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hgNodeSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hgDependencySourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hgRootNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultHGNodeSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultHGDependencySourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hgDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeToDependencyMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringToStringMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierToNodeMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeToDependenciesMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dependencyTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iItemLabelProviderEDataType = null;

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
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HierarchicalgraphPackageImpl() {
    super(eNS_URI, HierarchicalgraphFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link HierarchicalgraphPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HierarchicalgraphPackage init() {
    if (isInited) return (HierarchicalgraphPackage)EPackage.Registry.INSTANCE.getEPackage(HierarchicalgraphPackage.eNS_URI);

    // Obtain or create and register package
    HierarchicalgraphPackageImpl theHierarchicalgraphPackage = (HierarchicalgraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HierarchicalgraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HierarchicalgraphPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theHierarchicalgraphPackage.createPackageContents();

    // Initialize created meta-data
    theHierarchicalgraphPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHierarchicalgraphPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HierarchicalgraphPackage.eNS_URI, theHierarchicalgraphPackage);
    return theHierarchicalgraphPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHGNode() {
    return hgNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNode_Parent() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNode_Children() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNode_NodeSource() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNode_IncomingCoreDependenciesMap() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNode_OutgoingCoreDependenciesMap() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNode_RootNode() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetIdentifier() {
    return hgNodeEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetIncomingDependenciesFrom__HGNode() {
    return hgNodeEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetIncomingDependenciesFrom__List() {
    return hgNodeEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetOutgoingDependenciesTo__HGNode() {
    return hgNodeEClass.getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetOutgoingDependenciesTo__List() {
    return hgNodeEClass.getEOperations().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetOutgoingCoreDependencies__boolean() {
    return hgNodeEClass.getEOperations().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetIncomingCoreDependencies__boolean() {
    return hgNodeEClass.getEOperations().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__IsPredecessorOf__HGNode() {
    return hgNodeEClass.getEOperations().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__IsSuccessorOf__HGNode() {
    return hgNodeEClass.getEOperations().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHGNodeSource() {
    return hgNodeSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGNodeSource_Identifier() {
    return (EAttribute)hgNodeSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNodeSource_Node() {
    return (EReference)hgNodeSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGNodeSource_AutoExpand() {
    return (EAttribute)hgNodeSourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EOperation getHGNodeSource__OnExpand() {
    return hgNodeSourceEClass.getEOperations().get(0);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EOperation getHGNodeSource__OnCollapse() {
    return hgNodeSourceEClass.getEOperations().get(1);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHGDependencySource() {
    return hgDependencySourceEClass;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGDependencySource_Identifier() {
    return (EAttribute)hgDependencySourceEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGDependencySource_Dependency() {
    return (EReference)hgDependencySourceEClass.getEStructuralFeatures().get(1);
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGDependencySource__OnResolveAggregatedCoreDependency() {
    return hgDependencySourceEClass.getEOperations().get(0);
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHGRootNode() {
    return hgRootNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGRootNode_ItemLabelProvider() {
    return (EAttribute)hgRootNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGRootNode_Name() {
    return (EAttribute)hgRootNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__InvalidateCaches() {
    return hgRootNodeEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__InitializeCaches() {
    return hgRootNodeEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__GetNode__Object() {
    return hgRootNodeEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultHGNodeSource() {
    return defaultHGNodeSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaultHGNodeSource_Properties() {
    return (EReference)defaultHGNodeSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultHGDependencySource() {
    return defaultHGDependencySourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaultHGDependencySource_Properties() {
    return (EReference)defaultHGDependencySourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHGDependency() {
    return hgDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGDependency_DependencySource() {
    return (EReference)hgDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGDependency_From() {
    return (EReference)hgDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGDependency_To() {
    return (EReference)hgDependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGDependency_Dependencies() {
    return (EReference)hgDependencyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGDependency_Type() {
    return (EAttribute)hgDependencyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGDependency__GetCoreDependencies() {
    return hgDependencyEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGDependency__GetWeight() {
    return hgDependencyEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGDependency__ResolveAggregatedCoreDependency() {
    return hgDependencyEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeToDependencyMap() {
    return nodeToDependencyMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeToDependencyMap_Key() {
    return (EReference)nodeToDependencyMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeToDependencyMap_Value() {
    return (EReference)nodeToDependencyMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringToStringMap() {
    return stringToStringMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringToStringMap_Key() {
    return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringToStringMap_Value() {
    return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifierToNodeMap() {
    return identifierToNodeMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifierToNodeMap_Key() {
    return (EAttribute)identifierToNodeMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentifierToNodeMap_Value() {
    return (EReference)identifierToNodeMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeToDependenciesMap() {
    return nodeToDependenciesMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeToDependenciesMap_Key() {
    return (EReference)nodeToDependenciesMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeToDependenciesMap_Value() {
    return (EReference)nodeToDependenciesMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDependencyType() {
    return dependencyTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIItemLabelProvider() {
    return iItemLabelProviderEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalgraphFactory getHierarchicalgraphFactory() {
    return (HierarchicalgraphFactory)getEFactoryInstance();
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
    hgNodeEClass = createEClass(HG_NODE);
    createEReference(hgNodeEClass, HG_NODE__ROOT_NODE);
    createEReference(hgNodeEClass, HG_NODE__PARENT);
    createEReference(hgNodeEClass, HG_NODE__CHILDREN);
    createEReference(hgNodeEClass, HG_NODE__NODE_SOURCE);
    createEReference(hgNodeEClass, HG_NODE__INCOMING_CORE_DEPENDENCIES_MAP);
    createEReference(hgNodeEClass, HG_NODE__OUTGOING_CORE_DEPENDENCIES_MAP);
    createEOperation(hgNodeEClass, HG_NODE___GET_IDENTIFIER);
    createEOperation(hgNodeEClass, HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__LIST);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__LIST);
    createEOperation(hgNodeEClass, HG_NODE___IS_PREDECESSOR_OF__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___IS_SUCCESSOR_OF__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_CORE_DEPENDENCIES__BOOLEAN);
    createEOperation(hgNodeEClass, HG_NODE___GET_INCOMING_CORE_DEPENDENCIES__BOOLEAN);

    hgNodeSourceEClass = createEClass(HG_NODE_SOURCE);
    createEAttribute(hgNodeSourceEClass, HG_NODE_SOURCE__IDENTIFIER);
    createEReference(hgNodeSourceEClass, HG_NODE_SOURCE__NODE);
    createEAttribute(hgNodeSourceEClass, HG_NODE_SOURCE__AUTO_EXPAND);
    createEOperation(hgNodeSourceEClass, HG_NODE_SOURCE___ON_EXPAND);
    createEOperation(hgNodeSourceEClass, HG_NODE_SOURCE___ON_COLLAPSE);

    hgDependencySourceEClass = createEClass(HG_DEPENDENCY_SOURCE);
    createEAttribute(hgDependencySourceEClass, HG_DEPENDENCY_SOURCE__IDENTIFIER);
    createEReference(hgDependencySourceEClass, HG_DEPENDENCY_SOURCE__DEPENDENCY);
    createEOperation(hgDependencySourceEClass, HG_DEPENDENCY_SOURCE___ON_RESOLVE_AGGREGATED_CORE_DEPENDENCY);

    hgRootNodeEClass = createEClass(HG_ROOT_NODE);
    createEAttribute(hgRootNodeEClass, HG_ROOT_NODE__ITEM_LABEL_PROVIDER);
    createEAttribute(hgRootNodeEClass, HG_ROOT_NODE__NAME);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INVALIDATE_CACHES);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INITIALIZE_CACHES);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___GET_NODE__OBJECT);

    defaultHGNodeSourceEClass = createEClass(DEFAULT_HG_NODE_SOURCE);
    createEReference(defaultHGNodeSourceEClass, DEFAULT_HG_NODE_SOURCE__PROPERTIES);

    defaultHGDependencySourceEClass = createEClass(DEFAULT_HG_DEPENDENCY_SOURCE);
    createEReference(defaultHGDependencySourceEClass, DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES);

    hgDependencyEClass = createEClass(HG_DEPENDENCY);
    createEReference(hgDependencyEClass, HG_DEPENDENCY__DEPENDENCY_SOURCE);
    createEReference(hgDependencyEClass, HG_DEPENDENCY__FROM);
    createEReference(hgDependencyEClass, HG_DEPENDENCY__TO);
    createEReference(hgDependencyEClass, HG_DEPENDENCY__DEPENDENCIES);
    createEAttribute(hgDependencyEClass, HG_DEPENDENCY__TYPE);
    createEOperation(hgDependencyEClass, HG_DEPENDENCY___GET_CORE_DEPENDENCIES);
    createEOperation(hgDependencyEClass, HG_DEPENDENCY___GET_WEIGHT);
    createEOperation(hgDependencyEClass, HG_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCY);

    nodeToDependencyMapEClass = createEClass(NODE_TO_DEPENDENCY_MAP);
    createEReference(nodeToDependencyMapEClass, NODE_TO_DEPENDENCY_MAP__KEY);
    createEReference(nodeToDependencyMapEClass, NODE_TO_DEPENDENCY_MAP__VALUE);

    stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
    createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
    createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);

    identifierToNodeMapEClass = createEClass(IDENTIFIER_TO_NODE_MAP);
    createEAttribute(identifierToNodeMapEClass, IDENTIFIER_TO_NODE_MAP__KEY);
    createEReference(identifierToNodeMapEClass, IDENTIFIER_TO_NODE_MAP__VALUE);

    nodeToDependenciesMapEClass = createEClass(NODE_TO_DEPENDENCIES_MAP);
    createEReference(nodeToDependenciesMapEClass, NODE_TO_DEPENDENCIES_MAP__KEY);
    createEReference(nodeToDependenciesMapEClass, NODE_TO_DEPENDENCIES_MAP__VALUE);

    // Create enums
    dependencyTypeEEnum = createEEnum(DEPENDENCY_TYPE);

    // Create data types
    iItemLabelProviderEDataType = createEDataType(IITEM_LABEL_PROVIDER);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    hgRootNodeEClass.getESuperTypes().add(this.getHGNode());
    defaultHGNodeSourceEClass.getESuperTypes().add(this.getHGNodeSource());
    defaultHGDependencySourceEClass.getESuperTypes().add(this.getHGDependencySource());

    // Initialize classes, features, and operations; add parameters
    initEClass(hgNodeEClass, HGNode.class, "HGNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHGNode_RootNode(), this.getHGRootNode(), null, "rootNode", null, 0, 1, HGNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_Parent(), this.getHGNode(), this.getHGNode_Children(), "parent", null, 0, 1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_Children(), this.getHGNode(), this.getHGNode_Parent(), "children", null, 0, -1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_NodeSource(), this.getHGNodeSource(), this.getHGNodeSource_Node(), "nodeSource", null, 0, 1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_IncomingCoreDependenciesMap(), this.getNodeToDependenciesMap(), null, "incomingCoreDependenciesMap", null, 0, -1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getHGNode_OutgoingCoreDependenciesMap(), this.getNodeToDependenciesMap(), null, "outgoingCoreDependenciesMap", null, 0, -1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEOperation(getHGNode__GetIdentifier(), ecorePackage.getEJavaObject(), "getIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

    EOperation op = initEOperation(getHGNode__GetIncomingDependenciesFrom__HGNode(), this.getHGDependency(), "getIncomingDependenciesFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetIncomingDependenciesFrom__List(), this.getHGDependency(), "getIncomingDependenciesFrom", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "nodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingDependenciesTo__HGNode(), this.getHGDependency(), "getOutgoingDependenciesTo", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "targetNode", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingDependenciesTo__List(), this.getHGDependency(), "getOutgoingDependenciesTo", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "targetNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__IsPredecessorOf__HGNode(), ecorePackage.getEBoolean(), "isPredecessorOf", 1, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "node", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__IsSuccessorOf__HGNode(), ecorePackage.getEBoolean(), "isSuccessorOf", 1, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "node", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingCoreDependencies__boolean(), this.getHGDependency(), "getOutgoingCoreDependencies", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEBoolean(), "includeChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetIncomingCoreDependencies__boolean(), this.getHGDependency(), "getIncomingCoreDependencies", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEBoolean(), "includeChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgNodeSourceEClass, HGNodeSource.class, "HGNodeSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGNodeSource_Identifier(), ecorePackage.getEJavaObject(), "identifier", null, 0, 1, HGNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNodeSource_Node(), this.getHGNode(), this.getHGNode_NodeSource(), "node", null, 0, 1, HGNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGNodeSource_AutoExpand(), ecorePackage.getEBoolean(), "autoExpand", null, 0, 1, HGNodeSource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEOperation(getHGNodeSource__OnExpand(), null, "onExpand", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getHGNodeSource__OnCollapse(), null, "onCollapse", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgDependencySourceEClass, HGDependencySource.class, "HGDependencySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGDependencySource_Identifier(), ecorePackage.getEJavaObject(), "identifier", null, 0, 1, HGDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGDependencySource_Dependency(), this.getHGDependency(), null, "dependency", null, 1, 1, HGDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGDependencySource__OnResolveAggregatedCoreDependency(), null, "onResolveAggregatedCoreDependency", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgRootNodeEClass, HGRootNode.class, "HGRootNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGRootNode_ItemLabelProvider(), this.getIItemLabelProvider(), "itemLabelProvider", null, 1, 1, HGRootNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGRootNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, HGRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGRootNode__InvalidateCaches(), null, "invalidateCaches", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getHGRootNode__InitializeCaches(), null, "initializeCaches", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__GetNode__Object(), this.getHGNode(), "getNode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEJavaObject(), "identifier", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(defaultHGNodeSourceEClass, DefaultHGNodeSource.class, "DefaultHGNodeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefaultHGNodeSource_Properties(), this.getStringToStringMap(), null, "properties", null, 0, -1, DefaultHGNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultHGDependencySourceEClass, DefaultHGDependencySource.class, "DefaultHGDependencySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefaultHGDependencySource_Properties(), this.getStringToStringMap(), null, "properties", null, 0, -1, DefaultHGDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hgDependencyEClass, HGDependency.class, "HGDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHGDependency_DependencySource(), this.getHGDependencySource(), null, "dependencySource", null, 1, 1, HGDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGDependency_From(), this.getHGNode(), null, "from", null, 1, 1, HGDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGDependency_To(), this.getHGNode(), null, "to", null, 1, 1, HGDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGDependency_Dependencies(), this.getHGDependency(), null, "dependencies", null, 0, -1, HGDependency.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGDependency_Type(), this.getDependencyType(), "type", null, 0, 1, HGDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGDependency__GetCoreDependencies(), this.getHGDependency(), "getCoreDependencies", 0, -1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getHGDependency__GetWeight(), ecorePackage.getEInt(), "getWeight", 1, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getHGDependency__ResolveAggregatedCoreDependency(), null, "resolveAggregatedCoreDependency", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(nodeToDependencyMapEClass, Map.Entry.class, "NodeToDependencyMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeToDependencyMap_Key(), this.getHGNode(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeToDependencyMap_Value(), this.getHGDependency(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringToStringMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringToStringMap_Value(), ecorePackage.getEString(), "value", "", 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierToNodeMapEClass, Map.Entry.class, "IdentifierToNodeMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdentifierToNodeMap_Key(), ecorePackage.getEJavaObject(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdentifierToNodeMap_Value(), this.getHGNode(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeToDependenciesMapEClass, Map.Entry.class, "NodeToDependenciesMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeToDependenciesMap_Key(), this.getHGNode(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeToDependenciesMap_Value(), this.getHGDependency(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(dependencyTypeEEnum, DependencyType.class, "DependencyType");
    addEEnumLiteral(dependencyTypeEEnum, DependencyType.CORE_DEPENDENCY);
    addEEnumLiteral(dependencyTypeEEnum, DependencyType.AGGREGATED_DEPENDENCY);
    addEEnumLiteral(dependencyTypeEEnum, DependencyType.AGGREGATED_CORE_DEPENDENCY);

    // Initialize data types
    initEDataType(iItemLabelProviderEDataType, IItemLabelProvider.class, "IItemLabelProvider", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //HierarchicalgraphPackageImpl
