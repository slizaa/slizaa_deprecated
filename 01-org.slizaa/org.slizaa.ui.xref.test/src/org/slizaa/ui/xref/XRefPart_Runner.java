package org.slizaa.ui.xref;

import org.slizaa.ui.xref.internal.AbstractXRefPartTest;

/**
 * <p>
 * </p>
 */
public class XRefPart_Runner extends AbstractXRefPartTest {

  public static void main(String[] args) throws Exception {

    XRefPart_Runner refPart_Runner = new XRefPart_Runner();
    refPart_Runner.setupAbstractSlizaaUITest();
    refPart_Runner.setupAbstractXmiBasedSlizaaPartTest();
    refPart_Runner.setup();
    refPart_Runner.displaySleep();
  }
}