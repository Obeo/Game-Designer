/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.Action;
import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.Jump;
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
 * An implementation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.impl.JumpImpl#getApplyOn <em>Apply On</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.JumpImpl#getChangeTo <em>Change To</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.JumpImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JumpImpl extends MinimalEObjectImpl.Container implements Jump {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.JUMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getApplyOn() {
		if (applyOn == null) {
			applyOn = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, GamePackage.JUMP__APPLY_ON, GamePackage.STATE__EVENTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.JUMP__CHANGE_TO, oldChangeTo, changeTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.JUMP__CHANGE_TO, oldChangeTo, changeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, GamePackage.JUMP__ACTIONS);
		}
		return actions;
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
			case GamePackage.JUMP__APPLY_ON:
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
			case GamePackage.JUMP__APPLY_ON:
				return ((InternalEList<?>)getApplyOn()).basicRemove(otherEnd, msgs);
			case GamePackage.JUMP__ACTIONS:
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
			case GamePackage.JUMP__APPLY_ON:
				return getApplyOn();
			case GamePackage.JUMP__CHANGE_TO:
				if (resolve) return getChangeTo();
				return basicGetChangeTo();
			case GamePackage.JUMP__ACTIONS:
				return getActions();
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
			case GamePackage.JUMP__APPLY_ON:
				getApplyOn().clear();
				getApplyOn().addAll((Collection<? extends State>)newValue);
				return;
			case GamePackage.JUMP__CHANGE_TO:
				setChangeTo((State)newValue);
				return;
			case GamePackage.JUMP__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case GamePackage.JUMP__APPLY_ON:
				getApplyOn().clear();
				return;
			case GamePackage.JUMP__CHANGE_TO:
				setChangeTo((State)null);
				return;
			case GamePackage.JUMP__ACTIONS:
				getActions().clear();
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
			case GamePackage.JUMP__APPLY_ON:
				return applyOn != null && !applyOn.isEmpty();
			case GamePackage.JUMP__CHANGE_TO:
				return changeTo != null;
			case GamePackage.JUMP__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JumpImpl
