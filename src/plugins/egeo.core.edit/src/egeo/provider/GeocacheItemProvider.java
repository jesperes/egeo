/**
 */
package egeo.provider;


import egeo.EgeoFactory;
import egeo.EgeoPackage;
import egeo.Geocache;

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
 * This is the item provider adapter for a {@link egeo.Geocache} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeocacheItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeocacheItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addCacheIdPropertyDescriptor(object);
      addCodePropertyDescriptor(object);
      addTimePropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addAvailablePropertyDescriptor(object);
      addArchivedPropertyDescriptor(object);
      addContainerTypePropertyDescriptor(object);
      addPlacedByPropertyDescriptor(object);
      addCacheTypePropertyDescriptor(object);
      addDifficultyPropertyDescriptor(object);
      addTerrainPropertyDescriptor(object);
      addCountryPropertyDescriptor(object);
      addStatePropertyDescriptor(object);
      addUrlPropertyDescriptor(object);
      addAttributesPropertyDescriptor(object);
      addHintPropertyDescriptor(object);
      addSourcePropertyDescriptor(object);
      addLastUpdatePropertyDescriptor(object);
      addTagsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Cache Id feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCacheIdPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_cacheId_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_cacheId_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__CACHE_ID,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Code feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCodePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_code_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_code_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__CODE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Time feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTimePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_time_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_time_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__TIME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_name_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__NAME,
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
  protected void addAvailablePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_available_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_available_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__AVAILABLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Archived feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addArchivedPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_archived_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_archived_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__ARCHIVED,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Container Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addContainerTypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_containerType_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_containerType_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__CONTAINER_TYPE,
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
  protected void addPlacedByPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_placedBy_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_placedBy_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__PLACED_BY,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Cache Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCacheTypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_cacheType_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_cacheType_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__CACHE_TYPE,
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
  protected void addDifficultyPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_difficulty_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_difficulty_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__DIFFICULTY,
         true,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Terrain feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTerrainPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_terrain_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_terrain_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__TERRAIN,
         true,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Country feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCountryPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_country_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_country_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__COUNTRY,
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
  protected void addStatePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_state_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_state_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__STATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Url feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUrlPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_url_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_url_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__URL,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Attributes feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAttributesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_attributes_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_attributes_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__ATTRIBUTES,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Hint feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addHintPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_hint_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_hint_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__HINT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Source feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSourcePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_source_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_source_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__SOURCE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Last Update feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLastUpdatePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_lastUpdate_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_lastUpdate_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__LAST_UPDATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Tags feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTagsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Geocache_tags_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Geocache_tags_feature", "_UI_Geocache_type"),
         EgeoPackage.Literals.GEOCACHE__TAGS,
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(EgeoPackage.Literals.GEOCACHE__OWNER);
      childrenFeatures.add(EgeoPackage.Literals.GEOCACHE__COORD);
      childrenFeatures.add(EgeoPackage.Literals.GEOCACHE__SHORT_TEXT);
      childrenFeatures.add(EgeoPackage.Literals.GEOCACHE__LONG_TEXT);
      childrenFeatures.add(EgeoPackage.Literals.GEOCACHE__LOGS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Geocache.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Geocache"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((Geocache)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_Geocache_type") :
      getString("_UI_Geocache_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(Geocache.class))
    {
      case EgeoPackage.GEOCACHE__CACHE_ID:
      case EgeoPackage.GEOCACHE__CODE:
      case EgeoPackage.GEOCACHE__TIME:
      case EgeoPackage.GEOCACHE__NAME:
      case EgeoPackage.GEOCACHE__AVAILABLE:
      case EgeoPackage.GEOCACHE__ARCHIVED:
      case EgeoPackage.GEOCACHE__CONTAINER_TYPE:
      case EgeoPackage.GEOCACHE__PLACED_BY:
      case EgeoPackage.GEOCACHE__CACHE_TYPE:
      case EgeoPackage.GEOCACHE__DIFFICULTY:
      case EgeoPackage.GEOCACHE__TERRAIN:
      case EgeoPackage.GEOCACHE__COUNTRY:
      case EgeoPackage.GEOCACHE__STATE:
      case EgeoPackage.GEOCACHE__URL:
      case EgeoPackage.GEOCACHE__ATTRIBUTES:
      case EgeoPackage.GEOCACHE__HINT:
      case EgeoPackage.GEOCACHE__SOURCE:
      case EgeoPackage.GEOCACHE__LAST_UPDATE:
      case EgeoPackage.GEOCACHE__TAGS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case EgeoPackage.GEOCACHE__OWNER:
      case EgeoPackage.GEOCACHE__COORD:
      case EgeoPackage.GEOCACHE__SHORT_TEXT:
      case EgeoPackage.GEOCACHE__LONG_TEXT:
      case EgeoPackage.GEOCACHE__LOGS:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (EgeoPackage.Literals.GEOCACHE__OWNER,
         EgeoFactory.eINSTANCE.createUser()));

    newChildDescriptors.add
      (createChildParameter
        (EgeoPackage.Literals.GEOCACHE__COORD,
         EgeoFactory.eINSTANCE.createCoordinate()));

    newChildDescriptors.add
      (createChildParameter
        (EgeoPackage.Literals.GEOCACHE__SHORT_TEXT,
         EgeoFactory.eINSTANCE.createDescription()));

    newChildDescriptors.add
      (createChildParameter
        (EgeoPackage.Literals.GEOCACHE__LONG_TEXT,
         EgeoFactory.eINSTANCE.createDescription()));

    newChildDescriptors.add
      (createChildParameter
        (EgeoPackage.Literals.GEOCACHE__LOGS,
         EgeoFactory.eINSTANCE.createLog()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
      childFeature == EgeoPackage.Literals.GEOCACHE__SHORT_TEXT ||
      childFeature == EgeoPackage.Literals.GEOCACHE__LONG_TEXT;

    if (qualify)
    {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
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
  public ResourceLocator getResourceLocator()
  {
    return EgeoEditPlugin.INSTANCE;
  }

}
