/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JBacked Root Node Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4JBackedRootNodeSourceImpl extends Neo4JBackedNodeSourceImpl implements Neo4JBackedRootNodeSource {
  /**
	 * The default value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
  protected static final Object REPOSITORY_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
  protected Object repository = REPOSITORY_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Neo4JBackedRootNodeSourceImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return Neo4jHierarchicalgraphPackage.Literals.NEO4_JBACKED_ROOT_NODE_SOURCE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Object getRepository() {
		return repository;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRepository(Object newRepository) {
		Object oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY, oldRepository, repository));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY:
				return getRepository();
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
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY:
				setRepository(newValue);
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
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY:
				setRepository(REPOSITORY_EDEFAULT);
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
			case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY:
				return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
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
		result.append(" (repository: ");
		result.append(repository);
		result.append(')');
		return result.toString();
	}

} //Neo4JBackedRootNodeSourceImpl
