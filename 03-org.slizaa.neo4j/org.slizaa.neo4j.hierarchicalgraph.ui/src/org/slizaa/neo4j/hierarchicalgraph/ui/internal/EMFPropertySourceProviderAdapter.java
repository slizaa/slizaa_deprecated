package org.slizaa.neo4j.hierarchicalgraph.ui.internal;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class EMFPropertySourceProviderAdapter implements IAdapterFactory {

  private AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
      new ComposedAdapterFactory(new AdapterFactory[] { new ReflectiveItemProviderAdapterFactory(),
          new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) }));

  @Override
  public Object getAdapter(Object adaptableObject, Class adapterType) {

    if (adapterType == IPropertySourceProvider.class && adaptableObject instanceof EObject) {
      return (IPropertySourceProvider) contentProvider;
    }
    return null;
  }

  @Override
  public Class<?>[] getAdapterList() {
    return new Class[] { IPropertySourceProvider.class };
  }
}