/**
 */
package bpmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Gateway</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bpmn.BPMNPackage#getTypeGateway()
 * @model
 * @generated
 */
public enum TypeGateway implements Enumerator {
	/**
	 * The '<em><b>EXCLUSIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUSIVE(0, "EXCLUSIVE", "EXCLUSIVE"),

	/**
	 * The '<em><b>EVENT BASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_BASED(1, "EVENT_BASED", "EVENT_BASED"),

	/**
	 * The '<em><b>PARALLEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL(2, "PARALLEL", "PARALLEL"),

	/**
	 * The '<em><b>INCLUSIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUSIVE(3, "INCLUSIVE", "INCLUSIVE"),

	/**
	 * The '<em><b>EXCLUSIVE EVENT BASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVE_EVENT_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUSIVE_EVENT_BASED(4, "EXCLUSIVE_EVENT_BASED", "EXCLUSIVE_EVENT_BASED"),

	/**
	 * The '<em><b>COMPLEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEX(5, "COMPLEX", "COMPLEX"),

	/**
	 * The '<em><b>PARALLEL EVENT BASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_EVENT_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL_EVENT_BASED(6, "PARALLEL_EVENT_BASED", "PARALLEL_EVENT_BASED");

	/**
	 * The '<em><b>EXCLUSIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXCLUSIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUSIVE_VALUE = 0;

	/**
	 * The '<em><b>EVENT BASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVENT BASED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_BASED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_BASED_VALUE = 1;

	/**
	 * The '<em><b>PARALLEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARALLEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_VALUE = 2;

	/**
	 * The '<em><b>INCLUSIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCLUSIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUSIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCLUSIVE_VALUE = 3;

	/**
	 * The '<em><b>EXCLUSIVE EVENT BASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXCLUSIVE EVENT BASED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVE_EVENT_BASED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUSIVE_EVENT_BASED_VALUE = 4;

	/**
	 * The '<em><b>COMPLEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEX_VALUE = 5;

	/**
	 * The '<em><b>PARALLEL EVENT BASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARALLEL EVENT BASED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_EVENT_BASED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_EVENT_BASED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type Gateway</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeGateway[] VALUES_ARRAY = new TypeGateway[] { EXCLUSIVE, EVENT_BASED, PARALLEL, INCLUSIVE,
			EXCLUSIVE_EVENT_BASED, COMPLEX, PARALLEL_EVENT_BASED, };

	/**
	 * A public read-only list of all the '<em><b>Type Gateway</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeGateway> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Gateway</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeGateway get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeGateway result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Gateway</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeGateway getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeGateway result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Gateway</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeGateway get(int value) {
		switch (value) {
		case EXCLUSIVE_VALUE:
			return EXCLUSIVE;
		case EVENT_BASED_VALUE:
			return EVENT_BASED;
		case PARALLEL_VALUE:
			return PARALLEL;
		case INCLUSIVE_VALUE:
			return INCLUSIVE;
		case EXCLUSIVE_EVENT_BASED_VALUE:
			return EXCLUSIVE_EVENT_BASED;
		case COMPLEX_VALUE:
			return COMPLEX;
		case PARALLEL_EVENT_BASED_VALUE:
			return PARALLEL_EVENT_BASED;
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
	private TypeGateway(int value, String name, String literal) {
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

} //TypeGateway
