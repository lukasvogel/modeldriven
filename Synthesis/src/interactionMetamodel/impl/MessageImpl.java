/**
 */
package interactionMetamodel.impl;

import interactionMetamodel.InteractionMetamodelPackage;
import interactionMetamodel.Message;
import interactionMetamodel.MessageOccurenceSpecification;
import interactionMetamodel.MessageSort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interactionMetamodel.impl.MessageImpl#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link interactionMetamodel.impl.MessageImpl#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link interactionMetamodel.impl.MessageImpl#getMessageSort <em>Message Sort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The cached value of the '{@link #getSendEvent() <em>Send Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendEvent()
	 * @generated
	 * @ordered
	 */
	protected MessageOccurenceSpecification sendEvent;

	/**
	 * The cached value of the '{@link #getReceiveEvent() <em>Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEvent()
	 * @generated
	 * @ordered
	 */
	protected MessageOccurenceSpecification receiveEvent;

	/**
	 * The default value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSort MESSAGE_SORT_EDEFAULT = MessageSort.SYNCH_CALL;

	/**
	 * The cached value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected MessageSort messageSort = MESSAGE_SORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionMetamodelPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOccurenceSpecification getSendEvent() {
		if (sendEvent != null && sendEvent.eIsProxy()) {
			InternalEObject oldSendEvent = (InternalEObject)sendEvent;
			sendEvent = (MessageOccurenceSpecification)eResolveProxy(oldSendEvent);
			if (sendEvent != oldSendEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionMetamodelPackage.MESSAGE__SEND_EVENT, oldSendEvent, sendEvent));
			}
		}
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOccurenceSpecification basicGetSendEvent() {
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendEvent(MessageOccurenceSpecification newSendEvent) {
		MessageOccurenceSpecification oldSendEvent = sendEvent;
		sendEvent = newSendEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionMetamodelPackage.MESSAGE__SEND_EVENT, oldSendEvent, sendEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOccurenceSpecification getReceiveEvent() {
		if (receiveEvent != null && receiveEvent.eIsProxy()) {
			InternalEObject oldReceiveEvent = (InternalEObject)receiveEvent;
			receiveEvent = (MessageOccurenceSpecification)eResolveProxy(oldReceiveEvent);
			if (receiveEvent != oldReceiveEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionMetamodelPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, receiveEvent));
			}
		}
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOccurenceSpecification basicGetReceiveEvent() {
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveEvent(MessageOccurenceSpecification newReceiveEvent) {
		MessageOccurenceSpecification oldReceiveEvent = receiveEvent;
		receiveEvent = newReceiveEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionMetamodelPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, receiveEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort getMessageSort() {
		return messageSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSort(MessageSort newMessageSort) {
		MessageSort oldMessageSort = messageSort;
		messageSort = newMessageSort == null ? MESSAGE_SORT_EDEFAULT : newMessageSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionMetamodelPackage.MESSAGE__MESSAGE_SORT, oldMessageSort, messageSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionMetamodelPackage.MESSAGE__SEND_EVENT:
				if (resolve) return getSendEvent();
				return basicGetSendEvent();
			case InteractionMetamodelPackage.MESSAGE__RECEIVE_EVENT:
				if (resolve) return getReceiveEvent();
				return basicGetReceiveEvent();
			case InteractionMetamodelPackage.MESSAGE__MESSAGE_SORT:
				return getMessageSort();
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
			case InteractionMetamodelPackage.MESSAGE__SEND_EVENT:
				setSendEvent((MessageOccurenceSpecification)newValue);
				return;
			case InteractionMetamodelPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent((MessageOccurenceSpecification)newValue);
				return;
			case InteractionMetamodelPackage.MESSAGE__MESSAGE_SORT:
				setMessageSort((MessageSort)newValue);
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
			case InteractionMetamodelPackage.MESSAGE__SEND_EVENT:
				setSendEvent((MessageOccurenceSpecification)null);
				return;
			case InteractionMetamodelPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent((MessageOccurenceSpecification)null);
				return;
			case InteractionMetamodelPackage.MESSAGE__MESSAGE_SORT:
				setMessageSort(MESSAGE_SORT_EDEFAULT);
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
			case InteractionMetamodelPackage.MESSAGE__SEND_EVENT:
				return sendEvent != null;
			case InteractionMetamodelPackage.MESSAGE__RECEIVE_EVENT:
				return receiveEvent != null;
			case InteractionMetamodelPackage.MESSAGE__MESSAGE_SORT:
				return messageSort != MESSAGE_SORT_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messageSort: ");
		result.append(messageSort);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
