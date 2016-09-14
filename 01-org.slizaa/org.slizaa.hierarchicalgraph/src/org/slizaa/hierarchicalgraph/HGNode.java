/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
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
  EList<HGNode> getChildren();

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
   * and the value is of type list of {@link org.slizaa.hierarchicalgraph.HGCoreDependency},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming Core Dependencies Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming Core Dependencies Map</em>' map.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_IncomingCoreDependenciesMap()
   * @model mapType="org.slizaa.hierarchicalgraph.NodeToCoreDependenciesMap<org.slizaa.hierarchicalgraph.HGNode, org.slizaa.hierarchicalgraph.HGCoreDependency>" ordered="false"
   * @generated
   */
  EMap<HGNode, EList<HGCoreDependency>> getIncomingCoreDependenciesMap();

  /**
   * Returns the value of the '<em><b>Outgoing Core Dependencies Map</b></em>' map.
   * The key is of type {@link org.slizaa.hierarchicalgraph.HGNode},
   * and the value is of type list of {@link org.slizaa.hierarchicalgraph.HGCoreDependency},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Core Dependencies Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Core Dependencies Map</em>' map.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_OutgoingCoreDependenciesMap()
   * @model mapType="org.slizaa.hierarchicalgraph.NodeToCoreDependenciesMap<org.slizaa.hierarchicalgraph.HGNode, org.slizaa.hierarchicalgraph.HGCoreDependency>" ordered="false"
   * @generated
   */
  EMap<HGNode, EList<HGCoreDependency>> getOutgoingCoreDependenciesMap();

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
   * <!-- begin-model-doc -->
   * Returns the unique identifier of this node.
   * <!-- end-model-doc -->
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
  HGAggregatedDependency getIncomingDependenciesFrom(HGNode node);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model nodesMany="true"
   * @generated
   */
  EList<HGAggregatedDependency> getIncomingDependenciesFrom(EList<HGNode> nodes);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Returns an aggregated dependency that wraps up all outgoing dependencies from this node to the specified target node.
   * If there are no such dependencies, <code>null</code> will be returned instead.
   * <!-- end-model-doc -->
   * @model targetNodeRequired="true"
   * @generated
   */
  HGAggregatedDependency getOutgoingDependenciesTo(HGNode targetNode);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Returns a list of aggregated dependencies that wrap up the outgoing dependencies from this node to the specified target nodes.
   * Note that no aggregated dependency will be added if there are no core dependencies from this node to a specified target node. That means that the result list eventually contains less elements 
   * than the specified list of target nodes.
   * <!-- end-model-doc -->
   * @model targetNodesMany="true"
   * @generated
   */
  EList<HGAggregatedDependency> getOutgoingDependenciesTo(EList<HGNode> targetNodes);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveIncomingAggregatedCoreDependencies(boolean includeChildren);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveOutgoingAggregatedCoreDependencies(boolean includeChildren);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  EList<HGCoreDependency> getOutgoingCoreDependencies(boolean includeChildren);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  EList<HGCoreDependency> getIncomingCoreDependencies(boolean includeChildren);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<HGNode> getPredecessors();

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
