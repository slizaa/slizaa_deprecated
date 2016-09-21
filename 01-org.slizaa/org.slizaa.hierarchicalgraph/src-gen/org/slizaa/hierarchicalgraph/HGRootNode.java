/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>HG Root Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGRootNode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGRootNode()
 * @model
 * @generated
 */
public interface HGRootNode extends HGNode {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGRootNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGRootNode#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model
   * @generated
   */
  void invalidateAllCaches();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model modifiedNodesMany="true"
   * @generated
   */
  void invalidateCaches(List<HGNode> modifiedNodes);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model modifiedNodesMany="true"
   * @generated
   */
  void initializeCaches(List<HGNode> modifiedNodes);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model
   * @generated
   */
  HGNode lookupNode(Object identifier);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  <T> T getExtension(Class<T> clazz);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  <T> void registerExtension(Class<T> clazz, T extension);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  <T> boolean hasExtension(Class<T> key);

} // HGRootNode
