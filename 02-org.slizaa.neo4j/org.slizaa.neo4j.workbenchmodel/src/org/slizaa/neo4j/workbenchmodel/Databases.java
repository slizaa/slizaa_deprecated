/**
 */
package org.slizaa.neo4j.workbenchmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Databases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.workbenchmodel.Databases#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage#getDatabases()
 * @model
 * @generated
 */
public interface Databases extends EObject {
  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage#getDatabases_Content()
   * @model containment="true"
   * @generated
   */
  EList<INeo4JRepository> getContent();

} // Databases
