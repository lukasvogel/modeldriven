/**
 */
package interactionMetamodel.impl;

import interactionMetamodel.InteractionMetamodelPackage;
import interactionMetamodel.Lifeline;
import interactionMetamodel.MessageOccurenceSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Occurence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interactionMetamodel.impl.MessageOccurenceSpecificationImpl#getLifeline <em>Lifeline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageOccurenceSpecificationImpl extends MinimalEObjectImpl.Container implements MessageOccurenceSpecification {
	/**
	 * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline lifeline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageOccurenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionMetamodelPackage.Literals.MESSAGE_OCCURENCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getLifeline() {
		if (lifeline != null && lifeline.eIsProxy()) {
			InternalEObject oldLifeline = (InternalEObject)lifeline;
			lifeline = (Lifeline)eResolveProxy(oldLifeline);
			if (lifeline != oldLifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionMetamodelPackage.MESSAGE_OCCURENCE_SPECIFICATION__LIFELINE, oldLifeline, lifeline));
			}
		}
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetLifeline() {
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeline(Lifeline newLifeline) {
		Lifeline oldLifeline = lifeline;
		lifeline = newLifeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionMetamodelPackage.MESSAGE_OCCURENCE_SPECIFICATION__LIFELINE, oldLifeline, lifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionMetamodelPackage.MESSAGE_OCCURENCE_SPECIFICATION__LIFELINE:
				if (resolve) return getLifeline();
				return basicGetLifeline();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionMetamodelPackage.MESSAGE_OCCURENCE_SPECIFICATION__LIFELINE:
				setLifeline((Lifeline)newValue);
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
			case InteractionMetamodelPackage.MESSAGE_OCCURENCE_SPECIFICATION__LIFELINE:
				setLifeline((Lifeline)null);
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
			case InteractionMetamodelPackage.MESSAGE_OCCURENCE_SPECIFICATION__LIFELINE:
				return lifeline != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageOccurenceSpecificationImpl
