/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Boundary#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getBoundary()
 * @model
 * @generated
 */
public interface Boundary extends Intermediate {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeBoundary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeBoundary
	 * @see #setType(TypeBoundary)
	 * @see bpmn.BPMNPackage#getBoundary_Type()
	 * @model
	 * @generated
	 */
	TypeBoundary getType();

	/**
	 * Sets the value of the '{@link bpmn.Boundary#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeBoundary
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeBoundary value);

} // Boundary
