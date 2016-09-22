package org.slizaa.ui.common.context;

import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.widgets.Display;

public class ContextHelper {

  public static void setValueInContext(IEclipseContext eclipseContext, String name, Object value) {
    checkNotNull(eclipseContext).declareModifiable(checkNotNull(name));
    Display.getDefault().syncExec(() -> eclipseContext.set(name, value));
  }
}
