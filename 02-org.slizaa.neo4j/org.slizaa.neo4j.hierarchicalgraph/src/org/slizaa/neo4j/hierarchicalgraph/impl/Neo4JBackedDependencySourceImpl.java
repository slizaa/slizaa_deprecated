/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

import org.slizaa.hierarchicalgraph.impl.HGDependencySourceImpl;
import org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl;

import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JBacked Dependency Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4JBackedDependencySourceImpl extends HGDependencySourceImpl implements Neo4JBackedDependencySource {
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Neo4JBackedDependencySourceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Neo4jHierarchicalgraphPackage.Literals.NEO4_JBACKED_DEPENDENCY_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getProperties() {
    if (properties == null) {
      properties = new EcoreEMap<String,String>(HierarchicalgraphPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType) {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES:
        if (coreType) return getProperties();
        else return getProperties().map();
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE:
        return getType();
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE:
        setType((String)newValue);
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE:
        setType(TYPE_EDEFAULT);
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //Neo4JBackedDependencySourceImpl
