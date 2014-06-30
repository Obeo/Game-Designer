/**
 */
package fr.obeo.dsl.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.DisplayProperty#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getDisplayProperty()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DisplayProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.game.Property#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see fr.obeo.dsl.game.GamePackage#getDisplayProperty_Property()
	 * @see fr.obeo.dsl.game.Property#getDisplay
	 * @model opposite="display"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.DisplayProperty#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // DisplayProperty
