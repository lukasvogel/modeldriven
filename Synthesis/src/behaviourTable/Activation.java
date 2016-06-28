/**
 */
package behaviourTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourTable.Activation#getReturn <em>Return</em>}</li>
 *   <li>{@link behaviourTable.Activation#getOutMessages <em>Out Messages</em>}</li>
 * </ul>
 *
 * @see behaviourTable.BehaviourTablePackage#getActivation()
 * @model
 * @generated
 */
public interface Activation extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' attribute.
	 * @see #setReturn(String)
	 * @see behaviourTable.BehaviourTablePackage#getActivation_Return()
	 * @model
	 * @generated
	 */
	String getReturn();

	/**
	 * Sets the value of the '{@link behaviourTable.Activation#getReturn <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' attribute.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(String value);

	/**
	 * Returns the value of the '<em><b>Out Messages</b></em>' reference list.
	 * The list contents are of type {@link behaviourTable.OutMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Messages</em>' reference list.
	 * @see behaviourTable.BehaviourTablePackage#getActivation_OutMessages()
	 * @model
	 * @generated
	 */
	EList<OutMessage> getOutMessages();

} // Activation
