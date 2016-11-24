/*
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.dbadapter.dsl.ui.contentassist

import org.eclipse.xtext.Keyword
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class DbAdapterDslProposalProvider extends AbstractDbAdapterDslProposalProvider {
	
	override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		// do nothing
	}
}