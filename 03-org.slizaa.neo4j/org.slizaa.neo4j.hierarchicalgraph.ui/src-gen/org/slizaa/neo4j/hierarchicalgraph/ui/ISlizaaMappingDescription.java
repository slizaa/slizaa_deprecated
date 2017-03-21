/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISlizaa Mapping Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescription#getMappingDescriptor <em>Mapping Descriptor</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getISlizaaMappingDescription()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISlizaaMappingDescription extends EObject {
  /**
   * Returns the value of the '<em><b>Mapping Descriptor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping Descriptor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping Descriptor</em>' reference.
   * @see #setMappingDescriptor(MappingDescriptor)
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getISlizaaMappingDescription_MappingDescriptor()
   * @model
   * @generated
   */
  MappingDescriptor getMappingDescriptor();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescription#getMappingDescriptor <em>Mapping Descriptor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping Descriptor</em>' reference.
   * @see #getMappingDescriptor()
   * @generated
   */
  void setMappingDescriptor(MappingDescriptor value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveImage(String relativeImagePath);

} // ISlizaaMappingDescription
