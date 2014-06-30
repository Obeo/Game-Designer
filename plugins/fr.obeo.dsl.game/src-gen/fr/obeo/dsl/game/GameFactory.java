/**
 */
package fr.obeo.dsl.game;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.game.GamePackage
 * @generated
 */
public interface GameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GameFactory eINSTANCE = fr.obeo.dsl.game.impl.GameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>TMX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMX</em>'.
	 * @generated
	 */
	TMX createTMX();

	/**
	 * Returns a new object of class '<em>Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sheet</em>'.
	 * @generated
	 */
	Sheet createSheet();

	/**
	 * Returns a new object of class '<em>Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animation</em>'.
	 * @generated
	 */
	Animation createAnimation();

	/**
	 * Returns a new object of class '<em>Collision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collision</em>'.
	 * @generated
	 */
	Collision createCollision();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Key Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Event</em>'.
	 * @generated
	 */
	KeyEvent createKeyEvent();

	/**
	 * Returns a new object of class '<em>Arrow Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrow Key</em>'.
	 * @generated
	 */
	ArrowKey createArrowKey();

	/**
	 * Returns a new object of class '<em>Fire Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fire Key</em>'.
	 * @generated
	 */
	FireKey createFireKey();

	/**
	 * Returns a new object of class '<em>Action Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Key</em>'.
	 * @generated
	 */
	ActionKey createActionKey();

	/**
	 * Returns a new object of class '<em>Confirm Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confirm Key</em>'.
	 * @generated
	 */
	ConfirmKey createConfirmKey();

	/**
	 * Returns a new object of class '<em>Escape Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escape Key</em>'.
	 * @generated
	 */
	EscapeKey createEscapeKey();

	/**
	 * Returns a new object of class '<em>Pause Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pause Key</em>'.
	 * @generated
	 */
	PauseKey createPauseKey();

	/**
	 * Returns a new object of class '<em>Save Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Save Key</em>'.
	 * @generated
	 */
	SaveKey createSaveKey();

	/**
	 * Returns a new object of class '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump</em>'.
	 * @generated
	 */
	Jump createJump();

	/**
	 * Returns a new object of class '<em>Jumped</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jumped</em>'.
	 * @generated
	 */
	Jumped createJumped();

	/**
	 * Returns a new object of class '<em>Move Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Event</em>'.
	 * @generated
	 */
	MoveEvent createMoveEvent();

	/**
	 * Returns a new object of class '<em>Move Down</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Down</em>'.
	 * @generated
	 */
	MoveDown createMoveDown();

	/**
	 * Returns a new object of class '<em>Move Up</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Up</em>'.
	 * @generated
	 */
	MoveUp createMoveUp();

	/**
	 * Returns a new object of class '<em>Move Stop Verticaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Stop Verticaly</em>'.
	 * @generated
	 */
	MoveStopVerticaly createMoveStopVerticaly();

	/**
	 * Returns a new object of class '<em>Move Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Left</em>'.
	 * @generated
	 */
	MoveLeft createMoveLeft();

	/**
	 * Returns a new object of class '<em>Move Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Right</em>'.
	 * @generated
	 */
	MoveRight createMoveRight();

	/**
	 * Returns a new object of class '<em>Move Stop Horizontaly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Stop Horizontaly</em>'.
	 * @generated
	 */
	MoveStopHorizontaly createMoveStopHorizontaly();

	/**
	 * Returns a new object of class '<em>Sprite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sprite</em>'.
	 * @generated
	 */
	Sprite createSprite();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Sound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sound</em>'.
	 * @generated
	 */
	Sound createSound();

	/**
	 * Returns a new object of class '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tile</em>'.
	 * @generated
	 */
	Tile createTile();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Change Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Scene</em>'.
	 * @generated
	 */
	ChangeScene createChangeScene();

	/**
	 * Returns a new object of class '<em>Play</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Play</em>'.
	 * @generated
	 */
	Play createPlay();

	/**
	 * Returns a new object of class '<em>Animate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animate</em>'.
	 * @generated
	 */
	Animate createAnimate();

	/**
	 * Returns a new object of class '<em>Change Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Property</em>'.
	 * @generated
	 */
	ChangeProperty createChangeProperty();

	/**
	 * Returns a new object of class '<em>Destroy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroy</em>'.
	 * @generated
	 */
	Destroy createDestroy();

	/**
	 * Returns a new object of class '<em>Hit Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hit Box</em>'.
	 * @generated
	 */
	HitBox createHitBox();

	/**
	 * Returns a new object of class '<em>UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI</em>'.
	 * @generated
	 */
	UI createUI();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>IFrame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFrame</em>'.
	 * @generated
	 */
	IFrame createIFrame();

	/**
	 * Returns a new object of class '<em>HTML Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Element</em>'.
	 * @generated
	 */
	HTMLElement createHTMLElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GamePackage getGamePackage();

} //GameFactory
