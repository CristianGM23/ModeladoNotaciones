/**
 */
package bpmn.impl;

import bpmn.BPMN;
import bpmn.BPMNPackage;
import bpmn.Swimlane;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.BPMNImpl#getNameDiagram <em>Name Diagram</em>}</li>
 *   <li>{@link bpmn.impl.BPMNImpl#getSwimlane <em>Swimlane</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNImpl extends MinimalEObjectImpl.Container implements BPMN {
	/**
	 * The default value of the '{@link #getNameDiagram() <em>Name Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDiagram()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_DIAGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameDiagram() <em>Name Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDiagram()
	 * @generated
	 * @ordered
	 */
	protected String nameDiagram = NAME_DIAGRAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwimlane() <em>Swimlane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwimlane()
	 * @generated
	 * @ordered
	 */
	protected Swimlane swimlane;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.Literals.BPMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameDiagram() {
		return nameDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameDiagram(String newNameDiagram) {
		String oldNameDiagram = nameDiagram;
		nameDiagram = newNameDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.BPMN__NAME_DIAGRAM, oldNameDiagram,
					nameDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swimlane getSwimlane() {
		return swimlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwimlane(Swimlane newSwimlane, NotificationChain msgs) {
		Swimlane oldSwimlane = swimlane;
		swimlane = newSwimlane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.BPMN__SWIMLANE,
					oldSwimlane, newSwimlane);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwimlane(Swimlane newSwimlane) {
		if (newSwimlane != swimlane) {
			NotificationChain msgs = null;
			if (swimlane != null)
				msgs = ((InternalEObject) swimlane).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BPMNPackage.BPMN__SWIMLANE, null, msgs);
			if (newSwimlane != null)
				msgs = ((InternalEObject) newSwimlane).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BPMNPackage.BPMN__SWIMLANE, null, msgs);
			msgs = basicSetSwimlane(newSwimlane, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.BPMN__SWIMLANE, newSwimlane,
					newSwimlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BPMNPackage.BPMN__SWIMLANE:
			return basicSetSwimlane(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BPMNPackage.BPMN__NAME_DIAGRAM:
			return getNameDiagram();
		case BPMNPackage.BPMN__SWIMLANE:
			return getSwimlane();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BPMNPackage.BPMN__NAME_DIAGRAM:
			setNameDiagram((String) newValue);
			return;
		case BPMNPackage.BPMN__SWIMLANE:
			setSwimlane((Swimlane) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BPMNPackage.BPMN__NAME_DIAGRAM:
			setNameDiagram(NAME_DIAGRAM_EDEFAULT);
			return;
		case BPMNPackage.BPMN__SWIMLANE:
			setSwimlane((Swimlane) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BPMNPackage.BPMN__NAME_DIAGRAM:
			return NAME_DIAGRAM_EDEFAULT == null ? nameDiagram != null : !NAME_DIAGRAM_EDEFAULT.equals(nameDiagram);
		case BPMNPackage.BPMN__SWIMLANE:
			return swimlane != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nameDiagram: ");
		result.append(nameDiagram);
		result.append(')');
		return result.toString();
	}

} //BPMNImpl
