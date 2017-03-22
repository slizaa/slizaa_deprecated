/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui;

import org.osgi.framework.Bundle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Based Mapping Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBasePath <em>Base Path</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getBundleBasedMappingDescriptor()
 * @model
 * @generated
 */
public interface BundleBasedMappingDescriptor extends ISlizaaMappingDescriptor {
  /**
   * Returns the value of the '<em><b>Bundle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundle</em>' attribute.
   * @see #setBundle(Bundle)
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getBundleBasedMappingDescriptor_Bundle()
   * @model dataType="org.slizaa.neo4j.hierarchicalgraph.ui.Bundle"
   * @generated
   */
  Bundle getBundle();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBundle <em>Bundle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bundle</em>' attribute.
   * @see #getBundle()
   * @generated
   */
  void setBundle(Bundle value);

  /**
   * Returns the value of the '<em><b>Base Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Path</em>' attribute.
   * @see #setBasePath(String)
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getBundleBasedMappingDescriptor_BasePath()
   * @model
   * @generated
   */
  String getBasePath();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBasePath <em>Base Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Path</em>' attribute.
   * @see #getBasePath()
   * @generated
   */
  void setBasePath(String value);

} // BundleBasedMappingDescriptor
