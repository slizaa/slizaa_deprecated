package org.slizaa.neo4j.hierarchicalgraph.mapping.service;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@SuppressWarnings("serial")
public class HierarchicalGraphMappingException extends RuntimeException {

  /**
   * <p>
   * Creates a new instance of type {@link HierarchicalGraphMappingException}.
   * </p>
   *
   */
  public HierarchicalGraphMappingException() {
    super();
  }

  /**
   * <p>
   * Creates a new instance of type {@link HierarchicalGraphMappingException}.
   * </p>
   *
   * @param message
   * @param cause
   */
  public HierarchicalGraphMappingException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * <p>
   * Creates a new instance of type {@link HierarchicalGraphMappingException}.
   * </p>
   *
   * @param message
   */
  public HierarchicalGraphMappingException(String message) {
    super(message);
  }

  /**
   * <p>
   * Creates a new instance of type {@link HierarchicalGraphMappingException}.
   * </p>
   *
   * @param cause
   */
  public HierarchicalGraphMappingException(Throwable cause) {
    super(cause);
  }
}
