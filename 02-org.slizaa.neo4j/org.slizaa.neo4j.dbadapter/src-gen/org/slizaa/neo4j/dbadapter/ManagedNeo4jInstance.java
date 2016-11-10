/**
 */
package org.slizaa.neo4j.dbadapter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Managed Neo4j Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#isRunning <em>Running</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#isScanned <em>Scanned</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#getStorageArea <em>Storage Area</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#getDirectoriesToScan <em>Directories To Scan</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getManagedNeo4jInstance()
 * @model
 * @generated
 */
public interface ManagedNeo4jInstance extends Neo4jRestClient {
  /**
   * Returns the value of the '<em><b>Running</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Running</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Running</em>' attribute.
   * @see #setRunning(boolean)
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getManagedNeo4jInstance_Running()
   * @model
   * @generated
   */
  boolean isRunning();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#isRunning <em>Running</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Running</em>' attribute.
   * @see #isRunning()
   * @generated
   */
  void setRunning(boolean value);

  /**
   * Returns the value of the '<em><b>Scanned</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scanned</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scanned</em>' attribute.
   * @see #setScanned(boolean)
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getManagedNeo4jInstance_Scanned()
   * @model
   * @generated
   */
  boolean isScanned();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#isScanned <em>Scanned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scanned</em>' attribute.
   * @see #isScanned()
   * @generated
   */
  void setScanned(boolean value);

  /**
   * Returns the value of the '<em><b>Storage Area</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storage Area</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage Area</em>' attribute.
   * @see #setStorageArea(String)
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getManagedNeo4jInstance_StorageArea()
   * @model
   * @generated
   */
  String getStorageArea();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#getStorageArea <em>Storage Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Storage Area</em>' attribute.
   * @see #getStorageArea()
   * @generated
   */
  void setStorageArea(String value);

  /**
   * Returns the value of the '<em><b>Directories To Scan</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directories To Scan</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directories To Scan</em>' attribute list.
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getManagedNeo4jInstance_DirectoriesToScan()
   * @model required="true"
   * @generated
   */
  EList<String> getDirectoriesToScan();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void scan();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void start();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void stop();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void delete();

} // ManagedNeo4jInstance
