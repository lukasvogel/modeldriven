/**
 */
package behaviourTable.impl;

import behaviourTable.Activation;
import behaviourTable.BehaviourTablePackage;
import behaviourTable.OutMessage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourTable.impl.ActivationImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link behaviourTable.impl.ActivationImpl#getOutMessages <em>Out Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivationImpl extends MinimalEObjectImpl.Container implements Activation {
	/**
	 * The default value of the '{@link #getReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected String return_ = RETURN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutMessages() <em>Out Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<OutMessage> outMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourTablePackage.Literals.ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(String newReturn) {
		String oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTablePackage.ACTIVATION__RETURN, oldReturn, return_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutMessage> getOutMessages() {
		if (outMessages == null) {
			outMessages = new EObjectResolvingEList<OutMessage>(OutMessage.class, this, BehaviourTablePackage.ACTIVATION__OUT_MESSAGES);
		}
		return outMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourTablePackage.ACTIVATION__RETURN:
				return getReturn();
			case BehaviourTablePackage.ACTIVATION__OUT_MESSAGES:
				return getOutMessages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourTablePackage.ACTIVATION__RETURN:
				setReturn((String)newValue);
				return;
			case BehaviourTablePackage.ACTIVATION__OUT_MESSAGES:
				getOutMessages().clear();
				getOutMessages().addAll((Collection<? extends OutMessage>)newValue);
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
			case BehaviourTablePackage.ACTIVATION__RETURN:
				setReturn(RETURN_EDEFAULT);
				return;
			case BehaviourTablePackage.ACTIVATION__OUT_MESSAGES:
				getOutMessages().clear();
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
			case BehaviourTablePackage.ACTIVATION__RETURN:
				return RETURN_EDEFAULT == null ? return_ != null : !RETURN_EDEFAULT.equals(return_);
			case BehaviourTablePackage.ACTIVATION__OUT_MESSAGES:
				return outMessages != null && !outMessages.isEmpty();
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
		result.append(" (return: ");
		result.append(return_);
		result.append(')');
		return result.toString();
	}

} //ActivationImpl
