/**
 */
package fr.obeo.dsl.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Event#getApplyOn <em>Apply On</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Event#getChangeTo <em>Change To</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Event#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getEvent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply On</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.State}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.game.State#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On</em>' reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getEvent_ApplyOn()
	 * @see fr.obeo.dsl.game.State#getEvents
	 * @model opposite="events" required="true"
	 * @generated
	 */
	EList<State> getApplyOn();

	/**
	 * Returns the value of the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change To</em>' reference.
	 * @see #setChangeTo(State)
	 * @see fr.obeo.dsl.game.GamePackage#getEvent_ChangeTo()
	 * @model
	 * @generated
	 */
	State getChangeTo();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Event#getChangeTo <em>Change To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change To</em>' reference.
	 * @see #getChangeTo()
	 * @generated
	 */
	void setChangeTo(State value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getEvent_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Event
