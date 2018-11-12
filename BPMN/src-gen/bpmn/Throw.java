/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Throw#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getThrow()
 * @model
 * @generated
 */
public interface Throw extends Intermediate {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeThrow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeThrow
	 * @see #setType(TypeThrow)
	 * @see bpmn.BPMNPackage#getThrow_Type()
	 * @model
	 * @generated
	 */
	TypeThrow getType();

	/**
	 * Sets the value of the '{@link bpmn.Throw#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeThrow
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeThrow value);

} // Throw
