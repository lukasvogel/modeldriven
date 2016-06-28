/**
 */
package interactionTable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactionTable.SystemCommunication#getMessage <em>Message</em>}</li>
 *   <li>{@link interactionTable.SystemCommunication#getPostState <em>Post State</em>}</li>
 *   <li>{@link interactionTable.SystemCommunication#getPreState <em>Pre State</em>}</li>
 * </ul>
 *
 * @see interactionTable.InteractionTablePackage#getSystemCommunication()
 * @model
 * @generated
 */
public interface SystemCommunication extends Communication {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(SystemMessage)
	 * @see interactionTable.InteractionTablePackage#getSystemCommunication_Message()
	 * @model required="true"
	 * @generated
	 */
	SystemMessage getMessage();

	/**
	 * Sets the value of the '{@link interactionTable.SystemCommunication#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(SystemMessage value);

	/**
	 * Returns the value of the '<em><b>Post State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post State</em>' reference.
	 * @see #setPostState(State)
	 * @see interactionTable.InteractionTablePackage#getSystemCommunication_PostState()
	 * @model required="true"
	 * @generated
	 */
	State getPostState();

	/**
	 * Sets the value of the '{@link interactionTable.SystemCommunication#getPostState <em>Post State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post State</em>' reference.
	 * @see #getPostState()
	 * @generated
	 */
	void setPostState(State value);

	/**
	 * Returns the value of the '<em><b>Pre State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre State</em>' reference.
	 * @see #setPreState(State)
	 * @see interactionTable.InteractionTablePackage#getSystemCommunication_PreState()
	 * @model required="true"
	 * @generated
	 */
	State getPreState();

	/**
	 * Sets the value of the '{@link interactionTable.SystemCommunication#getPreState <em>Pre State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre State</em>' reference.
	 * @see #getPreState()
	 * @generated
	 */
	void setPreState(State value);

} // SystemCommunication
