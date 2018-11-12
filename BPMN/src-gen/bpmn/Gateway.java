/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Gateway#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends Elements {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeGateway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeGateway
	 * @see #setType(TypeGateway)
	 * @see bpmn.BPMNPackage#getGateway_Type()
	 * @model
	 * @generated
	 */
	TypeGateway getType();

	/**
	 * Sets the value of the '{@link bpmn.Gateway#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeGateway
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeGateway value);
} // Gateway
