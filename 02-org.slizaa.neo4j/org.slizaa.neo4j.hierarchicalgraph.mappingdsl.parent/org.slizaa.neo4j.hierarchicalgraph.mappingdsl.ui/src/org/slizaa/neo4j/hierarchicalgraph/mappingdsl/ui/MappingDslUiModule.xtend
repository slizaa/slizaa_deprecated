/*
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.hierarchicalgraph.mappingdsl.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider
import org.eclipse.xtext.ui.shared.Access

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class MappingDslUiModule extends AbstractMappingDslUiModule {

	override bindIResourceForEditorInputFactory() {
		return ResourceForIEditorInputFactory
	}

	override bindIResourceSetProvider() {
		return SimpleResourceSetProvider
	}

	override provideIAllContainersState() {
		return Access.getWorkspaceProjectsState();
	}

}
