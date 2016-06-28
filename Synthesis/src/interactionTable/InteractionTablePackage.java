/**
 */
package interactionTable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see interactionTable.InteractionTableFactory
 * @model kind="package"
 * @generated
 */
public interface InteractionTablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interactionTable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "interactionTable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "elite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionTablePackage eINSTANCE = interactionTable.impl.InteractionTablePackageImpl.init();

	/**
	 * The meta object id for the '{@link interactionTable.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.CommunicationImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__RETURN = 0;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionTable.impl.UserCommunicationImpl <em>User Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.UserCommunicationImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getUserCommunication()
	 * @generated
	 */
	int USER_COMMUNICATION = 1;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_COMMUNICATION__RETURN = COMMUNICATION__RETURN;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_COMMUNICATION__MESSAGE = COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_COMMUNICATION_FEATURE_COUNT = COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_COMMUNICATION_OPERATION_COUNT = COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link interactionTable.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.StateImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionTable.impl.SystemCommunicationImpl <em>System Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.SystemCommunicationImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getSystemCommunication()
	 * @generated
	 */
	int SYSTEM_COMMUNICATION = 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMMUNICATION__RETURN = COMMUNICATION__RETURN;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMMUNICATION__MESSAGE = COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMMUNICATION__POST_STATE = COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pre State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMMUNICATION__PRE_STATE = COMMUNICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMMUNICATION_FEATURE_COUNT = COMMUNICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMMUNICATION_OPERATION_COUNT = COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link interactionTable.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.OperationImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionTable.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.ScenarioImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 5;

	/**
	 * The feature id for the '<em><b>Communications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__COMMUNICATIONS = 0;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionTable.impl.CommObjectImpl <em>Comm Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.CommObjectImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getCommObject()
	 * @generated
	 */
	int COMM_OBJECT = 6;

	/**
	 * The number of structural features of the '<em>Comm Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comm Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionTable.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.MessageImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SENDER = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionTable.impl.UserMessageImpl <em>User Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.UserMessageImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getUserMessage()
	 * @generated
	 */
	int USER_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MESSAGE__OPERATION = MESSAGE__OPERATION;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MESSAGE__SENDER = MESSAGE__SENDER;

	/**
	 * The number of structural features of the '<em>User Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link interactionTable.impl.SystemMessageImpl <em>System Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionTable.impl.SystemMessageImpl
	 * @see interactionTable.impl.InteractionTablePackageImpl#getSystemMessage()
	 * @generated
	 */
	int SYSTEM_MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MESSAGE__OPERATION = MESSAGE__OPERATION;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MESSAGE__SENDER = MESSAGE__SENDER;

	/**
	 * The number of structural features of the '<em>System Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link interactionTable.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see interactionTable.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the attribute '{@link interactionTable.Communication#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see interactionTable.Communication#getReturn()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Return();

	/**
	 * Returns the meta object for class '{@link interactionTable.UserCommunication <em>User Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Communication</em>'.
	 * @see interactionTable.UserCommunication
	 * @generated
	 */
	EClass getUserCommunication();

	/**
	 * Returns the meta object for the reference '{@link interactionTable.UserCommunication#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see interactionTable.UserCommunication#getMessage()
	 * @see #getUserCommunication()
	 * @generated
	 */
	EReference getUserCommunication_Message();

	/**
	 * Returns the meta object for class '{@link interactionTable.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see interactionTable.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link interactionTable.SystemCommunication <em>System Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Communication</em>'.
	 * @see interactionTable.SystemCommunication
	 * @generated
	 */
	EClass getSystemCommunication();

	/**
	 * Returns the meta object for the reference '{@link interactionTable.SystemCommunication#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see interactionTable.SystemCommunication#getMessage()
	 * @see #getSystemCommunication()
	 * @generated
	 */
	EReference getSystemCommunication_Message();

	/**
	 * Returns the meta object for the reference '{@link interactionTable.SystemCommunication#getPostState <em>Post State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post State</em>'.
	 * @see interactionTable.SystemCommunication#getPostState()
	 * @see #getSystemCommunication()
	 * @generated
	 */
	EReference getSystemCommunication_PostState();

	/**
	 * Returns the meta object for the reference '{@link interactionTable.SystemCommunication#getPreState <em>Pre State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre State</em>'.
	 * @see interactionTable.SystemCommunication#getPreState()
	 * @see #getSystemCommunication()
	 * @generated
	 */
	EReference getSystemCommunication_PreState();

	/**
	 * Returns the meta object for class '{@link interactionTable.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see interactionTable.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link interactionTable.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see interactionTable.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the reference list '{@link interactionTable.Scenario#getCommunications <em>Communications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communications</em>'.
	 * @see interactionTable.Scenario#getCommunications()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Communications();

	/**
	 * Returns the meta object for class '{@link interactionTable.CommObject <em>Comm Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Object</em>'.
	 * @see interactionTable.CommObject
	 * @generated
	 */
	EClass getCommObject();

	/**
	 * Returns the meta object for class '{@link interactionTable.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see interactionTable.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link interactionTable.Message#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see interactionTable.Message#getOperation()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Operation();

	/**
	 * Returns the meta object for the reference '{@link interactionTable.Message#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see interactionTable.Message#getSender()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Sender();

	/**
	 * Returns the meta object for class '{@link interactionTable.UserMessage <em>User Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Message</em>'.
	 * @see interactionTable.UserMessage
	 * @generated
	 */
	EClass getUserMessage();

	/**
	 * Returns the meta object for class '{@link interactionTable.SystemMessage <em>System Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Message</em>'.
	 * @see interactionTable.SystemMessage
	 * @generated
	 */
	EClass getSystemMessage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionTableFactory getInteractionTableFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link interactionTable.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.CommunicationImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__RETURN = eINSTANCE.getCommunication_Return();

		/**
		 * The meta object literal for the '{@link interactionTable.impl.UserCommunicationImpl <em>User Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.UserCommunicationImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getUserCommunication()
		 * @generated
		 */
		EClass USER_COMMUNICATION = eINSTANCE.getUserCommunication();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_COMMUNICATION__MESSAGE = eINSTANCE.getUserCommunication_Message();

		/**
		 * The meta object literal for the '{@link interactionTable.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.StateImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link interactionTable.impl.SystemCommunicationImpl <em>System Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.SystemCommunicationImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getSystemCommunication()
		 * @generated
		 */
		EClass SYSTEM_COMMUNICATION = eINSTANCE.getSystemCommunication();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMMUNICATION__MESSAGE = eINSTANCE.getSystemCommunication_Message();

		/**
		 * The meta object literal for the '<em><b>Post State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMMUNICATION__POST_STATE = eINSTANCE.getSystemCommunication_PostState();

		/**
		 * The meta object literal for the '<em><b>Pre State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMMUNICATION__PRE_STATE = eINSTANCE.getSystemCommunication_PreState();

		/**
		 * The meta object literal for the '{@link interactionTable.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.OperationImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link interactionTable.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.ScenarioImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Communications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__COMMUNICATIONS = eINSTANCE.getScenario_Communications();

		/**
		 * The meta object literal for the '{@link interactionTable.impl.CommObjectImpl <em>Comm Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.CommObjectImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getCommObject()
		 * @generated
		 */
		EClass COMM_OBJECT = eINSTANCE.getCommObject();

		/**
		 * The meta object literal for the '{@link interactionTable.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.MessageImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__OPERATION = eINSTANCE.getMessage_Operation();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SENDER = eINSTANCE.getMessage_Sender();

		/**
		 * The meta object literal for the '{@link interactionTable.impl.UserMessageImpl <em>User Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.UserMessageImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getUserMessage()
		 * @generated
		 */
		EClass USER_MESSAGE = eINSTANCE.getUserMessage();

		/**
		 * The meta object literal for the '{@link interactionTable.impl.SystemMessageImpl <em>System Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionTable.impl.SystemMessageImpl
		 * @see interactionTable.impl.InteractionTablePackageImpl#getSystemMessage()
		 * @generated
		 */
		EClass SYSTEM_MESSAGE = eINSTANCE.getSystemMessage();

	}

} //InteractionTablePackage
