/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Proxy Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGProxyDependency#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGProxyDependency#getResolvedCoreDependencies <em>Resolved Core Dependencies</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGProxyDependency()
 * @model
 * @generated
 */
public interface HGProxyDependency extends HGCoreDependency {
  /**
   * Returns the value of the '<em><b>Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolved</em>' attribute.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGProxyDependency_Resolved()
   * @model changeable="false"
   * @generated
   */
  boolean isResolved();

  /**
   * Returns the value of the '<em><b>Resolved Core Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGCoreDependency}.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getProxyDependencyParent <em>Proxy Dependency Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolved Core Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolved Core Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGProxyDependency_ResolvedCoreDependencies()
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#getProxyDependencyParent
   * @model opposite="proxyDependencyParent"
   * @generated
   */
  List<HGCoreDependency> getResolvedCoreDependencies();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveProxyDependencies();

} // HGProxyDependency
