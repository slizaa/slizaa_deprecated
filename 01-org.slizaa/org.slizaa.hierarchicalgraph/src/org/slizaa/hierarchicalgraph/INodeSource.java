/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INode Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.INodeSource#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.INodeSource#getNode <em>Node</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.INodeSource#isAutoExpand <em>Auto Expand</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getINodeSource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface INodeSource extends EObject {
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
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getINodeSource_Identifier()
   * @model
   * @generated
   */
  Object getIdentifier();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.INodeSource#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(Object value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGNode#getNodeSource <em>Node Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' container reference.
   * @see #setNode(HGNode)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getINodeSource_Node()
   * @see org.slizaa.hierarchicalgraph.HGNode#getNodeSource
   * @model opposite="nodeSource" transient="false"
   * @generated
   */
  HGNode getNode();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.INodeSource#getNode <em>Node</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' container reference.
   * @see #getNode()
   * @generated
   */
  void setNode(HGNode value);

  /**
   * Returns the value of the '<em><b>Auto Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auto Expand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auto Expand</em>' attribute.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getINodeSource_AutoExpand()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  boolean isAutoExpand();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void onExpand();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void onCollapse();

} // INodeSource
