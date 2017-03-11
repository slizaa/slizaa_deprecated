/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HG Root Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGRootNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGRootNodeImpl#getExtensionRegistry <em>Extension Registry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGRootNodeImpl extends HGNodeImpl implements HGRootNode {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExtensionRegistry() <em>Extension Registry</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionRegistry()
   * @generated
   * @ordered
   */
  protected EMap<String, Object> extensionRegistry;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGRootNodeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.HG_ROOT_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_ROOT_NODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map<String, Object> getExtensionRegistry() {
    if (extensionRegistry == null) {
      extensionRegistry = new EcoreEMap<String,Object>(HierarchicalgraphPackage.Literals.STRING_TO_OBJECT_MAP, StringToObjectMapImpl.class, this, HierarchicalgraphPackage.HG_ROOT_NODE__EXTENSION_REGISTRY);
    }
    return extensionRegistry.map();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void invalidateAllCaches() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void invalidateCaches(List<HGNode> modifiedNodes) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializeCaches(List<HGNode> modifiedNodes) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode lookupNode(Object identifier) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> T getExtension(Class<T> clazz) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> T getExtension(String key, Class<T> clazz) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> void registerExtension(Class<T> clazz, T extension) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void registerExtension(String clazz, Object extension) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> boolean hasExtension(Class<T> key) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> boolean hasExtension(String key, Class<T> type) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case HierarchicalgraphPackage.HG_ROOT_NODE__EXTENSION_REGISTRY:
        return ((InternalEList<?>)((EMap.InternalMapView<String, Object>)getExtensionRegistry()).eMap()).basicRemove(otherEnd, msgs);
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
      case HierarchicalgraphPackage.HG_ROOT_NODE__NAME:
        return getName();
      case HierarchicalgraphPackage.HG_ROOT_NODE__EXTENSION_REGISTRY:
        if (coreType) return ((EMap.InternalMapView<String, Object>)getExtensionRegistry()).eMap();
        else return getExtensionRegistry();
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
      case HierarchicalgraphPackage.HG_ROOT_NODE__NAME:
        setName((String)newValue);
        return;
      case HierarchicalgraphPackage.HG_ROOT_NODE__EXTENSION_REGISTRY:
        ((EStructuralFeature.Setting)((EMap.InternalMapView<String, Object>)getExtensionRegistry()).eMap()).set(newValue);
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
      case HierarchicalgraphPackage.HG_ROOT_NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HierarchicalgraphPackage.HG_ROOT_NODE__EXTENSION_REGISTRY:
        getExtensionRegistry().clear();
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
      case HierarchicalgraphPackage.HG_ROOT_NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HierarchicalgraphPackage.HG_ROOT_NODE__EXTENSION_REGISTRY:
        return extensionRegistry != null && !extensionRegistry.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case HierarchicalgraphPackage.HG_ROOT_NODE___INVALIDATE_ALL_CACHES:
        invalidateAllCaches();
        return null;
      case HierarchicalgraphPackage.HG_ROOT_NODE___INVALIDATE_CACHES__LIST:
        invalidateCaches((List<HGNode>)arguments.get(0));
        return null;
      case HierarchicalgraphPackage.HG_ROOT_NODE___INITIALIZE_CACHES__LIST:
        initializeCaches((List<HGNode>)arguments.get(0));
        return null;
      case HierarchicalgraphPackage.HG_ROOT_NODE___LOOKUP_NODE__OBJECT:
        return lookupNode(arguments.get(0));
      case HierarchicalgraphPackage.HG_ROOT_NODE___GET_EXTENSION__CLASS:
        return getExtension((Class)arguments.get(0));
      case HierarchicalgraphPackage.HG_ROOT_NODE___GET_EXTENSION__STRING_CLASS:
        return getExtension((String)arguments.get(0), (Class)arguments.get(1));
      case HierarchicalgraphPackage.HG_ROOT_NODE___REGISTER_EXTENSION__CLASS_OBJECT:
        registerExtension((Class)arguments.get(0), arguments.get(1));
        return null;
      case HierarchicalgraphPackage.HG_ROOT_NODE___REGISTER_EXTENSION__STRING_OBJECT:
        registerExtension((String)arguments.get(0), (Object)arguments.get(1));
        return null;
      case HierarchicalgraphPackage.HG_ROOT_NODE___HAS_EXTENSION__CLASS:
        return hasExtension((Class)arguments.get(0));
      case HierarchicalgraphPackage.HG_ROOT_NODE___HAS_EXTENSION__STRING_CLASS:
        return hasExtension((String)arguments.get(0), (Class)arguments.get(1));
    }
    return super.eInvoke(operationID, arguments);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //HGRootNodeImpl
