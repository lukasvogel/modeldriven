/**
 */
package interactionMetamodel.impl;

import interactionMetamodel.*;

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
public class InteractionMetamodelFactoryImpl extends EFactoryImpl implements InteractionMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionMetamodelFactory init() {
		try {
			InteractionMetamodelFactory theInteractionMetamodelFactory = (InteractionMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(InteractionMetamodelPackage.eNS_URI);
			if (theInteractionMetamodelFactory != null) {
				return theInteractionMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionMetamodelFactoryImpl() {
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
			case InteractionMetamodelPackage.LIFELINE: return createLifeline();
			case InteractionMetamodelPackage.MESSAGE: return createMessage();
			case InteractionMetamodelPackage.MESSAGE_OCCURENCE_SPECIFICATION: return createMessageOccurenceSpecification();
			case InteractionMetamodelPackage.EXECUTION_OCCURENCE_SPECIFICATION: return createExecutionOccurenceSpecification();
			case InteractionMetamodelPackage.STATE_INVARIANT: return createStateInvariant();
			case InteractionMetamodelPackage.INTERACTION: return createInteraction();
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
			case InteractionMetamodelPackage.MESSAGE_SORT:
				return createMessageSortFromString(eDataType, initialValue);
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
			case InteractionMetamodelPackage.MESSAGE_SORT:
				return convertMessageSortToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
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
	public MessageOccurenceSpecification createMessageOccurenceSpecification() {
		MessageOccurenceSpecificationImpl messageOccurenceSpecification = new MessageOccurenceSpecificationImpl();
		return messageOccurenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurenceSpecification createExecutionOccurenceSpecification() {
		ExecutionOccurenceSpecificationImpl executionOccurenceSpecification = new ExecutionOccurenceSpecificationImpl();
		return executionOccurenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant createStateInvariant() {
		StateInvariantImpl stateInvariant = new StateInvariantImpl();
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort createMessageSortFromString(EDataType eDataType, String initialValue) {
		MessageSort result = MessageSort.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionMetamodelPackage getInteractionMetamodelPackage() {
		return (InteractionMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionMetamodelPackage getPackage() {
		return InteractionMetamodelPackage.eINSTANCE;
	}

} //InteractionMetamodelFactoryImpl
