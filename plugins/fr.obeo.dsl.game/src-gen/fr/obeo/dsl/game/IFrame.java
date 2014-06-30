/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFrame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.IFrame#getStylePosition <em>Style Position</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.IFrame#getStyleZIndex <em>Style ZIndex</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.IFrame#getAttributeFrameborder <em>Attribute Frameborder</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.IFrame#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.IFrame#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.IFrame#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getIFrame()
 * @model
 * @generated
 */
public interface IFrame extends Widget {
	/**
	 * Returns the value of the '<em><b>Style Position</b></em>' attribute.
	 * The default value is <code>"absolute"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Position</em>' attribute.
	 * @see #setStylePosition(String)
	 * @see fr.obeo.dsl.game.GamePackage#getIFrame_StylePosition()
	 * @model default="absolute"
	 * @generated
	 */
	String getStylePosition();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.IFrame#getStylePosition <em>Style Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Position</em>' attribute.
	 * @see #getStylePosition()
	 * @generated
	 */
	void setStylePosition(String value);

	/**
	 * Returns the value of the '<em><b>Style ZIndex</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style ZIndex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style ZIndex</em>' attribute.
	 * @see #setStyleZIndex(int)
	 * @see fr.obeo.dsl.game.GamePackage#getIFrame_StyleZIndex()
	 * @model default="500"
	 * @generated
	 */
	int getStyleZIndex();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.IFrame#getStyleZIndex <em>Style ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style ZIndex</em>' attribute.
	 * @see #getStyleZIndex()
	 * @generated
	 */
	void setStyleZIndex(int value);

	/**
	 * Returns the value of the '<em><b>Attribute Frameborder</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Frameborder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Frameborder</em>' attribute.
	 * @see #setAttributeFrameborder(int)
	 * @see fr.obeo.dsl.game.GamePackage#getIFrame_AttributeFrameborder()
	 * @model default="0"
	 * @generated
	 */
	int getAttributeFrameborder();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.IFrame#getAttributeFrameborder <em>Attribute Frameborder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Frameborder</em>' attribute.
	 * @see #getAttributeFrameborder()
	 * @generated
	 */
	void setAttributeFrameborder(int value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see fr.obeo.dsl.game.GamePackage#getIFrame_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.IFrame#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see fr.obeo.dsl.game.GamePackage#getIFrame_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.IFrame#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see fr.obeo.dsl.game.GamePackage#getIFrame_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.IFrame#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // IFrame
