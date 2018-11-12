/**
 */
package bpmn.util;

import bpmn.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bpmn.BPMNPackage
 * @generated
 */
public class BPMNSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPMNPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNSwitch() {
		if (modelPackage == null) {
			modelPackage = BPMNPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BPMNPackage.LANE: {
			Lane lane = (Lane) theEObject;
			T result = caseLane(lane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.CONNECTION: {
			Connection connection = (Connection) theEObject;
			T result = caseConnection(connection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.FIGURE: {
			Figure figure = (Figure) theEObject;
			T result = caseFigure(figure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.SWIMLANE: {
			Swimlane swimlane = (Swimlane) theEObject;
			T result = caseSwimlane(swimlane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseElements(activity);
			if (result == null)
				result = caseFigure(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.GATEWAY: {
			Gateway gateway = (Gateway) theEObject;
			T result = caseGateway(gateway);
			if (result == null)
				result = caseElements(gateway);
			if (result == null)
				result = caseFigure(gateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = caseElements(data);
			if (result == null)
				result = caseFigure(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.MESSAGE: {
			Message message = (Message) theEObject;
			T result = caseMessage(message);
			if (result == null)
				result = caseConnection(message);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.ASSOCIATION: {
			Association association = (Association) theEObject;
			T result = caseAssociation(association);
			if (result == null)
				result = caseConnection(association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.SECUENCE: {
			Secuence secuence = (Secuence) theEObject;
			T result = caseSecuence(secuence);
			if (result == null)
				result = caseConnection(secuence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.POOL: {
			Pool pool = (Pool) theEObject;
			T result = casePool(pool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.BPMN: {
			BPMN bpmn = (BPMN) theEObject;
			T result = caseBPMN(bpmn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseElements(event);
			if (result == null)
				result = caseFigure(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.FINAL: {
			Final final_ = (Final) theEObject;
			T result = caseFinal(final_);
			if (result == null)
				result = caseEvent(final_);
			if (result == null)
				result = caseElements(final_);
			if (result == null)
				result = caseFigure(final_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.INITIAL: {
			Initial initial = (Initial) theEObject;
			T result = caseInitial(initial);
			if (result == null)
				result = caseEvent(initial);
			if (result == null)
				result = caseElements(initial);
			if (result == null)
				result = caseFigure(initial);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.INTERMEDIATE: {
			Intermediate intermediate = (Intermediate) theEObject;
			T result = caseIntermediate(intermediate);
			if (result == null)
				result = caseEvent(intermediate);
			if (result == null)
				result = caseElements(intermediate);
			if (result == null)
				result = caseFigure(intermediate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.HIGH_LEVEL: {
			HighLevel highLevel = (HighLevel) theEObject;
			T result = caseHighLevel(highLevel);
			if (result == null)
				result = caseInitial(highLevel);
			if (result == null)
				result = caseEvent(highLevel);
			if (result == null)
				result = caseElements(highLevel);
			if (result == null)
				result = caseFigure(highLevel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.SUBPROCESS: {
			Subprocess subprocess = (Subprocess) theEObject;
			T result = caseSubprocess(subprocess);
			if (result == null)
				result = caseInitial(subprocess);
			if (result == null)
				result = caseEvent(subprocess);
			if (result == null)
				result = caseElements(subprocess);
			if (result == null)
				result = caseFigure(subprocess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.SUBPROCESS_NON_INTERRUPT: {
			SubprocessNonInterrupt subprocessNonInterrupt = (SubprocessNonInterrupt) theEObject;
			T result = caseSubprocessNonInterrupt(subprocessNonInterrupt);
			if (result == null)
				result = caseInitial(subprocessNonInterrupt);
			if (result == null)
				result = caseEvent(subprocessNonInterrupt);
			if (result == null)
				result = caseElements(subprocessNonInterrupt);
			if (result == null)
				result = caseFigure(subprocessNonInterrupt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.CATCH: {
			Catch catch_ = (Catch) theEObject;
			T result = caseCatch(catch_);
			if (result == null)
				result = caseIntermediate(catch_);
			if (result == null)
				result = caseEvent(catch_);
			if (result == null)
				result = caseElements(catch_);
			if (result == null)
				result = caseFigure(catch_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.BOUNDARY: {
			Boundary boundary = (Boundary) theEObject;
			T result = caseBoundary(boundary);
			if (result == null)
				result = caseIntermediate(boundary);
			if (result == null)
				result = caseEvent(boundary);
			if (result == null)
				result = caseElements(boundary);
			if (result == null)
				result = caseFigure(boundary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.BOUNDARY_NON_INTERRUPT: {
			BoundaryNonInterrupt boundaryNonInterrupt = (BoundaryNonInterrupt) theEObject;
			T result = caseBoundaryNonInterrupt(boundaryNonInterrupt);
			if (result == null)
				result = caseIntermediate(boundaryNonInterrupt);
			if (result == null)
				result = caseEvent(boundaryNonInterrupt);
			if (result == null)
				result = caseElements(boundaryNonInterrupt);
			if (result == null)
				result = caseFigure(boundaryNonInterrupt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.THROW: {
			Throw throw_ = (Throw) theEObject;
			T result = caseThrow(throw_);
			if (result == null)
				result = caseIntermediate(throw_);
			if (result == null)
				result = caseEvent(throw_);
			if (result == null)
				result = caseElements(throw_);
			if (result == null)
				result = caseFigure(throw_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.PERFORMANCE_ACTIVITY_MAKER: {
			PerformanceActivityMaker performanceActivityMaker = (PerformanceActivityMaker) theEObject;
			T result = casePerformanceActivityMaker(performanceActivityMaker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.NATURE_ACTIVITY_MAKER: {
			NatureActivityMaker natureActivityMaker = (NatureActivityMaker) theEObject;
			T result = caseNatureActivityMaker(natureActivityMaker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.GROUP: {
			Group group = (Group) theEObject;
			T result = caseGroup(group);
			if (result == null)
				result = caseFigure(group);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BPMNPackage.ELEMENTS: {
			Elements elements = (Elements) theEObject;
			T result = caseElements(elements);
			if (result == null)
				result = caseFigure(elements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane(Lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigure(Figure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swimlane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swimlane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwimlane(Swimlane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secuence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secuence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuence(Secuence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePool(Pool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPMN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMN(BPMN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinal(Final object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitial(Initial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediate(Intermediate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>High Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>High Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighLevel(HighLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprocess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprocess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprocess(Subprocess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprocess Non Interrupt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprocess Non Interrupt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprocessNonInterrupt(SubprocessNonInterrupt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatch(Catch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundary(Boundary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Non Interrupt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Non Interrupt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryNonInterrupt(BoundaryNonInterrupt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrow(Throw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Activity Maker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Activity Maker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceActivityMaker(PerformanceActivityMaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nature Activity Maker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nature Activity Maker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatureActivityMaker(NatureActivityMaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElements(Elements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BPMNSwitch
