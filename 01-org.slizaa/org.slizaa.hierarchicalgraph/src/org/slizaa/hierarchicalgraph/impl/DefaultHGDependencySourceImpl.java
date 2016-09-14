/**
 */
package org.slizaa.hierarchicalgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.hierarchicalgraph.DefaultHGDependencySource;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default HG Dependency Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.DefaultHGDependencySourceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.DefaultHGDependencySourceImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.DefaultHGDependencySourceImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultHGDependencySourceImpl extends MinimalEObjectImpl.Container implements DefaultHGDependencySource {
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final Object IDENTIFIER_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected Object identifier = IDENTIFIER_EDEFAULT;
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EMap<String, String> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultHGDependencySourceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.DEFAULT_HG_DEPENDENCY_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getIdentifier() {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(Object newIdentifier) {
    Object oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGCoreDependency getDependency() {
    if (eContainerFeatureID() != HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY) return null;
    return (HGCoreDependency)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependency(HGCoreDependency newDependency, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newDependency, HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependency(HGCoreDependency newDependency) {
    if (newDependency != eInternalContainer() || (eContainerFeatureID() != HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY && newDependency != null)) {
      if (EcoreUtil.isAncestor(this, newDependency))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newDependency != null)
        msgs = ((InternalEObject)newDependency).eInverseAdd(this, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE, HGCoreDependency.class, msgs);
      msgs = basicSetDependency(newDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY, newDependency, newDependency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getProperties() {
    if (properties == null) {
      properties = new EcoreEMap<String,String>(HierarchicalgraphPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetDependency((HGCoreDependency)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY:
        return basicSetDependency(null, msgs);
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY:
        return eInternalContainer().eInverseRemove(this, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE, HGCoreDependency.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__IDENTIFIER:
        return getIdentifier();
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY:
        return getDependency();
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES:
        if (coreType) return getProperties();
        else return getProperties().map();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__IDENTIFIER:
        setIdentifier(newValue);
        return;
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY:
        setDependency((HGCoreDependency)newValue);
        return;
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES:
        ((EStructuralFeature.Setting)getProperties()).set(newValue);
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
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY:
        setDependency((HGCoreDependency)null);
        return;
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES:
        getProperties().clear();
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
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__DEPENDENCY:
        return getDependency() != null;
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //DefaultHGDependencySourceImpl
