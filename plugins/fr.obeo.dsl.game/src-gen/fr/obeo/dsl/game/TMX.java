/**
 */
package fr.obeo.dsl.game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.TMX#getSprites <em>Sprites</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.TMX#getTiles <em>Tiles</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.game.GamePackage#getTMX()
 * @model
 * @generated
 */
public interface TMX extends Scene {
	/**
	 * Returns the value of the '<em><b>Sprites</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Sprite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sprites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sprites</em>' reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getTMX_Sprites()
	 * @model
	 * @generated
	 */
	EList<Sprite> getSprites();

	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.game.Tile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference list.
	 * @see fr.obeo.dsl.game.GamePackage#getTMX_Tiles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tile> getTiles();

} // TMX
