/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGDependency#getDependencySource <em>Dependency Source</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGDependency#getFrom <em>From</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGDependency#getTo <em>To</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGDependency#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGDependency#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependency()
 * @model
 * @generated
 */
public interface HGDependency extends EObject {

  /**
   * Returns the value of the '<em><b>Dependency Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency Source</em>' containment reference.
   * @see #setDependencySource(HGDependencySource)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependency_DependencySource()
   * @model containment="true" required="true"
   * @generated
   */
  HGDependencySource getDependencySource();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGDependency#getDependencySource <em>Dependency Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency Source</em>' containment reference.
   * @see #getDependencySource()
   * @generated
   */
  void setDependencySource(HGDependencySource value);

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
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependency_From()
   * @model required="true"
   * @generated
   */
  HGNode getFrom();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGDependency#getFrom <em>From</em>}' reference.
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
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependency_To()
   * @model required="true"
   * @generated
   */
  HGNode getTo();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGDependency#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(HGNode value);

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependency_Dependencies()
   * @model transient="true" derived="true"
   * @generated
   */
  List<HGDependency> getDependencies();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.slizaa.hierarchicalgraph.DependencyType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.slizaa.hierarchicalgraph.DependencyType
   * @see #setType(DependencyType)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGDependency_Type()
   * @model
   * @generated
   */
  DependencyType getType();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGDependency#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.slizaa.hierarchicalgraph.DependencyType
   * @see #getType()
   * @generated
   */
  void setType(DependencyType value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  List<HGDependency> getCoreDependencies();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  int getWeight();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveAggregatedCoreDependency();
} // HGDependency
