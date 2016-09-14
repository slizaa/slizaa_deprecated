/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.util.Map;

import java.util.concurrent.Future;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.DefaultHGDependencySource;
import org.slizaa.hierarchicalgraph.DefaultHGNodeSource;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGDependencySource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

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
  private EClass abstractHGDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hgAggregatedDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hgCoreDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeToCoreDependencyMapEClass = null;

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
  private EClass nodeToCoreDependenciesMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iItemLabelProviderEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType futureEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iAggregatedCoreDependencyResolverEDataType = null;

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
    return hgNodeEClass.getEOperations().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetIncomingDependenciesFrom__List() {
    return hgNodeEClass.getEOperations().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetOutgoingDependenciesTo__HGNode() {
    return hgNodeEClass.getEOperations().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetOutgoingDependenciesTo__List() {
    return hgNodeEClass.getEOperations().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__ResolveIncomingAggregatedCoreDependencies__boolean() {
    return hgNodeEClass.getEOperations().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__ResolveOutgoingAggregatedCoreDependencies__boolean() {
    return hgNodeEClass.getEOperations().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetOutgoingCoreDependencies__boolean() {
    return hgNodeEClass.getEOperations().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetIncomingCoreDependencies__boolean() {
    return hgNodeEClass.getEOperations().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetPredecessors() {
    return hgNodeEClass.getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__IsPredecessorOf__HGNode() {
    return hgNodeEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__IsSuccessorOf__HGNode() {
    return hgNodeEClass.getEOperations().get(2);
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
  public EClass getHGRootNode() {
    return hgRootNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGRootNode_ItemLabelProvider() {
    return (EAttribute)hgRootNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGRootNode_AggregatedCoreDependencyResolver() {
    return (EAttribute)hgRootNodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__InvalidateAllCaches() {
    return hgRootNodeEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__InvalidateCaches__List() {
    return hgRootNodeEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGRootNode_Name() {
    return (EAttribute)hgRootNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__LookupNode__Object() {
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
  public EClass getAbstractHGDependency() {
    return abstractHGDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractHGDependency_From() {
    return (EReference)abstractHGDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractHGDependency_To() {
    return (EReference)abstractHGDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getAbstractHGDependency__GetRootNode() {
    return abstractHGDependencyEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getAbstractHGDependency__ResolveAggregatedCoreDependencies() {
    return abstractHGDependencyEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHGAggregatedDependency() {
    return hgAggregatedDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGAggregatedDependency_CoreDependencies() {
    return (EReference)hgAggregatedDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGAggregatedDependency_Initialized() {
    return (EAttribute)hgAggregatedDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGAggregatedDependency__GetAggregatedWeight() {
    return hgAggregatedDependencyEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHGCoreDependency() {
    return hgCoreDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGCoreDependency_Type() {
    return (EAttribute)hgCoreDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGCoreDependency_Weight() {
    return (EAttribute)hgCoreDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGCoreDependency_AggregatedCoreDependency() {
    return (EAttribute)hgCoreDependencyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGCoreDependency_AggregatedCoreDependencyResolved() {
    return (EAttribute)hgCoreDependencyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGCoreDependency_DependencySource() {
    return (EReference)hgCoreDependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeToCoreDependencyMap() {
    return nodeToCoreDependencyMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeToCoreDependencyMap_Key() {
    return (EReference)nodeToCoreDependencyMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeToCoreDependencyMap_Value() {
    return (EReference)nodeToCoreDependencyMapEClass.getEStructuralFeatures().get(1);
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
  public EClass getNodeToCoreDependenciesMap() {
    return nodeToCoreDependenciesMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeToCoreDependenciesMap_Key() {
    return (EReference)nodeToCoreDependenciesMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeToCoreDependenciesMap_Value() {
    return (EReference)nodeToCoreDependenciesMapEClass.getEStructuralFeatures().get(1);
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
  public EDataType getFuture() {
    return futureEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIAggregatedCoreDependencyResolver() {
    return iAggregatedCoreDependencyResolverEDataType;
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
    createEOperation(hgNodeEClass, HG_NODE___IS_PREDECESSOR_OF__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___IS_SUCCESSOR_OF__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_PREDECESSORS);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_CORE_DEPENDENCIES__BOOLEAN);
    createEOperation(hgNodeEClass, HG_NODE___GET_INCOMING_CORE_DEPENDENCIES__BOOLEAN);
    createEOperation(hgNodeEClass, HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__LIST);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__LIST);
    createEOperation(hgNodeEClass, HG_NODE___RESOLVE_INCOMING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN);
    createEOperation(hgNodeEClass, HG_NODE___RESOLVE_OUTGOING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN);

    hgNodeSourceEClass = createEClass(HG_NODE_SOURCE);
    createEAttribute(hgNodeSourceEClass, HG_NODE_SOURCE__IDENTIFIER);
    createEReference(hgNodeSourceEClass, HG_NODE_SOURCE__NODE);
    createEAttribute(hgNodeSourceEClass, HG_NODE_SOURCE__AUTO_EXPAND);
    createEOperation(hgNodeSourceEClass, HG_NODE_SOURCE___ON_EXPAND);
    createEOperation(hgNodeSourceEClass, HG_NODE_SOURCE___ON_COLLAPSE);

    hgDependencySourceEClass = createEClass(HG_DEPENDENCY_SOURCE);
    createEAttribute(hgDependencySourceEClass, HG_DEPENDENCY_SOURCE__IDENTIFIER);
    createEReference(hgDependencySourceEClass, HG_DEPENDENCY_SOURCE__DEPENDENCY);

    hgRootNodeEClass = createEClass(HG_ROOT_NODE);
    createEAttribute(hgRootNodeEClass, HG_ROOT_NODE__NAME);
    createEAttribute(hgRootNodeEClass, HG_ROOT_NODE__ITEM_LABEL_PROVIDER);
    createEAttribute(hgRootNodeEClass, HG_ROOT_NODE__AGGREGATED_CORE_DEPENDENCY_RESOLVER);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INVALIDATE_ALL_CACHES);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INVALIDATE_CACHES__LIST);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___LOOKUP_NODE__OBJECT);

    defaultHGNodeSourceEClass = createEClass(DEFAULT_HG_NODE_SOURCE);
    createEReference(defaultHGNodeSourceEClass, DEFAULT_HG_NODE_SOURCE__PROPERTIES);

    defaultHGDependencySourceEClass = createEClass(DEFAULT_HG_DEPENDENCY_SOURCE);
    createEReference(defaultHGDependencySourceEClass, DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES);

    abstractHGDependencyEClass = createEClass(ABSTRACT_HG_DEPENDENCY);
    createEReference(abstractHGDependencyEClass, ABSTRACT_HG_DEPENDENCY__FROM);
    createEReference(abstractHGDependencyEClass, ABSTRACT_HG_DEPENDENCY__TO);
    createEOperation(abstractHGDependencyEClass, ABSTRACT_HG_DEPENDENCY___GET_ROOT_NODE);
    createEOperation(abstractHGDependencyEClass, ABSTRACT_HG_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES);

    hgAggregatedDependencyEClass = createEClass(HG_AGGREGATED_DEPENDENCY);
    createEReference(hgAggregatedDependencyEClass, HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES);
    createEAttribute(hgAggregatedDependencyEClass, HG_AGGREGATED_DEPENDENCY__INITIALIZED);
    createEOperation(hgAggregatedDependencyEClass, HG_AGGREGATED_DEPENDENCY___GET_AGGREGATED_WEIGHT);

    hgCoreDependencyEClass = createEClass(HG_CORE_DEPENDENCY);
    createEAttribute(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__TYPE);
    createEAttribute(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__WEIGHT);
    createEReference(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE);
    createEAttribute(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY);
    createEAttribute(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_RESOLVED);

    nodeToCoreDependencyMapEClass = createEClass(NODE_TO_CORE_DEPENDENCY_MAP);
    createEReference(nodeToCoreDependencyMapEClass, NODE_TO_CORE_DEPENDENCY_MAP__KEY);
    createEReference(nodeToCoreDependencyMapEClass, NODE_TO_CORE_DEPENDENCY_MAP__VALUE);

    stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
    createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
    createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);

    identifierToNodeMapEClass = createEClass(IDENTIFIER_TO_NODE_MAP);
    createEAttribute(identifierToNodeMapEClass, IDENTIFIER_TO_NODE_MAP__KEY);
    createEReference(identifierToNodeMapEClass, IDENTIFIER_TO_NODE_MAP__VALUE);

    nodeToCoreDependenciesMapEClass = createEClass(NODE_TO_CORE_DEPENDENCIES_MAP);
    createEReference(nodeToCoreDependenciesMapEClass, NODE_TO_CORE_DEPENDENCIES_MAP__KEY);
    createEReference(nodeToCoreDependenciesMapEClass, NODE_TO_CORE_DEPENDENCIES_MAP__VALUE);

    // Create data types
    iItemLabelProviderEDataType = createEDataType(IITEM_LABEL_PROVIDER);
    futureEDataType = createEDataType(FUTURE);
    iAggregatedCoreDependencyResolverEDataType = createEDataType(IAGGREGATED_CORE_DEPENDENCY_RESOLVER);
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
    addETypeParameter(futureEDataType, "T");

    // Set bounds for type parameters

    // Add supertypes to classes
    hgRootNodeEClass.getESuperTypes().add(this.getHGNode());
    defaultHGNodeSourceEClass.getESuperTypes().add(this.getHGNodeSource());
    defaultHGDependencySourceEClass.getESuperTypes().add(this.getHGDependencySource());
    hgAggregatedDependencyEClass.getESuperTypes().add(this.getAbstractHGDependency());
    hgCoreDependencyEClass.getESuperTypes().add(this.getAbstractHGDependency());

    // Initialize classes, features, and operations; add parameters
    initEClass(hgNodeEClass, HGNode.class, "HGNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHGNode_RootNode(), this.getHGRootNode(), null, "rootNode", null, 0, 1, HGNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_Parent(), this.getHGNode(), this.getHGNode_Children(), "parent", null, 0, 1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_Children(), this.getHGNode(), this.getHGNode_Parent(), "children", null, 0, -1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_NodeSource(), this.getHGNodeSource(), this.getHGNodeSource_Node(), "nodeSource", null, 0, 1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_IncomingCoreDependenciesMap(), this.getNodeToCoreDependenciesMap(), null, "incomingCoreDependenciesMap", null, 0, -1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getHGNode_OutgoingCoreDependenciesMap(), this.getNodeToCoreDependenciesMap(), null, "outgoingCoreDependenciesMap", null, 0, -1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEOperation(getHGNode__GetIdentifier(), ecorePackage.getEJavaObject(), "getIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

    EOperation op = initEOperation(getHGNode__IsPredecessorOf__HGNode(), ecorePackage.getEBoolean(), "isPredecessorOf", 1, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "node", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__IsSuccessorOf__HGNode(), ecorePackage.getEBoolean(), "isSuccessorOf", 1, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "node", 1, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getHGNode__GetPredecessors(), this.getHGNode(), "getPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingCoreDependencies__boolean(), this.getHGCoreDependency(), "getOutgoingCoreDependencies", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEBoolean(), "includeChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetIncomingCoreDependencies__boolean(), this.getHGCoreDependency(), "getIncomingCoreDependencies", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEBoolean(), "includeChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetIncomingDependenciesFrom__HGNode(), this.getHGAggregatedDependency(), "getIncomingDependenciesFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetIncomingDependenciesFrom__List(), this.getHGAggregatedDependency(), "getIncomingDependenciesFrom", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "nodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingDependenciesTo__HGNode(), this.getHGAggregatedDependency(), "getOutgoingDependenciesTo", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "targetNode", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingDependenciesTo__List(), this.getHGAggregatedDependency(), "getOutgoingDependenciesTo", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "targetNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__ResolveIncomingAggregatedCoreDependencies__boolean(), null, "resolveIncomingAggregatedCoreDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEBoolean(), "includeChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__ResolveOutgoingAggregatedCoreDependencies__boolean(), null, "resolveOutgoingAggregatedCoreDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEBoolean(), "includeChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgNodeSourceEClass, HGNodeSource.class, "HGNodeSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGNodeSource_Identifier(), ecorePackage.getEJavaObject(), "identifier", null, 0, 1, HGNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNodeSource_Node(), this.getHGNode(), this.getHGNode_NodeSource(), "node", null, 0, 1, HGNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGNodeSource_AutoExpand(), ecorePackage.getEBoolean(), "autoExpand", null, 0, 1, HGNodeSource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEOperation(getHGNodeSource__OnExpand(), null, "onExpand", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getHGNodeSource__OnCollapse(), null, "onCollapse", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgDependencySourceEClass, HGDependencySource.class, "HGDependencySource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGDependencySource_Identifier(), ecorePackage.getEJavaObject(), "identifier", null, 0, 1, HGDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGDependencySource_Dependency(), this.getHGCoreDependency(), this.getHGCoreDependency_DependencySource(), "dependency", null, 1, 1, HGDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hgRootNodeEClass, HGRootNode.class, "HGRootNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGRootNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, HGRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGRootNode_ItemLabelProvider(), this.getIItemLabelProvider(), "itemLabelProvider", null, 1, 1, HGRootNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGRootNode_AggregatedCoreDependencyResolver(), this.getIAggregatedCoreDependencyResolver(), "aggregatedCoreDependencyResolver", null, 0, 1, HGRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGRootNode__InvalidateAllCaches(), null, "invalidateAllCaches", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__InvalidateCaches__List(), null, "invalidateCaches", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "modifiedNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__LookupNode__Object(), this.getHGNode(), "lookupNode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEJavaObject(), "identifier", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(defaultHGNodeSourceEClass, DefaultHGNodeSource.class, "DefaultHGNodeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefaultHGNodeSource_Properties(), this.getStringToStringMap(), null, "properties", null, 0, -1, DefaultHGNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultHGDependencySourceEClass, DefaultHGDependencySource.class, "DefaultHGDependencySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefaultHGDependencySource_Properties(), this.getStringToStringMap(), null, "properties", null, 0, -1, DefaultHGDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractHGDependencyEClass, AbstractHGDependency.class, "AbstractHGDependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractHGDependency_From(), this.getHGNode(), null, "from", null, 1, 1, AbstractHGDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractHGDependency_To(), this.getHGNode(), null, "to", null, 1, 1, AbstractHGDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getAbstractHGDependency__GetRootNode(), this.getHGRootNode(), "getRootNode", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getAbstractHGDependency__ResolveAggregatedCoreDependencies(), null, "resolveAggregatedCoreDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgAggregatedDependencyEClass, HGAggregatedDependency.class, "HGAggregatedDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHGAggregatedDependency_CoreDependencies(), this.getHGCoreDependency(), null, "coreDependencies", null, 0, -1, HGAggregatedDependency.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGAggregatedDependency_Initialized(), ecorePackage.getEBoolean(), "initialized", null, 0, 1, HGAggregatedDependency.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGAggregatedDependency__GetAggregatedWeight(), ecorePackage.getEInt(), "getAggregatedWeight", 1, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgCoreDependencyEClass, HGCoreDependency.class, "HGCoreDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGCoreDependency_Type(), ecorePackage.getEString(), "type", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGCoreDependency_Weight(), ecorePackage.getEInt(), "weight", "1", 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGCoreDependency_DependencySource(), this.getHGDependencySource(), this.getHGDependencySource_Dependency(), "dependencySource", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGCoreDependency_AggregatedCoreDependency(), ecorePackage.getEBoolean(), "aggregatedCoreDependency", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGCoreDependency_AggregatedCoreDependencyResolved(), ecorePackage.getEBoolean(), "aggregatedCoreDependencyResolved", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeToCoreDependencyMapEClass, Map.Entry.class, "NodeToCoreDependencyMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeToCoreDependencyMap_Key(), this.getHGNode(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeToCoreDependencyMap_Value(), this.getHGCoreDependency(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringToStringMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringToStringMap_Value(), ecorePackage.getEString(), "value", "", 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierToNodeMapEClass, Map.Entry.class, "IdentifierToNodeMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdentifierToNodeMap_Key(), ecorePackage.getEJavaObject(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdentifierToNodeMap_Value(), this.getHGNode(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeToCoreDependenciesMapEClass, Map.Entry.class, "NodeToCoreDependenciesMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeToCoreDependenciesMap_Key(), this.getHGNode(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeToCoreDependenciesMap_Value(), this.getHGCoreDependency(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(iItemLabelProviderEDataType, IItemLabelProvider.class, "IItemLabelProvider", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(futureEDataType, Future.class, "Future", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(iAggregatedCoreDependencyResolverEDataType, IAggregatedCoreDependencyResolver.class, "IAggregatedCoreDependencyResolver", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //HierarchicalgraphPackageImpl
