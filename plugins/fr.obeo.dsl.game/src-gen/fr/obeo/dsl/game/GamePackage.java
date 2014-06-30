/**
 */
package fr.obeo.dsl.game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.game.GameFactory
 * @model kind="package"
 * @generated
 */
public interface GamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "game";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/game";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "game";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamePackage eINSTANCE = fr.obeo.dsl.game.impl.GamePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.GameImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SCENES = 1;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__STAGE = 2;

	/**
	 * The feature id for the '<em><b>Sprites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SPRITES = 3;

	/**
	 * The feature id for the '<em><b>Sounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SOUNDS = 4;

	/**
	 * The feature id for the '<em><b>Sheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SHEETS = 5;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.Scene <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.Scene
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Follow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__FOLLOW = 1;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.TMXImpl <em>TMX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.TMXImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getTMX()
	 * @generated
	 */
	int TMX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMX__NAME = SCENE__NAME;

	/**
	 * The feature id for the '<em><b>Follow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMX__FOLLOW = SCENE__FOLLOW;

	/**
	 * The feature id for the '<em><b>Sprites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMX__SPRITES = SCENE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMX__TILES = SCENE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMX_FEATURE_COUNT = SCENE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TMX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMX_OPERATION_COUNT = SCENE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.SheetImpl <em>Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.SheetImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSheet()
	 * @generated
	 */
	int SHEET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sprites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__SPRITES = 1;

	/**
	 * The feature id for the '<em><b>Animations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__ANIMATIONS = 2;

	/**
	 * The number of structural features of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.AnimationImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.Event <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.Event
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__APPLY_ON = 0;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CHANGE_TO = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ACTIONS = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.CollisionImpl <em>Collision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.CollisionImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getCollision()
	 * @generated
	 */
	int COLLISION = 6;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__APPLY_ON = EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__CHANGE_TO = EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__ACTIONS = EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__ORIENTATION = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__SOURCE = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.SensorImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 7;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__APPLY_ON = EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CHANGE_TO = EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ACTIONS = EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ORIENTATION = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SOURCE = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.KeyEventImpl <em>Key Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.KeyEventImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getKeyEvent()
	 * @generated
	 */
	int KEY_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EVENT__APPLY_ON = EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EVENT__CHANGE_TO = EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EVENT__ACTIONS = EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Key Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EVENT__KEY_DOWN = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Key Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.ArrowKeyImpl <em>Arrow Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.ArrowKeyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getArrowKey()
	 * @generated
	 */
	int ARROW_KEY = 9;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_KEY__APPLY_ON = KEY_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_KEY__CHANGE_TO = KEY_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_KEY__ACTIONS = KEY_EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Key Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_KEY__KEY_DOWN = KEY_EVENT__KEY_DOWN;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_KEY__ORIENTATION = KEY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arrow Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_KEY_FEATURE_COUNT = KEY_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arrow Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_KEY_OPERATION_COUNT = KEY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.FireKeyImpl <em>Fire Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.FireKeyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getFireKey()
	 * @generated
	 */
	int FIRE_KEY = 10;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_KEY__APPLY_ON = KEY_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_KEY__CHANGE_TO = KEY_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_KEY__ACTIONS = KEY_EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Key Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_KEY__KEY_DOWN = KEY_EVENT__KEY_DOWN;

	/**
	 * The number of structural features of the '<em>Fire Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_KEY_FEATURE_COUNT = KEY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fire Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_KEY_OPERATION_COUNT = KEY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.ActionKeyImpl <em>Action Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.ActionKeyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getActionKey()
	 * @generated
	 */
	int ACTION_KEY = 11;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_KEY__APPLY_ON = KEY_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_KEY__CHANGE_TO = KEY_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_KEY__ACTIONS = KEY_EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Key Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_KEY__KEY_DOWN = KEY_EVENT__KEY_DOWN;

	/**
	 * The number of structural features of the '<em>Action Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_KEY_FEATURE_COUNT = KEY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_KEY_OPERATION_COUNT = KEY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.ConfirmKeyImpl <em>Confirm Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.ConfirmKeyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getConfirmKey()
	 * @generated
	 */
	int CONFIRM_KEY = 12;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_KEY__APPLY_ON = KEY_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_KEY__CHANGE_TO = KEY_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_KEY__ACTIONS = KEY_EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Key Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_KEY__KEY_DOWN = KEY_EVENT__KEY_DOWN;

	/**
	 * The number of structural features of the '<em>Confirm Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_KEY_FEATURE_COUNT = KEY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Confirm Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_KEY_OPERATION_COUNT = KEY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.EscapeKeyImpl <em>Escape Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.EscapeKeyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getEscapeKey()
	 * @generated
	 */
	int ESCAPE_KEY = 13;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_KEY__APPLY_ON = KEY_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_KEY__CHANGE_TO = KEY_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_KEY__ACTIONS = KEY_EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Key Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_KEY__KEY_DOWN = KEY_EVENT__KEY_DOWN;

	/**
	 * The number of structural features of the '<em>Escape Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_KEY_FEATURE_COUNT = KEY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Escape Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_KEY_OPERATION_COUNT = KEY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.PauseKeyImpl <em>Pause Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.PauseKeyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getPauseKey()
	 * @generated
	 */
	int PAUSE_KEY = 14;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_KEY__APPLY_ON = KEY_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_KEY__CHANGE_TO = KEY_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_KEY__ACTIONS = KEY_EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Key Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_KEY__KEY_DOWN = KEY_EVENT__KEY_DOWN;

	/**
	 * The number of structural features of the '<em>Pause Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_KEY_FEATURE_COUNT = KEY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pause Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_KEY_OPERATION_COUNT = KEY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.SaveKeyImpl <em>Save Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.SaveKeyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSaveKey()
	 * @generated
	 */
	int SAVE_KEY = 15;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_KEY__APPLY_ON = KEY_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_KEY__CHANGE_TO = KEY_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_KEY__ACTIONS = KEY_EVENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Key Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_KEY__KEY_DOWN = KEY_EVENT__KEY_DOWN;

	/**
	 * The number of structural features of the '<em>Save Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_KEY_FEATURE_COUNT = KEY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Save Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_KEY_OPERATION_COUNT = KEY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.JumpImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 16;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__APPLY_ON = EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__CHANGE_TO = EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__ACTIONS = EVENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.JumpedImpl <em>Jumped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.JumpedImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getJumped()
	 * @generated
	 */
	int JUMPED = 17;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPED__APPLY_ON = EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPED__CHANGE_TO = EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPED__ACTIONS = EVENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Jumped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPED_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jumped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMPED_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.MoveEventImpl <em>Move Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.MoveEventImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveEvent()
	 * @generated
	 */
	int MOVE_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EVENT__APPLY_ON = EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EVENT__CHANGE_TO = EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EVENT__ACTIONS = EVENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Move Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.MoveDownImpl <em>Move Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.MoveDownImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveDown()
	 * @generated
	 */
	int MOVE_DOWN = 19;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN__APPLY_ON = MOVE_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN__CHANGE_TO = MOVE_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN__ACTIONS = MOVE_EVENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Move Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN_FEATURE_COUNT = MOVE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN_OPERATION_COUNT = MOVE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.MoveUpImpl <em>Move Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.MoveUpImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveUp()
	 * @generated
	 */
	int MOVE_UP = 20;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP__APPLY_ON = MOVE_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP__CHANGE_TO = MOVE_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP__ACTIONS = MOVE_EVENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Move Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP_FEATURE_COUNT = MOVE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP_OPERATION_COUNT = MOVE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.MoveStopVerticalyImpl <em>Move Stop Verticaly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.MoveStopVerticalyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveStopVerticaly()
	 * @generated
	 */
	int MOVE_STOP_VERTICALY = 21;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_VERTICALY__APPLY_ON = MOVE_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_VERTICALY__CHANGE_TO = MOVE_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_VERTICALY__ACTIONS = MOVE_EVENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Move Stop Verticaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_VERTICALY_FEATURE_COUNT = MOVE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Stop Verticaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_VERTICALY_OPERATION_COUNT = MOVE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.MoveLeftImpl <em>Move Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.MoveLeftImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveLeft()
	 * @generated
	 */
	int MOVE_LEFT = 22;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__APPLY_ON = MOVE_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__CHANGE_TO = MOVE_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__ACTIONS = MOVE_EVENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Move Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT_FEATURE_COUNT = MOVE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT_OPERATION_COUNT = MOVE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.MoveRightImpl <em>Move Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.MoveRightImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveRight()
	 * @generated
	 */
	int MOVE_RIGHT = 23;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RIGHT__APPLY_ON = MOVE_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RIGHT__CHANGE_TO = MOVE_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RIGHT__ACTIONS = MOVE_EVENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Move Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RIGHT_FEATURE_COUNT = MOVE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RIGHT_OPERATION_COUNT = MOVE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.MoveStopHorizontalyImpl <em>Move Stop Horizontaly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.MoveStopHorizontalyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveStopHorizontaly()
	 * @generated
	 */
	int MOVE_STOP_HORIZONTALY = 24;

	/**
	 * The feature id for the '<em><b>Apply On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_HORIZONTALY__APPLY_ON = MOVE_EVENT__APPLY_ON;

	/**
	 * The feature id for the '<em><b>Change To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_HORIZONTALY__CHANGE_TO = MOVE_EVENT__CHANGE_TO;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_HORIZONTALY__ACTIONS = MOVE_EVENT__ACTIONS;

	/**
	 * The number of structural features of the '<em>Move Stop Horizontaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_HORIZONTALY_FEATURE_COUNT = MOVE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Stop Horizontaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STOP_HORIZONTALY_OPERATION_COUNT = MOVE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.SpriteImpl <em>Sprite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.SpriteImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSprite()
	 * @generated
	 */
	int SPRITE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__MOVE = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__PARENT = 4;

	/**
	 * The feature id for the '<em><b>Default State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__DEFAULT_STATE = 5;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__SHEET = 6;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__STATES = 7;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__EVENTS = 8;

	/**
	 * The feature id for the '<em><b>Hitboxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE__HITBOXES = 9;

	/**
	 * The number of structural features of the '<em>Sprite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Sprite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.PropertyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DISPLAY = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.SoundImpl <em>Sound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.SoundImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSound()
	 * @generated
	 */
	int SOUND = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.TileImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getTile()
	 * @generated
	 */
	int TILE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__ID = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.StateImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getState()
	 * @generated
	 */
	int STATE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EVENTS = 2;

	/**
	 * The feature id for the '<em><b>Hitbox</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HITBOX = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.Action
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 30;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.ChangeSceneImpl <em>Change Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.ChangeSceneImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getChangeScene()
	 * @generated
	 */
	int CHANGE_SCENE = 31;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCENE__SCENE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCENE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCENE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.PlayImpl <em>Play</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.PlayImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getPlay()
	 * @generated
	 */
	int PLAY = 32;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__SOUND = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Play</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Play</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.AnimateImpl <em>Animate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.AnimateImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getAnimate()
	 * @generated
	 */
	int ANIMATE = 33;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE__ANIMATION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Animate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Animate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.ChangePropertyImpl <em>Change Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.ChangePropertyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getChangeProperty()
	 * @generated
	 */
	int CHANGE_PROPERTY = 34;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPERTY__PROPERTY = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPERTY__OPERATION = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPERTY__VALUE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Change Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPERTY_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Change Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPERTY_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.DestroyImpl <em>Destroy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.DestroyImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getDestroy()
	 * @generated
	 */
	int DESTROY = 35;

	/**
	 * The number of structural features of the '<em>Destroy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Destroy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.HitBoxImpl <em>Hit Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.HitBoxImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getHitBox()
	 * @generated
	 */
	int HIT_BOX = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIT_BOX__NAME = 0;

	/**
	 * The number of structural features of the '<em>Hit Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIT_BOX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hit Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIT_BOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.UIImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getUI()
	 * @generated
	 */
	int UI = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__NAME = SCENE__NAME;

	/**
	 * The feature id for the '<em><b>Follow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__FOLLOW = SCENE__FOLLOW;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__WIDGETS = SCENE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = SCENE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = SCENE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.Widget <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.Widget
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 38;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__Y = 1;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.ContainerImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 39;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BORDER = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RADIUS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STROKE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WIDTH = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HEIGHT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FILL = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SHADOW = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SHADOW_COLOR = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WIDGETS = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.TextImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 40;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PROPERTY = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LABEL = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__WEIGHT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SIZE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ALIGN = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FAMILY = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__COLOR = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__OUTLINE = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__OUTLINE_WIDTH = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.ButtonImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 41;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__X = CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__Y = CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BORDER = CONTAINER__BORDER;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__RADIUS = CONTAINER__RADIUS;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STROKE = CONTAINER__STROKE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__FILL = CONTAINER__FILL;

	/**
	 * The feature id for the '<em><b>Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SHADOW = CONTAINER__SHADOW;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SHADOW_COLOR = CONTAINER__SHADOW_COLOR;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDGETS = CONTAINER__WIDGETS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__KEY_ACTION_NAME = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__FONT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.IFrameImpl <em>IFrame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.IFrameImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getIFrame()
	 * @generated
	 */
	int IFRAME = 42;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Style Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__STYLE_POSITION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__STYLE_ZINDEX = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Frameborder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__ATTRIBUTE_FRAMEBORDER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__URL = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__WIDTH = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__HEIGHT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>IFrame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>IFrame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.impl.HTMLElementImpl <em>HTML Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.impl.HTMLElementImpl
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getHTMLElement()
	 * @generated
	 */
	int HTML_ELEMENT = 43;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__HTML = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HTML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HTML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.DisplayProperty <em>Display Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.DisplayProperty
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getDisplayProperty()
	 * @generated
	 */
	int DISPLAY_PROPERTY = 44;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_PROPERTY__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Display Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Display Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.Move <em>Move</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.Move
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 45;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.Orientation
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 46;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.Axis <em>Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.Axis
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 47;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.game.Operation <em>Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.game.Operation
	 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 48;


	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see fr.obeo.dsl.game.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Game#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.Game#getName()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Game#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenes</em>'.
	 * @see fr.obeo.dsl.game.Game#getScenes()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Scenes();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.game.Game#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stage</em>'.
	 * @see fr.obeo.dsl.game.Game#getStage()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Stage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Game#getSprites <em>Sprites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sprites</em>'.
	 * @see fr.obeo.dsl.game.Game#getSprites()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Sprites();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Game#getSounds <em>Sounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sounds</em>'.
	 * @see fr.obeo.dsl.game.Game#getSounds()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Sounds();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Game#getSheets <em>Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sheets</em>'.
	 * @see fr.obeo.dsl.game.Game#getSheets()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Sheets();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see fr.obeo.dsl.game.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Scene#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.Scene#getName()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.Scene#getFollow <em>Follow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Follow</em>'.
	 * @see fr.obeo.dsl.game.Scene#getFollow()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Follow();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.TMX <em>TMX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMX</em>'.
	 * @see fr.obeo.dsl.game.TMX
	 * @generated
	 */
	EClass getTMX();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.game.TMX#getSprites <em>Sprites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sprites</em>'.
	 * @see fr.obeo.dsl.game.TMX#getSprites()
	 * @see #getTMX()
	 * @generated
	 */
	EReference getTMX_Sprites();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.TMX#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiles</em>'.
	 * @see fr.obeo.dsl.game.TMX#getTiles()
	 * @see #getTMX()
	 * @generated
	 */
	EReference getTMX_Tiles();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Sheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheet</em>'.
	 * @see fr.obeo.dsl.game.Sheet
	 * @generated
	 */
	EClass getSheet();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Sheet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.Sheet#getName()
	 * @see #getSheet()
	 * @generated
	 */
	EAttribute getSheet_Name();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.game.Sheet#getSprites <em>Sprites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sprites</em>'.
	 * @see fr.obeo.dsl.game.Sheet#getSprites()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Sprites();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Sheet#getAnimations <em>Animations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animations</em>'.
	 * @see fr.obeo.dsl.game.Sheet#getAnimations()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Animations();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see fr.obeo.dsl.game.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Animation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.Animation#getName()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Animation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.dsl.game.Animation#getValue()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fr.obeo.dsl.game.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.game.Event#getApplyOn <em>Apply On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Apply On</em>'.
	 * @see fr.obeo.dsl.game.Event#getApplyOn()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ApplyOn();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.Event#getChangeTo <em>Change To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change To</em>'.
	 * @see fr.obeo.dsl.game.Event#getChangeTo()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ChangeTo();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Event#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.obeo.dsl.game.Event#getActions()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Actions();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Collision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision</em>'.
	 * @see fr.obeo.dsl.game.Collision
	 * @generated
	 */
	EClass getCollision();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Collision#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see fr.obeo.dsl.game.Collision#getOrientation()
	 * @see #getCollision()
	 * @generated
	 */
	EAttribute getCollision_Orientation();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.Collision#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.obeo.dsl.game.Collision#getSource()
	 * @see #getCollision()
	 * @generated
	 */
	EReference getCollision_Source();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.obeo.dsl.game.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Sensor#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see fr.obeo.dsl.game.Sensor#getOrientation()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Orientation();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.Sensor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.obeo.dsl.game.Sensor#getSource()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Source();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.KeyEvent <em>Key Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Event</em>'.
	 * @see fr.obeo.dsl.game.KeyEvent
	 * @generated
	 */
	EClass getKeyEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.KeyEvent#isKeyDown <em>Key Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Down</em>'.
	 * @see fr.obeo.dsl.game.KeyEvent#isKeyDown()
	 * @see #getKeyEvent()
	 * @generated
	 */
	EAttribute getKeyEvent_KeyDown();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.ArrowKey <em>Arrow Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow Key</em>'.
	 * @see fr.obeo.dsl.game.ArrowKey
	 * @generated
	 */
	EClass getArrowKey();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.ArrowKey#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see fr.obeo.dsl.game.ArrowKey#getOrientation()
	 * @see #getArrowKey()
	 * @generated
	 */
	EAttribute getArrowKey_Orientation();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.FireKey <em>Fire Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fire Key</em>'.
	 * @see fr.obeo.dsl.game.FireKey
	 * @generated
	 */
	EClass getFireKey();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.ActionKey <em>Action Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Key</em>'.
	 * @see fr.obeo.dsl.game.ActionKey
	 * @generated
	 */
	EClass getActionKey();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.ConfirmKey <em>Confirm Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confirm Key</em>'.
	 * @see fr.obeo.dsl.game.ConfirmKey
	 * @generated
	 */
	EClass getConfirmKey();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.EscapeKey <em>Escape Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escape Key</em>'.
	 * @see fr.obeo.dsl.game.EscapeKey
	 * @generated
	 */
	EClass getEscapeKey();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.PauseKey <em>Pause Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pause Key</em>'.
	 * @see fr.obeo.dsl.game.PauseKey
	 * @generated
	 */
	EClass getPauseKey();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.SaveKey <em>Save Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save Key</em>'.
	 * @see fr.obeo.dsl.game.SaveKey
	 * @generated
	 */
	EClass getSaveKey();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see fr.obeo.dsl.game.Jump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Jumped <em>Jumped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jumped</em>'.
	 * @see fr.obeo.dsl.game.Jumped
	 * @generated
	 */
	EClass getJumped();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.MoveEvent <em>Move Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Event</em>'.
	 * @see fr.obeo.dsl.game.MoveEvent
	 * @generated
	 */
	EClass getMoveEvent();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.MoveDown <em>Move Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Down</em>'.
	 * @see fr.obeo.dsl.game.MoveDown
	 * @generated
	 */
	EClass getMoveDown();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.MoveUp <em>Move Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Up</em>'.
	 * @see fr.obeo.dsl.game.MoveUp
	 * @generated
	 */
	EClass getMoveUp();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.MoveStopVerticaly <em>Move Stop Verticaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Stop Verticaly</em>'.
	 * @see fr.obeo.dsl.game.MoveStopVerticaly
	 * @generated
	 */
	EClass getMoveStopVerticaly();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.MoveLeft <em>Move Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Left</em>'.
	 * @see fr.obeo.dsl.game.MoveLeft
	 * @generated
	 */
	EClass getMoveLeft();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.MoveRight <em>Move Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Right</em>'.
	 * @see fr.obeo.dsl.game.MoveRight
	 * @generated
	 */
	EClass getMoveRight();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.MoveStopHorizontaly <em>Move Stop Horizontaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Stop Horizontaly</em>'.
	 * @see fr.obeo.dsl.game.MoveStopHorizontaly
	 * @generated
	 */
	EClass getMoveStopHorizontaly();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Sprite <em>Sprite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sprite</em>'.
	 * @see fr.obeo.dsl.game.Sprite
	 * @generated
	 */
	EClass getSprite();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Sprite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getName()
	 * @see #getSprite()
	 * @generated
	 */
	EAttribute getSprite_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Sprite#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getClassName()
	 * @see #getSprite()
	 * @generated
	 */
	EAttribute getSprite_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Sprite#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getProperties()
	 * @see #getSprite()
	 * @generated
	 */
	EReference getSprite_Properties();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Sprite#getMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getMove()
	 * @see #getSprite()
	 * @generated
	 */
	EAttribute getSprite_Move();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.Sprite#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getParent()
	 * @see #getSprite()
	 * @generated
	 */
	EReference getSprite_Parent();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.Sprite#getDefaultState <em>Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default State</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getDefaultState()
	 * @see #getSprite()
	 * @generated
	 */
	EReference getSprite_DefaultState();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.Sprite#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sheet</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getSheet()
	 * @see #getSprite()
	 * @generated
	 */
	EReference getSprite_Sheet();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Sprite#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getStates()
	 * @see #getSprite()
	 * @generated
	 */
	EReference getSprite_States();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Sprite#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getEvents()
	 * @see #getSprite()
	 * @generated
	 */
	EReference getSprite_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Sprite#getHitboxes <em>Hitboxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hitboxes</em>'.
	 * @see fr.obeo.dsl.game.Sprite#getHitboxes()
	 * @see #getSprite()
	 * @generated
	 */
	EReference getSprite_Hitboxes();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see fr.obeo.dsl.game.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.game.Property#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Display</em>'.
	 * @see fr.obeo.dsl.game.Property#getDisplay()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Display();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Sound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound</em>'.
	 * @see fr.obeo.dsl.game.Sound
	 * @generated
	 */
	EClass getSound();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Sound#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.Sound#getName()
	 * @see #getSound()
	 * @generated
	 */
	EAttribute getSound_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see fr.obeo.dsl.game.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Tile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.Tile#getName()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Tile#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.obeo.dsl.game.Tile#getId()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Tile#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see fr.obeo.dsl.game.Tile#getProperties()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Properties();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.obeo.dsl.game.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.obeo.dsl.game.State#getActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Actions();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.game.State#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see fr.obeo.dsl.game.State#getEvents()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Events();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.State#getHitbox <em>Hitbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hitbox</em>'.
	 * @see fr.obeo.dsl.game.State#getHitbox()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Hitbox();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.obeo.dsl.game.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.ChangeScene <em>Change Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Scene</em>'.
	 * @see fr.obeo.dsl.game.ChangeScene
	 * @generated
	 */
	EClass getChangeScene();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.ChangeScene#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scene</em>'.
	 * @see fr.obeo.dsl.game.ChangeScene#getScene()
	 * @see #getChangeScene()
	 * @generated
	 */
	EReference getChangeScene_Scene();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Play <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play</em>'.
	 * @see fr.obeo.dsl.game.Play
	 * @generated
	 */
	EClass getPlay();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.Play#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sound</em>'.
	 * @see fr.obeo.dsl.game.Play#getSound()
	 * @see #getPlay()
	 * @generated
	 */
	EReference getPlay_Sound();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Animate <em>Animate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animate</em>'.
	 * @see fr.obeo.dsl.game.Animate
	 * @generated
	 */
	EClass getAnimate();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.Animate#getAnimation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Animation</em>'.
	 * @see fr.obeo.dsl.game.Animate#getAnimation()
	 * @see #getAnimate()
	 * @generated
	 */
	EReference getAnimate_Animation();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.ChangeProperty <em>Change Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Property</em>'.
	 * @see fr.obeo.dsl.game.ChangeProperty
	 * @generated
	 */
	EClass getChangeProperty();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.ChangeProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see fr.obeo.dsl.game.ChangeProperty#getProperty()
	 * @see #getChangeProperty()
	 * @generated
	 */
	EReference getChangeProperty_Property();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.ChangeProperty#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see fr.obeo.dsl.game.ChangeProperty#getOperation()
	 * @see #getChangeProperty()
	 * @generated
	 */
	EAttribute getChangeProperty_Operation();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.ChangeProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see fr.obeo.dsl.game.ChangeProperty#getValue()
	 * @see #getChangeProperty()
	 * @generated
	 */
	EReference getChangeProperty_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Destroy <em>Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy</em>'.
	 * @see fr.obeo.dsl.game.Destroy
	 * @generated
	 */
	EClass getDestroy();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.HitBox <em>Hit Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hit Box</em>'.
	 * @see fr.obeo.dsl.game.HitBox
	 * @generated
	 */
	EClass getHitBox();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.HitBox#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.game.HitBox#getName()
	 * @see #getHitBox()
	 * @generated
	 */
	EAttribute getHitBox_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see fr.obeo.dsl.game.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.UI#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see fr.obeo.dsl.game.UI#getWidgets()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Widgets();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see fr.obeo.dsl.game.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Widget#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see fr.obeo.dsl.game.Widget#getX()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_X();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Widget#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see fr.obeo.dsl.game.Widget#getY()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Y();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see fr.obeo.dsl.game.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Container#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see fr.obeo.dsl.game.Container#getBorder()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Border();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Container#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see fr.obeo.dsl.game.Container#getRadius()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Radius();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Container#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see fr.obeo.dsl.game.Container#getStroke()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Container#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.obeo.dsl.game.Container#getWidth()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Width();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Container#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see fr.obeo.dsl.game.Container#getHeight()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Height();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Container#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see fr.obeo.dsl.game.Container#getFill()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Fill();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Container#isShadow <em>Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow</em>'.
	 * @see fr.obeo.dsl.game.Container#isShadow()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Shadow();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Container#getShadowColor <em>Shadow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Color</em>'.
	 * @see fr.obeo.dsl.game.Container#getShadowColor()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_ShadowColor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.game.Container#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see fr.obeo.dsl.game.Container#getWidgets()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Widgets();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see fr.obeo.dsl.game.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Text#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see fr.obeo.dsl.game.Text#getLabel()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Label();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Text#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.obeo.dsl.game.Text#getWeight()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Weight();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Text#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see fr.obeo.dsl.game.Text#getSize()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Size();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Text#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see fr.obeo.dsl.game.Text#getAlign()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Align();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Text#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see fr.obeo.dsl.game.Text#getFamily()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Family();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Text#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.obeo.dsl.game.Text#getColor()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Color();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Text#getOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see fr.obeo.dsl.game.Text#getOutline()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Outline();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Text#getOutlineWidth <em>Outline Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline Width</em>'.
	 * @see fr.obeo.dsl.game.Text#getOutlineWidth()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_OutlineWidth();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see fr.obeo.dsl.game.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Button#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see fr.obeo.dsl.game.Button#getLabel()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Label();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Button#getKeyActionName <em>Key Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Action Name</em>'.
	 * @see fr.obeo.dsl.game.Button#getKeyActionName()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_KeyActionName();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.Button#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see fr.obeo.dsl.game.Button#getFont()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Font();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.IFrame <em>IFrame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFrame</em>'.
	 * @see fr.obeo.dsl.game.IFrame
	 * @generated
	 */
	EClass getIFrame();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.IFrame#getStylePosition <em>Style Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Position</em>'.
	 * @see fr.obeo.dsl.game.IFrame#getStylePosition()
	 * @see #getIFrame()
	 * @generated
	 */
	EAttribute getIFrame_StylePosition();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.IFrame#getStyleZIndex <em>Style ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style ZIndex</em>'.
	 * @see fr.obeo.dsl.game.IFrame#getStyleZIndex()
	 * @see #getIFrame()
	 * @generated
	 */
	EAttribute getIFrame_StyleZIndex();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.IFrame#getAttributeFrameborder <em>Attribute Frameborder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Frameborder</em>'.
	 * @see fr.obeo.dsl.game.IFrame#getAttributeFrameborder()
	 * @see #getIFrame()
	 * @generated
	 */
	EAttribute getIFrame_AttributeFrameborder();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.IFrame#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see fr.obeo.dsl.game.IFrame#getUrl()
	 * @see #getIFrame()
	 * @generated
	 */
	EAttribute getIFrame_Url();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.IFrame#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.obeo.dsl.game.IFrame#getWidth()
	 * @see #getIFrame()
	 * @generated
	 */
	EAttribute getIFrame_Width();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.IFrame#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see fr.obeo.dsl.game.IFrame#getHeight()
	 * @see #getIFrame()
	 * @generated
	 */
	EAttribute getIFrame_Height();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.HTMLElement <em>HTML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Element</em>'.
	 * @see fr.obeo.dsl.game.HTMLElement
	 * @generated
	 */
	EClass getHTMLElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.game.HTMLElement#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see fr.obeo.dsl.game.HTMLElement#getHtml()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EAttribute getHTMLElement_Html();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.game.DisplayProperty <em>Display Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Property</em>'.
	 * @see fr.obeo.dsl.game.DisplayProperty
	 * @generated
	 */
	EClass getDisplayProperty();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.game.DisplayProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see fr.obeo.dsl.game.DisplayProperty#getProperty()
	 * @see #getDisplayProperty()
	 * @generated
	 */
	EReference getDisplayProperty_Property();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.game.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Move</em>'.
	 * @see fr.obeo.dsl.game.Move
	 * @generated
	 */
	EEnum getMove();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.game.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see fr.obeo.dsl.game.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.game.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis</em>'.
	 * @see fr.obeo.dsl.game.Axis
	 * @generated
	 */
	EEnum getAxis();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.game.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation</em>'.
	 * @see fr.obeo.dsl.game.Operation
	 * @generated
	 */
	EEnum getOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GameFactory getGameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.GameImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__NAME = eINSTANCE.getGame_Name();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SCENES = eINSTANCE.getGame_Scenes();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__STAGE = eINSTANCE.getGame_Stage();

		/**
		 * The meta object literal for the '<em><b>Sprites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SPRITES = eINSTANCE.getGame_Sprites();

		/**
		 * The meta object literal for the '<em><b>Sounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SOUNDS = eINSTANCE.getGame_Sounds();

		/**
		 * The meta object literal for the '<em><b>Sheets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SHEETS = eINSTANCE.getGame_Sheets();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.Scene <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.Scene
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__NAME = eINSTANCE.getScene_Name();

		/**
		 * The meta object literal for the '<em><b>Follow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__FOLLOW = eINSTANCE.getScene_Follow();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.TMXImpl <em>TMX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.TMXImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getTMX()
		 * @generated
		 */
		EClass TMX = eINSTANCE.getTMX();

		/**
		 * The meta object literal for the '<em><b>Sprites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMX__SPRITES = eINSTANCE.getTMX_Sprites();

		/**
		 * The meta object literal for the '<em><b>Tiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMX__TILES = eINSTANCE.getTMX_Tiles();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.SheetImpl <em>Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.SheetImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSheet()
		 * @generated
		 */
		EClass SHEET = eINSTANCE.getSheet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET__NAME = eINSTANCE.getSheet_Name();

		/**
		 * The meta object literal for the '<em><b>Sprites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__SPRITES = eINSTANCE.getSheet_Sprites();

		/**
		 * The meta object literal for the '<em><b>Animations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__ANIMATIONS = eINSTANCE.getSheet_Animations();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.AnimationImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__NAME = eINSTANCE.getAnimation_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__VALUE = eINSTANCE.getAnimation_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.Event <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.Event
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Apply On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__APPLY_ON = eINSTANCE.getEvent_ApplyOn();

		/**
		 * The meta object literal for the '<em><b>Change To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CHANGE_TO = eINSTANCE.getEvent_ChangeTo();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ACTIONS = eINSTANCE.getEvent_Actions();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.CollisionImpl <em>Collision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.CollisionImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getCollision()
		 * @generated
		 */
		EClass COLLISION = eINSTANCE.getCollision();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLISION__ORIENTATION = eINSTANCE.getCollision_Orientation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION__SOURCE = eINSTANCE.getCollision_Source();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.SensorImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__ORIENTATION = eINSTANCE.getSensor_Orientation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SOURCE = eINSTANCE.getSensor_Source();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.KeyEventImpl <em>Key Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.KeyEventImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getKeyEvent()
		 * @generated
		 */
		EClass KEY_EVENT = eINSTANCE.getKeyEvent();

		/**
		 * The meta object literal for the '<em><b>Key Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_EVENT__KEY_DOWN = eINSTANCE.getKeyEvent_KeyDown();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.ArrowKeyImpl <em>Arrow Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.ArrowKeyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getArrowKey()
		 * @generated
		 */
		EClass ARROW_KEY = eINSTANCE.getArrowKey();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW_KEY__ORIENTATION = eINSTANCE.getArrowKey_Orientation();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.FireKeyImpl <em>Fire Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.FireKeyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getFireKey()
		 * @generated
		 */
		EClass FIRE_KEY = eINSTANCE.getFireKey();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.ActionKeyImpl <em>Action Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.ActionKeyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getActionKey()
		 * @generated
		 */
		EClass ACTION_KEY = eINSTANCE.getActionKey();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.ConfirmKeyImpl <em>Confirm Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.ConfirmKeyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getConfirmKey()
		 * @generated
		 */
		EClass CONFIRM_KEY = eINSTANCE.getConfirmKey();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.EscapeKeyImpl <em>Escape Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.EscapeKeyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getEscapeKey()
		 * @generated
		 */
		EClass ESCAPE_KEY = eINSTANCE.getEscapeKey();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.PauseKeyImpl <em>Pause Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.PauseKeyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getPauseKey()
		 * @generated
		 */
		EClass PAUSE_KEY = eINSTANCE.getPauseKey();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.SaveKeyImpl <em>Save Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.SaveKeyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSaveKey()
		 * @generated
		 */
		EClass SAVE_KEY = eINSTANCE.getSaveKey();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.JumpImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getJump()
		 * @generated
		 */
		EClass JUMP = eINSTANCE.getJump();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.JumpedImpl <em>Jumped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.JumpedImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getJumped()
		 * @generated
		 */
		EClass JUMPED = eINSTANCE.getJumped();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.MoveEventImpl <em>Move Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.MoveEventImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveEvent()
		 * @generated
		 */
		EClass MOVE_EVENT = eINSTANCE.getMoveEvent();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.MoveDownImpl <em>Move Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.MoveDownImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveDown()
		 * @generated
		 */
		EClass MOVE_DOWN = eINSTANCE.getMoveDown();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.MoveUpImpl <em>Move Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.MoveUpImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveUp()
		 * @generated
		 */
		EClass MOVE_UP = eINSTANCE.getMoveUp();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.MoveStopVerticalyImpl <em>Move Stop Verticaly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.MoveStopVerticalyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveStopVerticaly()
		 * @generated
		 */
		EClass MOVE_STOP_VERTICALY = eINSTANCE.getMoveStopVerticaly();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.MoveLeftImpl <em>Move Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.MoveLeftImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveLeft()
		 * @generated
		 */
		EClass MOVE_LEFT = eINSTANCE.getMoveLeft();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.MoveRightImpl <em>Move Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.MoveRightImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveRight()
		 * @generated
		 */
		EClass MOVE_RIGHT = eINSTANCE.getMoveRight();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.MoveStopHorizontalyImpl <em>Move Stop Horizontaly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.MoveStopHorizontalyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMoveStopHorizontaly()
		 * @generated
		 */
		EClass MOVE_STOP_HORIZONTALY = eINSTANCE.getMoveStopHorizontaly();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.SpriteImpl <em>Sprite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.SpriteImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSprite()
		 * @generated
		 */
		EClass SPRITE = eINSTANCE.getSprite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRITE__NAME = eINSTANCE.getSprite_Name();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRITE__CLASS_NAME = eINSTANCE.getSprite_ClassName();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRITE__PROPERTIES = eINSTANCE.getSprite_Properties();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRITE__MOVE = eINSTANCE.getSprite_Move();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRITE__PARENT = eINSTANCE.getSprite_Parent();

		/**
		 * The meta object literal for the '<em><b>Default State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRITE__DEFAULT_STATE = eINSTANCE.getSprite_DefaultState();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRITE__SHEET = eINSTANCE.getSprite_Sheet();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRITE__STATES = eINSTANCE.getSprite_States();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRITE__EVENTS = eINSTANCE.getSprite_Events();

		/**
		 * The meta object literal for the '<em><b>Hitboxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRITE__HITBOXES = eINSTANCE.getSprite_Hitboxes();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.PropertyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DISPLAY = eINSTANCE.getProperty_Display();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.SoundImpl <em>Sound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.SoundImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getSound()
		 * @generated
		 */
		EClass SOUND = eINSTANCE.getSound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUND__NAME = eINSTANCE.getSound_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.TileImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__NAME = eINSTANCE.getTile_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__ID = eINSTANCE.getTile_Id();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__PROPERTIES = eINSTANCE.getTile_Properties();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.StateImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EVENTS = eINSTANCE.getState_Events();

		/**
		 * The meta object literal for the '<em><b>Hitbox</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__HITBOX = eINSTANCE.getState_Hitbox();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.Action
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.ChangeSceneImpl <em>Change Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.ChangeSceneImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getChangeScene()
		 * @generated
		 */
		EClass CHANGE_SCENE = eINSTANCE.getChangeScene();

		/**
		 * The meta object literal for the '<em><b>Scene</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_SCENE__SCENE = eINSTANCE.getChangeScene_Scene();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.PlayImpl <em>Play</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.PlayImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getPlay()
		 * @generated
		 */
		EClass PLAY = eINSTANCE.getPlay();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY__SOUND = eINSTANCE.getPlay_Sound();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.AnimateImpl <em>Animate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.AnimateImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getAnimate()
		 * @generated
		 */
		EClass ANIMATE = eINSTANCE.getAnimate();

		/**
		 * The meta object literal for the '<em><b>Animation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMATE__ANIMATION = eINSTANCE.getAnimate_Animation();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.ChangePropertyImpl <em>Change Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.ChangePropertyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getChangeProperty()
		 * @generated
		 */
		EClass CHANGE_PROPERTY = eINSTANCE.getChangeProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPERTY__PROPERTY = eINSTANCE.getChangeProperty_Property();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_PROPERTY__OPERATION = eINSTANCE.getChangeProperty_Operation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPERTY__VALUE = eINSTANCE.getChangeProperty_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.DestroyImpl <em>Destroy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.DestroyImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getDestroy()
		 * @generated
		 */
		EClass DESTROY = eINSTANCE.getDestroy();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.HitBoxImpl <em>Hit Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.HitBoxImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getHitBox()
		 * @generated
		 */
		EClass HIT_BOX = eINSTANCE.getHitBox();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIT_BOX__NAME = eINSTANCE.getHitBox_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.UIImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__WIDGETS = eINSTANCE.getUI_Widgets();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.Widget <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.Widget
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__X = eINSTANCE.getWidget_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__Y = eINSTANCE.getWidget_Y();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.ContainerImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__BORDER = eINSTANCE.getContainer_Border();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__RADIUS = eINSTANCE.getContainer_Radius();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__STROKE = eINSTANCE.getContainer_Stroke();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__WIDTH = eINSTANCE.getContainer_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__HEIGHT = eINSTANCE.getContainer_Height();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__FILL = eINSTANCE.getContainer_Fill();

		/**
		 * The meta object literal for the '<em><b>Shadow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__SHADOW = eINSTANCE.getContainer_Shadow();

		/**
		 * The meta object literal for the '<em><b>Shadow Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__SHADOW_COLOR = eINSTANCE.getContainer_ShadowColor();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__WIDGETS = eINSTANCE.getContainer_Widgets();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.TextImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__LABEL = eINSTANCE.getText_Label();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__WEIGHT = eINSTANCE.getText_Weight();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__SIZE = eINSTANCE.getText_Size();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ALIGN = eINSTANCE.getText_Align();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__FAMILY = eINSTANCE.getText_Family();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__COLOR = eINSTANCE.getText_Color();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__OUTLINE = eINSTANCE.getText_Outline();

		/**
		 * The meta object literal for the '<em><b>Outline Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__OUTLINE_WIDTH = eINSTANCE.getText_OutlineWidth();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.ButtonImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__LABEL = eINSTANCE.getButton_Label();

		/**
		 * The meta object literal for the '<em><b>Key Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__KEY_ACTION_NAME = eINSTANCE.getButton_KeyActionName();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__FONT = eINSTANCE.getButton_Font();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.IFrameImpl <em>IFrame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.IFrameImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getIFrame()
		 * @generated
		 */
		EClass IFRAME = eINSTANCE.getIFrame();

		/**
		 * The meta object literal for the '<em><b>Style Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFRAME__STYLE_POSITION = eINSTANCE.getIFrame_StylePosition();

		/**
		 * The meta object literal for the '<em><b>Style ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFRAME__STYLE_ZINDEX = eINSTANCE.getIFrame_StyleZIndex();

		/**
		 * The meta object literal for the '<em><b>Attribute Frameborder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFRAME__ATTRIBUTE_FRAMEBORDER = eINSTANCE.getIFrame_AttributeFrameborder();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFRAME__URL = eINSTANCE.getIFrame_Url();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFRAME__WIDTH = eINSTANCE.getIFrame_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFRAME__HEIGHT = eINSTANCE.getIFrame_Height();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.impl.HTMLElementImpl <em>HTML Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.impl.HTMLElementImpl
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getHTMLElement()
		 * @generated
		 */
		EClass HTML_ELEMENT = eINSTANCE.getHTMLElement();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__HTML = eINSTANCE.getHTMLElement_Html();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.DisplayProperty <em>Display Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.DisplayProperty
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getDisplayProperty()
		 * @generated
		 */
		EClass DISPLAY_PROPERTY = eINSTANCE.getDisplayProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_PROPERTY__PROPERTY = eINSTANCE.getDisplayProperty_Property();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.Move <em>Move</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.Move
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getMove()
		 * @generated
		 */
		EEnum MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.Orientation
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.Axis <em>Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.Axis
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getAxis()
		 * @generated
		 */
		EEnum AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.game.Operation <em>Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.game.Operation
		 * @see fr.obeo.dsl.game.impl.GamePackageImpl#getOperation()
		 * @generated
		 */
		EEnum OPERATION = eINSTANCE.getOperation();

	}

} //GamePackage
