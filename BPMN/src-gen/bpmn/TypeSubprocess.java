/**
 */
package bpmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Subprocess</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bpmn.BPMNPackage#getTypeSubprocess()
 * @model
 * @generated
 */
public enum TypeSubprocess implements Enumerator {
	/**
	 * The '<em><b>MESSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE(0, "MESSAGE", "MESSAGE"),

	/**
	 * The '<em><b>TEMPORARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORARY_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORARY(1, "TEMPORARY", "TEMPORARY"),

	/**
	 * The '<em><b>SCALABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SCALABLE(2, "SCALABLE", "SCALABLE"),

	/**
	 * The '<em><b>CONDITIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITIONAL(3, "CONDITIONAL", "CONDITIONAL"),

	/**
	 * The '<em><b>ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(4, "ERROR", "ERROR"),

	/**
	 * The '<em><b>COMPENSATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPENSATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPENSATION(5, "COMPENSATION", "COMPENSATION"),

	/**
	 * The '<em><b>SIGNAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNAL(6, "SIGNAL", "SIGNAL"),

	/**
	 * The '<em><b>MULTIPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE(7, "MULTIPLE", "MULTIPLE"),

	/**
	 * The '<em><b>PARALLEL MULTIPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL_MULTIPLE(8, "PARALLEL_MULTIPLE", "PARALLEL_MULTIPLE");

	/**
	 * The '<em><b>MESSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MESSAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_VALUE = 0;

	/**
	 * The '<em><b>TEMPORARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPORARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPORARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORARY_VALUE = 1;

	/**
	 * The '<em><b>SCALABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCALABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCALABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCALABLE_VALUE = 2;

	/**
	 * The '<em><b>CONDITIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONDITIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONDITIONAL_VALUE = 3;

	/**
	 * The '<em><b>ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 4;

	/**
	 * The '<em><b>COMPENSATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPENSATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPENSATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPENSATION_VALUE = 5;

	/**
	 * The '<em><b>SIGNAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_VALUE = 6;

	/**
	 * The '<em><b>MULTIPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_VALUE = 7;

	/**
	 * The '<em><b>PARALLEL MULTIPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARALLEL MULTIPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_MULTIPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_MULTIPLE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Type Subprocess</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeSubprocess[] VALUES_ARRAY = new TypeSubprocess[] { MESSAGE, TEMPORARY, SCALABLE,
			CONDITIONAL, ERROR, COMPENSATION, SIGNAL, MULTIPLE, PARALLEL_MULTIPLE, };

	/**
	 * A public read-only list of all the '<em><b>Type Subprocess</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeSubprocess> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Subprocess</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSubprocess get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeSubprocess result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Subprocess</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSubprocess getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeSubprocess result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Subprocess</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSubprocess get(int value) {
		switch (value) {
		case MESSAGE_VALUE:
			return MESSAGE;
		case TEMPORARY_VALUE:
			return TEMPORARY;
		case SCALABLE_VALUE:
			return SCALABLE;
		case CONDITIONAL_VALUE:
			return CONDITIONAL;
		case ERROR_VALUE:
			return ERROR;
		case COMPENSATION_VALUE:
			return COMPENSATION;
		case SIGNAL_VALUE:
			return SIGNAL;
		case MULTIPLE_VALUE:
			return MULTIPLE;
		case PARALLEL_MULTIPLE_VALUE:
			return PARALLEL_MULTIPLE;
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
	private TypeSubprocess(int value, String name, String literal) {
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

} //TypeSubprocess
