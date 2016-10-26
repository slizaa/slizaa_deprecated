package org.slizaa.neo4j.jqassistant.application.processor;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;

public class SlizaaProcessor {

  @Inject
  protected MApplication app;

  @Execute
  public void execute() {
    // Resource res = new XMLResourceImpl();
    // res.getContents().add(EcoreUtil.copy((EObject)app));
    // try {
    // res.save(System.out, null);
    // } catch (IOException ioe) {
    // ioe.printStackTrace();
    // }
  }
}
