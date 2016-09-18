/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

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
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4JBackedDependencySourceImpl extends MinimalEObjectImpl.Container implements Neo4JBackedDependencySource {
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
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGCoreDependency getDependency() {
    if (eContainerFeatureID() != Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY) return null;
    return (HGCoreDependency)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependency(HGCoreDependency newDependency, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newDependency, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependency(HGCoreDependency newDependency) {
    if (newDependency != eInternalContainer() || (eContainerFeatureID() != Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY && newDependency != null)) {
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
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY, newDependency, newDependency));
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
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY:
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY:
        return basicSetDependency(null, msgs);
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY:
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__IDENTIFIER:
        return getIdentifier();
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY:
        return getDependency();
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__IDENTIFIER:
        setIdentifier(newValue);
        return;
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY:
        setDependency((HGCoreDependency)newValue);
        return;
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY:
        setDependency((HGCoreDependency)null);
        return;
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY:
        return getDependency() != null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //Neo4JBackedDependencySourceImpl
