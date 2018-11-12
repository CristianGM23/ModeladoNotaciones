/**
 */
package bpmn.impl;

import bpmn.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNFactoryImpl extends EFactoryImpl implements BPMNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPMNFactory init() {
		try {
			BPMNFactory theBPMNFactory = (BPMNFactory) EPackage.Registry.INSTANCE.getEFactory(BPMNPackage.eNS_URI);
			if (theBPMNFactory != null) {
				return theBPMNFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPMNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BPMNPackage.LANE:
			return createLane();
		case BPMNPackage.CONNECTION:
			return createConnection();
		case BPMNPackage.SWIMLANE:
			return createSwimlane();
		case BPMNPackage.ACTIVITY:
			return createActivity();
		case BPMNPackage.GATEWAY:
			return createGateway();
		case BPMNPackage.DATA:
			return createData();
		case BPMNPackage.MESSAGE:
			return createMessage();
		case BPMNPackage.ASSOCIATION:
			return createAssociation();
		case BPMNPackage.SECUENCE:
			return createSecuence();
		case BPMNPackage.POOL:
			return createPool();
		case BPMNPackage.BPMN:
			return createBPMN();
		case BPMNPackage.FINAL:
			return createFinal();
		case BPMNPackage.HIGH_LEVEL:
			return createHighLevel();
		case BPMNPackage.SUBPROCESS:
			return createSubprocess();
		case BPMNPackage.SUBPROCESS_NON_INTERRUPT:
			return createSubprocessNonInterrupt();
		case BPMNPackage.CATCH:
			return createCatch();
		case BPMNPackage.BOUNDARY:
			return createBoundary();
		case BPMNPackage.BOUNDARY_NON_INTERRUPT:
			return createBoundaryNonInterrupt();
		case BPMNPackage.THROW:
			return createThrow();
		case BPMNPackage.PERFORMANCE_ACTIVITY_MAKER:
			return createPerformanceActivityMaker();
		case BPMNPackage.NATURE_ACTIVITY_MAKER:
			return createNatureActivityMaker();
		case BPMNPackage.GROUP:
			return createGroup();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BPMNPackage.TYPE_CONNECTION_SECUENCE:
			return createTypeConnectionSecuenceFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_ASSOCIATION:
			return createTypeAssociationFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_GATEWAY:
			return createTypeGatewayFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_ACTIVITY:
			return createTypeActivityFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_DATA:
			return createTypeDataFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_NATURE_ACTIVITY_MAKER:
			return createTypeNatureActivityMakerFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_PERFORMANCE_ACTIVITY_MAKER:
			return createTypePerformanceActivityMakerFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_SUBPROCESS:
			return createTypeSubprocessFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_SUBPROCESS_NON_INTERRUPT:
			return createTypeSubprocessNonInterruptFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_BOUNDARY:
			return createTypeBoundaryFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_HIGH_LEVEL:
			return createTypeHighLevelFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_THROW:
			return createTypeThrowFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_FINAL:
			return createTypeFinalFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_BOUNDARY_NON_INTERRUPT:
			return createTypeBoundaryNonInterruptFromString(eDataType, initialValue);
		case BPMNPackage.TYPE_CATCH:
			return createTypeCatchFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BPMNPackage.TYPE_CONNECTION_SECUENCE:
			return convertTypeConnectionSecuenceToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_ASSOCIATION:
			return convertTypeAssociationToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_GATEWAY:
			return convertTypeGatewayToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_ACTIVITY:
			return convertTypeActivityToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_DATA:
			return convertTypeDataToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_NATURE_ACTIVITY_MAKER:
			return convertTypeNatureActivityMakerToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_PERFORMANCE_ACTIVITY_MAKER:
			return convertTypePerformanceActivityMakerToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_SUBPROCESS:
			return convertTypeSubprocessToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_SUBPROCESS_NON_INTERRUPT:
			return convertTypeSubprocessNonInterruptToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_BOUNDARY:
			return convertTypeBoundaryToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_HIGH_LEVEL:
			return convertTypeHighLevelToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_THROW:
			return convertTypeThrowToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_FINAL:
			return convertTypeFinalToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_BOUNDARY_NON_INTERRUPT:
			return convertTypeBoundaryNonInterruptToString(eDataType, instanceValue);
		case BPMNPackage.TYPE_CATCH:
			return convertTypeCatchToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swimlane createSwimlane() {
		SwimlaneImpl swimlane = new SwimlaneImpl();
		return swimlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secuence createSecuence() {
		SecuenceImpl secuence = new SecuenceImpl();
		return secuence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool createPool() {
		PoolImpl pool = new PoolImpl();
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN createBPMN() {
		BPMNImpl bpmn = new BPMNImpl();
		return bpmn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final createFinal() {
		FinalImpl final_ = new FinalImpl();
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevel createHighLevel() {
		HighLevelImpl highLevel = new HighLevelImpl();
		return highLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subprocess createSubprocess() {
		SubprocessImpl subprocess = new SubprocessImpl();
		return subprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprocessNonInterrupt createSubprocessNonInterrupt() {
		SubprocessNonInterruptImpl subprocessNonInterrupt = new SubprocessNonInterruptImpl();
		return subprocessNonInterrupt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catch createCatch() {
		CatchImpl catch_ = new CatchImpl();
		return catch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary createBoundary() {
		BoundaryImpl boundary = new BoundaryImpl();
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryNonInterrupt createBoundaryNonInterrupt() {
		BoundaryNonInterruptImpl boundaryNonInterrupt = new BoundaryNonInterruptImpl();
		return boundaryNonInterrupt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throw createThrow() {
		ThrowImpl throw_ = new ThrowImpl();
		return throw_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceActivityMaker createPerformanceActivityMaker() {
		PerformanceActivityMakerImpl performanceActivityMaker = new PerformanceActivityMakerImpl();
		return performanceActivityMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureActivityMaker createNatureActivityMaker() {
		NatureActivityMakerImpl natureActivityMaker = new NatureActivityMakerImpl();
		return natureActivityMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConnectionSecuence createTypeConnectionSecuenceFromString(EDataType eDataType, String initialValue) {
		TypeConnectionSecuence result = TypeConnectionSecuence.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeConnectionSecuenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation createTypeAssociationFromString(EDataType eDataType, String initialValue) {
		TypeAssociation result = TypeAssociation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAssociationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGateway createTypeGatewayFromString(EDataType eDataType, String initialValue) {
		TypeGateway result = TypeGateway.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeGatewayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeActivity createTypeActivityFromString(EDataType eDataType, String initialValue) {
		TypeActivity result = TypeActivity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeActivityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeData createTypeDataFromString(EDataType eDataType, String initialValue) {
		TypeData result = TypeData.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNatureActivityMaker createTypeNatureActivityMakerFromString(EDataType eDataType, String initialValue) {
		TypeNatureActivityMaker result = TypeNatureActivityMaker.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNatureActivityMakerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePerformanceActivityMaker createTypePerformanceActivityMakerFromString(EDataType eDataType,
			String initialValue) {
		TypePerformanceActivityMaker result = TypePerformanceActivityMaker.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypePerformanceActivityMakerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSubprocess createTypeSubprocessFromString(EDataType eDataType, String initialValue) {
		TypeSubprocess result = TypeSubprocess.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeSubprocessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSubprocessNonInterrupt createTypeSubprocessNonInterruptFromString(EDataType eDataType,
			String initialValue) {
		TypeSubprocessNonInterrupt result = TypeSubprocessNonInterrupt.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeSubprocessNonInterruptToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeBoundary createTypeBoundaryFromString(EDataType eDataType, String initialValue) {
		TypeBoundary result = TypeBoundary.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeBoundaryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeHighLevel createTypeHighLevelFromString(EDataType eDataType, String initialValue) {
		TypeHighLevel result = TypeHighLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeHighLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeThrow createTypeThrowFromString(EDataType eDataType, String initialValue) {
		TypeThrow result = TypeThrow.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeThrowToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFinal createTypeFinalFromString(EDataType eDataType, String initialValue) {
		TypeFinal result = TypeFinal.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeFinalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeBoundaryNonInterrupt createTypeBoundaryNonInterruptFromString(EDataType eDataType, String initialValue) {
		TypeBoundaryNonInterrupt result = TypeBoundaryNonInterrupt.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeBoundaryNonInterruptToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCatch createTypeCatchFromString(EDataType eDataType, String initialValue) {
		TypeCatch result = TypeCatch.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeCatchToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNPackage getBPMNPackage() {
		return (BPMNPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BPMNPackage getPackage() {
		return BPMNPackage.eINSTANCE;
	}

} //BPMNFactoryImpl
