/**
 */
package org.slizaa.neo4j.workbenchmodel.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.slizaa.hierarchicalgraph.provider.HierarchicalgraphEditPlugin;

import org.slizaa.neo4j.dbadapter.provider.Neo4jdbadapterEditPlugin;

/**
 * This is the central singleton for the Workbench edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class WorkbenchEditPlugin extends EMFPlugin {
  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final WorkbenchEditPlugin INSTANCE = new WorkbenchEditPlugin();

  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static Implementation plugin;

  /**
   * Create the instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkbenchEditPlugin() {
    super
      (new ResourceLocator [] {
         HierarchicalgraphEditPlugin.INSTANCE,
         Neo4jdbadapterEditPlugin.INSTANCE,
       });
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  @Override
  public ResourceLocator getPluginResourceLocator() {
    return plugin;
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  public static Implementation getPlugin() {
    return plugin;
  }

  /**
   * The actual implementation of the Eclipse <b>Plugin</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class Implementation extends EclipsePlugin {
    /**
     * Creates an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Implementation() {
      super();

      // Remember the static instance.
      //
      plugin = this;
    }
  }

}
