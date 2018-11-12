/**
 */
package bpmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.BPMN#getNameDiagram <em>Name Diagram</em>}</li>
 *   <li>{@link bpmn.BPMN#getSwimlane <em>Swimlane</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getBPMN()
 * @model
 * @generated
 */
public interface BPMN extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Diagram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Diagram</em>' attribute.
	 * @see #setNameDiagram(String)
	 * @see bpmn.BPMNPackage#getBPMN_NameDiagram()
	 * @model
	 * @generated
	 */
	String getNameDiagram();

	/**
	 * Sets the value of the '{@link bpmn.BPMN#getNameDiagram <em>Name Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Diagram</em>' attribute.
	 * @see #getNameDiagram()
	 * @generated
	 */
	void setNameDiagram(String value);

	/**
	 * Returns the value of the '<em><b>Swimlane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swimlane</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swimlane</em>' containment reference.
	 * @see #setSwimlane(Swimlane)
	 * @see bpmn.BPMNPackage#getBPMN_Swimlane()
	 * @model containment="true"
	 * @generated
	 */
	Swimlane getSwimlane();

	/**
	 * Sets the value of the '{@link bpmn.BPMN#getSwimlane <em>Swimlane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swimlane</em>' containment reference.
	 * @see #getSwimlane()
	 * @generated
	 */
	void setSwimlane(Swimlane value);

} // BPMN
