/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swimlane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Swimlane#getLane <em>Lane</em>}</li>
 *   <li>{@link bpmn.Swimlane#getPool <em>Pool</em>}</li>
 *   <li>{@link bpmn.Swimlane#getNameSwimlane <em>Name Swimlane</em>}</li>
 *   <li>{@link bpmn.Swimlane#getPoolincludeswimlane <em>Poolincludeswimlane</em>}</li>
 *   <li>{@link bpmn.Swimlane#getLaneincludeswimlane <em>Laneincludeswimlane</em>}</li>
 *   <li>{@link bpmn.Swimlane#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getSwimlane()
 * @model
 * @generated
 */
public interface Swimlane extends EObject {
	/**
	 * Returns the value of the '<em><b>Lane</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Lane}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lane</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lane</em>' containment reference list.
	 * @see bpmn.BPMNPackage#getSwimlane_Lane()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lane> getLane();

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Pool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' containment reference list.
	 * @see bpmn.BPMNPackage#getSwimlane_Pool()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pool> getPool();

	/**
	 * Returns the value of the '<em><b>Name Swimlane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Swimlane</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Swimlane</em>' attribute.
	 * @see #setNameSwimlane(String)
	 * @see bpmn.BPMNPackage#getSwimlane_NameSwimlane()
	 * @model
	 * @generated
	 */
	String getNameSwimlane();

	/**
	 * Sets the value of the '{@link bpmn.Swimlane#getNameSwimlane <em>Name Swimlane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Swimlane</em>' attribute.
	 * @see #getNameSwimlane()
	 * @generated
	 */
	void setNameSwimlane(String value);

	/**
	 * Returns the value of the '<em><b>Poolincludeswimlane</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Pool}.
	 * It is bidirectional and its opposite is '{@link bpmn.Pool#getSwimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poolincludeswimlane</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poolincludeswimlane</em>' reference list.
	 * @see bpmn.BPMNPackage#getSwimlane_Poolincludeswimlane()
	 * @see bpmn.Pool#getSwimlane
	 * @model opposite="swimlane"
	 * @generated
	 */
	EList<Pool> getPoolincludeswimlane();

	/**
	 * Returns the value of the '<em><b>Laneincludeswimlane</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Lane}.
	 * It is bidirectional and its opposite is '{@link bpmn.Lane#getLanerelationswimline <em>Lanerelationswimline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Laneincludeswimlane</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laneincludeswimlane</em>' reference list.
	 * @see bpmn.BPMNPackage#getSwimlane_Laneincludeswimlane()
	 * @see bpmn.Lane#getLanerelationswimline
	 * @model opposite="lanerelationswimline"
	 * @generated
	 */
	EList<Lane> getLaneincludeswimlane();

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see bpmn.BPMNPackage#getSwimlane_CreationDate()
	 * @model
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link bpmn.Swimlane#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

} // Swimlane
