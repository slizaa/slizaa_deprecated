/*******************************************************************************
 * Copyright (c) Gerd W�therich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd W�therich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.neo4j.dbadapter.ui.dialog;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.databinding.dialog.TitleAreaDialogSupport;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.slizaa.neo4j.dbadapter.ui.dialog.UrlDialogModel.Protocol;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class UrlDialog extends TitleAreaDialog {

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private final class ConnectRunnable implements IRunnableWithProgress {

    /** - */
    private boolean _connectSuccessful;

    /**
     * <p>
     * </p>
     *
     * @return
     */
    public boolean isConnectSuccessful() {
      return _connectSuccessful;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
      _connectSuccessful = _model.testConnection();
    }
  }

  static final String    ENTER_LOCATION_OF_THE_JQASSISTANT_SERVER = "Enter location of the JQAssistant server";

  /** - */
  private UrlDialogModel _model;

  /** - */
  private Button         _button_validate;

  /** - */
  private ComboViewer    _comboviewer_protocol;

  /** - */
  private Text           _text_host;

  /** - */
  private Text           _text_uri;

  /** - */
  private Text           _text_port;

  /**
   * <p>
   * Creates a new instance of type {@link UrlDialog}.
   * </p>
   *
   * @param parentShell
   */
  public UrlDialog(Shell parentShell) {
    super(parentShell);

    // create the model
    _model = new UrlDialogModel();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void create() {
    super.create();

    // set title and message
    setTitle("JQAssistant server");
    setMessage(ENTER_LOCATION_OF_THE_JQASSISTANT_SERVER, IMessageProvider.INFORMATION);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void configureShell(Shell newShell) {
    super.configureShell(newShell);

    // set the shell title
    newShell.setText("Add JQAssistant Server");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected Control createDialogArea(Composite parent) {

    // create the dialog area
    Composite dialogArea = (Composite) super.createDialogArea(parent);

    // create and layout container
    Composite container = new Composite(dialogArea, SWT.NONE);
    GridDataUtil.applyGridData(container).withFill();
    GridLayoutUtil.applyGridLayout(container).numColumns(1).columnsEqualWidth(false).marginHeight(10).marginWidth(10)
        .horizontalSpacing(20).verticalSpacing(20);

    //
    createLocationGroup(container);
    createConnectionGroup(container);
    createValidateButton(container);

    // set the focus
    _text_host.setFocus();

    //
    return dialogArea;
  }

  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("unchecked")
@Override
  protected Control createContents(Composite parent) {
    Control control = super.createContents(parent);

    // data binding
    DataBindingContext dbc = new DataBindingContext();
    TitleAreaDialogSupport.create(this, dbc);

    dbc.bindValue(ViewersObservables.observeSingleSelection(_comboviewer_protocol),
        BeanProperties.value("protocol").observe(_model));

    dbc.bindValue(WidgetProperties.text(SWT.Modify).observe(_text_uri), BeanProperties.value("uri").observe(_model),
        new UpdateValueStrategy().setAfterConvertValidator(new UrlValidator(_model)), null);

    dbc.bindValue(WidgetProperties.text(SWT.Modify).observe(_text_host),
        BeanProperties.value("hostName").observe(_model),
        new UpdateValueStrategy().setAfterConvertValidator(new HostNameValidator()), null);

    dbc.bindValue(WidgetProperties.text(SWT.Modify).observe(_text_port), BeanProperties.value("port").observe(_model),
        new UpdateValueStrategy().setAfterConvertValidator(new IntegerValidator()), null);

    dbc.bindValue(WidgetProperties.enabled().observe(_button_validate),
        BeanProperties.value("validUrl").observe(_model), new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER),
        new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));

    dbc.bindValue(WidgetProperties.enabled().observe(getButton(OK)), BeanProperties.value("validUrl").observe(_model),
        new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER),
        new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));

    return control;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public String getUri() {
    return _model.getUri();
  }

  private void createValidateButton(Composite container) {

    _button_validate = new Button(container, SWT.PUSH);
    _button_validate.setText("Test connection");
    _button_validate.setEnabled(false);

    GridDataUtil.applyGridData(_button_validate).horizontalSpan(2).grabExcessHorizontalSpace(false)
        .horizontalAlignment(SWT.RIGHT);

    _button_validate.addListener(SWT.Selection, new Listener() {
      public void handleEvent(Event event) {

        ConnectRunnable connectRunnable = new ConnectRunnable();

        try {
          new ProgressMonitorDialog(getParentShell()).run(false, false, connectRunnable);
        } catch (Exception e) {
          //
        }

        if (!(connectRunnable.isConnectSuccessful())) {
          MessageDialogs.openCannotConnectToServerDialog(_model.getUri());
        } else {
          MessageDialogs.openSuccessfullyConnectedToServer(_model.getUri());
        }
      }
    });
  }

  private void createLocationGroup(Composite container) {
    //
    Group group = new Group(container, SWT.NONE);
    group.setText("Location");
    GridDataUtil.applyGridData(group).withFill();
    GridLayoutUtil.applyGridLayout(group).numColumns(2).columnsEqualWidth(false).marginHeight(10).marginWidth(10)
        .horizontalSpacing(10).verticalSpacing(10);

    // URI
    new Label(group, SWT.NONE).setText("URI:");
    _text_uri = new Text(group, SWT.BORDER);
    GridDataUtil.applyGridData(_text_uri).withHorizontalFill();

    // HOST
    new Label(group, SWT.NONE).setText("Host:");
    _text_host = new Text(group, SWT.BORDER);
    GridDataUtil.applyGridData(_text_host).withHorizontalFill();
  }

  private void createConnectionGroup(Composite container) {
    Group group;
    //
    group = new Group(container, SWT.NONE);
    group.setText("Connection");
    GridDataUtil.applyGridData(group).withFill();
    GridLayoutUtil.applyGridLayout(group).numColumns(2).columnsEqualWidth(false).marginHeight(10).marginWidth(10)
        .horizontalSpacing(10).verticalSpacing(10);

    // Protocoll
    new Label(group, SWT.NONE).setText("Protocol:");
    _comboviewer_protocol = new ComboViewer(group, SWT.READ_ONLY);
    _comboviewer_protocol.setContentProvider(ArrayContentProvider.getInstance());
    _comboviewer_protocol.setInput(Protocol.values());

    // PORT
    new Label(group, SWT.NONE).setText("Port:");
    _text_port = new Text(group, SWT.BORDER);
  }

  /**
   * <p>
   * </p>
   *
   * @param args
   */
  public static void main(String[] args) {

    //
    Display display = new Display();

    Realm.runWithDefault(DisplayRealm.getRealm(display), new Runnable() {
      @Override
      public void run() {

        // The SWT event loop
        Display display = Display.getCurrent();

        UrlDialog dialog = new UrlDialog(display.getActiveShell());
        dialog.open();

        while (!display.isDisposed()) {
          if (!display.readAndDispatch()) {
            display.sleep();
          }
        }
      }
    });
  }
}
