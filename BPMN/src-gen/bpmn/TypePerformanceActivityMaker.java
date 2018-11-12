/**
 */
package bpmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Performance Activity Maker</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bpmn.BPMNPackage#getTypePerformanceActivityMaker()
 * @model
 * @generated
 */
public enum TypePerformanceActivityMaker implements Enumerator {
	/**
	 * The '<em><b>SUBPROCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBPROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SUBPROCESS(0, "SUBPROCESS", "SUBPROCESS"),

	/**
	 * The '<em><b>CYCLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	CYCLE(2, "CYCLE", "CYCLE"),

	/**
	 * The '<em><b>PARALLEL MULTIPLE INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_MULTIPLE_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL_MULTIPLE_INSTANCE(3, "PARALLEL_MULTIPLE_INSTANCE", "PARALLEL_MULTIPLE_INSTANCE"),

	/**
	 * The '<em><b>SECUENCE MULTIPLE INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECUENCE_MULTIPLE_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SECUENCE_MULTIPLE_INSTANCE(4, "SECUENCE_MULTIPLE_INSTANCE", "SECUENCE_MULTIPLE_INSTANCE"),

	/**
	 * The '<em><b>ADHOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADHOC_VALUE
	 * @generated
	 * @ordered
	 */
	ADHOC(5, "ADHOC", "ADHOC"),

	/**
	 * The '<em><b>COMPENSATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPENSATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPENSATION(6, "COMPENSATION", "COMPENSATION");

	/**
	 * The '<em><b>SUBPROCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBPROCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBPROCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBPROCESS_VALUE = 0;

	/**
	 * The '<em><b>CYCLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CYCLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CYCLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CYCLE_VALUE = 2;

	/**
	 * The '<em><b>PARALLEL MULTIPLE INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARALLEL MULTIPLE INSTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_MULTIPLE_INSTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_MULTIPLE_INSTANCE_VALUE = 3;

	/**
	 * The '<em><b>SECUENCE MULTIPLE INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECUENCE MULTIPLE INSTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECUENCE_MULTIPLE_INSTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECUENCE_MULTIPLE_INSTANCE_VALUE = 4;

	/**
	 * The '<em><b>ADHOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADHOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADHOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADHOC_VALUE = 5;

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
	public static final int COMPENSATION_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type Performance Activity Maker</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypePerformanceActivityMaker[] VALUES_ARRAY = new TypePerformanceActivityMaker[] { SUBPROCESS,
			CYCLE, PARALLEL_MULTIPLE_INSTANCE, SECUENCE_MULTIPLE_INSTANCE, ADHOC, COMPENSATION, };

	/**
	 * A public read-only list of all the '<em><b>Type Performance Activity Maker</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypePerformanceActivityMaker> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Performance Activity Maker</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypePerformanceActivityMaker get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypePerformanceActivityMaker result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Performance Activity Maker</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypePerformanceActivityMaker getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypePerformanceActivityMaker result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Performance Activity Maker</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypePerformanceActivityMaker get(int value) {
		switch (value) {
		case SUBPROCESS_VALUE:
			return SUBPROCESS;
		case CYCLE_VALUE:
			return CYCLE;
		case PARALLEL_MULTIPLE_INSTANCE_VALUE:
			return PARALLEL_MULTIPLE_INSTANCE;
		case SECUENCE_MULTIPLE_INSTANCE_VALUE:
			return SECUENCE_MULTIPLE_INSTANCE;
		case ADHOC_VALUE:
			return ADHOC;
		case COMPENSATION_VALUE:
			return COMPENSATION;
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
	private TypePerformanceActivityMaker(int value, String name, String literal) {
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

} //TypePerformanceActivityMaker
