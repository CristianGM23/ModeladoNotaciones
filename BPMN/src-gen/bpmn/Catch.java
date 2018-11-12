/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Catch#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getCatch()
 * @model
 * @generated
 */
public interface Catch extends Intermediate {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeCatch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeCatch
	 * @see #setType(TypeCatch)
	 * @see bpmn.BPMNPackage#getCatch_Type()
	 * @model
	 * @generated
	 */
	TypeCatch getType();

	/**
	 * Sets the value of the '{@link bpmn.Catch#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeCatch
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeCatch value);

} // Catch
