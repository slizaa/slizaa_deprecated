/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.snippets;

/*
 * Browser example snippet: render HTML from memory
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 *
 * @since 3.0
 */
import org.eclipse.swt.*;
import org.eclipse.swt.browser.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class Snippet136 {

  public static void main(String[] args) {

    Display display = new Display();
    Shell shell = new Shell(display);
    shell.setLayout(new FillLayout());
    Browser browser;
    try {
      browser = new Browser(shell, SWT.NONE);
    } catch (SWTError e) {
      System.out.println("Could not instantiate Browser: " + e.getMessage());
      display.dispose();
      return;
    }
    
    browser.setUrl(
        "file:///D:/50-Development/environments/slizaa-master/git/slizaa-private/03-org.slizaa.neo4j/org.slizaa.neo4j.queryresult/content/result.html");
    
    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch())
        display.sleep();
    }
    display.dispose();
  }
}