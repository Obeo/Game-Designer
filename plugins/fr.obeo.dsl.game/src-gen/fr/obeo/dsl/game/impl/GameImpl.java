/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.Game;
import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.Scene;
import fr.obeo.dsl.game.Sheet;
import fr.obeo.dsl.game.Sound;
import fr.obeo.dsl.game.Sprite;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.impl.GameImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.GameImpl#getScenes <em>Scenes</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.GameImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.GameImpl#getSprites <em>Sprites</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.GameImpl#getSounds <em>Sounds</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.GameImpl#getSheets <em>Sheets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
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
	 * The cached value of the '{@link #getScenes() <em>Scenes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> scenes;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> stage;

	/**
	 * The cached value of the '{@link #getSprites() <em>Sprites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprites()
	 * @generated
	 * @ordered
	 */
	protected EList<Sprite> sprites;

	/**
	 * The cached value of the '{@link #getSounds() <em>Sounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSounds()
	 * @generated
	 * @ordered
	 */
	protected EList<Sound> sounds;

	/**
	 * The cached value of the '{@link #getSheets() <em>Sheets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheets()
	 * @generated
	 * @ordered
	 */
	protected EList<Sheet> sheets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.GAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scene> getScenes() {
		if (scenes == null) {
			scenes = new EObjectContainmentEList<Scene>(Scene.class, this, GamePackage.GAME__SCENES);
		}
		return scenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scene> getStage() {
		if (stage == null) {
			stage = new EObjectResolvingEList<Scene>(Scene.class, this, GamePackage.GAME__STAGE);
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sprite> getSprites() {
		if (sprites == null) {
			sprites = new EObjectContainmentEList<Sprite>(Sprite.class, this, GamePackage.GAME__SPRITES);
		}
		return sprites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sound> getSounds() {
		if (sounds == null) {
			sounds = new EObjectContainmentEList<Sound>(Sound.class, this, GamePackage.GAME__SOUNDS);
		}
		return sounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sheet> getSheets() {
		if (sheets == null) {
			sheets = new EObjectContainmentEList<Sheet>(Sheet.class, this, GamePackage.GAME__SHEETS);
		}
		return sheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.GAME__SCENES:
				return ((InternalEList<?>)getScenes()).basicRemove(otherEnd, msgs);
			case GamePackage.GAME__SPRITES:
				return ((InternalEList<?>)getSprites()).basicRemove(otherEnd, msgs);
			case GamePackage.GAME__SOUNDS:
				return ((InternalEList<?>)getSounds()).basicRemove(otherEnd, msgs);
			case GamePackage.GAME__SHEETS:
				return ((InternalEList<?>)getSheets()).basicRemove(otherEnd, msgs);
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
			case GamePackage.GAME__NAME:
				return getName();
			case GamePackage.GAME__SCENES:
				return getScenes();
			case GamePackage.GAME__STAGE:
				return getStage();
			case GamePackage.GAME__SPRITES:
				return getSprites();
			case GamePackage.GAME__SOUNDS:
				return getSounds();
			case GamePackage.GAME__SHEETS:
				return getSheets();
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
			case GamePackage.GAME__NAME:
				setName((String)newValue);
				return;
			case GamePackage.GAME__SCENES:
				getScenes().clear();
				getScenes().addAll((Collection<? extends Scene>)newValue);
				return;
			case GamePackage.GAME__STAGE:
				getStage().clear();
				getStage().addAll((Collection<? extends Scene>)newValue);
				return;
			case GamePackage.GAME__SPRITES:
				getSprites().clear();
				getSprites().addAll((Collection<? extends Sprite>)newValue);
				return;
			case GamePackage.GAME__SOUNDS:
				getSounds().clear();
				getSounds().addAll((Collection<? extends Sound>)newValue);
				return;
			case GamePackage.GAME__SHEETS:
				getSheets().clear();
				getSheets().addAll((Collection<? extends Sheet>)newValue);
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
			case GamePackage.GAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamePackage.GAME__SCENES:
				getScenes().clear();
				return;
			case GamePackage.GAME__STAGE:
				getStage().clear();
				return;
			case GamePackage.GAME__SPRITES:
				getSprites().clear();
				return;
			case GamePackage.GAME__SOUNDS:
				getSounds().clear();
				return;
			case GamePackage.GAME__SHEETS:
				getSheets().clear();
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
			case GamePackage.GAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamePackage.GAME__SCENES:
				return scenes != null && !scenes.isEmpty();
			case GamePackage.GAME__STAGE:
				return stage != null && !stage.isEmpty();
			case GamePackage.GAME__SPRITES:
				return sprites != null && !sprites.isEmpty();
			case GamePackage.GAME__SOUNDS:
				return sounds != null && !sounds.isEmpty();
			case GamePackage.GAME__SHEETS:
				return sheets != null && !sheets.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //GameImpl
