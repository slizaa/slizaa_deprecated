/**
 */
package org.slizaa.neo4j.hierarchicalgraph;

import java.util.Optional;
import org.eclipse.emf.common.util.EMap;
import org.slizaa.hierarchicalgraph.IDependencySource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo4 JBacked Dependency Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getType <em>Type</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getUserObject <em>User Object</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedDependencySource()
 * @model
 * @generated
 */
public interface Neo4JBackedDependencySource extends IDependencySource {
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
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedDependencySource_Properties()
   * @model mapType="org.slizaa.hierarchicalgraph.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" changeable="false"
   * @generated
   */
  EMap<String, String> getProperties();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedDependencySource_Type()
   * @model required="true"
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>User Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Object</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Object</em>' attribute.
   * @see #setUserObject(Object)
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedDependencySource_UserObject()
   * @model
   * @generated
   */
  Object getUserObject();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getUserObject <em>User Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Object</em>' attribute.
   * @see #getUserObject()
   * @generated
   */
  void setUserObject(Object value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.hierarchicalgraph.Optional<T>" required="true" typeRequired="true"
   * @generated
   */
  <T> Optional<T> getUserObject(Class<T> type);

} // Neo4JBackedDependencySource
