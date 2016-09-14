/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
   * The operation id for the '<em>Get Outgoing Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_OUTGOING_CORE_DEPENDENCIES__BOOLEAN = 4;

  /**
   * The operation id for the '<em>Get Incoming Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_INCOMING_CORE_DEPENDENCIES__BOOLEAN = 5;

  /**
   * The operation id for the '<em>Get Incoming Dependencies From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE = 6;

  /**
   * The operation id for the '<em>Get Incoming Dependencies From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__ELIST = 7;

  /**
   * The operation id for the '<em>Get Outgoing Dependencies To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE = 8;

  /**
   * The operation id for the '<em>Get Outgoing Dependencies To</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__ELIST = 9;

  /**
   * The operation id for the '<em>Resolve Incoming Aggregated Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___RESOLVE_INCOMING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN = 10;

  /**
   * The operation id for the '<em>Resolve Outgoing Aggregated Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE___RESOLVE_OUTGOING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN = 11;

  /**
   * The number of operations of the '<em>HG Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_NODE_OPERATION_COUNT = 12;

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
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.HGDependencySource <em>HG Dependency Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.HGDependencySource
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
   * The number of operations of the '<em>HG Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_DEPENDENCY_SOURCE_OPERATION_COUNT = 0;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__NAME = HG_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Item Label Provider</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__ITEM_LABEL_PROVIDER = HG_NODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Aggregated Core Dependency Resolver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE__AGGREGATED_CORE_DEPENDENCY_RESOLVER = HG_NODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>HG Root Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE_FEATURE_COUNT = HG_NODE_FEATURE_COUNT + 3;

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
  int HG_ROOT_NODE___GET_INCOMING_DEPENDENCIES_FROM__ELIST = HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__ELIST;

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
  int HG_ROOT_NODE___GET_OUTGOING_DEPENDENCIES_TO__ELIST = HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__ELIST;

  /**
   * The operation id for the '<em>Resolve Incoming Aggregated Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___RESOLVE_INCOMING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN = HG_NODE___RESOLVE_INCOMING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN;

  /**
   * The operation id for the '<em>Resolve Outgoing Aggregated Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___RESOLVE_OUTGOING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN = HG_NODE___RESOLVE_OUTGOING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN;

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
  int HG_ROOT_NODE___INVALIDATE_CACHES__ELIST = HG_NODE_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Lookup Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_ROOT_NODE___LOOKUP_NODE__OBJECT = HG_NODE_OPERATION_COUNT + 2;

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
   * The number of operations of the '<em>Default HG Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_HG_DEPENDENCY_SOURCE_OPERATION_COUNT = HG_DEPENDENCY_SOURCE_OPERATION_COUNT + 0;

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
   * The operation id for the '<em>Resolve Aggregated Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_HG_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES = 1;

    /**
   * The number of operations of the '<em>Abstract HG Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_HG_DEPENDENCY_OPERATION_COUNT = 2;

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
   * The feature id for the '<em><b>Initialized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY__INITIALIZED = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 1;

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
   * The operation id for the '<em>Resolve Aggregated Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES = ABSTRACT_HG_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES;

    /**
   * The operation id for the '<em>Get Aggregated Weight</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_AGGREGATED_DEPENDENCY___GET_AGGREGATED_WEIGHT = ABSTRACT_HG_DEPENDENCY_OPERATION_COUNT + 0;

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
   * The feature id for the '<em><b>Aggregated Core Dependency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 3;

    /**
   * The feature id for the '<em><b>Aggregated Core Dependency Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_RESOLVED = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 4;

    /**
   * The number of structural features of the '<em>HG Core Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY_FEATURE_COUNT = ABSTRACT_HG_DEPENDENCY_FEATURE_COUNT + 5;

    /**
   * The operation id for the '<em>Get Root Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY___GET_ROOT_NODE = ABSTRACT_HG_DEPENDENCY___GET_ROOT_NODE;

    /**
   * The operation id for the '<em>Resolve Aggregated Core Dependencies</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES = ABSTRACT_HG_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES;

    /**
   * The number of operations of the '<em>HG Core Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HG_CORE_DEPENDENCY_OPERATION_COUNT = ABSTRACT_HG_DEPENDENCY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.impl.NodeToCoreDependencyMapImpl <em>Node To Core Dependency Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.impl.NodeToCoreDependencyMapImpl
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getNodeToCoreDependencyMap()
   * @generated
   */
  int NODE_TO_CORE_DEPENDENCY_MAP = 9;

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
  int STRING_TO_STRING_MAP = 10;

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
  int IDENTIFIER_TO_NODE_MAP = 11;

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
  int NODE_TO_CORE_DEPENDENCIES_MAP = 12;

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
   * The meta object id for the '<em>IItem Label Provider</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.edit.provider.IItemLabelProvider
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIItemLabelProvider()
   * @generated
   */
  int IITEM_LABEL_PROVIDER = 13;


  /**
   * The meta object id for the '<em>Future</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.concurrent.Future
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getFuture()
   * @generated
   */
  int FUTURE = 14;


  /**
   * The meta object id for the '<em>IAggregated Core Dependency Resolver</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver
   * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIAggregatedCoreDependencyResolver()
   * @generated
   */
  int IAGGREGATED_CORE_DEPENDENCY_RESOLVER = 15;


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
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getIncomingDependenciesFrom(org.eclipse.emf.common.util.EList) <em>Get Incoming Dependencies From</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Incoming Dependencies From</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getIncomingDependenciesFrom(org.eclipse.emf.common.util.EList)
   * @generated
   */
  EOperation getHGNode__GetIncomingDependenciesFrom__EList();

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
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getOutgoingDependenciesTo(org.eclipse.emf.common.util.EList) <em>Get Outgoing Dependencies To</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Outgoing Dependencies To</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getOutgoingDependenciesTo(org.eclipse.emf.common.util.EList)
   * @generated
   */
  EOperation getHGNode__GetOutgoingDependenciesTo__EList();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#resolveIncomingAggregatedCoreDependencies(boolean) <em>Resolve Incoming Aggregated Core Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Resolve Incoming Aggregated Core Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#resolveIncomingAggregatedCoreDependencies(boolean)
   * @generated
   */
  EOperation getHGNode__ResolveIncomingAggregatedCoreDependencies__boolean();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#resolveOutgoingAggregatedCoreDependencies(boolean) <em>Resolve Outgoing Aggregated Core Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Resolve Outgoing Aggregated Core Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#resolveOutgoingAggregatedCoreDependencies(boolean)
   * @generated
   */
  EOperation getHGNode__ResolveOutgoingAggregatedCoreDependencies__boolean();

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
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGNode#getPredecessors() <em>Get Predecessors</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Predecessors</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGNode#getPredecessors()
   * @generated
   */
  EOperation getHGNode__GetPredecessors();

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
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGRootNode#getAggregatedCoreDependencyResolver <em>Aggregated Core Dependency Resolver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregated Core Dependency Resolver</em>'.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#getAggregatedCoreDependencyResolver()
   * @see #getHGRootNode()
   * @generated
   */
  EAttribute getHGRootNode_AggregatedCoreDependencyResolver();

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
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#invalidateCaches(org.eclipse.emf.common.util.EList) <em>Invalidate Caches</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Invalidate Caches</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#invalidateCaches(org.eclipse.emf.common.util.EList)
   * @generated
   */
  EOperation getHGRootNode__InvalidateCaches__EList();

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
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGRootNode#lookupNode(java.lang.Object) <em>Lookup Node</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Lookup Node</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGRootNode#lookupNode(java.lang.Object)
   * @generated
   */
  EOperation getHGRootNode__LookupNode__Object();

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
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.AbstractHGDependency#resolveAggregatedCoreDependencies() <em>Resolve Aggregated Core Dependencies</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Resolve Aggregated Core Dependencies</em>' operation.
   * @see org.slizaa.hierarchicalgraph.AbstractHGDependency#resolveAggregatedCoreDependencies()
   * @generated
   */
  EOperation getAbstractHGDependency__ResolveAggregatedCoreDependencies();

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
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency#isInitialized <em>Initialized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialized</em>'.
   * @see org.slizaa.hierarchicalgraph.HGAggregatedDependency#isInitialized()
   * @see #getHGAggregatedDependency()
   * @generated
   */
  EAttribute getHGAggregatedDependency_Initialized();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency#getAggregatedWeight() <em>Get Aggregated Weight</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Aggregated Weight</em>' operation.
   * @see org.slizaa.hierarchicalgraph.HGAggregatedDependency#getAggregatedWeight()
   * @generated
   */
  EOperation getHGAggregatedDependency__GetAggregatedWeight();

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
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#isAggregatedCoreDependency <em>Aggregated Core Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregated Core Dependency</em>'.
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#isAggregatedCoreDependency()
   * @see #getHGCoreDependency()
   * @generated
   */
  EAttribute getHGCoreDependency_AggregatedCoreDependency();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#isAggregatedCoreDependencyResolved <em>Aggregated Core Dependency Resolved</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregated Core Dependency Resolved</em>'.
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#isAggregatedCoreDependencyResolved()
   * @see #getHGCoreDependency()
   * @generated
   */
  EAttribute getHGCoreDependency_AggregatedCoreDependencyResolved();

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
   * Returns the meta object for data type '{@link org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver <em>IAggregated Core Dependency Resolver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>IAggregated Core Dependency Resolver</em>'.
   * @see org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver
   * @model instanceClass="org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver"
   * @generated
   */
  EDataType getIAggregatedCoreDependencyResolver();

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
    EOperation HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__ELIST = eINSTANCE.getHGNode__GetIncomingDependenciesFrom__EList();

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
    EOperation HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__ELIST = eINSTANCE.getHGNode__GetOutgoingDependenciesTo__EList();

    /**
     * The meta object literal for the '<em><b>Resolve Incoming Aggregated Core Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___RESOLVE_INCOMING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN = eINSTANCE.getHGNode__ResolveIncomingAggregatedCoreDependencies__boolean();

    /**
     * The meta object literal for the '<em><b>Resolve Outgoing Aggregated Core Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___RESOLVE_OUTGOING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN = eINSTANCE.getHGNode__ResolveOutgoingAggregatedCoreDependencies__boolean();

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
     * The meta object literal for the '<em><b>Get Predecessors</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_NODE___GET_PREDECESSORS = eINSTANCE.getHGNode__GetPredecessors();

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
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.HGDependencySource <em>HG Dependency Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.HGDependencySource
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
     * The meta object literal for the '<em><b>Aggregated Core Dependency Resolver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_ROOT_NODE__AGGREGATED_CORE_DEPENDENCY_RESOLVER = eINSTANCE.getHGRootNode_AggregatedCoreDependencyResolver();

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
    EOperation HG_ROOT_NODE___INVALIDATE_CACHES__ELIST = eINSTANCE.getHGRootNode__InvalidateCaches__EList();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_ROOT_NODE__NAME = eINSTANCE.getHGRootNode_Name();

    /**
     * The meta object literal for the '<em><b>Lookup Node</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_ROOT_NODE___LOOKUP_NODE__OBJECT = eINSTANCE.getHGRootNode__LookupNode__Object();

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
     * The meta object literal for the '<em><b>Resolve Aggregated Core Dependencies</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation ABSTRACT_HG_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES = eINSTANCE.getAbstractHGDependency__ResolveAggregatedCoreDependencies();

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
     * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_AGGREGATED_DEPENDENCY__INITIALIZED = eINSTANCE.getHGAggregatedDependency_Initialized();

    /**
     * The meta object literal for the '<em><b>Get Aggregated Weight</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HG_AGGREGATED_DEPENDENCY___GET_AGGREGATED_WEIGHT = eINSTANCE.getHGAggregatedDependency__GetAggregatedWeight();

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
     * The meta object literal for the '<em><b>Aggregated Core Dependency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY = eINSTANCE.getHGCoreDependency_AggregatedCoreDependency();

    /**
     * The meta object literal for the '<em><b>Aggregated Core Dependency Resolved</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_RESOLVED = eINSTANCE.getHGCoreDependency_AggregatedCoreDependencyResolved();

    /**
     * The meta object literal for the '<em><b>Dependency Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE = eINSTANCE.getHGCoreDependency_DependencySource();

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
     * The meta object literal for the '<em>IItem Label Provider</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.edit.provider.IItemLabelProvider
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIItemLabelProvider()
     * @generated
     */
    EDataType IITEM_LABEL_PROVIDER = eINSTANCE.getIItemLabelProvider();

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
     * The meta object literal for the '<em>IAggregated Core Dependency Resolver</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver
     * @see org.slizaa.hierarchicalgraph.impl.HierarchicalgraphPackageImpl#getIAggregatedCoreDependencyResolver()
     * @generated
     */
    EDataType IAGGREGATED_CORE_DEPENDENCY_RESOLVER = eINSTANCE.getIAggregatedCoreDependencyResolver();

  }

} //HierarchicalgraphPackage
