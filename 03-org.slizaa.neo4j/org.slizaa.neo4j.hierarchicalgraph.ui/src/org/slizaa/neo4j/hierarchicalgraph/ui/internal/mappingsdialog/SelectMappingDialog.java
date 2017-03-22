package org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappingsdialog;

import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.Activator;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.Images;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class SelectMappingDialog extends TitleAreaDialog {

  /** - */
  private MappingDescriptorContainer _mappingDescriptorContainer;

  /** - */
  private TreeViewer                 _treeViewer;

  /** - */
  private ISlizaaMappingDescriptor   _selectedMappingDescriptor;

  /** - */
  private Text                       _description;

  /**
   * <p>
   * Creates a new instance of type {@link SelectMappingDialog}.
   * </p>
   *
   * @param parentShell
   */
  public SelectMappingDialog(Shell parentShell, MappingDescriptorContainer mappingDescriptorContainer) {
    super(parentShell);

    //
    _mappingDescriptorContainer = checkNotNull(mappingDescriptorContainer);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void create() {
    super.create();
    setTitle("Select the graph mapping");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void configureShell(Shell shell) {
    super.configureShell(shell);
    shell.setText("Select Mapping");
    shell.setImage(Images.SLIZAA_16.getImage());
    shell.setSize(800,800);
    Rectangle screen = shell.getDisplay().getMonitors()[0].getBounds();
    shell.setBounds((screen.width-shell.getSize().x)/2, (screen.height-shell.getSize().y)/2, shell.getSize().x, shell.getSize().y);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected Control createDialogArea(Composite parent) {

    Composite area = (Composite) super.createDialogArea(parent);
    Composite container = new Composite(area, SWT.NONE);
    container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    GridLayout layout = new GridLayout(1, false);
    container.setLayout(layout);

    _treeViewer = SlizaaTreeViewerFactory.createTreeViewer(container, SWT.SINGLE | SWT.BORDER);
    _treeViewer.setInput(_mappingDescriptorContainer);

    _treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

      @Override
      public void selectionChanged(SelectionChangedEvent event) {
        if (event.getSelection() instanceof TreeSelection
            && ((TreeSelection) event.getSelection()).getFirstElement() instanceof ISlizaaMappingDescriptor) {
          _selectedMappingDescriptor = (ISlizaaMappingDescriptor) ((TreeSelection) event.getSelection())
              .getFirstElement();
        } else {
          _selectedMappingDescriptor = null;
        }
        handleSelection();
      }
    });

    _description = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
    _description.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
    _description.setText("Here is some text");

    return area;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected boolean isResizable() {
    return true;
  }

  @Override
  protected void okPressed() {
    super.okPressed();
  }

  /**
   * <p>
   * </p>
   */
  private void handleSelection() {

    // set the button
    getButton(IDialogConstants.OK_ID).setEnabled(_selectedMappingDescriptor != null);

    //
    if (_selectedMappingDescriptor != null) {
      setMessage(_selectedMappingDescriptor.getName(), IMessageProvider.NONE);
      _description.setText(_selectedMappingDescriptor.getDescription());
    }
    //
    else {
      setMessage(null);
      _description.setText("");
    }

  }

  public ISlizaaMappingDescriptor getMappingDescriptor() {
    return _selectedMappingDescriptor;
  }
}