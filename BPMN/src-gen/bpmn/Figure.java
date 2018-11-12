/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Figure#getName <em>Name</em>}</li>
 *   <li>{@link bpmn.Figure#getConnection <em>Connection</em>}</li>
 *   <li>{@link bpmn.Figure#getConnectionTarget <em>Connection Target</em>}</li>
 *   <li>{@link bpmn.Figure#getConnectionSource <em>Connection Source</em>}</li>
 *   <li>{@link bpmn.Figure#getFigurecontentslane <em>Figurecontentslane</em>}</li>
 *   <li>{@link bpmn.Figure#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @see bpmn.BPMNPackage#getFigure()
 * @model abstract="true"
 * @generated
 */
public interface Figure extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bpmn.BPMNPackage#getFigure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn.Figure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see bpmn.BPMNPackage#getFigure_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Connection Source</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Connection}.
	 * It is bidirectional and its opposite is '{@link bpmn.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Source</em>' reference list.
	 * @see bpmn.BPMNPackage#getFigure_ConnectionSource()
	 * @see bpmn.Connection#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Connection> getConnectionSource();

	/**
	 * Returns the value of the '<em><b>Figurecontentslane</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Lane#getLaneincludefigure <em>Laneincludefigure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figurecontentslane</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figurecontentslane</em>' reference.
	 * @see #setFigurecontentslane(Lane)
	 * @see bpmn.BPMNPackage#getFigure_Figurecontentslane()
	 * @see bpmn.Lane#getLaneincludefigure
	 * @model opposite="laneincludefigure" required="true"
	 * @generated
	 */
	Lane getFigurecontentslane();

	/**
	 * Sets the value of the '{@link bpmn.Figure#getFigurecontentslane <em>Figurecontentslane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figurecontentslane</em>' reference.
	 * @see #getFigurecontentslane()
	 * @generated
	 */
	void setFigurecontentslane(Lane value);

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
	 * @see bpmn.BPMNPackage#getFigure_CreationDate()
	 * @model
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link bpmn.Figure#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

	/**
	 * Returns the value of the '<em><b>Connection Target</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Connection}.
	 * It is bidirectional and its opposite is '{@link bpmn.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Target</em>' reference list.
	 * @see bpmn.BPMNPackage#getFigure_ConnectionTarget()
	 * @see bpmn.Connection#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Connection> getConnectionTarget();

} // Figure
