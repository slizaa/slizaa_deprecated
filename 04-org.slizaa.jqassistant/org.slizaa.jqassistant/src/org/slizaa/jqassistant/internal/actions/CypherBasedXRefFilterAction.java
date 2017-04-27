package org.slizaa.jqassistant.internal.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.hierarchicalgraph.selection.SelectionHolder;
import org.slizaa.jqassistant.internal.actions.filter.AbstractFilterAction;
import org.slizaa.jqassistant.internal.actions.filter.CypherUtils;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.dbadapter.QueryResultConverter;
import org.slizaa.neo4j.opencypher.openCypher.Cypher;
import org.slizaa.neo4j.opencypher.util.CypherNormalizer;
import org.slizaa.ui.shared.context.BusyCursor;
import org.slizaa.ui.tree.ISlizaaActionContribution;
import org.slizaa.ui.xref.XRefUtils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@Component(service = ISlizaaActionContribution.class)
public class CypherBasedXRefFilterAction extends AbstractFilterAction {

  @Override
  public void execute(List<?> selection, Viewer viewer) {

    HGNode node = (HGNode) selection.get(0);

    ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(Display.getDefault().getActiveShell(),
        new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());

    dialog.setTitle("Tree Selection");
    dialog.setMessage("Select the elements from the tree:");
    dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
    dialog.addFilter(new ViewerFilter() {

      @Override
      public boolean select(Viewer viewer, Object parentElement, Object element) {
        if (element instanceof IFile) {
          IFile file = (IFile) element;
          return "cypher".equals(file.getFileExtension());
        }
        return true;
      }
    });

    //
    if (Dialog.OK == dialog.open()) {

      //
      IFile cypherFile = (IFile) dialog.getFirstResult();

      try {

        final String cypherQuery = CypherNormalizer.normalize(readStream(cypherFile.getContents()));

        //
        Cypher cypher = (Cypher) Platform.getAdapterManager().loadAdapter(cypherQuery, Cypher.class.getName());

        //
        if (!CypherUtils.returnItemsContainOnlyIds(cypher)) {
          MessageDialog.openError(Display.getCurrent().getActiveShell(), "Invalid cyuper statement",
              "A filter statement must return only ids (e.g. RETURNS id(a), id(b)).");
          return;
        }

        Neo4jRestClient restClient = node.getRootNode().getExtension(Neo4jRestClient.class);

        BusyCursor.execute(Display.getCurrent().getActiveShell(), () -> {

          Future<JsonObject> future = restClient.executeCypherQuery(cypherQuery);
          JsonObject jsonObject;
          try {
            jsonObject = future.get();

            System.out.println(jsonObject);
            // TODO :ERROR CHECK!!
            
            //
            List<Long> filteredNodeIds = new LinkedList<>();
            List<Void> rows = QueryResultConverter.convertRows(jsonObject, row -> {
              for (JsonElement jsonElement : row) {
                filteredNodeIds.add(jsonElement.getAsLong());
              }
              return null;
            });

            //
            List<HGNode> filteredNodes = filteredNodeIds.stream().map(id -> node.getRootNode().lookupNode(id))
                .filter(n -> n != null).collect(Collectors.toList());

            //
            SelectionHolder<NodeSelection> selectionHolder = XRefUtils
                .getOrCreateFilteredNodeSelectionHolder(node.getRootNode());

            Display.getDefault().asyncExec(() -> {
              NodeSelection sel = SelectionFactory.eINSTANCE.createNodeSelection();
              sel.getNodes().addAll(filteredNodes);
              selectionHolder.setSelection(sel);
            });
          } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        });

      } catch (IOException | CoreException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  @Override
  public String getLabel(List<?> selection) {
    return "Filter... ";
  }

  /**
   * Reads the stream into a string
   * 
   * @param iStream
   *          the input stream
   * @return the string read from the stream
   * @throws IOException
   *           when an IO error occurs
   */
  private String readStream(InputStream iStream) throws IOException {

    // Buffered reader allows us to read line by line
    try (BufferedReader bReader = new BufferedReader(new InputStreamReader(iStream))) {
      StringBuilder builder = new StringBuilder();
      String line;
      while ((line = bReader.readLine()) != null) { // Read till end
        builder.append(line);
        builder.append("\n"); // append new line to preserve lines
      }
      return builder.toString();
    }
  }
}
