/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HG Dependency</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGDependencyImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGDependencyImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGDependencyImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGDependencyImpl#isCoreDependency <em>Core Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGDependencyImpl extends MinimalEObjectImpl.Container implements HGDependency {
  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected HGNode               from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected HGNode               to;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<HGDependency>  dependencies;

  /**
   * The default value of the '{@link #isCoreDependency() <em>Core Dependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCoreDependency()
   * @generated
   * @ordered
   */
  protected static final boolean CORE_DEPENDENCY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCoreDependency() <em>Core Dependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCoreDependency()
   * @generated
   * @ordered
   */
  protected boolean              coreDependency           = CORE_DEPENDENCY_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected HGDependencyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.HG_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public HGNode getFrom() {
    if (from != null && from.eIsProxy()) {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (HGNode)eResolveProxy(oldFrom);
      if (from != oldFrom) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.HG_DEPENDENCY__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public HGNode basicGetFrom() {
    return from;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(HGNode newFrom) {
    HGNode oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_DEPENDENCY__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public HGNode getTo() {
    if (to != null && to.eIsProxy()) {
      InternalEObject oldTo = (InternalEObject)to;
      to = (HGNode)eResolveProxy(oldTo);
      if (to != oldTo) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.HG_DEPENDENCY__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public HGNode basicGetTo() {
    return to;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTo(HGNode newTo) {
    HGNode oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_DEPENDENCY__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public List<HGDependency> getDependencies() {
    if (dependencies == null) {
      dependencies = new EObjectResolvingEList<HGDependency>(HGDependency.class, this, HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCoreDependency() {
    return coreDependency;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCoreDependency(boolean newCoreDependency) {
    boolean oldCoreDependency = coreDependency;
    coreDependency = newCoreDependency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_DEPENDENCY__CORE_DEPENDENCY, oldCoreDependency, coreDependency));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public EList<HGDependency> getCoreDependencies() {
    EList<HGDependency> result = new BasicEList<HGDependency>();
    getLeafDependencies(result);
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public int getWeight() {
    //
    if (this.dependencies != null && !this.dependencies.isEmpty()) {
      return this.coreDependency ? this.dependencies.size() + 1 : this.dependencies.size();
    } else {
      return this.coreDependency ? 1 : 0;
    }
  }

  /**
   * @generated NOT
   */
  private void getLeafDependencies(Collection<HGDependency> leafDependencies) {

    //
    if (this.coreDependency) {
      leafDependencies.add(this);
    }

    //
    else {
      if (this.dependencies != null) {
        for (HGDependency dependency : this.dependencies) {
          ((HGDependencyImpl) dependency).getLeafDependencies(leafDependencies);
        }
      }
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalgraphPackage.HG_DEPENDENCY__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case HierarchicalgraphPackage.HG_DEPENDENCY__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCIES:
        return getDependencies();
      case HierarchicalgraphPackage.HG_DEPENDENCY__CORE_DEPENDENCY:
        return isCoreDependency();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case HierarchicalgraphPackage.HG_DEPENDENCY__FROM:
        setFrom((HGNode)newValue);
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__TO:
        setTo((HGNode)newValue);
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends HGDependency>)newValue);
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__CORE_DEPENDENCY:
        setCoreDependency((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case HierarchicalgraphPackage.HG_DEPENDENCY__FROM:
        setFrom((HGNode)null);
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__TO:
        setTo((HGNode)null);
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCIES:
        getDependencies().clear();
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__CORE_DEPENDENCY:
        setCoreDependency(CORE_DEPENDENCY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case HierarchicalgraphPackage.HG_DEPENDENCY__FROM:
        return from != null;
      case HierarchicalgraphPackage.HG_DEPENDENCY__TO:
        return to != null;
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case HierarchicalgraphPackage.HG_DEPENDENCY__CORE_DEPENDENCY:
        return coreDependency != CORE_DEPENDENCY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case HierarchicalgraphPackage.HG_DEPENDENCY___GET_CORE_DEPENDENCIES:
        return getCoreDependencies();
      case HierarchicalgraphPackage.HG_DEPENDENCY___GET_WEIGHT:
        return getWeight();
    }
    return super.eInvoke(operationID, arguments);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (coreDependency: ");
    result.append(coreDependency);
    result.append(')');
    return result.toString();
  }

} // HGDependencyImpl
