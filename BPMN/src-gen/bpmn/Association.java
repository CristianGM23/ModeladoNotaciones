/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Association#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Connection {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeAssociation
	 * @see #setType(TypeAssociation)
	 * @see bpmn.BPMNPackage#getAssociation_Type()
	 * @model
	 * @generated
	 */
	TypeAssociation getType();

	/**
	 * Sets the value of the '{@link bpmn.Association#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeAssociation
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeAssociation value);

} // Association
