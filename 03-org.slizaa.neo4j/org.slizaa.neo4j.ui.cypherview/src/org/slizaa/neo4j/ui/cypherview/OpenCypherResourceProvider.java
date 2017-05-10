package org.slizaa.neo4j.ui.cypherview;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class OpenCypherResourceProvider implements IEditedResourceProvider {

  @Inject
  private IResourceSetProvider  resourceSetProvider;

  @Inject
  private FileExtensionProvider ext;

  @Override
  public XtextResource createResource() {
    ResourceSet resourceSet = resourceSetProvider.get(null);
    URI uri = URI.createURI("example/test1." + ext.getPrimaryFileExtension());
    XtextResource result = (XtextResource) resourceSet.createResource(uri);
    resourceSet.getResources().add(result);
    return result;
  }

}