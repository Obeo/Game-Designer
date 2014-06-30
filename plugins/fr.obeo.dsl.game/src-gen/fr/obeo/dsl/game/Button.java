/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Button#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Button#getKeyActionName <em>Key Action Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Button#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Container {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see fr.obeo.dsl.game.GamePackage#getButton_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Button#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Key Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Action Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Action Name</em>' attribute.
	 * @see #setKeyActionName(String)
	 * @see fr.obeo.dsl.game.GamePackage#getButton_KeyActionName()
	 * @model
	 * @generated
	 */
	String getKeyActionName();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Button#getKeyActionName <em>Key Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Action Name</em>' attribute.
	 * @see #getKeyActionName()
	 * @generated
	 */
	void setKeyActionName(String value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' attribute.
	 * The default value is <code>"weigth: 400, size: 24px, family: arial"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' attribute.
	 * @see #setFont(String)
	 * @see fr.obeo.dsl.game.GamePackage#getButton_Font()
	 * @model default="weigth: 400, size: 24px, family: arial"
	 * @generated
	 */
	String getFont();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Button#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(String value);

} // Button
