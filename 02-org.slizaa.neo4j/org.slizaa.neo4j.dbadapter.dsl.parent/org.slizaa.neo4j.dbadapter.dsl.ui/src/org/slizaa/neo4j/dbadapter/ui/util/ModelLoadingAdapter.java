package org.slizaa.neo4j.dbadapter.ui.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.slizaa.neo4j.dbadapter.dbAdapterDsl.DbAdapterDefinition;

import com.google.inject.Inject;

/**
 * <p>
 * See: http://coopology.com/2011/06/easily-load-xtext-files-and-objects-in-eclipse-plugin-or-rcp-projects-using-adapters/
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@SuppressWarnings("rawtypes")
public class ModelLoadingAdapter implements IAdapterFactory {

  private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ModelLoadingAdapter.class);

  @Inject
  private XtextResourceSetProvider       _resourceSetProvider;

  @Override
  public Object getAdapter(Object adaptableObject, Class adapterType) {

    if (adapterType == DbAdapterDefinition.class) {

      if (adaptableObject instanceof IFile) {
        final IFile file = (IFile) adaptableObject;
        if (!file.getFileExtension().toLowerCase().equals("dbdef"))
          return null;

        XtextResourceSet resourceSet = (XtextResourceSet) _resourceSetProvider.get(file.getProject());
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
        Resource resource = resourceSet.getResource(URI.createURI(file.getLocationURI().toString()), true);
        if (resource.getErrors().size() > 0) {
          return null;
        }
        DbAdapterDefinition model = (DbAdapterDefinition) resource.getContents().get(0);
        return model;
      }
    }

    return null;
  }

  @Override
  public Class[] getAdapterList() {
    return new Class[] { DbAdapterDefinition.class };
  }
}