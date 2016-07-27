/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getRootNode <em>Root Node</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getParent <em>Parent</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getChildren <em>Children</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getNodeSource <em>Node Source</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getIncomingCoreDependenciesMap <em>Incoming Core Dependencies Map</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getOutgoingCoreDependenciesMap <em>Outgoing Core Dependencies Map</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode()
 * @model
 * @generated
 */
public interface HGNode extends EObject {
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGNode#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(HGNode)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_Parent()
   * @see org.slizaa.hierarchicalgraph.HGNode#getChildren
   * @model opposite="children" resolveProxies="false" transient="false"
   * @generated
   */
  HGNode getParent();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGNode#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(HGNode value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGNode}.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGNode#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_Children()
   * @see org.slizaa.hierarchicalgraph.HGNode#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  List<HGNode> getChildren();

  /**
   * Returns the value of the '<em><b>Node Source</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGNodeSource#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Source</em>' containment reference.
   * @see #setNodeSource(HGNodeSource)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_NodeSource()
   * @see org.slizaa.hierarchicalgraph.HGNodeSource#getNode
   * @model opposite="node" containment="true"
   * @generated
   */
  HGNodeSource getNodeSource();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGNode#getNodeSource <em>Node Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Source</em>' containment reference.
   * @see #getNodeSource()
   * @generated
   */
  void setNodeSource(HGNodeSource value);

  /**
   * Returns the value of the '<em><b>Incoming Core Dependencies Map</b></em>' map.
   * The key is of type {@link org.slizaa.hierarchicalgraph.HGNode},
   * and the value is of type list of {@link org.slizaa.hierarchicalgraph.HGDependency},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming Core Dependencies Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming Core Dependencies Map</em>' map.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_IncomingCoreDependenciesMap()
   * @model mapType="org.slizaa.hierarchicalgraph.NodeToDependenciesMap<org.slizaa.hierarchicalgraph.HGNode, org.slizaa.hierarchicalgraph.HGDependency>" ordered="false"
   * @generated
   */
  Map<HGNode, List<HGDependency>> getIncomingCoreDependenciesMap();

  /**
   * Returns the value of the '<em><b>Outgoing Core Dependencies Map</b></em>' map.
   * The key is of type {@link org.slizaa.hierarchicalgraph.HGNode},
   * and the value is of type list of {@link org.slizaa.hierarchicalgraph.HGDependency},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Core Dependencies Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Core Dependencies Map</em>' map.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_OutgoingCoreDependenciesMap()
   * @model mapType="org.slizaa.hierarchicalgraph.NodeToDependenciesMap<org.slizaa.hierarchicalgraph.HGNode, org.slizaa.hierarchicalgraph.HGDependency>" ordered="false"
   * @generated
   */
  Map<HGNode, List<HGDependency>> getOutgoingCoreDependenciesMap();

  /**
   * Returns the value of the '<em><b>Root Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Node</em>' reference.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_RootNode()
   * @model resolveProxies="false" transient="true" changeable="false" derived="true"
   * @generated
   */
  HGRootNode getRootNode();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  Object getIdentifier();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  HGDependency getIncomingDependenciesFrom(HGNode node);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model nodesMany="true"
   * @generated
   */
  List<HGDependency> getIncomingDependenciesFrom(List<HGNode> nodes);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  HGDependency getOutgoingDependenciesTo(HGNode node);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model nodesMany="true"
   * @generated
   */
  List<HGDependency> getOutgoingDependenciesTo(List<HGNode> nodes);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  List<HGDependency> getOutgoingCoreDependencies(boolean includeChildren);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  List<HGDependency> getIncomingCoreDependencies(boolean includeChildren);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" nodeRequired="true"
   * @generated
   */
  boolean isPredecessorOf(HGNode node);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" nodeRequired="true"
   * @generated
   */
  boolean isSuccessorOf(HGNode node);
} // HGNode
