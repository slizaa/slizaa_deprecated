/**
 */
package org.slizaa.neo4j.dbadapter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getActiveDbAdapter <em>Active Db Adapter</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterRegistry()
 * @model
 * @generated
 */
public interface DbAdapterRegistry extends EObject {
  /**
   * Returns the value of the '<em><b>Active Db Adapter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active Db Adapter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active Db Adapter</em>' reference.
   * @see #setActiveDbAdapter(Neo4jRestClient)
   * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterRegistry_ActiveDbAdapter()
   * @model transient="true"
   * @generated
   */
  Neo4jRestClient getActiveDbAdapter();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getActiveDbAdapter <em>Active Db Adapter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active Db Adapter</em>' reference.
   * @see #getActiveDbAdapter()
   * @generated
   */
  void setActiveDbAdapter(Neo4jRestClient value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.dbadapter.DbAdapterContainer}.
   * It is bidirectional and its opposite is '{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterRegistry_Children()
   * @see org.slizaa.neo4j.dbadapter.DbAdapterContainer#getParent
   * @model opposite="parent" containment="true" required="true"
   * @generated
   */
  EList<DbAdapterContainer> getChildren();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model typeRequired="true"
   * @generated
   */
  DbAdapterContainer getDbAdapterContainer(ContainerType type);

} // DbAdapterRegistry
