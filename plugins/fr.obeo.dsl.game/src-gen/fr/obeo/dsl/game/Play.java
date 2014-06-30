/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Play</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Play#getSound <em>Sound</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getPlay()
 * @model
 * @generated
 */
public interface Play extends Action {
	/**
	 * Returns the value of the '<em><b>Sound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound</em>' reference.
	 * @see #setSound(Sound)
	 * @see fr.obeo.dsl.game.GamePackage#getPlay_Sound()
	 * @model required="true"
	 * @generated
	 */
	Sound getSound();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Play#getSound <em>Sound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound</em>' reference.
	 * @see #getSound()
	 * @generated
	 */
	void setSound(Sound value);

} // Play
