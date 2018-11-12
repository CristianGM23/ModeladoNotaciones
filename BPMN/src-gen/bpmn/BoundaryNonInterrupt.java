/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary Non Interrupt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.BoundaryNonInterrupt#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getBoundaryNonInterrupt()
 * @model
 * @generated
 */
public interface BoundaryNonInterrupt extends Intermediate {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeBoundaryNonInterrupt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeBoundaryNonInterrupt
	 * @see #setType(TypeBoundaryNonInterrupt)
	 * @see bpmn.BPMNPackage#getBoundaryNonInterrupt_Type()
	 * @model
	 * @generated
	 */
	TypeBoundaryNonInterrupt getType();

	/**
	 * Sets the value of the '{@link bpmn.BoundaryNonInterrupt#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeBoundaryNonInterrupt
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeBoundaryNonInterrupt value);

} // BoundaryNonInterrupt
