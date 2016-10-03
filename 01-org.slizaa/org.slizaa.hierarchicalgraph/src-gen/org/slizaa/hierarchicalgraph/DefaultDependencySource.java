/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Dependency Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.DefaultDependencySource#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getDefaultDependencySource()
 * @model
 * @generated
 */
public interface DefaultDependencySource extends IDependencySource {
  /**
   * Returns the value of the '<em><b>Properties</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' map.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getDefaultDependencySource_Properties()
   * @model mapType="org.slizaa.hierarchicalgraph.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
   * @generated
   */
  Map<String, String> getProperties();

} // DefaultDependencySource
