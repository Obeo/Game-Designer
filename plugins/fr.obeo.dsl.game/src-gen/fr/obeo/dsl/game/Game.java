/**
 */
package fr.obeo.dsl.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.Game#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Game#getScenes <em>Scenes</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Game#getStage <em>Stage</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Game#getSprites <em>Sprites</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Game#getSounds <em>Sounds</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.Game#getSheets <em>Sheets</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
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
	 * @see fr.obeo.dsl.game.GamePackage#getGame_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.Game#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Scene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getGame_Scenes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Scene> getScenes();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Scene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getGame_Stage()
	 * @model required="true"
	 * @generated
	 */
	EList<Scene> getStage();

	/**
	 * Returns the value of the '<em><b>Sprites</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Sprite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sprites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sprites</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getGame_Sprites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sprite> getSprites();

	/**
	 * Returns the value of the '<em><b>Sounds</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Sound}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sounds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sounds</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getGame_Sounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sound> getSounds();

	/**
	 * Returns the value of the '<em><b>Sheets</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Sheet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheets</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getGame_Sheets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sheet> getSheets();

} // Game
