/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secuence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Secuence#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getSecuence()
 * @model
 * @generated
 */
public interface Secuence extends Connection {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeConnectionSecuence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeConnectionSecuence
	 * @see #setType(TypeConnectionSecuence)
	 * @see bpmn.BPMNPackage#getSecuence_Type()
	 * @model
	 * @generated
	 */
	TypeConnectionSecuence getType();

	/**
	 * Sets the value of the '{@link bpmn.Secuence#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeConnectionSecuence
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeConnectionSecuence value);

} // Secuence
