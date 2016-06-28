/**
 */
package interactionMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactionMetamodel.Message#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link interactionMetamodel.Message#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link interactionMetamodel.Message#getMessageSort <em>Message Sort</em>}</li>
 * </ul>
 *
 * @see interactionMetamodel.InteractionMetamodelPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Event</em>' reference.
	 * @see #setSendEvent(MessageOccurenceSpecification)
	 * @see interactionMetamodel.InteractionMetamodelPackage#getMessage_SendEvent()
	 * @model
	 * @generated
	 */
	MessageOccurenceSpecification getSendEvent();

	/**
	 * Sets the value of the '{@link interactionMetamodel.Message#getSendEvent <em>Send Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Event</em>' reference.
	 * @see #getSendEvent()
	 * @generated
	 */
	void setSendEvent(MessageOccurenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Event</em>' reference.
	 * @see #setReceiveEvent(MessageOccurenceSpecification)
	 * @see interactionMetamodel.InteractionMetamodelPackage#getMessage_ReceiveEvent()
	 * @model
	 * @generated
	 */
	MessageOccurenceSpecification getReceiveEvent();

	/**
	 * Sets the value of the '{@link interactionMetamodel.Message#getReceiveEvent <em>Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Event</em>' reference.
	 * @see #getReceiveEvent()
	 * @generated
	 */
	void setReceiveEvent(MessageOccurenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link interactionMetamodel.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see interactionMetamodel.MessageSort
	 * @see #setMessageSort(MessageSort)
	 * @see interactionMetamodel.InteractionMetamodelPackage#getMessage_MessageSort()
	 * @model
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link interactionMetamodel.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see interactionMetamodel.MessageSort
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

} // Message
