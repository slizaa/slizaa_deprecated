/**
 */
package org.slizaa.neo4j.hierarchicalgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

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
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory
 * @model kind="package"
 * @generated
 */
public interface Neo4jHierarchicalgraphPackage extends EPackage {
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
  String eNS_URI = "http://org/slizaa/neo4j/hierarchicalgraph";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.slizaa.neo4j.hierarchicalgraph";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Neo4jHierarchicalgraphPackage eINSTANCE = org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl.init();

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl <em>Neo4 JBacked Node Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedNodeSource()
   * @generated
   */
  int NEO4_JBACKED_NODE_SOURCE = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE__IDENTIFIER = HierarchicalgraphPackage.INODE_SOURCE__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Node</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE__NODE = HierarchicalgraphPackage.INODE_SOURCE__NODE;

  /**
   * The feature id for the '<em><b>Auto Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE__AUTO_EXPAND = HierarchicalgraphPackage.INODE_SOURCE__AUTO_EXPAND;

  /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE__PROPERTIES = HierarchicalgraphPackage.INODE_SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Labels</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE__LABELS = HierarchicalgraphPackage.INODE_SOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Neo4 JBacked Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE_FEATURE_COUNT = HierarchicalgraphPackage.INODE_SOURCE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>On Expand</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE___ON_EXPAND = HierarchicalgraphPackage.INODE_SOURCE___ON_EXPAND;

  /**
   * The operation id for the '<em>On Collapse</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE___ON_COLLAPSE = HierarchicalgraphPackage.INODE_SOURCE___ON_COLLAPSE;

  /**
   * The operation id for the '<em>On Select</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE___ON_SELECT = HierarchicalgraphPackage.INODE_SOURCE___ON_SELECT;

  /**
   * The number of operations of the '<em>Neo4 JBacked Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE_OPERATION_COUNT = HierarchicalgraphPackage.INODE_SOURCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl <em>Neo4 JBacked Root Node Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedRootNodeSource()
   * @generated
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE = 1;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE__IDENTIFIER = NEO4_JBACKED_NODE_SOURCE__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Node</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE__NODE = NEO4_JBACKED_NODE_SOURCE__NODE;

  /**
   * The feature id for the '<em><b>Auto Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE__AUTO_EXPAND = NEO4_JBACKED_NODE_SOURCE__AUTO_EXPAND;

  /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE__PROPERTIES = NEO4_JBACKED_NODE_SOURCE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Labels</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE__LABELS = NEO4_JBACKED_NODE_SOURCE__LABELS;

  /**
   * The feature id for the '<em><b>Repository</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY = NEO4_JBACKED_NODE_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Neo4 JBacked Root Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE_FEATURE_COUNT = NEO4_JBACKED_NODE_SOURCE_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>On Expand</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE___ON_EXPAND = NEO4_JBACKED_NODE_SOURCE___ON_EXPAND;

  /**
   * The operation id for the '<em>On Collapse</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE___ON_COLLAPSE = NEO4_JBACKED_NODE_SOURCE___ON_COLLAPSE;

  /**
   * The operation id for the '<em>On Select</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE___ON_SELECT = NEO4_JBACKED_NODE_SOURCE___ON_SELECT;

  /**
   * The number of operations of the '<em>Neo4 JBacked Root Node Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE_OPERATION_COUNT = NEO4_JBACKED_NODE_SOURCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl <em>Neo4 JBacked Dependency Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedDependencySource()
   * @generated
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE = 2;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE__IDENTIFIER = HierarchicalgraphPackage.IDEPENDENCY_SOURCE__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Dependency</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY = HierarchicalgraphPackage.IDEPENDENCY_SOURCE__DEPENDENCY;

  /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES = HierarchicalgraphPackage.IDEPENDENCY_SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE = HierarchicalgraphPackage.IDEPENDENCY_SOURCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>User Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE__USER_OBJECT = HierarchicalgraphPackage.IDEPENDENCY_SOURCE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Neo4 JBacked Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE_FEATURE_COUNT = HierarchicalgraphPackage.IDEPENDENCY_SOURCE_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Get User Object</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE___GET_USER_OBJECT__CLASS = HierarchicalgraphPackage.IDEPENDENCY_SOURCE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Neo4 JBacked Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE_OPERATION_COUNT = HierarchicalgraphPackage.IDEPENDENCY_SOURCE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '<em>Optional</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.Optional
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getOptional()
   * @generated
   */
  int OPTIONAL = 3;


  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource <em>Neo4 JBacked Node Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neo4 JBacked Node Source</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource
   * @generated
   */
  EClass getNeo4JBackedNodeSource();

  /**
   * Returns the meta object for the map '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Properties</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getProperties()
   * @see #getNeo4JBackedNodeSource()
   * @generated
   */
  EReference getNeo4JBackedNodeSource_Properties();

  /**
   * Returns the meta object for the attribute list '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Labels</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getLabels()
   * @see #getNeo4JBackedNodeSource()
   * @generated
   */
  EAttribute getNeo4JBackedNodeSource_Labels();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource <em>Neo4 JBacked Root Node Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neo4 JBacked Root Node Source</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource
   * @generated
   */
  EClass getNeo4JBackedRootNodeSource();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Repository</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource#getRepository()
   * @see #getNeo4JBackedRootNodeSource()
   * @generated
   */
  EReference getNeo4JBackedRootNodeSource_Repository();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource <em>Neo4 JBacked Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neo4 JBacked Dependency Source</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource
   * @generated
   */
  EClass getNeo4JBackedDependencySource();

  /**
   * Returns the meta object for the map '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Properties</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getProperties()
   * @see #getNeo4JBackedDependencySource()
   * @generated
   */
  EReference getNeo4JBackedDependencySource_Properties();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getType()
   * @see #getNeo4JBackedDependencySource()
   * @generated
   */
  EAttribute getNeo4JBackedDependencySource_Type();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getUserObject <em>User Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Object</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getUserObject()
   * @see #getNeo4JBackedDependencySource()
   * @generated
   */
  EAttribute getNeo4JBackedDependencySource_UserObject();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getUserObject(java.lang.Class) <em>Get User Object</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get User Object</em>' operation.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getUserObject(java.lang.Class)
   * @generated
   */
  EOperation getNeo4JBackedDependencySource__GetUserObject__Class();

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
  Neo4jHierarchicalgraphFactory getNeo4jHierarchicalgraphFactory();

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
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl <em>Neo4 JBacked Node Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedNodeSource()
     * @generated
     */
    EClass NEO4_JBACKED_NODE_SOURCE = eINSTANCE.getNeo4JBackedNodeSource();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEO4_JBACKED_NODE_SOURCE__PROPERTIES = eINSTANCE.getNeo4JBackedNodeSource_Properties();

    /**
     * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4_JBACKED_NODE_SOURCE__LABELS = eINSTANCE.getNeo4JBackedNodeSource_Labels();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl <em>Neo4 JBacked Root Node Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedRootNodeSource()
     * @generated
     */
    EClass NEO4_JBACKED_ROOT_NODE_SOURCE = eINSTANCE.getNeo4JBackedRootNodeSource();

    /**
     * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY = eINSTANCE.getNeo4JBackedRootNodeSource_Repository();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl <em>Neo4 JBacked Dependency Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedDependencySource()
     * @generated
     */
    EClass NEO4_JBACKED_DEPENDENCY_SOURCE = eINSTANCE.getNeo4JBackedDependencySource();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES = eINSTANCE.getNeo4JBackedDependencySource_Properties();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE = eINSTANCE.getNeo4JBackedDependencySource_Type();

    /**
     * The meta object literal for the '<em><b>User Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4_JBACKED_DEPENDENCY_SOURCE__USER_OBJECT = eINSTANCE.getNeo4JBackedDependencySource_UserObject();

    /**
     * The meta object literal for the '<em><b>Get User Object</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4_JBACKED_DEPENDENCY_SOURCE___GET_USER_OBJECT__CLASS = eINSTANCE.getNeo4JBackedDependencySource__GetUserObject__Class();

    /**
     * The meta object literal for the '<em>Optional</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.Optional
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getOptional()
     * @generated
     */
    EDataType OPTIONAL = eINSTANCE.getOptional();

  }

} //Neo4jHierarchicalgraphPackage
