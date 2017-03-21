/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Based Mapping Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBundleSymbolicName <em>Bundle Symbolic Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBasePath <em>Base Path</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getBundleBasedMappingDescriptor()
 * @model
 * @generated
 */
public interface BundleBasedMappingDescriptor extends ISlizaaMappingDescription {
  /**
   * Returns the value of the '<em><b>Bundle Symbolic Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundle Symbolic Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundle Symbolic Name</em>' attribute.
   * @see #setBundleSymbolicName(String)
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getBundleBasedMappingDescriptor_BundleSymbolicName()
   * @model
   * @generated
   */
  String getBundleSymbolicName();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBundleSymbolicName <em>Bundle Symbolic Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bundle Symbolic Name</em>' attribute.
   * @see #getBundleSymbolicName()
   * @generated
   */
  void setBundleSymbolicName(String value);

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
