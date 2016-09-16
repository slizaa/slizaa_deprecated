/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDependency Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.IDependencySource#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.IDependencySource#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getIDependencySource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDependencySource extends EObject {
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(Object)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getIDependencySource_Identifier()
   * @model
   * @generated
   */
  Object getIdentifier();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.IDependencySource#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(Object value);

  /**
   * Returns the value of the '<em><b>Dependency</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource <em>Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency</em>' container reference.
   * @see #setDependency(HGCoreDependency)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getIDependencySource_Dependency()
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource
   * @model opposite="dependencySource" required="true" transient="false"
   * @generated
   */
  HGCoreDependency getDependency();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.IDependencySource#getDependency <em>Dependency</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency</em>' container reference.
   * @see #getDependency()
   * @generated
   */
  void setDependency(HGCoreDependency value);

} // IDependencySource
