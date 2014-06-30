/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.KeyEvent#isKeyDown <em>Key Down</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getKeyEvent()
 * @model
 * @generated
 */
public interface KeyEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Key Down</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Down</em>' attribute.
	 * @see #setKeyDown(boolean)
	 * @see fr.obeo.dsl.game.GamePackage#getKeyEvent_KeyDown()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isKeyDown();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.KeyEvent#isKeyDown <em>Key Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Down</em>' attribute.
	 * @see #isKeyDown()
	 * @generated
	 */
	void setKeyDown(boolean value);

} // KeyEvent
