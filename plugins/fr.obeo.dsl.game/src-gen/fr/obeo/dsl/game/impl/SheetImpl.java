/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.Animation;
import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.Sheet;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.impl.SheetImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SheetImpl#getSprites <em>Sprites</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SheetImpl#getAnimations <em>Animations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SheetImpl extends MinimalEObjectImpl.Container implements Sheet {
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
	 * The cached value of the '{@link #getSprites() <em>Sprites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprites()
	 * @generated
	 * @ordered
	 */
	protected EList<Sprite> sprites;

	/**
	 * The cached value of the '{@link #getAnimations() <em>Animations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimations()
	 * @generated
	 * @ordered
	 */
	protected EList<Animation> animations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.SHEET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SHEET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sprite> getSprites() {
		if (sprites == null) {
			sprites = new EObjectWithInverseResolvingEList<Sprite>(Sprite.class, this, GamePackage.SHEET__SPRITES, GamePackage.SPRITE__SHEET);
		}
		return sprites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Animation> getAnimations() {
		if (animations == null) {
			animations = new EObjectContainmentEList<Animation>(Animation.class, this, GamePackage.SHEET__ANIMATIONS);
		}
		return animations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.SHEET__SPRITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSprites()).basicAdd(otherEnd, msgs);
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
			case GamePackage.SHEET__SPRITES:
				return ((InternalEList<?>)getSprites()).basicRemove(otherEnd, msgs);
			case GamePackage.SHEET__ANIMATIONS:
				return ((InternalEList<?>)getAnimations()).basicRemove(otherEnd, msgs);
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
			case GamePackage.SHEET__NAME:
				return getName();
			case GamePackage.SHEET__SPRITES:
				return getSprites();
			case GamePackage.SHEET__ANIMATIONS:
				return getAnimations();
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
			case GamePackage.SHEET__NAME:
				setName((String)newValue);
				return;
			case GamePackage.SHEET__SPRITES:
				getSprites().clear();
				getSprites().addAll((Collection<? extends Sprite>)newValue);
				return;
			case GamePackage.SHEET__ANIMATIONS:
				getAnimations().clear();
				getAnimations().addAll((Collection<? extends Animation>)newValue);
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
			case GamePackage.SHEET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamePackage.SHEET__SPRITES:
				getSprites().clear();
				return;
			case GamePackage.SHEET__ANIMATIONS:
				getAnimations().clear();
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
			case GamePackage.SHEET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamePackage.SHEET__SPRITES:
				return sprites != null && !sprites.isEmpty();
			case GamePackage.SHEET__ANIMATIONS:
				return animations != null && !animations.isEmpty();
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

} //SheetImpl
