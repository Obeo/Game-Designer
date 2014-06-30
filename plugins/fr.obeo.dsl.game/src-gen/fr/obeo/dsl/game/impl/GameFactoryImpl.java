/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameFactoryImpl extends EFactoryImpl implements GameFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GameFactory init() {
		try {
			GameFactory theGameFactory = (GameFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeo.fr/game"); 
			if (theGameFactory != null) {
				return theGameFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GameFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GamePackage.GAME: return createGame();
			case GamePackage.TMX: return createTMX();
			case GamePackage.SHEET: return createSheet();
			case GamePackage.ANIMATION: return createAnimation();
			case GamePackage.COLLISION: return createCollision();
			case GamePackage.SENSOR: return createSensor();
			case GamePackage.KEY_EVENT: return createKeyEvent();
			case GamePackage.ARROW_KEY: return createArrowKey();
			case GamePackage.FIRE_KEY: return createFireKey();
			case GamePackage.ACTION_KEY: return createActionKey();
			case GamePackage.CONFIRM_KEY: return createConfirmKey();
			case GamePackage.ESCAPE_KEY: return createEscapeKey();
			case GamePackage.PAUSE_KEY: return createPauseKey();
			case GamePackage.SAVE_KEY: return createSaveKey();
			case GamePackage.JUMP: return createJump();
			case GamePackage.JUMPED: return createJumped();
			case GamePackage.MOVE_EVENT: return createMoveEvent();
			case GamePackage.MOVE_DOWN: return createMoveDown();
			case GamePackage.MOVE_UP: return createMoveUp();
			case GamePackage.MOVE_STOP_VERTICALY: return createMoveStopVerticaly();
			case GamePackage.MOVE_LEFT: return createMoveLeft();
			case GamePackage.MOVE_RIGHT: return createMoveRight();
			case GamePackage.MOVE_STOP_HORIZONTALY: return createMoveStopHorizontaly();
			case GamePackage.SPRITE: return createSprite();
			case GamePackage.PROPERTY: return createProperty();
			case GamePackage.SOUND: return createSound();
			case GamePackage.TILE: return createTile();
			case GamePackage.STATE: return createState();
			case GamePackage.CHANGE_SCENE: return createChangeScene();
			case GamePackage.PLAY: return createPlay();
			case GamePackage.ANIMATE: return createAnimate();
			case GamePackage.CHANGE_PROPERTY: return createChangeProperty();
			case GamePackage.DESTROY: return createDestroy();
			case GamePackage.HIT_BOX: return createHitBox();
			case GamePackage.UI: return createUI();
			case GamePackage.CONTAINER: return createContainer();
			case GamePackage.TEXT: return createText();
			case GamePackage.BUTTON: return createButton();
			case GamePackage.IFRAME: return createIFrame();
			case GamePackage.HTML_ELEMENT: return createHTMLElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GamePackage.MOVE:
				return createMoveFromString(eDataType, initialValue);
			case GamePackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case GamePackage.AXIS:
				return createAxisFromString(eDataType, initialValue);
			case GamePackage.OPERATION:
				return createOperationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GamePackage.MOVE:
				return convertMoveToString(eDataType, instanceValue);
			case GamePackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case GamePackage.AXIS:
				return convertAxisToString(eDataType, instanceValue);
			case GamePackage.OPERATION:
				return convertOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMX createTMX() {
		TMXImpl tmx = new TMXImpl();
		return tmx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sheet createSheet() {
		SheetImpl sheet = new SheetImpl();
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation createAnimation() {
		AnimationImpl animation = new AnimationImpl();
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collision createCollision() {
		CollisionImpl collision = new CollisionImpl();
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyEvent createKeyEvent() {
		KeyEventImpl keyEvent = new KeyEventImpl();
		return keyEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowKey createArrowKey() {
		ArrowKeyImpl arrowKey = new ArrowKeyImpl();
		return arrowKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FireKey createFireKey() {
		FireKeyImpl fireKey = new FireKeyImpl();
		return fireKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionKey createActionKey() {
		ActionKeyImpl actionKey = new ActionKeyImpl();
		return actionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmKey createConfirmKey() {
		ConfirmKeyImpl confirmKey = new ConfirmKeyImpl();
		return confirmKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscapeKey createEscapeKey() {
		EscapeKeyImpl escapeKey = new EscapeKeyImpl();
		return escapeKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PauseKey createPauseKey() {
		PauseKeyImpl pauseKey = new PauseKeyImpl();
		return pauseKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaveKey createSaveKey() {
		SaveKeyImpl saveKey = new SaveKeyImpl();
		return saveKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jump createJump() {
		JumpImpl jump = new JumpImpl();
		return jump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jumped createJumped() {
		JumpedImpl jumped = new JumpedImpl();
		return jumped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveEvent createMoveEvent() {
		MoveEventImpl moveEvent = new MoveEventImpl();
		return moveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveDown createMoveDown() {
		MoveDownImpl moveDown = new MoveDownImpl();
		return moveDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveUp createMoveUp() {
		MoveUpImpl moveUp = new MoveUpImpl();
		return moveUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveStopVerticaly createMoveStopVerticaly() {
		MoveStopVerticalyImpl moveStopVerticaly = new MoveStopVerticalyImpl();
		return moveStopVerticaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveLeft createMoveLeft() {
		MoveLeftImpl moveLeft = new MoveLeftImpl();
		return moveLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveRight createMoveRight() {
		MoveRightImpl moveRight = new MoveRightImpl();
		return moveRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveStopHorizontaly createMoveStopHorizontaly() {
		MoveStopHorizontalyImpl moveStopHorizontaly = new MoveStopHorizontalyImpl();
		return moveStopHorizontaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprite createSprite() {
		SpriteImpl sprite = new SpriteImpl();
		return sprite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sound createSound() {
		SoundImpl sound = new SoundImpl();
		return sound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile createTile() {
		TileImpl tile = new TileImpl();
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeScene createChangeScene() {
		ChangeSceneImpl changeScene = new ChangeSceneImpl();
		return changeScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Play createPlay() {
		PlayImpl play = new PlayImpl();
		return play;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animate createAnimate() {
		AnimateImpl animate = new AnimateImpl();
		return animate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeProperty createChangeProperty() {
		ChangePropertyImpl changeProperty = new ChangePropertyImpl();
		return changeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destroy createDestroy() {
		DestroyImpl destroy = new DestroyImpl();
		return destroy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HitBox createHitBox() {
		HitBoxImpl hitBox = new HitBoxImpl();
		return hitBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI createUI() {
		UIImpl ui = new UIImpl();
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.obeo.dsl.game.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFrame createIFrame() {
		IFrameImpl iFrame = new IFrameImpl();
		return iFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLElement createHTMLElement() {
		HTMLElementImpl htmlElement = new HTMLElementImpl();
		return htmlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMoveFromString(EDataType eDataType, String initialValue) {
		Move result = Move.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMoveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxisFromString(EDataType eDataType, String initialValue) {
		Axis result = Axis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperationFromString(EDataType eDataType, String initialValue) {
		Operation result = Operation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePackage getGamePackage() {
		return (GamePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GamePackage getPackage() {
		return GamePackage.eINSTANCE;
	}

} //GameFactoryImpl
