package org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.ui.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;

import com.google.inject.Inject;

/**
 * <p>
 * See:
 * http://coopology.com/2011/06/easily-load-xtext-files-and-objects-in-eclipse-plugin-or-rcp-projects-using-adapters/
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@SuppressWarnings("rawtypes")
public class ModelLoadingAdapter implements IAdapterFactory {

  private static org.apache.log4j.Logger log   = org.apache.log4j.Logger.getLogger(ModelLoadingAdapter.class);

  @Inject
  private XtextResourceSetProvider       _resourceSetProvider;

  @Inject
  private XtextResourceSet               _xtextResourceSet;

  /** - */
  private Resource                       _resource;

  /** - */
  private Object                         _lock = new Object();

  @Override
  public Object getAdapter(Object adaptableObject, Class adapterType) {

    if (adapterType == MappingDescriptor.class) {

      //
      if (adaptableObject instanceof IFile) {
        return handleIFile((IFile) adaptableObject);
      }

      //
      else if (adaptableObject instanceof URL) {
        return handleURL((URL) adaptableObject);
      }
    }

    return null;
  }

  @Override
  public Class[] getAdapterList() {
    return new Class[] { MappingDescriptor.class };
  }

  /**
   * <p>
   * </p>
   *
   * @param adaptableObject
   * @return
   */
  private Object handleIFile(IFile file) {

    if (!file.getFileExtension().toLowerCase().equals("mapping")) {
      return null;
    }

    //
    XtextResourceSet resourceSet = (XtextResourceSet) _resourceSetProvider.get(file.getProject());
    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    Resource resource = resourceSet.getResource(URI.createURI(file.getLocationURI().toString()), true);
    if (resource.getErrors().size() > 0) {
      return null;
    }
    return (MappingDescriptor) resource.getContents().get(0);
  }

  /**
   * <p>
   * </p>
   *
   * @param adaptableObject
   * @return
   */
  private Object handleURL(URL url) {

    synchronized (_lock) {

      if (_resource == null) {
        _xtextResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
        _resource = _xtextResourceSet.createResource(URI.createURI("dummy:/example.mapping"));
      }
      _resource.unload();
      
      try (InputStream in = url.openStream()) {
        _resource.load(in, _xtextResourceSet.getLoadOptions());
      } catch (IOException exception) {
        exception.printStackTrace();
        return null;
      }
     
      for (Diagnostic diagnostic : _resource.getErrors()) {
        System.out.println(diagnostic);
      }
      if (_resource.getErrors().size() > 0) {
        return null;
      }

      //
      return _resource.getContents().get(0);
    }
  }
}