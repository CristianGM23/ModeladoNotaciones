/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Lane#getNameLane <em>Name Lane</em>}</li>
 *   <li>{@link bpmn.Lane#getFigure <em>Figure</em>}</li>
 *   <li>{@link bpmn.Lane#getPoolrelationlane <em>Poolrelationlane</em>}</li>
 *   <li>{@link bpmn.Lane#getLaneincludefigure <em>Laneincludefigure</em>}</li>
 *   <li>{@link bpmn.Lane#getLanerelationswimline <em>Lanerelationswimline</em>}</li>
 *   <li>{@link bpmn.Lane#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Lane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Lane</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Lane</em>' attribute.
	 * @see #setNameLane(String)
	 * @see bpmn.BPMNPackage#getLane_NameLane()
	 * @model
	 * @generated
	 */
	String getNameLane();

	/**
	 * Sets the value of the '{@link bpmn.Lane#getNameLane <em>Name Lane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Lane</em>' attribute.
	 * @see #getNameLane()
	 * @generated
	 */
	void setNameLane(String value);

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Figure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference list.
	 * @see bpmn.BPMNPackage#getLane_Figure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Figure> getFigure();

	/**
	 * Returns the value of the '<em><b>Poolrelationlane</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Pool#getLanerelationpool <em>Lanerelationpool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poolrelationlane</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poolrelationlane</em>' reference.
	 * @see #setPoolrelationlane(Pool)
	 * @see bpmn.BPMNPackage#getLane_Poolrelationlane()
	 * @see bpmn.Pool#getLanerelationpool
	 * @model opposite="lanerelationpool"
	 * @generated
	 */
	Pool getPoolrelationlane();

	/**
	 * Sets the value of the '{@link bpmn.Lane#getPoolrelationlane <em>Poolrelationlane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poolrelationlane</em>' reference.
	 * @see #getPoolrelationlane()
	 * @generated
	 */
	void setPoolrelationlane(Pool value);

	/**
	 * Returns the value of the '<em><b>Laneincludefigure</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Figure}.
	 * It is bidirectional and its opposite is '{@link bpmn.Figure#getFigurecontentslane <em>Figurecontentslane</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Laneincludefigure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laneincludefigure</em>' reference list.
	 * @see bpmn.BPMNPackage#getLane_Laneincludefigure()
	 * @see bpmn.Figure#getFigurecontentslane
	 * @model opposite="figurecontentslane"
	 * @generated
	 */
	EList<Figure> getLaneincludefigure();

	/**
	 * Returns the value of the '<em><b>Lanerelationswimline</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Swimlane#getLaneincludeswimlane <em>Laneincludeswimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lanerelationswimline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanerelationswimline</em>' reference.
	 * @see #setLanerelationswimline(Swimlane)
	 * @see bpmn.BPMNPackage#getLane_Lanerelationswimline()
	 * @see bpmn.Swimlane#getLaneincludeswimlane
	 * @model opposite="laneincludeswimlane" required="true"
	 * @generated
	 */
	Swimlane getLanerelationswimline();

	/**
	 * Sets the value of the '{@link bpmn.Lane#getLanerelationswimline <em>Lanerelationswimline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lanerelationswimline</em>' reference.
	 * @see #getLanerelationswimline()
	 * @generated
	 */
	void setLanerelationswimline(Swimlane value);

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
	 * @see bpmn.BPMNPackage#getLane_CreationDate()
	 * @model
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link bpmn.Lane#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

} // Lane
