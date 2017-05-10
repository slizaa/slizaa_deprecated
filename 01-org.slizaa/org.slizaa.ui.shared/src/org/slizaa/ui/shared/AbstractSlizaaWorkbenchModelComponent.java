package org.slizaa.ui.shared;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.widgets.Display;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.workbench.model.ModelPackage;
import org.slizaa.workbench.model.SlizaaWorkbenchModel;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractSlizaaWorkbenchModelComponent {

  /** - */
  private SlizaaWorkbenchModel _workbenchModel;

  /** - */
  private Adapter              _workbenchModelObserver;

  /**
   * <p>
   * </p>
   */
  @PostConstruct
  @Inject
  public final void initializeAbstractSlizaaPart(SlizaaWorkbenchModel workbenchModel) {

    _workbenchModel = checkNotNull(workbenchModel, "SlizaaWorkbenchModel must not be null." );
    
    //
    _workbenchModelObserver = new AdapterImpl() {
      @Override
      public void notifyChanged(Notification msg) {
        if (msg.getFeature() != null) {

          //
          Display.getDefault().syncExec(() -> {
            if (msg.getFeature().equals(ModelPackage.eINSTANCE.getSlizaaWorkbenchModel_RootNode())) {
              handleRootNodeChanged((HGRootNode) msg.getOldValue(), (HGRootNode) msg.getNewValue());
            } else if (msg.getFeature()
                .equals(ModelPackage.eINSTANCE.getSlizaaWorkbenchModel_MainDependencySelection())) {
              handleMainDependencySelectionChanged((DependencySelection) msg.getOldValue(),
                  (DependencySelection) msg.getNewValue());
            } else if (msg.getFeature()
                .equals(ModelPackage.eINSTANCE.getSlizaaWorkbenchModel_DetailDependencySelection())) {
              handleDetailDependencySelectionChanged((DependencySelection) msg.getOldValue(),
                  (DependencySelection) msg.getNewValue());
            } else if (msg.getFeature().equals(ModelPackage.eINSTANCE.getSlizaaWorkbenchModel_NodeSelection())) {
              handleNodeSelectionChanged((NodeSelection) msg.getOldValue(), (NodeSelection) msg.getNewValue());
            }
          });
        }
      }
    };

    //
    _workbenchModel.eAdapters().add(_workbenchModelObserver);
  }

  /**
   * <p>
   * </p>
   */
  @PreDestroy
  public final void disposeAbstractSlizaaPart() {

    //
    _workbenchModel.eAdapters().remove(_workbenchModelObserver);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public SlizaaWorkbenchModel getWorkbenchModel() {
    return _workbenchModel;
  }

  /**
   * <p>
   * </p>
   *
   * @param oldValue
   * @param newValue
   */
  protected void handleRootNodeChanged(HGRootNode oldValue, HGRootNode newValue) {
    // do nothing
  }

  protected void handleDetailDependencySelectionChanged(DependencySelection oldValue, DependencySelection newValue) {
    // do nothing
  }

  protected void handleMainDependencySelectionChanged(DependencySelection oldValue, DependencySelection newValue) {
    // do nothing
  }

  protected void handleNodeSelectionChanged(NodeSelection oldValue, NodeSelection newValue) {
    // do nothing
  }
}
