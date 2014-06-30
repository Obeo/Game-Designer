/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.Sprite;
import fr.obeo.dsl.game.TMX;
import fr.obeo.dsl.game.Tile;

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
 * An implementation of the model object '<em><b>TMX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.impl.TMXImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.TMXImpl#getFollow <em>Follow</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.TMXImpl#getSprites <em>Sprites</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.TMXImpl#getTiles <em>Tiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TMXImpl extends MinimalEObjectImpl.Container implements TMX {
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
	 * The cached value of the '{@link #getFollow() <em>Follow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollow()
	 * @generated
	 * @ordered
	 */
	protected Sprite follow;

	/**
	 * The cached value of the '{@link #getSprites() <em>Sprites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprites()
	 * @generated
	 * @ordered
	 */
	protected EList<Sprite> sprites;

	/**
	 * The cached value of the '{@link #getTiles() <em>Tiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> tiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.TMX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TMX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprite getFollow() {
		if (follow != null && follow.eIsProxy()) {
			InternalEObject oldFollow = (InternalEObject)follow;
			follow = (Sprite)eResolveProxy(oldFollow);
			if (follow != oldFollow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.TMX__FOLLOW, oldFollow, follow));
			}
		}
		return follow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprite basicGetFollow() {
		return follow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollow(Sprite newFollow) {
		Sprite oldFollow = follow;
		follow = newFollow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TMX__FOLLOW, oldFollow, follow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sprite> getSprites() {
		if (sprites == null) {
			sprites = new EObjectResolvingEList<Sprite>(Sprite.class, this, GamePackage.TMX__SPRITES);
		}
		return sprites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tile> getTiles() {
		if (tiles == null) {
			tiles = new EObjectContainmentEList<Tile>(Tile.class, this, GamePackage.TMX__TILES);
		}
		return tiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.TMX__TILES:
				return ((InternalEList<?>)getTiles()).basicRemove(otherEnd, msgs);
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
			case GamePackage.TMX__NAME:
				return getName();
			case GamePackage.TMX__FOLLOW:
				if (resolve) return getFollow();
				return basicGetFollow();
			case GamePackage.TMX__SPRITES:
				return getSprites();
			case GamePackage.TMX__TILES:
				return getTiles();
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
			case GamePackage.TMX__NAME:
				setName((String)newValue);
				return;
			case GamePackage.TMX__FOLLOW:
				setFollow((Sprite)newValue);
				return;
			case GamePackage.TMX__SPRITES:
				getSprites().clear();
				getSprites().addAll((Collection<? extends Sprite>)newValue);
				return;
			case GamePackage.TMX__TILES:
				getTiles().clear();
				getTiles().addAll((Collection<? extends Tile>)newValue);
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
			case GamePackage.TMX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamePackage.TMX__FOLLOW:
				setFollow((Sprite)null);
				return;
			case GamePackage.TMX__SPRITES:
				getSprites().clear();
				return;
			case GamePackage.TMX__TILES:
				getTiles().clear();
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
			case GamePackage.TMX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamePackage.TMX__FOLLOW:
				return follow != null;
			case GamePackage.TMX__SPRITES:
				return sprites != null && !sprites.isEmpty();
			case GamePackage.TMX__TILES:
				return tiles != null && !tiles.isEmpty();
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

} //TMXImpl
