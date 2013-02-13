/**
 */
package egeo.gpx.groundspeak.provider;


import egeo.gpx.groundspeak.CacheType;
import egeo.gpx.groundspeak.GroundspeakFactory;
import egeo.gpx.groundspeak.GroundspeakPackage;

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
 * This is the item provider adapter for a {@link egeo.gpx.groundspeak.CacheType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CacheTypeItemProvider
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
	public CacheTypeItemProvider(AdapterFactory adapterFactory) {
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
			addPlacedByPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addContainerPropertyDescriptor(object);
			addDifficultyPropertyDescriptor(object);
			addTerrainPropertyDescriptor(object);
			addCountryPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addEncodedHintsPropertyDescriptor(object);
			addArchivedPropertyDescriptor(object);
			addAvailablePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
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
				 getString("_UI_CacheType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_name_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Placed By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlacedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_placedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_placedBy_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__PLACED_BY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_type_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_container_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_container_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__CONTAINER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Difficulty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDifficultyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_difficulty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_difficulty_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__DIFFICULTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Terrain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerrainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_terrain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_terrain_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__TERRAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Country feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_country_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_country_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__COUNTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_state_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encoded Hints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncodedHintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_encodedHints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_encodedHints_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__ENCODED_HINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Archived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_archived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_archived_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__ARCHIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Available feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_available_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_available_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__AVAILABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CacheType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CacheType_id_feature", "_UI_CacheType_type"),
				 GroundspeakPackage.Literals.CACHE_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(GroundspeakPackage.Literals.CACHE_TYPE__OWNER);
			childrenFeatures.add(GroundspeakPackage.Literals.CACHE_TYPE__ATTRIBUTES);
			childrenFeatures.add(GroundspeakPackage.Literals.CACHE_TYPE__SHORT_DESCRIPTION);
			childrenFeatures.add(GroundspeakPackage.Literals.CACHE_TYPE__LONG_DESCRIPTION);
			childrenFeatures.add(GroundspeakPackage.Literals.CACHE_TYPE__LOGS);
			childrenFeatures.add(GroundspeakPackage.Literals.CACHE_TYPE__TRAVELBUGS);
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
	 * This returns CacheType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CacheType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CacheType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CacheType_type") :
			getString("_UI_CacheType_type") + " " + label;
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

		switch (notification.getFeatureID(CacheType.class)) {
			case GroundspeakPackage.CACHE_TYPE__NAME:
			case GroundspeakPackage.CACHE_TYPE__PLACED_BY:
			case GroundspeakPackage.CACHE_TYPE__TYPE:
			case GroundspeakPackage.CACHE_TYPE__CONTAINER:
			case GroundspeakPackage.CACHE_TYPE__DIFFICULTY:
			case GroundspeakPackage.CACHE_TYPE__TERRAIN:
			case GroundspeakPackage.CACHE_TYPE__COUNTRY:
			case GroundspeakPackage.CACHE_TYPE__STATE:
			case GroundspeakPackage.CACHE_TYPE__ENCODED_HINTS:
			case GroundspeakPackage.CACHE_TYPE__ARCHIVED:
			case GroundspeakPackage.CACHE_TYPE__AVAILABLE:
			case GroundspeakPackage.CACHE_TYPE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GroundspeakPackage.CACHE_TYPE__OWNER:
			case GroundspeakPackage.CACHE_TYPE__ATTRIBUTES:
			case GroundspeakPackage.CACHE_TYPE__SHORT_DESCRIPTION:
			case GroundspeakPackage.CACHE_TYPE__LONG_DESCRIPTION:
			case GroundspeakPackage.CACHE_TYPE__LOGS:
			case GroundspeakPackage.CACHE_TYPE__TRAVELBUGS:
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
				(GroundspeakPackage.Literals.CACHE_TYPE__OWNER,
				 GroundspeakFactory.eINSTANCE.createOwnerType()));

		newChildDescriptors.add
			(createChildParameter
				(GroundspeakPackage.Literals.CACHE_TYPE__ATTRIBUTES,
				 GroundspeakFactory.eINSTANCE.createAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(GroundspeakPackage.Literals.CACHE_TYPE__SHORT_DESCRIPTION,
				 GroundspeakFactory.eINSTANCE.createShortDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(GroundspeakPackage.Literals.CACHE_TYPE__LONG_DESCRIPTION,
				 GroundspeakFactory.eINSTANCE.createLongDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(GroundspeakPackage.Literals.CACHE_TYPE__LOGS,
				 GroundspeakFactory.eINSTANCE.createLogsType()));

		newChildDescriptors.add
			(createChildParameter
				(GroundspeakPackage.Literals.CACHE_TYPE__TRAVELBUGS,
				 GroundspeakFactory.eINSTANCE.createTravelbugsType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GroundspeakEditPlugin.INSTANCE;
	}

}
