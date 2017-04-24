package org.slizaa.hierarchicalgraph.selection.xref;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IXRefListener {

  void coreDependenciesChanged();

  void centerNodeSelectionChanged();

  void leftsidedNodeSelectionChanged();

  void rightsidedNodeSelectionChanged();
  
  void croppedSelectionChanged();

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  public static class Adapter implements IXRefListener {

    @Override
    public void coreDependenciesChanged() {
      //
    }

    @Override
    public void centerNodeSelectionChanged() {
      //
    }

    @Override
    public void leftsidedNodeSelectionChanged() {
      //
    }

    @Override
    public void rightsidedNodeSelectionChanged() {
      //
    }

    @Override
    public void croppedSelectionChanged() {
      //
    }
  }
}
