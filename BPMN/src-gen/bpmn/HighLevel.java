/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>High Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.HighLevel#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getHighLevel()
 * @model
 * @generated
 */
public interface HighLevel extends Initial {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeHighLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeHighLevel
	 * @see #setType(TypeHighLevel)
	 * @see bpmn.BPMNPackage#getHighLevel_Type()
	 * @model
	 * @generated
	 */
	TypeHighLevel getType();

	/**
	 * Sets the value of the '{@link bpmn.HighLevel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeHighLevel
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeHighLevel value);

} // HighLevel
