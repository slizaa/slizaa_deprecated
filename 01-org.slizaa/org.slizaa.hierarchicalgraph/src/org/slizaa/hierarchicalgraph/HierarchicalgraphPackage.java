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
   * The feature id for the '<em><b>Incoming Core Dependencies Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__INCOMING_CORE_DEPENDENCIES_MAP = 4;

  /**
   * The feature id for the '<em><b>Outgoing Core Dependencies Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE__OUTGOING_CORE_DEPENDENCIES_MAP = 5;

  /**
   * The number of structural features of the '<em>HG Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_FEATURE_COUNT = 6;

  /**
   * The operation id for the '<em>Get Identifier</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_IDENTIFIER = 0;

  /**
   * The operation id for the '<em>Get Incoming Dependencies From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE = 1;

  /**
   * The operation id for the '<em>Get Incoming Dependencies From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__LIST = 2;

  /**
   * The operation id for the '<em>Get Outgoing Dependencies To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE = 3;

  /**
   * The operation id for the '<em>Get Outgoing Dependencies To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__LIST = 4;

  /**
   * The operation id for the '<em>Is Predecessor Of</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___IS_PREDECESSOR_OF__HGNODE = 5;

  /**
   * The operation id for the '<em>Is Successor Of</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___IS_SUCCESSOR_OF__HGNODE = 6;

  /**
   * The operation id for the '<em>Get Outgoing Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_OUTGOING_CORE_DEPENDENCIES__BOOLEAN = 7;

  /**
   * The operation id for the '<em>Get Incoming Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_INCOMING_CORE_DEPENDENCIES__BOOLEAN = 8;

  /**
   * The number of operations of the '<em>HG Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_OPERATION_COUNT = 9;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.HGNodeSource <em>HG Node Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.HGNodeSource
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGNodeSource()
   * @generated
   */
  int HG_NODE_SOURCE = 1;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_SOURCE__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Node</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_SOURCE__NODE = 1;

  /**
   * The feature id for the '<em><b>Auto Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_SOURCE__AUTO_EXPAND = 2;

  /**
   * The number of structural features of the '<em>HG Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_SOURCE_FEATURE_COUNT = 3;

  /**
   * The operation id for the '<em>On Expand</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int HG_NODE_SOURCE___ON_EXPAND = 0;

		/**
   * The operation id for the '<em>On Collapse</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int HG_NODE_SOURCE___ON_COLLAPSE = 1;

		/**
   * The number of operations of the '<em>HG Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_SOURCE_OPERATION_COUNT = 2;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.HGDependencySourceImpl <em>HG Dependency Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.HGDependencySourceImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGDependencySource()
   * @generated
   */
  int HG_DEPENDENCY_SOURCE = 2;

    /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY_SOURCE__IDENTIFIER = 0;

    /**
   * The feature id for the '<em><b>Dependency</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY_SOURCE__DEPENDENCY = 1;

    /**
   * The number of structural features of the '<em>HG Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY_SOURCE_FEATURE_COUNT = 2;

    /**
   * The operation id for the '<em>On Resolve Aggregated Core Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY_SOURCE___ON_RESOLVE_AGGREGATED_CORE_DEPENDENCY = 0;

    /**
   * The number of operations of the '<em>HG Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY_SOURCE_OPERATION_COUNT = 1;

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
   * The feature id for the '<em><b>Incoming Core Dependencies Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__INCOMING_CORE_DEPENDENCIES_MAP = HG_NODE__INCOMING_CORE_DEPENDENCIES_MAP;

  /**
   * The feature id for the '<em><b>Outgoing Core Dependencies Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__OUTGOING_CORE_DEPENDENCIES_MAP = HG_NODE__OUTGOING_CORE_DEPENDENCIES_MAP;

  /**
   * The feature id for the '<em><b>Item Label Provider</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__ITEM_LABEL_PROVIDER = HG_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__NAME = HG_NODE_FEATURE_COUNT + 1;

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
   * The operation id for the '<em>Get Outgoing Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_OUTGOING_CORE_DEPENDENCIES__BOOLEAN = HG_NODE___GET_OUTGOING_CORE_DEPENDENCIES__BOOLEAN;

  /**
   * The operation id for the '<em>Get Incoming Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_INCOMING_CORE_DEPENDENCIES__BOOLEAN = HG_NODE___GET_INCOMING_CORE_DEPENDENCIES__BOOLEAN;

  /**
   * The operation id for the '<em>Invalidate Caches</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___INVALIDATE_CACHES = HG_NODE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Initialize Caches</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___INITIALIZE_CACHES = HG_NODE_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Get Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___GET_NODE__OBJECT = HG_NODE_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>HG Root Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE_OPERATION_COUNT = HG_NODE_OPERATION_COUNT + 3;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.DefaultHGNodeSourceImpl <em>Default HG Node Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.DefaultHGNodeSourceImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDefaultHGNodeSource()
   * @generated
   */
  int DEFAULT_HG_NODE_SOURCE = 4;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_NODE_SOURCE__IDENTIFIER = HG_NODE_SOURCE__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Node</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_NODE_SOURCE__NODE = HG_NODE_SOURCE__NODE;

  /**
   * The feature id for the '<em><b>Auto Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_NODE_SOURCE__AUTO_EXPAND = HG_NODE_SOURCE__AUTO_EXPAND;

  /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_NODE_SOURCE__PROPERTIES = HG_NODE_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Default HG Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_NODE_SOURCE_FEATURE_COUNT = HG_NODE_SOURCE_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>On Expand</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFAULT_HG_NODE_SOURCE___ON_EXPAND = HG_NODE_SOURCE___ON_EXPAND;

		/**
   * The operation id for the '<em>On Collapse</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFAULT_HG_NODE_SOURCE___ON_COLLAPSE = HG_NODE_SOURCE___ON_COLLAPSE;

		/**
   * The number of operations of the '<em>Default HG Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_NODE_SOURCE_OPERATION_COUNT = HG_NODE_SOURCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.DefaultHGDependencySourceImpl <em>Default HG Dependency Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.DefaultHGDependencySourceImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDefaultHGDependencySource()
   * @generated
   */
  int DEFAULT_HG_DEPENDENCY_SOURCE = 5;

    /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_DEPENDENCY_SOURCE__IDENTIFIER = HG_DEPENDENCY_SOURCE__IDENTIFIER;

    /**
   * The feature id for the '<em><b>Dependency</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY = HG_DEPENDENCY_SOURCE__DEPENDENCY;

    /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES = HG_DEPENDENCY_SOURCE_FEATURE_COUNT + 0;

    /**
   * The number of structural features of the '<em>Default HG Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_DEPENDENCY_SOURCE_FEATURE_COUNT = HG_DEPENDENCY_SOURCE_FEATURE_COUNT + 1;

    /**
   * The operation id for the '<em>On Resolve Aggregated Core Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_DEPENDENCY_SOURCE___ON_RESOLVE_AGGREGATED_CORE_DEPENDENCY = HG_DEPENDENCY_SOURCE___ON_RESOLVE_AGGREGATED_CORE_DEPENDENCY;

    /**
   * The number of operations of the '<em>Default HG Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_DEPENDENCY_SOURCE_OPERATION_COUNT = HG_DEPENDENCY_SOURCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.HGDependencyImpl <em>HG Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.HGDependencyImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGDependency()
   * @generated
   */
  int HG_DEPENDENCY = 6;

  /**
   * The feature id for the '<em><b>Dependency Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY__DEPENDENCY_SOURCE = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY__FROM = 1;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY__TO = 2;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY__DEPENDENCIES = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY__TYPE = 4;

  /**
   * The number of structural features of the '<em>HG Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY_FEATURE_COUNT = 5;

  /**
   * The operation id for the '<em>Get Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY___GET_CORE_DEPENDENCIES = 0;

  /**
   * The operation id for the '<em>Get Weight</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY___GET_WEIGHT = 1;

  /**
   * The operation id for the '<em>Resolve Aggregated Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES = 2;

  /**
   * The number of operations of the '<em>HG Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY_OPERATION_COUNT = 3;


  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.NodeToDependencyMapImpl <em>Node To Dependency Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.NodeToDependencyMapImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getNodeToDependencyMap()
   * @generated
   */
  int NODE_TO_DEPENDENCY_MAP = 7;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_DEPENDENCY_MAP__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_DEPENDENCY_MAP__VALUE = 1;

  /**
   * The number of structural features of the '<em>Node To Dependency Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_DEPENDENCY_MAP_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Node To Dependency Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_DEPENDENCY_MAP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getStringToStringMap()
   * @generated
   */
  int STRING_TO_STRING_MAP = 8;

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
  int IDENTIFIER_TO_NODE_MAP = 9;

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
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.NodeToDependenciesMapImpl <em>Node To Dependencies Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.NodeToDependenciesMapImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getNodeToDependenciesMap()
   * @generated
   */
  int NODE_TO_DEPENDENCIES_MAP = 10;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_DEPENDENCIES_MAP__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_DEPENDENCIES_MAP__VALUE = 1;

  /**
   * The number of structural features of the '<em>Node To Dependencies Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_DEPENDENCIES_MAP_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Node To Dependencies Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TO_DEPENDENCIES_MAP_OPERATION_COUNT = 0;


  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.DependencyType <em>Dependency Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.DependencyType
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDependencyType()
   * @generated
   */
  int DEPENDENCY_TYPE = 11;

  /**
   * The meta object id for the '<em>IItem Label Provider</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.edit.provider.IItemLabelProvider
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIItemLabelProvider()
   * @generated
   */
  int IITEM_LABEL_PROVIDER = 12;


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
   * Returns the meta object for the map '{@link org.slizaa.hierarchicalgraph.HGNode#getIncomingCoreDependenciesMap <em>Incoming Core Dependencies Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Incoming Core Dependencies Map</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getIncomingCoreDependenciesMap()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_IncomingCoreDependenciesMap();

  /**
   * Returns the meta object for the map '{@link org.slizaa.hierarchicalgraph.HGNode#getOutgoingCoreDependenciesMap <em>Outgoing Core Dependencies Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Outgoing Core Dependencies Map</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNode#getOutgoingCoreDependenciesMap()
   * @see #getHGNode()
   * @generated
   */
  EReference getHGNode_OutgoingCoreDependenciesMap();

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
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getIdentifier() <em>Get Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Identifier</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getIdentifier()
   * @generated
   */
  EOperation getHGNode__GetIdentifier();

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
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getOutgoingCoreDependencies(boolean) <em>Get Outgoing Core Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Outgoing Core Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getOutgoingCoreDependencies(boolean)
   * @generated
   */
  EOperation getHGNode__GetOutgoingCoreDependencies__boolean();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getIncomingCoreDependencies(boolean) <em>Get Incoming Core Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Incoming Core Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getIncomingCoreDependencies(boolean)
   * @generated
   */
  EOperation getHGNode__GetIncomingCoreDependencies__boolean();

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
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.HGNodeSource <em>HG Node Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HG Node Source</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNodeSource
   * @generated
   */
  EClass getHGNodeSource();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGNodeSource#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNodeSource#getIdentifier()
   * @see #getHGNodeSource()
   * @generated
   */
  EAttribute getHGNodeSource_Identifier();

  /**
   * Returns the meta object for the container reference '{@link org.slizaa.hierarchicalgraph.HGNodeSource#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Node</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNodeSource#getNode()
   * @see #getHGNodeSource()
   * @generated
   */
  EReference getHGNodeSource_Node();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGNodeSource#isAutoExpand <em>Auto Expand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Auto Expand</em>'.
   * @see org.slizaa.hierarchicalgraph.HGNodeSource#isAutoExpand()
   * @see #getHGNodeSource()
   * @generated
   */
  EAttribute getHGNodeSource_AutoExpand();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNodeSource#onExpand() <em>On Expand</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the '<em>On Expand</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNodeSource#onExpand()
   * @generated
   */
	EOperation getHGNodeSource__OnExpand();

		/**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNodeSource#onCollapse() <em>On Collapse</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the '<em>On Collapse</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNodeSource#onCollapse()
   * @generated
   */
	EOperation getHGNodeSource__OnCollapse();

		/**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.HGDependencySource <em>HG Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HG Dependency Source</em>'.
   * @see org.slizaa.hierarchicalgraph.HGDependencySource
   * @generated
   */
  EClass getHGDependencySource();

    /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGDependencySource#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.slizaa.hierarchicalgraph.HGDependencySource#getIdentifier()
   * @see #getHGDependencySource()
   * @generated
   */
  EAttribute getHGDependencySource_Identifier();

    /**
   * Returns the meta object for the container reference '{@link org.slizaa.hierarchicalgraph.HGDependencySource#getDependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Dependency</em>'.
   * @see org.slizaa.hierarchicalgraph.HGDependencySource#getDependency()
   * @see #getHGDependencySource()
   * @generated
   */
  EReference getHGDependencySource_Dependency();

    /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGDependencySource#onResolveAggregatedCoreDependency() <em>On Resolve Aggregated Core Dependency</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>On Resolve Aggregated Core Dependency</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGDependencySource#onResolveAggregatedCoreDependency()
   * @generated
   */
  EOperation getHGDependencySource__OnResolveAggregatedCoreDependency();

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
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGRootNode#getItemLabelProvider <em>Item Label Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Item Label Provider</em>'.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#getItemLabelProvider()
   * @see #getHGRootNode()
   * @generated
   */
  EAttribute getHGRootNode_ItemLabelProvider();

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
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#invalidateCaches() <em>Invalidate Caches</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Invalidate Caches</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#invalidateCaches()
   * @generated
   */
  EOperation getHGRootNode__InvalidateCaches();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#initializeCaches() <em>Initialize Caches</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Initialize Caches</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#initializeCaches()
   * @generated
   */
  EOperation getHGRootNode__InitializeCaches();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#getNode(java.lang.Object) <em>Get Node</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Node</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#getNode(java.lang.Object)
   * @generated
   */
  EOperation getHGRootNode__GetNode__Object();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.DefaultHGNodeSource <em>Default HG Node Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default HG Node Source</em>'.
   * @see org.slizaa.hierarchicalgraph.DefaultHGNodeSource
   * @generated
   */
  EClass getDefaultHGNodeSource();

  /**
   * Returns the meta object for the map '{@link org.slizaa.hierarchicalgraph.DefaultHGNodeSource#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Properties</em>'.
   * @see org.slizaa.hierarchicalgraph.DefaultHGNodeSource#getProperties()
   * @see #getDefaultHGNodeSource()
   * @generated
   */
  EReference getDefaultHGNodeSource_Properties();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.DefaultHGDependencySource <em>Default HG Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default HG Dependency Source</em>'.
   * @see org.slizaa.hierarchicalgraph.DefaultHGDependencySource
   * @generated
   */
  EClass getDefaultHGDependencySource();

  /**
   * Returns the meta object for the map '{@link org.slizaa.hierarchicalgraph.DefaultHGDependencySource#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Properties</em>'.
   * @see org.slizaa.hierarchicalgraph.DefaultHGDependencySource#getProperties()
   * @see #getDefaultHGDependencySource()
   * @generated
   */
  EReference getDefaultHGDependencySource_Properties();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.HGDependency <em>HG Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HG Dependency</em>'.
   * @see org.slizaa.hierarchicalgraph.HGDependency
   * @generated
   */
  EClass getHGDependency();

  /**
   * Returns the meta object for the containment reference '{@link org.slizaa.hierarchicalgraph.HGDependency#getDependencySource <em>Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dependency Source</em>'.
   * @see org.slizaa.hierarchicalgraph.HGDependency#getDependencySource()
   * @see #getHGDependency()
   * @generated
   */
  EReference getHGDependency_DependencySource();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.hierarchicalgraph.HGDependency#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see org.slizaa.hierarchicalgraph.HGDependency#getFrom()
   * @see #getHGDependency()
   * @generated
   */
  EReference getHGDependency_From();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.hierarchicalgraph.HGDependency#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see org.slizaa.hierarchicalgraph.HGDependency#getTo()
   * @see #getHGDependency()
   * @generated
   */
  EReference getHGDependency_To();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.HGDependency#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.HGDependency#getDependencies()
   * @see #getHGDependency()
   * @generated
   */
  EReference getHGDependency_Dependencies();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGDependency#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.slizaa.hierarchicalgraph.HGDependency#getType()
   * @see #getHGDependency()
   * @generated
   */
  EAttribute getHGDependency_Type();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGDependency#getCoreDependencies() <em>Get Core Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Core Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGDependency#getCoreDependencies()
   * @generated
   */
  EOperation getHGDependency__GetCoreDependencies();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGDependency#getWeight() <em>Get Weight</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Weight</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGDependency#getWeight()
   * @generated
   */
  EOperation getHGDependency__GetWeight();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGDependency#resolveAggregatedCoreDependencies() <em>Resolve Aggregated Core Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Resolve Aggregated Core Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGDependency#resolveAggregatedCoreDependencies()
   * @generated
   */
  EOperation getHGDependency__ResolveAggregatedCoreDependencies();

  /**
   * Returns the meta object for class '{@link java.util.Map.Entry <em>Node To Dependency Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node To Dependency Map</em>'.
   * @see java.util.Map.Entry
   * @model keyType="org.slizaa.hierarchicalgraph.HGNode"
   *        valueType="org.slizaa.hierarchicalgraph.HGDependency"
   * @generated
   */
  EClass getNodeToDependencyMap();

  /**
   * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getNodeToDependencyMap()
   * @generated
   */
  EReference getNodeToDependencyMap_Key();

  /**
   * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getNodeToDependencyMap()
   * @generated
   */
  EReference getNodeToDependencyMap_Value();

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
   * Returns the meta object for class '{@link java.util.Map.Entry <em>Node To Dependencies Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node To Dependencies Map</em>'.
   * @see java.util.Map.Entry
   * @model keyType="org.slizaa.hierarchicalgraph.HGNode"
   *        valueType="org.slizaa.hierarchicalgraph.HGDependency" valueMany="true"
   * @generated
   */
  EClass getNodeToDependenciesMap();

  /**
   * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getNodeToDependenciesMap()
   * @generated
   */
  EReference getNodeToDependenciesMap_Key();

  /**
   * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getNodeToDependenciesMap()
   * @generated
   */
  EReference getNodeToDependenciesMap_Value();

  /**
   * Returns the meta object for enum '{@link org.slizaa.hierarchicalgraph.DependencyType <em>Dependency Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dependency Type</em>'.
   * @see org.slizaa.hierarchicalgraph.DependencyType
   * @generated
   */
  EEnum getDependencyType();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.edit.provider.IItemLabelProvider <em>IItem Label Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>IItem Label Provider</em>'.
   * @see org.eclipse.emf.edit.provider.IItemLabelProvider
   * @model instanceClass="org.eclipse.emf.edit.provider.IItemLabelProvider"
   * @generated
   */
  EDataType getIItemLabelProvider();

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
     * The meta object literal for the '<em><b>Incoming Core Dependencies Map</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__INCOMING_CORE_DEPENDENCIES_MAP = eINSTANCE.getHGNode_IncomingCoreDependenciesMap();

    /**
     * The meta object literal for the '<em><b>Outgoing Core Dependencies Map</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__OUTGOING_CORE_DEPENDENCIES_MAP = eINSTANCE.getHGNode_OutgoingCoreDependenciesMap();

    /**
     * The meta object literal for the '<em><b>Root Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE__ROOT_NODE = eINSTANCE.getHGNode_RootNode();

    /**
     * The meta object literal for the '<em><b>Get Identifier</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_IDENTIFIER = eINSTANCE.getHGNode__GetIdentifier();

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
     * The meta object literal for the '<em><b>Get Outgoing Core Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_OUTGOING_CORE_DEPENDENCIES__BOOLEAN = eINSTANCE.getHGNode__GetOutgoingCoreDependencies__boolean();

    /**
     * The meta object literal for the '<em><b>Get Incoming Core Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_INCOMING_CORE_DEPENDENCIES__BOOLEAN = eINSTANCE.getHGNode__GetIncomingCoreDependencies__boolean();

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
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.HGNodeSource <em>HG Node Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.HGNodeSource
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGNodeSource()
     * @generated
     */
    EClass HG_NODE_SOURCE = eINSTANCE.getHGNodeSource();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_NODE_SOURCE__IDENTIFIER = eINSTANCE.getHGNodeSource_Identifier();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_NODE_SOURCE__NODE = eINSTANCE.getHGNodeSource_Node();

    /**
     * The meta object literal for the '<em><b>Auto Expand</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_NODE_SOURCE__AUTO_EXPAND = eINSTANCE.getHGNodeSource_AutoExpand();

    /**
     * The meta object literal for the '<em><b>On Expand</b></em>' operation.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EOperation HG_NODE_SOURCE___ON_EXPAND = eINSTANCE.getHGNodeSource__OnExpand();

				/**
     * The meta object literal for the '<em><b>On Collapse</b></em>' operation.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EOperation HG_NODE_SOURCE___ON_COLLAPSE = eINSTANCE.getHGNodeSource__OnCollapse();

				/**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.HGDependencySourceImpl <em>HG Dependency Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.HGDependencySourceImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGDependencySource()
     * @generated
     */
    EClass HG_DEPENDENCY_SOURCE = eINSTANCE.getHGDependencySource();

        /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_DEPENDENCY_SOURCE__IDENTIFIER = eINSTANCE.getHGDependencySource_Identifier();

        /**
     * The meta object literal for the '<em><b>Dependency</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_DEPENDENCY_SOURCE__DEPENDENCY = eINSTANCE.getHGDependencySource_Dependency();

        /**
     * The meta object literal for the '<em><b>On Resolve Aggregated Core Dependency</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_DEPENDENCY_SOURCE___ON_RESOLVE_AGGREGATED_CORE_DEPENDENCY = eINSTANCE.getHGDependencySource__OnResolveAggregatedCoreDependency();

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
     * The meta object literal for the '<em><b>Item Label Provider</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_ROOT_NODE__ITEM_LABEL_PROVIDER = eINSTANCE.getHGRootNode_ItemLabelProvider();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_ROOT_NODE__NAME = eINSTANCE.getHGRootNode_Name();

    /**
     * The meta object literal for the '<em><b>Invalidate Caches</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___INVALIDATE_CACHES = eINSTANCE.getHGRootNode__InvalidateCaches();

    /**
     * The meta object literal for the '<em><b>Initialize Caches</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___INITIALIZE_CACHES = eINSTANCE.getHGRootNode__InitializeCaches();

    /**
     * The meta object literal for the '<em><b>Get Node</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___GET_NODE__OBJECT = eINSTANCE.getHGRootNode__GetNode__Object();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.DefaultHGNodeSourceImpl <em>Default HG Node Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.DefaultHGNodeSourceImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDefaultHGNodeSource()
     * @generated
     */
    EClass DEFAULT_HG_NODE_SOURCE = eINSTANCE.getDefaultHGNodeSource();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT_HG_NODE_SOURCE__PROPERTIES = eINSTANCE.getDefaultHGNodeSource_Properties();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.DefaultHGDependencySourceImpl <em>Default HG Dependency Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.DefaultHGDependencySourceImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDefaultHGDependencySource()
     * @generated
     */
    EClass DEFAULT_HG_DEPENDENCY_SOURCE = eINSTANCE.getDefaultHGDependencySource();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES = eINSTANCE.getDefaultHGDependencySource_Properties();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.HGDependencyImpl <em>HG Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.HGDependencyImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getHGDependency()
     * @generated
     */
    EClass HG_DEPENDENCY = eINSTANCE.getHGDependency();

    /**
     * The meta object literal for the '<em><b>Dependency Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_DEPENDENCY__DEPENDENCY_SOURCE = eINSTANCE.getHGDependency_DependencySource();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_DEPENDENCY__FROM = eINSTANCE.getHGDependency_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_DEPENDENCY__TO = eINSTANCE.getHGDependency_To();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_DEPENDENCY__DEPENDENCIES = eINSTANCE.getHGDependency_Dependencies();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_DEPENDENCY__TYPE = eINSTANCE.getHGDependency_Type();

    /**
     * The meta object literal for the '<em><b>Get Core Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_DEPENDENCY___GET_CORE_DEPENDENCIES = eINSTANCE.getHGDependency__GetCoreDependencies();

    /**
     * The meta object literal for the '<em><b>Get Weight</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_DEPENDENCY___GET_WEIGHT = eINSTANCE.getHGDependency__GetWeight();

    /**
     * The meta object literal for the '<em><b>Resolve Aggregated Core Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES = eINSTANCE.getHGDependency__ResolveAggregatedCoreDependencies();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.NodeToDependencyMapImpl <em>Node To Dependency Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.NodeToDependencyMapImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getNodeToDependencyMap()
     * @generated
     */
    EClass NODE_TO_DEPENDENCY_MAP = eINSTANCE.getNodeToDependencyMap();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TO_DEPENDENCY_MAP__KEY = eINSTANCE.getNodeToDependencyMap_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TO_DEPENDENCY_MAP__VALUE = eINSTANCE.getNodeToDependencyMap_Value();

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
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.impl.NodeToDependenciesMapImpl <em>Node To Dependencies Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.impl.NodeToDependenciesMapImpl
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getNodeToDependenciesMap()
     * @generated
     */
    EClass NODE_TO_DEPENDENCIES_MAP = eINSTANCE.getNodeToDependenciesMap();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TO_DEPENDENCIES_MAP__KEY = eINSTANCE.getNodeToDependenciesMap_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TO_DEPENDENCIES_MAP__VALUE = eINSTANCE.getNodeToDependenciesMap_Value();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.DependencyType <em>Dependency Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.DependencyType
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getDependencyType()
     * @generated
     */
    EEnum DEPENDENCY_TYPE = eINSTANCE.getDependencyType();

    /**
     * The meta object literal for the '<em>IItem Label Provider</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.edit.provider.IItemLabelProvider
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIItemLabelProvider()
     * @generated
     */
    EDataType IITEM_LABEL_PROVIDER = eINSTANCE.getIItemLabelProvider();

  }

} //HierarchicalgraphPackage
