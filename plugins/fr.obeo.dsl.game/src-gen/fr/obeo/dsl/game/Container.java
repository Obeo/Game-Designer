/**
 */
package fr.obeo.dsl.game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Container#getBorder <em>Border</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Container#getRadius <em>Radius</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Container#getStroke <em>Stroke</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Container#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Container#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Container#getFill <em>Fill</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Container#isShadow <em>Shadow</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Container#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Container#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Widget {
	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(int)
	 * @see fr.obeo.dsl.game.GamePackage#getContainer_Border()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getBorder();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Container#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(int value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(int)
	 * @see fr.obeo.dsl.game.GamePackage#getContainer_Radius()
	 * @model default="5"
	 * @generated
	 */
	int getRadius();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Container#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(int value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' attribute.
	 * The default value is <code>"000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' attribute.
	 * @see #setStroke(int)
	 * @see fr.obeo.dsl.game.GamePackage#getContainer_Stroke()
	 * @model default="000"
	 * @generated
	 */
	int getStroke();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Container#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' attribute.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(int value);

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
	 * @see fr.obeo.dsl.game.GamePackage#getContainer_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Container#getWidth <em>Width</em>}' attribute.
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
	 * @see fr.obeo.dsl.game.GamePackage#getContainer_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Container#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #setFill(int)
	 * @see fr.obeo.dsl.game.GamePackage#getContainer_Fill()
	 * @model default="0"
	 * @generated
	 */
	int getFill();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Container#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(int value);

	/**
	 * Returns the value of the '<em><b>Shadow</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow</em>' attribute.
	 * @see #setShadow(boolean)
	 * @see fr.obeo.dsl.game.GamePackage#getContainer_Shadow()
	 * @model default="false"
	 * @generated
	 */
	boolean isShadow();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Container#isShadow <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow</em>' attribute.
	 * @see #isShadow()
	 * @generated
	 */
	void setShadow(boolean value);

	/**
	 * Returns the value of the '<em><b>Shadow Color</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Color</em>' attribute.
	 * @see #setShadowColor(int)
	 * @see fr.obeo.dsl.game.GamePackage#getContainer_ShadowColor()
	 * @model default="0"
	 * @generated
	 */
	int getShadowColor();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Container#getShadowColor <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Color</em>' attribute.
	 * @see #getShadowColor()
	 * @generated
	 */
	void setShadowColor(int value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getContainer_Widgets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

} // Container
