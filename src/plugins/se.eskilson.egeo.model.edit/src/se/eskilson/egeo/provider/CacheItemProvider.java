/**
 */
package se.eskilson.egeo.provider;

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

import se.eskilson.egeo.Cache;
import se.eskilson.egeo.EgeoFactory;
import se.eskilson.egeo.EgeoPackage;

/**
 * This is the item provider adapter for a {@link se.eskilson.egeo.Cache} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CacheItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheItemProvider(AdapterFactory adapterFactory) {
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

			addCodePropertyDescriptor(object);
			addIdentPropertyDescriptor(object);
			addAvailablePropertyDescriptor(object);
			addArchivedPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTimePropertyDescriptor(object);
			addCacheTypePropertyDescriptor(object);
			addPlacedByPropertyDescriptor(object);
			addUrlPropertyDescriptor(object);
			addOwnedByPropertyDescriptor(object);
			addContPropertyDescriptor(object);
			addAttributesPropertyDescriptor(object);
			addDifficultyPropertyDescriptor(object);
			addTerrainPropertyDescriptor(object);
			addCountryPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addHintPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_code_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_code_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ident feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_ident_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_ident_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__IDENT, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Available feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_available_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_available_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__AVAILABLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Archived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_archived_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_archived_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__ARCHIVED, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_name_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_name_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_description_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_description_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__DESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_time_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_time_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__TIME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cache Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_cacheType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_cacheType_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__CACHE_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Placed By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlacedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_placedBy_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_placedBy_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__PLACED_BY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_url_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_url_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__URL, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_ownedBy_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_ownedBy_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__OWNED_BY, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Cont feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_cont_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_cont_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__CONT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_attributes_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_attributes_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__ATTRIBUTES, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Difficulty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDifficultyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_difficulty_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_difficulty_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__DIFFICULTY, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Terrain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerrainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_terrain_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_terrain_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__TERRAIN, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Country feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_country_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_country_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__COUNTRY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_state_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_state_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__STATE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Hint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cache_hint_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Cache_hint_feature", "_UI_Cache_type"),
				EgeoPackage.Literals.CACHE__HINT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EgeoPackage.Literals.CACHE__SHORT_DESCRIPTION);
			childrenFeatures.add(EgeoPackage.Literals.CACHE__LONG_DESCRIPTION);
			childrenFeatures.add(EgeoPackage.Literals.CACHE__COORDINATE);
			childrenFeatures.add(EgeoPackage.Literals.CACHE__LOGS);
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
	 * This returns Cache.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Cache"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Cache) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Cache_type")
				: getString("_UI_Cache_type") + " " + label;
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

		switch (notification.getFeatureID(Cache.class)) {
		case EgeoPackage.CACHE__CODE:
		case EgeoPackage.CACHE__IDENT:
		case EgeoPackage.CACHE__AVAILABLE:
		case EgeoPackage.CACHE__ARCHIVED:
		case EgeoPackage.CACHE__NAME:
		case EgeoPackage.CACHE__DESCRIPTION:
		case EgeoPackage.CACHE__TIME:
		case EgeoPackage.CACHE__CACHE_TYPE:
		case EgeoPackage.CACHE__PLACED_BY:
		case EgeoPackage.CACHE__URL:
		case EgeoPackage.CACHE__CONT:
		case EgeoPackage.CACHE__DIFFICULTY:
		case EgeoPackage.CACHE__TERRAIN:
		case EgeoPackage.CACHE__COUNTRY:
		case EgeoPackage.CACHE__STATE:
		case EgeoPackage.CACHE__HINT:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case EgeoPackage.CACHE__SHORT_DESCRIPTION:
		case EgeoPackage.CACHE__LONG_DESCRIPTION:
		case EgeoPackage.CACHE__COORDINATE:
		case EgeoPackage.CACHE__LOGS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				EgeoPackage.Literals.CACHE__SHORT_DESCRIPTION,
				EgeoFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add(createChildParameter(
				EgeoPackage.Literals.CACHE__LONG_DESCRIPTION,
				EgeoFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add(createChildParameter(
				EgeoPackage.Literals.CACHE__COORDINATE,
				EgeoFactory.eINSTANCE.createCoordinate()));

		newChildDescriptors.add(createChildParameter(
				EgeoPackage.Literals.CACHE__LOGS,
				EgeoFactory.eINSTANCE.createLog()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == EgeoPackage.Literals.CACHE__SHORT_DESCRIPTION
				|| childFeature == EgeoPackage.Literals.CACHE__LONG_DESCRIPTION;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature),
					getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EgeoEditPlugin.INSTANCE;
	}

}
