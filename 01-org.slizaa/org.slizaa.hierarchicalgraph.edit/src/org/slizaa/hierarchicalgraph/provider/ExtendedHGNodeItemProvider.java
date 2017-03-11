package org.slizaa.hierarchicalgraph.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.StyledString;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.INodeSource;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;

public class ExtendedHGNodeItemProvider extends HGNodeItemProvider {

	/** the AdapterFactoryItemDelegator */
	private AdapterFactoryItemDelegator _adapterFactoryItemDelegatorInstance;

	public ExtendedHGNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);

		// create the composed adapter factory (based on the registry instance)
		ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		// create the AdapterFactoryItemDelegator
		_adapterFactoryItemDelegatorInstance = new AdapterFactoryItemDelegator(composedAdapterFactory);
	}

	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {

		// get the node source
		INodeSource hgNodeSource = (INodeSource) ((HGNode) object).getNodeSource();

		// return the property descriptors
		return _adapterFactoryItemDelegatorInstance.getPropertyDescriptors(hgNodeSource);
	}


	@Override
	public Object getImage(Object object) {
	  
		if (object instanceof HGNode) {
			HGNode hgNode = (HGNode) object;
			INodeLabelProvider itemLabelProvider = hgNode.getRootNode().getExtension(INodeLabelProvider.class);
			return itemLabelProvider.getImage(object);
		}
		return null;
	}

	@Override
	public Object getStyledText(Object object) {

		if (object instanceof HGNode) {
			HGNode hgNode = (HGNode) object;
			INodeLabelProvider itemLabelProvider = hgNode.getRootNode().getExtension(INodeLabelProvider.class);
			if (itemLabelProvider instanceof IItemStyledLabelProvider) {
				IItemStyledLabelProvider styledLabelProvider = (IItemStyledLabelProvider) itemLabelProvider;
				return styledLabelProvider.getStyledText(object);
			}
		}

		return new StyledString(getString("_UI_HGNode_type"));
	}
}
