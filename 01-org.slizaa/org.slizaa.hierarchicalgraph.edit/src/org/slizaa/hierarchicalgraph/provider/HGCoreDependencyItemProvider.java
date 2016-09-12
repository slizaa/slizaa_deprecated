/**
 */
package org.slizaa.hierarchicalgraph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * This is the item provider adapter for a {@link org.slizaa.hierarchicalgraph.HGCoreDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HGCoreDependencyItemProvider extends AbstractHGDependencyItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGCoreDependencyItemProvider(AdapterFactory adapterFactory) {
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

      addWeightPropertyDescriptor(object);
      addAggregatedCoreDependencyPropertyDescriptor(object);
      addAggregatedCoreDependencyResolvedPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Weight feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addWeightPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HGCoreDependency_weight_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HGCoreDependency_weight_feature", "_UI_HGCoreDependency_type"),
         HierarchicalgraphPackage.Literals.HG_CORE_DEPENDENCY__WEIGHT,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Aggregated Core Dependency feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAggregatedCoreDependencyPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HGCoreDependency_aggregatedCoreDependency_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HGCoreDependency_aggregatedCoreDependency_feature", "_UI_HGCoreDependency_type"),
         HierarchicalgraphPackage.Literals.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Aggregated Core Dependency Resolved feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAggregatedCoreDependencyResolvedPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HGCoreDependency_aggregatedCoreDependencyResolved_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HGCoreDependency_aggregatedCoreDependencyResolved_feature", "_UI_HGCoreDependency_type"),
         HierarchicalgraphPackage.Literals.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_RESOLVED,
         false,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
      childrenFeatures.add(HierarchicalgraphPackage.Literals.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE);
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
   * This returns HGCoreDependency.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/HGCoreDependency"));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage() {
    return true;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    return ((StyledString)getStyledText(object)).getString();
  }
  
  /**
   * This returns the label styled text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getStyledText(Object object) {
    HGCoreDependency hgCoreDependency = (HGCoreDependency)object;
    return new StyledString(getString("_UI_HGCoreDependency_type"), StyledString.Style.QUALIFIER_STYLER).append(" ").append(Integer.toString(hgCoreDependency.getWeight()));
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

    switch (notification.getFeatureID(HGCoreDependency.class)) {
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__WEIGHT:
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY:
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_RESOLVED:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

}
