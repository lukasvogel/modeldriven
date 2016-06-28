/**
 */
package interactionTable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactionTable.UserCommunication#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see interactionTable.InteractionTablePackage#getUserCommunication()
 * @model
 * @generated
 */
public interface UserCommunication extends Communication {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(UserMessage)
	 * @see interactionTable.InteractionTablePackage#getUserCommunication_Message()
	 * @model required="true"
	 * @generated
	 */
	UserMessage getMessage();

	/**
	 * Sets the value of the '{@link interactionTable.UserCommunication#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(UserMessage value);

} // UserCommunication
