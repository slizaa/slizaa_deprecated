/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getDependencyType()
 * @model
 * @generated
 */
public enum DependencyType implements Enumerator {
  /**
   * The '<em><b>CORE DEPENDENCY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CORE_DEPENDENCY_VALUE
   * @generated
   * @ordered
   */
  CORE_DEPENDENCY(0, "CORE_DEPENDENCY", "CORE_DEPENDENCY"),

  /**
   * The '<em><b>AGGREGATED DEPENDENCY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AGGREGATED_DEPENDENCY_VALUE
   * @generated
   * @ordered
   */
  AGGREGATED_DEPENDENCY(1, "AGGREGATED_DEPENDENCY", "AGGREGATED_DEPENDENCY"),

  /**
   * The '<em><b>AGGREGATED CORE DEPENDENCY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AGGREGATED_CORE_DEPENDENCY_VALUE
   * @generated
   * @ordered
   */
  AGGREGATED_CORE_DEPENDENCY(2, "AGGREGATED_CORE_DEPENDENCY", "AGGREGATED_CORE_DEPENDENCY");

  /**
   * The '<em><b>CORE DEPENDENCY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CORE DEPENDENCY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CORE_DEPENDENCY
   * @model
   * @generated
   * @ordered
   */
  public static final int CORE_DEPENDENCY_VALUE = 0;

  /**
   * The '<em><b>AGGREGATED DEPENDENCY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AGGREGATED DEPENDENCY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AGGREGATED_DEPENDENCY
   * @model
   * @generated
   * @ordered
   */
  public static final int AGGREGATED_DEPENDENCY_VALUE = 1;

  /**
   * The '<em><b>AGGREGATED CORE DEPENDENCY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AGGREGATED CORE DEPENDENCY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AGGREGATED_CORE_DEPENDENCY
   * @model
   * @generated
   * @ordered
   */
  public static final int AGGREGATED_CORE_DEPENDENCY_VALUE = 2;

  /**
   * An array of all the '<em><b>Dependency Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DependencyType[] VALUES_ARRAY =
    new DependencyType[] {
      CORE_DEPENDENCY,
      AGGREGATED_DEPENDENCY,
      AGGREGATED_CORE_DEPENDENCY,
    };

  /**
   * A public read-only list of all the '<em><b>Dependency Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DependencyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dependency Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DependencyType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      DependencyType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dependency Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DependencyType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      DependencyType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dependency Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DependencyType get(int value) {
    switch (value) {
      case CORE_DEPENDENCY_VALUE: return CORE_DEPENDENCY;
      case AGGREGATED_DEPENDENCY_VALUE: return AGGREGATED_DEPENDENCY;
      case AGGREGATED_CORE_DEPENDENCY_VALUE: return AGGREGATED_CORE_DEPENDENCY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DependencyType(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
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
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }
  
} //DependencyType
