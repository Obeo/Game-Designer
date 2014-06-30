/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.Action;
import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.KeyEvent;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.impl.KeyEventImpl#getApplyOn <em>Apply On</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.KeyEventImpl#getChangeTo <em>Change To</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.KeyEventImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.KeyEventImpl#isKeyDown <em>Key Down</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyEventImpl extends MinimalEObjectImpl.Container implements KeyEvent {
	/**
	 * The cached value of the '{@link #getApplyOn() <em>Apply On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyOn()
	 * @generated
	 * @ordered
	 */
	protected EList<State> applyOn;

	/**
	 * The cached value of the '{@link #getChangeTo() <em>Change To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeTo()
	 * @generated
	 * @ordered
	 */
	protected State changeTo;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The default value of the '{@link #isKeyDown() <em>Key Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeyDown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEY_DOWN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isKeyDown() <em>Key Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeyDown()
	 * @generated
	 * @ordered
	 */
	protected boolean keyDown = KEY_DOWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.KEY_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getApplyOn() {
		if (applyOn == null) {
			applyOn = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, GamePackage.KEY_EVENT__APPLY_ON, GamePackage.STATE__EVENTS);
		}
		return applyOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getChangeTo() {
		if (changeTo != null && changeTo.eIsProxy()) {
			InternalEObject oldChangeTo = (InternalEObject)changeTo;
			changeTo = (State)eResolveProxy(oldChangeTo);
			if (changeTo != oldChangeTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.KEY_EVENT__CHANGE_TO, oldChangeTo, changeTo));
			}
		}
		return changeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetChangeTo() {
		return changeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeTo(State newChangeTo) {
		State oldChangeTo = changeTo;
		changeTo = newChangeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.KEY_EVENT__CHANGE_TO, oldChangeTo, changeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, GamePackage.KEY_EVENT__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeyDown() {
		return keyDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyDown(boolean newKeyDown) {
		boolean oldKeyDown = keyDown;
		keyDown = newKeyDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.KEY_EVENT__KEY_DOWN, oldKeyDown, keyDown));
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
			case GamePackage.KEY_EVENT__APPLY_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplyOn()).basicAdd(otherEnd, msgs);
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
			case GamePackage.KEY_EVENT__APPLY_ON:
				return ((InternalEList<?>)getApplyOn()).basicRemove(otherEnd, msgs);
			case GamePackage.KEY_EVENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case GamePackage.KEY_EVENT__APPLY_ON:
				return getApplyOn();
			case GamePackage.KEY_EVENT__CHANGE_TO:
				if (resolve) return getChangeTo();
				return basicGetChangeTo();
			case GamePackage.KEY_EVENT__ACTIONS:
				return getActions();
			case GamePackage.KEY_EVENT__KEY_DOWN:
				return isKeyDown();
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
			case GamePackage.KEY_EVENT__APPLY_ON:
				getApplyOn().clear();
				getApplyOn().addAll((Collection<? extends State>)newValue);
				return;
			case GamePackage.KEY_EVENT__CHANGE_TO:
				setChangeTo((State)newValue);
				return;
			case GamePackage.KEY_EVENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case GamePackage.KEY_EVENT__KEY_DOWN:
				setKeyDown((Boolean)newValue);
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
			case GamePackage.KEY_EVENT__APPLY_ON:
				getApplyOn().clear();
				return;
			case GamePackage.KEY_EVENT__CHANGE_TO:
				setChangeTo((State)null);
				return;
			case GamePackage.KEY_EVENT__ACTIONS:
				getActions().clear();
				return;
			case GamePackage.KEY_EVENT__KEY_DOWN:
				setKeyDown(KEY_DOWN_EDEFAULT);
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
			case GamePackage.KEY_EVENT__APPLY_ON:
				return applyOn != null && !applyOn.isEmpty();
			case GamePackage.KEY_EVENT__CHANGE_TO:
				return changeTo != null;
			case GamePackage.KEY_EVENT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case GamePackage.KEY_EVENT__KEY_DOWN:
				return keyDown != KEY_DOWN_EDEFAULT;
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
		result.append(" (keyDown: ");
		result.append(keyDown);
		result.append(')');
		return result.toString();
	}

} //KeyEventImpl
