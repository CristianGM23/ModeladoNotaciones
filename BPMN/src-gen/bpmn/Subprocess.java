/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprocess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Subprocess#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getSubprocess()
 * @model
 * @generated
 */
public interface Subprocess extends Initial {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeSubprocess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeSubprocess
	 * @see #setType(TypeSubprocess)
	 * @see bpmn.BPMNPackage#getSubprocess_Type()
	 * @model
	 * @generated
	 */
	TypeSubprocess getType();

	/**
	 * Sets the value of the '{@link bpmn.Subprocess#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeSubprocess
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeSubprocess value);

} // Subprocess
