/**
 */
package interactionTable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactionTable.Communication#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see interactionTable.InteractionTablePackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends EObject {
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
	 * @see interactionTable.InteractionTablePackage#getCommunication_Return()
	 * @model
	 * @generated
	 */
	String getReturn();

	/**
	 * Sets the value of the '{@link interactionTable.Communication#getReturn <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' attribute.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(String value);

} // Communication
