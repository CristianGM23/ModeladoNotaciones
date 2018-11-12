/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Elements#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getElements()
 * @model abstract="true"
 * @generated
 */
public interface Elements extends Figure {

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Group#getElementsGroup <em>Elements Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see bpmn.BPMNPackage#getElements_Group()
	 * @see bpmn.Group#getElementsGroup
	 * @model opposite="elementsGroup"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link bpmn.Elements#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);
} // Elements
