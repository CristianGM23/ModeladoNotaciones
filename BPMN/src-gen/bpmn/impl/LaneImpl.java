/**
 */
package bpmn.impl;

import bpmn.BPMNPackage;
import bpmn.Figure;
import bpmn.Lane;
import bpmn.Pool;
import bpmn.Swimlane;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.LaneImpl#getNameLane <em>Name Lane</em>}</li>
 *   <li>{@link bpmn.impl.LaneImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link bpmn.impl.LaneImpl#getPoolrelationlane <em>Poolrelationlane</em>}</li>
 *   <li>{@link bpmn.impl.LaneImpl#getLaneincludefigure <em>Laneincludefigure</em>}</li>
 *   <li>{@link bpmn.impl.LaneImpl#getLanerelationswimline <em>Lanerelationswimline</em>}</li>
 *   <li>{@link bpmn.impl.LaneImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaneImpl extends MinimalEObjectImpl.Container implements Lane {
	/**
	 * The default value of the '{@link #getNameLane() <em>Name Lane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameLane()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_LANE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameLane() <em>Name Lane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameLane()
	 * @generated
	 * @ordered
	 */
	protected String nameLane = NAME_LANE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFigure() <em>Figure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected EList<Figure> figure;

	/**
	 * The cached value of the '{@link #getPoolrelationlane() <em>Poolrelationlane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolrelationlane()
	 * @generated
	 * @ordered
	 */
	protected Pool poolrelationlane;

	/**
	 * The cached value of the '{@link #getLaneincludefigure() <em>Laneincludefigure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaneincludefigure()
	 * @generated
	 * @ordered
	 */
	protected EList<Figure> laneincludefigure;

	/**
	 * The cached value of the '{@link #getLanerelationswimline() <em>Lanerelationswimline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanerelationswimline()
	 * @generated
	 * @ordered
	 */
	protected Swimlane lanerelationswimline;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected String creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.Literals.LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameLane() {
		return nameLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameLane(String newNameLane) {
		String oldNameLane = nameLane;
		nameLane = newNameLane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.LANE__NAME_LANE, oldNameLane, nameLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Figure> getFigure() {
		if (figure == null) {
			figure = new EObjectContainmentEList<Figure>(Figure.class, this, BPMNPackage.LANE__FIGURE);
		}
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool getPoolrelationlane() {
		if (poolrelationlane != null && poolrelationlane.eIsProxy()) {
			InternalEObject oldPoolrelationlane = (InternalEObject) poolrelationlane;
			poolrelationlane = (Pool) eResolveProxy(oldPoolrelationlane);
			if (poolrelationlane != oldPoolrelationlane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNPackage.LANE__POOLRELATIONLANE,
							oldPoolrelationlane, poolrelationlane));
			}
		}
		return poolrelationlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool basicGetPoolrelationlane() {
		return poolrelationlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoolrelationlane(Pool newPoolrelationlane, NotificationChain msgs) {
		Pool oldPoolrelationlane = poolrelationlane;
		poolrelationlane = newPoolrelationlane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BPMNPackage.LANE__POOLRELATIONLANE, oldPoolrelationlane, newPoolrelationlane);
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
	public void setPoolrelationlane(Pool newPoolrelationlane) {
		if (newPoolrelationlane != poolrelationlane) {
			NotificationChain msgs = null;
			if (poolrelationlane != null)
				msgs = ((InternalEObject) poolrelationlane).eInverseRemove(this, BPMNPackage.POOL__LANERELATIONPOOL,
						Pool.class, msgs);
			if (newPoolrelationlane != null)
				msgs = ((InternalEObject) newPoolrelationlane).eInverseAdd(this, BPMNPackage.POOL__LANERELATIONPOOL,
						Pool.class, msgs);
			msgs = basicSetPoolrelationlane(newPoolrelationlane, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.LANE__POOLRELATIONLANE,
					newPoolrelationlane, newPoolrelationlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Figure> getLaneincludefigure() {
		if (laneincludefigure == null) {
			laneincludefigure = new EObjectWithInverseResolvingEList<Figure>(Figure.class, this,
					BPMNPackage.LANE__LANEINCLUDEFIGURE, BPMNPackage.FIGURE__FIGURECONTENTSLANE);
		}
		return laneincludefigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swimlane getLanerelationswimline() {
		if (lanerelationswimline != null && lanerelationswimline.eIsProxy()) {
			InternalEObject oldLanerelationswimline = (InternalEObject) lanerelationswimline;
			lanerelationswimline = (Swimlane) eResolveProxy(oldLanerelationswimline);
			if (lanerelationswimline != oldLanerelationswimline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNPackage.LANE__LANERELATIONSWIMLINE,
							oldLanerelationswimline, lanerelationswimline));
			}
		}
		return lanerelationswimline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swimlane basicGetLanerelationswimline() {
		return lanerelationswimline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanerelationswimline(Swimlane newLanerelationswimline, NotificationChain msgs) {
		Swimlane oldLanerelationswimline = lanerelationswimline;
		lanerelationswimline = newLanerelationswimline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BPMNPackage.LANE__LANERELATIONSWIMLINE, oldLanerelationswimline, newLanerelationswimline);
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
	public void setLanerelationswimline(Swimlane newLanerelationswimline) {
		if (newLanerelationswimline != lanerelationswimline) {
			NotificationChain msgs = null;
			if (lanerelationswimline != null)
				msgs = ((InternalEObject) lanerelationswimline).eInverseRemove(this,
						BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE, Swimlane.class, msgs);
			if (newLanerelationswimline != null)
				msgs = ((InternalEObject) newLanerelationswimline).eInverseAdd(this,
						BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE, Swimlane.class, msgs);
			msgs = basicSetLanerelationswimline(newLanerelationswimline, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.LANE__LANERELATIONSWIMLINE,
					newLanerelationswimline, newLanerelationswimline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(String newCreationDate) {
		String oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.LANE__CREATION_DATE, oldCreationDate,
					creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BPMNPackage.LANE__POOLRELATIONLANE:
			if (poolrelationlane != null)
				msgs = ((InternalEObject) poolrelationlane).eInverseRemove(this, BPMNPackage.POOL__LANERELATIONPOOL,
						Pool.class, msgs);
			return basicSetPoolrelationlane((Pool) otherEnd, msgs);
		case BPMNPackage.LANE__LANEINCLUDEFIGURE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLaneincludefigure()).basicAdd(otherEnd,
					msgs);
		case BPMNPackage.LANE__LANERELATIONSWIMLINE:
			if (lanerelationswimline != null)
				msgs = ((InternalEObject) lanerelationswimline).eInverseRemove(this,
						BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE, Swimlane.class, msgs);
			return basicSetLanerelationswimline((Swimlane) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BPMNPackage.LANE__FIGURE:
			return ((InternalEList<?>) getFigure()).basicRemove(otherEnd, msgs);
		case BPMNPackage.LANE__POOLRELATIONLANE:
			return basicSetPoolrelationlane(null, msgs);
		case BPMNPackage.LANE__LANEINCLUDEFIGURE:
			return ((InternalEList<?>) getLaneincludefigure()).basicRemove(otherEnd, msgs);
		case BPMNPackage.LANE__LANERELATIONSWIMLINE:
			return basicSetLanerelationswimline(null, msgs);
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
		case BPMNPackage.LANE__NAME_LANE:
			return getNameLane();
		case BPMNPackage.LANE__FIGURE:
			return getFigure();
		case BPMNPackage.LANE__POOLRELATIONLANE:
			if (resolve)
				return getPoolrelationlane();
			return basicGetPoolrelationlane();
		case BPMNPackage.LANE__LANEINCLUDEFIGURE:
			return getLaneincludefigure();
		case BPMNPackage.LANE__LANERELATIONSWIMLINE:
			if (resolve)
				return getLanerelationswimline();
			return basicGetLanerelationswimline();
		case BPMNPackage.LANE__CREATION_DATE:
			return getCreationDate();
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
		case BPMNPackage.LANE__NAME_LANE:
			setNameLane((String) newValue);
			return;
		case BPMNPackage.LANE__FIGURE:
			getFigure().clear();
			getFigure().addAll((Collection<? extends Figure>) newValue);
			return;
		case BPMNPackage.LANE__POOLRELATIONLANE:
			setPoolrelationlane((Pool) newValue);
			return;
		case BPMNPackage.LANE__LANEINCLUDEFIGURE:
			getLaneincludefigure().clear();
			getLaneincludefigure().addAll((Collection<? extends Figure>) newValue);
			return;
		case BPMNPackage.LANE__LANERELATIONSWIMLINE:
			setLanerelationswimline((Swimlane) newValue);
			return;
		case BPMNPackage.LANE__CREATION_DATE:
			setCreationDate((String) newValue);
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
		case BPMNPackage.LANE__NAME_LANE:
			setNameLane(NAME_LANE_EDEFAULT);
			return;
		case BPMNPackage.LANE__FIGURE:
			getFigure().clear();
			return;
		case BPMNPackage.LANE__POOLRELATIONLANE:
			setPoolrelationlane((Pool) null);
			return;
		case BPMNPackage.LANE__LANEINCLUDEFIGURE:
			getLaneincludefigure().clear();
			return;
		case BPMNPackage.LANE__LANERELATIONSWIMLINE:
			setLanerelationswimline((Swimlane) null);
			return;
		case BPMNPackage.LANE__CREATION_DATE:
			setCreationDate(CREATION_DATE_EDEFAULT);
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
		case BPMNPackage.LANE__NAME_LANE:
			return NAME_LANE_EDEFAULT == null ? nameLane != null : !NAME_LANE_EDEFAULT.equals(nameLane);
		case BPMNPackage.LANE__FIGURE:
			return figure != null && !figure.isEmpty();
		case BPMNPackage.LANE__POOLRELATIONLANE:
			return poolrelationlane != null;
		case BPMNPackage.LANE__LANEINCLUDEFIGURE:
			return laneincludefigure != null && !laneincludefigure.isEmpty();
		case BPMNPackage.LANE__LANERELATIONSWIMLINE:
			return lanerelationswimline != null;
		case BPMNPackage.LANE__CREATION_DATE:
			return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
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
		result.append(" (nameLane: ");
		result.append(nameLane);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //LaneImpl
