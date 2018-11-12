/**
 */
package bpmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Activity Maker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.PerformanceActivityMaker#getType <em>Type</em>}</li>
 *   <li>{@link bpmn.PerformanceActivityMaker#getActivity <em>Activity</em>}</li>
 *   <li>{@link bpmn.PerformanceActivityMaker#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getPerformanceActivityMaker()
 * @model
 * @generated
 */
public interface PerformanceActivityMaker extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypePerformanceActivityMaker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypePerformanceActivityMaker
	 * @see #setType(TypePerformanceActivityMaker)
	 * @see bpmn.BPMNPackage#getPerformanceActivityMaker_Type()
	 * @model
	 * @generated
	 */
	TypePerformanceActivityMaker getType();

	/**
	 * Sets the value of the '{@link bpmn.PerformanceActivityMaker#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypePerformanceActivityMaker
	 * @see #getType()
	 * @generated
	 */
	void setType(TypePerformanceActivityMaker value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Activity#getPerformanceactivitymaker <em>Performanceactivitymaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see bpmn.BPMNPackage#getPerformanceActivityMaker_Activity()
	 * @see bpmn.Activity#getPerformanceactivitymaker
	 * @model opposite="performanceactivitymaker" required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link bpmn.PerformanceActivityMaker#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

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
	 * @see bpmn.BPMNPackage#getPerformanceActivityMaker_CreationDate()
	 * @model
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link bpmn.PerformanceActivityMaker#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

} // PerformanceActivityMaker
