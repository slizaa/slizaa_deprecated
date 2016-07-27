/**
 */
package org.slizaa.neo4j.workbenchmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;

import org.slizaa.neo4j.workbenchmodel.Databases;
import org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.workbenchmodel.impl.DatabasesImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabasesImpl extends MinimalEObjectImpl.Container implements Databases {
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected EList<INeo4JRepository> content;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabasesImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return WorkbenchmodelPackage.Literals.DATABASES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<INeo4JRepository> getContent() {
    if (content == null) {
      content = new EObjectContainmentEList<INeo4JRepository>(INeo4JRepository.class, this, WorkbenchmodelPackage.DATABASES__CONTENT);
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case WorkbenchmodelPackage.DATABASES__CONTENT:
        return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case WorkbenchmodelPackage.DATABASES__CONTENT:
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
      case WorkbenchmodelPackage.DATABASES__CONTENT:
        getContent().clear();
        getContent().addAll((Collection<? extends INeo4JRepository>)newValue);
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
      case WorkbenchmodelPackage.DATABASES__CONTENT:
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
      case WorkbenchmodelPackage.DATABASES__CONTENT:
        return content != null && !content.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DatabasesImpl
