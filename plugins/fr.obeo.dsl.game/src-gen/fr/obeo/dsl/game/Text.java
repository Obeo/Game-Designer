/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Text#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Text#getWeight <em>Weight</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Text#getSize <em>Size</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Text#getAlign <em>Align</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Text#getFamily <em>Family</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Text#getColor <em>Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Text#getOutline <em>Outline</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Text#getOutlineWidth <em>Outline Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getText()
 * @model
 * @generated
 */
public interface Text extends Widget, DisplayProperty {
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
	 * @see fr.obeo.dsl.game.GamePackage#getText_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Text#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"800"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see fr.obeo.dsl.game.GamePackage#getText_Weight()
	 * @model default="800"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Text#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"24"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see fr.obeo.dsl.game.GamePackage#getText_Size()
	 * @model default="24"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Text#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The default value is <code>"left"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(String)
	 * @see fr.obeo.dsl.game.GamePackage#getText_Align()
	 * @model default="left"
	 * @generated
	 */
	String getAlign();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Text#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(String value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * The default value is <code>"Arial"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see fr.obeo.dsl.game.GamePackage#getText_Family()
	 * @model default="Arial"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Text#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"black"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see fr.obeo.dsl.game.GamePackage#getText_Color()
	 * @model default="black"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Text#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * The default value is <code>"black"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #setOutline(String)
	 * @see fr.obeo.dsl.game.GamePackage#getText_Outline()
	 * @model default="black"
	 * @generated
	 */
	String getOutline();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Text#getOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #getOutline()
	 * @generated
	 */
	void setOutline(String value);

	/**
	 * Returns the value of the '<em><b>Outline Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline Width</em>' attribute.
	 * @see #setOutlineWidth(int)
	 * @see fr.obeo.dsl.game.GamePackage#getText_OutlineWidth()
	 * @model default="0"
	 * @generated
	 */
	int getOutlineWidth();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Text#getOutlineWidth <em>Outline Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline Width</em>' attribute.
	 * @see #getOutlineWidth()
	 * @generated
	 */
	void setOutlineWidth(int value);

} // Text
