/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Pool#getNamePool <em>Name Pool</em>}</li>
 *   <li>{@link bpmn.Pool#getSwimlane <em>Swimlane</em>}</li>
 *   <li>{@link bpmn.Pool#getLanerelationpool <em>Lanerelationpool</em>}</li>
 *   <li>{@link bpmn.Pool#getChildpool <em>Childpool</em>}</li>
 *   <li>{@link bpmn.Pool#getFatherpool <em>Fatherpool</em>}</li>
 *   <li>{@link bpmn.Pool#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getPool()
 * @model
 * @generated
 */
public interface Pool extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Pool</em>' attribute.
	 * @see #setNamePool(String)
	 * @see bpmn.BPMNPackage#getPool_NamePool()
	 * @model
	 * @generated
	 */
	String getNamePool();

	/**
	 * Sets the value of the '{@link bpmn.Pool#getNamePool <em>Name Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Pool</em>' attribute.
	 * @see #getNamePool()
	 * @generated
	 */
	void setNamePool(String value);

	/**
	 * Returns the value of the '<em><b>Swimlane</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Swimlane#getPoolincludeswimlane <em>Poolincludeswimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swimlane</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swimlane</em>' reference.
	 * @see #setSwimlane(Swimlane)
	 * @see bpmn.BPMNPackage#getPool_Swimlane()
	 * @see bpmn.Swimlane#getPoolincludeswimlane
	 * @model opposite="poolincludeswimlane" required="true"
	 * @generated
	 */
	Swimlane getSwimlane();

	/**
	 * Sets the value of the '{@link bpmn.Pool#getSwimlane <em>Swimlane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swimlane</em>' reference.
	 * @see #getSwimlane()
	 * @generated
	 */
	void setSwimlane(Swimlane value);

	/**
	 * Returns the value of the '<em><b>Lanerelationpool</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Lane}.
	 * It is bidirectional and its opposite is '{@link bpmn.Lane#getPoolrelationlane <em>Poolrelationlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lanerelationpool</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanerelationpool</em>' reference list.
	 * @see bpmn.BPMNPackage#getPool_Lanerelationpool()
	 * @see bpmn.Lane#getPoolrelationlane
	 * @model opposite="poolrelationlane"
	 * @generated
	 */
	EList<Lane> getLanerelationpool();

	/**
	 * Returns the value of the '<em><b>Childpool</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Pool}.
	 * It is bidirectional and its opposite is '{@link bpmn.Pool#getFatherpool <em>Fatherpool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childpool</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childpool</em>' reference list.
	 * @see bpmn.BPMNPackage#getPool_Childpool()
	 * @see bpmn.Pool#getFatherpool
	 * @model opposite="fatherpool"
	 * @generated
	 */
	EList<Pool> getChildpool();

	/**
	 * Returns the value of the '<em><b>Fatherpool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Pool#getChildpool <em>Childpool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fatherpool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fatherpool</em>' reference.
	 * @see #setFatherpool(Pool)
	 * @see bpmn.BPMNPackage#getPool_Fatherpool()
	 * @see bpmn.Pool#getChildpool
	 * @model opposite="childpool"
	 * @generated
	 */
	Pool getFatherpool();

	/**
	 * Sets the value of the '{@link bpmn.Pool#getFatherpool <em>Fatherpool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fatherpool</em>' reference.
	 * @see #getFatherpool()
	 * @generated
	 */
	void setFatherpool(Pool value);

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
	 * @see bpmn.BPMNPackage#getPool_CreationDate()
	 * @model
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link bpmn.Pool#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

} // Pool
