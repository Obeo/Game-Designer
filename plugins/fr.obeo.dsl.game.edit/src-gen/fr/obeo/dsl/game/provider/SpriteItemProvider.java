/**
 */
package fr.obeo.dsl.game.provider;


import fr.obeo.dsl.game.GameFactory;
import fr.obeo.dsl.game.GamePackage;
import fr.obeo.dsl.game.Sprite;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.obeo.dsl.game.Sprite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpriteItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpriteItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addClassNamePropertyDescriptor(object);
			addMovePropertyDescriptor(object);
			addParentPropertyDescriptor(object);
			addDefaultStatePropertyDescriptor(object);
			addSheetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sprite_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_name_feature", "_UI_Sprite_type"),
				 GamePackage.Literals.SPRITE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sprite_className_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_className_feature", "_UI_Sprite_type"),
				 GamePackage.Literals.SPRITE__CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Move feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMovePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sprite_move_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_move_feature", "_UI_Sprite_type"),
				 GamePackage.Literals.SPRITE__MOVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sprite_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_parent_feature", "_UI_Sprite_type"),
				 GamePackage.Literals.SPRITE__PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sprite_defaultState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_defaultState_feature", "_UI_Sprite_type"),
				 GamePackage.Literals.SPRITE__DEFAULT_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sheet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSheetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sprite_sheet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_sheet_feature", "_UI_Sprite_type"),
				 GamePackage.Literals.SPRITE__SHEET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GamePackage.Literals.SPRITE__PROPERTIES);
			childrenFeatures.add(GamePackage.Literals.SPRITE__STATES);
			childrenFeatures.add(GamePackage.Literals.SPRITE__EVENTS);
			childrenFeatures.add(GamePackage.Literals.SPRITE__HITBOXES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Sprite.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sprite"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Sprite)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Sprite_type") :
			getString("_UI_Sprite_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Sprite.class)) {
			case GamePackage.SPRITE__NAME:
			case GamePackage.SPRITE__CLASS_NAME:
			case GamePackage.SPRITE__MOVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GamePackage.SPRITE__PROPERTIES:
			case GamePackage.SPRITE__STATES:
			case GamePackage.SPRITE__EVENTS:
			case GamePackage.SPRITE__HITBOXES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__PROPERTIES,
				 GameFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__STATES,
				 GameFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createCollision()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createKeyEvent()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createArrowKey()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createFireKey()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createActionKey()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createConfirmKey()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createEscapeKey()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createPauseKey()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createSaveKey()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createJump()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createJumped()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createMoveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createMoveDown()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createMoveUp()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createMoveStopVerticaly()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createMoveLeft()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createMoveRight()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__EVENTS,
				 GameFactory.eINSTANCE.createMoveStopHorizontaly()));

		newChildDescriptors.add
			(createChildParameter
				(GamePackage.Literals.SPRITE__HITBOXES,
				 GameFactory.eINSTANCE.createHitBox()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GameEditPlugin.INSTANCE;
	}

}
