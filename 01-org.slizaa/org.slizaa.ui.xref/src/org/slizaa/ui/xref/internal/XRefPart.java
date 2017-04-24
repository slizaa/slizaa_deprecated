package org.slizaa.ui.xref.internal;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.hierarchicalgraph.selection.SelectionIdentifier;
import org.slizaa.hierarchicalgraph.selection.xref.XRefStack;
import org.slizaa.ui.xref.XRefUtils;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XRefPart {

  /** - */
  @Inject
  private MPerspective  _perspective;

  /** - */
  private XRefComposite _composite;

  /** - */
  private HGRootNode    _rootNode;

  /** - */
  private NodeSelection _filteredNodeSelection;

  /** - */
  private Adapter       _adapter;

  public XRefPart() {

    // TODO!!
    //
    _adapter = new AdapterImpl() {
      @Override
      public void notifyChanged(Notification msg) {
        setFilter();
      }
    };
  }

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
    _composite = new XRefComposite(parent, () -> _perspective.getContext());
    _composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    if (_rootNode != null) {
      _composite.setRootNode(_rootNode);
      // setFilter();
    }
  }

  @Inject
  public void handleChangedRootNode(@Optional
  @Named(SelectionIdentifier.CURRENT_ROOTNODE)
  final HGRootNode rootNode) {

    //
    if (_rootNode == rootNode) {
      return;
    }

    // remove old selection
    if (_rootNode != null) {
      XRefUtils.getOrCreateFilteredNodeSelection(_rootNode).eAdapters().remove(_adapter);
    }

    // set the new node
    _rootNode = rootNode;

    if (_rootNode != null) {
      _filteredNodeSelection = XRefUtils.getOrCreateFilteredNodeSelection(_rootNode);
      _filteredNodeSelection.eAdapters().add(_adapter);
    } else {
      _filteredNodeSelection = null;
    }

    // immediately set if composite is already created
    if (_composite != null && !_composite.isDisposed()) {
      _composite.setRootNode(_rootNode);
      // setFilter();
    }
  }

  /**
   * <p>
   * </p>
   */
  private void setFilter() {

    // //
    // if (_rootNode != null) {
    // _composite.setFilteredNodes(
    // _filteredNodeSelection != null ? _filteredNodeSelection.getNodes() : Collections.emptyList(), true);
    // if (!_composite.isDisposed()) {
    // _composite.refresh();
    // }
    // }
  }

  /**
   * <p>
   * JUST FOR TESTING PURPOSE
   * </p>
   */
  void setPerspective(MPerspective perspective) {
    _perspective = perspective;
  }
}
