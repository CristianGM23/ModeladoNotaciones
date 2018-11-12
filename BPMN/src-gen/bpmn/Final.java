/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Final#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getFinal()
 * @model
 * @generated
 */
public interface Final extends Event {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeFinal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeFinal
	 * @see #setType(TypeFinal)
	 * @see bpmn.BPMNPackage#getFinal_Type()
	 * @model
	 * @generated
	 */
	TypeFinal getType();

	/**
	 * Sets the value of the '{@link bpmn.Final#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeFinal
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeFinal value);

} // Final
