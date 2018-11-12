/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprocess Non Interrupt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.SubprocessNonInterrupt#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getSubprocessNonInterrupt()
 * @model
 * @generated
 */
public interface SubprocessNonInterrupt extends Initial {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeSubprocessNonInterrupt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeSubprocessNonInterrupt
	 * @see #setType(TypeSubprocessNonInterrupt)
	 * @see bpmn.BPMNPackage#getSubprocessNonInterrupt_Type()
	 * @model
	 * @generated
	 */
	TypeSubprocessNonInterrupt getType();

	/**
	 * Sets the value of the '{@link bpmn.SubprocessNonInterrupt#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeSubprocessNonInterrupt
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeSubprocessNonInterrupt value);

} // SubprocessNonInterrupt
