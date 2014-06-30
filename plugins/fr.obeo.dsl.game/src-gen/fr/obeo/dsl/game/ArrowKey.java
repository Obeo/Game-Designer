/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.ArrowKey#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getArrowKey()
 * @model
 * @generated
 */
public interface ArrowKey extends KeyEvent {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.game.Orientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see fr.obeo.dsl.game.Orientation
	 * @see #setOrientation(Orientation)
	 * @see fr.obeo.dsl.game.GamePackage#getArrowKey_Orientation()
	 * @model
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.ArrowKey#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see fr.obeo.dsl.game.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

} // ArrowKey
