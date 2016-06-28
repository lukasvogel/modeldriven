/**
 */
package behaviourTable.impl;

import behaviourTable.Activation;
import behaviourTable.Behaviour;
import behaviourTable.BehaviourTablePackage;

import interactionTable.Operation;
import interactionTable.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourTable.impl.BehaviourImpl#getPreState <em>Pre State</em>}</li>
 *   <li>{@link behaviourTable.impl.BehaviourImpl#getPostState <em>Post State</em>}</li>
 *   <li>{@link behaviourTable.impl.BehaviourImpl#getInMessage <em>In Message</em>}</li>
 *   <li>{@link behaviourTable.impl.BehaviourImpl#getActivation <em>Activation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourImpl extends MinimalEObjectImpl.Container implements Behaviour {
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
	 * The cached value of the '{@link #getPostState() <em>Post State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostState()
	 * @generated
	 * @ordered
	 */
	protected State postState;

	/**
	 * The cached value of the '{@link #getInMessage() <em>In Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMessage()
	 * @generated
	 * @ordered
	 */
	protected Operation inMessage;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected Activation activation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourTablePackage.Literals.BEHAVIOUR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourTablePackage.BEHAVIOUR__PRE_STATE, oldPreState, preState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTablePackage.BEHAVIOUR__PRE_STATE, oldPreState, preState));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourTablePackage.BEHAVIOUR__POST_STATE, oldPostState, postState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTablePackage.BEHAVIOUR__POST_STATE, oldPostState, postState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getInMessage() {
		if (inMessage != null && inMessage.eIsProxy()) {
			InternalEObject oldInMessage = (InternalEObject)inMessage;
			inMessage = (Operation)eResolveProxy(oldInMessage);
			if (inMessage != oldInMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourTablePackage.BEHAVIOUR__IN_MESSAGE, oldInMessage, inMessage));
			}
		}
		return inMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetInMessage() {
		return inMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMessage(Operation newInMessage) {
		Operation oldInMessage = inMessage;
		inMessage = newInMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTablePackage.BEHAVIOUR__IN_MESSAGE, oldInMessage, inMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation getActivation() {
		if (activation != null && activation.eIsProxy()) {
			InternalEObject oldActivation = (InternalEObject)activation;
			activation = (Activation)eResolveProxy(oldActivation);
			if (activation != oldActivation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourTablePackage.BEHAVIOUR__ACTIVATION, oldActivation, activation));
			}
		}
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation basicGetActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation(Activation newActivation) {
		Activation oldActivation = activation;
		activation = newActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTablePackage.BEHAVIOUR__ACTIVATION, oldActivation, activation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourTablePackage.BEHAVIOUR__PRE_STATE:
				if (resolve) return getPreState();
				return basicGetPreState();
			case BehaviourTablePackage.BEHAVIOUR__POST_STATE:
				if (resolve) return getPostState();
				return basicGetPostState();
			case BehaviourTablePackage.BEHAVIOUR__IN_MESSAGE:
				if (resolve) return getInMessage();
				return basicGetInMessage();
			case BehaviourTablePackage.BEHAVIOUR__ACTIVATION:
				if (resolve) return getActivation();
				return basicGetActivation();
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
			case BehaviourTablePackage.BEHAVIOUR__PRE_STATE:
				setPreState((State)newValue);
				return;
			case BehaviourTablePackage.BEHAVIOUR__POST_STATE:
				setPostState((State)newValue);
				return;
			case BehaviourTablePackage.BEHAVIOUR__IN_MESSAGE:
				setInMessage((Operation)newValue);
				return;
			case BehaviourTablePackage.BEHAVIOUR__ACTIVATION:
				setActivation((Activation)newValue);
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
			case BehaviourTablePackage.BEHAVIOUR__PRE_STATE:
				setPreState((State)null);
				return;
			case BehaviourTablePackage.BEHAVIOUR__POST_STATE:
				setPostState((State)null);
				return;
			case BehaviourTablePackage.BEHAVIOUR__IN_MESSAGE:
				setInMessage((Operation)null);
				return;
			case BehaviourTablePackage.BEHAVIOUR__ACTIVATION:
				setActivation((Activation)null);
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
			case BehaviourTablePackage.BEHAVIOUR__PRE_STATE:
				return preState != null;
			case BehaviourTablePackage.BEHAVIOUR__POST_STATE:
				return postState != null;
			case BehaviourTablePackage.BEHAVIOUR__IN_MESSAGE:
				return inMessage != null;
			case BehaviourTablePackage.BEHAVIOUR__ACTIVATION:
				return activation != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviourImpl
