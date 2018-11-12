/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Group#getElements <em>Elements</em>}</li>
 *   <li>{@link bpmn.Group#getElementsGroup <em>Elements Group</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Figure {

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Elements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see bpmn.BPMNPackage#getGroup_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Elements> getElements();

	/**
	 * Returns the value of the '<em><b>Elements Group</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Elements}.
	 * It is bidirectional and its opposite is '{@link bpmn.Elements#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Group</em>' reference list.
	 * @see bpmn.BPMNPackage#getGroup_ElementsGroup()
	 * @see bpmn.Elements#getGroup
	 * @model opposite="group"
	 * @generated
	 */
	EList<Elements> getElementsGroup();
} // Group
