/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Sensor#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sensor#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Event {
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
	 * @see fr.obeo.dsl.game.GamePackage#getSensor_Orientation()
	 * @model required="true"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Sensor#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see fr.obeo.dsl.game.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Sprite)
	 * @see fr.obeo.dsl.game.GamePackage#getSensor_Source()
	 * @model required="true"
	 * @generated
	 */
	Sprite getSource();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Sensor#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Sprite value);

} // Sensor
