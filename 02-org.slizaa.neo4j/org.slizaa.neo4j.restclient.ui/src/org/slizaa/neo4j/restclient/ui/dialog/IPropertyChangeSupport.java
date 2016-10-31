package org.slizaa.neo4j.restclient.ui.dialog;

import java.beans.PropertyChangeListener;

public interface IPropertyChangeSupport {

  void addPropertyChangeListener(PropertyChangeListener listener);

  void addPropertyChangeListener(String propertyName, PropertyChangeListener listener);

  void removePropertyChangeListener(PropertyChangeListener listener);

  void removePropertyChangeListener(String propertyName, PropertyChangeListener listener);

}