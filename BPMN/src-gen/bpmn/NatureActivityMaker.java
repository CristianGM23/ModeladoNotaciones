/**
 */
package bpmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nature Activity Maker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.NatureActivityMaker#getType <em>Type</em>}</li>
 *   <li>{@link bpmn.NatureActivityMaker#getActivity <em>Activity</em>}</li>
 *   <li>{@link bpmn.NatureActivityMaker#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getNatureActivityMaker()
 * @model
 * @generated
 */
public interface NatureActivityMaker extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.TypeNatureActivityMaker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeNatureActivityMaker
	 * @see #setType(TypeNatureActivityMaker)
	 * @see bpmn.BPMNPackage#getNatureActivityMaker_Type()
	 * @model
	 * @generated
	 */
	TypeNatureActivityMaker getType();

	/**
	 * Sets the value of the '{@link bpmn.NatureActivityMaker#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmn.TypeNatureActivityMaker
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeNatureActivityMaker value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Activity#getNatureactivitymaker <em>Natureactivitymaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see bpmn.BPMNPackage#getNatureActivityMaker_Activity()
	 * @see bpmn.Activity#getNatureactivitymaker
	 * @model opposite="natureactivitymaker" required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link bpmn.NatureActivityMaker#getActivity <em>Activity</em>}' reference.
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
	 * @see bpmn.BPMNPackage#getNatureActivityMaker_CreationDate()
	 * @model
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link bpmn.NatureActivityMaker#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

} // NatureActivityMaker
