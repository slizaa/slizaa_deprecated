/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphFactory
 * @model kind="package"
 * @generated
 */
public interface HierarchicalgraphPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hierarchicalgraph";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org/slizaa/hierarchicalgraph";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.slizaa.hierarchicalgraph";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HierarchicalgraphPackage eINSTANCE = org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl.init();

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl <em>HG Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.HGNodeImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGNode()
   * @generated
   */
  int HG_NODE = 0;

  /**
   * The feature id for the '<em><b>Root Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__ROOT_NODE = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__PARENT = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__CHILDREN = 2;

  /**
   * The feature id for the '<em><b>Node Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__NODE_SOURCE = 3;

  /**
   * The feature id for the '<em><b>Outgoing Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__OUTGOING_CORE_DEPENDENCIES = 4;

  /**
   * The feature id for the '<em><b>Accumulated Outgoing Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__ACCUMULATED_OUTGOING_CORE_DEPENDENCIES = 5;

  /**
   * The feature id for the '<em><b>Incoming Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__INCOMING_CORE_DEPENDENCIES = 6;

  /**
   * The feature id for the '<em><b>Accumulated Incoming Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__ACCUMULATED_INCOMING_CORE_DEPENDENCIES = 7;

  /**
   * The number of structural features of the '<em>HG Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_FEATURE_COUNT = 8;

  /**
   * The operation id for the '<em>Get Identifier</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_IDENTIFIER = 0;

  /**
   * The operation id for the '<em>Is Predecessor Of</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___IS_PREDECESSOR_OF__HGNODE = 1;

  /**
   * The operation id for the '<em>Is Successor Of</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___IS_SUCCESSOR_OF__HGNODE = 2;

  /**
   * The operation id for the '<em>Get Predecessors</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_PREDECESSORS = 3;

  /**
   * The operation id for the '<em>Get Incoming Dependencies From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE = 4;

  /**
   * The operation id for the '<em>Get Incoming Dependencies From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__LIST = 5;

  /**
   * The operation id for the '<em>Get Outgoing Dependencies To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE = 6;

  /**
   * The operation id for the '<em>Get Outgoing Dependencies To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__LIST = 7;

  /**
   * The operation id for the '<em>Resolve Incoming Proxy Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___RESOLVE_INCOMING_PROXY_DEPENDENCIES = 8;

  /**
   * The operation id for the '<em>Resolve Outgoing Proxy Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___RESOLVE_OUTGOING_PROXY_DEPENDENCIES = 9;

  /**
   * The operation id for the '<em>Get Node Source</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_NODE_SOURCE__CLASS = 10;

  /**
   * The number of operations of the '<em>HG Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_OPERATION_COUNT = 11;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.INodeSource <em>INode Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.INodeSource
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getINodeSource()
   * @generated
   */
  int INODE_SOURCE = 1;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODE_SOURCE__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Node</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODE_SOURCE__NODE = 1;

  /**
   * The feature id for the '<em><b>Auto Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODE_SOURCE__AUTO_EXPAND = 2;

  /**
   * The number of structural features of the '<em>INode Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODE_SOURCE_FEATURE_COUNT = 3;

  /**
   * The operation id for the '<em>On Expand</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODE_SOURCE___ON_EXPAND = 0;

  /**
   * The operation id for the '<em>On Collapse</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODE_SOURCE___ON_COLLAPSE = 1;

  /**
   * The operation id for the '<em>On Select</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODE_SOURCE___ON_SELECT = 2;

  /**
   * The number of operations of the '<em>INode Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODE_SOURCE_OPERATION_COUNT = 3;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.IDependencySource <em>IDependency Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.IDependencySource
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIDependencySource()
   * @generated
   */
  int IDEPENDENCY_SOURCE = 2;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEPENDENCY_SOURCE__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Dependency</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEPENDENCY_SOURCE__DEPENDENCY = 1;

  /**
   * The number of structural features of the '<em>IDependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEPENDENCY_SOURCE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>IDependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEPENDENCY_SOURCE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.HGRootNodeImpl <em>HG Root Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.HGRootNodeImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGRootNode()
   * @generated
   */
  int HG_ROOT_NODE = 3;

  /**
   * The feature id for the '<em><b>Root Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__ROOT_NODE = HG_NODE__ROOT_NODE;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__PARENT = HG_NODE__PARENT;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__CHILDREN = HG_NODE__CHILDREN;

  /**
   * The feature id for the '<em><b>Node Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__NODE_SOURCE = HG_NODE__NODE_SOURCE;

  /**
   * The feature id for the '<em><b>Outgoing Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__OUTGOING_CORE_DEPENDENCIES = HG_NODE__OUTGOING_CORE_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Accumulated Outgoing Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__ACCUMULATED_OUTGOING_CORE_DEPENDENCIES = HG_NODE__ACCUMULATED_OUTGOING_CORE_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Incoming Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__INCOMING_CORE_DEPENDENCIES = HG_NODE__INCOMING_CORE_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Accumulated Incoming Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__ACCUMULATED_INCOMING_CORE_DEPENDENCIES = HG_NODE__ACCUMULATED_INCOMING_CORE_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__NAME = HG_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extension Registry</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__EXTENSION_REGISTRY = HG_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>HG Root Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE_FEATURE_COUNT = HG_NODE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Get Identifier</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_IDENTIFIER = HG_NODE___GET_IDENTIFIER;

  /**
   * The operation id for the '<em>Is Predecessor Of</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___IS_PREDECESSOR_OF__HGNODE = HG_NODE___IS_PREDECESSOR_OF__HGNODE;

  /**
   * The operation id for the '<em>Is Successor Of</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___IS_SUCCESSOR_OF__HGNODE = HG_NODE___IS_SUCCESSOR_OF__HGNODE;

  /**
   * The operation id for the '<em>Get Predecessors</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_PREDECESSORS = HG_NODE___GET_PREDECESSORS;

  /**
   * The operation id for the '<em>Get Incoming Dependencies From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE = HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE;

  /**
   * The operation id for the '<em>Get Incoming Dependencies From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_INCOMING_DEPENDENCIES_FROM__LIST = HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__LIST;

  /**
   * The operation id for the '<em>Get Outgoing Dependencies To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE = HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE;

  /**
   * The operation id for the '<em>Get Outgoing Dependencies To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_OUTGOING_DEPENDENCIES_TO__LIST = HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__LIST;

  /**
   * The operation id for the '<em>Resolve Incoming Proxy Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___RESOLVE_INCOMING_PROXY_DEPENDENCIES = HG_NODE___RESOLVE_INCOMING_PROXY_DEPENDENCIES;

  /**
   * The operation id for the '<em>Resolve Outgoing Proxy Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___RESOLVE_OUTGOING_PROXY_DEPENDENCIES = HG_NODE___RESOLVE_OUTGOING_PROXY_DEPENDENCIES;

  /**
   * The operation id for the '<em>Get Node Source</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_NODE_SOURCE__CLASS = HG_NODE___GET_NODE_SOURCE__CLASS;

  /**
   * The operation id for the '<em>Invalidate All Caches</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___INVALIDATE_ALL_CACHES = HG_NODE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Invalidate Caches</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___INVALIDATE_CACHES__LIST = HG_NODE_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Initialize Caches</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___INITIALIZE_CACHES__LIST = HG_NODE_OPERATION_COUNT + 2;

  /**
   * The operation id for the '<em>Lookup Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___LOOKUP_NODE__OBJECT = HG_NODE_OPERATION_COUNT + 3;

  /**
   * The operation id for the '<em>Get Extension</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_EXTENSION__CLASS = HG_NODE_OPERATION_COUNT + 4;

  /**
   * The operation id for the '<em>Get Extension</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_EXTENSION__STRING_CLASS = HG_NODE_OPERATION_COUNT + 5;

  /**
   * The operation id for the '<em>Register Extension</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___REGISTER_EXTENSION__CLASS_OBJECT = HG_NODE_OPERATION_COUNT + 6;

  /**
   * The operation id for the '<em>Register Extension</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___REGISTER_EXTENSION__STRING_OBJECT = HG_NODE_OPERATION_COUNT + 7;

  /**
   * The operation id for the '<em>Has Extension</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___HAS_EXTENSION__CLASS = HG_NODE_OPERATION_COUNT + 8;

  /**
   * The operation id for the '<em>Has Extension</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___HAS_EXTENSION__STRING_CLASS = HG_NODE_OPERATION_COUNT + 9;

  /**
   * The number of operations of the '<em>HG Root Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE_OPERATION_COUNT = HG_NODE_OPERATION_COUNT + 10;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.DefaultNodeSourceImpl <em>Default Node Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.DefaultNodeSourceImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDefaultNodeSource()
   * @generated
   */
  int DEFAULT_NODE_SOURCE = 4;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NODE_SOURCE__IDENTIFIER = INODE_SOURCE__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Node</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NODE_SOURCE__NODE = INODE_SOURCE__NODE;

  /**
   * The feature id for the '<em><b>Auto Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NODE_SOURCE__AUTO_EXPAND = INODE_SOURCE__AUTO_EXPAND;

  /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NODE_SOURCE__PROPERTIES = INODE_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Default Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NODE_SOURCE_FEATURE_COUNT = INODE_SOURCE_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>On Expand</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NODE_SOURCE___ON_EXPAND = INODE_SOURCE___ON_EXPAND;

  /**
   * The operation id for the '<em>On Collapse</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NODE_SOURCE___ON_COLLAPSE = INODE_SOURCE___ON_COLLAPSE;

  /**
   * The operation id for the '<em>On Select</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NODE_SOURCE___ON_SELECT = INODE_SOURCE___ON_SELECT;

  /**
   * The number of operations of the '<em>Default Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NODE_SOURCE_OPERATION_COUNT = INODE_SOURCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.DefaultDependencySourceImpl <em>Default Dependency Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.DefaultDependencySourceImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDefaultDependencySource()
   * @generated
   */
  int DEFAULT_DEPENDENCY_SOURCE = 5;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_DEPENDENCY_SOURCE__IDENTIFIER = IDEPENDENCY_SOURCE__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Dependency</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_DEPENDENCY_SOURCE__DEPENDENCY = IDEPENDENCY_SOURCE__DEPENDENCY;

  /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_DEPENDENCY_SOURCE__PROPERTIES = IDEPENDENCY_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Default Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_DEPENDENCY_SOURCE_FEATURE_COUNT = IDEPENDENCY_SOURCE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Default Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_DEPENDENCY_SOURCE_OPERATION_COUNT = IDEPENDENCY_SOURCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.AbstractHGDependencyImpl <em>Abstract HG Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.AbstractHGDependencyImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getAbstractHGDependency()
   * @generated
   */
  int ABSTRACT_HG_DEPENDENCY = 6;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_HG_DEPENDENCY__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_HG_DEPENDENCY__TO = 1;

  /**
   * The number of structural features of the '<em>Abstract HG Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT = 2;

  /**
   * The operation id for the '<em>Get Root Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_HG_DEPENDENCY___GET_ROOT_NODE = 0;

  /**
   * The number of operations of the '<em>Abstract HG Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_HG_DEPENDENCY_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.HGAggregatedDependencyImpl <em>HG Aggregated Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.HGAggregatedDependencyImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGAggregatedDependency()
   * @generated
   */
  int HG_AGGREGATED_DEPENDENCY = 7;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY__FROM = ABSTRACT_HG_DEPENDENCY__FROM;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY__TO = ABSTRACT_HG_DEPENDENCY__TO;

  /**
   * The feature id for the '<em><b>Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aggregated Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY__AGGREGATED_WEIGHT = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>HG Aggregated Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY_FEATURE_COUNT = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Get Root Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY___GET_ROOT_NODE = ABSTRACT_HG_DEPENDENCY___GET_ROOT_NODE;

  /**
   * The operation id for the '<em>Resolve Proxy Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY___RESOLVE_PROXY_DEPENDENCIES = ABSTRACT_HG_DEPENDENCY_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>HG Aggregated Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY_OPERATION_COUNT = ABSTRACT_HG_DEPENDENCY_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.HGCoreDependencyImpl <em>HG Core Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.HGCoreDependencyImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGCoreDependency()
   * @generated
   */
  int HG_CORE_DEPENDENCY = 8;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY__FROM = ABSTRACT_HG_DEPENDENCY__FROM;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY__TO = ABSTRACT_HG_DEPENDENCY__TO;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY__TYPE = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY__WEIGHT = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dependency Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Proxy Dependency Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>HG Core Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY_FEATURE_COUNT = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Get Root Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY___GET_ROOT_NODE = ABSTRACT_HG_DEPENDENCY___GET_ROOT_NODE;

  /**
   * The operation id for the '<em>Get Dependency Source</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY___GET_DEPENDENCY_SOURCE__CLASS = ABSTRACT_HG_DEPENDENCY_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>HG Core Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY_OPERATION_COUNT = ABSTRACT_HG_DEPENDENCY_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.HGProxyDependencyImpl <em>HG Proxy Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.HGProxyDependencyImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGProxyDependency()
   * @generated
   */
  int HG_PROXY_DEPENDENCY = 9;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY__FROM = HG_CORE_DEPENDENCY__FROM;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY__TO = HG_CORE_DEPENDENCY__TO;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY__TYPE = HG_CORE_DEPENDENCY__TYPE;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY__WEIGHT = HG_CORE_DEPENDENCY__WEIGHT;

  /**
   * The feature id for the '<em><b>Dependency Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY__DEPENDENCY_SOURCE = HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE;

  /**
   * The feature id for the '<em><b>Proxy Dependency Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY__PROXY_DEPENDENCY_PARENT = HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT;

  /**
   * The feature id for the '<em><b>Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY__RESOLVED = HG_CORE_DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resolved Core Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES = HG_CORE_DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>HG Proxy Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY_FEATURE_COUNT = HG_CORE_DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Get Root Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY___GET_ROOT_NODE = HG_CORE_DEPENDENCY___GET_ROOT_NODE;

  /**
   * The operation id for the '<em>Get Dependency Source</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY___GET_DEPENDENCY_SOURCE__CLASS = HG_CORE_DEPENDENCY___GET_DEPENDENCY_SOURCE__CLASS;

  /**
   * The operation id for the '<em>Resolve Proxy Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY___RESOLVE_PROXY_DEPENDENCIES = HG_CORE_DEPENDENCY_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>HG Proxy Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_PROXY_DEPENDENCY_OPERATION_COUNT = HG_CORE_DEPENDENCY_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.NodeToCoreDependencyMapImpl <em>Node To Core Dependency Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.NodeToCoreDependencyMapImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getNodeToCoreDependencyMap()
   * @generated
   */
  int NODE_TO_CORE_DEPENDENCY_MAP = 10;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_CORE_DEPENDENCY_MAP__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_CORE_DEPENDENCY_MAP__VALUE = 1;

  /**
   * The number of structural features of the '<em>Node To Core Dependency Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_CORE_DEPENDENCY_MAP_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Node To Core Dependency Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_CORE_DEPENDENCY_MAP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getStringToStringMap()
   * @generated
   */
  int STRING_TO_STRING_MAP = 11;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TO_STRING_MAP__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TO_STRING_MAP__VALUE = 1;

  /**
   * The number of structural features of the '<em>String To String Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>String To String Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.IdentifierToNodeMapImpl <em>Identifier To Node Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.IdentifierToNodeMapImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIdentifierToNodeMap()
   * @generated
   */
  int IDENTIFIER_TO_NODE_MAP = 12;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TO_NODE_MAP__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TO_NODE_MAP__VALUE = 1;

  /**
   * The number of structural features of the '<em>Identifier To Node Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TO_NODE_MAP_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Identifier To Node Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TO_NODE_MAP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.NodeToCoreDependenciesMapImpl <em>Node To Core Dependencies Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.NodeToCoreDependenciesMapImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getNodeToCoreDependenciesMap()
   * @generated
   */
  int NODE_TO_CORE_DEPENDENCIES_MAP = 13;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_CORE_DEPENDENCIES_MAP__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_CORE_DEPENDENCIES_MAP__VALUE = 1;

  /**
   * The number of structural features of the '<em>Node To Core Dependencies Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_CORE_DEPENDENCIES_MAP_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Node To Core Dependencies Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_CORE_DEPENDENCIES_MAP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.StringToObjectMapImpl <em>String To Object Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.StringToObjectMapImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getStringToObjectMap()
   * @generated
   */
  int STRING_TO_OBJECT_MAP = 14;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TO_OBJECT_MAP__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TO_OBJECT_MAP__VALUE = 1;

  /**
   * The number of structural features of the '<em>String To Object Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TO_OBJECT_MAP_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>String To Object Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TO_OBJECT_MAP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.SourceOrTarget <em>Source Or Target</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.SourceOrTarget
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getSourceOrTarget()
   * @generated
   */
  int SOURCE_OR_TARGET = 15;

  /**
   * The meta object id for the '<em>Future</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.concurrent.Future
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getFuture()
   * @generated
   */
  int FUTURE = 16;

  /**
   * The meta object id for the '<em>Optional</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.Optional
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getOptional()
   * @generated
   */
  int OPTIONAL = 17;

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.HGNode <em>HG Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HG Node</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode
   * @generated
   */
  EClass getHGNode();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.hierarchicalgraph.HGNode#getRootNode <em>Root Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root Node</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getRootNode()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_RootNode();

  /**
   * Returns the meta object for the container reference '{@link org.slizaa.hierarchicalgraph.HGNode#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getParent()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link org.slizaa.hierarchicalgraph.HGNode#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getChildren()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_Children();

  /**
   * Returns the meta object for the containment reference '{@link org.slizaa.hierarchicalgraph.HGNode#getNodeSource <em>Node Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node Source</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getNodeSource()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_NodeSource();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.HGNode#getOutgoingCoreDependencies <em>Outgoing Core Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing Core Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getOutgoingCoreDependencies()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_OutgoingCoreDependencies();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.HGNode#getAccumulatedOutgoingCoreDependencies <em>Accumulated Outgoing Core Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Accumulated Outgoing Core Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getAccumulatedOutgoingCoreDependencies()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_AccumulatedOutgoingCoreDependencies();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.HGNode#getIncomingCoreDependencies <em>Incoming Core Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming Core Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getIncomingCoreDependencies()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_IncomingCoreDependencies();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.HGNode#getAccumulatedIncomingCoreDependencies <em>Accumulated Incoming Core Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Accumulated Incoming Core Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getAccumulatedIncomingCoreDependencies()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_AccumulatedIncomingCoreDependencies();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getIdentifier() <em>Get Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Identifier</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getIdentifier()
   * @generated
   */
  EOperation getHGNode__GetIdentifier();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#isPredecessorOf(org.slizaa.hierarchicalgraph.HGNode) <em>Is Predecessor Of</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Is Predecessor Of</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#isPredecessorOf(org.slizaa.hierarchicalgraph.HGNode)
   * @generated
   */
  EOperation getHGNode__IsPredecessorOf__HGNode();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#isSuccessorOf(org.slizaa.hierarchicalgraph.HGNode) <em>Is Successor Of</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Is Successor Of</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#isSuccessorOf(org.slizaa.hierarchicalgraph.HGNode)
   * @generated
   */
  EOperation getHGNode__IsSuccessorOf__HGNode();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getPredecessors() <em>Get Predecessors</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Predecessors</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getPredecessors()
   * @generated
   */
  EOperation getHGNode__GetPredecessors();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getIncomingDependenciesFrom(org.slizaa.hierarchicalgraph.HGNode) <em>Get Incoming Dependencies From</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Incoming Dependencies From</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getIncomingDependenciesFrom(org.slizaa.hierarchicalgraph.HGNode)
   * @generated
   */
  EOperation getHGNode__GetIncomingDependenciesFrom__HGNode();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getIncomingDependenciesFrom(java.util.List) <em>Get Incoming Dependencies From</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Incoming Dependencies From</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getIncomingDependenciesFrom(java.util.List)
   * @generated
   */
  EOperation getHGNode__GetIncomingDependenciesFrom__List();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getOutgoingDependenciesTo(org.slizaa.hierarchicalgraph.HGNode) <em>Get Outgoing Dependencies To</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Outgoing Dependencies To</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getOutgoingDependenciesTo(org.slizaa.hierarchicalgraph.HGNode)
   * @generated
   */
  EOperation getHGNode__GetOutgoingDependenciesTo__HGNode();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getOutgoingDependenciesTo(java.util.List) <em>Get Outgoing Dependencies To</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Outgoing Dependencies To</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getOutgoingDependenciesTo(java.util.List)
   * @generated
   */
  EOperation getHGNode__GetOutgoingDependenciesTo__List();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#resolveIncomingProxyDependencies() <em>Resolve Incoming Proxy Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Resolve Incoming Proxy Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#resolveIncomingProxyDependencies()
   * @generated
   */
  EOperation getHGNode__ResolveIncomingProxyDependencies();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#resolveOutgoingProxyDependencies() <em>Resolve Outgoing Proxy Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Resolve Outgoing Proxy Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#resolveOutgoingProxyDependencies()
   * @generated
   */
  EOperation getHGNode__ResolveOutgoingProxyDependencies();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getNodeSource(java.lang.Class) <em>Get Node Source</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Node Source</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getNodeSource(java.lang.Class)
   * @generated
   */
  EOperation getHGNode__GetNodeSource__Class();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.INodeSource <em>INode Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INode Source</em>'.
   * @see org.slizaa.hierarchicalgraph.INodeSource
   * @generated
   */
  EClass getINodeSource();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.INodeSource#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.slizaa.hierarchicalgraph.INodeSource#getIdentifier()
   * @see #getINodeSource()
   * @generated
   */
  EAttribute getINodeSource_Identifier();

  /**
   * Returns the meta object for the container reference '{@link org.slizaa.hierarchicalgraph.INodeSource#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Node</em>'.
   * @see org.slizaa.hierarchicalgraph.INodeSource#getNode()
   * @see #getINodeSource()
   * @generated
   */
  EReference getINodeSource_Node();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.INodeSource#isAutoExpand <em>Auto Expand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Auto Expand</em>'.
   * @see org.slizaa.hierarchicalgraph.INodeSource#isAutoExpand()
   * @see #getINodeSource()
   * @generated
   */
  EAttribute getINodeSource_AutoExpand();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.INodeSource#onExpand() <em>On Expand</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>On Expand</em>' operation.
   * @see org.slizaa.hierarchicalgraph.INodeSource#onExpand()
   * @generated
   */
  EOperation getINodeSource__OnExpand();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.INodeSource#onCollapse() <em>On Collapse</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>On Collapse</em>' operation.
   * @see org.slizaa.hierarchicalgraph.INodeSource#onCollapse()
   * @generated
   */
  EOperation getINodeSource__OnCollapse();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.INodeSource#onSelect() <em>On Select</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>On Select</em>' operation.
   * @see org.slizaa.hierarchicalgraph.INodeSource#onSelect()
   * @generated
   */
  EOperation getINodeSource__OnSelect();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.IDependencySource <em>IDependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IDependency Source</em>'.
   * @see org.slizaa.hierarchicalgraph.IDependencySource
   * @generated
   */
  EClass getIDependencySource();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.IDependencySource#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.slizaa.hierarchicalgraph.IDependencySource#getIdentifier()
   * @see #getIDependencySource()
   * @generated
   */
  EAttribute getIDependencySource_Identifier();

  /**
   * Returns the meta object for the container reference '{@link org.slizaa.hierarchicalgraph.IDependencySource#getDependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Dependency</em>'.
   * @see org.slizaa.hierarchicalgraph.IDependencySource#getDependency()
   * @see #getIDependencySource()
   * @generated
   */
  EReference getIDependencySource_Dependency();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.HGRootNode <em>HG Root Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HG Root Node</em>'.
   * @see org.slizaa.hierarchicalgraph.HGRootNode
   * @generated
   */
  EClass getHGRootNode();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGRootNode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#getName()
   * @see #getHGRootNode()
   * @generated
   */
  EAttribute getHGRootNode_Name();

  /**
   * Returns the meta object for the map '{@link org.slizaa.hierarchicalgraph.HGRootNode#getExtensionRegistry <em>Extension Registry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Extension Registry</em>'.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#getExtensionRegistry()
   * @see #getHGRootNode()
   * @generated
   */
  EReference getHGRootNode_ExtensionRegistry();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#invalidateAllCaches() <em>Invalidate All Caches</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Invalidate All Caches</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#invalidateAllCaches()
   * @generated
   */
  EOperation getHGRootNode__InvalidateAllCaches();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#invalidateCaches(java.util.List) <em>Invalidate Caches</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Invalidate Caches</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#invalidateCaches(java.util.List)
   * @generated
   */
  EOperation getHGRootNode__InvalidateCaches__List();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#initializeCaches(java.util.List) <em>Initialize Caches</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Initialize Caches</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#initializeCaches(java.util.List)
   * @generated
   */
  EOperation getHGRootNode__InitializeCaches__List();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#lookupNode(java.lang.Object) <em>Lookup Node</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Lookup Node</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#lookupNode(java.lang.Object)
   * @generated
   */
  EOperation getHGRootNode__LookupNode__Object();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#getExtension(java.lang.Class) <em>Get Extension</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Extension</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#getExtension(java.lang.Class)
   * @generated
   */
  EOperation getHGRootNode__GetExtension__Class();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#getExtension(java.lang.String, java.lang.Class) <em>Get Extension</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Extension</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#getExtension(java.lang.String, java.lang.Class)
   * @generated
   */
  EOperation getHGRootNode__GetExtension__String_Class();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#registerExtension(java.lang.Class, java.lang.Object) <em>Register Extension</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Register Extension</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#registerExtension(java.lang.Class, java.lang.Object)
   * @generated
   */
  EOperation getHGRootNode__RegisterExtension__Class_Object();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#registerExtension(java.lang.String, java.lang.Object) <em>Register Extension</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Register Extension</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#registerExtension(java.lang.String, java.lang.Object)
   * @generated
   */
  EOperation getHGRootNode__RegisterExtension__String_Object();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#hasExtension(java.lang.Class) <em>Has Extension</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Has Extension</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#hasExtension(java.lang.Class)
   * @generated
   */
  EOperation getHGRootNode__HasExtension__Class();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#hasExtension(java.lang.String, java.lang.Class) <em>Has Extension</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Has Extension</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#hasExtension(java.lang.String, java.lang.Class)
   * @generated
   */
  EOperation getHGRootNode__HasExtension__String_Class();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.DefaultNodeSource <em>Default Node Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Node Source</em>'.
   * @see org.slizaa.hierarchicalgraph.DefaultNodeSource
   * @generated
   */
  EClass getDefaultNodeSource();

  /**
   * Returns the meta object for the map '{@link org.slizaa.hierarchicalgraph.DefaultNodeSource#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Properties</em>'.
   * @see org.slizaa.hierarchicalgraph.DefaultNodeSource#getProperties()
   * @see #getDefaultNodeSource()
   * @generated
   */
  EReference getDefaultNodeSource_Properties();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.DefaultDependencySource <em>Default Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Dependency Source</em>'.
   * @see org.slizaa.hierarchicalgraph.DefaultDependencySource
   * @generated
   */
  EClass getDefaultDependencySource();

  /**
   * Returns the meta object for the map '{@link org.slizaa.hierarchicalgraph.DefaultDependencySource#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Properties</em>'.
   * @see org.slizaa.hierarchicalgraph.DefaultDependencySource#getProperties()
   * @see #getDefaultDependencySource()
   * @generated
   */
  EReference getDefaultDependencySource_Properties();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.AbstractHGDependency <em>Abstract HG Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract HG Dependency</em>'.
   * @see org.slizaa.hierarchicalgraph.AbstractHGDependency
   * @generated
   */
  EClass getAbstractHGDependency();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.hierarchicalgraph.AbstractHGDependency#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see org.slizaa.hierarchicalgraph.AbstractHGDependency#getFrom()
   * @see #getAbstractHGDependency()
   * @generated
   */
  EReference getAbstractHGDependency_From();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.hierarchicalgraph.AbstractHGDependency#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see org.slizaa.hierarchicalgraph.AbstractHGDependency#getTo()
   * @see #getAbstractHGDependency()
   * @generated
   */
  EReference getAbstractHGDependency_To();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.AbstractHGDependency#getRootNode() <em>Get Root Node</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Root Node</em>' operation.
   * @see org.slizaa.hierarchicalgraph.AbstractHGDependency#getRootNode()
   * @generated
   */
  EOperation getAbstractHGDependency__GetRootNode();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency <em>HG Aggregated Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HG Aggregated Dependency</em>'.
   * @see org.slizaa.hierarchicalgraph.HGAggregatedDependency
   * @generated
   */
  EClass getHGAggregatedDependency();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency#getCoreDependencies <em>Core Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Core Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.HGAggregatedDependency#getCoreDependencies()
   * @see #getHGAggregatedDependency()
   * @generated
   */
  EReference getHGAggregatedDependency_CoreDependencies();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency#getAggregatedWeight <em>Aggregated Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregated Weight</em>'.
   * @see org.slizaa.hierarchicalgraph.HGAggregatedDependency#getAggregatedWeight()
   * @see #getHGAggregatedDependency()
   * @generated
   */
  EAttribute getHGAggregatedDependency_AggregatedWeight();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency#resolveProxyDependencies() <em>Resolve Proxy Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Resolve Proxy Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGAggregatedDependency#resolveProxyDependencies()
   * @generated
   */
  EOperation getHGAggregatedDependency__ResolveProxyDependencies();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.HGCoreDependency <em>HG Core Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HG Core Dependency</em>'.
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency
   * @generated
   */
  EClass getHGCoreDependency();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#getType()
   * @see #getHGCoreDependency()
   * @generated
   */
  EAttribute getHGCoreDependency_Type();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#getWeight()
   * @see #getHGCoreDependency()
   * @generated
   */
  EAttribute getHGCoreDependency_Weight();

  /**
   * Returns the meta object for the containment reference '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource <em>Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dependency Source</em>'.
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource()
   * @see #getHGCoreDependency()
   * @generated
   */
  EReference getHGCoreDependency_DependencySource();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getProxyDependencyParent <em>Proxy Dependency Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Proxy Dependency Parent</em>'.
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#getProxyDependencyParent()
   * @see #getHGCoreDependency()
   * @generated
   */
  EReference getHGCoreDependency_ProxyDependencyParent();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource(java.lang.Class) <em>Get Dependency Source</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Dependency Source</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource(java.lang.Class)
   * @generated
   */
  EOperation getHGCoreDependency__GetDependencySource__Class();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.HGProxyDependency <em>HG Proxy Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HG Proxy Dependency</em>'.
   * @see org.slizaa.hierarchicalgraph.HGProxyDependency
   * @generated
   */
  EClass getHGProxyDependency();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGProxyDependency#isResolved <em>Resolved</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resolved</em>'.
   * @see org.slizaa.hierarchicalgraph.HGProxyDependency#isResolved()
   * @see #getHGProxyDependency()
   * @generated
   */
  EAttribute getHGProxyDependency_Resolved();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.HGProxyDependency#getResolvedCoreDependencies <em>Resolved Core Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resolved Core Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.HGProxyDependency#getResolvedCoreDependencies()
   * @see #getHGProxyDependency()
   * @generated
   */
  EReference getHGProxyDependency_ResolvedCoreDependencies();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGProxyDependency#resolveProxyDependencies() <em>Resolve Proxy Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Resolve Proxy Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGProxyDependency#resolveProxyDependencies()
   * @generated
   */
  EOperation getHGProxyDependency__ResolveProxyDependencies();

  /**
   * Returns the meta object for class '{@link java.util.Map.Entry <em>Node To Core Dependency Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node To Core Dependency Map</em>'.
   * @see java.util.Map.Entry
   * @model keyType="org.slizaa.hierarchicalgraph.HGNode"
   *        valueType="org.slizaa.hierarchicalgraph.HGCoreDependency"
   * @generated
   */
  EClass getNodeToCoreDependencyMap();

  /**
   * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getNodeToCoreDependencyMap()
   * @generated
   */
  EReference getNodeToCoreDependencyMap_Key();

  /**
   * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getNodeToCoreDependencyMap()
   * @generated
   */
  EReference getNodeToCoreDependencyMap_Value();

  /**
   * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String To String Map</em>'.
   * @see java.util.Map.Entry
   * @model keyDataType="org.eclipse.emf.ecore.EString"
   *        valueDefault="" valueDataType="org.eclipse.emf.ecore.EString"
   * @generated
   */
  EClass getStringToStringMap();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getStringToStringMap()
   * @generated
   */
  EAttribute getStringToStringMap_Key();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getStringToStringMap()
   * @generated
   */
  EAttribute getStringToStringMap_Value();

  /**
   * Returns the meta object for class '{@link java.util.Map.Entry <em>Identifier To Node Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier To Node Map</em>'.
   * @see java.util.Map.Entry
   * @model keyDataType="org.eclipse.emf.ecore.EJavaObject"
   *        valueType="org.slizaa.hierarchicalgraph.HGNode"
   * @generated
   */
  EClass getIdentifierToNodeMap();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getIdentifierToNodeMap()
   * @generated
   */
  EAttribute getIdentifierToNodeMap_Key();

  /**
   * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getIdentifierToNodeMap()
   * @generated
   */
  EReference getIdentifierToNodeMap_Value();

  /**
   * Returns the meta object for class '{@link java.util.Map.Entry <em>Node To Core Dependencies Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node To Core Dependencies Map</em>'.
   * @see java.util.Map.Entry
   * @model keyType="org.slizaa.hierarchicalgraph.HGNode"
   *        valueType="org.slizaa.hierarchicalgraph.HGCoreDependency" valueMany="true"
   * @generated
   */
  EClass getNodeToCoreDependenciesMap();

  /**
   * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getNodeToCoreDependenciesMap()
   * @generated
   */
  EReference getNodeToCoreDependenciesMap_Key();

  /**
   * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getNodeToCoreDependenciesMap()
   * @generated
   */
  EReference getNodeToCoreDependenciesMap_Value();

  /**
   * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Object Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String To Object Map</em>'.
   * @see java.util.Map.Entry
   * @model keyDataType="org.eclipse.emf.ecore.EString"
   *        valueDataType="org.eclipse.emf.ecore.EJavaObject"
   * @generated
   */
  EClass getStringToObjectMap();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getStringToObjectMap()
   * @generated
   */
  EAttribute getStringToObjectMap_Key();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getStringToObjectMap()
   * @generated
   */
  EAttribute getStringToObjectMap_Value();

  /**
   * Returns the meta object for enum '{@link org.slizaa.hierarchicalgraph.SourceOrTarget <em>Source Or Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Source Or Target</em>'.
   * @see org.slizaa.hierarchicalgraph.SourceOrTarget
   * @generated
   */
  EEnum getSourceOrTarget();

  /**
   * Returns the meta object for data type '{@link java.util.concurrent.Future <em>Future</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Future</em>'.
   * @see java.util.concurrent.Future
   * @model instanceClass="java.util.concurrent.Future" typeParameters="T"
   * @generated
   */
  EDataType getFuture();

  /**
   * Returns the meta object for data type '{@link java.util.Optional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Optional</em>'.
   * @see java.util.Optional
   * @model instanceClass="java.util.Optional" typeParameters="T"
   * @generated
   */
  EDataType getOptional();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HierarchicalgraphFactory getHierarchicalgraphFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl <em>HG Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.HGNodeImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGNode()
     * @generated
     */
    EClass HG_NODE = eINSTANCE.getHGNode();

    /**
     * The meta object literal for the '<em><b>Root Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__ROOT_NODE = eINSTANCE.getHGNode_RootNode();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__PARENT = eINSTANCE.getHGNode_Parent();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__CHILDREN = eINSTANCE.getHGNode_Children();

    /**
     * The meta object literal for the '<em><b>Node Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__NODE_SOURCE = eINSTANCE.getHGNode_NodeSource();

    /**
     * The meta object literal for the '<em><b>Outgoing Core Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__OUTGOING_CORE_DEPENDENCIES = eINSTANCE.getHGNode_OutgoingCoreDependencies();

    /**
     * The meta object literal for the '<em><b>Accumulated Outgoing Core Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__ACCUMULATED_OUTGOING_CORE_DEPENDENCIES = eINSTANCE.getHGNode_AccumulatedOutgoingCoreDependencies();

    /**
     * The meta object literal for the '<em><b>Incoming Core Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__INCOMING_CORE_DEPENDENCIES = eINSTANCE.getHGNode_IncomingCoreDependencies();

    /**
     * The meta object literal for the '<em><b>Accumulated Incoming Core Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__ACCUMULATED_INCOMING_CORE_DEPENDENCIES = eINSTANCE.getHGNode_AccumulatedIncomingCoreDependencies();

    /**
     * The meta object literal for the '<em><b>Get Identifier</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_IDENTIFIER = eINSTANCE.getHGNode__GetIdentifier();

    /**
     * The meta object literal for the '<em><b>Is Predecessor Of</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___IS_PREDECESSOR_OF__HGNODE = eINSTANCE.getHGNode__IsPredecessorOf__HGNode();

    /**
     * The meta object literal for the '<em><b>Is Successor Of</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___IS_SUCCESSOR_OF__HGNODE = eINSTANCE.getHGNode__IsSuccessorOf__HGNode();

    /**
     * The meta object literal for the '<em><b>Get Predecessors</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_PREDECESSORS = eINSTANCE.getHGNode__GetPredecessors();

    /**
     * The meta object literal for the '<em><b>Get Incoming Dependencies From</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE = eINSTANCE.getHGNode__GetIncomingDependenciesFrom__HGNode();

    /**
     * The meta object literal for the '<em><b>Get Incoming Dependencies From</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__LIST = eINSTANCE.getHGNode__GetIncomingDependenciesFrom__List();

    /**
     * The meta object literal for the '<em><b>Get Outgoing Dependencies To</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE = eINSTANCE.getHGNode__GetOutgoingDependenciesTo__HGNode();

    /**
     * The meta object literal for the '<em><b>Get Outgoing Dependencies To</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__LIST = eINSTANCE.getHGNode__GetOutgoingDependenciesTo__List();

    /**
     * The meta object literal for the '<em><b>Resolve Incoming Proxy Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___RESOLVE_INCOMING_PROXY_DEPENDENCIES = eINSTANCE.getHGNode__ResolveIncomingProxyDependencies();

    /**
     * The meta object literal for the '<em><b>Resolve Outgoing Proxy Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___RESOLVE_OUTGOING_PROXY_DEPENDENCIES = eINSTANCE.getHGNode__ResolveOutgoingProxyDependencies();

    /**
     * The meta object literal for the '<em><b>Get Node Source</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_NODE_SOURCE__CLASS = eINSTANCE.getHGNode__GetNodeSource__Class();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.INodeSource <em>INode Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.INodeSource
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getINodeSource()
     * @generated
     */
    EClass INODE_SOURCE = eINSTANCE.getINodeSource();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INODE_SOURCE__IDENTIFIER = eINSTANCE.getINodeSource_Identifier();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INODE_SOURCE__NODE = eINSTANCE.getINodeSource_Node();

    /**
     * The meta object literal for the '<em><b>Auto Expand</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INODE_SOURCE__AUTO_EXPAND = eINSTANCE.getINodeSource_AutoExpand();

    /**
     * The meta object literal for the '<em><b>On Expand</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation INODE_SOURCE___ON_EXPAND = eINSTANCE.getINodeSource__OnExpand();

    /**
     * The meta object literal for the '<em><b>On Collapse</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation INODE_SOURCE___ON_COLLAPSE = eINSTANCE.getINodeSource__OnCollapse();

    /**
     * The meta object literal for the '<em><b>On Select</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation INODE_SOURCE___ON_SELECT = eINSTANCE.getINodeSource__OnSelect();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.IDependencySource <em>IDependency Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.IDependencySource
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIDependencySource()
     * @generated
     */
    EClass IDEPENDENCY_SOURCE = eINSTANCE.getIDependencySource();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDEPENDENCY_SOURCE__IDENTIFIER = eINSTANCE.getIDependencySource_Identifier();

    /**
     * The meta object literal for the '<em><b>Dependency</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDEPENDENCY_SOURCE__DEPENDENCY = eINSTANCE.getIDependencySource_Dependency();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.HGRootNodeImpl <em>HG Root Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.HGRootNodeImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGRootNode()
     * @generated
     */
    EClass HG_ROOT_NODE = eINSTANCE.getHGRootNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_ROOT_NODE__NAME = eINSTANCE.getHGRootNode_Name();

    /**
     * The meta object literal for the '<em><b>Extension Registry</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_ROOT_NODE__EXTENSION_REGISTRY = eINSTANCE.getHGRootNode_ExtensionRegistry();

    /**
     * The meta object literal for the '<em><b>Invalidate All Caches</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___INVALIDATE_ALL_CACHES = eINSTANCE.getHGRootNode__InvalidateAllCaches();

    /**
     * The meta object literal for the '<em><b>Invalidate Caches</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___INVALIDATE_CACHES__LIST = eINSTANCE.getHGRootNode__InvalidateCaches__List();

    /**
     * The meta object literal for the '<em><b>Initialize Caches</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___INITIALIZE_CACHES__LIST = eINSTANCE.getHGRootNode__InitializeCaches__List();

    /**
     * The meta object literal for the '<em><b>Lookup Node</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___LOOKUP_NODE__OBJECT = eINSTANCE.getHGRootNode__LookupNode__Object();

    /**
     * The meta object literal for the '<em><b>Get Extension</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___GET_EXTENSION__CLASS = eINSTANCE.getHGRootNode__GetExtension__Class();

    /**
     * The meta object literal for the '<em><b>Get Extension</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___GET_EXTENSION__STRING_CLASS = eINSTANCE.getHGRootNode__GetExtension__String_Class();

    /**
     * The meta object literal for the '<em><b>Register Extension</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___REGISTER_EXTENSION__CLASS_OBJECT = eINSTANCE.getHGRootNode__RegisterExtension__Class_Object();

    /**
     * The meta object literal for the '<em><b>Register Extension</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___REGISTER_EXTENSION__STRING_OBJECT = eINSTANCE.getHGRootNode__RegisterExtension__String_Object();

    /**
     * The meta object literal for the '<em><b>Has Extension</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___HAS_EXTENSION__CLASS = eINSTANCE.getHGRootNode__HasExtension__Class();

    /**
     * The meta object literal for the '<em><b>Has Extension</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___HAS_EXTENSION__STRING_CLASS = eINSTANCE.getHGRootNode__HasExtension__String_Class();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.DefaultNodeSourceImpl <em>Default Node Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.DefaultNodeSourceImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDefaultNodeSource()
     * @generated
     */
    EClass DEFAULT_NODE_SOURCE = eINSTANCE.getDefaultNodeSource();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT_NODE_SOURCE__PROPERTIES = eINSTANCE.getDefaultNodeSource_Properties();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.DefaultDependencySourceImpl <em>Default Dependency Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.DefaultDependencySourceImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDefaultDependencySource()
     * @generated
     */
    EClass DEFAULT_DEPENDENCY_SOURCE = eINSTANCE.getDefaultDependencySource();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT_DEPENDENCY_SOURCE__PROPERTIES = eINSTANCE.getDefaultDependencySource_Properties();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.AbstractHGDependencyImpl <em>Abstract HG Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.AbstractHGDependencyImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getAbstractHGDependency()
     * @generated
     */
    EClass ABSTRACT_HG_DEPENDENCY = eINSTANCE.getAbstractHGDependency();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_HG_DEPENDENCY__FROM = eINSTANCE.getAbstractHGDependency_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_HG_DEPENDENCY__TO = eINSTANCE.getAbstractHGDependency_To();

    /**
     * The meta object literal for the '<em><b>Get Root Node</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation ABSTRACT_HG_DEPENDENCY___GET_ROOT_NODE = eINSTANCE.getAbstractHGDependency__GetRootNode();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.HGAggregatedDependencyImpl <em>HG Aggregated Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.HGAggregatedDependencyImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGAggregatedDependency()
     * @generated
     */
    EClass HG_AGGREGATED_DEPENDENCY = eINSTANCE.getHGAggregatedDependency();

    /**
     * The meta object literal for the '<em><b>Core Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES = eINSTANCE.getHGAggregatedDependency_CoreDependencies();

    /**
     * The meta object literal for the '<em><b>Aggregated Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_AGGREGATED_DEPENDENCY__AGGREGATED_WEIGHT = eINSTANCE.getHGAggregatedDependency_AggregatedWeight();

    /**
     * The meta object literal for the '<em><b>Resolve Proxy Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_AGGREGATED_DEPENDENCY___RESOLVE_PROXY_DEPENDENCIES = eINSTANCE.getHGAggregatedDependency__ResolveProxyDependencies();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.HGCoreDependencyImpl <em>HG Core Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.HGCoreDependencyImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGCoreDependency()
     * @generated
     */
    EClass HG_CORE_DEPENDENCY = eINSTANCE.getHGCoreDependency();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_CORE_DEPENDENCY__TYPE = eINSTANCE.getHGCoreDependency_Type();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_CORE_DEPENDENCY__WEIGHT = eINSTANCE.getHGCoreDependency_Weight();

    /**
     * The meta object literal for the '<em><b>Dependency Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE = eINSTANCE.getHGCoreDependency_DependencySource();

    /**
     * The meta object literal for the '<em><b>Proxy Dependency Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT = eINSTANCE.getHGCoreDependency_ProxyDependencyParent();

    /**
     * The meta object literal for the '<em><b>Get Dependency Source</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_CORE_DEPENDENCY___GET_DEPENDENCY_SOURCE__CLASS = eINSTANCE.getHGCoreDependency__GetDependencySource__Class();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.HGProxyDependencyImpl <em>HG Proxy Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.HGProxyDependencyImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGProxyDependency()
     * @generated
     */
    EClass HG_PROXY_DEPENDENCY = eINSTANCE.getHGProxyDependency();

    /**
     * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_PROXY_DEPENDENCY__RESOLVED = eINSTANCE.getHGProxyDependency_Resolved();

    /**
     * The meta object literal for the '<em><b>Resolved Core Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES = eINSTANCE.getHGProxyDependency_ResolvedCoreDependencies();

    /**
     * The meta object literal for the '<em><b>Resolve Proxy Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_PROXY_DEPENDENCY___RESOLVE_PROXY_DEPENDENCIES = eINSTANCE.getHGProxyDependency__ResolveProxyDependencies();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.NodeToCoreDependencyMapImpl <em>Node To Core Dependency Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.NodeToCoreDependencyMapImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getNodeToCoreDependencyMap()
     * @generated
     */
    EClass NODE_TO_CORE_DEPENDENCY_MAP = eINSTANCE.getNodeToCoreDependencyMap();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TO_CORE_DEPENDENCY_MAP__KEY = eINSTANCE.getNodeToCoreDependencyMap_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TO_CORE_DEPENDENCY_MAP__VALUE = eINSTANCE.getNodeToCoreDependencyMap_Value();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getStringToStringMap()
     * @generated
     */
    EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.IdentifierToNodeMapImpl <em>Identifier To Node Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.IdentifierToNodeMapImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIdentifierToNodeMap()
     * @generated
     */
    EClass IDENTIFIER_TO_NODE_MAP = eINSTANCE.getIdentifierToNodeMap();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER_TO_NODE_MAP__KEY = eINSTANCE.getIdentifierToNodeMap_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_TO_NODE_MAP__VALUE = eINSTANCE.getIdentifierToNodeMap_Value();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.NodeToCoreDependenciesMapImpl <em>Node To Core Dependencies Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.NodeToCoreDependenciesMapImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getNodeToCoreDependenciesMap()
     * @generated
     */
    EClass NODE_TO_CORE_DEPENDENCIES_MAP = eINSTANCE.getNodeToCoreDependenciesMap();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TO_CORE_DEPENDENCIES_MAP__KEY = eINSTANCE.getNodeToCoreDependenciesMap_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TO_CORE_DEPENDENCIES_MAP__VALUE = eINSTANCE.getNodeToCoreDependenciesMap_Value();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.StringToObjectMapImpl <em>String To Object Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.StringToObjectMapImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getStringToObjectMap()
     * @generated
     */
    EClass STRING_TO_OBJECT_MAP = eINSTANCE.getStringToObjectMap();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_TO_OBJECT_MAP__KEY = eINSTANCE.getStringToObjectMap_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_TO_OBJECT_MAP__VALUE = eINSTANCE.getStringToObjectMap_Value();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.SourceOrTarget <em>Source Or Target</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.SourceOrTarget
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getSourceOrTarget()
     * @generated
     */
    EEnum SOURCE_OR_TARGET = eINSTANCE.getSourceOrTarget();

    /**
     * The meta object literal for the '<em>Future</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.concurrent.Future
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getFuture()
     * @generated
     */
    EDataType FUTURE = eINSTANCE.getFuture();

    /**
     * The meta object literal for the '<em>Optional</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.Optional
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getOptional()
     * @generated
     */
    EDataType OPTIONAL = eINSTANCE.getOptional();

  }

} //HierarchicalgraphPackage
