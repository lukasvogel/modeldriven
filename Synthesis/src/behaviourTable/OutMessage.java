/**
 */
package behaviourTable;

import interactionTable.CommObject;
import interactionTable.Operation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourTable.OutMessage#getOperation <em>Operation</em>}</li>
 *   <li>{@link behaviourTable.OutMessage#getReturn <em>Return</em>}</li>
 *   <li>{@link behaviourTable.OutMessage#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see behaviourTable.BehaviourTablePackage#getOutMessage()
 * @model
 * @generated
 */
public interface OutMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see behaviourTable.BehaviourTablePackage#getOutMessage_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link behaviourTable.OutMessage#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

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
	 * @see behaviourTable.BehaviourTablePackage#getOutMessage_Return()
	 * @model
	 * @generated
	 */
	String getReturn();

	/**
	 * Sets the value of the '{@link behaviourTable.OutMessage#getReturn <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' attribute.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(CommObject)
	 * @see behaviourTable.BehaviourTablePackage#getOutMessage_Object()
	 * @model required="true"
	 * @generated
	 */
	CommObject getObject();

	/**
	 * Sets the value of the '{@link behaviourTable.OutMessage#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(CommObject value);

} // OutMessage
