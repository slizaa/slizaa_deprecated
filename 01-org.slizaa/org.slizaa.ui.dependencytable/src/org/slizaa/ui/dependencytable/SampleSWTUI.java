package org.slizaa.ui.dependencytable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SampleSWTUI 
{

    public Shell showGUI(final Display display)
    {
        Shell shell = new Shell(display);
        shell.setLayout(new GridLayout(3,true));
        shell.setText("Sample SWT UI");

        new Label(shell, SWT.NONE).setText("User Name: ");
        final Text nameText = new Text(shell, SWT.BORDER);
        nameText.setText ("");
        GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
        data.horizontalSpan = 2;
        nameText.setLayoutData(data);

        new Label(shell, SWT.NONE).setText("Password: ");
        final Text passwordText = new Text(shell, SWT.BORDER|SWT.PASSWORD);
        passwordText.setText ("");
        data = new GridData(SWT.FILL, SWT.FILL, true, false);
        data.horizontalSpan = 2;
        passwordText.setLayoutData(data);

        Button loginButton = new Button (shell, SWT.PUSH);
        loginButton.setText ("Login");
        data = new GridData(SWT.FILL, SWT.FILL, true, false);
        data.horizontalSpan = 3;
        loginButton.setLayoutData(data);
        loginButton.addSelectionListener(new SelectionAdapter(){
            public void widgetSelected(SelectionEvent e) 
            {
                String user = nameText.getText();
                String password = passwordText.getText();

                System.out.println("\n\n\n");
                if(user.equals("Favonius") && password.equals("abcd123")){
                    System.out.println("Success !!!");
                }else {
                    System.err.println("What the .. !! Anyway it is just a demo !!");
                }                   
            }
        });

        shell.pack();
        shell.open();
        return shell;

    }

    public static void main(String [] args) 
    {
        Display display = new Display();
        Shell shell = new SampleSWTUI().showGUI(display);
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }

        display.dispose();
    }
}