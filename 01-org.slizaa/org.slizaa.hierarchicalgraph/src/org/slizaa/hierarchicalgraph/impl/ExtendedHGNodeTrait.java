package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;

public class ExtendedHGNodeTrait {

	/** - */
	private HGNodeImpl _hgNode;

	/** - */
	protected List<HGNode> _cachedParents;

	/** - */
	protected List<HGDependency> _cachedOutgoingSubTreeCoreDependencies;

	/** - */
	protected List<HGDependency> _cachedIncomingSubTreeCoreDependencies;

	/** - */
	private Map<HGNode, HGDependency> _cachedAggregatedOutgoingDependenciesMap;

	/** - */
	private Map<HGNode, HGDependency> _cachedAggregatedIncomingDependenciesMap;

	/**
	 * <p>
	 * Creates a new instance of type {@link ExtendedHGNodeTrait}.
	 * </p>
	 *
	 * @param hgNode
	 */
	public ExtendedHGNodeTrait(HGNodeImpl hgNode) {
		_hgNode = hgNode;
	}

	public Object getIdentifier() {
		return _hgNode.getNodeSource().getIdentifier();
	}

	public HGRootNode getRootNode() {

		if (_hgNode.rootNode == null) {

			if (_hgNode.getParent() == null) {

				if (!(_hgNode instanceof HGRootNode)) {
					throw new RuntimeException("No root set.");
				}

				_hgNode.rootNode = (HGRootNode) _hgNode;
			} else {
				_hgNode.rootNode = _hgNode.getParent().getRootNode();
			}
		}

		return _hgNode.rootNode;
	}

	public void onInitializeCaches() {

	}

	public void onExpand() {
		_hgNode.getNodeSource().onExpand();
	}

	public void onCollapse() {
		_hgNode.getNodeSource().onCollapse();
	}

	public HGDependency getIncomingDependenciesFrom(HGNode node) {

		// 'aggregated' dependency
		if (!cachedAggregatedIncomingDependenciesMap().containsKey(node)) {

			// create new dependency
			HGAggregatedDependency dependency = HierarchicalgraphFactory.eINSTANCE.createHGAggregatedDependency();
			dependency.setFrom(node);
			dependency.setTo(_hgNode);

			// add all incoming dependencies directly from the specified node
			if (_hgNode.incomingCoreDependenciesMap != null && _hgNode.incomingCoreDependenciesMap.containsKey(node)) {
				dependency.getDependencies().addAll(_hgNode.incomingCoreDependenciesMap.get(node));
			}

		  // add all incoming dependencies from successors of the specified node
			dependency.getDependencies().addAll(getIncomingCoreDependencies(true).stream()
					.filter((dep) -> node.isPredecessorOf(dep.getFrom())).collect(Collectors.toList()));

			// store dependency
			cachedAggregatedIncomingDependenciesMap().put(node, dependency);
		}

		//
		HGDependency dependency = cachedAggregatedIncomingDependenciesMap().get(node);

		//
		if (dependency != null && dependency.getWeight() > 0) {
			return dependency;
		} else {
			return null;
		}
	}

	public List<HGDependency> getIncomingDependenciesFrom(List<HGNode> nodes) {

		//
		List<HGDependency> result = new LinkedList<HGDependency>();

		//
		for (HGNode node : nodes) {
			HGDependency dependency = getIncomingDependenciesFrom(node);
			if (dependency != null) {
				result.add(dependency);
			}
		}

		//
		return result;
	}

	public HGDependency getOutgoingDependenciesTo(HGNode node) {
	  
	  //
	  checkNotNull(node);

		// 'aggregated' dependency
		if (!cachedAggregatedOutgoingDependenciesMap().containsKey(node)) {

			// create new dependency
			HGAggregatedDependency dependency = HierarchicalgraphFactory.eINSTANCE.createHGAggregatedDependency();
			dependency.setFrom(_hgNode);
			dependency.setTo(node);

			//
			if (_hgNode.outgoingCoreDependenciesMap != null && _hgNode.outgoingCoreDependenciesMap.containsKey(node)) {
				dependency.getDependencies().addAll(_hgNode.outgoingCoreDependenciesMap.get(node));
			}

			//
			dependency.getDependencies().addAll(getOutgoingCoreDependencies(true).stream()
					.filter((dep) -> node.isPredecessorOf(dep.getTo())).collect(Collectors.toList()));

			// store dependency
			cachedAggregatedOutgoingDependenciesMap().put(node, dependency);
		}

		//
		HGDependency dependency = cachedAggregatedOutgoingDependenciesMap().get(node);

		//
		if (dependency != null && dependency.getWeight() > 0) {
			return dependency;
		} else {
			return null;
		}
	}

	public List<HGDependency> getOutgoingDependenciesTo(List<HGNode> nodes) {

		//
		List<HGDependency> result = new LinkedList<HGDependency>();

		//
		for (HGNode node : nodes) {
			HGDependency dependency = getOutgoingDependenciesTo(node);
			if (dependency != null) {
				result.add(dependency);
			}
		}

		//
		return result;
	}

	/**
	 * <p>
	 * </p>
	 *
	 * @param includeChildren
	 * @return
	 */
	public List<HGDependency> getOutgoingCoreDependencies(boolean includeChildren) {

		//
		if (includeChildren) {
			return ECollections.unmodifiableEList(cachedOutgoingSubTreeCoreDependencies());
		}

		//
		else {

			if (_hgNode.outgoingCoreDependenciesMap == null) {
				return ECollections.emptyEList();
			}

			//
			List<HGDependency> dependencies = new ArrayList<>();
			for (List<HGDependency> hgDependencies : _hgNode.outgoingCoreDependenciesMap.values()) {
				dependencies.addAll(hgDependencies);
			}

			//
			return ECollections.unmodifiableEList(dependencies);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<HGDependency> getIncomingCoreDependencies(boolean includeChildren) {

		//
		if (includeChildren) {
			return ECollections.unmodifiableEList(cachedIncomingSubTreeCoreDependencies());
		}

		//
		else {
			return _hgNode.incomingCoreDependenciesMap == null ? ECollections.emptyEList()
					: ECollections.unmodifiableEList(new ArrayList(_hgNode.incomingCoreDependenciesMap.values()));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isPredecessorOf(HGNode node) {

		//
		if (node == null) {
			return false;
		}

		//
		if (node instanceof ExtendedHGRootNodeImpl) {
			return ((ExtendedHGRootNodeImpl) node).getTrait().cachedParents().contains(_hgNode);
		} else if (node instanceof ExtendedHGNodeImpl) {
			return ((ExtendedHGNodeImpl) node).getTrait().cachedParents().contains(_hgNode);
		}

		//
		throw new RuntimeException(String.format("Unexpected node type %s.", node.getClass().getName()));
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isSuccessorOf(HGNode node) {

		//
		if (node == null) {
			return false;
		}

		//
		return node.isPredecessorOf(_hgNode);
	}

	private Map<HGNode, HGDependency> cachedAggregatedOutgoingDependenciesMap() {

		//
		if (this._cachedAggregatedOutgoingDependenciesMap == null) {
			this._cachedAggregatedOutgoingDependenciesMap = new HashMap<HGNode, HGDependency>();
		}

		//
		return this._cachedAggregatedOutgoingDependenciesMap;
	}

	private Map<HGNode, HGDependency> cachedAggregatedIncomingDependenciesMap() {

		//
		if (this._cachedAggregatedIncomingDependenciesMap == null) {
			this._cachedAggregatedIncomingDependenciesMap = new HashMap<HGNode, HGDependency>();
		}

		//
		return this._cachedAggregatedIncomingDependenciesMap;
	}

	/**
	 * <p>
	 * </p>
	 *
	 * @return
	 */
	private List<HGNode> cachedParents() {

		//
		if (this._cachedParents == null) {
			this._cachedParents = new ArrayList<>();
			if (_hgNode.getParent() != null) {
				HGNode parent = _hgNode.getParent();
				this._cachedParents.add(parent);
				if (parent instanceof ExtendedHGNodeImpl) {
					this._cachedParents.addAll(((ExtendedHGNodeImpl) _hgNode.getParent()).getTrait().cachedParents());
				}
			}
		}

		//
		return this._cachedParents;
	}

	private List<HGDependency> cachedOutgoingSubTreeCoreDependencies() {

		//
		if (_cachedOutgoingSubTreeCoreDependencies == null) {

			//
			_cachedOutgoingSubTreeCoreDependencies = new ArrayList<>();

			//
			for (List<HGDependency> dependencies : _hgNode.getOutgoingCoreDependenciesMap().values()) {
				_cachedOutgoingSubTreeCoreDependencies.addAll(dependencies);
			}

			//
			if (_hgNode.children != null) {
				for (HGNode child : _hgNode.children) {
					_cachedOutgoingSubTreeCoreDependencies
							.addAll(((ExtendedHGNodeImpl) child).getTrait().cachedOutgoingSubTreeCoreDependencies());
				}
			}
		}

		//
		return _cachedOutgoingSubTreeCoreDependencies;
	}

	/**
	 * <p>
	 * </p>
	 *
	 * @return
	 */
	private List<HGDependency> cachedIncomingSubTreeCoreDependencies() {

		//
		if (_cachedIncomingSubTreeCoreDependencies == null) {

			//
			_cachedIncomingSubTreeCoreDependencies = new ArrayList<>();

			//
			for (List<HGDependency> dependencies : _hgNode.getIncomingCoreDependenciesMap().values()) {
				_cachedIncomingSubTreeCoreDependencies.addAll(dependencies);
			}

			//
			if (_hgNode.children != null) {
				for (HGNode child : _hgNode.children) {
					_cachedIncomingSubTreeCoreDependencies
							.addAll(((ExtendedHGNodeImpl) child).getTrait().cachedIncomingSubTreeCoreDependencies());
				}
			}
		}

		//
		return _cachedIncomingSubTreeCoreDependencies;
	}
}
