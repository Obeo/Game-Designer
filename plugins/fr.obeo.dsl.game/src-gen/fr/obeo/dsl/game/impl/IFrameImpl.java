/**
 */
package fr.obeo.dsl.game.impl;

import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.IFrame;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFrame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.game.impl.IFrameImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.IFrameImpl#getY <em>Y</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.IFrameImpl#getStylePosition <em>Style Position</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.IFrameImpl#getStyleZIndex <em>Style ZIndex</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.IFrameImpl#getAttributeFrameborder <em>Attribute Frameborder</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.IFrameImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.IFrameImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.obeo.dsl.game.impl.IFrameImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFrameImpl extends MinimalEObjectImpl.Container implements IFrame {
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
	 * The default value of the '{@link #getStylePosition() <em>Style Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylePosition()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_POSITION_EDEFAULT = "absolute";

	/**
	 * The cached value of the '{@link #getStylePosition() <em>Style Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylePosition()
	 * @generated
	 * @ordered
	 */
	protected String stylePosition = STYLE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleZIndex() <em>Style ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleZIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int STYLE_ZINDEX_EDEFAULT = 500;

	/**
	 * The cached value of the '{@link #getStyleZIndex() <em>Style ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleZIndex()
	 * @generated
	 * @ordered
	 */
	protected int styleZIndex = STYLE_ZINDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeFrameborder() <em>Attribute Frameborder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeFrameborder()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTRIBUTE_FRAMEBORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttributeFrameborder() <em>Attribute Frameborder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeFrameborder()
	 * @generated
	 * @ordered
	 */
	protected int attributeFrameborder = ATTRIBUTE_FRAMEBORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.IFRAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IFRAME__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IFRAME__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStylePosition() {
		return stylePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStylePosition(String newStylePosition) {
		String oldStylePosition = stylePosition;
		stylePosition = newStylePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IFRAME__STYLE_POSITION, oldStylePosition, stylePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStyleZIndex() {
		return styleZIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleZIndex(int newStyleZIndex) {
		int oldStyleZIndex = styleZIndex;
		styleZIndex = newStyleZIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IFRAME__STYLE_ZINDEX, oldStyleZIndex, styleZIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttributeFrameborder() {
		return attributeFrameborder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeFrameborder(int newAttributeFrameborder) {
		int oldAttributeFrameborder = attributeFrameborder;
		attributeFrameborder = newAttributeFrameborder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IFRAME__ATTRIBUTE_FRAMEBORDER, oldAttributeFrameborder, attributeFrameborder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IFRAME__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IFRAME__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.IFRAME__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamePackage.IFRAME__X:
				return getX();
			case GamePackage.IFRAME__Y:
				return getY();
			case GamePackage.IFRAME__STYLE_POSITION:
				return getStylePosition();
			case GamePackage.IFRAME__STYLE_ZINDEX:
				return getStyleZIndex();
			case GamePackage.IFRAME__ATTRIBUTE_FRAMEBORDER:
				return getAttributeFrameborder();
			case GamePackage.IFRAME__URL:
				return getUrl();
			case GamePackage.IFRAME__WIDTH:
				return getWidth();
			case GamePackage.IFRAME__HEIGHT:
				return getHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GamePackage.IFRAME__X:
				setX((Integer)newValue);
				return;
			case GamePackage.IFRAME__Y:
				setY((Integer)newValue);
				return;
			case GamePackage.IFRAME__STYLE_POSITION:
				setStylePosition((String)newValue);
				return;
			case GamePackage.IFRAME__STYLE_ZINDEX:
				setStyleZIndex((Integer)newValue);
				return;
			case GamePackage.IFRAME__ATTRIBUTE_FRAMEBORDER:
				setAttributeFrameborder((Integer)newValue);
				return;
			case GamePackage.IFRAME__URL:
				setUrl((String)newValue);
				return;
			case GamePackage.IFRAME__WIDTH:
				setWidth((Integer)newValue);
				return;
			case GamePackage.IFRAME__HEIGHT:
				setHeight((Integer)newValue);
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
			case GamePackage.IFRAME__X:
				setX(X_EDEFAULT);
				return;
			case GamePackage.IFRAME__Y:
				setY(Y_EDEFAULT);
				return;
			case GamePackage.IFRAME__STYLE_POSITION:
				setStylePosition(STYLE_POSITION_EDEFAULT);
				return;
			case GamePackage.IFRAME__STYLE_ZINDEX:
				setStyleZIndex(STYLE_ZINDEX_EDEFAULT);
				return;
			case GamePackage.IFRAME__ATTRIBUTE_FRAMEBORDER:
				setAttributeFrameborder(ATTRIBUTE_FRAMEBORDER_EDEFAULT);
				return;
			case GamePackage.IFRAME__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GamePackage.IFRAME__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GamePackage.IFRAME__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case GamePackage.IFRAME__X:
				return x != X_EDEFAULT;
			case GamePackage.IFRAME__Y:
				return y != Y_EDEFAULT;
			case GamePackage.IFRAME__STYLE_POSITION:
				return STYLE_POSITION_EDEFAULT == null ? stylePosition != null : !STYLE_POSITION_EDEFAULT.equals(stylePosition);
			case GamePackage.IFRAME__STYLE_ZINDEX:
				return styleZIndex != STYLE_ZINDEX_EDEFAULT;
			case GamePackage.IFRAME__ATTRIBUTE_FRAMEBORDER:
				return attributeFrameborder != ATTRIBUTE_FRAMEBORDER_EDEFAULT;
			case GamePackage.IFRAME__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GamePackage.IFRAME__WIDTH:
				return width != WIDTH_EDEFAULT;
			case GamePackage.IFRAME__HEIGHT:
				return height != HEIGHT_EDEFAULT;
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
		result.append(", stylePosition: ");
		result.append(stylePosition);
		result.append(", styleZIndex: ");
		result.append(styleZIndex);
		result.append(", attributeFrameborder: ");
		result.append(attributeFrameborder);
		result.append(", url: ");
		result.append(url);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //IFrameImpl
