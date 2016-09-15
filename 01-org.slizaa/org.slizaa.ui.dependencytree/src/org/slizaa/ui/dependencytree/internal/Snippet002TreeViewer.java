package org.slizaa.ui.dependencytree.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * A simple TreeViewer to demonstrate usage
 *
 */

public class Snippet002TreeViewer {

  private int            i = 1;

  private MyViewerFilter _viewerFilter;

  private class MyViewerFilter extends ViewerFilter {

    private String _filterString = "1";

    private Viewer _viewer;

    public MyViewerFilter(Viewer viewer) {
      this._viewer = viewer;
    }

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
      System.out.println(element);
      return !element.toString().contains(_filterString);
    }

    public void setFilterString(String string) {
      _filterString = string;
      _viewer.refresh();
    }
  }

  private class MyContentProvider implements ITreeContentProvider {

    @Override
    public Object[] getElements(Object inputElement) {
      return ((MyModel) inputElement).child.toArray();
    }

    @Override
    public Object[] getChildren(Object parentElement) {
      return getElements(parentElement);
    }

    @Override
    public Object getParent(Object element) {
      if (element == null) {
        return null;
      }

      return ((MyModel) element).parent;
    }

    @Override
    public boolean hasChildren(Object element) {
      return ((MyModel) element).child.size() > 0;
    }

  }

  public class MyModel {
    public MyModel       parent;

    public List<MyModel> child = new ArrayList<>();

    public int           counter;

    public MyModel(int counter, MyModel parent) {
      this.parent = parent;
      this.counter = counter;
    }

    @Override
    public String toString() {
      String rv = "Item ";
      if (parent != null) {
        rv = parent.toString() + ".";
      }

      rv += counter;

      return rv;
    }
  }

  public Snippet002TreeViewer(Shell shell) {

    Composite composite = new Composite(shell, SWT.NONE);
    FillLayout fillLayout = new FillLayout();
    fillLayout.type = SWT.VERTICAL;
    composite.setLayout(fillLayout);

    final TreeViewer v = new TreeViewer(composite);
    v.setLabelProvider(new LabelProvider());
    v.setContentProvider(new MyContentProvider());
    v.setInput(createModel());
    _viewerFilter = new MyViewerFilter(v);
    v.setFilters(_viewerFilter);

    final Button button = new Button(shell, SWT.BORDER);
    button.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        i++;
        if (i > 9) {
          i = 1;
        }
        _viewerFilter.setFilterString("" + i);
        System.out.println("Set " + i);
      }
    });
  }

  private MyModel createModel() {

    MyModel root = new MyModel(0, null);
    root.counter = 0;

    MyModel tmp;
    for (int i = 1; i < 10; i++) {
      tmp = new MyModel(i, root);
      root.child.add(tmp);
      for (int j = 1; j < i; j++) {
        tmp.child.add(new MyModel(j, tmp));
      }
    }

    return root;
  }

  public static void main(String[] args) {
    Display display = new Display();
    Shell shell = new Shell(display);
    shell.setLayout(new FillLayout());
    Snippet002TreeViewer viewer = new Snippet002TreeViewer(shell);
    shell.open();

    // new Thread(() -> {
    // int i = 0;
    // while (true) {
    // i++;
    // if (i>9) {
    // i=0;
    // }
    // viewer._viewerFilter.setFilterString("" + i);
    // try {
    // Thread.sleep(1000);
    // } catch (InterruptedException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // }
    // }).run();

    while (!shell.isDisposed()) {
      if (!display.readAndDispatch())
        display.sleep();
    }

    display.dispose();
  }
}