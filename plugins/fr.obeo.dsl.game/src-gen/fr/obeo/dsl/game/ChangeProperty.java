/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.ChangeProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.ChangeProperty#getOperation <em>Operation</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.ChangeProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getChangeProperty()
 * @model
 * @generated
 */
public interface ChangeProperty extends Action {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see fr.obeo.dsl.game.GamePackage#getChangeProperty_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.ChangeProperty#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.game.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see fr.obeo.dsl.game.Operation
	 * @see #setOperation(Operation)
	 * @see fr.obeo.dsl.game.GamePackage#getChangeProperty_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.ChangeProperty#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see fr.obeo.dsl.game.Operation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Property)
	 * @see fr.obeo.dsl.game.GamePackage#getChangeProperty_Value()
	 * @model required="true"
	 * @generated
	 */
	Property getValue();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.ChangeProperty#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Property value);

} // ChangeProperty
