/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract HG Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.AbstractHGDependency#getFrom <em>From</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.AbstractHGDependency#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getAbstractHGDependency()
 * @model abstract="true"
 * @generated
 */
public interface AbstractHGDependency extends EObject {
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(HGNode)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getAbstractHGDependency_From()
   * @model required="true"
   * @generated
   */
  HGNode getFrom();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.AbstractHGDependency#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(HGNode value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(HGNode)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getAbstractHGDependency_To()
   * @model required="true"
   * @generated
   */
  HGNode getTo();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.AbstractHGDependency#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(HGNode value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  HGRootNode getRootNode();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveAggregatedCoreDependencies();

} // AbstractHGDependency
