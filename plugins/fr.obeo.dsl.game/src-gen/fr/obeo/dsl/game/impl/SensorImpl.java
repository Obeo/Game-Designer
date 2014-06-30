/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.Action;
import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.Orientation;
import fr.obeo.dsl.game.Sensor;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.impl.SensorImpl#getApplyOn <em>Apply On</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SensorImpl#getChangeTo <em>Change To</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SensorImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SensorImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.SensorImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends MinimalEObjectImpl.Container implements Sensor {
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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.TOP;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation orientation = ORIENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Sprite source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getApplyOn() {
		if (applyOn == null) {
			applyOn = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, GamePackage.SENSOR__APPLY_ON, GamePackage.STATE__EVENTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.SENSOR__CHANGE_TO, oldChangeTo, changeTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SENSOR__CHANGE_TO, oldChangeTo, changeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, GamePackage.SENSOR__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Orientation newOrientation) {
		Orientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SENSOR__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprite getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Sprite)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.SENSOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprite basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Sprite newSource) {
		Sprite oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.SENSOR__SOURCE, oldSource, source));
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
			case GamePackage.SENSOR__APPLY_ON:
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
			case GamePackage.SENSOR__APPLY_ON:
				return ((InternalEList<?>)getApplyOn()).basicRemove(otherEnd, msgs);
			case GamePackage.SENSOR__ACTIONS:
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
			case GamePackage.SENSOR__APPLY_ON:
				return getApplyOn();
			case GamePackage.SENSOR__CHANGE_TO:
				if (resolve) return getChangeTo();
				return basicGetChangeTo();
			case GamePackage.SENSOR__ACTIONS:
				return getActions();
			case GamePackage.SENSOR__ORIENTATION:
				return getOrientation();
			case GamePackage.SENSOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case GamePackage.SENSOR__APPLY_ON:
				getApplyOn().clear();
				getApplyOn().addAll((Collection<? extends State>)newValue);
				return;
			case GamePackage.SENSOR__CHANGE_TO:
				setChangeTo((State)newValue);
				return;
			case GamePackage.SENSOR__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case GamePackage.SENSOR__ORIENTATION:
				setOrientation((Orientation)newValue);
				return;
			case GamePackage.SENSOR__SOURCE:
				setSource((Sprite)newValue);
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
			case GamePackage.SENSOR__APPLY_ON:
				getApplyOn().clear();
				return;
			case GamePackage.SENSOR__CHANGE_TO:
				setChangeTo((State)null);
				return;
			case GamePackage.SENSOR__ACTIONS:
				getActions().clear();
				return;
			case GamePackage.SENSOR__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case GamePackage.SENSOR__SOURCE:
				setSource((Sprite)null);
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
			case GamePackage.SENSOR__APPLY_ON:
				return applyOn != null && !applyOn.isEmpty();
			case GamePackage.SENSOR__CHANGE_TO:
				return changeTo != null;
			case GamePackage.SENSOR__ACTIONS:
				return actions != null && !actions.isEmpty();
			case GamePackage.SENSOR__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case GamePackage.SENSOR__SOURCE:
				return source != null;
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
		result.append(" (orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
