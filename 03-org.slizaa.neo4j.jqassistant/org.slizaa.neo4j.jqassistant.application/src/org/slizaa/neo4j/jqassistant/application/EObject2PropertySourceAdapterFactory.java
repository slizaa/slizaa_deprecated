package org.slizaa.neo4j.jqassistant.application;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;

public class EObject2PropertySourceAdapterFactory implements IAdapterFactory {

  @Override
  @SuppressWarnings("unchecked")
  public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {

    //
    if (adapterType == IPropertySource.class && adaptableObject instanceof EObject) {

      ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
          ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

      return (T) new AdapterFactoryContentProvider(composedAdapterFactory).getPropertySource(adaptableObject);
    }

    //
    return null;
  }

  @Override
  public Class<?>[] getAdapterList() {
    return new Class<?>[] { IPropertySource.class };
  }
}
