/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Image Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getImagePosition()
 * @model
 * @generated
 */
public enum ImagePosition implements Enumerator {
	/**
   * The '<em><b>Base</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #BASE_VALUE
   * @generated
   * @ordered
   */
	BASE(0, "Base", "Base"),

	/**
   * The '<em><b>Overlay Top Left</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OVERLAY_TOP_LEFT_VALUE
   * @generated
   * @ordered
   */
	OVERLAY_TOP_LEFT(1, "OverlayTopLeft", "OverlayTopLeft"),

	/**
   * The '<em><b>Overlay Top Right</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OVERLAY_TOP_RIGHT_VALUE
   * @generated
   * @ordered
   */
	OVERLAY_TOP_RIGHT(2, "OverlayTopRight", "OverlayTopRight"),

	/**
   * The '<em><b>Overlay Bottom Left</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OVERLAY_BOTTOM_LEFT_VALUE
   * @generated
   * @ordered
   */
	OVERLAY_BOTTOM_LEFT(3, "OverlayBottomLeft", "OverlayBottomLeft"),

	/**
   * The '<em><b>Overlay Bottom Right</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OVERLAY_BOTTOM_RIGHT_VALUE
   * @generated
   * @ordered
   */
	OVERLAY_BOTTOM_RIGHT(4, "OverlayBottomRight", "OverlayBottomRight");

	/**
   * The '<em><b>Base</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Base</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #BASE
   * @model name="Base"
   * @generated
   * @ordered
   */
	public static final int BASE_VALUE = 0;

	/**
   * The '<em><b>Overlay Top Left</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overlay Top Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #OVERLAY_TOP_LEFT
   * @model name="OverlayTopLeft"
   * @generated
   * @ordered
   */
	public static final int OVERLAY_TOP_LEFT_VALUE = 1;

	/**
   * The '<em><b>Overlay Top Right</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overlay Top Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #OVERLAY_TOP_RIGHT
   * @model name="OverlayTopRight"
   * @generated
   * @ordered
   */
	public static final int OVERLAY_TOP_RIGHT_VALUE = 2;

	/**
   * The '<em><b>Overlay Bottom Left</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overlay Bottom Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #OVERLAY_BOTTOM_LEFT
   * @model name="OverlayBottomLeft"
   * @generated
   * @ordered
   */
	public static final int OVERLAY_BOTTOM_LEFT_VALUE = 3;

	/**
   * The '<em><b>Overlay Bottom Right</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overlay Bottom Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #OVERLAY_BOTTOM_RIGHT
   * @model name="OverlayBottomRight"
   * @generated
   * @ordered
   */
	public static final int OVERLAY_BOTTOM_RIGHT_VALUE = 4;

	/**
   * An array of all the '<em><b>Image Position</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final ImagePosition[] VALUES_ARRAY =
		new ImagePosition[] {
      BASE,
      OVERLAY_TOP_LEFT,
      OVERLAY_TOP_RIGHT,
      OVERLAY_BOTTOM_LEFT,
      OVERLAY_BOTTOM_RIGHT,
    };

	/**
   * A public read-only list of all the '<em><b>Image Position</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<ImagePosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Image Position</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static ImagePosition get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ImagePosition result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Image Position</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static ImagePosition getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ImagePosition result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Image Position</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static ImagePosition get(int value) {
    switch (value) {
      case BASE_VALUE: return BASE;
      case OVERLAY_TOP_LEFT_VALUE: return OVERLAY_TOP_LEFT;
      case OVERLAY_TOP_RIGHT_VALUE: return OVERLAY_TOP_RIGHT;
      case OVERLAY_BOTTOM_LEFT_VALUE: return OVERLAY_BOTTOM_LEFT;
      case OVERLAY_BOTTOM_RIGHT_VALUE: return OVERLAY_BOTTOM_RIGHT;
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
	private ImagePosition(int value, String name, String literal) {
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
	
} //ImagePosition
