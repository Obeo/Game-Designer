/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Animate#getAnimation <em>Animation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getAnimate()
 * @model
 * @generated
 */
public interface Animate extends Action {
	/**
	 * Returns the value of the '<em><b>Animation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' reference.
	 * @see #setAnimation(Animation)
	 * @see fr.obeo.dsl.game.GamePackage#getAnimate_Animation()
	 * @model required="true"
	 * @generated
	 */
	Animation getAnimation();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Animate#getAnimation <em>Animation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation</em>' reference.
	 * @see #getAnimation()
	 * @generated
	 */
	void setAnimation(Animation value);

} // Animate
