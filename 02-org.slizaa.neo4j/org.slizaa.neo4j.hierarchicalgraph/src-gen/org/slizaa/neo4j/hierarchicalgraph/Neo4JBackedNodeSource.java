/**
 */
package org.slizaa.neo4j.hierarchicalgraph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.slizaa.hierarchicalgraph.INodeSource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo4 JBacked Node Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedNodeSource()
 * @model
 * @generated
 */
public interface Neo4JBackedNodeSource extends INodeSource {
  /**
   * Returns the value of the '<em><b>Properties</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' map.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedNodeSource_Properties()
   * @model mapType="org.slizaa.hierarchicalgraph.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" changeable="false"
   * @generated
   */
  EMap<String, String> getProperties();

  /**
   * Returns the value of the '<em><b>Labels</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labels</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' attribute list.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedNodeSource_Labels()
   * @model changeable="false"
   * @generated
   */
  EList<String> getLabels();

} // Neo4JBackedNodeSource
