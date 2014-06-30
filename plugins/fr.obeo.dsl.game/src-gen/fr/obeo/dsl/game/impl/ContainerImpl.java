/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.Widget;

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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getY <em>Y</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#isShadow <em>Shadow</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.ContainerImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements fr.obeo.dsl.game.Container {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected int border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final int RADIUS_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected int radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final int STROKE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected int stroke = STROKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected static final int FILL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected int fill = FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #isShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShadow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHADOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShadow()
	 * @generated
	 * @ordered
	 */
	protected boolean shadow = SHADOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadowColor() <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowColor()
	 * @generated
	 * @ordered
	 */
	protected static final int SHADOW_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShadowColor() <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowColor()
	 * @generated
	 * @ordered
	 */
	protected int shadowColor = SHADOW_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widgets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(int newBorder) {
		int oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(int newRadius) {
		int oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(int newStroke) {
		int oldStroke = stroke;
		stroke = newStroke;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__STROKE, oldStroke, stroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(int newFill) {
		int oldFill = fill;
		fill = newFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__FILL, oldFill, fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShadow() {
		return shadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadow(boolean newShadow) {
		boolean oldShadow = shadow;
		shadow = newShadow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__SHADOW, oldShadow, shadow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShadowColor() {
		return shadowColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowColor(int newShadowColor) {
		int oldShadowColor = shadowColor;
		shadowColor = newShadowColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.CONTAINER__SHADOW_COLOR, oldShadowColor, shadowColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<Widget>(Widget.class, this, GamePackage.CONTAINER__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamePackage.CONTAINER__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
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
			case GamePackage.CONTAINER__X:
				return getX();
			case GamePackage.CONTAINER__Y:
				return getY();
			case GamePackage.CONTAINER__BORDER:
				return getBorder();
			case GamePackage.CONTAINER__RADIUS:
				return getRadius();
			case GamePackage.CONTAINER__STROKE:
				return getStroke();
			case GamePackage.CONTAINER__WIDTH:
				return getWidth();
			case GamePackage.CONTAINER__HEIGHT:
				return getHeight();
			case GamePackage.CONTAINER__FILL:
				return getFill();
			case GamePackage.CONTAINER__SHADOW:
				return isShadow();
			case GamePackage.CONTAINER__SHADOW_COLOR:
				return getShadowColor();
			case GamePackage.CONTAINER__WIDGETS:
				return getWidgets();
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
			case GamePackage.CONTAINER__X:
				setX((Integer)newValue);
				return;
			case GamePackage.CONTAINER__Y:
				setY((Integer)newValue);
				return;
			case GamePackage.CONTAINER__BORDER:
				setBorder((Integer)newValue);
				return;
			case GamePackage.CONTAINER__RADIUS:
				setRadius((Integer)newValue);
				return;
			case GamePackage.CONTAINER__STROKE:
				setStroke((Integer)newValue);
				return;
			case GamePackage.CONTAINER__WIDTH:
				setWidth((Integer)newValue);
				return;
			case GamePackage.CONTAINER__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case GamePackage.CONTAINER__FILL:
				setFill((Integer)newValue);
				return;
			case GamePackage.CONTAINER__SHADOW:
				setShadow((Boolean)newValue);
				return;
			case GamePackage.CONTAINER__SHADOW_COLOR:
				setShadowColor((Integer)newValue);
				return;
			case GamePackage.CONTAINER__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends Widget>)newValue);
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
			case GamePackage.CONTAINER__X:
				setX(X_EDEFAULT);
				return;
			case GamePackage.CONTAINER__Y:
				setY(Y_EDEFAULT);
				return;
			case GamePackage.CONTAINER__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case GamePackage.CONTAINER__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case GamePackage.CONTAINER__STROKE:
				setStroke(STROKE_EDEFAULT);
				return;
			case GamePackage.CONTAINER__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GamePackage.CONTAINER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GamePackage.CONTAINER__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case GamePackage.CONTAINER__SHADOW:
				setShadow(SHADOW_EDEFAULT);
				return;
			case GamePackage.CONTAINER__SHADOW_COLOR:
				setShadowColor(SHADOW_COLOR_EDEFAULT);
				return;
			case GamePackage.CONTAINER__WIDGETS:
				getWidgets().clear();
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
			case GamePackage.CONTAINER__X:
				return x != X_EDEFAULT;
			case GamePackage.CONTAINER__Y:
				return y != Y_EDEFAULT;
			case GamePackage.CONTAINER__BORDER:
				return border != BORDER_EDEFAULT;
			case GamePackage.CONTAINER__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case GamePackage.CONTAINER__STROKE:
				return stroke != STROKE_EDEFAULT;
			case GamePackage.CONTAINER__WIDTH:
				return width != WIDTH_EDEFAULT;
			case GamePackage.CONTAINER__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case GamePackage.CONTAINER__FILL:
				return fill != FILL_EDEFAULT;
			case GamePackage.CONTAINER__SHADOW:
				return shadow != SHADOW_EDEFAULT;
			case GamePackage.CONTAINER__SHADOW_COLOR:
				return shadowColor != SHADOW_COLOR_EDEFAULT;
			case GamePackage.CONTAINER__WIDGETS:
				return widgets != null && !widgets.isEmpty();
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", border: ");
		result.append(border);
		result.append(", radius: ");
		result.append(radius);
		result.append(", stroke: ");
		result.append(stroke);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", fill: ");
		result.append(fill);
		result.append(", shadow: ");
		result.append(shadow);
		result.append(", shadowColor: ");
		result.append(shadowColor);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
