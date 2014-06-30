/**
 */
package fr.obeo.dsl.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Sheet#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sheet#getSprites <em>Sprites</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sheet#getAnimations <em>Animations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getSheet()
 * @model
 * @generated
 */
public interface Sheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.obeo.dsl.game.GamePackage#getSheet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Sheet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sprites</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Sprite}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.game.Sprite#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sprites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sprites</em>' reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getSheet_Sprites()
	 * @see fr.obeo.dsl.game.Sprite#getSheet
	 * @model opposite="sheet"
	 * @generated
	 */
	EList<Sprite> getSprites();

	/**
	 * Returns the value of the '<em><b>Animations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Animation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animations</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getSheet_Animations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Animation> getAnimations();

} // Sheet
