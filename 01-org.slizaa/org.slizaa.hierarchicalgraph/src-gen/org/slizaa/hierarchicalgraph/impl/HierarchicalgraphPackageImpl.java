/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.util.Map;

import java.util.concurrent.Future;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.edit.provider.IItemLabelProvider;

import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.DefaultDependencySource;
import org.slizaa.hierarchicalgraph.DefaultNodeSource;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.ICoreDependenciesList;
import org.slizaa.hierarchicalgraph.IDependencySource;
import org.slizaa.hierarchicalgraph.INodeSource;
import org.slizaa.hierarchicalgraph.SourceOrTarget;

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
  private EClass iNodeSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iDependencySourceEClass = null;

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
  private EClass defaultNodeSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultDependencySourceEClass = null;

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
  private EClass hgAggregatedCoreDependencyEClass = null;

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
  private EClass iCoreDependenciesListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sourceOrTargetEEnum = null;

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
  public EReference getHGNode_RootNode() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(0);
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
  public EReference getHGNode_OutgoingCoreDependencies() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNode_AccumulatedOutgoingCoreDependencies() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNode_IncomingCoreDependencies() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGNode_AccumulatedIncomingCoreDependencies() {
    return (EReference)hgNodeEClass.getEStructuralFeatures().get(7);
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
  public EOperation getHGNode__GetPredecessors() {
    return hgNodeEClass.getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetIncomingDependenciesFrom__HGNode() {
    return hgNodeEClass.getEOperations().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetIncomingDependenciesFrom__EList() {
    return hgNodeEClass.getEOperations().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetOutgoingDependenciesTo__HGNode() {
    return hgNodeEClass.getEOperations().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetOutgoingDependenciesTo__EList() {
    return hgNodeEClass.getEOperations().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__ResolveIncomingAggregatedCoreDependencies__boolean() {
    return hgNodeEClass.getEOperations().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__ResolveOutgoingAggregatedCoreDependencies__boolean() {
    return hgNodeEClass.getEOperations().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getINodeSource() {
    return iNodeSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getINodeSource_Identifier() {
    return (EAttribute)iNodeSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getINodeSource_Node() {
    return (EReference)iNodeSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getINodeSource_AutoExpand() {
    return (EAttribute)iNodeSourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getINodeSource__OnExpand() {
    return iNodeSourceEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getINodeSource__OnCollapse() {
    return iNodeSourceEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIDependencySource() {
    return iDependencySourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIDependencySource_Identifier() {
    return (EAttribute)iDependencySourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDependencySource_Dependency() {
    return (EReference)iDependencySourceEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getHGRootNode_Name() {
    return (EAttribute)hgRootNodeEClass.getEStructuralFeatures().get(0);
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
  public EOperation getHGRootNode__InvalidateAllCaches() {
    return hgRootNodeEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__InvalidateCaches__EList() {
    return hgRootNodeEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__InitializeCaches__EList() {
    return hgRootNodeEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__LookupNode__Object() {
    return hgRootNodeEClass.getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__GetExtension__Class() {
    return hgRootNodeEClass.getEOperations().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__RegisterExtension__Class_Object() {
    return hgRootNodeEClass.getEOperations().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__HasExtension__Class() {
    return hgRootNodeEClass.getEOperations().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultNodeSource() {
    return defaultNodeSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaultNodeSource_Properties() {
    return (EReference)defaultNodeSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultDependencySource() {
    return defaultDependencySourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaultDependencySource_Properties() {
    return (EReference)defaultDependencySourceEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getHGAggregatedDependency_AggregatedWeight() {
    return (EAttribute)hgAggregatedDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGAggregatedDependency__ResolveAggregatedCoreDependencies() {
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
  public EReference getHGCoreDependency_DependencySource() {
    return (EReference)hgCoreDependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGCoreDependency_AggregatedCoreDependencyParent() {
    return (EReference)hgCoreDependencyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHGAggregatedCoreDependency() {
    return hgAggregatedCoreDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGAggregatedCoreDependency_Resolved() {
    return (EAttribute)hgAggregatedCoreDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGAggregatedCoreDependency_ResolvedCoreDependencies() {
    return (EReference)hgAggregatedCoreDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGAggregatedCoreDependency__ResolveAggregatedCoreDependencies() {
    return hgAggregatedCoreDependencyEClass.getEOperations().get(0);
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
  public EClass getICoreDependenciesList() {
    return iCoreDependenciesListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getICoreDependenciesList_CoreDependencies() {
    return (EReference)iCoreDependenciesListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSourceOrTarget() {
    return sourceOrTargetEEnum;
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
    createEReference(hgNodeEClass, HG_NODE__OUTGOING_CORE_DEPENDENCIES);
    createEReference(hgNodeEClass, HG_NODE__ACCUMULATED_OUTGOING_CORE_DEPENDENCIES);
    createEReference(hgNodeEClass, HG_NODE__INCOMING_CORE_DEPENDENCIES);
    createEReference(hgNodeEClass, HG_NODE__ACCUMULATED_INCOMING_CORE_DEPENDENCIES);
    createEOperation(hgNodeEClass, HG_NODE___GET_IDENTIFIER);
    createEOperation(hgNodeEClass, HG_NODE___IS_PREDECESSOR_OF__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___IS_SUCCESSOR_OF__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_PREDECESSORS);
    createEOperation(hgNodeEClass, HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__ELIST);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__ELIST);
    createEOperation(hgNodeEClass, HG_NODE___RESOLVE_INCOMING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN);
    createEOperation(hgNodeEClass, HG_NODE___RESOLVE_OUTGOING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN);

    iNodeSourceEClass = createEClass(INODE_SOURCE);
    createEAttribute(iNodeSourceEClass, INODE_SOURCE__IDENTIFIER);
    createEReference(iNodeSourceEClass, INODE_SOURCE__NODE);
    createEAttribute(iNodeSourceEClass, INODE_SOURCE__AUTO_EXPAND);
    createEOperation(iNodeSourceEClass, INODE_SOURCE___ON_EXPAND);
    createEOperation(iNodeSourceEClass, INODE_SOURCE___ON_COLLAPSE);

    iDependencySourceEClass = createEClass(IDEPENDENCY_SOURCE);
    createEAttribute(iDependencySourceEClass, IDEPENDENCY_SOURCE__IDENTIFIER);
    createEReference(iDependencySourceEClass, IDEPENDENCY_SOURCE__DEPENDENCY);

    hgRootNodeEClass = createEClass(HG_ROOT_NODE);
    createEAttribute(hgRootNodeEClass, HG_ROOT_NODE__NAME);
    createEAttribute(hgRootNodeEClass, HG_ROOT_NODE__ITEM_LABEL_PROVIDER);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INVALIDATE_ALL_CACHES);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INVALIDATE_CACHES__ELIST);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INITIALIZE_CACHES__ELIST);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___LOOKUP_NODE__OBJECT);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___GET_EXTENSION__CLASS);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___REGISTER_EXTENSION__CLASS_OBJECT);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___HAS_EXTENSION__CLASS);

    defaultNodeSourceEClass = createEClass(DEFAULT_NODE_SOURCE);
    createEReference(defaultNodeSourceEClass, DEFAULT_NODE_SOURCE__PROPERTIES);

    defaultDependencySourceEClass = createEClass(DEFAULT_DEPENDENCY_SOURCE);
    createEReference(defaultDependencySourceEClass, DEFAULT_DEPENDENCY_SOURCE__PROPERTIES);

    abstractHGDependencyEClass = createEClass(ABSTRACT_HG_DEPENDENCY);
    createEReference(abstractHGDependencyEClass, ABSTRACT_HG_DEPENDENCY__FROM);
    createEReference(abstractHGDependencyEClass, ABSTRACT_HG_DEPENDENCY__TO);
    createEOperation(abstractHGDependencyEClass, ABSTRACT_HG_DEPENDENCY___GET_ROOT_NODE);

    hgAggregatedDependencyEClass = createEClass(HG_AGGREGATED_DEPENDENCY);
    createEReference(hgAggregatedDependencyEClass, HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES);
    createEAttribute(hgAggregatedDependencyEClass, HG_AGGREGATED_DEPENDENCY__AGGREGATED_WEIGHT);
    createEOperation(hgAggregatedDependencyEClass, HG_AGGREGATED_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES);

    hgCoreDependencyEClass = createEClass(HG_CORE_DEPENDENCY);
    createEAttribute(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__TYPE);
    createEAttribute(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__WEIGHT);
    createEReference(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE);
    createEReference(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_PARENT);

    hgAggregatedCoreDependencyEClass = createEClass(HG_AGGREGATED_CORE_DEPENDENCY);
    createEAttribute(hgAggregatedCoreDependencyEClass, HG_AGGREGATED_CORE_DEPENDENCY__RESOLVED);
    createEReference(hgAggregatedCoreDependencyEClass, HG_AGGREGATED_CORE_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES);
    createEOperation(hgAggregatedCoreDependencyEClass, HG_AGGREGATED_CORE_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES);

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

    iCoreDependenciesListEClass = createEClass(ICORE_DEPENDENCIES_LIST);
    createEReference(iCoreDependenciesListEClass, ICORE_DEPENDENCIES_LIST__CORE_DEPENDENCIES);

    // Create enums
    sourceOrTargetEEnum = createEEnum(SOURCE_OR_TARGET);

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
    defaultNodeSourceEClass.getESuperTypes().add(this.getINodeSource());
    defaultDependencySourceEClass.getESuperTypes().add(this.getIDependencySource());
    hgAggregatedDependencyEClass.getESuperTypes().add(this.getAbstractHGDependency());
    hgCoreDependencyEClass.getESuperTypes().add(this.getAbstractHGDependency());
    hgAggregatedCoreDependencyEClass.getESuperTypes().add(this.getHGCoreDependency());

    // Initialize classes, features, and operations; add parameters
    initEClass(hgNodeEClass, HGNode.class, "HGNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHGNode_RootNode(), this.getHGRootNode(), null, "rootNode", null, 0, 1, HGNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_Parent(), this.getHGNode(), this.getHGNode_Children(), "parent", null, 0, 1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_Children(), this.getHGNode(), this.getHGNode_Parent(), "children", null, 0, -1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_NodeSource(), this.getINodeSource(), this.getINodeSource_Node(), "nodeSource", null, 0, 1, HGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGNode_OutgoingCoreDependencies(), this.getHGCoreDependency(), null, "outgoingCoreDependencies", null, 0, -1, HGNode.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getHGNode_AccumulatedOutgoingCoreDependencies(), this.getHGCoreDependency(), null, "accumulatedOutgoingCoreDependencies", null, 0, -1, HGNode.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getHGNode_IncomingCoreDependencies(), this.getHGCoreDependency(), null, "incomingCoreDependencies", null, 0, -1, HGNode.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getHGNode_AccumulatedIncomingCoreDependencies(), this.getHGCoreDependency(), null, "accumulatedIncomingCoreDependencies", null, 0, -1, HGNode.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEOperation(getHGNode__GetIdentifier(), ecorePackage.getEJavaObject(), "getIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

    EOperation op = initEOperation(getHGNode__IsPredecessorOf__HGNode(), ecorePackage.getEBoolean(), "isPredecessorOf", 1, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "node", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__IsSuccessorOf__HGNode(), ecorePackage.getEBoolean(), "isSuccessorOf", 1, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "node", 1, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getHGNode__GetPredecessors(), this.getHGNode(), "getPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetIncomingDependenciesFrom__HGNode(), this.getHGAggregatedDependency(), "getIncomingDependenciesFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetIncomingDependenciesFrom__EList(), this.getHGAggregatedDependency(), "getIncomingDependenciesFrom", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "nodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingDependenciesTo__HGNode(), this.getHGAggregatedDependency(), "getOutgoingDependenciesTo", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "targetNode", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingDependenciesTo__EList(), this.getHGAggregatedDependency(), "getOutgoingDependenciesTo", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "targetNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__ResolveIncomingAggregatedCoreDependencies__boolean(), null, "resolveIncomingAggregatedCoreDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEBoolean(), "includeChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__ResolveOutgoingAggregatedCoreDependencies__boolean(), null, "resolveOutgoingAggregatedCoreDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEBoolean(), "includeChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(iNodeSourceEClass, INodeSource.class, "INodeSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getINodeSource_Identifier(), ecorePackage.getEJavaObject(), "identifier", null, 0, 1, INodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getINodeSource_Node(), this.getHGNode(), this.getHGNode_NodeSource(), "node", null, 0, 1, INodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getINodeSource_AutoExpand(), ecorePackage.getEBoolean(), "autoExpand", null, 0, 1, INodeSource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEOperation(getINodeSource__OnExpand(), null, "onExpand", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getINodeSource__OnCollapse(), null, "onCollapse", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(iDependencySourceEClass, IDependencySource.class, "IDependencySource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIDependencySource_Identifier(), ecorePackage.getEJavaObject(), "identifier", null, 0, 1, IDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIDependencySource_Dependency(), this.getHGCoreDependency(), this.getHGCoreDependency_DependencySource(), "dependency", null, 1, 1, IDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hgRootNodeEClass, HGRootNode.class, "HGRootNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGRootNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, HGRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGRootNode_ItemLabelProvider(), this.getIItemLabelProvider(), "itemLabelProvider", null, 1, 1, HGRootNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGRootNode__InvalidateAllCaches(), null, "invalidateAllCaches", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__InvalidateCaches__EList(), null, "invalidateCaches", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "modifiedNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__InitializeCaches__EList(), null, "initializeCaches", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "modifiedNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__LookupNode__Object(), this.getHGNode(), "lookupNode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEJavaObject(), "identifier", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__GetExtension__Class(), null, "getExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    ETypeParameter t1 = addETypeParameter(op, "T");
    EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
    EGenericType g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(t1);
    initEOperation(op, g1);

    op = initEOperation(getHGRootNode__RegisterExtension__Class_Object(), null, "registerExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    t1 = addETypeParameter(op, "T");
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(t1);
    addEParameter(op, g1, "extension", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__HasExtension__Class(), ecorePackage.getEBoolean(), "hasExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    t1 = addETypeParameter(op, "T");
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(defaultNodeSourceEClass, DefaultNodeSource.class, "DefaultNodeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefaultNodeSource_Properties(), this.getStringToStringMap(), null, "properties", null, 0, -1, DefaultNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultDependencySourceEClass, DefaultDependencySource.class, "DefaultDependencySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefaultDependencySource_Properties(), this.getStringToStringMap(), null, "properties", null, 0, -1, DefaultDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractHGDependencyEClass, AbstractHGDependency.class, "AbstractHGDependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractHGDependency_From(), this.getHGNode(), null, "from", null, 1, 1, AbstractHGDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractHGDependency_To(), this.getHGNode(), null, "to", null, 1, 1, AbstractHGDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getAbstractHGDependency__GetRootNode(), this.getHGRootNode(), "getRootNode", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgAggregatedDependencyEClass, HGAggregatedDependency.class, "HGAggregatedDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHGAggregatedDependency_CoreDependencies(), this.getHGCoreDependency(), null, "coreDependencies", null, 0, -1, HGAggregatedDependency.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGAggregatedDependency_AggregatedWeight(), ecorePackage.getEInt(), "aggregatedWeight", null, 0, 1, HGAggregatedDependency.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGAggregatedDependency__ResolveAggregatedCoreDependencies(), null, "resolveAggregatedCoreDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgCoreDependencyEClass, HGCoreDependency.class, "HGCoreDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGCoreDependency_Type(), ecorePackage.getEString(), "type", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGCoreDependency_Weight(), ecorePackage.getEInt(), "weight", "1", 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGCoreDependency_DependencySource(), this.getIDependencySource(), this.getIDependencySource_Dependency(), "dependencySource", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGCoreDependency_AggregatedCoreDependencyParent(), this.getHGAggregatedCoreDependency(), this.getHGAggregatedCoreDependency_ResolvedCoreDependencies(), "aggregatedCoreDependencyParent", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hgAggregatedCoreDependencyEClass, HGAggregatedCoreDependency.class, "HGAggregatedCoreDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGAggregatedCoreDependency_Resolved(), ecorePackage.getEBoolean(), "resolved", null, 0, 1, HGAggregatedCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGAggregatedCoreDependency_ResolvedCoreDependencies(), this.getHGCoreDependency(), this.getHGCoreDependency_AggregatedCoreDependencyParent(), "resolvedCoreDependencies", null, 0, -1, HGAggregatedCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGAggregatedCoreDependency__ResolveAggregatedCoreDependencies(), null, "resolveAggregatedCoreDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

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

    initEClass(iCoreDependenciesListEClass, ICoreDependenciesList.class, "ICoreDependenciesList", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getICoreDependenciesList_CoreDependencies(), this.getHGCoreDependency(), null, "coreDependencies", null, 0, -1, ICoreDependenciesList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(sourceOrTargetEEnum, SourceOrTarget.class, "SourceOrTarget");
    addEEnumLiteral(sourceOrTargetEEnum, SourceOrTarget.SOURCE);
    addEEnumLiteral(sourceOrTargetEEnum, SourceOrTarget.TARGET);

    // Initialize data types
    initEDataType(iItemLabelProviderEDataType, IItemLabelProvider.class, "IItemLabelProvider", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(futureEDataType, Future.class, "Future", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(iAggregatedCoreDependencyResolverEDataType, IAggregatedCoreDependencyResolver.class, "IAggregatedCoreDependencyResolver", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //HierarchicalgraphPackageImpl
