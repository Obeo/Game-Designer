/**
 */
package fr.obeo.dsl.game;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.ChangeScene#getScene <em>Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getChangeScene()
 * @model
 * @generated
 */
public interface ChangeScene extends Action {
	/**
	 * Returns the value of the '<em><b>Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' reference.
	 * @see #setScene(Scene)
	 * @see fr.obeo.dsl.game.GamePackage#getChangeScene_Scene()
	 * @model required="true"
	 * @generated
	 */
	Scene getScene();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.game.ChangeScene#getScene <em>Scene</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene</em>' reference.
	 * @see #getScene()
	 * @generated
	 */
	void setScene(Scene value);

} // ChangeScene
