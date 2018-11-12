/**
 */
package bpmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Nature Activity Maker</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bpmn.BPMNPackage#getTypeNatureActivityMaker()
 * @model
 * @generated
 */
public enum TypeNatureActivityMaker implements Enumerator {
	/**
	 * The '<em><b>SEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_VALUE
	 * @generated
	 * @ordered
	 */
	SEND(0, "SEND", "SEND"),

	/**
	 * The '<em><b>RECEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	RECEPTION(1, "RECEPTION", "RECEPTION"),

	/**
	 * The '<em><b>USER TASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	USER_TASK(2, "USER_TASK", "USER_TASK"),

	/**
	 * The '<em><b>MANUAL TASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_TASK(3, "MANUAL_TASK", "MANUAL_TASK"),

	/**
	 * The '<em><b>BUSINESS RULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_RULE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_RULE(4, "BUSINESS_RULE", "BUSINESS_RULE"),

	/**
	 * The '<em><b>SERVICE TASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_TASK(5, "SERVICE_TASK", "SERVICE_TASK"),

	/**
	 * The '<em><b>SCRIPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SCRIPT(6, "SCRIPT", "SCRIPT");

	/**
	 * The '<em><b>SEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEND_VALUE = 0;

	/**
	 * The '<em><b>RECEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECEPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECEPTION_VALUE = 1;

	/**
	 * The '<em><b>USER TASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER TASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_TASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_TASK_VALUE = 2;

	/**
	 * The '<em><b>MANUAL TASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANUAL TASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_TASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_TASK_VALUE = 3;

	/**
	 * The '<em><b>BUSINESS RULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSINESS RULE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_RULE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_RULE_VALUE = 4;

	/**
	 * The '<em><b>SERVICE TASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE TASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_TASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_TASK_VALUE = 5;

	/**
	 * The '<em><b>SCRIPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCRIPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCRIPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCRIPT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type Nature Activity Maker</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeNatureActivityMaker[] VALUES_ARRAY = new TypeNatureActivityMaker[] { SEND, RECEPTION,
			USER_TASK, MANUAL_TASK, BUSINESS_RULE, SERVICE_TASK, SCRIPT, };

	/**
	 * A public read-only list of all the '<em><b>Type Nature Activity Maker</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeNatureActivityMaker> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Nature Activity Maker</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeNatureActivityMaker get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeNatureActivityMaker result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Nature Activity Maker</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeNatureActivityMaker getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeNatureActivityMaker result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Nature Activity Maker</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeNatureActivityMaker get(int value) {
		switch (value) {
		case SEND_VALUE:
			return SEND;
		case RECEPTION_VALUE:
			return RECEPTION;
		case USER_TASK_VALUE:
			return USER_TASK;
		case MANUAL_TASK_VALUE:
			return MANUAL_TASK;
		case BUSINESS_RULE_VALUE:
			return BUSINESS_RULE;
		case SERVICE_TASK_VALUE:
			return SERVICE_TASK;
		case SCRIPT_VALUE:
			return SCRIPT;
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
	private TypeNatureActivityMaker(int value, String name, String literal) {
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

} //TypeNatureActivityMaker
