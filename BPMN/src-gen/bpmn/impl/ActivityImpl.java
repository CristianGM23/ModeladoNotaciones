/**
 */
package bpmn.impl;

import bpmn.Activity;
import bpmn.BPMNPackage;
import bpmn.Event;
import bpmn.NatureActivityMaker;
import bpmn.PerformanceActivityMaker;
import bpmn.TypeActivity;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.ActivityImpl#getType <em>Type</em>}</li>
 *   <li>{@link bpmn.impl.ActivityImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link bpmn.impl.ActivityImpl#getPerformance <em>Performance</em>}</li>
 *   <li>{@link bpmn.impl.ActivityImpl#getNatureactivitymaker <em>Natureactivitymaker</em>}</li>
 *   <li>{@link bpmn.impl.ActivityImpl#getPerformanceactivitymaker <em>Performanceactivitymaker</em>}</li>
 *   <li>{@link bpmn.impl.ActivityImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends ElementsImpl implements Activity {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeActivity TYPE_EDEFAULT = TypeActivity.TASK;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeActivity type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected NatureActivityMaker nature;
	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceActivityMaker> performance;

	/**
	 * The cached value of the '{@link #getNatureactivitymaker() <em>Natureactivitymaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureactivitymaker()
	 * @generated
	 * @ordered
	 */
	protected NatureActivityMaker natureactivitymaker;
	/**
	 * The cached value of the '{@link #getPerformanceactivitymaker() <em>Performanceactivitymaker</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceactivitymaker()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceActivityMaker> performanceactivitymaker;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeActivity getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeActivity newType) {
		TypeActivity oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.ACTIVITY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureActivityMaker getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNature(NatureActivityMaker newNature, NotificationChain msgs) {
		NatureActivityMaker oldNature = nature;
		nature = newNature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.ACTIVITY__NATURE,
					oldNature, newNature);
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
	public void setNature(NatureActivityMaker newNature) {
		if (newNature != nature) {
			NotificationChain msgs = null;
			if (nature != null)
				msgs = ((InternalEObject) nature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BPMNPackage.ACTIVITY__NATURE, null, msgs);
			if (newNature != null)
				msgs = ((InternalEObject) newNature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BPMNPackage.ACTIVITY__NATURE, null, msgs);
			msgs = basicSetNature(newNature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.ACTIVITY__NATURE, newNature, newNature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformanceActivityMaker> getPerformance() {
		if (performance == null) {
			performance = new EObjectContainmentEList<PerformanceActivityMaker>(PerformanceActivityMaker.class, this,
					BPMNPackage.ACTIVITY__PERFORMANCE);
		}
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureActivityMaker getNatureactivitymaker() {
		if (natureactivitymaker != null && natureactivitymaker.eIsProxy()) {
			InternalEObject oldNatureactivitymaker = (InternalEObject) natureactivitymaker;
			natureactivitymaker = (NatureActivityMaker) eResolveProxy(oldNatureactivitymaker);
			if (natureactivitymaker != oldNatureactivitymaker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNPackage.ACTIVITY__NATUREACTIVITYMAKER,
							oldNatureactivitymaker, natureactivitymaker));
			}
		}
		return natureactivitymaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureActivityMaker basicGetNatureactivitymaker() {
		return natureactivitymaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNatureactivitymaker(NatureActivityMaker newNatureactivitymaker,
			NotificationChain msgs) {
		NatureActivityMaker oldNatureactivitymaker = natureactivitymaker;
		natureactivitymaker = newNatureactivitymaker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BPMNPackage.ACTIVITY__NATUREACTIVITYMAKER, oldNatureactivitymaker, newNatureactivitymaker);
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
	public void setNatureactivitymaker(NatureActivityMaker newNatureactivitymaker) {
		if (newNatureactivitymaker != natureactivitymaker) {
			NotificationChain msgs = null;
			if (natureactivitymaker != null)
				msgs = ((InternalEObject) natureactivitymaker).eInverseRemove(this,
						BPMNPackage.NATURE_ACTIVITY_MAKER__ACTIVITY, NatureActivityMaker.class, msgs);
			if (newNatureactivitymaker != null)
				msgs = ((InternalEObject) newNatureactivitymaker).eInverseAdd(this,
						BPMNPackage.NATURE_ACTIVITY_MAKER__ACTIVITY, NatureActivityMaker.class, msgs);
			msgs = basicSetNatureactivitymaker(newNatureactivitymaker, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.ACTIVITY__NATUREACTIVITYMAKER,
					newNatureactivitymaker, newNatureactivitymaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformanceActivityMaker> getPerformanceactivitymaker() {
		if (performanceactivitymaker == null) {
			performanceactivitymaker = new EObjectWithInverseResolvingEList<PerformanceActivityMaker>(
					PerformanceActivityMaker.class, this, BPMNPackage.ACTIVITY__PERFORMANCEACTIVITYMAKER,
					BPMNPackage.PERFORMANCE_ACTIVITY_MAKER__ACTIVITY);
		}
		return performanceactivitymaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectWithInverseResolvingEList<Event>(Event.class, this, BPMNPackage.ACTIVITY__EVENTS,
					BPMNPackage.EVENT__ACTIVITY);
		}
		return events;
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
		case BPMNPackage.ACTIVITY__NATUREACTIVITYMAKER:
			if (natureactivitymaker != null)
				msgs = ((InternalEObject) natureactivitymaker).eInverseRemove(this,
						BPMNPackage.NATURE_ACTIVITY_MAKER__ACTIVITY, NatureActivityMaker.class, msgs);
			return basicSetNatureactivitymaker((NatureActivityMaker) otherEnd, msgs);
		case BPMNPackage.ACTIVITY__PERFORMANCEACTIVITYMAKER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPerformanceactivitymaker())
					.basicAdd(otherEnd, msgs);
		case BPMNPackage.ACTIVITY__EVENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEvents()).basicAdd(otherEnd, msgs);
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
		case BPMNPackage.ACTIVITY__NATURE:
			return basicSetNature(null, msgs);
		case BPMNPackage.ACTIVITY__PERFORMANCE:
			return ((InternalEList<?>) getPerformance()).basicRemove(otherEnd, msgs);
		case BPMNPackage.ACTIVITY__NATUREACTIVITYMAKER:
			return basicSetNatureactivitymaker(null, msgs);
		case BPMNPackage.ACTIVITY__PERFORMANCEACTIVITYMAKER:
			return ((InternalEList<?>) getPerformanceactivitymaker()).basicRemove(otherEnd, msgs);
		case BPMNPackage.ACTIVITY__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
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
		case BPMNPackage.ACTIVITY__TYPE:
			return getType();
		case BPMNPackage.ACTIVITY__NATURE:
			return getNature();
		case BPMNPackage.ACTIVITY__PERFORMANCE:
			return getPerformance();
		case BPMNPackage.ACTIVITY__NATUREACTIVITYMAKER:
			if (resolve)
				return getNatureactivitymaker();
			return basicGetNatureactivitymaker();
		case BPMNPackage.ACTIVITY__PERFORMANCEACTIVITYMAKER:
			return getPerformanceactivitymaker();
		case BPMNPackage.ACTIVITY__EVENTS:
			return getEvents();
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
		case BPMNPackage.ACTIVITY__TYPE:
			setType((TypeActivity) newValue);
			return;
		case BPMNPackage.ACTIVITY__NATURE:
			setNature((NatureActivityMaker) newValue);
			return;
		case BPMNPackage.ACTIVITY__PERFORMANCE:
			getPerformance().clear();
			getPerformance().addAll((Collection<? extends PerformanceActivityMaker>) newValue);
			return;
		case BPMNPackage.ACTIVITY__NATUREACTIVITYMAKER:
			setNatureactivitymaker((NatureActivityMaker) newValue);
			return;
		case BPMNPackage.ACTIVITY__PERFORMANCEACTIVITYMAKER:
			getPerformanceactivitymaker().clear();
			getPerformanceactivitymaker().addAll((Collection<? extends PerformanceActivityMaker>) newValue);
			return;
		case BPMNPackage.ACTIVITY__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
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
		case BPMNPackage.ACTIVITY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case BPMNPackage.ACTIVITY__NATURE:
			setNature((NatureActivityMaker) null);
			return;
		case BPMNPackage.ACTIVITY__PERFORMANCE:
			getPerformance().clear();
			return;
		case BPMNPackage.ACTIVITY__NATUREACTIVITYMAKER:
			setNatureactivitymaker((NatureActivityMaker) null);
			return;
		case BPMNPackage.ACTIVITY__PERFORMANCEACTIVITYMAKER:
			getPerformanceactivitymaker().clear();
			return;
		case BPMNPackage.ACTIVITY__EVENTS:
			getEvents().clear();
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
		case BPMNPackage.ACTIVITY__TYPE:
			return type != TYPE_EDEFAULT;
		case BPMNPackage.ACTIVITY__NATURE:
			return nature != null;
		case BPMNPackage.ACTIVITY__PERFORMANCE:
			return performance != null && !performance.isEmpty();
		case BPMNPackage.ACTIVITY__NATUREACTIVITYMAKER:
			return natureactivitymaker != null;
		case BPMNPackage.ACTIVITY__PERFORMANCEACTIVITYMAKER:
			return performanceactivitymaker != null && !performanceactivitymaker.isEmpty();
		case BPMNPackage.ACTIVITY__EVENTS:
			return events != null && !events.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
