package org.slizaa.hierarchicalgraph.impl;

public class ExtendedDefaultNodeSourceImpl extends DefaultNodeSourceImpl {

  @Override
  public boolean isAutoExpand() {
    return false;
  }

  @Override
  public void onExpand() {
    // do nothing
  }

  @Override
  public void onCollapse() {
    // do nothing
  }

  @Override
  public void onSelect() {
    // do nothing
  }

}
