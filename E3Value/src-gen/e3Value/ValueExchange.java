/**
 */
package e3Value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.ValueExchange#getTargetValuePort <em>Target Value Port</em>}</li>
 *   <li>{@link e3Value.ValueExchange#getSourceValuePort <em>Source Value Port</em>}</li>
 *   <li>{@link e3Value.ValueExchange#getHasValueObject <em>Has Value Object</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getValueExchange()
 * @model
 * @generated
 */
public interface ValueExchange extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value Port</em>' reference.
	 * @see #setTargetValuePort(ValuePort)
	 * @see e3Value.E3ValuePackage#getValueExchange_TargetValuePort()
	 * @model
	 * @generated
	 */
	ValuePort getTargetValuePort();

	/**
	 * Sets the value of the '{@link e3Value.ValueExchange#getTargetValuePort <em>Target Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value Port</em>' reference.
	 * @see #getTargetValuePort()
	 * @generated
	 */
	void setTargetValuePort(ValuePort value);

	/**
	 * Returns the value of the '<em><b>Source Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Value Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Value Port</em>' reference.
	 * @see #setSourceValuePort(ValuePort)
	 * @see e3Value.E3ValuePackage#getValueExchange_SourceValuePort()
	 * @model
	 * @generated
	 */
	ValuePort getSourceValuePort();

	/**
	 * Sets the value of the '{@link e3Value.ValueExchange#getSourceValuePort <em>Source Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Value Port</em>' reference.
	 * @see #getSourceValuePort()
	 * @generated
	 */
	void setSourceValuePort(ValuePort value);

	/**
	 * Returns the value of the '<em><b>Has Value Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Object</em>' reference.
	 * @see #setHasValueObject(ValueObject)
	 * @see e3Value.E3ValuePackage#getValueExchange_HasValueObject()
	 * @model required="true"
	 * @generated
	 */
	ValueObject getHasValueObject();

	/**
	 * Sets the value of the '{@link e3Value.ValueExchange#getHasValueObject <em>Has Value Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Value Object</em>' reference.
	 * @see #getHasValueObject()
	 * @generated
	 */
	void setHasValueObject(ValueObject value);

} // ValueExchange
