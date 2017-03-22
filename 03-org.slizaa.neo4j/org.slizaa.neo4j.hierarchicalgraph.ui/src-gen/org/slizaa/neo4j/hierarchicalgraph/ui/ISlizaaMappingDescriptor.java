/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISlizaa Mapping Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getMappingDescriptor <em>Mapping Descriptor</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getISlizaaMappingDescriptor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISlizaaMappingDescriptor extends EObject {
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
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getISlizaaMappingDescriptor_MappingDescriptor()
   * @model
   * @generated
   */
  MappingDescriptor getMappingDescriptor();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getMappingDescriptor <em>Mapping Descriptor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping Descriptor</em>' reference.
   * @see #getMappingDescriptor()
   * @generated
   */
  void setMappingDescriptor(MappingDescriptor value);

  /**
   * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Name</em>' attribute.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getISlizaaMappingDescriptor_QualifiedName()
   * @model changeable="false" volatile="true" derived="true"
   * @generated
   */
  String getQualifiedName();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getISlizaaMappingDescriptor_Name()
   * @model changeable="false" volatile="true" derived="true"
   * @generated
   */
  String getName();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getISlizaaMappingDescriptor_Description()
   * @model changeable="false" volatile="true" derived="true"
   * @generated
   */
  String getDescription();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  String resolveImage(String relativeImagePath);

} // ISlizaaMappingDescriptor
