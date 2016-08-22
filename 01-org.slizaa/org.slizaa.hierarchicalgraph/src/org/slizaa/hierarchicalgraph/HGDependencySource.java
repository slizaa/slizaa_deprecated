/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Dependency Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGDependencySource#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGDependencySource#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependencySource()
 * @model
 * @generated
 */
public interface HGDependencySource extends EObject {
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
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependencySource_Identifier()
   * @model
   * @generated
   */
  Object getIdentifier();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGDependencySource#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(Object value);

  /**
   * Returns the value of the '<em><b>Dependency</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency</em>' reference.
   * @see #setDependency(HGDependency)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependencySource_Dependency()
   * @model required="true"
   * @generated
   */
  HGDependency getDependency();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGDependencySource#getDependency <em>Dependency</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency</em>' reference.
   * @see #getDependency()
   * @generated
   */
  void setDependency(HGDependency value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void onResolveAggregatedCoreDependency();

} // HGDependencySource
