package org.slizaa.neo4j.jqassistant.application.perspectiveswitcher;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class SpacerControl {

  @PostConstruct
  public void postConstruct(final Composite parent) {
    Composite body = new Composite(parent, SWT.NONE);
    body.setLayout(new FillLayout());
  }
}