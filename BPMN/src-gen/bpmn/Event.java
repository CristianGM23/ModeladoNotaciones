/**
 */
package bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Event#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends Elements {

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Activity#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see bpmn.BPMNPackage#getEvent_Activity()
	 * @see bpmn.Activity#getEvents
	 * @model opposite="events"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link bpmn.Event#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);
} // Event
