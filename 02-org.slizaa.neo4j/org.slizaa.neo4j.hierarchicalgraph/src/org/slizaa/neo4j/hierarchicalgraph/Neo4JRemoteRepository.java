/**
 */
package org.slizaa.neo4j.hierarchicalgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo4 JRemote Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getThreadPoolSize <em>Thread Pool Size</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JRemoteRepository()
 * @model
 * @generated
 */
public interface Neo4JRemoteRepository extends INeo4JRepository {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JRemoteRepository_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URI</em>' attribute.
	 * @see #setBaseURI(String)
	 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JRemoteRepository_BaseURI()
	 * @model
	 * @generated
	 */
	String getBaseURI();

	/**
	 * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getBaseURI <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URI</em>' attribute.
	 * @see #getBaseURI()
	 * @generated
	 */
	void setBaseURI(String value);

	/**
	 * Returns the value of the '<em><b>Thread Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Pool Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Pool Size</em>' attribute.
	 * @see #setThreadPoolSize(int)
	 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JRemoteRepository_ThreadPoolSize()
	 * @model
	 * @generated
	 */
	int getThreadPoolSize();

	/**
	 * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getThreadPoolSize <em>Thread Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Pool Size</em>' attribute.
	 * @see #getThreadPoolSize()
	 * @generated
	 */
	void setThreadPoolSize(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

} // Neo4JRemoteRepository
