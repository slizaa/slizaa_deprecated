/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.DependencyMapping#getMainQuery <em>Main Query</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.DependencyMapping#getDetailQueries <em>Detail Queries</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getDependencyMapping()
 * @model
 * @generated
 */
public interface DependencyMapping extends EObject {
  /**
   * Returns the value of the '<em><b>Main Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Query</em>' attribute.
   * @see #setMainQuery(String)
   * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getDependencyMapping_MainQuery()
   * @model dataType="org.slizaa.neo4j.hierarchicalgraph.mapping.CyperQuery" required="true"
   * @generated
   */
  String getMainQuery();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.DependencyMapping#getMainQuery <em>Main Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Query</em>' attribute.
   * @see #getMainQuery()
   * @generated
   */
  void setMainQuery(String value);

  /**
   * Returns the value of the '<em><b>Detail Queries</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detail Queries</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detail Queries</em>' attribute list.
   * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getDependencyMapping_DetailQueries()
   * @model dataType="org.slizaa.neo4j.hierarchicalgraph.mapping.CyperQuery"
   * @generated
   */
  EList<String> getDetailQueries();

} // DependencyMapping
