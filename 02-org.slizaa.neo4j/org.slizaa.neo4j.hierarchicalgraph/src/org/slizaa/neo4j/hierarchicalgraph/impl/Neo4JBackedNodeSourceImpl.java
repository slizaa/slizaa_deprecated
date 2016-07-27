/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JBacked Node Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl#isAutoExpand <em>Auto Expand</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4JBackedNodeSourceImpl extends MinimalEObjectImpl.Container implements Neo4JBackedNodeSource {
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
	 * The default value of the '{@link #isAutoExpand() <em>Auto Expand</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isAutoExpand()
	 * @generated
	 * @ordered
	 */
  protected static final boolean AUTO_EXPAND_EDEFAULT = false;

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
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
  protected EList<String> labels;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Neo4JBackedNodeSourceImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return Neo4jHierarchicalgraphPackage.Literals.NEO4_JBACKED_NODE_SOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__IDENTIFIER, oldIdentifier, identifier));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HGNode getNode() {
		if (eContainerFeatureID() != Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE) return null;
		return (HGNode)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(HGNode newNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNode, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(HGNode newNode) {
		if (newNode != eInternalContainer() || (eContainerFeatureID() != Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, HierarchicalgraphPackage.HG_NODE__NODE_SOURCE, HGNode.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE, newNode, newNode));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isAutoExpand() {
		// TODO: implement this method to return the 'Auto Expand' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMap<String, String> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,String>(HierarchicalgraphPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__PROPERTIES);
		}
		return properties;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getLabels() {
		if (labels == null) {
			labels = new EDataTypeUniqueEList<String>(String.class, this, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__LABELS);
		}
		return labels;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void onExpand() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void onCollapse() {
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
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNode((HGNode)otherEnd, msgs);
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
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE:
				return basicSetNode(null, msgs);
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__PROPERTIES:
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
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE:
				return eInternalContainer().eInverseRemove(this, HierarchicalgraphPackage.HG_NODE__NODE_SOURCE, HGNode.class, msgs);
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
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__IDENTIFIER:
				return getIdentifier();
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE:
				return getNode();
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__AUTO_EXPAND:
				return isAutoExpand();
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__LABELS:
				return getLabels();
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
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__IDENTIFIER:
				setIdentifier(newValue);
				return;
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE:
				setNode((HGNode)newValue);
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
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE:
				setNode((HGNode)null);
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
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__NODE:
				return getNode() != null;
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__AUTO_EXPAND:
				return isAutoExpand() != AUTO_EXPAND_EDEFAULT;
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__LABELS:
				return labels != null && !labels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE___ON_EXPAND:
				onExpand();
				return null;
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE___ON_COLLAPSE:
				onCollapse();
				return null;
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", labels: ");
		result.append(labels);
		result.append(')');
		return result.toString();
	}

} //Neo4JBackedNodeSourceImpl
