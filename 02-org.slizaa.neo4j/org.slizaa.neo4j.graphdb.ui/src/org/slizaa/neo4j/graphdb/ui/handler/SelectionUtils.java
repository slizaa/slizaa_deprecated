package org.slizaa.neo4j.graphdb.ui.handler;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;

/**
 * @author
 */
public class SelectionUtils {

	/**
	 * <p>
	 * </p>
	 * 
	 * @param selection
	 * @param consumer
	 */
	public static void doWithSelection(Object selection, Consumer<Neo4JRemoteRepository> consumer) {
		getNeo4JRepositories(selection).forEach(consumer);
	}

	/**
	 * <p>
	 * </p>
	 *
	 * @param selection
	 * @return
	 */
	public static List<Neo4JRemoteRepository> getNeo4JRepositories(Object selection) {

		//
		List<Neo4JRemoteRepository> result = new LinkedList<>();

		//
		if (selection instanceof Collection<?>) {
			for (Object element : (Collection<?>) selection) {
				result.add((Neo4JRemoteRepository) element);
			}
		} else {
			result.add((Neo4JRemoteRepository) selection);
		}

		//
		return result;
	}

	/**
	 * <p>
	 * </p>
	 *
	 * @param selection
	 * @return
	 */
	public static boolean onlyNeo4JRepositoriesSelected(Object selection) {

		//
		if (selection instanceof Collection<?>) {
			for (Object element : (Collection<?>) selection) {
				if (!(element instanceof Neo4JRemoteRepository)) {
					return false;
				}
			}
			return true;
		}

		//
		return selection instanceof Neo4JRemoteRepository;
	}
}
