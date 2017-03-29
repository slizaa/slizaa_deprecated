/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.util.Map;

import java.util.Optional;
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
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.DefaultDependencySource;
import org.slizaa.hierarchicalgraph.DefaultNodeSource;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGProxyDependency;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.IDependencySource;
import org.slizaa.hierarchicalgraph.INodeSource;
import org.slizaa.hierarchicalgraph.SourceOrTarget;

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
  private EClass hgProxyDependencyEClass = null;

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
  private EClass stringToObjectMapEClass = null;

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
  private EDataType futureEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType optionalEDataType = null;

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
  public EOperation getHGNode__GetIncomingDependenciesFrom__List() {
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
  public EOperation getHGNode__GetOutgoingDependenciesTo__List() {
    return hgNodeEClass.getEOperations().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__ResolveIncomingProxyDependencies() {
    return hgNodeEClass.getEOperations().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__ResolveOutgoingProxyDependencies() {
    return hgNodeEClass.getEOperations().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGNode__GetNodeSource__Class() {
    return hgNodeEClass.getEOperations().get(10);
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
  public EOperation getINodeSource__OnSelect() {
    return iNodeSourceEClass.getEOperations().get(2);
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
  public EReference getHGRootNode_ExtensionRegistry() {
    return (EReference)hgRootNodeEClass.getEStructuralFeatures().get(1);
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
  public EOperation getHGRootNode__InitializeCaches__List() {
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
  public EOperation getHGRootNode__GetExtension__String_Class() {
    return hgRootNodeEClass.getEOperations().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__RegisterExtension__Class_Object() {
    return hgRootNodeEClass.getEOperations().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__RegisterExtension__String_Object() {
    return hgRootNodeEClass.getEOperations().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__HasExtension__Class() {
    return hgRootNodeEClass.getEOperations().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGRootNode__HasExtension__String_Class() {
    return hgRootNodeEClass.getEOperations().get(9);
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
  public EOperation getHGAggregatedDependency__ResolveProxyDependencies() {
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
  public EReference getHGCoreDependency_ProxyDependencyParent() {
    return (EReference)hgCoreDependencyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGCoreDependency__GetDependencySource__Class() {
    return hgCoreDependencyEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHGProxyDependency() {
    return hgProxyDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHGProxyDependency_Resolved() {
    return (EAttribute)hgProxyDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHGProxyDependency_ResolvedCoreDependencies() {
    return (EReference)hgProxyDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHGProxyDependency__ResolveProxyDependencies() {
    return hgProxyDependencyEClass.getEOperations().get(0);
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
  public EClass getStringToObjectMap() {
    return stringToObjectMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringToObjectMap_Key() {
    return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringToObjectMap_Value() {
    return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(1);
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
  public EDataType getFuture() {
    return futureEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOptional() {
    return optionalEDataType;
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
    createEOperation(hgNodeEClass, HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__LIST);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE);
    createEOperation(hgNodeEClass, HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__LIST);
    createEOperation(hgNodeEClass, HG_NODE___RESOLVE_INCOMING_PROXY_DEPENDENCIES);
    createEOperation(hgNodeEClass, HG_NODE___RESOLVE_OUTGOING_PROXY_DEPENDENCIES);
    createEOperation(hgNodeEClass, HG_NODE___GET_NODE_SOURCE__CLASS);

    iNodeSourceEClass = createEClass(INODE_SOURCE);
    createEAttribute(iNodeSourceEClass, INODE_SOURCE__IDENTIFIER);
    createEReference(iNodeSourceEClass, INODE_SOURCE__NODE);
    createEAttribute(iNodeSourceEClass, INODE_SOURCE__AUTO_EXPAND);
    createEOperation(iNodeSourceEClass, INODE_SOURCE___ON_EXPAND);
    createEOperation(iNodeSourceEClass, INODE_SOURCE___ON_COLLAPSE);
    createEOperation(iNodeSourceEClass, INODE_SOURCE___ON_SELECT);

    iDependencySourceEClass = createEClass(IDEPENDENCY_SOURCE);
    createEAttribute(iDependencySourceEClass, IDEPENDENCY_SOURCE__IDENTIFIER);
    createEReference(iDependencySourceEClass, IDEPENDENCY_SOURCE__DEPENDENCY);

    hgRootNodeEClass = createEClass(HG_ROOT_NODE);
    createEAttribute(hgRootNodeEClass, HG_ROOT_NODE__NAME);
    createEReference(hgRootNodeEClass, HG_ROOT_NODE__EXTENSION_REGISTRY);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INVALIDATE_ALL_CACHES);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INVALIDATE_CACHES__LIST);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___INITIALIZE_CACHES__LIST);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___LOOKUP_NODE__OBJECT);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___GET_EXTENSION__CLASS);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___GET_EXTENSION__STRING_CLASS);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___REGISTER_EXTENSION__CLASS_OBJECT);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___REGISTER_EXTENSION__STRING_OBJECT);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___HAS_EXTENSION__CLASS);
    createEOperation(hgRootNodeEClass, HG_ROOT_NODE___HAS_EXTENSION__STRING_CLASS);

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
    createEOperation(hgAggregatedDependencyEClass, HG_AGGREGATED_DEPENDENCY___RESOLVE_PROXY_DEPENDENCIES);

    hgCoreDependencyEClass = createEClass(HG_CORE_DEPENDENCY);
    createEAttribute(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__TYPE);
    createEAttribute(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__WEIGHT);
    createEReference(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE);
    createEReference(hgCoreDependencyEClass, HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT);
    createEOperation(hgCoreDependencyEClass, HG_CORE_DEPENDENCY___GET_DEPENDENCY_SOURCE__CLASS);

    hgProxyDependencyEClass = createEClass(HG_PROXY_DEPENDENCY);
    createEAttribute(hgProxyDependencyEClass, HG_PROXY_DEPENDENCY__RESOLVED);
    createEReference(hgProxyDependencyEClass, HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES);
    createEOperation(hgProxyDependencyEClass, HG_PROXY_DEPENDENCY___RESOLVE_PROXY_DEPENDENCIES);

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

    stringToObjectMapEClass = createEClass(STRING_TO_OBJECT_MAP);
    createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__KEY);
    createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__VALUE);

    // Create enums
    sourceOrTargetEEnum = createEEnum(SOURCE_OR_TARGET);

    // Create data types
    futureEDataType = createEDataType(FUTURE);
    optionalEDataType = createEDataType(OPTIONAL);
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
    addETypeParameter(optionalEDataType, "T");

    // Set bounds for type parameters

    // Add supertypes to classes
    hgRootNodeEClass.getESuperTypes().add(this.getHGNode());
    defaultNodeSourceEClass.getESuperTypes().add(this.getINodeSource());
    defaultDependencySourceEClass.getESuperTypes().add(this.getIDependencySource());
    hgAggregatedDependencyEClass.getESuperTypes().add(this.getAbstractHGDependency());
    hgCoreDependencyEClass.getESuperTypes().add(this.getAbstractHGDependency());
    hgProxyDependencyEClass.getESuperTypes().add(this.getHGCoreDependency());

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

    op = initEOperation(getHGNode__GetIncomingDependenciesFrom__List(), this.getHGAggregatedDependency(), "getIncomingDependenciesFrom", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "nodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingDependenciesTo__HGNode(), this.getHGAggregatedDependency(), "getOutgoingDependenciesTo", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "targetNode", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetOutgoingDependenciesTo__List(), this.getHGAggregatedDependency(), "getOutgoingDependenciesTo", 0, -1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "targetNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getHGNode__ResolveIncomingProxyDependencies(), null, "resolveIncomingProxyDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getHGNode__ResolveOutgoingProxyDependencies(), null, "resolveOutgoingProxyDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGNode__GetNodeSource__Class(), null, "getNodeSource", 1, 1, IS_UNIQUE, IS_ORDERED);
    ETypeParameter t1 = addETypeParameter(op, "T");
    EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
    EGenericType g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOptional());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    initEClass(iNodeSourceEClass, INodeSource.class, "INodeSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getINodeSource_Identifier(), ecorePackage.getEJavaObject(), "identifier", null, 0, 1, INodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getINodeSource_Node(), this.getHGNode(), this.getHGNode_NodeSource(), "node", null, 0, 1, INodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getINodeSource_AutoExpand(), ecorePackage.getEBoolean(), "autoExpand", null, 0, 1, INodeSource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEOperation(getINodeSource__OnExpand(), null, "onExpand", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getINodeSource__OnCollapse(), null, "onCollapse", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getINodeSource__OnSelect(), null, "onSelect", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(iDependencySourceEClass, IDependencySource.class, "IDependencySource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIDependencySource_Identifier(), ecorePackage.getEJavaObject(), "identifier", null, 0, 1, IDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIDependencySource_Dependency(), this.getHGCoreDependency(), this.getHGCoreDependency_DependencySource(), "dependency", null, 1, 1, IDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hgRootNodeEClass, HGRootNode.class, "HGRootNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGRootNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, HGRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGRootNode_ExtensionRegistry(), this.getStringToObjectMap(), null, "extensionRegistry", null, 0, -1, HGRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGRootNode__InvalidateAllCaches(), null, "invalidateAllCaches", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__InvalidateCaches__List(), null, "invalidateCaches", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "modifiedNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__InitializeCaches__List(), null, "initializeCaches", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHGNode(), "modifiedNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__LookupNode__Object(), this.getHGNode(), "lookupNode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEJavaObject(), "identifier", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__GetExtension__Class(), null, "getExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    t1 = addETypeParameter(op, "T");
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(t1);
    initEOperation(op, g1);

    op = initEOperation(getHGRootNode__GetExtension__String_Class(), null, "getExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    t1 = addETypeParameter(op, "T");
    addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
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

    op = initEOperation(getHGRootNode__RegisterExtension__String_Object(), null, "registerExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEObject(), "extension", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__HasExtension__Class(), ecorePackage.getEBoolean(), "hasExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    t1 = addETypeParameter(op, "T");
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHGRootNode__HasExtension__String_Class(), ecorePackage.getEBoolean(), "hasExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    t1 = addETypeParameter(op, "T");
    addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);

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

    initEOperation(getHGAggregatedDependency__ResolveProxyDependencies(), null, "resolveProxyDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(hgCoreDependencyEClass, HGCoreDependency.class, "HGCoreDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGCoreDependency_Type(), ecorePackage.getEString(), "type", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHGCoreDependency_Weight(), ecorePackage.getEInt(), "weight", "1", 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGCoreDependency_DependencySource(), this.getIDependencySource(), this.getIDependencySource_Dependency(), "dependencySource", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGCoreDependency_ProxyDependencyParent(), this.getHGProxyDependency(), this.getHGProxyDependency_ResolvedCoreDependencies(), "proxyDependencyParent", null, 0, 1, HGCoreDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = initEOperation(getHGCoreDependency__GetDependencySource__Class(), null, "getDependencySource", 1, 1, IS_UNIQUE, IS_ORDERED);
    t1 = addETypeParameter(op, "T");
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOptional());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    initEClass(hgProxyDependencyEClass, HGProxyDependency.class, "HGProxyDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHGProxyDependency_Resolved(), ecorePackage.getEBoolean(), "resolved", null, 0, 1, HGProxyDependency.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHGProxyDependency_ResolvedCoreDependencies(), this.getHGCoreDependency(), this.getHGCoreDependency_ProxyDependencyParent(), "resolvedCoreDependencies", null, 0, -1, HGProxyDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getHGProxyDependency__ResolveProxyDependencies(), null, "resolveProxyDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

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

    initEClass(stringToObjectMapEClass, Map.Entry.class, "StringToObjectMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringToObjectMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringToObjectMap_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(sourceOrTargetEEnum, SourceOrTarget.class, "SourceOrTarget");
    addEEnumLiteral(sourceOrTargetEEnum, SourceOrTarget.SOURCE);
    addEEnumLiteral(sourceOrTargetEEnum, SourceOrTarget.TARGET);

    // Initialize data types
    initEDataType(futureEDataType, Future.class, "Future", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(optionalEDataType, Optional.class, "Optional", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //HierarchicalgraphPackageImpl
