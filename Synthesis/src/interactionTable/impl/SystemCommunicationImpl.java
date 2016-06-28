/**
 */
package interactionTable.impl;

import interactionTable.InteractionTablePackage;
import interactionTable.State;
import interactionTable.SystemCommunication;
import interactionTable.SystemMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interactionTable.impl.SystemCommunicationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link interactionTable.impl.SystemCommunicationImpl#getPostState <em>Post State</em>}</li>
 *   <li>{@link interactionTable.impl.SystemCommunicationImpl#getPreState <em>Pre State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemCommunicationImpl extends CommunicationImpl implements SystemCommunication {
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected SystemMessage message;

	/**
	 * The cached value of the '{@link #getPostState() <em>Post State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostState()
	 * @generated
	 * @ordered
	 */
	protected State postState;

	/**
	 * The cached value of the '{@link #getPreState() <em>Pre State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreState()
	 * @generated
	 * @ordered
	 */
	protected State preState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionTablePackage.Literals.SYSTEM_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMessage getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (SystemMessage)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionTablePackage.SYSTEM_COMMUNICATION__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMessage basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(SystemMessage newMessage) {
		SystemMessage oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionTablePackage.SYSTEM_COMMUNICATION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getPostState() {
		if (postState != null && postState.eIsProxy()) {
			InternalEObject oldPostState = (InternalEObject)postState;
			postState = (State)eResolveProxy(oldPostState);
			if (postState != oldPostState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionTablePackage.SYSTEM_COMMUNICATION__POST_STATE, oldPostState, postState));
			}
		}
		return postState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetPostState() {
		return postState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostState(State newPostState) {
		State oldPostState = postState;
		postState = newPostState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionTablePackage.SYSTEM_COMMUNICATION__POST_STATE, oldPostState, postState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getPreState() {
		if (preState != null && preState.eIsProxy()) {
			InternalEObject oldPreState = (InternalEObject)preState;
			preState = (State)eResolveProxy(oldPreState);
			if (preState != oldPreState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionTablePackage.SYSTEM_COMMUNICATION__PRE_STATE, oldPreState, preState));
			}
		}
		return preState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetPreState() {
		return preState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreState(State newPreState) {
		State oldPreState = preState;
		preState = newPreState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionTablePackage.SYSTEM_COMMUNICATION__PRE_STATE, oldPreState, preState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionTablePackage.SYSTEM_COMMUNICATION__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
			case InteractionTablePackage.SYSTEM_COMMUNICATION__POST_STATE:
				if (resolve) return getPostState();
				return basicGetPostState();
			case InteractionTablePackage.SYSTEM_COMMUNICATION__PRE_STATE:
				if (resolve) return getPreState();
				return basicGetPreState();
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
			case InteractionTablePackage.SYSTEM_COMMUNICATION__MESSAGE:
				setMessage((SystemMessage)newValue);
				return;
			case InteractionTablePackage.SYSTEM_COMMUNICATION__POST_STATE:
				setPostState((State)newValue);
				return;
			case InteractionTablePackage.SYSTEM_COMMUNICATION__PRE_STATE:
				setPreState((State)newValue);
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
			case InteractionTablePackage.SYSTEM_COMMUNICATION__MESSAGE:
				setMessage((SystemMessage)null);
				return;
			case InteractionTablePackage.SYSTEM_COMMUNICATION__POST_STATE:
				setPostState((State)null);
				return;
			case InteractionTablePackage.SYSTEM_COMMUNICATION__PRE_STATE:
				setPreState((State)null);
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
			case InteractionTablePackage.SYSTEM_COMMUNICATION__MESSAGE:
				return message != null;
			case InteractionTablePackage.SYSTEM_COMMUNICATION__POST_STATE:
				return postState != null;
			case InteractionTablePackage.SYSTEM_COMMUNICATION__PRE_STATE:
				return preState != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemCommunicationImpl
