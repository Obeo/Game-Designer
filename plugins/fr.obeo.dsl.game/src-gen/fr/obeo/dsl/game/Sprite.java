/**
 */
package fr.obeo.dsl.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sprite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getClassName <em>Class Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getMove <em>Move</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getDefaultState <em>Default State</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getSheet <em>Sheet</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getStates <em>States</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Sprite#getHitboxes <em>Hitboxes</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getSprite()
 * @model
 * @generated
 */
public interface Sprite extends EObject {
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
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Sprite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Sprite#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Move</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.game.Move}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move</em>' attribute.
	 * @see fr.obeo.dsl.game.Move
	 * @see #setMove(Move)
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_Move()
	 * @model required="true"
	 * @generated
	 */
	Move getMove();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Sprite#getMove <em>Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move</em>' attribute.
	 * @see fr.obeo.dsl.game.Move
	 * @see #getMove()
	 * @generated
	 */
	void setMove(Move value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Sprite)
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_Parent()
	 * @model
	 * @generated
	 */
	Sprite getParent();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Sprite#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Sprite value);

	/**
	 * Returns the value of the '<em><b>Default State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default State</em>' reference.
	 * @see #setDefaultState(State)
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_DefaultState()
	 * @model required="true"
	 * @generated
	 */
	State getDefaultState();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Sprite#getDefaultState <em>Default State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default State</em>' reference.
	 * @see #getDefaultState()
	 * @generated
	 */
	void setDefaultState(State value);

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.game.Sheet#getSprites <em>Sprites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' reference.
	 * @see #setSheet(Sheet)
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_Sheet()
	 * @see fr.obeo.dsl.game.Sheet#getSprites
	 * @model opposite="sprites" required="true"
	 * @generated
	 */
	Sheet getSheet();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Sprite#getSheet <em>Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' reference.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(Sheet value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Hitboxes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.HitBox}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hitboxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hitboxes</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getSprite_Hitboxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<HitBox> getHitboxes();

} // Sprite
