package org.slizaa.neo4j.ui.cypherview;

import javax.annotation.PostConstruct;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.slizaa.neo4j.opencypher.spi.IGraphDatabaseClientAdapter;
import org.slizaa.neo4j.opencypher.spi.IGraphDatabaseClientAdapterConsumer;
import org.slizaa.neo4j.opencypher.ui.internal.OpencypherActivator;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class CypherViewPart implements IGraphDatabaseClientAdapterConsumer {
  
  @Override
  public void setGraphDatabaseClientAdapter(IGraphDatabaseClientAdapter adapter) {
    // TODO Auto-generated method stub
    
  }

  @PostConstruct
  public void createComposite(Composite parent) {

    //
    OpencypherActivator activator = OpencypherActivator.getInstance();
    Injector injector = activator.getInjector(OpencypherActivator.ORG_SLIZAA_NEO4J_OPENCYPHER_OPENCYPHER);

    //
    OpenCypherResourceProvider provider = injector.getInstance(OpenCypherResourceProvider.class);
    EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);

    //
    EmbeddedEditor editor = factory.newEditor(provider).withParent(parent);
    EmbeddedEditorModelAccess model = editor.createPartialEditor();
    
    // Configuring default font
    StyledText textWidget = editor.getViewer().getTextWidget();
    textWidget.setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
  }
}
