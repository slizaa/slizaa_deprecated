package org.slizaa.ui.xref;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emfforms.spi.swt.treemasterdetail.util.RootObject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.ui.tree.SlizaaTreeFactory;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XRefComposite extends Composite {

  /** the from tree viewer */
  private TreeViewer _fromTreeViewer;

  /** the to tree viewer */
  private TreeViewer _centerViewer;

  /** the to tree viewer */
  private TreeViewer _toTreeViewer;

  /** Label that displays details about the current selection */
  private Label      _detailsLabel;

  // /** - */
  // private String _providerId;
  //
  // /** - */
  // private DefaultExpandStrategy _expandStrategy;
  //
  // private XRefTreeArtifactLabelProvider _artifactLabelProvider;
  //
  // private SelectionHistory _selectionHistory;

  /**
   * <p>
   * Creates a new instance of type {@link XRefComposite}.
   * </p>
   * 
   * @param parent
   * @param iWorkbenchPartSite
   */
  public XRefComposite(Composite parent, String providerId) {
    super(parent, SWT.NONE);

    Assert.isNotNull(providerId);

    // _providerId = providerId;

    init();
  }

  // TODO
  public void setSelectedArtifacts(List<HGNode> selectedNodes) {

    //
    if (selectedNodes == null || selectedNodes.isEmpty()) {
      return;
    }

    HGRootNode rootArtifact = selectedNodes.get(0).getRootNode();

    // Set Tree Viewer input
    _fromTreeViewer.setInput(new RootObject(rootArtifact));
    _centerViewer.setInput(new RootObject(rootArtifact));
    _toTreeViewer.setInput(new RootObject(rootArtifact));

    // IBundleMakerArtifact[] selectedArtifacts = new IBundleMakerArtifact[artifacts.size()];
    // for (int i = 0; i < artifacts.size(); i++) {
    // IBundleMakerArtifact artifact = artifacts.get(i);
    //
    // if (artifact.isInstanceOf(IRootArtifact.class)) {
    // artifact = ((ArtifactTreeContentProvider) _centerViewer.getContentProvider()).getVirtualRoot();
    // }
    //
    // selectedArtifacts[i] = artifact;
    //
    // }
    // StructuredSelection selection = new StructuredSelection(selectedArtifacts);

    // // (Re-)Expand Tree Viewer according to User settings
    // _expandStrategy.exandTreeViewer();

    // Make sure selected Artifacts are visible in Center Tree Viewer
    _centerViewer.setSelection(new StructuredSelection());
    _fromTreeViewer.setSelection(new StructuredSelection());
    _toTreeViewer.setSelection(new StructuredSelection());

    // _fromTreeViewer.setSelection(
    // new StructuredSelection(((ArtifactTreeContentProvider) _fromTreeViewer.getContentProvider()).getVirtualRoot()),
    // true);

    // expand at least to level two, to make sure that more than the root artifact is visible
    _centerViewer.expandToLevel(1);
    _fromTreeViewer.expandToLevel(1);
    _toTreeViewer.expandToLevel(1);
    // if (selectedArtifacts.length == 1) {
    // _centerViewer.expandToLevel(selectedArtifacts[0], 1);
    // }
    _centerViewer.getTree().setFocus();
  }

  // /*
  // * (non-Javadoc)
  // *
  // * @see org.eclipse.swt.widgets.Composite#setFocus()
  // */
  // @Override
  // public boolean setFocus() {
  // return _centerViewer.getTree().setFocus();
  // }
  //
  //// protected IRootArtifact getVirtualRoot(TreeViewer treeViewer) {
  //// ArtifactTreeContentProvider artifactTreeContentProvider = (ArtifactTreeContentProvider) treeViewer
  //// .getContentProvider();
  //// return artifactTreeContentProvider.getVirtualRoot();
  //// }
  //

  private Composite createToolBarComposite() {
    Composite fromToolbar = new Composite(this, SWT.BORDER_SOLID);
    GridData gridData = new GridData();
    gridData.verticalAlignment = SWT.TOP;
    gridData.horizontalAlignment = SWT.FILL;
    gridData.grabExcessHorizontalSpace = true;
    gridData.grabExcessVerticalSpace = false;
    fromToolbar.setLayoutData(gridData);
    fromToolbar.setLayout(new GridLayout(1, false));
    return fromToolbar;
  }

  /**
   * <p>
   * </p>
   */
  private void init() {

    //
    GridLayout layout = new GridLayout(1, false);
    layout.marginWidth = 0;
    layout.marginHeight = 0;
    this.setLayout(layout);

    //
    SashForm sashForm = new SashForm(this, SWT.HORIZONTAL);
    GridData data = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
    sashForm.setLayoutData(data);

    //
    _fromTreeViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 2);
    _centerViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 2);
    _toTreeViewer = SlizaaTreeFactory.createTreeViewer(sashForm, null, SWT.NO_BACKGROUND | SWT.MULTI, 2);

    //
    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=162698
    // https://bugs.eclipse.org/bugs/attachment.cgi?id=52918

    // Composite fromToolBarComposite = createToolBarComposite();
    // Composite centerToolBarComposite = createToolBarComposite();
    // Composite toToolBarComposite = createToolBarComposite();

    // _selectionHistory = new SelectionHistory(_fromTreeViewer, _centerViewer, _toTreeViewer);
    // _expandStrategy = new DefaultExpandStrategy();
    // _expandStrategy.init(_fromTreeViewer, _toTreeViewer);

    // _detailsLabel = new Label(this, SWT.NONE);
    // GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1);
    // _detailsLabel.setLayoutData(gridData);

    //
    // _fromTreeViewer.setLabelProvider(new ArtifactTreeLabelProvider());
    // _artifactLabelProvider = new XRefTreeArtifactLabelProvider();
    // _centerViewer.setLabelProvider(_artifactLabelProvider);
    // _toTreeViewer.setLabelProvider(new ArtifactTreeLabelProvider());

    // add SelectionListeners
    _fromTreeViewer.addSelectionChangedListener(new FromArtifactsSelectionChangedListener());
    _centerViewer.addSelectionChangedListener(new CenterArtifactsSelectionChangedListener());
    _toTreeViewer.addSelectionChangedListener(new ToArtifactSelectionChangedListener());
  }

  // /**
  // * <p>
  // * </p>
  // *
  // * @param treeViewer
  // * @param visibleArtifacts
  // */
  // private VisibleArtifactsFilter setVisibleArtifacts(TreeViewer treeViewer,
  // Collection<IBundleMakerArtifact> visibleArtifacts) {
  // Assert.isNotNull(treeViewer);
  // Assert.isNotNull(visibleArtifacts);
  //
  // //
  // VisibleArtifactsFilter result = null;
  //
  // // set redraw to false
  // treeViewer.getTree().setRedraw(false);
  //
  // // set the filter
  // result = new VisibleArtifactsFilter(visibleArtifacts);
  // treeViewer.setFilters(new ViewerFilter[] { result });
  //
  // // redraw again
  // treeViewer.getTree().setRedraw(true);
  //
  // //
  // return result;
  // }

  // protected void setSelectedCenterArtifacts(Collection<IBundleMakerArtifact> selectedArtifacts) {
  //
  // // store the top item
  // TreeItem toTreeTopItem = _toTreeViewer.getTree().getTopItem();
  // TreeItem fromTreeTopItem = _fromTreeViewer.getTree().getTopItem();
  //
  // //
  // Set<IBundleMakerArtifact> fromArtifacts = new HashSet<IBundleMakerArtifact>();
  // for (IBundleMakerArtifact artifact : selectedArtifacts) {
  //
  // if ("<< Missing Types >>".equals(artifact.getName())) {
  // // TODO WORKAROUND!!! BM-374
  // Collection<IDependency> missingTypesDependencies = artifact.getRoot().getDependenciesTo(artifact);
  // for (IDependency iDependency : missingTypesDependencies) {
  // Collection<IDependency> coreDependencies = iDependency.getCoreDependencies();
  // for (IDependency coreDependency : coreDependencies) {
  // fromArtifacts.add(coreDependency.getFrom());
  // }
  // }
  // } else {
  // Collection<IDependency> fromDependencies = artifact.getDependenciesFrom();
  // for (IDependency dep : fromDependencies) {
  // fromArtifacts.add(dep.getFrom());
  // }
  // }
  // }
  //
  // //
  // Set<IBundleMakerArtifact> toArtifacts = new HashSet<IBundleMakerArtifact>();
  // for (IBundleMakerArtifact artifact : selectedArtifacts) {
  // Collection<IDependency> toDependencies = artifact.getDependenciesTo();
  // for (IDependency dep : toDependencies) {
  // toArtifacts.add(dep.getTo());
  // }
  // }
  //
  // //
  // setVisibleArtifacts(_toTreeViewer, toArtifacts);
  // setVisibleArtifacts(_fromTreeViewer, fromArtifacts);
  //
  // _expandStrategy.exandTreeViewer();
  //
  // // Update Details Label
  // String detailsString = (selectedArtifacts.size() > 1 ? selectedArtifacts.size() + " Artifacts" : selectedArtifacts
  // .iterator().next().getName());
  // int fromSize = fromArtifacts.size();
  // detailsString += ", Referenced By: " + fromSize + " " + (fromSize > 1 ? "Artifacts" : "Artifact");
  // int toSize = toArtifacts.size();
  // detailsString += ", Referencing: " + toSize + " " + (toSize > 1 ? "Artifacts" : "Artifact");
  //
  // _detailsLabel.setText(detailsString);
  //
  // setSelectedDependencies(null);
  //
  // // set the top item again
  // if (toTreeTopItem != null && !toTreeTopItem.isDisposed()) {
  // _toTreeViewer.getTree().setTopItem(toTreeTopItem);
  // } else if (_toTreeViewer.getTree().getItemCount() > 0) {
  // _toTreeViewer.getTree().setTopItem(_toTreeViewer.getTree().getItem(0));
  // }
  //
  // if (fromTreeTopItem != null && !fromTreeTopItem.isDisposed()) {
  // _fromTreeViewer.getTree().setTopItem(fromTreeTopItem);
  // } else if (_fromTreeViewer.getTree().getItemCount() > 0) {
  // _fromTreeViewer.getTree().setTopItem(_fromTreeViewer.getTree().getItem(0));
  // }
  // }

  // /**
  // * <p>
  // * </p>
  // *
  // * @return
  // */
  // protected String getDependencySelectionId() {
  // return Selection.MAIN_DEPENDENCY_SELECTION_ID;
  // }

  // /**
  // * <p>
  // * </p>
  // *
  // * @param selectedDetailDependencies
  // */
  // private void setSelectedDependencies(Collection<IDependency> dependencies) {
  //
  // //
  // Selection.instance().getDependencySelectionService()
  // .setSelection(getDependencySelectionId(), _providerId, dependencies);
  // }

  /**
   * <p>
   * </p>
   * 
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   * 
   */
  private final class CenterArtifactsSelectionChangedListener implements ISelectionChangedListener {

    /**
     * {@inheritDoc}
     */
    @Override
    public void selectionChanged(SelectionChangedEvent event) {

      // //
      // IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();
      // if (structuredSelection.isEmpty()) {
      // return;
      // }
      // List<IBundleMakerArtifact> selectedArtifacts = Helper.toArtifactList(structuredSelection.toList());
      //
      // // don't highlight anything
      // _artifactLabelProvider.setBundleMakerArtifacts(null);
      //
      // // reset selections in from and to viewer
      // _fromTreeViewer.setSelection(new StructuredSelection());
      // _toTreeViewer.setSelection(new StructuredSelection());
      //
      // setSelectedCenterArtifacts(selectedArtifacts);
      //
      // _centerViewer.refresh();

    }
  }

  /**
   * <p>
   * </p>
   * 
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private final class FromArtifactsSelectionChangedListener implements ISelectionChangedListener {

    /**
     * {@inheritDoc}
     */
    @Override
    public void selectionChanged(SelectionChangedEvent event) {

      //
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();

      if (structuredSelection.isEmpty()) {
        return;
      }

      // Reset Selection in 'to' Viewer
      _toTreeViewer.setSelection(new StructuredSelection());

      highlightSelectedDependencies(structuredSelection, true);
    }
  }

  /**
   * @param structuredSelection
   * @param to
   */
  protected void highlightSelectedDependencies(IStructuredSelection structuredSelection, boolean to) {

    // // Detect highlighted artifacts
    // List<IBundleMakerArtifact> selectedArtifacts = Helper.toArtifactList(structuredSelection.toList());
    // List<IBundleMakerArtifact> selectedCenterArtifacts = Helper.toArtifactList(_centerViewer.getSelection());
    //
    // // Holds the dependencies that are published via DependencySelectionService
    // List<IDependency> selectedDpendencies = new LinkedList<IDependency>();
    //
    // // Holds the Artifacts that should be highlighted in the center tree
    // Set<IBundleMakerArtifact> highlightedArtifacts = new HashSet<IBundleMakerArtifact>();
    //
    // for (final IBundleMakerArtifact selectedArtifact : selectedArtifacts) {
    //
    // Collection<IDependency> dependencies;
    // if (selectedArtifact instanceof ITypeArtifact) {
    // // TODO: WORKAROUND BM-369
    // Collection<IDependency> tempDependencies = (to ? selectedArtifact.getDependenciesTo() : selectedArtifact
    // .getDependenciesFrom());
    // dependencies = new HashSet<IDependency>();
    // for (IDependency iDependency : tempDependencies) {
    // IBundleMakerArtifact candidate = (to ? iDependency.getFrom() : iDependency.getTo());
    // if (candidate.equals(selectedArtifact)) {
    // dependencies.add(iDependency);
    // }
    // }
    // } else {
    // dependencies = (to ? selectedArtifact.getDependenciesTo(selectedCenterArtifacts) : selectedArtifact
    // .getDependenciesFrom(selectedCenterArtifacts));
    // }
    //
    // for (IDependency dep : dependencies) {
    // selectedDpendencies.add(dep);
    //
    // Collection<IDependency> coreDependencies = dep.getCoreDependencies();
    // for (IDependency coreDependency : coreDependencies) {
    //
    // IBundleMakerArtifact referencedArtifact = (to ? coreDependency.getTo() : coreDependency.getFrom());
    // highlightedArtifacts.add(referencedArtifact);
    //
    // // highlight all parents of the referenced artifact up to the selection in the center
    // while (referencedArtifact != null) {
    // if (selectedCenterArtifacts.contains(referencedArtifact)) {
    // break;
    // }
    // highlightedArtifacts.add(referencedArtifact);
    // referencedArtifact = referencedArtifact.getParent();
    // }
    // }
    // }
    // }

    //
    // setSelectedDependencies(selectedDpendencies);

    //
    // _artifactLabelProvider.setBundleMakerArtifacts(highlightedArtifacts);
    _centerViewer.refresh();

    // // Build readable summery
    // String detailsText;
    // if (to) {
    // detailsText = (selectedArtifacts.size() == 1 ? selectedArtifacts.get(0).getName() + " references "
    // : selectedArtifacts.size() + " Artifacts referencing ");
    // int fromSize = highlightedArtifacts.size();
    // detailsText += fromSize + (fromSize == 1 ? " Artifact" : " Artifacts");
    // detailsText += " in " + selectedArtifacts.get(0).getRoot().getName();
    // } else {
    // detailsText = (selectedArtifacts.size() == 1 ? selectedArtifacts.get(0).getName() + " referenced by "
    // : selectedArtifacts.size() + " Artifacts referenced by ");
    // int toSize = highlightedArtifacts.size();
    // detailsText += toSize + (toSize == 1 ? " Artifact" : " Artifacts");
    // detailsText += " in " + selectedArtifacts.get(0).getRoot().getName();
    // }
    //
    // _detailsLabel.setText(detailsText);

  }

  /**
   * <p>
   * </p>
   * 
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private final class ToArtifactSelectionChangedListener implements ISelectionChangedListener {

    /**
     * {@inheritDoc}
     */
    @Override
    public void selectionChanged(SelectionChangedEvent event) {
      //
      IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();

      if (structuredSelection.isEmpty()) {
        return;
      }

      // Reset Selection in 'from' Viewer
      _fromTreeViewer.setSelection(new StructuredSelection());

      highlightSelectedDependencies(structuredSelection, false);

    }
  }

  // class BackInHistoryAction extends Action implements IHistoryChangedListener<TreeSelectionSnapshot> {
  // private final SelectionHistory _history;
  //
  // public BackInHistoryAction(SelectionHistory history) {
  // super("Back");
  // _history = history;
  // setToolTipText("Go back in Selection History");
  // setImageDescriptor(XRefViewImages.NAV_BACKWARD_ENABLED.getImageDescriptor());
  // setDisabledImageDescriptor(XRefViewImages.NAV_BACKWARD_DISABLED.getImageDescriptor());
  //
  // history.addHistoryChangedListener(this);
  // }
  //
  // @Override
  // public void run() {
  // _history.goBack();
  // }
  //
  // @Override
  // public void historyChanged(History<TreeSelectionSnapshot> history) {
  // setEnabled(history.canGoBack());
  // }
  // }

  // class ForwadInHistoryAction extends Action implements IHistoryChangedListener<TreeSelectionSnapshot> {
  // private final SelectionHistory _history;
  //
  // public ForwadInHistoryAction(SelectionHistory history) {
  // super("Forward");
  //
  // setToolTipText("Go forward in Selection History");
  // setImageDescriptor(XRefViewImages.NAV_FORWARD_ENABLED.getImageDescriptor());
  // setDisabledImageDescriptor(XRefViewImages.NAV_FORWARD_DISABLED.getImageDescriptor());
  // _history = history;
  //
  // history.addHistoryChangedListener(this);
  // }
  //
  // @Override
  // public void run() {
  // _history.goForward();
  // }
  //
  // @Override
  // public void historyChanged(History<TreeSelectionSnapshot> history) {
  // setEnabled(history.canGoForward());
  // }
  // }

  // class SelectionHistory extends History<TreeSelectionSnapshot> implements ISelectionChangedListener {
  //
  // boolean _mute = false;
  //
  // public SelectionHistory(TreeViewer... viewers) {
  // for (TreeViewer treeViewer : viewers) {
  // treeViewer.addSelectionChangedListener(this);
  // }
  // }
  //
  // /*
  // * (non-Javadoc)
  // *
  // * @see
  // *
  // org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent
  // * )
  // */
  // @Override
  // public void selectionChanged(SelectionChangedEvent event) {
  // TreeViewer in = (TreeViewer) event.getSource();
  // if (_mute) {
  // return;
  // }
  //
  // IStructuredSelection selection = (IStructuredSelection) event.getSelection();
  //
  // if (selection.isEmpty()) {
  // return;
  // }
  //
  // TreeSelectionSnapshot userSelection = new TreeSelectionSnapshot();
  // userSelection.addSelection(_fromTreeViewer, _fromTreeViewer == in);
  // userSelection.addSelection(_centerViewer, _centerViewer == in);
  // userSelection.addSelection(_toTreeViewer, _toTreeViewer == in);
  //
  // add(userSelection);
  // }
  //
  // /*
  // * (non-Javadoc)
  // *
  // * @see org.bundlemaker.core.util.history.History#goBack()
  // */
  // @Override
  // public void goBack() {
  // super.goBack();
  //
  // reselect(getCurrent());
  // }
  //
  // /*
  // * (non-Javadoc)
  // *
  // * @see org.bundlemaker.core.util.history.History#goForward()
  // */
  // @Override
  // public void goForward() {
  // super.goForward();
  //
  // reselect(getCurrent());
  // }
  //
  // public void reselect(TreeSelectionSnapshot userSelection) {
  // _mute = true;
  // try {
  // userSelection.reselect();
  // } finally {
  // _mute = false;
  // }
  // }
  // }

  /**
   * 
   */
  public void refresh() {
    _centerViewer.refresh();
    _fromTreeViewer.refresh();
    _toTreeViewer.refresh();
  }
}