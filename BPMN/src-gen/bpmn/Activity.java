/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Activity#getType <em>Type</em>}</li>
 *   <li>{@link bpmn.Activity#getNature <em>Nature</em>}</li>
 *   <li>{@link bpmn.Activity#getPerformance <em>Performance</em>}</li>
 *   <li>{@link bpmn.Activity#getNatureactivitymaker <em>Natureactivitymaker</em>}</li>
 *   <li>{@link bpmn.Activity#getPerformanceactivitymaker <em>Performanceactivitymaker</em>}</li>
 *   <li>{@link bpmn.Activity#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Elements {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeActivity
	 * @see #setType(TypeActivity)
	 * @see bpmn.BPMNPackage#getActivity_Type()
	 * @model
	 * @generated
	 */
	TypeActivity getType();

	/**
	 * Sets the value of the '{@link bpmn.Activity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeActivity
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeActivity value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' containment reference.
	 * @see #setNature(NatureActivityMaker)
	 * @see bpmn.BPMNPackage#getActivity_Nature()
	 * @model containment="true"
	 * @generated
	 */
	NatureActivityMaker getNature();

	/**
	 * Sets the value of the '{@link bpmn.Activity#getNature <em>Nature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' containment reference.
	 * @see #getNature()
	 * @generated
	 */
	void setNature(NatureActivityMaker value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.PerformanceActivityMaker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference list.
	 * @see bpmn.BPMNPackage#getActivity_Performance()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<PerformanceActivityMaker> getPerformance();

	/**
	 * Returns the value of the '<em><b>Natureactivitymaker</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.NatureActivityMaker#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Natureactivitymaker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Natureactivitymaker</em>' reference.
	 * @see #setNatureactivitymaker(NatureActivityMaker)
	 * @see bpmn.BPMNPackage#getActivity_Natureactivitymaker()
	 * @see bpmn.NatureActivityMaker#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	NatureActivityMaker getNatureactivitymaker();

	/**
	 * Sets the value of the '{@link bpmn.Activity#getNatureactivitymaker <em>Natureactivitymaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Natureactivitymaker</em>' reference.
	 * @see #getNatureactivitymaker()
	 * @generated
	 */
	void setNatureactivitymaker(NatureActivityMaker value);

	/**
	 * Returns the value of the '<em><b>Performanceactivitymaker</b></em>' reference list.
	 * The list contents are of type {@link bpmn.PerformanceActivityMaker}.
	 * It is bidirectional and its opposite is '{@link bpmn.PerformanceActivityMaker#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performanceactivitymaker</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performanceactivitymaker</em>' reference list.
	 * @see bpmn.BPMNPackage#getActivity_Performanceactivitymaker()
	 * @see bpmn.PerformanceActivityMaker#getActivity
	 * @model opposite="activity" upper="2"
	 * @generated
	 */
	EList<PerformanceActivityMaker> getPerformanceactivitymaker();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Event}.
	 * It is bidirectional and its opposite is '{@link bpmn.Event#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see bpmn.BPMNPackage#getActivity_Events()
	 * @see bpmn.Event#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	EList<Event> getEvents();
} // Activity
