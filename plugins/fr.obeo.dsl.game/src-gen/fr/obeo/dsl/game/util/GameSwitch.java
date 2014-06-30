/**
 */
package fr.obeo.dsl.game.util;

import fr.obeo.dsl.game.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.game.GamePackage
 * @generated
 */
public class GameSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameSwitch() {
		if (modelPackage == null) {
			modelPackage = GamePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GamePackage.GAME: {
				Game game = (Game)theEObject;
				T result = caseGame(game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.SCENE: {
				Scene scene = (Scene)theEObject;
				T result = caseScene(scene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.TMX: {
				TMX tmx = (TMX)theEObject;
				T result = caseTMX(tmx);
				if (result == null) result = caseScene(tmx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.SHEET: {
				Sheet sheet = (Sheet)theEObject;
				T result = caseSheet(sheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.ANIMATION: {
				Animation animation = (Animation)theEObject;
				T result = caseAnimation(animation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.COLLISION: {
				Collision collision = (Collision)theEObject;
				T result = caseCollision(collision);
				if (result == null) result = caseEvent(collision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseEvent(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.KEY_EVENT: {
				KeyEvent keyEvent = (KeyEvent)theEObject;
				T result = caseKeyEvent(keyEvent);
				if (result == null) result = caseEvent(keyEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.ARROW_KEY: {
				ArrowKey arrowKey = (ArrowKey)theEObject;
				T result = caseArrowKey(arrowKey);
				if (result == null) result = caseKeyEvent(arrowKey);
				if (result == null) result = caseEvent(arrowKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.FIRE_KEY: {
				FireKey fireKey = (FireKey)theEObject;
				T result = caseFireKey(fireKey);
				if (result == null) result = caseKeyEvent(fireKey);
				if (result == null) result = caseEvent(fireKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.ACTION_KEY: {
				ActionKey actionKey = (ActionKey)theEObject;
				T result = caseActionKey(actionKey);
				if (result == null) result = caseKeyEvent(actionKey);
				if (result == null) result = caseEvent(actionKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.CONFIRM_KEY: {
				ConfirmKey confirmKey = (ConfirmKey)theEObject;
				T result = caseConfirmKey(confirmKey);
				if (result == null) result = caseKeyEvent(confirmKey);
				if (result == null) result = caseEvent(confirmKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.ESCAPE_KEY: {
				EscapeKey escapeKey = (EscapeKey)theEObject;
				T result = caseEscapeKey(escapeKey);
				if (result == null) result = caseKeyEvent(escapeKey);
				if (result == null) result = caseEvent(escapeKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.PAUSE_KEY: {
				PauseKey pauseKey = (PauseKey)theEObject;
				T result = casePauseKey(pauseKey);
				if (result == null) result = caseKeyEvent(pauseKey);
				if (result == null) result = caseEvent(pauseKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.SAVE_KEY: {
				SaveKey saveKey = (SaveKey)theEObject;
				T result = caseSaveKey(saveKey);
				if (result == null) result = caseKeyEvent(saveKey);
				if (result == null) result = caseEvent(saveKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.JUMP: {
				Jump jump = (Jump)theEObject;
				T result = caseJump(jump);
				if (result == null) result = caseEvent(jump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.JUMPED: {
				Jumped jumped = (Jumped)theEObject;
				T result = caseJumped(jumped);
				if (result == null) result = caseEvent(jumped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.MOVE_EVENT: {
				MoveEvent moveEvent = (MoveEvent)theEObject;
				T result = caseMoveEvent(moveEvent);
				if (result == null) result = caseEvent(moveEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.MOVE_DOWN: {
				MoveDown moveDown = (MoveDown)theEObject;
				T result = caseMoveDown(moveDown);
				if (result == null) result = caseMoveEvent(moveDown);
				if (result == null) result = caseEvent(moveDown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.MOVE_UP: {
				MoveUp moveUp = (MoveUp)theEObject;
				T result = caseMoveUp(moveUp);
				if (result == null) result = caseMoveEvent(moveUp);
				if (result == null) result = caseEvent(moveUp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.MOVE_STOP_VERTICALY: {
				MoveStopVerticaly moveStopVerticaly = (MoveStopVerticaly)theEObject;
				T result = caseMoveStopVerticaly(moveStopVerticaly);
				if (result == null) result = caseMoveEvent(moveStopVerticaly);
				if (result == null) result = caseEvent(moveStopVerticaly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.MOVE_LEFT: {
				MoveLeft moveLeft = (MoveLeft)theEObject;
				T result = caseMoveLeft(moveLeft);
				if (result == null) result = caseMoveEvent(moveLeft);
				if (result == null) result = caseEvent(moveLeft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.MOVE_RIGHT: {
				MoveRight moveRight = (MoveRight)theEObject;
				T result = caseMoveRight(moveRight);
				if (result == null) result = caseMoveEvent(moveRight);
				if (result == null) result = caseEvent(moveRight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.MOVE_STOP_HORIZONTALY: {
				MoveStopHorizontaly moveStopHorizontaly = (MoveStopHorizontaly)theEObject;
				T result = caseMoveStopHorizontaly(moveStopHorizontaly);
				if (result == null) result = caseMoveEvent(moveStopHorizontaly);
				if (result == null) result = caseEvent(moveStopHorizontaly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.SPRITE: {
				Sprite sprite = (Sprite)theEObject;
				T result = caseSprite(sprite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.SOUND: {
				Sound sound = (Sound)theEObject;
				T result = caseSound(sound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.TILE: {
				Tile tile = (Tile)theEObject;
				T result = caseTile(tile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.CHANGE_SCENE: {
				ChangeScene changeScene = (ChangeScene)theEObject;
				T result = caseChangeScene(changeScene);
				if (result == null) result = caseAction(changeScene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.PLAY: {
				Play play = (Play)theEObject;
				T result = casePlay(play);
				if (result == null) result = caseAction(play);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.ANIMATE: {
				Animate animate = (Animate)theEObject;
				T result = caseAnimate(animate);
				if (result == null) result = caseAction(animate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.CHANGE_PROPERTY: {
				ChangeProperty changeProperty = (ChangeProperty)theEObject;
				T result = caseChangeProperty(changeProperty);
				if (result == null) result = caseAction(changeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.DESTROY: {
				Destroy destroy = (Destroy)theEObject;
				T result = caseDestroy(destroy);
				if (result == null) result = caseAction(destroy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.HIT_BOX: {
				HitBox hitBox = (HitBox)theEObject;
				T result = caseHitBox(hitBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.UI: {
				UI ui = (UI)theEObject;
				T result = caseUI(ui);
				if (result == null) result = caseScene(ui);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseWidget(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseWidget(text);
				if (result == null) result = caseDisplayProperty(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseContainer(button);
				if (result == null) result = caseWidget(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.IFRAME: {
				IFrame iFrame = (IFrame)theEObject;
				T result = caseIFrame(iFrame);
				if (result == null) result = caseWidget(iFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.HTML_ELEMENT: {
				HTMLElement htmlElement = (HTMLElement)theEObject;
				T result = caseHTMLElement(htmlElement);
				if (result == null) result = caseWidget(htmlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamePackage.DISPLAY_PROPERTY: {
				DisplayProperty displayProperty = (DisplayProperty)theEObject;
				T result = caseDisplayProperty(displayProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGame(Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScene(Scene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMX(TMX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheet(Sheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimation(Animation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollision(Collision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyEvent(KeyEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrow Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrow Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowKey(ArrowKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fire Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fire Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFireKey(FireKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionKey(ActionKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmKey(ConfirmKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Escape Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Escape Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEscapeKey(EscapeKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pause Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pause Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePauseKey(PauseKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Save Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Save Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaveKey(SaveKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJump(Jump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jumped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jumped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumped(Jumped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveEvent(MoveEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveDown(MoveDown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Up</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Up</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveUp(MoveUp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Stop Verticaly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Stop Verticaly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveStopVerticaly(MoveStopVerticaly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveLeft(MoveLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveRight(MoveRight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Stop Horizontaly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Stop Horizontaly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveStopHorizontaly(MoveStopHorizontaly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sprite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sprite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSprite(Sprite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSound(Sound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTile(Tile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeScene(ChangeScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Play</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Play</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlay(Play object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimate(Animate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeProperty(ChangeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroy(Destroy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hit Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hit Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHitBox(HitBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUI(UI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFrame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFrame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFrame(IFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLElement(HTMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayProperty(DisplayProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GameSwitch
