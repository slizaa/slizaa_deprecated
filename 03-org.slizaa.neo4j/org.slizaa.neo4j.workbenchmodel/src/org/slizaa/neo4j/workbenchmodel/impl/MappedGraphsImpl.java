/**
 */
package org.slizaa.neo4j.workbenchmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.hierarchicalgraph.HGRootNode;

import org.slizaa.neo4j.workbenchmodel.MappedGraphs;
import org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapped Graphs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.workbenchmodel.impl.MappedGraphsImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappedGraphsImpl extends MinimalEObjectImpl.Container implements MappedGraphs {
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected EList<HGRootNode> content;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappedGraphsImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return WorkbenchmodelPackage.Literals.MAPPED_GRAPHS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGRootNode> getContent() {
    if (content == null) {
      content = new EObjectResolvingEList<HGRootNode>(HGRootNode.class, this, WorkbenchmodelPackage.MAPPED_GRAPHS__CONTENT);
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case WorkbenchmodelPackage.MAPPED_GRAPHS__CONTENT:
        return getContent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case WorkbenchmodelPackage.MAPPED_GRAPHS__CONTENT:
        getContent().clear();
        getContent().addAll((Collection<? extends HGRootNode>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case WorkbenchmodelPackage.MAPPED_GRAPHS__CONTENT:
        getContent().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case WorkbenchmodelPackage.MAPPED_GRAPHS__CONTENT:
        return content != null && !content.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MappedGraphsImpl
