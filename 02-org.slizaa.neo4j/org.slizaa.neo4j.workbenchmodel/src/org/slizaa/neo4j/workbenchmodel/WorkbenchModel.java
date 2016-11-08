/**
 */
package org.slizaa.neo4j.workbenchmodel;

import org.eclipse.emf.ecore.EObject;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workbench Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.workbenchmodel.WorkbenchModel#getDatabases <em>Databases</em>}</li>
 *   <li>{@link org.slizaa.neo4j.workbenchmodel.WorkbenchModel#getMappedGraphs <em>Mapped Graphs</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage#getWorkbenchModel()
 * @model
 * @generated
 */
public interface WorkbenchModel extends EObject {
  /**
   * Returns the value of the '<em><b>Databases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Databases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Databases</em>' containment reference.
   * @see #setDatabases(DbAdapterRegistry)
   * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage#getWorkbenchModel_Databases()
   * @model containment="true" required="true"
   * @generated
   */
  DbAdapterRegistry getDatabases();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.workbenchmodel.WorkbenchModel#getDatabases <em>Databases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Databases</em>' containment reference.
   * @see #getDatabases()
   * @generated
   */
  void setDatabases(DbAdapterRegistry value);

  /**
   * Returns the value of the '<em><b>Mapped Graphs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Graphs</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Graphs</em>' reference.
   * @see #setMappedGraphs(MappedGraphs)
   * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage#getWorkbenchModel_MappedGraphs()
   * @model
   * @generated
   */
  MappedGraphs getMappedGraphs();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.workbenchmodel.WorkbenchModel#getMappedGraphs <em>Mapped Graphs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped Graphs</em>' reference.
   * @see #getMappedGraphs()
   * @generated
   */
  void setMappedGraphs(MappedGraphs value);

} // WorkbenchModel
