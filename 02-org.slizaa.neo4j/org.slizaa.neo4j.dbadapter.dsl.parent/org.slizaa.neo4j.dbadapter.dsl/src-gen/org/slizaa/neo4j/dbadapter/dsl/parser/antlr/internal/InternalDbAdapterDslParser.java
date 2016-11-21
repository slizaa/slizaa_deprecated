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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbAdapterDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'unmanaged'", "'remote'", "'database'", "'{'", "'uri'", "'name'", "'description'", "'}'", "'managed'", "'local'", "'port'", "'storage'", "'files'", "','"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDbAdapterDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDbAdapterDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDbAdapterDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDbAdapterDsl.g"; }



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




    // $ANTLR start "entryRuleDbAdapterDefinition"
    // InternalDbAdapterDsl.g:64:1: entryRuleDbAdapterDefinition returns [EObject current=null] : iv_ruleDbAdapterDefinition= ruleDbAdapterDefinition EOF ;
    public final EObject entryRuleDbAdapterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDbAdapterDefinition = null;


        try {
            // InternalDbAdapterDsl.g:64:60: (iv_ruleDbAdapterDefinition= ruleDbAdapterDefinition EOF )
            // InternalDbAdapterDsl.g:65:2: iv_ruleDbAdapterDefinition= ruleDbAdapterDefinition EOF
            {
             newCompositeNode(grammarAccess.getDbAdapterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDbAdapterDefinition=ruleDbAdapterDefinition();

            state._fsp--;

             current =iv_ruleDbAdapterDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDbAdapterDefinition"


    // $ANTLR start "ruleDbAdapterDefinition"
    // InternalDbAdapterDsl.g:71:1: ruleDbAdapterDefinition returns [EObject current=null] : (this_ManagedLocalDatabase_0= ruleManagedLocalDatabase | this_UnmanagedRemoteDatabase_1= ruleUnmanagedRemoteDatabase ) ;
    public final EObject ruleDbAdapterDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ManagedLocalDatabase_0 = null;

        EObject this_UnmanagedRemoteDatabase_1 = null;



        	enterRule();

        try {
            // InternalDbAdapterDsl.g:77:2: ( (this_ManagedLocalDatabase_0= ruleManagedLocalDatabase | this_UnmanagedRemoteDatabase_1= ruleUnmanagedRemoteDatabase ) )
            // InternalDbAdapterDsl.g:78:2: (this_ManagedLocalDatabase_0= ruleManagedLocalDatabase | this_UnmanagedRemoteDatabase_1= ruleUnmanagedRemoteDatabase )
            {
            // InternalDbAdapterDsl.g:78:2: (this_ManagedLocalDatabase_0= ruleManagedLocalDatabase | this_UnmanagedRemoteDatabase_1= ruleUnmanagedRemoteDatabase )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17||LA1_0==19||(LA1_0>=21 && LA1_0<=23)) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDbAdapterDsl.g:79:3: this_ManagedLocalDatabase_0= ruleManagedLocalDatabase
                    {

                    			newCompositeNode(grammarAccess.getDbAdapterDefinitionAccess().getManagedLocalDatabaseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManagedLocalDatabase_0=ruleManagedLocalDatabase();

                    state._fsp--;


                    			current = this_ManagedLocalDatabase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDbAdapterDsl.g:88:3: this_UnmanagedRemoteDatabase_1= ruleUnmanagedRemoteDatabase
                    {

                    			newCompositeNode(grammarAccess.getDbAdapterDefinitionAccess().getUnmanagedRemoteDatabaseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnmanagedRemoteDatabase_1=ruleUnmanagedRemoteDatabase();

                    state._fsp--;


                    			current = this_UnmanagedRemoteDatabase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDbAdapterDefinition"


    // $ANTLR start "entryRuleUnmanagedRemoteDatabase"
    // InternalDbAdapterDsl.g:100:1: entryRuleUnmanagedRemoteDatabase returns [EObject current=null] : iv_ruleUnmanagedRemoteDatabase= ruleUnmanagedRemoteDatabase EOF ;
    public final EObject entryRuleUnmanagedRemoteDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnmanagedRemoteDatabase = null;


        try {
            // InternalDbAdapterDsl.g:100:64: (iv_ruleUnmanagedRemoteDatabase= ruleUnmanagedRemoteDatabase EOF )
            // InternalDbAdapterDsl.g:101:2: iv_ruleUnmanagedRemoteDatabase= ruleUnmanagedRemoteDatabase EOF
            {
             newCompositeNode(grammarAccess.getUnmanagedRemoteDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnmanagedRemoteDatabase=ruleUnmanagedRemoteDatabase();

            state._fsp--;

             current =iv_ruleUnmanagedRemoteDatabase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnmanagedRemoteDatabase"


    // $ANTLR start "ruleUnmanagedRemoteDatabase"
    // InternalDbAdapterDsl.g:107:1: ruleUnmanagedRemoteDatabase returns [EObject current=null] : (otherlv_0= 'unmanaged' otherlv_1= 'remote' otherlv_2= 'database' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
    public final EObject ruleUnmanagedRemoteDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_uri_6_0=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDbAdapterDsl.g:113:2: ( (otherlv_0= 'unmanaged' otherlv_1= 'remote' otherlv_2= 'database' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalDbAdapterDsl.g:114:2: (otherlv_0= 'unmanaged' otherlv_1= 'remote' otherlv_2= 'database' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalDbAdapterDsl.g:114:2: (otherlv_0= 'unmanaged' otherlv_1= 'remote' otherlv_2= 'database' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalDbAdapterDsl.g:115:3: otherlv_0= 'unmanaged' otherlv_1= 'remote' otherlv_2= 'database' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnmanagedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnmanagedRemoteDatabaseAccess().getRemoteKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getUnmanagedRemoteDatabaseAccess().getDatabaseKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getUnmanagedRemoteDatabaseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDbAdapterDsl.g:131:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDbAdapterDsl.g:132:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDbAdapterDsl.g:132:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalDbAdapterDsl.g:133:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
            				
            // InternalDbAdapterDsl.g:136:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalDbAdapterDsl.g:137:6: ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalDbAdapterDsl.g:137:6: ( ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDbAdapterDsl.g:138:4: ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDbAdapterDsl.g:138:4: ({...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDbAdapterDsl.g:139:5: {...}? => ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUnmanagedRemoteDatabase", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalDbAdapterDsl.g:139:120: ( ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) ) )
            	    // InternalDbAdapterDsl.g:140:6: ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalDbAdapterDsl.g:143:9: ({...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) ) )
            	    // InternalDbAdapterDsl.g:143:10: {...}? => (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnmanagedRemoteDatabase", "true");
            	    }
            	    // InternalDbAdapterDsl.g:143:19: (otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) ) )
            	    // InternalDbAdapterDsl.g:143:20: otherlv_5= 'uri' ( (lv_uri_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriKeyword_4_0_0());
            	    								
            	    // InternalDbAdapterDsl.g:147:9: ( (lv_uri_6_0= RULE_STRING ) )
            	    // InternalDbAdapterDsl.g:148:10: (lv_uri_6_0= RULE_STRING )
            	    {
            	    // InternalDbAdapterDsl.g:148:10: (lv_uri_6_0= RULE_STRING )
            	    // InternalDbAdapterDsl.g:149:11: lv_uri_6_0= RULE_STRING
            	    {
            	    lv_uri_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    											newLeafNode(lv_uri_6_0, grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriSTRINGTerminalRuleCall_4_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getUnmanagedRemoteDatabaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"uri",
            	    												lv_uri_6_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDbAdapterDsl.g:171:4: ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDbAdapterDsl.g:171:4: ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDbAdapterDsl.g:172:5: {...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUnmanagedRemoteDatabase", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalDbAdapterDsl.g:172:120: ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) )
            	    // InternalDbAdapterDsl.g:173:6: ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalDbAdapterDsl.g:176:9: ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) )
            	    // InternalDbAdapterDsl.g:176:10: {...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnmanagedRemoteDatabase", "true");
            	    }
            	    // InternalDbAdapterDsl.g:176:19: (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )
            	    // InternalDbAdapterDsl.g:176:20: otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_7); 

            	    									newLeafNode(otherlv_7, grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameKeyword_4_1_0());
            	    								
            	    // InternalDbAdapterDsl.g:180:9: ( (lv_name_8_0= RULE_STRING ) )
            	    // InternalDbAdapterDsl.g:181:10: (lv_name_8_0= RULE_STRING )
            	    {
            	    // InternalDbAdapterDsl.g:181:10: (lv_name_8_0= RULE_STRING )
            	    // InternalDbAdapterDsl.g:182:11: lv_name_8_0= RULE_STRING
            	    {
            	    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    											newLeafNode(lv_name_8_0, grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameSTRINGTerminalRuleCall_4_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getUnmanagedRemoteDatabaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"name",
            	    												lv_name_8_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDbAdapterDsl.g:204:4: ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDbAdapterDsl.g:204:4: ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDbAdapterDsl.g:205:5: {...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUnmanagedRemoteDatabase", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalDbAdapterDsl.g:205:120: ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) ) )
            	    // InternalDbAdapterDsl.g:206:6: ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalDbAdapterDsl.g:209:9: ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) ) )
            	    // InternalDbAdapterDsl.g:209:10: {...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnmanagedRemoteDatabase", "true");
            	    }
            	    // InternalDbAdapterDsl.g:209:19: (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )
            	    // InternalDbAdapterDsl.g:209:20: otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_7); 

            	    									newLeafNode(otherlv_9, grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionKeyword_4_2_0());
            	    								
            	    // InternalDbAdapterDsl.g:213:9: ( (lv_description_10_0= RULE_STRING ) )
            	    // InternalDbAdapterDsl.g:214:10: (lv_description_10_0= RULE_STRING )
            	    {
            	    // InternalDbAdapterDsl.g:214:10: (lv_description_10_0= RULE_STRING )
            	    // InternalDbAdapterDsl.g:215:11: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    											newLeafNode(lv_description_10_0, grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionSTRINGTerminalRuleCall_4_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getUnmanagedRemoteDatabaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_10_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleUnmanagedRemoteDatabase", "getUnorderedGroupHelper().canLeave(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
            				

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getUnmanagedRemoteDatabaseAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnmanagedRemoteDatabase"


    // $ANTLR start "entryRuleManagedLocalDatabase"
    // InternalDbAdapterDsl.g:253:1: entryRuleManagedLocalDatabase returns [EObject current=null] : iv_ruleManagedLocalDatabase= ruleManagedLocalDatabase EOF ;
    public final EObject entryRuleManagedLocalDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManagedLocalDatabase = null;


        try {
            // InternalDbAdapterDsl.g:253:61: (iv_ruleManagedLocalDatabase= ruleManagedLocalDatabase EOF )
            // InternalDbAdapterDsl.g:254:2: iv_ruleManagedLocalDatabase= ruleManagedLocalDatabase EOF
            {
             newCompositeNode(grammarAccess.getManagedLocalDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManagedLocalDatabase=ruleManagedLocalDatabase();

            state._fsp--;

             current =iv_ruleManagedLocalDatabase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManagedLocalDatabase"


    // $ANTLR start "ruleManagedLocalDatabase"
    // InternalDbAdapterDsl.g:260:1: ruleManagedLocalDatabase returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleManagedLocalDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token lv_port_10_0=null;
        Token otherlv_11=null;
        Token lv_storage_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_files_15_0=null;
        Token otherlv_16=null;
        Token lv_files_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;


        	enterRule();

        try {
            // InternalDbAdapterDsl.g:266:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalDbAdapterDsl.g:267:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalDbAdapterDsl.g:267:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+ {...}?) ) )
            // InternalDbAdapterDsl.g:268:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalDbAdapterDsl.g:268:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+ {...}?) )
            // InternalDbAdapterDsl.g:269:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
            			
            // InternalDbAdapterDsl.g:272:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+ {...}?)
            // InternalDbAdapterDsl.g:273:5: ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+ {...}?
            {
            // InternalDbAdapterDsl.g:273:5: ( ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=6;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2) ) {
                    alt5=3;
                }
                else if ( LA5_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3) ) {
                    alt5=4;
                }
                else if ( LA5_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4) ) {
                    alt5=5;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDbAdapterDsl.g:274:3: ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // InternalDbAdapterDsl.g:274:3: ({...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) ) )
            	    // InternalDbAdapterDsl.g:275:4: {...}? => ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDbAdapterDsl.g:275:114: ( ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) ) )
            	    // InternalDbAdapterDsl.g:276:5: ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDbAdapterDsl.g:279:8: ({...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? ) )
            	    // InternalDbAdapterDsl.g:279:9: {...}? => (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "true");
            	    }
            	    // InternalDbAdapterDsl.g:279:18: (otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )? )
            	    // InternalDbAdapterDsl.g:279:19: otherlv_1= 'managed' otherlv_2= 'local' otherlv_3= 'database' otherlv_4= '{' (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_9); 

            	    								newLeafNode(otherlv_1, grammarAccess.getManagedLocalDatabaseAccess().getManagedKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,20,FOLLOW_4); 

            	    								newLeafNode(otherlv_2, grammarAccess.getManagedLocalDatabaseAccess().getLocalKeyword_0_1());
            	    							
            	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getManagedLocalDatabaseAccess().getDatabaseKeyword_0_2());
            	    							
            	    otherlv_4=(Token)match(input,14,FOLLOW_10); 

            	    								newLeafNode(otherlv_4, grammarAccess.getManagedLocalDatabaseAccess().getLeftCurlyBracketKeyword_0_3());
            	    							
            	    // InternalDbAdapterDsl.g:295:8: (otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==16) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalDbAdapterDsl.g:296:9: otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) )
            	            {
            	            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            	            									newLeafNode(otherlv_5, grammarAccess.getManagedLocalDatabaseAccess().getNameKeyword_0_4_0());
            	            								
            	            // InternalDbAdapterDsl.g:300:9: ( (lv_name_6_0= RULE_STRING ) )
            	            // InternalDbAdapterDsl.g:301:10: (lv_name_6_0= RULE_STRING )
            	            {
            	            // InternalDbAdapterDsl.g:301:10: (lv_name_6_0= RULE_STRING )
            	            // InternalDbAdapterDsl.g:302:11: lv_name_6_0= RULE_STRING
            	            {
            	            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	            											newLeafNode(lv_name_6_0, grammarAccess.getManagedLocalDatabaseAccess().getNameSTRINGTerminalRuleCall_0_4_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"name",
            	            												lv_name_6_0,
            	            												"org.eclipse.xtext.common.Terminals.STRING");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDbAdapterDsl.g:325:3: ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDbAdapterDsl.g:325:3: ({...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDbAdapterDsl.g:326:4: {...}? => ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDbAdapterDsl.g:326:114: ( ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
            	    // InternalDbAdapterDsl.g:327:5: ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDbAdapterDsl.g:330:8: ({...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) ) )
            	    // InternalDbAdapterDsl.g:330:9: {...}? => (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "true");
            	    }
            	    // InternalDbAdapterDsl.g:330:18: (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )
            	    // InternalDbAdapterDsl.g:330:19: otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_7); 

            	    								newLeafNode(otherlv_7, grammarAccess.getManagedLocalDatabaseAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalDbAdapterDsl.g:334:8: ( (lv_description_8_0= RULE_STRING ) )
            	    // InternalDbAdapterDsl.g:335:9: (lv_description_8_0= RULE_STRING )
            	    {
            	    // InternalDbAdapterDsl.g:335:9: (lv_description_8_0= RULE_STRING )
            	    // InternalDbAdapterDsl.g:336:10: lv_description_8_0= RULE_STRING
            	    {
            	    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    										newLeafNode(lv_description_8_0, grammarAccess.getManagedLocalDatabaseAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_8_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDbAdapterDsl.g:358:3: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalDbAdapterDsl.g:358:3: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) ) )
            	    // InternalDbAdapterDsl.g:359:4: {...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDbAdapterDsl.g:359:114: ( ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) ) )
            	    // InternalDbAdapterDsl.g:360:5: ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDbAdapterDsl.g:363:8: ({...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) ) )
            	    // InternalDbAdapterDsl.g:363:9: {...}? => (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "true");
            	    }
            	    // InternalDbAdapterDsl.g:363:18: (otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) ) )
            	    // InternalDbAdapterDsl.g:363:19: otherlv_9= 'port' ( (lv_port_10_0= RULE_INT ) )
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_12); 

            	    								newLeafNode(otherlv_9, grammarAccess.getManagedLocalDatabaseAccess().getPortKeyword_2_0());
            	    							
            	    // InternalDbAdapterDsl.g:367:8: ( (lv_port_10_0= RULE_INT ) )
            	    // InternalDbAdapterDsl.g:368:9: (lv_port_10_0= RULE_INT )
            	    {
            	    // InternalDbAdapterDsl.g:368:9: (lv_port_10_0= RULE_INT )
            	    // InternalDbAdapterDsl.g:369:10: lv_port_10_0= RULE_INT
            	    {
            	    lv_port_10_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            	    										newLeafNode(lv_port_10_0, grammarAccess.getManagedLocalDatabaseAccess().getPortINTTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"port",
            	    											lv_port_10_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDbAdapterDsl.g:391:3: ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDbAdapterDsl.g:391:3: ({...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDbAdapterDsl.g:392:4: {...}? => ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalDbAdapterDsl.g:392:114: ( ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) ) )
            	    // InternalDbAdapterDsl.g:393:5: ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalDbAdapterDsl.g:396:8: ({...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) ) )
            	    // InternalDbAdapterDsl.g:396:9: {...}? => (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "true");
            	    }
            	    // InternalDbAdapterDsl.g:396:18: (otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) ) )
            	    // InternalDbAdapterDsl.g:396:19: otherlv_11= 'storage' ( (lv_storage_12_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,22,FOLLOW_7); 

            	    								newLeafNode(otherlv_11, grammarAccess.getManagedLocalDatabaseAccess().getStorageKeyword_3_0());
            	    							
            	    // InternalDbAdapterDsl.g:400:8: ( (lv_storage_12_0= RULE_STRING ) )
            	    // InternalDbAdapterDsl.g:401:9: (lv_storage_12_0= RULE_STRING )
            	    {
            	    // InternalDbAdapterDsl.g:401:9: (lv_storage_12_0= RULE_STRING )
            	    // InternalDbAdapterDsl.g:402:10: lv_storage_12_0= RULE_STRING
            	    {
            	    lv_storage_12_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    										newLeafNode(lv_storage_12_0, grammarAccess.getManagedLocalDatabaseAccess().getStorageSTRINGTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"storage",
            	    											lv_storage_12_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDbAdapterDsl.g:424:3: ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) )
            	    {
            	    // InternalDbAdapterDsl.g:424:3: ({...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) ) )
            	    // InternalDbAdapterDsl.g:425:4: {...}? => ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalDbAdapterDsl.g:425:114: ( ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) ) )
            	    // InternalDbAdapterDsl.g:426:5: ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalDbAdapterDsl.g:429:8: ({...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' ) )
            	    // InternalDbAdapterDsl.g:429:9: {...}? => ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "true");
            	    }
            	    // InternalDbAdapterDsl.g:429:18: ( (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}' )
            	    // InternalDbAdapterDsl.g:429:19: (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' ) otherlv_19= '}'
            	    {
            	    // InternalDbAdapterDsl.g:429:19: (otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}' )
            	    // InternalDbAdapterDsl.g:430:9: otherlv_13= 'files' otherlv_14= '{' ( (lv_files_15_0= RULE_STRING ) ) (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )* otherlv_18= '}'
            	    {
            	    otherlv_13=(Token)match(input,23,FOLLOW_5); 

            	    									newLeafNode(otherlv_13, grammarAccess.getManagedLocalDatabaseAccess().getFilesKeyword_4_0_0());
            	    								
            	    otherlv_14=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_14, grammarAccess.getManagedLocalDatabaseAccess().getLeftCurlyBracketKeyword_4_0_1());
            	    								
            	    // InternalDbAdapterDsl.g:438:9: ( (lv_files_15_0= RULE_STRING ) )
            	    // InternalDbAdapterDsl.g:439:10: (lv_files_15_0= RULE_STRING )
            	    {
            	    // InternalDbAdapterDsl.g:439:10: (lv_files_15_0= RULE_STRING )
            	    // InternalDbAdapterDsl.g:440:11: lv_files_15_0= RULE_STRING
            	    {
            	    lv_files_15_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_files_15_0, grammarAccess.getManagedLocalDatabaseAccess().getFilesSTRINGTerminalRuleCall_4_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"files",
            	    												lv_files_15_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalDbAdapterDsl.g:456:9: (otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==24) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalDbAdapterDsl.g:457:10: otherlv_16= ',' ( (lv_files_17_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,24,FOLLOW_7); 

            	    	    										newLeafNode(otherlv_16, grammarAccess.getManagedLocalDatabaseAccess().getCommaKeyword_4_0_3_0());
            	    	    									
            	    	    // InternalDbAdapterDsl.g:461:10: ( (lv_files_17_0= RULE_STRING ) )
            	    	    // InternalDbAdapterDsl.g:462:11: (lv_files_17_0= RULE_STRING )
            	    	    {
            	    	    // InternalDbAdapterDsl.g:462:11: (lv_files_17_0= RULE_STRING )
            	    	    // InternalDbAdapterDsl.g:463:12: lv_files_17_0= RULE_STRING
            	    	    {
            	    	    lv_files_17_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    	    												newLeafNode(lv_files_17_0, grammarAccess.getManagedLocalDatabaseAccess().getFilesSTRINGTerminalRuleCall_4_0_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getManagedLocalDatabaseRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"files",
            	    	    													lv_files_17_0,
            	    	    													"org.eclipse.xtext.common.Terminals.STRING");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,18,FOLLOW_14); 

            	    									newLeafNode(otherlv_18, grammarAccess.getManagedLocalDatabaseAccess().getRightCurlyBracketKeyword_4_0_4());
            	    								

            	    }

            	    otherlv_19=(Token)match(input,18,FOLLOW_11); 

            	    								newLeafNode(otherlv_19, grammarAccess.getManagedLocalDatabaseAccess().getRightCurlyBracketKeyword_4_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleManagedLocalDatabase", "getUnorderedGroupHelper().canLeave(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManagedLocalDatabase"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000EB0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000EA0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});

}
