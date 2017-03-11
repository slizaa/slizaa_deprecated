package org.slizaa.hierarchicalgraph.spi;

public interface INodeComparator {

  public int category(Object element);

  public int compare(Object e1, Object e2);
}
