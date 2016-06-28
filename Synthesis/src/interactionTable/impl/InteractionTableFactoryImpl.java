/**
 */
package interactionTable.impl;

import interactionTable.*;

import org.eclipse.emf.ecore.EClass;
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
public class InteractionTableFactoryImpl extends EFactoryImpl implements InteractionTableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionTableFactory init() {
		try {
			InteractionTableFactory theInteractionTableFactory = (InteractionTableFactory)EPackage.Registry.INSTANCE.getEFactory(InteractionTablePackage.eNS_URI);
			if (theInteractionTableFactory != null) {
				return theInteractionTableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionTableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTableFactoryImpl() {
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
			case InteractionTablePackage.COMMUNICATION: return createCommunication();
			case InteractionTablePackage.USER_COMMUNICATION: return createUserCommunication();
			case InteractionTablePackage.STATE: return createState();
			case InteractionTablePackage.SYSTEM_COMMUNICATION: return createSystemCommunication();
			case InteractionTablePackage.OPERATION: return createOperation();
			case InteractionTablePackage.SCENARIO: return createScenario();
			case InteractionTablePackage.COMM_OBJECT: return createCommObject();
			case InteractionTablePackage.USER_MESSAGE: return createUserMessage();
			case InteractionTablePackage.SYSTEM_MESSAGE: return createSystemMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserCommunication createUserCommunication() {
		UserCommunicationImpl userCommunication = new UserCommunicationImpl();
		return userCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCommunication createSystemCommunication() {
		SystemCommunicationImpl systemCommunication = new SystemCommunicationImpl();
		return systemCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommObject createCommObject() {
		CommObjectImpl commObject = new CommObjectImpl();
		return commObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMessage createUserMessage() {
		UserMessageImpl userMessage = new UserMessageImpl();
		return userMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMessage createSystemMessage() {
		SystemMessageImpl systemMessage = new SystemMessageImpl();
		return systemMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTablePackage getInteractionTablePackage() {
		return (InteractionTablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionTablePackage getPackage() {
		return InteractionTablePackage.eINSTANCE;
	}

} //InteractionTableFactoryImpl
