/**
 */
package bpmn.impl;

import bpmn.Activity;
import bpmn.Association;
import bpmn.BPMNFactory;
import bpmn.BPMNPackage;
import bpmn.Boundary;
import bpmn.BoundaryNonInterrupt;
import bpmn.Catch;
import bpmn.Connection;
import bpmn.Data;
import bpmn.Elements;
import bpmn.Event;
import bpmn.Figure;
import bpmn.Final;
import bpmn.Gateway;
import bpmn.Group;
import bpmn.HighLevel;
import bpmn.Initial;
import bpmn.Intermediate;
import bpmn.Lane;
import bpmn.Message;
import bpmn.NatureActivityMaker;
import bpmn.PerformanceActivityMaker;
import bpmn.Pool;
import bpmn.Secuence;
import bpmn.Subprocess;
import bpmn.SubprocessNonInterrupt;
import bpmn.Swimlane;
import bpmn.Throw;
import bpmn.TypeActivity;
import bpmn.TypeAssociation;
import bpmn.TypeBoundary;
import bpmn.TypeBoundaryNonInterrupt;
import bpmn.TypeCatch;
import bpmn.TypeConnectionSecuence;
import bpmn.TypeData;
import bpmn.TypeFinal;
import bpmn.TypeGateway;
import bpmn.TypeHighLevel;
import bpmn.TypeNatureActivityMaker;
import bpmn.TypePerformanceActivityMaker;
import bpmn.TypeSubprocess;
import bpmn.TypeSubprocessNonInterrupt;
import bpmn.TypeThrow;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNPackageImpl extends EPackageImpl implements BPMNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swimlaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secuenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprocessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprocessNonInterruptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryNonInterruptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceActivityMakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natureActivityMakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeConnectionSecuenceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeAssociationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeGatewayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeActivityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDataEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeNatureActivityMakerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typePerformanceActivityMakerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeSubprocessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeSubprocessNonInterruptEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeBoundaryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeHighLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeThrowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeFinalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeBoundaryNonInterruptEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeCatchEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bpmn.BPMNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BPMNPackageImpl() {
		super(eNS_URI, BPMNFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BPMNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BPMNPackage init() {
		if (isInited)
			return (BPMNPackage) EPackage.Registry.INSTANCE.getEPackage(BPMNPackage.eNS_URI);

		// Obtain or create and register package
		BPMNPackageImpl theBPMNPackage = (BPMNPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof BPMNPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new BPMNPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBPMNPackage.createPackageContents();

		// Initialize created meta-data
		theBPMNPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBPMNPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BPMNPackage.eNS_URI, theBPMNPackage);
		return theBPMNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLane() {
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLane_NameLane() {
		return (EAttribute) laneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_Figure() {
		return (EReference) laneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_Poolrelationlane() {
		return (EReference) laneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_Laneincludefigure() {
		return (EReference) laneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_Lanerelationswimline() {
		return (EReference) laneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLane_CreationDate() {
		return (EAttribute) laneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_To() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_From() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_CreationDate() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Name() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigure() {
		return figureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigure_Name() {
		return (EAttribute) figureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigure_Connection() {
		return (EReference) figureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigure_ConnectionSource() {
		return (EReference) figureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigure_Figurecontentslane() {
		return (EReference) figureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigure_CreationDate() {
		return (EAttribute) figureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigure_ConnectionTarget() {
		return (EReference) figureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwimlane() {
		return swimlaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwimlane_Lane() {
		return (EReference) swimlaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwimlane_Pool() {
		return (EReference) swimlaneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwimlane_NameSwimlane() {
		return (EAttribute) swimlaneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwimlane_Poolincludeswimlane() {
		return (EReference) swimlaneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwimlane_Laneincludeswimlane() {
		return (EReference) swimlaneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwimlane_CreationDate() {
		return (EAttribute) swimlaneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Type() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Nature() {
		return (EReference) activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Performance() {
		return (EReference) activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Natureactivitymaker() {
		return (EReference) activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Performanceactivitymaker() {
		return (EReference) activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Events() {
		return (EReference) activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGateway_Type() {
		return (EAttribute) gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Type() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Type() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecuence() {
		return secuenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecuence_Type() {
		return (EAttribute) secuenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPool() {
		return poolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPool_NamePool() {
		return (EAttribute) poolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_Swimlane() {
		return (EReference) poolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_Lanerelationpool() {
		return (EReference) poolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_Childpool() {
		return (EReference) poolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_Fatherpool() {
		return (EReference) poolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPool_CreationDate() {
		return (EAttribute) poolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMN() {
		return bpmnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMN_NameDiagram() {
		return (EAttribute) bpmnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMN_Swimlane() {
		return (EReference) bpmnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Activity() {
		return (EReference) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinal() {
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinal_Type() {
		return (EAttribute) finalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitial() {
		return initialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediate() {
		return intermediateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighLevel() {
		return highLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighLevel_Type() {
		return (EAttribute) highLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprocess() {
		return subprocessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubprocess_Type() {
		return (EAttribute) subprocessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprocessNonInterrupt() {
		return subprocessNonInterruptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubprocessNonInterrupt_Type() {
		return (EAttribute) subprocessNonInterruptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatch() {
		return catchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatch_Type() {
		return (EAttribute) catchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundary() {
		return boundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundary_Type() {
		return (EAttribute) boundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundaryNonInterrupt() {
		return boundaryNonInterruptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundaryNonInterrupt_Type() {
		return (EAttribute) boundaryNonInterruptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrow() {
		return throwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrow_Type() {
		return (EAttribute) throwEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceActivityMaker() {
		return performanceActivityMakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceActivityMaker_Type() {
		return (EAttribute) performanceActivityMakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformanceActivityMaker_Activity() {
		return (EReference) performanceActivityMakerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceActivityMaker_CreationDate() {
		return (EAttribute) performanceActivityMakerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNatureActivityMaker() {
		return natureActivityMakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNatureActivityMaker_Type() {
		return (EAttribute) natureActivityMakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNatureActivityMaker_Activity() {
		return (EReference) natureActivityMakerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNatureActivityMaker_CreationDate() {
		return (EAttribute) natureActivityMakerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Elements() {
		return (EReference) groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_ElementsGroup() {
		return (EReference) groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElements() {
		return elementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElements_Group() {
		return (EReference) elementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeConnectionSecuence() {
		return typeConnectionSecuenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeAssociation() {
		return typeAssociationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeGateway() {
		return typeGatewayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeActivity() {
		return typeActivityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeData() {
		return typeDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeNatureActivityMaker() {
		return typeNatureActivityMakerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypePerformanceActivityMaker() {
		return typePerformanceActivityMakerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeSubprocess() {
		return typeSubprocessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeSubprocessNonInterrupt() {
		return typeSubprocessNonInterruptEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeBoundary() {
		return typeBoundaryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeHighLevel() {
		return typeHighLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeThrow() {
		return typeThrowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeFinal() {
		return typeFinalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeBoundaryNonInterrupt() {
		return typeBoundaryNonInterruptEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeCatch() {
		return typeCatchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNFactory getBPMNFactory() {
		return (BPMNFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		laneEClass = createEClass(LANE);
		createEAttribute(laneEClass, LANE__NAME_LANE);
		createEReference(laneEClass, LANE__FIGURE);
		createEReference(laneEClass, LANE__POOLRELATIONLANE);
		createEReference(laneEClass, LANE__LANEINCLUDEFIGURE);
		createEReference(laneEClass, LANE__LANERELATIONSWIMLINE);
		createEAttribute(laneEClass, LANE__CREATION_DATE);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__NAME);
		createEReference(connectionEClass, CONNECTION__TO);
		createEReference(connectionEClass, CONNECTION__FROM);
		createEAttribute(connectionEClass, CONNECTION__CREATION_DATE);

		figureEClass = createEClass(FIGURE);
		createEAttribute(figureEClass, FIGURE__NAME);
		createEReference(figureEClass, FIGURE__CONNECTION);
		createEReference(figureEClass, FIGURE__CONNECTION_TARGET);
		createEReference(figureEClass, FIGURE__CONNECTION_SOURCE);
		createEReference(figureEClass, FIGURE__FIGURECONTENTSLANE);
		createEAttribute(figureEClass, FIGURE__CREATION_DATE);

		swimlaneEClass = createEClass(SWIMLANE);
		createEReference(swimlaneEClass, SWIMLANE__LANE);
		createEReference(swimlaneEClass, SWIMLANE__POOL);
		createEAttribute(swimlaneEClass, SWIMLANE__NAME_SWIMLANE);
		createEReference(swimlaneEClass, SWIMLANE__POOLINCLUDESWIMLANE);
		createEReference(swimlaneEClass, SWIMLANE__LANEINCLUDESWIMLANE);
		createEAttribute(swimlaneEClass, SWIMLANE__CREATION_DATE);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__TYPE);
		createEReference(activityEClass, ACTIVITY__NATURE);
		createEReference(activityEClass, ACTIVITY__PERFORMANCE);
		createEReference(activityEClass, ACTIVITY__NATUREACTIVITYMAKER);
		createEReference(activityEClass, ACTIVITY__PERFORMANCEACTIVITYMAKER);
		createEReference(activityEClass, ACTIVITY__EVENTS);

		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__TYPE);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__TYPE);

		messageEClass = createEClass(MESSAGE);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__TYPE);

		secuenceEClass = createEClass(SECUENCE);
		createEAttribute(secuenceEClass, SECUENCE__TYPE);

		poolEClass = createEClass(POOL);
		createEAttribute(poolEClass, POOL__NAME_POOL);
		createEReference(poolEClass, POOL__SWIMLANE);
		createEReference(poolEClass, POOL__LANERELATIONPOOL);
		createEReference(poolEClass, POOL__CHILDPOOL);
		createEReference(poolEClass, POOL__FATHERPOOL);
		createEAttribute(poolEClass, POOL__CREATION_DATE);

		bpmnEClass = createEClass(BPMN);
		createEAttribute(bpmnEClass, BPMN__NAME_DIAGRAM);
		createEReference(bpmnEClass, BPMN__SWIMLANE);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__ACTIVITY);

		finalEClass = createEClass(FINAL);
		createEAttribute(finalEClass, FINAL__TYPE);

		initialEClass = createEClass(INITIAL);

		intermediateEClass = createEClass(INTERMEDIATE);

		highLevelEClass = createEClass(HIGH_LEVEL);
		createEAttribute(highLevelEClass, HIGH_LEVEL__TYPE);

		subprocessEClass = createEClass(SUBPROCESS);
		createEAttribute(subprocessEClass, SUBPROCESS__TYPE);

		subprocessNonInterruptEClass = createEClass(SUBPROCESS_NON_INTERRUPT);
		createEAttribute(subprocessNonInterruptEClass, SUBPROCESS_NON_INTERRUPT__TYPE);

		catchEClass = createEClass(CATCH);
		createEAttribute(catchEClass, CATCH__TYPE);

		boundaryEClass = createEClass(BOUNDARY);
		createEAttribute(boundaryEClass, BOUNDARY__TYPE);

		boundaryNonInterruptEClass = createEClass(BOUNDARY_NON_INTERRUPT);
		createEAttribute(boundaryNonInterruptEClass, BOUNDARY_NON_INTERRUPT__TYPE);

		throwEClass = createEClass(THROW);
		createEAttribute(throwEClass, THROW__TYPE);

		performanceActivityMakerEClass = createEClass(PERFORMANCE_ACTIVITY_MAKER);
		createEAttribute(performanceActivityMakerEClass, PERFORMANCE_ACTIVITY_MAKER__TYPE);
		createEReference(performanceActivityMakerEClass, PERFORMANCE_ACTIVITY_MAKER__ACTIVITY);
		createEAttribute(performanceActivityMakerEClass, PERFORMANCE_ACTIVITY_MAKER__CREATION_DATE);

		natureActivityMakerEClass = createEClass(NATURE_ACTIVITY_MAKER);
		createEAttribute(natureActivityMakerEClass, NATURE_ACTIVITY_MAKER__TYPE);
		createEReference(natureActivityMakerEClass, NATURE_ACTIVITY_MAKER__ACTIVITY);
		createEAttribute(natureActivityMakerEClass, NATURE_ACTIVITY_MAKER__CREATION_DATE);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__ELEMENTS);
		createEReference(groupEClass, GROUP__ELEMENTS_GROUP);

		elementsEClass = createEClass(ELEMENTS);
		createEReference(elementsEClass, ELEMENTS__GROUP);

		// Create enums
		typeConnectionSecuenceEEnum = createEEnum(TYPE_CONNECTION_SECUENCE);
		typeAssociationEEnum = createEEnum(TYPE_ASSOCIATION);
		typeGatewayEEnum = createEEnum(TYPE_GATEWAY);
		typeActivityEEnum = createEEnum(TYPE_ACTIVITY);
		typeDataEEnum = createEEnum(TYPE_DATA);
		typeNatureActivityMakerEEnum = createEEnum(TYPE_NATURE_ACTIVITY_MAKER);
		typePerformanceActivityMakerEEnum = createEEnum(TYPE_PERFORMANCE_ACTIVITY_MAKER);
		typeSubprocessEEnum = createEEnum(TYPE_SUBPROCESS);
		typeSubprocessNonInterruptEEnum = createEEnum(TYPE_SUBPROCESS_NON_INTERRUPT);
		typeBoundaryEEnum = createEEnum(TYPE_BOUNDARY);
		typeHighLevelEEnum = createEEnum(TYPE_HIGH_LEVEL);
		typeThrowEEnum = createEEnum(TYPE_THROW);
		typeFinalEEnum = createEEnum(TYPE_FINAL);
		typeBoundaryNonInterruptEEnum = createEEnum(TYPE_BOUNDARY_NON_INTERRUPT);
		typeCatchEEnum = createEEnum(TYPE_CATCH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(this.getElements());
		gatewayEClass.getESuperTypes().add(this.getElements());
		dataEClass.getESuperTypes().add(this.getElements());
		messageEClass.getESuperTypes().add(this.getConnection());
		associationEClass.getESuperTypes().add(this.getConnection());
		secuenceEClass.getESuperTypes().add(this.getConnection());
		eventEClass.getESuperTypes().add(this.getElements());
		finalEClass.getESuperTypes().add(this.getEvent());
		initialEClass.getESuperTypes().add(this.getEvent());
		intermediateEClass.getESuperTypes().add(this.getEvent());
		highLevelEClass.getESuperTypes().add(this.getInitial());
		subprocessEClass.getESuperTypes().add(this.getInitial());
		subprocessNonInterruptEClass.getESuperTypes().add(this.getInitial());
		catchEClass.getESuperTypes().add(this.getIntermediate());
		boundaryEClass.getESuperTypes().add(this.getIntermediate());
		boundaryNonInterruptEClass.getESuperTypes().add(this.getIntermediate());
		throwEClass.getESuperTypes().add(this.getIntermediate());
		groupEClass.getESuperTypes().add(this.getFigure());
		elementsEClass.getESuperTypes().add(this.getFigure());

		// Initialize classes, features, and operations; add parameters
		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLane_NameLane(), ecorePackage.getEString(), "nameLane", null, 0, 1, Lane.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Figure(), this.getFigure(), null, "figure", null, 0, -1, Lane.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLane_Poolrelationlane(), this.getPool(), this.getPool_Lanerelationpool(), "poolrelationlane",
				null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Laneincludefigure(), this.getFigure(), this.getFigure_Figurecontentslane(),
				"laneincludefigure", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Lanerelationswimline(), this.getSwimlane(), this.getSwimlane_Laneincludeswimlane(),
				"lanerelationswimline", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_CreationDate(), ecorePackage.getEString(), "creationDate", null, 0, 1, Lane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_To(), this.getFigure(), this.getFigure_ConnectionTarget(), "to", null, 1, 1,
				Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_From(), this.getFigure(), this.getFigure_ConnectionSource(), "from", null, 1, 1,
				Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_CreationDate(), ecorePackage.getEString(), "creationDate", null, 0, 1,
				Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(figureEClass, Figure.class, "Figure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFigure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Figure.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigure_Connection(), this.getConnection(), null, "connection", null, 0, -1, Figure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigure_ConnectionTarget(), this.getConnection(), this.getConnection_To(), "connectionTarget",
				null, 0, -1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigure_ConnectionSource(), this.getConnection(), this.getConnection_From(),
				"connectionSource", null, 0, -1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigure_Figurecontentslane(), this.getLane(), this.getLane_Laneincludefigure(),
				"figurecontentslane", null, 1, 1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigure_CreationDate(), ecorePackage.getEString(), "creationDate", null, 0, 1, Figure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swimlaneEClass, Swimlane.class, "Swimlane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwimlane_Lane(), this.getLane(), null, "lane", null, 0, -1, Swimlane.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSwimlane_Pool(), this.getPool(), null, "pool", null, 0, -1, Swimlane.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSwimlane_NameSwimlane(), ecorePackage.getEString(), "nameSwimlane", null, 0, 1,
				Swimlane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSwimlane_Poolincludeswimlane(), this.getPool(), this.getPool_Swimlane(),
				"poolincludeswimlane", null, 0, -1, Swimlane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwimlane_Laneincludeswimlane(), this.getLane(), this.getLane_Lanerelationswimline(),
				"laneincludeswimlane", null, 0, -1, Swimlane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwimlane_CreationDate(), ecorePackage.getEString(), "creationDate", null, 0, 1,
				Swimlane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Type(), this.getTypeActivity(), "type", null, 0, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Nature(), this.getNatureActivityMaker(), null, "nature", null, 0, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Performance(), this.getPerformanceActivityMaker(), null, "performance", null, 0, 2,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Natureactivitymaker(), this.getNatureActivityMaker(),
				this.getNatureActivityMaker_Activity(), "natureactivitymaker", null, 0, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Performanceactivitymaker(), this.getPerformanceActivityMaker(),
				this.getPerformanceActivityMaker_Activity(), "performanceactivitymaker", null, 0, 2, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Events(), this.getEvent(), this.getEvent_Activity(), "events", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_Type(), this.getTypeGateway(), "type", null, 0, 1, Gateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Type(), this.getTypeData(), "type", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_Type(), this.getTypeAssociation(), "type", null, 0, 1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secuenceEClass, Secuence.class, "Secuence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecuence_Type(), this.getTypeConnectionSecuence(), "type", null, 0, 1, Secuence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolEClass, Pool.class, "Pool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPool_NamePool(), ecorePackage.getEString(), "namePool", null, 0, 1, Pool.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPool_Swimlane(), this.getSwimlane(), this.getSwimlane_Poolincludeswimlane(), "swimlane", null,
				1, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPool_Lanerelationpool(), this.getLane(), this.getLane_Poolrelationlane(), "lanerelationpool",
				null, 0, -1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPool_Childpool(), this.getPool(), this.getPool_Fatherpool(), "childpool", null, 0, -1,
				Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPool_Fatherpool(), this.getPool(), this.getPool_Childpool(), "fatherpool", null, 0, 1,
				Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPool_CreationDate(), ecorePackage.getEString(), "creationDate", null, 0, 1, Pool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnEClass, bpmn.BPMN.class, "BPMN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPMN_NameDiagram(), ecorePackage.getEString(), "nameDiagram", null, 0, 1, bpmn.BPMN.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMN_Swimlane(), this.getSwimlane(), null, "swimlane", null, 0, 1, bpmn.BPMN.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Activity(), this.getActivity(), this.getActivity_Events(), "activity", null, 0, 1,
				Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinal_Type(), this.getTypeFinal(), "type", null, 0, 1, Final.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialEClass, Initial.class, "Initial", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermediateEClass, Intermediate.class, "Intermediate", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(highLevelEClass, HighLevel.class, "HighLevel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHighLevel_Type(), this.getTypeHighLevel(), "type", null, 0, 1, HighLevel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprocessEClass, Subprocess.class, "Subprocess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubprocess_Type(), this.getTypeSubprocess(), "type", null, 0, 1, Subprocess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprocessNonInterruptEClass, SubprocessNonInterrupt.class, "SubprocessNonInterrupt", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubprocessNonInterrupt_Type(), this.getTypeSubprocessNonInterrupt(), "type", null, 0, 1,
				SubprocessNonInterrupt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catchEClass, Catch.class, "Catch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatch_Type(), this.getTypeCatch(), "type", null, 0, 1, Catch.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundaryEClass, Boundary.class, "Boundary", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundary_Type(), this.getTypeBoundary(), "type", null, 0, 1, Boundary.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundaryNonInterruptEClass, BoundaryNonInterrupt.class, "BoundaryNonInterrupt", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundaryNonInterrupt_Type(), this.getTypeBoundaryNonInterrupt(), "type", null, 0, 1,
				BoundaryNonInterrupt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throwEClass, Throw.class, "Throw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrow_Type(), this.getTypeThrow(), "type", null, 0, 1, Throw.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceActivityMakerEClass, PerformanceActivityMaker.class, "PerformanceActivityMaker",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformanceActivityMaker_Type(), this.getTypePerformanceActivityMaker(), "type", null, 0, 1,
				PerformanceActivityMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceActivityMaker_Activity(), this.getActivity(),
				this.getActivity_Performanceactivitymaker(), "activity", null, 1, 1, PerformanceActivityMaker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceActivityMaker_CreationDate(), ecorePackage.getEString(), "creationDate", null, 0,
				1, PerformanceActivityMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(natureActivityMakerEClass, NatureActivityMaker.class, "NatureActivityMaker", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNatureActivityMaker_Type(), this.getTypeNatureActivityMaker(), "type", null, 0, 1,
				NatureActivityMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNatureActivityMaker_Activity(), this.getActivity(), this.getActivity_Natureactivitymaker(),
				"activity", null, 1, 1, NatureActivityMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNatureActivityMaker_CreationDate(), ecorePackage.getEString(), "creationDate", null, 0, 1,
				NatureActivityMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Elements(), this.getElements(), null, "elements", null, 0, -1, Group.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_ElementsGroup(), this.getElements(), this.getElements_Group(), "elementsGroup", null, 0,
				-1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementsEClass, Elements.class, "Elements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElements_Group(), this.getGroup(), this.getGroup_ElementsGroup(), "group", null, 0, 1,
				Elements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeConnectionSecuenceEEnum, TypeConnectionSecuence.class, "TypeConnectionSecuence");
		addEEnumLiteral(typeConnectionSecuenceEEnum, TypeConnectionSecuence.NORMAL);
		addEEnumLiteral(typeConnectionSecuenceEEnum, TypeConnectionSecuence.DEFAULT);
		addEEnumLiteral(typeConnectionSecuenceEEnum, TypeConnectionSecuence.CONDITIONAL);

		initEEnum(typeAssociationEEnum, TypeAssociation.class, "TypeAssociation");
		addEEnumLiteral(typeAssociationEEnum, TypeAssociation.DIRECTED);
		addEEnumLiteral(typeAssociationEEnum, TypeAssociation.NON_DIRECTED);

		initEEnum(typeGatewayEEnum, TypeGateway.class, "TypeGateway");
		addEEnumLiteral(typeGatewayEEnum, TypeGateway.EXCLUSIVE);
		addEEnumLiteral(typeGatewayEEnum, TypeGateway.EVENT_BASED);
		addEEnumLiteral(typeGatewayEEnum, TypeGateway.PARALLEL);
		addEEnumLiteral(typeGatewayEEnum, TypeGateway.INCLUSIVE);
		addEEnumLiteral(typeGatewayEEnum, TypeGateway.EXCLUSIVE_EVENT_BASED);
		addEEnumLiteral(typeGatewayEEnum, TypeGateway.COMPLEX);
		addEEnumLiteral(typeGatewayEEnum, TypeGateway.PARALLEL_EVENT_BASED);

		initEEnum(typeActivityEEnum, TypeActivity.class, "TypeActivity");
		addEEnumLiteral(typeActivityEEnum, TypeActivity.TASK);
		addEEnumLiteral(typeActivityEEnum, TypeActivity.SUBPROCESS);
		addEEnumLiteral(typeActivityEEnum, TypeActivity.CALL);

		initEEnum(typeDataEEnum, TypeData.class, "TypeData");
		addEEnumLiteral(typeDataEEnum, TypeData.INPUT);
		addEEnumLiteral(typeDataEEnum, TypeData.OUTPUT);
		addEEnumLiteral(typeDataEEnum, TypeData.OBJECT);
		addEEnumLiteral(typeDataEEnum, TypeData.MESSAGE);
		addEEnumLiteral(typeDataEEnum, TypeData.DATASTORE);
		addEEnumLiteral(typeDataEEnum, TypeData.OBJECT_COLLECTION);
		addEEnumLiteral(typeDataEEnum, TypeData.TEXTANNOTATION);

		initEEnum(typeNatureActivityMakerEEnum, TypeNatureActivityMaker.class, "TypeNatureActivityMaker");
		addEEnumLiteral(typeNatureActivityMakerEEnum, TypeNatureActivityMaker.SEND);
		addEEnumLiteral(typeNatureActivityMakerEEnum, TypeNatureActivityMaker.RECEPTION);
		addEEnumLiteral(typeNatureActivityMakerEEnum, TypeNatureActivityMaker.USER_TASK);
		addEEnumLiteral(typeNatureActivityMakerEEnum, TypeNatureActivityMaker.MANUAL_TASK);
		addEEnumLiteral(typeNatureActivityMakerEEnum, TypeNatureActivityMaker.BUSINESS_RULE);
		addEEnumLiteral(typeNatureActivityMakerEEnum, TypeNatureActivityMaker.SERVICE_TASK);
		addEEnumLiteral(typeNatureActivityMakerEEnum, TypeNatureActivityMaker.SCRIPT);

		initEEnum(typePerformanceActivityMakerEEnum, TypePerformanceActivityMaker.class,
				"TypePerformanceActivityMaker");
		addEEnumLiteral(typePerformanceActivityMakerEEnum, TypePerformanceActivityMaker.SUBPROCESS);
		addEEnumLiteral(typePerformanceActivityMakerEEnum, TypePerformanceActivityMaker.CYCLE);
		addEEnumLiteral(typePerformanceActivityMakerEEnum, TypePerformanceActivityMaker.PARALLEL_MULTIPLE_INSTANCE);
		addEEnumLiteral(typePerformanceActivityMakerEEnum, TypePerformanceActivityMaker.SECUENCE_MULTIPLE_INSTANCE);
		addEEnumLiteral(typePerformanceActivityMakerEEnum, TypePerformanceActivityMaker.ADHOC);
		addEEnumLiteral(typePerformanceActivityMakerEEnum, TypePerformanceActivityMaker.COMPENSATION);

		initEEnum(typeSubprocessEEnum, TypeSubprocess.class, "TypeSubprocess");
		addEEnumLiteral(typeSubprocessEEnum, TypeSubprocess.MESSAGE);
		addEEnumLiteral(typeSubprocessEEnum, TypeSubprocess.TEMPORARY);
		addEEnumLiteral(typeSubprocessEEnum, TypeSubprocess.SCALABLE);
		addEEnumLiteral(typeSubprocessEEnum, TypeSubprocess.CONDITIONAL);
		addEEnumLiteral(typeSubprocessEEnum, TypeSubprocess.ERROR);
		addEEnumLiteral(typeSubprocessEEnum, TypeSubprocess.COMPENSATION);
		addEEnumLiteral(typeSubprocessEEnum, TypeSubprocess.SIGNAL);
		addEEnumLiteral(typeSubprocessEEnum, TypeSubprocess.MULTIPLE);
		addEEnumLiteral(typeSubprocessEEnum, TypeSubprocess.PARALLEL_MULTIPLE);

		initEEnum(typeSubprocessNonInterruptEEnum, TypeSubprocessNonInterrupt.class, "TypeSubprocessNonInterrupt");
		addEEnumLiteral(typeSubprocessNonInterruptEEnum, TypeSubprocessNonInterrupt.MESSAGE);
		addEEnumLiteral(typeSubprocessNonInterruptEEnum, TypeSubprocessNonInterrupt.TEMPORARY);
		addEEnumLiteral(typeSubprocessNonInterruptEEnum, TypeSubprocessNonInterrupt.SCALABLE);
		addEEnumLiteral(typeSubprocessNonInterruptEEnum, TypeSubprocessNonInterrupt.CONDITIONAL);
		addEEnumLiteral(typeSubprocessNonInterruptEEnum, TypeSubprocessNonInterrupt.SIGNAL);
		addEEnumLiteral(typeSubprocessNonInterruptEEnum, TypeSubprocessNonInterrupt.MULTIPLE);
		addEEnumLiteral(typeSubprocessNonInterruptEEnum, TypeSubprocessNonInterrupt.PARALLEL_MULTIPLE);

		initEEnum(typeBoundaryEEnum, TypeBoundary.class, "TypeBoundary");
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.MESSAGE);
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.TEMPORARY);
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.SCALABLE);
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.CONDITIONAL);
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.ERROR);
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.COMPENSATION);
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.SIGNAL);
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.MULTIPLE);
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.PARALLEL_MULTIPLE);
		addEEnumLiteral(typeBoundaryEEnum, TypeBoundary.CANCEL);

		initEEnum(typeHighLevelEEnum, TypeHighLevel.class, "TypeHighLevel");
		addEEnumLiteral(typeHighLevelEEnum, TypeHighLevel.SIMPLE);
		addEEnumLiteral(typeHighLevelEEnum, TypeHighLevel.MESSAGE);
		addEEnumLiteral(typeHighLevelEEnum, TypeHighLevel.TEMPORARY);
		addEEnumLiteral(typeHighLevelEEnum, TypeHighLevel.CONDITIONAL);
		addEEnumLiteral(typeHighLevelEEnum, TypeHighLevel.SIGNAL);
		addEEnumLiteral(typeHighLevelEEnum, TypeHighLevel.MULTIPLE);
		addEEnumLiteral(typeHighLevelEEnum, TypeHighLevel.PARALLEL_MULTIPLE);

		initEEnum(typeThrowEEnum, TypeThrow.class, "TypeThrow");
		addEEnumLiteral(typeThrowEEnum, TypeThrow.SIMPLE);
		addEEnumLiteral(typeThrowEEnum, TypeThrow.MESSAGE);
		addEEnumLiteral(typeThrowEEnum, TypeThrow.SCALABLE);
		addEEnumLiteral(typeThrowEEnum, TypeThrow.LINK);
		addEEnumLiteral(typeThrowEEnum, TypeThrow.COMPENSATION);
		addEEnumLiteral(typeThrowEEnum, TypeThrow.SIGNAL);
		addEEnumLiteral(typeThrowEEnum, TypeThrow.MULTIPLE);

		initEEnum(typeFinalEEnum, TypeFinal.class, "TypeFinal");
		addEEnumLiteral(typeFinalEEnum, TypeFinal.SIMPLE);
		addEEnumLiteral(typeFinalEEnum, TypeFinal.MESSAGE);
		addEEnumLiteral(typeFinalEEnum, TypeFinal.SCALABLE);
		addEEnumLiteral(typeFinalEEnum, TypeFinal.ERROR);
		addEEnumLiteral(typeFinalEEnum, TypeFinal.CANCEL);
		addEEnumLiteral(typeFinalEEnum, TypeFinal.COMPENSATION);
		addEEnumLiteral(typeFinalEEnum, TypeFinal.SIGNAL);
		addEEnumLiteral(typeFinalEEnum, TypeFinal.MULTIPLE);
		addEEnumLiteral(typeFinalEEnum, TypeFinal.FINAL);

		initEEnum(typeBoundaryNonInterruptEEnum, TypeBoundaryNonInterrupt.class, "TypeBoundaryNonInterrupt");
		addEEnumLiteral(typeBoundaryNonInterruptEEnum, TypeBoundaryNonInterrupt.MESSAGE);
		addEEnumLiteral(typeBoundaryNonInterruptEEnum, TypeBoundaryNonInterrupt.TEMPORARY);
		addEEnumLiteral(typeBoundaryNonInterruptEEnum, TypeBoundaryNonInterrupt.SCALABLE);
		addEEnumLiteral(typeBoundaryNonInterruptEEnum, TypeBoundaryNonInterrupt.CONDITIONAL);
		addEEnumLiteral(typeBoundaryNonInterruptEEnum, TypeBoundaryNonInterrupt.SIGNAL);
		addEEnumLiteral(typeBoundaryNonInterruptEEnum, TypeBoundaryNonInterrupt.MULTIPLE);
		addEEnumLiteral(typeBoundaryNonInterruptEEnum, TypeBoundaryNonInterrupt.PARALLEL_MULTIPLE);

		initEEnum(typeCatchEEnum, TypeCatch.class, "TypeCatch");
		addEEnumLiteral(typeCatchEEnum, TypeCatch.MESSAGE);
		addEEnumLiteral(typeCatchEEnum, TypeCatch.TEMPORARY);
		addEEnumLiteral(typeCatchEEnum, TypeCatch.CONDITIONAL);
		addEEnumLiteral(typeCatchEEnum, TypeCatch.SIGNAL);
		addEEnumLiteral(typeCatchEEnum, TypeCatch.MULTIPLE);
		addEEnumLiteral(typeCatchEEnum, TypeCatch.PARALLEL_MULTIPLE);
		addEEnumLiteral(typeCatchEEnum, TypeCatch.LINK);

		// Create resource
		createResource(eNS_URI);
	}

} //BPMNPackageImpl
