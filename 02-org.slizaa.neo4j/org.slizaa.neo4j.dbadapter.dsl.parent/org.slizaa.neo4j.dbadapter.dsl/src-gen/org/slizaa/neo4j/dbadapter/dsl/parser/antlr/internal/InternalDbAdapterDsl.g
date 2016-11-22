/*
 * generated by Xtext 2.10.0
 */
grammar InternalDbAdapterDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.slizaa.neo4j.dbadapter.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.slizaa.neo4j.dbadapter.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.slizaa.neo4j.dbadapter.dsl.services.DbAdapterDslGrammarAccess;

}

@parser::members {

 	private DbAdapterDslGrammarAccess grammarAccess;

    public InternalDbAdapterDslParser(TokenStream input, DbAdapterDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DbAdapterDefinition";
   	}

   	@Override
   	protected DbAdapterDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDbAdapterDefinition
entryRuleDbAdapterDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDbAdapterDefinitionRule()); }
	iv_ruleDbAdapterDefinition=ruleDbAdapterDefinition
	{ $current=$iv_ruleDbAdapterDefinition.current; }
	EOF;

// Rule DbAdapterDefinition
ruleDbAdapterDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDbAdapterDefinitionAccess().getManagedLocalDatabaseParserRuleCall_0());
		}
		this_ManagedLocalDatabase_0=ruleManagedLocalDatabase
		{
			$current = $this_ManagedLocalDatabase_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDbAdapterDefinitionAccess().getUnmanagedRemoteDatabaseParserRuleCall_1());
		}
		this_UnmanagedRemoteDatabase_1=ruleUnmanagedRemoteDatabase
		{
			$current = $this_UnmanagedRemoteDatabase_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleUnmanagedRemoteDatabase
entryRuleUnmanagedRemoteDatabase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnmanagedRemoteDatabaseRule()); }
	iv_ruleUnmanagedRemoteDatabase=ruleUnmanagedRemoteDatabase
	{ $current=$iv_ruleUnmanagedRemoteDatabase.current; }
	EOF;

// Rule UnmanagedRemoteDatabase
ruleUnmanagedRemoteDatabase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='unmanaged'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnmanagedKeyword_0());
		}
		otherlv_1='remote'
		{
			newLeafNode(otherlv_1, grammarAccess.getUnmanagedRemoteDatabaseAccess().getRemoteKeyword_1());
		}
		otherlv_2='database'
		{
			newLeafNode(otherlv_2, grammarAccess.getUnmanagedRemoteDatabaseAccess().getDatabaseKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getUnmanagedRemoteDatabaseAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0);
					}
								({true}?=>(otherlv_5='uri'
								{
									newLeafNode(otherlv_5, grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriKeyword_4_0_0());
								}
								(
									(
										lv_uri_6_0=RULE_STRING
										{
											newLeafNode(lv_uri_6_0, grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriSTRINGTerminalRuleCall_4_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getUnmanagedRemoteDatabaseRule());
											}
											setWithLastConsumed(
												$current,
												"uri",
												lv_uri_6_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1);
					}
								({true}?=>(otherlv_7='name'
								{
									newLeafNode(otherlv_7, grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameKeyword_4_1_0());
								}
								(
									(
										lv_name_8_0=RULE_STRING
										{
											newLeafNode(lv_name_8_0, grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameSTRINGTerminalRuleCall_4_1_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getUnmanagedRemoteDatabaseRule());
											}
											setWithLastConsumed(
												$current,
												"name",
												lv_name_8_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2);
					}
								({true}?=>(otherlv_9='description'
								{
									newLeafNode(otherlv_9, grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionKeyword_4_2_0());
								}
								(
									(
										lv_description_10_0=RULE_STRING
										{
											newLeafNode(lv_description_10_0, grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionSTRINGTerminalRuleCall_4_2_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getUnmanagedRemoteDatabaseRule());
											}
											setWithLastConsumed(
												$current,
												"description",
												lv_description_10_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
				}
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getUnmanagedRemoteDatabaseAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleManagedLocalDatabase
entryRuleManagedLocalDatabase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getManagedLocalDatabaseRule()); }
	iv_ruleManagedLocalDatabase=ruleManagedLocalDatabase
	{ $current=$iv_ruleManagedLocalDatabase.current; }
	EOF;

// Rule ManagedLocalDatabase
ruleManagedLocalDatabase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0);
				}
							({true}?=>(otherlv_1='managed'
							{
								newLeafNode(otherlv_1, grammarAccess.getManagedLocalDatabaseAccess().getManagedKeyword_0_0());
							}
							otherlv_2='local'
							{
								newLeafNode(otherlv_2, grammarAccess.getManagedLocalDatabaseAccess().getLocalKeyword_0_1());
							}
							otherlv_3='database'
							{
								newLeafNode(otherlv_3, grammarAccess.getManagedLocalDatabaseAccess().getDatabaseKeyword_0_2());
							}
							otherlv_4='{'
							{
								newLeafNode(otherlv_4, grammarAccess.getManagedLocalDatabaseAccess().getLeftCurlyBracketKeyword_0_3());
							}
							(
								otherlv_5='name'
								{
									newLeafNode(otherlv_5, grammarAccess.getManagedLocalDatabaseAccess().getNameKeyword_0_4_0());
								}
								(
									(
										lv_name_6_0=RULE_STRING
										{
											newLeafNode(lv_name_6_0, grammarAccess.getManagedLocalDatabaseAccess().getNameSTRINGTerminalRuleCall_0_4_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
											}
											setWithLastConsumed(
												$current,
												"name",
												lv_name_6_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
							)?
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1);
				}
							({true}?=>(otherlv_7='description'
							{
								newLeafNode(otherlv_7, grammarAccess.getManagedLocalDatabaseAccess().getDescriptionKeyword_1_0());
							}
							(
								(
									lv_description_8_0=RULE_STRING
									{
										newLeafNode(lv_description_8_0, grammarAccess.getManagedLocalDatabaseAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
										}
										setWithLastConsumed(
											$current,
											"description",
											lv_description_8_0,
											"org.eclipse.xtext.common.Terminals.STRING");
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2);
				}
							({true}?=>(otherlv_9='port'
							{
								newLeafNode(otherlv_9, grammarAccess.getManagedLocalDatabaseAccess().getPortKeyword_2_0());
							}
							(
								(
									lv_port_10_0=RULE_INT
									{
										newLeafNode(lv_port_10_0, grammarAccess.getManagedLocalDatabaseAccess().getPortINTTerminalRuleCall_2_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
										}
										setWithLastConsumed(
											$current,
											"port",
											lv_port_10_0,
											"org.eclipse.xtext.common.Terminals.INT");
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3);
				}
							({true}?=>(otherlv_11='storage'
							{
								newLeafNode(otherlv_11, grammarAccess.getManagedLocalDatabaseAccess().getStorageKeyword_3_0());
							}
							(
								(
									lv_storage_12_0=RULE_STRING
									{
										newLeafNode(lv_storage_12_0, grammarAccess.getManagedLocalDatabaseAccess().getStorageSTRINGTerminalRuleCall_3_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
										}
										setWithLastConsumed(
											$current,
											"storage",
											lv_storage_12_0,
											"org.eclipse.xtext.common.Terminals.STRING");
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4);
				}
							({true}?=>((
								otherlv_13='files'
								{
									newLeafNode(otherlv_13, grammarAccess.getManagedLocalDatabaseAccess().getFilesKeyword_4_0_0());
								}
								otherlv_14='{'
								{
									newLeafNode(otherlv_14, grammarAccess.getManagedLocalDatabaseAccess().getLeftCurlyBracketKeyword_4_0_1());
								}
								(
									(
										lv_files_15_0=RULE_STRING
										{
											newLeafNode(lv_files_15_0, grammarAccess.getManagedLocalDatabaseAccess().getFilesSTRINGTerminalRuleCall_4_0_2_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
											}
											addWithLastConsumed(
												$current,
												"files",
												lv_files_15_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								(
									otherlv_16=','
									{
										newLeafNode(otherlv_16, grammarAccess.getManagedLocalDatabaseAccess().getCommaKeyword_4_0_3_0());
									}
									(
										(
											lv_files_17_0=RULE_STRING
											{
												newLeafNode(lv_files_17_0, grammarAccess.getManagedLocalDatabaseAccess().getFilesSTRINGTerminalRuleCall_4_0_3_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
												}
												addWithLastConsumed(
													$current,
													"files",
													lv_files_17_0,
													"org.eclipse.xtext.common.Terminals.STRING");
											}
										)
									)
								)*
								otherlv_18='}'
								{
									newLeafNode(otherlv_18, grammarAccess.getManagedLocalDatabaseAccess().getRightCurlyBracketKeyword_4_0_4());
								}
							)
							otherlv_19='}'
							{
								newLeafNode(otherlv_19, grammarAccess.getManagedLocalDatabaseAccess().getRightCurlyBracketKeyword_4_1());
							}
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
				}
			)
		)
				)+
				{getUnorderedGroupHelper().canLeave(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup())}?
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
			}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;