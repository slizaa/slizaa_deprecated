/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;
import java.util.Map;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>HG Root Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGRootNode#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGRootNode#getExtensionRegistry <em>Extension Registry</em>}</li>
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
   * Returns the value of the '<em><b>Extension Registry</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.Object},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension Registry</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension Registry</em>' map.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGRootNode_ExtensionRegistry()
   * @model mapType="org.slizaa.hierarchicalgraph.StringToObjectMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject>"
   * @generated
   */
  Map<String, Object> getExtensionRegistry();

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
  <T> T getExtension(String key, Class<T> clazz);

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
  void registerExtension(String clazz, Object extension);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  <T> boolean hasExtension(Class<T> key);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  <T> boolean hasExtension(String key, Class<T> type);

} // HGRootNode
