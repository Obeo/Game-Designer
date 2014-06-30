/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.Event;
import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.HitBox;
import fr.obeo.dsl.game.Move;
import fr.obeo.dsl.game.Property;
import fr.obeo.dsl.game.Sheet;
import fr.obeo.dsl.game.Sprite;
import fr.obeo.dsl.game.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sprite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getMove <em>Move</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getDefaultState <em>Default State</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getStates <em>States</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SpriteImpl#getHitboxes <em>Hitboxes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpriteImpl extends MinimalEObjectImpl.Container implements Sprite {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #getMove() <em>Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMove()
	 * @generated
	 * @ordered
	 */
	protected static final Move MOVE_EDEFAULT = Move.NONE;

	/**
	 * The cached value of the '{@link #getMove() <em>Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMove()
	 * @generated
	 * @ordered
	 */
	protected Move move = MOVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Sprite parent;

	/**
	 * The cached value of the '{@link #getDefaultState() <em>Default State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultState()
	 * @generated
	 * @ordered
	 */
	protected State defaultState;

	/**
	 * The cached value of the '{@link #getSheet() <em>Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected Sheet sheet;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getHitboxes() <em>Hitboxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitboxes()
	 * @generated
	 * @ordered
	 */
	protected EList<HitBox> hitboxes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.SPRITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SPRITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SPRITE__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, GamePackage.SPRITE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getMove() {
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMove(Move newMove) {
		Move oldMove = move;
		move = newMove == null ? MOVE_EDEFAULT : newMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SPRITE__MOVE, oldMove, move));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprite getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Sprite)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.SPRITE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprite basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Sprite newParent) {
		Sprite oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SPRITE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getDefaultState() {
		if (defaultState != null && defaultState.eIsProxy()) {
			InternalEObject oldDefaultState = (InternalEObject)defaultState;
			defaultState = (State)eResolveProxy(oldDefaultState);
			if (defaultState != oldDefaultState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.SPRITE__DEFAULT_STATE, oldDefaultState, defaultState));
			}
		}
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetDefaultState() {
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultState(State newDefaultState) {
		State oldDefaultState = defaultState;
		defaultState = newDefaultState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SPRITE__DEFAULT_STATE, oldDefaultState, defaultState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sheet getSheet() {
		if (sheet != null && sheet.eIsProxy()) {
			InternalEObject oldSheet = (InternalEObject)sheet;
			sheet = (Sheet)eResolveProxy(oldSheet);
			if (sheet != oldSheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.SPRITE__SHEET, oldSheet, sheet));
			}
		}
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sheet basicGetSheet() {
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheet(Sheet newSheet, NotificationChain msgs) {
		Sheet oldSheet = sheet;
		sheet = newSheet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.SPRITE__SHEET, oldSheet, newSheet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheet(Sheet newSheet) {
		if (newSheet != sheet) {
			NotificationChain msgs = null;
			if (sheet != null)
				msgs = ((InternalEObject)sheet).eInverseRemove(this, GamePackage.SHEET__SPRITES, Sheet.class, msgs);
			if (newSheet != null)
				msgs = ((InternalEObject)newSheet).eInverseAdd(this, GamePackage.SHEET__SPRITES, Sheet.class, msgs);
			msgs = basicSetSheet(newSheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SPRITE__SHEET, newSheet, newSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, GamePackage.SPRITE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, GamePackage.SPRITE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HitBox> getHitboxes() {
		if (hitboxes == null) {
			hitboxes = new EObjectContainmentEList<HitBox>(HitBox.class, this, GamePackage.SPRITE__HITBOXES);
		}
		return hitboxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.SPRITE__SHEET:
				if (sheet != null)
					msgs = ((InternalEObject)sheet).eInverseRemove(this, GamePackage.SHEET__SPRITES, Sheet.class, msgs);
				return basicSetSheet((Sheet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.SPRITE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case GamePackage.SPRITE__SHEET:
				return basicSetSheet(null, msgs);
			case GamePackage.SPRITE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case GamePackage.SPRITE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case GamePackage.SPRITE__HITBOXES:
				return ((InternalEList<?>)getHitboxes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamePackage.SPRITE__NAME:
				return getName();
			case GamePackage.SPRITE__CLASS_NAME:
				return getClassName();
			case GamePackage.SPRITE__PROPERTIES:
				return getProperties();
			case GamePackage.SPRITE__MOVE:
				return getMove();
			case GamePackage.SPRITE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case GamePackage.SPRITE__DEFAULT_STATE:
				if (resolve) return getDefaultState();
				return basicGetDefaultState();
			case GamePackage.SPRITE__SHEET:
				if (resolve) return getSheet();
				return basicGetSheet();
			case GamePackage.SPRITE__STATES:
				return getStates();
			case GamePackage.SPRITE__EVENTS:
				return getEvents();
			case GamePackage.SPRITE__HITBOXES:
				return getHitboxes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GamePackage.SPRITE__NAME:
				setName((String)newValue);
				return;
			case GamePackage.SPRITE__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case GamePackage.SPRITE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case GamePackage.SPRITE__MOVE:
				setMove((Move)newValue);
				return;
			case GamePackage.SPRITE__PARENT:
				setParent((Sprite)newValue);
				return;
			case GamePackage.SPRITE__DEFAULT_STATE:
				setDefaultState((State)newValue);
				return;
			case GamePackage.SPRITE__SHEET:
				setSheet((Sheet)newValue);
				return;
			case GamePackage.SPRITE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case GamePackage.SPRITE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case GamePackage.SPRITE__HITBOXES:
				getHitboxes().clear();
				getHitboxes().addAll((Collection<? extends HitBox>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GamePackage.SPRITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamePackage.SPRITE__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case GamePackage.SPRITE__PROPERTIES:
				getProperties().clear();
				return;
			case GamePackage.SPRITE__MOVE:
				setMove(MOVE_EDEFAULT);
				return;
			case GamePackage.SPRITE__PARENT:
				setParent((Sprite)null);
				return;
			case GamePackage.SPRITE__DEFAULT_STATE:
				setDefaultState((State)null);
				return;
			case GamePackage.SPRITE__SHEET:
				setSheet((Sheet)null);
				return;
			case GamePackage.SPRITE__STATES:
				getStates().clear();
				return;
			case GamePackage.SPRITE__EVENTS:
				getEvents().clear();
				return;
			case GamePackage.SPRITE__HITBOXES:
				getHitboxes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GamePackage.SPRITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamePackage.SPRITE__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case GamePackage.SPRITE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case GamePackage.SPRITE__MOVE:
				return move != MOVE_EDEFAULT;
			case GamePackage.SPRITE__PARENT:
				return parent != null;
			case GamePackage.SPRITE__DEFAULT_STATE:
				return defaultState != null;
			case GamePackage.SPRITE__SHEET:
				return sheet != null;
			case GamePackage.SPRITE__STATES:
				return states != null && !states.isEmpty();
			case GamePackage.SPRITE__EVENTS:
				return events != null && !events.isEmpty();
			case GamePackage.SPRITE__HITBOXES:
				return hitboxes != null && !hitboxes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", className: ");
		result.append(className);
		result.append(", move: ");
		result.append(move);
		result.append(')');
		return result.toString();
	}

} //SpriteImpl
