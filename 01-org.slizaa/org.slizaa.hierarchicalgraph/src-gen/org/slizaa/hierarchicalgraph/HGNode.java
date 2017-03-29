/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;
import java.util.Optional;
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
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getOutgoingCoreDependencies <em>Outgoing Core Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getAccumulatedOutgoingCoreDependencies <em>Accumulated Outgoing Core Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getIncomingCoreDependencies <em>Incoming Core Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGNode#getAccumulatedIncomingCoreDependencies <em>Accumulated Incoming Core Dependencies</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode()
 * @model
 * @generated
 */
public interface HGNode extends EObject {
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
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGNode#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
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
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
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
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.INodeSource#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Source</em>' containment reference.
   * @see #setNodeSource(INodeSource)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_NodeSource()
   * @see org.slizaa.hierarchicalgraph.INodeSource#getNode
   * @model opposite="node" containment="true"
   * @generated
   */
  INodeSource getNodeSource();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGNode#getNodeSource <em>Node Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Source</em>' containment reference.
   * @see #getNodeSource()
   * @generated
   */
  void setNodeSource(INodeSource value);

  /**
   * Returns the value of the '<em><b>Outgoing Core Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGCoreDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Core Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Core Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_OutgoingCoreDependencies()
   * @model resolveProxies="false" volatile="true" ordered="false"
   * @generated
   */
  List<HGCoreDependency> getOutgoingCoreDependencies();

  /**
   * Returns the value of the '<em><b>Accumulated Outgoing Core Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGCoreDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accumulated Outgoing Core Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accumulated Outgoing Core Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_AccumulatedOutgoingCoreDependencies()
   * @model resolveProxies="false" volatile="true" ordered="false"
   * @generated
   */
  List<HGCoreDependency> getAccumulatedOutgoingCoreDependencies();

  /**
   * Returns the value of the '<em><b>Incoming Core Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGCoreDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming Core Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming Core Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_IncomingCoreDependencies()
   * @model resolveProxies="false" volatile="true" ordered="false"
   * @generated
   */
  List<HGCoreDependency> getIncomingCoreDependencies();

  /**
   * Returns the value of the '<em><b>Accumulated Incoming Core Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGCoreDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accumulated Incoming Core Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accumulated Incoming Core Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGNode_AccumulatedIncomingCoreDependencies()
   * @model resolveProxies="false" volatile="true" ordered="false"
   * @generated
   */
  List<HGCoreDependency> getAccumulatedIncomingCoreDependencies();

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

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  List<HGNode> getPredecessors();

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
  List<HGAggregatedDependency> getIncomingDependenciesFrom(List<HGNode> nodes);

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
  List<HGAggregatedDependency> getOutgoingDependenciesTo(List<HGNode> targetNodes);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveIncomingProxyDependencies();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveOutgoingProxyDependencies();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.hierarchicalgraph.Optional<T>" required="true"
   * @generated
   */
  <T> Optional<T> getNodeSource(Class<T> clazz);

} // HGNode
