/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.slizaa.neo4j.hierarchicalgraph.mapping.DependencyMapping;
import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.DependencyMappingImpl#getMainQuery <em>Main Query</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.DependencyMappingImpl#getDetailQueries <em>Detail Queries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyMappingImpl extends MinimalEObjectImpl.Container implements DependencyMapping {
  /**
   * The default value of the '{@link #getMainQuery() <em>Main Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainQuery()
   * @generated
   * @ordered
   */
  protected static final String MAIN_QUERY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMainQuery() <em>Main Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainQuery()
   * @generated
   * @ordered
   */
  protected String mainQuery = MAIN_QUERY_EDEFAULT;

  /**
   * The cached value of the '{@link #getDetailQueries() <em>Detail Queries</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetailQueries()
   * @generated
   * @ordered
   */
  protected EList<String> detailQueries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyMappingImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Neo4jHierarchicalGraphMappingPackage.Literals.DEPENDENCY_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMainQuery() {
    return mainQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainQuery(String newMainQuery) {
    String oldMainQuery = mainQuery;
    mainQuery = newMainQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__MAIN_QUERY, oldMainQuery, mainQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDetailQueries() {
    if (detailQueries == null) {
      detailQueries = new EDataTypeUniqueEList<String>(String.class, this, Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__DETAIL_QUERIES);
    }
    return detailQueries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__MAIN_QUERY:
        return getMainQuery();
      case Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__DETAIL_QUERIES:
        return getDetailQueries();
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
      case Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__MAIN_QUERY:
        setMainQuery((String)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__DETAIL_QUERIES:
        getDetailQueries().clear();
        getDetailQueries().addAll((Collection<? extends String>)newValue);
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
      case Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__MAIN_QUERY:
        setMainQuery(MAIN_QUERY_EDEFAULT);
        return;
      case Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__DETAIL_QUERIES:
        getDetailQueries().clear();
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
      case Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__MAIN_QUERY:
        return MAIN_QUERY_EDEFAULT == null ? mainQuery != null : !MAIN_QUERY_EDEFAULT.equals(mainQuery);
      case Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING__DETAIL_QUERIES:
        return detailQueries != null && !detailQueries.isEmpty();
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
    result.append(" (mainQuery: ");
    result.append(mainQuery);
    result.append(", detailQueries: ");
    result.append(detailQueries);
    result.append(')');
    return result.toString();
  }

} //DependencyMappingImpl
