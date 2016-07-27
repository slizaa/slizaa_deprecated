/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery;
import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cypher Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.CypherQueryImpl#getCypherQuery <em>Cypher Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CypherQueryImpl extends MinimalEObjectImpl.Container implements CypherQuery {
	/**
	 * The default value of the '{@link #getCypherQuery() <em>Cypher Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCypherQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String CYPHER_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCypherQuery() <em>Cypher Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCypherQuery()
	 * @generated
	 * @ordered
	 */
	protected String cypherQuery = CYPHER_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CypherQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neo4jHierarchicalGraphMappingPackage.Literals.CYPHER_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCypherQuery() {
		return cypherQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCypherQuery(String newCypherQuery) {
		String oldCypherQuery = cypherQuery;
		cypherQuery = newCypherQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.CYPHER_QUERY__CYPHER_QUERY, oldCypherQuery, cypherQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neo4jHierarchicalGraphMappingPackage.CYPHER_QUERY__CYPHER_QUERY:
				return getCypherQuery();
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
			case Neo4jHierarchicalGraphMappingPackage.CYPHER_QUERY__CYPHER_QUERY:
				setCypherQuery((String)newValue);
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
			case Neo4jHierarchicalGraphMappingPackage.CYPHER_QUERY__CYPHER_QUERY:
				setCypherQuery(CYPHER_QUERY_EDEFAULT);
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
			case Neo4jHierarchicalGraphMappingPackage.CYPHER_QUERY__CYPHER_QUERY:
				return CYPHER_QUERY_EDEFAULT == null ? cypherQuery != null : !CYPHER_QUERY_EDEFAULT.equals(cypherQuery);
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
		result.append(" (cypherQuery: ");
		result.append(cypherQuery);
		result.append(')');
		return result.toString();
	}

} //CypherQueryImpl
