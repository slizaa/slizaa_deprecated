/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.concurrent.Future;
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
   * Returns the value of the '<em><b>Dependency</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource <em>Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency</em>' container reference.
   * @see #setDependency(HGCoreDependency)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependencySource_Dependency()
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource
   * @model opposite="dependencySource" required="true" transient="false"
   * @generated
   */
  HGCoreDependency getDependency();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGDependencySource#getDependency <em>Dependency</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency</em>' container reference.
   * @see #getDependency()
   * @generated
   */
  void setDependency(HGCoreDependency value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.hierarchicalgraph.Future<?>"
   * @generated
   */
  Future<?> onResolveAggregatedCoreDependency();

} // HGDependencySource
