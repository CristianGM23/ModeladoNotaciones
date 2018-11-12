/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Data#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getData()
 * @model
 * @generated
 */
public interface Data extends Elements {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeData
	 * @see #setType(TypeData)
	 * @see bpmn.BPMNPackage#getData_Type()
	 * @model
	 * @generated
	 */
	TypeData getType();

	/**
	 * Sets the value of the '{@link bpmn.Data#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeData
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeData value);
} // Data
