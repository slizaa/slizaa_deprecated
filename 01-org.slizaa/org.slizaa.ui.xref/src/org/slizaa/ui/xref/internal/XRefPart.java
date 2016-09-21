package org.slizaa.ui.xref.internal;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XRefPart {

  /** - */
  private XRefComposite _composite;

  /** - */
  private HGRootNode    _rootNode;

  /** - */
  @Inject
  private MPerspective  _perspective;

  /**
   * <p>
   * </p>
   *
   * @param parent
   */
  @PostConstruct
  public void createComposite(Composite parent) {

    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    parent.setLayout(layout);

    //
    _composite = new XRefComposite(parent, _perspective.getContext());
    _composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    _composite.setRootNode(_rootNode);
  }

  @Inject
  public void handleChangedDependencies(@Optional
  @Named("slizaa.current_rootnode")
  final HGRootNode rootNode) {

    // store the root node
    _rootNode = rootNode;

    // immediately set if composite is already created
    if (_composite != null) {
      _composite.setRootNode(_rootNode);
    }
  }
}
