/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Root Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGRootNode#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGRootNode#getItemLabelProvider <em>Item Label Provider</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGRootNode#getAggregatedCoreDependencyResolver <em>Aggregated Core Dependency Resolver</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGRootNode()
 * @model
 * @generated
 */
public interface HGRootNode extends HGNode {
  /**
   * Returns the value of the '<em><b>Item Label Provider</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item Label Provider</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Label Provider</em>' attribute.
   * @see #setItemLabelProvider(IItemLabelProvider)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGRootNode_ItemLabelProvider()
   * @model dataType="org.slizaa.hierarchicalgraph.IItemLabelProvider" required="true" transient="true"
   * @generated
   */
  IItemLabelProvider getItemLabelProvider();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGRootNode#getItemLabelProvider <em>Item Label Provider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Label Provider</em>' attribute.
   * @see #getItemLabelProvider()
   * @generated
   */
  void setItemLabelProvider(IItemLabelProvider value);

  /**
   * Returns the value of the '<em><b>Aggregated Core Dependency Resolver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregated Core Dependency Resolver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregated Core Dependency Resolver</em>' attribute.
   * @see #setAggregatedCoreDependencyResolver(IAggregatedCoreDependencyResolver)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGRootNode_AggregatedCoreDependencyResolver()
   * @model dataType="org.slizaa.hierarchicalgraph.IAggregatedCoreDependencyResolver"
   * @generated
   */
  IAggregatedCoreDependencyResolver getAggregatedCoreDependencyResolver();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGRootNode#getAggregatedCoreDependencyResolver <em>Aggregated Core Dependency Resolver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregated Core Dependency Resolver</em>' attribute.
   * @see #getAggregatedCoreDependencyResolver()
   * @generated
   */
  void setAggregatedCoreDependencyResolver(IAggregatedCoreDependencyResolver value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
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
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGRootNode#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  HGNode lookupNode(Object identifier);

} // HGRootNode
