/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.Optional;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Core Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getType <em>Type</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource <em>Dependency Source</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getProxyDependencyParent <em>Proxy Dependency Parent</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency()
 * @model
 * @generated
 */
public interface HGCoreDependency extends AbstractHGDependency {
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
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(int)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency_Weight()
   * @model default="1"
   * @generated
   */
  int getWeight();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(int value);

  /**
   * Returns the value of the '<em><b>Dependency Source</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.IDependencySource#getDependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency Source</em>' containment reference.
   * @see #setDependencySource(IDependencySource)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency_DependencySource()
   * @see org.slizaa.hierarchicalgraph.IDependencySource#getDependency
   * @model opposite="dependency" containment="true"
   * @generated
   */
  IDependencySource getDependencySource();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource <em>Dependency Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency Source</em>' containment reference.
   * @see #getDependencySource()
   * @generated
   */
  void setDependencySource(IDependencySource value);

  /**
   * Returns the value of the '<em><b>Proxy Dependency Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGProxyDependency#getResolvedCoreDependencies <em>Resolved Core Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proxy Dependency Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proxy Dependency Parent</em>' reference.
   * @see #setProxyDependencyParent(HGProxyDependency)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency_ProxyDependencyParent()
   * @see org.slizaa.hierarchicalgraph.HGProxyDependency#getResolvedCoreDependencies
   * @model opposite="resolvedCoreDependencies"
   * @generated
   */
  HGProxyDependency getProxyDependencyParent();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getProxyDependencyParent <em>Proxy Dependency Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proxy Dependency Parent</em>' reference.
   * @see #getProxyDependencyParent()
   * @generated
   */
  void setProxyDependencyParent(HGProxyDependency value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.hierarchicalgraph.Optional<T>" required="true"
   * @generated
   */
  <T> Optional<T> getDependencySource(Class<T> clazz);

} // HGCoreDependency
