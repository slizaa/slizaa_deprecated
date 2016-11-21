package org.slizaa.neo4j.dbadapter.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.slizaa.neo4j.dbadapter.dsl.services.DbAdapterDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbAdapterDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'unmanaged'", "'remote'", "'database'", "'{'", "'}'", "'uri'", "'name'", "'description'", "'managed'", "'local'", "'port'", "'storage'", "'files'", "','"
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

    	public void setGrammarAccess(DbAdapterDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDbAdapterDefinition"
    // InternalDbAdapterDsl.g:53:1: entryRuleDbAdapterDefinition : ruleDbAdapterDefinition EOF ;
    public final void entryRuleDbAdapterDefinition() throws RecognitionException {
        try {
            // InternalDbAdapterDsl.g:54:1: ( ruleDbAdapterDefinition EOF )
            // InternalDbAdapterDsl.g:55:1: ruleDbAdapterDefinition EOF
            {
             before(grammarAccess.getDbAdapterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDbAdapterDefinition();

            state._fsp--;

             after(grammarAccess.getDbAdapterDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDbAdapterDefinition"


    // $ANTLR start "ruleDbAdapterDefinition"
    // InternalDbAdapterDsl.g:62:1: ruleDbAdapterDefinition : ( ( rule__DbAdapterDefinition__Alternatives ) ) ;
    public final void ruleDbAdapterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:66:2: ( ( ( rule__DbAdapterDefinition__Alternatives ) ) )
            // InternalDbAdapterDsl.g:67:2: ( ( rule__DbAdapterDefinition__Alternatives ) )
            {
            // InternalDbAdapterDsl.g:67:2: ( ( rule__DbAdapterDefinition__Alternatives ) )
            // InternalDbAdapterDsl.g:68:3: ( rule__DbAdapterDefinition__Alternatives )
            {
             before(grammarAccess.getDbAdapterDefinitionAccess().getAlternatives()); 
            // InternalDbAdapterDsl.g:69:3: ( rule__DbAdapterDefinition__Alternatives )
            // InternalDbAdapterDsl.g:69:4: rule__DbAdapterDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DbAdapterDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDbAdapterDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDbAdapterDefinition"


    // $ANTLR start "entryRuleUnmanagedRemoteDatabase"
    // InternalDbAdapterDsl.g:78:1: entryRuleUnmanagedRemoteDatabase : ruleUnmanagedRemoteDatabase EOF ;
    public final void entryRuleUnmanagedRemoteDatabase() throws RecognitionException {
        try {
            // InternalDbAdapterDsl.g:79:1: ( ruleUnmanagedRemoteDatabase EOF )
            // InternalDbAdapterDsl.g:80:1: ruleUnmanagedRemoteDatabase EOF
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruleUnmanagedRemoteDatabase();

            state._fsp--;

             after(grammarAccess.getUnmanagedRemoteDatabaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnmanagedRemoteDatabase"


    // $ANTLR start "ruleUnmanagedRemoteDatabase"
    // InternalDbAdapterDsl.g:87:1: ruleUnmanagedRemoteDatabase : ( ( rule__UnmanagedRemoteDatabase__Group__0 ) ) ;
    public final void ruleUnmanagedRemoteDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:91:2: ( ( ( rule__UnmanagedRemoteDatabase__Group__0 ) ) )
            // InternalDbAdapterDsl.g:92:2: ( ( rule__UnmanagedRemoteDatabase__Group__0 ) )
            {
            // InternalDbAdapterDsl.g:92:2: ( ( rule__UnmanagedRemoteDatabase__Group__0 ) )
            // InternalDbAdapterDsl.g:93:3: ( rule__UnmanagedRemoteDatabase__Group__0 )
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getGroup()); 
            // InternalDbAdapterDsl.g:94:3: ( rule__UnmanagedRemoteDatabase__Group__0 )
            // InternalDbAdapterDsl.g:94:4: rule__UnmanagedRemoteDatabase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnmanagedRemoteDatabase"


    // $ANTLR start "entryRuleManagedLocalDatabase"
    // InternalDbAdapterDsl.g:103:1: entryRuleManagedLocalDatabase : ruleManagedLocalDatabase EOF ;
    public final void entryRuleManagedLocalDatabase() throws RecognitionException {
        try {
            // InternalDbAdapterDsl.g:104:1: ( ruleManagedLocalDatabase EOF )
            // InternalDbAdapterDsl.g:105:1: ruleManagedLocalDatabase EOF
            {
             before(grammarAccess.getManagedLocalDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruleManagedLocalDatabase();

            state._fsp--;

             after(grammarAccess.getManagedLocalDatabaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManagedLocalDatabase"


    // $ANTLR start "ruleManagedLocalDatabase"
    // InternalDbAdapterDsl.g:112:1: ruleManagedLocalDatabase : ( ( rule__ManagedLocalDatabase__UnorderedGroup ) ) ;
    public final void ruleManagedLocalDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:116:2: ( ( ( rule__ManagedLocalDatabase__UnorderedGroup ) ) )
            // InternalDbAdapterDsl.g:117:2: ( ( rule__ManagedLocalDatabase__UnorderedGroup ) )
            {
            // InternalDbAdapterDsl.g:117:2: ( ( rule__ManagedLocalDatabase__UnorderedGroup ) )
            // InternalDbAdapterDsl.g:118:3: ( rule__ManagedLocalDatabase__UnorderedGroup )
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup()); 
            // InternalDbAdapterDsl.g:119:3: ( rule__ManagedLocalDatabase__UnorderedGroup )
            // InternalDbAdapterDsl.g:119:4: rule__ManagedLocalDatabase__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManagedLocalDatabase"


    // $ANTLR start "rule__DbAdapterDefinition__Alternatives"
    // InternalDbAdapterDsl.g:127:1: rule__DbAdapterDefinition__Alternatives : ( ( ruleManagedLocalDatabase ) | ( ruleUnmanagedRemoteDatabase ) );
    public final void rule__DbAdapterDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:131:1: ( ( ruleManagedLocalDatabase ) | ( ruleUnmanagedRemoteDatabase ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=18 && LA1_0<=19)||(LA1_0>=21 && LA1_0<=23)) ) {
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
                    // InternalDbAdapterDsl.g:132:2: ( ruleManagedLocalDatabase )
                    {
                    // InternalDbAdapterDsl.g:132:2: ( ruleManagedLocalDatabase )
                    // InternalDbAdapterDsl.g:133:3: ruleManagedLocalDatabase
                    {
                     before(grammarAccess.getDbAdapterDefinitionAccess().getManagedLocalDatabaseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleManagedLocalDatabase();

                    state._fsp--;

                     after(grammarAccess.getDbAdapterDefinitionAccess().getManagedLocalDatabaseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbAdapterDsl.g:138:2: ( ruleUnmanagedRemoteDatabase )
                    {
                    // InternalDbAdapterDsl.g:138:2: ( ruleUnmanagedRemoteDatabase )
                    // InternalDbAdapterDsl.g:139:3: ruleUnmanagedRemoteDatabase
                    {
                     before(grammarAccess.getDbAdapterDefinitionAccess().getUnmanagedRemoteDatabaseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnmanagedRemoteDatabase();

                    state._fsp--;

                     after(grammarAccess.getDbAdapterDefinitionAccess().getUnmanagedRemoteDatabaseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbAdapterDefinition__Alternatives"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__0"
    // InternalDbAdapterDsl.g:148:1: rule__UnmanagedRemoteDatabase__Group__0 : rule__UnmanagedRemoteDatabase__Group__0__Impl rule__UnmanagedRemoteDatabase__Group__1 ;
    public final void rule__UnmanagedRemoteDatabase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:152:1: ( rule__UnmanagedRemoteDatabase__Group__0__Impl rule__UnmanagedRemoteDatabase__Group__1 )
            // InternalDbAdapterDsl.g:153:2: rule__UnmanagedRemoteDatabase__Group__0__Impl rule__UnmanagedRemoteDatabase__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UnmanagedRemoteDatabase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__0"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__0__Impl"
    // InternalDbAdapterDsl.g:160:1: rule__UnmanagedRemoteDatabase__Group__0__Impl : ( 'unmanaged' ) ;
    public final void rule__UnmanagedRemoteDatabase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:164:1: ( ( 'unmanaged' ) )
            // InternalDbAdapterDsl.g:165:1: ( 'unmanaged' )
            {
            // InternalDbAdapterDsl.g:165:1: ( 'unmanaged' )
            // InternalDbAdapterDsl.g:166:2: 'unmanaged'
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnmanagedKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnmanagedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__0__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__1"
    // InternalDbAdapterDsl.g:175:1: rule__UnmanagedRemoteDatabase__Group__1 : rule__UnmanagedRemoteDatabase__Group__1__Impl rule__UnmanagedRemoteDatabase__Group__2 ;
    public final void rule__UnmanagedRemoteDatabase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:179:1: ( rule__UnmanagedRemoteDatabase__Group__1__Impl rule__UnmanagedRemoteDatabase__Group__2 )
            // InternalDbAdapterDsl.g:180:2: rule__UnmanagedRemoteDatabase__Group__1__Impl rule__UnmanagedRemoteDatabase__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UnmanagedRemoteDatabase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__1"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__1__Impl"
    // InternalDbAdapterDsl.g:187:1: rule__UnmanagedRemoteDatabase__Group__1__Impl : ( 'remote' ) ;
    public final void rule__UnmanagedRemoteDatabase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:191:1: ( ( 'remote' ) )
            // InternalDbAdapterDsl.g:192:1: ( 'remote' )
            {
            // InternalDbAdapterDsl.g:192:1: ( 'remote' )
            // InternalDbAdapterDsl.g:193:2: 'remote'
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getRemoteKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getRemoteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__1__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__2"
    // InternalDbAdapterDsl.g:202:1: rule__UnmanagedRemoteDatabase__Group__2 : rule__UnmanagedRemoteDatabase__Group__2__Impl rule__UnmanagedRemoteDatabase__Group__3 ;
    public final void rule__UnmanagedRemoteDatabase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:206:1: ( rule__UnmanagedRemoteDatabase__Group__2__Impl rule__UnmanagedRemoteDatabase__Group__3 )
            // InternalDbAdapterDsl.g:207:2: rule__UnmanagedRemoteDatabase__Group__2__Impl rule__UnmanagedRemoteDatabase__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__UnmanagedRemoteDatabase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__2"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__2__Impl"
    // InternalDbAdapterDsl.g:214:1: rule__UnmanagedRemoteDatabase__Group__2__Impl : ( 'database' ) ;
    public final void rule__UnmanagedRemoteDatabase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:218:1: ( ( 'database' ) )
            // InternalDbAdapterDsl.g:219:1: ( 'database' )
            {
            // InternalDbAdapterDsl.g:219:1: ( 'database' )
            // InternalDbAdapterDsl.g:220:2: 'database'
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getDatabaseKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getDatabaseKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__2__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__3"
    // InternalDbAdapterDsl.g:229:1: rule__UnmanagedRemoteDatabase__Group__3 : rule__UnmanagedRemoteDatabase__Group__3__Impl rule__UnmanagedRemoteDatabase__Group__4 ;
    public final void rule__UnmanagedRemoteDatabase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:233:1: ( rule__UnmanagedRemoteDatabase__Group__3__Impl rule__UnmanagedRemoteDatabase__Group__4 )
            // InternalDbAdapterDsl.g:234:2: rule__UnmanagedRemoteDatabase__Group__3__Impl rule__UnmanagedRemoteDatabase__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__UnmanagedRemoteDatabase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__3"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__3__Impl"
    // InternalDbAdapterDsl.g:241:1: rule__UnmanagedRemoteDatabase__Group__3__Impl : ( '{' ) ;
    public final void rule__UnmanagedRemoteDatabase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:245:1: ( ( '{' ) )
            // InternalDbAdapterDsl.g:246:1: ( '{' )
            {
            // InternalDbAdapterDsl.g:246:1: ( '{' )
            // InternalDbAdapterDsl.g:247:2: '{'
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__3__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__4"
    // InternalDbAdapterDsl.g:256:1: rule__UnmanagedRemoteDatabase__Group__4 : rule__UnmanagedRemoteDatabase__Group__4__Impl rule__UnmanagedRemoteDatabase__Group__5 ;
    public final void rule__UnmanagedRemoteDatabase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:260:1: ( rule__UnmanagedRemoteDatabase__Group__4__Impl rule__UnmanagedRemoteDatabase__Group__5 )
            // InternalDbAdapterDsl.g:261:2: rule__UnmanagedRemoteDatabase__Group__4__Impl rule__UnmanagedRemoteDatabase__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__UnmanagedRemoteDatabase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__4"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__4__Impl"
    // InternalDbAdapterDsl.g:268:1: rule__UnmanagedRemoteDatabase__Group__4__Impl : ( ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4 ) ) ;
    public final void rule__UnmanagedRemoteDatabase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:272:1: ( ( ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4 ) ) )
            // InternalDbAdapterDsl.g:273:1: ( ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4 ) )
            {
            // InternalDbAdapterDsl.g:273:1: ( ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4 ) )
            // InternalDbAdapterDsl.g:274:2: ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4 )
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4()); 
            // InternalDbAdapterDsl.g:275:2: ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4 )
            // InternalDbAdapterDsl.g:275:3: rule__UnmanagedRemoteDatabase__UnorderedGroup_4
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__4__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__5"
    // InternalDbAdapterDsl.g:283:1: rule__UnmanagedRemoteDatabase__Group__5 : rule__UnmanagedRemoteDatabase__Group__5__Impl ;
    public final void rule__UnmanagedRemoteDatabase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:287:1: ( rule__UnmanagedRemoteDatabase__Group__5__Impl )
            // InternalDbAdapterDsl.g:288:2: rule__UnmanagedRemoteDatabase__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__5"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group__5__Impl"
    // InternalDbAdapterDsl.g:294:1: rule__UnmanagedRemoteDatabase__Group__5__Impl : ( '}' ) ;
    public final void rule__UnmanagedRemoteDatabase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:298:1: ( ( '}' ) )
            // InternalDbAdapterDsl.g:299:1: ( '}' )
            {
            // InternalDbAdapterDsl.g:299:1: ( '}' )
            // InternalDbAdapterDsl.g:300:2: '}'
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group__5__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_0__0"
    // InternalDbAdapterDsl.g:310:1: rule__UnmanagedRemoteDatabase__Group_4_0__0 : rule__UnmanagedRemoteDatabase__Group_4_0__0__Impl rule__UnmanagedRemoteDatabase__Group_4_0__1 ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:314:1: ( rule__UnmanagedRemoteDatabase__Group_4_0__0__Impl rule__UnmanagedRemoteDatabase__Group_4_0__1 )
            // InternalDbAdapterDsl.g:315:2: rule__UnmanagedRemoteDatabase__Group_4_0__0__Impl rule__UnmanagedRemoteDatabase__Group_4_0__1
            {
            pushFollow(FOLLOW_8);
            rule__UnmanagedRemoteDatabase__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_0__0"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_0__0__Impl"
    // InternalDbAdapterDsl.g:322:1: rule__UnmanagedRemoteDatabase__Group_4_0__0__Impl : ( 'uri' ) ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:326:1: ( ( 'uri' ) )
            // InternalDbAdapterDsl.g:327:1: ( 'uri' )
            {
            // InternalDbAdapterDsl.g:327:1: ( 'uri' )
            // InternalDbAdapterDsl.g:328:2: 'uri'
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriKeyword_4_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_0__0__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_0__1"
    // InternalDbAdapterDsl.g:337:1: rule__UnmanagedRemoteDatabase__Group_4_0__1 : rule__UnmanagedRemoteDatabase__Group_4_0__1__Impl ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:341:1: ( rule__UnmanagedRemoteDatabase__Group_4_0__1__Impl )
            // InternalDbAdapterDsl.g:342:2: rule__UnmanagedRemoteDatabase__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_0__1"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_0__1__Impl"
    // InternalDbAdapterDsl.g:348:1: rule__UnmanagedRemoteDatabase__Group_4_0__1__Impl : ( ( rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1 ) ) ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:352:1: ( ( ( rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1 ) ) )
            // InternalDbAdapterDsl.g:353:1: ( ( rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1 ) )
            {
            // InternalDbAdapterDsl.g:353:1: ( ( rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1 ) )
            // InternalDbAdapterDsl.g:354:2: ( rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1 )
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriAssignment_4_0_1()); 
            // InternalDbAdapterDsl.g:355:2: ( rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1 )
            // InternalDbAdapterDsl.g:355:3: rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriAssignment_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_0__1__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_1__0"
    // InternalDbAdapterDsl.g:364:1: rule__UnmanagedRemoteDatabase__Group_4_1__0 : rule__UnmanagedRemoteDatabase__Group_4_1__0__Impl rule__UnmanagedRemoteDatabase__Group_4_1__1 ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:368:1: ( rule__UnmanagedRemoteDatabase__Group_4_1__0__Impl rule__UnmanagedRemoteDatabase__Group_4_1__1 )
            // InternalDbAdapterDsl.g:369:2: rule__UnmanagedRemoteDatabase__Group_4_1__0__Impl rule__UnmanagedRemoteDatabase__Group_4_1__1
            {
            pushFollow(FOLLOW_8);
            rule__UnmanagedRemoteDatabase__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_1__0"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_1__0__Impl"
    // InternalDbAdapterDsl.g:376:1: rule__UnmanagedRemoteDatabase__Group_4_1__0__Impl : ( 'name' ) ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:380:1: ( ( 'name' ) )
            // InternalDbAdapterDsl.g:381:1: ( 'name' )
            {
            // InternalDbAdapterDsl.g:381:1: ( 'name' )
            // InternalDbAdapterDsl.g:382:2: 'name'
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameKeyword_4_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_1__0__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_1__1"
    // InternalDbAdapterDsl.g:391:1: rule__UnmanagedRemoteDatabase__Group_4_1__1 : rule__UnmanagedRemoteDatabase__Group_4_1__1__Impl ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:395:1: ( rule__UnmanagedRemoteDatabase__Group_4_1__1__Impl )
            // InternalDbAdapterDsl.g:396:2: rule__UnmanagedRemoteDatabase__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_1__1"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_1__1__Impl"
    // InternalDbAdapterDsl.g:402:1: rule__UnmanagedRemoteDatabase__Group_4_1__1__Impl : ( ( rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1 ) ) ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:406:1: ( ( ( rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1 ) ) )
            // InternalDbAdapterDsl.g:407:1: ( ( rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1 ) )
            {
            // InternalDbAdapterDsl.g:407:1: ( ( rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1 ) )
            // InternalDbAdapterDsl.g:408:2: ( rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1 )
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameAssignment_4_1_1()); 
            // InternalDbAdapterDsl.g:409:2: ( rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1 )
            // InternalDbAdapterDsl.g:409:3: rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_1__1__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_2__0"
    // InternalDbAdapterDsl.g:418:1: rule__UnmanagedRemoteDatabase__Group_4_2__0 : rule__UnmanagedRemoteDatabase__Group_4_2__0__Impl rule__UnmanagedRemoteDatabase__Group_4_2__1 ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:422:1: ( rule__UnmanagedRemoteDatabase__Group_4_2__0__Impl rule__UnmanagedRemoteDatabase__Group_4_2__1 )
            // InternalDbAdapterDsl.g:423:2: rule__UnmanagedRemoteDatabase__Group_4_2__0__Impl rule__UnmanagedRemoteDatabase__Group_4_2__1
            {
            pushFollow(FOLLOW_8);
            rule__UnmanagedRemoteDatabase__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_2__0"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_2__0__Impl"
    // InternalDbAdapterDsl.g:430:1: rule__UnmanagedRemoteDatabase__Group_4_2__0__Impl : ( 'description' ) ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:434:1: ( ( 'description' ) )
            // InternalDbAdapterDsl.g:435:1: ( 'description' )
            {
            // InternalDbAdapterDsl.g:435:1: ( 'description' )
            // InternalDbAdapterDsl.g:436:2: 'description'
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionKeyword_4_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_2__0__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_2__1"
    // InternalDbAdapterDsl.g:445:1: rule__UnmanagedRemoteDatabase__Group_4_2__1 : rule__UnmanagedRemoteDatabase__Group_4_2__1__Impl ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:449:1: ( rule__UnmanagedRemoteDatabase__Group_4_2__1__Impl )
            // InternalDbAdapterDsl.g:450:2: rule__UnmanagedRemoteDatabase__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_2__1"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__Group_4_2__1__Impl"
    // InternalDbAdapterDsl.g:456:1: rule__UnmanagedRemoteDatabase__Group_4_2__1__Impl : ( ( rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1 ) ) ;
    public final void rule__UnmanagedRemoteDatabase__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:460:1: ( ( ( rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1 ) ) )
            // InternalDbAdapterDsl.g:461:1: ( ( rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1 ) )
            {
            // InternalDbAdapterDsl.g:461:1: ( ( rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1 ) )
            // InternalDbAdapterDsl.g:462:2: ( rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1 )
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionAssignment_4_2_1()); 
            // InternalDbAdapterDsl.g:463:2: ( rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1 )
            // InternalDbAdapterDsl.g:463:3: rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__Group_4_2__1__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__0"
    // InternalDbAdapterDsl.g:472:1: rule__ManagedLocalDatabase__Group_0__0 : rule__ManagedLocalDatabase__Group_0__0__Impl rule__ManagedLocalDatabase__Group_0__1 ;
    public final void rule__ManagedLocalDatabase__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:476:1: ( rule__ManagedLocalDatabase__Group_0__0__Impl rule__ManagedLocalDatabase__Group_0__1 )
            // InternalDbAdapterDsl.g:477:2: rule__ManagedLocalDatabase__Group_0__0__Impl rule__ManagedLocalDatabase__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__ManagedLocalDatabase__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__0"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__0__Impl"
    // InternalDbAdapterDsl.g:484:1: rule__ManagedLocalDatabase__Group_0__0__Impl : ( 'managed' ) ;
    public final void rule__ManagedLocalDatabase__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:488:1: ( ( 'managed' ) )
            // InternalDbAdapterDsl.g:489:1: ( 'managed' )
            {
            // InternalDbAdapterDsl.g:489:1: ( 'managed' )
            // InternalDbAdapterDsl.g:490:2: 'managed'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getManagedKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getManagedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__0__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__1"
    // InternalDbAdapterDsl.g:499:1: rule__ManagedLocalDatabase__Group_0__1 : rule__ManagedLocalDatabase__Group_0__1__Impl rule__ManagedLocalDatabase__Group_0__2 ;
    public final void rule__ManagedLocalDatabase__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:503:1: ( rule__ManagedLocalDatabase__Group_0__1__Impl rule__ManagedLocalDatabase__Group_0__2 )
            // InternalDbAdapterDsl.g:504:2: rule__ManagedLocalDatabase__Group_0__1__Impl rule__ManagedLocalDatabase__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__ManagedLocalDatabase__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__1"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__1__Impl"
    // InternalDbAdapterDsl.g:511:1: rule__ManagedLocalDatabase__Group_0__1__Impl : ( 'local' ) ;
    public final void rule__ManagedLocalDatabase__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:515:1: ( ( 'local' ) )
            // InternalDbAdapterDsl.g:516:1: ( 'local' )
            {
            // InternalDbAdapterDsl.g:516:1: ( 'local' )
            // InternalDbAdapterDsl.g:517:2: 'local'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getLocalKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getLocalKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__1__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__2"
    // InternalDbAdapterDsl.g:526:1: rule__ManagedLocalDatabase__Group_0__2 : rule__ManagedLocalDatabase__Group_0__2__Impl rule__ManagedLocalDatabase__Group_0__3 ;
    public final void rule__ManagedLocalDatabase__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:530:1: ( rule__ManagedLocalDatabase__Group_0__2__Impl rule__ManagedLocalDatabase__Group_0__3 )
            // InternalDbAdapterDsl.g:531:2: rule__ManagedLocalDatabase__Group_0__2__Impl rule__ManagedLocalDatabase__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__ManagedLocalDatabase__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__2"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__2__Impl"
    // InternalDbAdapterDsl.g:538:1: rule__ManagedLocalDatabase__Group_0__2__Impl : ( 'database' ) ;
    public final void rule__ManagedLocalDatabase__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:542:1: ( ( 'database' ) )
            // InternalDbAdapterDsl.g:543:1: ( 'database' )
            {
            // InternalDbAdapterDsl.g:543:1: ( 'database' )
            // InternalDbAdapterDsl.g:544:2: 'database'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getDatabaseKeyword_0_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getDatabaseKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__2__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__3"
    // InternalDbAdapterDsl.g:553:1: rule__ManagedLocalDatabase__Group_0__3 : rule__ManagedLocalDatabase__Group_0__3__Impl rule__ManagedLocalDatabase__Group_0__4 ;
    public final void rule__ManagedLocalDatabase__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:557:1: ( rule__ManagedLocalDatabase__Group_0__3__Impl rule__ManagedLocalDatabase__Group_0__4 )
            // InternalDbAdapterDsl.g:558:2: rule__ManagedLocalDatabase__Group_0__3__Impl rule__ManagedLocalDatabase__Group_0__4
            {
            pushFollow(FOLLOW_10);
            rule__ManagedLocalDatabase__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__3"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__3__Impl"
    // InternalDbAdapterDsl.g:565:1: rule__ManagedLocalDatabase__Group_0__3__Impl : ( '{' ) ;
    public final void rule__ManagedLocalDatabase__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:569:1: ( ( '{' ) )
            // InternalDbAdapterDsl.g:570:1: ( '{' )
            {
            // InternalDbAdapterDsl.g:570:1: ( '{' )
            // InternalDbAdapterDsl.g:571:2: '{'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getLeftCurlyBracketKeyword_0_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getLeftCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__3__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__4"
    // InternalDbAdapterDsl.g:580:1: rule__ManagedLocalDatabase__Group_0__4 : rule__ManagedLocalDatabase__Group_0__4__Impl ;
    public final void rule__ManagedLocalDatabase__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:584:1: ( rule__ManagedLocalDatabase__Group_0__4__Impl )
            // InternalDbAdapterDsl.g:585:2: rule__ManagedLocalDatabase__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__4"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0__4__Impl"
    // InternalDbAdapterDsl.g:591:1: rule__ManagedLocalDatabase__Group_0__4__Impl : ( ( rule__ManagedLocalDatabase__Group_0_4__0 )? ) ;
    public final void rule__ManagedLocalDatabase__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:595:1: ( ( ( rule__ManagedLocalDatabase__Group_0_4__0 )? ) )
            // InternalDbAdapterDsl.g:596:1: ( ( rule__ManagedLocalDatabase__Group_0_4__0 )? )
            {
            // InternalDbAdapterDsl.g:596:1: ( ( rule__ManagedLocalDatabase__Group_0_4__0 )? )
            // InternalDbAdapterDsl.g:597:2: ( rule__ManagedLocalDatabase__Group_0_4__0 )?
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getGroup_0_4()); 
            // InternalDbAdapterDsl.g:598:2: ( rule__ManagedLocalDatabase__Group_0_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDbAdapterDsl.g:598:3: rule__ManagedLocalDatabase__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__Group_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManagedLocalDatabaseAccess().getGroup_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0__4__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0_4__0"
    // InternalDbAdapterDsl.g:607:1: rule__ManagedLocalDatabase__Group_0_4__0 : rule__ManagedLocalDatabase__Group_0_4__0__Impl rule__ManagedLocalDatabase__Group_0_4__1 ;
    public final void rule__ManagedLocalDatabase__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:611:1: ( rule__ManagedLocalDatabase__Group_0_4__0__Impl rule__ManagedLocalDatabase__Group_0_4__1 )
            // InternalDbAdapterDsl.g:612:2: rule__ManagedLocalDatabase__Group_0_4__0__Impl rule__ManagedLocalDatabase__Group_0_4__1
            {
            pushFollow(FOLLOW_8);
            rule__ManagedLocalDatabase__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0_4__0"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0_4__0__Impl"
    // InternalDbAdapterDsl.g:619:1: rule__ManagedLocalDatabase__Group_0_4__0__Impl : ( 'name' ) ;
    public final void rule__ManagedLocalDatabase__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:623:1: ( ( 'name' ) )
            // InternalDbAdapterDsl.g:624:1: ( 'name' )
            {
            // InternalDbAdapterDsl.g:624:1: ( 'name' )
            // InternalDbAdapterDsl.g:625:2: 'name'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getNameKeyword_0_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getNameKeyword_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0_4__0__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0_4__1"
    // InternalDbAdapterDsl.g:634:1: rule__ManagedLocalDatabase__Group_0_4__1 : rule__ManagedLocalDatabase__Group_0_4__1__Impl ;
    public final void rule__ManagedLocalDatabase__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:638:1: ( rule__ManagedLocalDatabase__Group_0_4__1__Impl )
            // InternalDbAdapterDsl.g:639:2: rule__ManagedLocalDatabase__Group_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0_4__1"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_0_4__1__Impl"
    // InternalDbAdapterDsl.g:645:1: rule__ManagedLocalDatabase__Group_0_4__1__Impl : ( ( rule__ManagedLocalDatabase__NameAssignment_0_4_1 ) ) ;
    public final void rule__ManagedLocalDatabase__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:649:1: ( ( ( rule__ManagedLocalDatabase__NameAssignment_0_4_1 ) ) )
            // InternalDbAdapterDsl.g:650:1: ( ( rule__ManagedLocalDatabase__NameAssignment_0_4_1 ) )
            {
            // InternalDbAdapterDsl.g:650:1: ( ( rule__ManagedLocalDatabase__NameAssignment_0_4_1 ) )
            // InternalDbAdapterDsl.g:651:2: ( rule__ManagedLocalDatabase__NameAssignment_0_4_1 )
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getNameAssignment_0_4_1()); 
            // InternalDbAdapterDsl.g:652:2: ( rule__ManagedLocalDatabase__NameAssignment_0_4_1 )
            // InternalDbAdapterDsl.g:652:3: rule__ManagedLocalDatabase__NameAssignment_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__NameAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getManagedLocalDatabaseAccess().getNameAssignment_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_0_4__1__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_1__0"
    // InternalDbAdapterDsl.g:661:1: rule__ManagedLocalDatabase__Group_1__0 : rule__ManagedLocalDatabase__Group_1__0__Impl rule__ManagedLocalDatabase__Group_1__1 ;
    public final void rule__ManagedLocalDatabase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:665:1: ( rule__ManagedLocalDatabase__Group_1__0__Impl rule__ManagedLocalDatabase__Group_1__1 )
            // InternalDbAdapterDsl.g:666:2: rule__ManagedLocalDatabase__Group_1__0__Impl rule__ManagedLocalDatabase__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ManagedLocalDatabase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_1__0"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_1__0__Impl"
    // InternalDbAdapterDsl.g:673:1: rule__ManagedLocalDatabase__Group_1__0__Impl : ( 'description' ) ;
    public final void rule__ManagedLocalDatabase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:677:1: ( ( 'description' ) )
            // InternalDbAdapterDsl.g:678:1: ( 'description' )
            {
            // InternalDbAdapterDsl.g:678:1: ( 'description' )
            // InternalDbAdapterDsl.g:679:2: 'description'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getDescriptionKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getDescriptionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_1__0__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_1__1"
    // InternalDbAdapterDsl.g:688:1: rule__ManagedLocalDatabase__Group_1__1 : rule__ManagedLocalDatabase__Group_1__1__Impl ;
    public final void rule__ManagedLocalDatabase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:692:1: ( rule__ManagedLocalDatabase__Group_1__1__Impl )
            // InternalDbAdapterDsl.g:693:2: rule__ManagedLocalDatabase__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_1__1"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_1__1__Impl"
    // InternalDbAdapterDsl.g:699:1: rule__ManagedLocalDatabase__Group_1__1__Impl : ( ( rule__ManagedLocalDatabase__DescriptionAssignment_1_1 ) ) ;
    public final void rule__ManagedLocalDatabase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:703:1: ( ( ( rule__ManagedLocalDatabase__DescriptionAssignment_1_1 ) ) )
            // InternalDbAdapterDsl.g:704:1: ( ( rule__ManagedLocalDatabase__DescriptionAssignment_1_1 ) )
            {
            // InternalDbAdapterDsl.g:704:1: ( ( rule__ManagedLocalDatabase__DescriptionAssignment_1_1 ) )
            // InternalDbAdapterDsl.g:705:2: ( rule__ManagedLocalDatabase__DescriptionAssignment_1_1 )
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getDescriptionAssignment_1_1()); 
            // InternalDbAdapterDsl.g:706:2: ( rule__ManagedLocalDatabase__DescriptionAssignment_1_1 )
            // InternalDbAdapterDsl.g:706:3: rule__ManagedLocalDatabase__DescriptionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__DescriptionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getManagedLocalDatabaseAccess().getDescriptionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_1__1__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_2__0"
    // InternalDbAdapterDsl.g:715:1: rule__ManagedLocalDatabase__Group_2__0 : rule__ManagedLocalDatabase__Group_2__0__Impl rule__ManagedLocalDatabase__Group_2__1 ;
    public final void rule__ManagedLocalDatabase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:719:1: ( rule__ManagedLocalDatabase__Group_2__0__Impl rule__ManagedLocalDatabase__Group_2__1 )
            // InternalDbAdapterDsl.g:720:2: rule__ManagedLocalDatabase__Group_2__0__Impl rule__ManagedLocalDatabase__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ManagedLocalDatabase__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_2__0"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_2__0__Impl"
    // InternalDbAdapterDsl.g:727:1: rule__ManagedLocalDatabase__Group_2__0__Impl : ( 'port' ) ;
    public final void rule__ManagedLocalDatabase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:731:1: ( ( 'port' ) )
            // InternalDbAdapterDsl.g:732:1: ( 'port' )
            {
            // InternalDbAdapterDsl.g:732:1: ( 'port' )
            // InternalDbAdapterDsl.g:733:2: 'port'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getPortKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getPortKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_2__0__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_2__1"
    // InternalDbAdapterDsl.g:742:1: rule__ManagedLocalDatabase__Group_2__1 : rule__ManagedLocalDatabase__Group_2__1__Impl ;
    public final void rule__ManagedLocalDatabase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:746:1: ( rule__ManagedLocalDatabase__Group_2__1__Impl )
            // InternalDbAdapterDsl.g:747:2: rule__ManagedLocalDatabase__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_2__1"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_2__1__Impl"
    // InternalDbAdapterDsl.g:753:1: rule__ManagedLocalDatabase__Group_2__1__Impl : ( ( rule__ManagedLocalDatabase__PortAssignment_2_1 ) ) ;
    public final void rule__ManagedLocalDatabase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:757:1: ( ( ( rule__ManagedLocalDatabase__PortAssignment_2_1 ) ) )
            // InternalDbAdapterDsl.g:758:1: ( ( rule__ManagedLocalDatabase__PortAssignment_2_1 ) )
            {
            // InternalDbAdapterDsl.g:758:1: ( ( rule__ManagedLocalDatabase__PortAssignment_2_1 ) )
            // InternalDbAdapterDsl.g:759:2: ( rule__ManagedLocalDatabase__PortAssignment_2_1 )
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getPortAssignment_2_1()); 
            // InternalDbAdapterDsl.g:760:2: ( rule__ManagedLocalDatabase__PortAssignment_2_1 )
            // InternalDbAdapterDsl.g:760:3: rule__ManagedLocalDatabase__PortAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__PortAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getManagedLocalDatabaseAccess().getPortAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_2__1__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_3__0"
    // InternalDbAdapterDsl.g:769:1: rule__ManagedLocalDatabase__Group_3__0 : rule__ManagedLocalDatabase__Group_3__0__Impl rule__ManagedLocalDatabase__Group_3__1 ;
    public final void rule__ManagedLocalDatabase__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:773:1: ( rule__ManagedLocalDatabase__Group_3__0__Impl rule__ManagedLocalDatabase__Group_3__1 )
            // InternalDbAdapterDsl.g:774:2: rule__ManagedLocalDatabase__Group_3__0__Impl rule__ManagedLocalDatabase__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__ManagedLocalDatabase__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_3__0"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_3__0__Impl"
    // InternalDbAdapterDsl.g:781:1: rule__ManagedLocalDatabase__Group_3__0__Impl : ( 'storage' ) ;
    public final void rule__ManagedLocalDatabase__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:785:1: ( ( 'storage' ) )
            // InternalDbAdapterDsl.g:786:1: ( 'storage' )
            {
            // InternalDbAdapterDsl.g:786:1: ( 'storage' )
            // InternalDbAdapterDsl.g:787:2: 'storage'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getStorageKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getStorageKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_3__0__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_3__1"
    // InternalDbAdapterDsl.g:796:1: rule__ManagedLocalDatabase__Group_3__1 : rule__ManagedLocalDatabase__Group_3__1__Impl ;
    public final void rule__ManagedLocalDatabase__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:800:1: ( rule__ManagedLocalDatabase__Group_3__1__Impl )
            // InternalDbAdapterDsl.g:801:2: rule__ManagedLocalDatabase__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_3__1"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_3__1__Impl"
    // InternalDbAdapterDsl.g:807:1: rule__ManagedLocalDatabase__Group_3__1__Impl : ( ( rule__ManagedLocalDatabase__StorageAssignment_3_1 ) ) ;
    public final void rule__ManagedLocalDatabase__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:811:1: ( ( ( rule__ManagedLocalDatabase__StorageAssignment_3_1 ) ) )
            // InternalDbAdapterDsl.g:812:1: ( ( rule__ManagedLocalDatabase__StorageAssignment_3_1 ) )
            {
            // InternalDbAdapterDsl.g:812:1: ( ( rule__ManagedLocalDatabase__StorageAssignment_3_1 ) )
            // InternalDbAdapterDsl.g:813:2: ( rule__ManagedLocalDatabase__StorageAssignment_3_1 )
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getStorageAssignment_3_1()); 
            // InternalDbAdapterDsl.g:814:2: ( rule__ManagedLocalDatabase__StorageAssignment_3_1 )
            // InternalDbAdapterDsl.g:814:3: rule__ManagedLocalDatabase__StorageAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__StorageAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getManagedLocalDatabaseAccess().getStorageAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_3__1__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4__0"
    // InternalDbAdapterDsl.g:823:1: rule__ManagedLocalDatabase__Group_4__0 : rule__ManagedLocalDatabase__Group_4__0__Impl rule__ManagedLocalDatabase__Group_4__1 ;
    public final void rule__ManagedLocalDatabase__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:827:1: ( rule__ManagedLocalDatabase__Group_4__0__Impl rule__ManagedLocalDatabase__Group_4__1 )
            // InternalDbAdapterDsl.g:828:2: rule__ManagedLocalDatabase__Group_4__0__Impl rule__ManagedLocalDatabase__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ManagedLocalDatabase__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4__0"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4__0__Impl"
    // InternalDbAdapterDsl.g:835:1: rule__ManagedLocalDatabase__Group_4__0__Impl : ( ( rule__ManagedLocalDatabase__Group_4_0__0 ) ) ;
    public final void rule__ManagedLocalDatabase__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:839:1: ( ( ( rule__ManagedLocalDatabase__Group_4_0__0 ) ) )
            // InternalDbAdapterDsl.g:840:1: ( ( rule__ManagedLocalDatabase__Group_4_0__0 ) )
            {
            // InternalDbAdapterDsl.g:840:1: ( ( rule__ManagedLocalDatabase__Group_4_0__0 ) )
            // InternalDbAdapterDsl.g:841:2: ( rule__ManagedLocalDatabase__Group_4_0__0 )
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getGroup_4_0()); 
            // InternalDbAdapterDsl.g:842:2: ( rule__ManagedLocalDatabase__Group_4_0__0 )
            // InternalDbAdapterDsl.g:842:3: rule__ManagedLocalDatabase__Group_4_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4_0__0();

            state._fsp--;


            }

             after(grammarAccess.getManagedLocalDatabaseAccess().getGroup_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4__0__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4__1"
    // InternalDbAdapterDsl.g:850:1: rule__ManagedLocalDatabase__Group_4__1 : rule__ManagedLocalDatabase__Group_4__1__Impl ;
    public final void rule__ManagedLocalDatabase__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:854:1: ( rule__ManagedLocalDatabase__Group_4__1__Impl )
            // InternalDbAdapterDsl.g:855:2: rule__ManagedLocalDatabase__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4__1"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4__1__Impl"
    // InternalDbAdapterDsl.g:861:1: rule__ManagedLocalDatabase__Group_4__1__Impl : ( '}' ) ;
    public final void rule__ManagedLocalDatabase__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:865:1: ( ( '}' ) )
            // InternalDbAdapterDsl.g:866:1: ( '}' )
            {
            // InternalDbAdapterDsl.g:866:1: ( '}' )
            // InternalDbAdapterDsl.g:867:2: '}'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getRightCurlyBracketKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getRightCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4__1__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__0"
    // InternalDbAdapterDsl.g:877:1: rule__ManagedLocalDatabase__Group_4_0__0 : rule__ManagedLocalDatabase__Group_4_0__0__Impl rule__ManagedLocalDatabase__Group_4_0__1 ;
    public final void rule__ManagedLocalDatabase__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:881:1: ( rule__ManagedLocalDatabase__Group_4_0__0__Impl rule__ManagedLocalDatabase__Group_4_0__1 )
            // InternalDbAdapterDsl.g:882:2: rule__ManagedLocalDatabase__Group_4_0__0__Impl rule__ManagedLocalDatabase__Group_4_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ManagedLocalDatabase__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__0"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__0__Impl"
    // InternalDbAdapterDsl.g:889:1: rule__ManagedLocalDatabase__Group_4_0__0__Impl : ( 'files' ) ;
    public final void rule__ManagedLocalDatabase__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:893:1: ( ( 'files' ) )
            // InternalDbAdapterDsl.g:894:1: ( 'files' )
            {
            // InternalDbAdapterDsl.g:894:1: ( 'files' )
            // InternalDbAdapterDsl.g:895:2: 'files'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getFilesKeyword_4_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getFilesKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__0__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__1"
    // InternalDbAdapterDsl.g:904:1: rule__ManagedLocalDatabase__Group_4_0__1 : rule__ManagedLocalDatabase__Group_4_0__1__Impl rule__ManagedLocalDatabase__Group_4_0__2 ;
    public final void rule__ManagedLocalDatabase__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:908:1: ( rule__ManagedLocalDatabase__Group_4_0__1__Impl rule__ManagedLocalDatabase__Group_4_0__2 )
            // InternalDbAdapterDsl.g:909:2: rule__ManagedLocalDatabase__Group_4_0__1__Impl rule__ManagedLocalDatabase__Group_4_0__2
            {
            pushFollow(FOLLOW_8);
            rule__ManagedLocalDatabase__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__1"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__1__Impl"
    // InternalDbAdapterDsl.g:916:1: rule__ManagedLocalDatabase__Group_4_0__1__Impl : ( '{' ) ;
    public final void rule__ManagedLocalDatabase__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:920:1: ( ( '{' ) )
            // InternalDbAdapterDsl.g:921:1: ( '{' )
            {
            // InternalDbAdapterDsl.g:921:1: ( '{' )
            // InternalDbAdapterDsl.g:922:2: '{'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getLeftCurlyBracketKeyword_4_0_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getLeftCurlyBracketKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__1__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__2"
    // InternalDbAdapterDsl.g:931:1: rule__ManagedLocalDatabase__Group_4_0__2 : rule__ManagedLocalDatabase__Group_4_0__2__Impl rule__ManagedLocalDatabase__Group_4_0__3 ;
    public final void rule__ManagedLocalDatabase__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:935:1: ( rule__ManagedLocalDatabase__Group_4_0__2__Impl rule__ManagedLocalDatabase__Group_4_0__3 )
            // InternalDbAdapterDsl.g:936:2: rule__ManagedLocalDatabase__Group_4_0__2__Impl rule__ManagedLocalDatabase__Group_4_0__3
            {
            pushFollow(FOLLOW_12);
            rule__ManagedLocalDatabase__Group_4_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__2"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__2__Impl"
    // InternalDbAdapterDsl.g:943:1: rule__ManagedLocalDatabase__Group_4_0__2__Impl : ( ( rule__ManagedLocalDatabase__FilesAssignment_4_0_2 ) ) ;
    public final void rule__ManagedLocalDatabase__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:947:1: ( ( ( rule__ManagedLocalDatabase__FilesAssignment_4_0_2 ) ) )
            // InternalDbAdapterDsl.g:948:1: ( ( rule__ManagedLocalDatabase__FilesAssignment_4_0_2 ) )
            {
            // InternalDbAdapterDsl.g:948:1: ( ( rule__ManagedLocalDatabase__FilesAssignment_4_0_2 ) )
            // InternalDbAdapterDsl.g:949:2: ( rule__ManagedLocalDatabase__FilesAssignment_4_0_2 )
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getFilesAssignment_4_0_2()); 
            // InternalDbAdapterDsl.g:950:2: ( rule__ManagedLocalDatabase__FilesAssignment_4_0_2 )
            // InternalDbAdapterDsl.g:950:3: rule__ManagedLocalDatabase__FilesAssignment_4_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__FilesAssignment_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getManagedLocalDatabaseAccess().getFilesAssignment_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__2__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__3"
    // InternalDbAdapterDsl.g:958:1: rule__ManagedLocalDatabase__Group_4_0__3 : rule__ManagedLocalDatabase__Group_4_0__3__Impl rule__ManagedLocalDatabase__Group_4_0__4 ;
    public final void rule__ManagedLocalDatabase__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:962:1: ( rule__ManagedLocalDatabase__Group_4_0__3__Impl rule__ManagedLocalDatabase__Group_4_0__4 )
            // InternalDbAdapterDsl.g:963:2: rule__ManagedLocalDatabase__Group_4_0__3__Impl rule__ManagedLocalDatabase__Group_4_0__4
            {
            pushFollow(FOLLOW_12);
            rule__ManagedLocalDatabase__Group_4_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__3"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__3__Impl"
    // InternalDbAdapterDsl.g:970:1: rule__ManagedLocalDatabase__Group_4_0__3__Impl : ( ( rule__ManagedLocalDatabase__Group_4_0_3__0 )* ) ;
    public final void rule__ManagedLocalDatabase__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:974:1: ( ( ( rule__ManagedLocalDatabase__Group_4_0_3__0 )* ) )
            // InternalDbAdapterDsl.g:975:1: ( ( rule__ManagedLocalDatabase__Group_4_0_3__0 )* )
            {
            // InternalDbAdapterDsl.g:975:1: ( ( rule__ManagedLocalDatabase__Group_4_0_3__0 )* )
            // InternalDbAdapterDsl.g:976:2: ( rule__ManagedLocalDatabase__Group_4_0_3__0 )*
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getGroup_4_0_3()); 
            // InternalDbAdapterDsl.g:977:2: ( rule__ManagedLocalDatabase__Group_4_0_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDbAdapterDsl.g:977:3: rule__ManagedLocalDatabase__Group_4_0_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ManagedLocalDatabase__Group_4_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getManagedLocalDatabaseAccess().getGroup_4_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__3__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__4"
    // InternalDbAdapterDsl.g:985:1: rule__ManagedLocalDatabase__Group_4_0__4 : rule__ManagedLocalDatabase__Group_4_0__4__Impl ;
    public final void rule__ManagedLocalDatabase__Group_4_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:989:1: ( rule__ManagedLocalDatabase__Group_4_0__4__Impl )
            // InternalDbAdapterDsl.g:990:2: rule__ManagedLocalDatabase__Group_4_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__4"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0__4__Impl"
    // InternalDbAdapterDsl.g:996:1: rule__ManagedLocalDatabase__Group_4_0__4__Impl : ( '}' ) ;
    public final void rule__ManagedLocalDatabase__Group_4_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1000:1: ( ( '}' ) )
            // InternalDbAdapterDsl.g:1001:1: ( '}' )
            {
            // InternalDbAdapterDsl.g:1001:1: ( '}' )
            // InternalDbAdapterDsl.g:1002:2: '}'
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getRightCurlyBracketKeyword_4_0_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getRightCurlyBracketKeyword_4_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0__4__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0_3__0"
    // InternalDbAdapterDsl.g:1012:1: rule__ManagedLocalDatabase__Group_4_0_3__0 : rule__ManagedLocalDatabase__Group_4_0_3__0__Impl rule__ManagedLocalDatabase__Group_4_0_3__1 ;
    public final void rule__ManagedLocalDatabase__Group_4_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1016:1: ( rule__ManagedLocalDatabase__Group_4_0_3__0__Impl rule__ManagedLocalDatabase__Group_4_0_3__1 )
            // InternalDbAdapterDsl.g:1017:2: rule__ManagedLocalDatabase__Group_4_0_3__0__Impl rule__ManagedLocalDatabase__Group_4_0_3__1
            {
            pushFollow(FOLLOW_8);
            rule__ManagedLocalDatabase__Group_4_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0_3__0"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0_3__0__Impl"
    // InternalDbAdapterDsl.g:1024:1: rule__ManagedLocalDatabase__Group_4_0_3__0__Impl : ( ',' ) ;
    public final void rule__ManagedLocalDatabase__Group_4_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1028:1: ( ( ',' ) )
            // InternalDbAdapterDsl.g:1029:1: ( ',' )
            {
            // InternalDbAdapterDsl.g:1029:1: ( ',' )
            // InternalDbAdapterDsl.g:1030:2: ','
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getCommaKeyword_4_0_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getCommaKeyword_4_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0_3__0__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0_3__1"
    // InternalDbAdapterDsl.g:1039:1: rule__ManagedLocalDatabase__Group_4_0_3__1 : rule__ManagedLocalDatabase__Group_4_0_3__1__Impl ;
    public final void rule__ManagedLocalDatabase__Group_4_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1043:1: ( rule__ManagedLocalDatabase__Group_4_0_3__1__Impl )
            // InternalDbAdapterDsl.g:1044:2: rule__ManagedLocalDatabase__Group_4_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__Group_4_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0_3__1"


    // $ANTLR start "rule__ManagedLocalDatabase__Group_4_0_3__1__Impl"
    // InternalDbAdapterDsl.g:1050:1: rule__ManagedLocalDatabase__Group_4_0_3__1__Impl : ( ( rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1 ) ) ;
    public final void rule__ManagedLocalDatabase__Group_4_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1054:1: ( ( ( rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1 ) ) )
            // InternalDbAdapterDsl.g:1055:1: ( ( rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1 ) )
            {
            // InternalDbAdapterDsl.g:1055:1: ( ( rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1 ) )
            // InternalDbAdapterDsl.g:1056:2: ( rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1 )
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getFilesAssignment_4_0_3_1()); 
            // InternalDbAdapterDsl.g:1057:2: ( rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1 )
            // InternalDbAdapterDsl.g:1057:3: rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getManagedLocalDatabaseAccess().getFilesAssignment_4_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__Group_4_0_3__1__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__UnorderedGroup_4"
    // InternalDbAdapterDsl.g:1066:1: rule__UnmanagedRemoteDatabase__UnorderedGroup_4 : rule__UnmanagedRemoteDatabase__UnorderedGroup_4__0 {...}?;
    public final void rule__UnmanagedRemoteDatabase__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
        	
        try {
            // InternalDbAdapterDsl.g:1071:1: ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__0 {...}?)
            // InternalDbAdapterDsl.g:1072:2: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__UnorderedGroup_4__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "rule__UnmanagedRemoteDatabase__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__UnorderedGroup_4"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl"
    // InternalDbAdapterDsl.g:1080:1: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDbAdapterDsl.g:1085:1: ( ( ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) ) ) ) ) )
            // InternalDbAdapterDsl.g:1086:3: ( ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) ) ) ) )
            {
            // InternalDbAdapterDsl.g:1086:3: ( ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) ) ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( LA4_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1) ) {
                alt4=2;
            }
            else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDbAdapterDsl.g:1087:3: ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) ) ) )
                    {
                    // InternalDbAdapterDsl.g:1087:3: ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) ) ) )
                    // InternalDbAdapterDsl.g:1088:4: {...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalDbAdapterDsl.g:1088:119: ( ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) ) )
                    // InternalDbAdapterDsl.g:1089:5: ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDbAdapterDsl.g:1095:5: ( ( rule__UnmanagedRemoteDatabase__Group_4_0__0 ) )
                    // InternalDbAdapterDsl.g:1096:6: ( rule__UnmanagedRemoteDatabase__Group_4_0__0 )
                    {
                     before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getGroup_4_0()); 
                    // InternalDbAdapterDsl.g:1097:6: ( rule__UnmanagedRemoteDatabase__Group_4_0__0 )
                    // InternalDbAdapterDsl.g:1097:7: rule__UnmanagedRemoteDatabase__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnmanagedRemoteDatabase__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getGroup_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDbAdapterDsl.g:1102:3: ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) ) ) )
                    {
                    // InternalDbAdapterDsl.g:1102:3: ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) ) ) )
                    // InternalDbAdapterDsl.g:1103:4: {...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalDbAdapterDsl.g:1103:119: ( ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) ) )
                    // InternalDbAdapterDsl.g:1104:5: ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDbAdapterDsl.g:1110:5: ( ( rule__UnmanagedRemoteDatabase__Group_4_1__0 ) )
                    // InternalDbAdapterDsl.g:1111:6: ( rule__UnmanagedRemoteDatabase__Group_4_1__0 )
                    {
                     before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getGroup_4_1()); 
                    // InternalDbAdapterDsl.g:1112:6: ( rule__UnmanagedRemoteDatabase__Group_4_1__0 )
                    // InternalDbAdapterDsl.g:1112:7: rule__UnmanagedRemoteDatabase__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnmanagedRemoteDatabase__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getGroup_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDbAdapterDsl.g:1117:3: ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) ) ) )
                    {
                    // InternalDbAdapterDsl.g:1117:3: ({...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) ) ) )
                    // InternalDbAdapterDsl.g:1118:4: {...}? => ( ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalDbAdapterDsl.g:1118:119: ( ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) ) )
                    // InternalDbAdapterDsl.g:1119:5: ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDbAdapterDsl.g:1125:5: ( ( rule__UnmanagedRemoteDatabase__Group_4_2__0 ) )
                    // InternalDbAdapterDsl.g:1126:6: ( rule__UnmanagedRemoteDatabase__Group_4_2__0 )
                    {
                     before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getGroup_4_2()); 
                    // InternalDbAdapterDsl.g:1127:6: ( rule__UnmanagedRemoteDatabase__Group_4_2__0 )
                    // InternalDbAdapterDsl.g:1127:7: rule__UnmanagedRemoteDatabase__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnmanagedRemoteDatabase__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getGroup_4_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__0"
    // InternalDbAdapterDsl.g:1140:1: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__0 : rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1 )? ;
    public final void rule__UnmanagedRemoteDatabase__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1144:1: ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1 )? )
            // InternalDbAdapterDsl.g:1145:2: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_14);
            rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalDbAdapterDsl.g:1146:2: ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( LA5_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1) ) {
                alt5=1;
            }
            else if ( LA5_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDbAdapterDsl.g:1146:2: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__0"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1"
    // InternalDbAdapterDsl.g:1152:1: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1 : rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2 )? ;
    public final void rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1156:1: ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2 )? )
            // InternalDbAdapterDsl.g:1157:2: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_14);
            rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalDbAdapterDsl.g:1158:2: ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( LA6_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 1) ) {
                alt6=1;
            }
            else if ( LA6_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUnorderedGroup_4(), 2) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDbAdapterDsl.g:1158:2: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__1"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2"
    // InternalDbAdapterDsl.g:1164:1: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2 : rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl ;
    public final void rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1168:1: ( rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl )
            // InternalDbAdapterDsl.g:1169:2: rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnmanagedRemoteDatabase__UnorderedGroup_4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__UnorderedGroup_4__2"


    // $ANTLR start "rule__ManagedLocalDatabase__UnorderedGroup"
    // InternalDbAdapterDsl.g:1176:1: rule__ManagedLocalDatabase__UnorderedGroup : rule__ManagedLocalDatabase__UnorderedGroup__0 {...}?;
    public final void rule__ManagedLocalDatabase__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
        	
        try {
            // InternalDbAdapterDsl.g:1181:1: ( rule__ManagedLocalDatabase__UnorderedGroup__0 {...}?)
            // InternalDbAdapterDsl.g:1182:2: rule__ManagedLocalDatabase__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__ManagedLocalDatabase__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__UnorderedGroup"


    // $ANTLR start "rule__ManagedLocalDatabase__UnorderedGroup__Impl"
    // InternalDbAdapterDsl.g:1190:1: rule__ManagedLocalDatabase__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_4__0 ) ) ) ) ) ;
    public final void rule__ManagedLocalDatabase__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDbAdapterDsl.g:1195:1: ( ( ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_4__0 ) ) ) ) ) )
            // InternalDbAdapterDsl.g:1196:3: ( ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_4__0 ) ) ) ) )
            {
            // InternalDbAdapterDsl.g:1196:3: ( ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_4__0 ) ) ) ) )
            int alt7=5;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1) ) {
                alt7=2;
            }
            else if ( LA7_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2) ) {
                alt7=3;
            }
            else if ( LA7_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3) ) {
                alt7=4;
            }
            else if ( LA7_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4) ) {
                alt7=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDbAdapterDsl.g:1197:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_0__0 ) ) ) )
                    {
                    // InternalDbAdapterDsl.g:1197:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_0__0 ) ) ) )
                    // InternalDbAdapterDsl.g:1198:4: {...}? => ( ( ( rule__ManagedLocalDatabase__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ManagedLocalDatabase__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalDbAdapterDsl.g:1198:114: ( ( ( rule__ManagedLocalDatabase__Group_0__0 ) ) )
                    // InternalDbAdapterDsl.g:1199:5: ( ( rule__ManagedLocalDatabase__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDbAdapterDsl.g:1205:5: ( ( rule__ManagedLocalDatabase__Group_0__0 ) )
                    // InternalDbAdapterDsl.g:1206:6: ( rule__ManagedLocalDatabase__Group_0__0 )
                    {
                     before(grammarAccess.getManagedLocalDatabaseAccess().getGroup_0()); 
                    // InternalDbAdapterDsl.g:1207:6: ( rule__ManagedLocalDatabase__Group_0__0 )
                    // InternalDbAdapterDsl.g:1207:7: rule__ManagedLocalDatabase__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getManagedLocalDatabaseAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDbAdapterDsl.g:1212:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_1__0 ) ) ) )
                    {
                    // InternalDbAdapterDsl.g:1212:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_1__0 ) ) ) )
                    // InternalDbAdapterDsl.g:1213:4: {...}? => ( ( ( rule__ManagedLocalDatabase__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ManagedLocalDatabase__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalDbAdapterDsl.g:1213:114: ( ( ( rule__ManagedLocalDatabase__Group_1__0 ) ) )
                    // InternalDbAdapterDsl.g:1214:5: ( ( rule__ManagedLocalDatabase__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDbAdapterDsl.g:1220:5: ( ( rule__ManagedLocalDatabase__Group_1__0 ) )
                    // InternalDbAdapterDsl.g:1221:6: ( rule__ManagedLocalDatabase__Group_1__0 )
                    {
                     before(grammarAccess.getManagedLocalDatabaseAccess().getGroup_1()); 
                    // InternalDbAdapterDsl.g:1222:6: ( rule__ManagedLocalDatabase__Group_1__0 )
                    // InternalDbAdapterDsl.g:1222:7: rule__ManagedLocalDatabase__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getManagedLocalDatabaseAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDbAdapterDsl.g:1227:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_2__0 ) ) ) )
                    {
                    // InternalDbAdapterDsl.g:1227:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_2__0 ) ) ) )
                    // InternalDbAdapterDsl.g:1228:4: {...}? => ( ( ( rule__ManagedLocalDatabase__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ManagedLocalDatabase__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalDbAdapterDsl.g:1228:114: ( ( ( rule__ManagedLocalDatabase__Group_2__0 ) ) )
                    // InternalDbAdapterDsl.g:1229:5: ( ( rule__ManagedLocalDatabase__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDbAdapterDsl.g:1235:5: ( ( rule__ManagedLocalDatabase__Group_2__0 ) )
                    // InternalDbAdapterDsl.g:1236:6: ( rule__ManagedLocalDatabase__Group_2__0 )
                    {
                     before(grammarAccess.getManagedLocalDatabaseAccess().getGroup_2()); 
                    // InternalDbAdapterDsl.g:1237:6: ( rule__ManagedLocalDatabase__Group_2__0 )
                    // InternalDbAdapterDsl.g:1237:7: rule__ManagedLocalDatabase__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getManagedLocalDatabaseAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDbAdapterDsl.g:1242:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_3__0 ) ) ) )
                    {
                    // InternalDbAdapterDsl.g:1242:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_3__0 ) ) ) )
                    // InternalDbAdapterDsl.g:1243:4: {...}? => ( ( ( rule__ManagedLocalDatabase__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__ManagedLocalDatabase__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalDbAdapterDsl.g:1243:114: ( ( ( rule__ManagedLocalDatabase__Group_3__0 ) ) )
                    // InternalDbAdapterDsl.g:1244:5: ( ( rule__ManagedLocalDatabase__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalDbAdapterDsl.g:1250:5: ( ( rule__ManagedLocalDatabase__Group_3__0 ) )
                    // InternalDbAdapterDsl.g:1251:6: ( rule__ManagedLocalDatabase__Group_3__0 )
                    {
                     before(grammarAccess.getManagedLocalDatabaseAccess().getGroup_3()); 
                    // InternalDbAdapterDsl.g:1252:6: ( rule__ManagedLocalDatabase__Group_3__0 )
                    // InternalDbAdapterDsl.g:1252:7: rule__ManagedLocalDatabase__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getManagedLocalDatabaseAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDbAdapterDsl.g:1257:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_4__0 ) ) ) )
                    {
                    // InternalDbAdapterDsl.g:1257:3: ({...}? => ( ( ( rule__ManagedLocalDatabase__Group_4__0 ) ) ) )
                    // InternalDbAdapterDsl.g:1258:4: {...}? => ( ( ( rule__ManagedLocalDatabase__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__ManagedLocalDatabase__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalDbAdapterDsl.g:1258:114: ( ( ( rule__ManagedLocalDatabase__Group_4__0 ) ) )
                    // InternalDbAdapterDsl.g:1259:5: ( ( rule__ManagedLocalDatabase__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalDbAdapterDsl.g:1265:5: ( ( rule__ManagedLocalDatabase__Group_4__0 ) )
                    // InternalDbAdapterDsl.g:1266:6: ( rule__ManagedLocalDatabase__Group_4__0 )
                    {
                     before(grammarAccess.getManagedLocalDatabaseAccess().getGroup_4()); 
                    // InternalDbAdapterDsl.g:1267:6: ( rule__ManagedLocalDatabase__Group_4__0 )
                    // InternalDbAdapterDsl.g:1267:7: rule__ManagedLocalDatabase__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getManagedLocalDatabaseAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__UnorderedGroup__Impl"


    // $ANTLR start "rule__ManagedLocalDatabase__UnorderedGroup__0"
    // InternalDbAdapterDsl.g:1280:1: rule__ManagedLocalDatabase__UnorderedGroup__0 : rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__1 )? ;
    public final void rule__ManagedLocalDatabase__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1284:1: ( rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__1 )? )
            // InternalDbAdapterDsl.g:1285:2: rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_15);
            rule__ManagedLocalDatabase__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDbAdapterDsl.g:1286:2: ( rule__ManagedLocalDatabase__UnorderedGroup__1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( LA8_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1) ) {
                alt8=1;
            }
            else if ( LA8_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2) ) {
                alt8=1;
            }
            else if ( LA8_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3) ) {
                alt8=1;
            }
            else if ( LA8_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDbAdapterDsl.g:1286:2: rule__ManagedLocalDatabase__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__UnorderedGroup__0"


    // $ANTLR start "rule__ManagedLocalDatabase__UnorderedGroup__1"
    // InternalDbAdapterDsl.g:1292:1: rule__ManagedLocalDatabase__UnorderedGroup__1 : rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__2 )? ;
    public final void rule__ManagedLocalDatabase__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1296:1: ( rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__2 )? )
            // InternalDbAdapterDsl.g:1297:2: rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_15);
            rule__ManagedLocalDatabase__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDbAdapterDsl.g:1298:2: ( rule__ManagedLocalDatabase__UnorderedGroup__2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( LA9_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1) ) {
                alt9=1;
            }
            else if ( LA9_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2) ) {
                alt9=1;
            }
            else if ( LA9_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3) ) {
                alt9=1;
            }
            else if ( LA9_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDbAdapterDsl.g:1298:2: rule__ManagedLocalDatabase__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__UnorderedGroup__1"


    // $ANTLR start "rule__ManagedLocalDatabase__UnorderedGroup__2"
    // InternalDbAdapterDsl.g:1304:1: rule__ManagedLocalDatabase__UnorderedGroup__2 : rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__3 )? ;
    public final void rule__ManagedLocalDatabase__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1308:1: ( rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__3 )? )
            // InternalDbAdapterDsl.g:1309:2: rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_15);
            rule__ManagedLocalDatabase__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDbAdapterDsl.g:1310:2: ( rule__ManagedLocalDatabase__UnorderedGroup__3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1) ) {
                alt10=1;
            }
            else if ( LA10_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2) ) {
                alt10=1;
            }
            else if ( LA10_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3) ) {
                alt10=1;
            }
            else if ( LA10_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDbAdapterDsl.g:1310:2: rule__ManagedLocalDatabase__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__UnorderedGroup__2"


    // $ANTLR start "rule__ManagedLocalDatabase__UnorderedGroup__3"
    // InternalDbAdapterDsl.g:1316:1: rule__ManagedLocalDatabase__UnorderedGroup__3 : rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__4 )? ;
    public final void rule__ManagedLocalDatabase__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1320:1: ( rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__4 )? )
            // InternalDbAdapterDsl.g:1321:2: rule__ManagedLocalDatabase__UnorderedGroup__Impl ( rule__ManagedLocalDatabase__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_15);
            rule__ManagedLocalDatabase__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDbAdapterDsl.g:1322:2: ( rule__ManagedLocalDatabase__UnorderedGroup__4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 2) ) {
                alt11=1;
            }
            else if ( LA11_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 3) ) {
                alt11=1;
            }
            else if ( LA11_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getManagedLocalDatabaseAccess().getUnorderedGroup(), 4) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDbAdapterDsl.g:1322:2: rule__ManagedLocalDatabase__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManagedLocalDatabase__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__UnorderedGroup__3"


    // $ANTLR start "rule__ManagedLocalDatabase__UnorderedGroup__4"
    // InternalDbAdapterDsl.g:1328:1: rule__ManagedLocalDatabase__UnorderedGroup__4 : rule__ManagedLocalDatabase__UnorderedGroup__Impl ;
    public final void rule__ManagedLocalDatabase__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1332:1: ( rule__ManagedLocalDatabase__UnorderedGroup__Impl )
            // InternalDbAdapterDsl.g:1333:2: rule__ManagedLocalDatabase__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManagedLocalDatabase__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__UnorderedGroup__4"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1"
    // InternalDbAdapterDsl.g:1340:1: rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1 : ( RULE_STRING ) ;
    public final void rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1344:1: ( ( RULE_STRING ) )
            // InternalDbAdapterDsl.g:1345:2: ( RULE_STRING )
            {
            // InternalDbAdapterDsl.g:1345:2: ( RULE_STRING )
            // InternalDbAdapterDsl.g:1346:3: RULE_STRING
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriSTRINGTerminalRuleCall_4_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getUriSTRINGTerminalRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__UriAssignment_4_0_1"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1"
    // InternalDbAdapterDsl.g:1355:1: rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1 : ( RULE_STRING ) ;
    public final void rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1359:1: ( ( RULE_STRING ) )
            // InternalDbAdapterDsl.g:1360:2: ( RULE_STRING )
            {
            // InternalDbAdapterDsl.g:1360:2: ( RULE_STRING )
            // InternalDbAdapterDsl.g:1361:3: RULE_STRING
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameSTRINGTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getNameSTRINGTerminalRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__NameAssignment_4_1_1"


    // $ANTLR start "rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1"
    // InternalDbAdapterDsl.g:1370:1: rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1 : ( RULE_STRING ) ;
    public final void rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1374:1: ( ( RULE_STRING ) )
            // InternalDbAdapterDsl.g:1375:2: ( RULE_STRING )
            {
            // InternalDbAdapterDsl.g:1375:2: ( RULE_STRING )
            // InternalDbAdapterDsl.g:1376:3: RULE_STRING
            {
             before(grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionSTRINGTerminalRuleCall_4_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnmanagedRemoteDatabaseAccess().getDescriptionSTRINGTerminalRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnmanagedRemoteDatabase__DescriptionAssignment_4_2_1"


    // $ANTLR start "rule__ManagedLocalDatabase__NameAssignment_0_4_1"
    // InternalDbAdapterDsl.g:1385:1: rule__ManagedLocalDatabase__NameAssignment_0_4_1 : ( RULE_STRING ) ;
    public final void rule__ManagedLocalDatabase__NameAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1389:1: ( ( RULE_STRING ) )
            // InternalDbAdapterDsl.g:1390:2: ( RULE_STRING )
            {
            // InternalDbAdapterDsl.g:1390:2: ( RULE_STRING )
            // InternalDbAdapterDsl.g:1391:3: RULE_STRING
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getNameSTRINGTerminalRuleCall_0_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getNameSTRINGTerminalRuleCall_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__NameAssignment_0_4_1"


    // $ANTLR start "rule__ManagedLocalDatabase__DescriptionAssignment_1_1"
    // InternalDbAdapterDsl.g:1400:1: rule__ManagedLocalDatabase__DescriptionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ManagedLocalDatabase__DescriptionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1404:1: ( ( RULE_STRING ) )
            // InternalDbAdapterDsl.g:1405:2: ( RULE_STRING )
            {
            // InternalDbAdapterDsl.g:1405:2: ( RULE_STRING )
            // InternalDbAdapterDsl.g:1406:3: RULE_STRING
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__DescriptionAssignment_1_1"


    // $ANTLR start "rule__ManagedLocalDatabase__PortAssignment_2_1"
    // InternalDbAdapterDsl.g:1415:1: rule__ManagedLocalDatabase__PortAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ManagedLocalDatabase__PortAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1419:1: ( ( RULE_INT ) )
            // InternalDbAdapterDsl.g:1420:2: ( RULE_INT )
            {
            // InternalDbAdapterDsl.g:1420:2: ( RULE_INT )
            // InternalDbAdapterDsl.g:1421:3: RULE_INT
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getPortINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getPortINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__PortAssignment_2_1"


    // $ANTLR start "rule__ManagedLocalDatabase__StorageAssignment_3_1"
    // InternalDbAdapterDsl.g:1430:1: rule__ManagedLocalDatabase__StorageAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ManagedLocalDatabase__StorageAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1434:1: ( ( RULE_STRING ) )
            // InternalDbAdapterDsl.g:1435:2: ( RULE_STRING )
            {
            // InternalDbAdapterDsl.g:1435:2: ( RULE_STRING )
            // InternalDbAdapterDsl.g:1436:3: RULE_STRING
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getStorageSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getStorageSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__StorageAssignment_3_1"


    // $ANTLR start "rule__ManagedLocalDatabase__FilesAssignment_4_0_2"
    // InternalDbAdapterDsl.g:1445:1: rule__ManagedLocalDatabase__FilesAssignment_4_0_2 : ( RULE_STRING ) ;
    public final void rule__ManagedLocalDatabase__FilesAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1449:1: ( ( RULE_STRING ) )
            // InternalDbAdapterDsl.g:1450:2: ( RULE_STRING )
            {
            // InternalDbAdapterDsl.g:1450:2: ( RULE_STRING )
            // InternalDbAdapterDsl.g:1451:3: RULE_STRING
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getFilesSTRINGTerminalRuleCall_4_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getFilesSTRINGTerminalRuleCall_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__FilesAssignment_4_0_2"


    // $ANTLR start "rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1"
    // InternalDbAdapterDsl.g:1460:1: rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1 : ( RULE_STRING ) ;
    public final void rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbAdapterDsl.g:1464:1: ( ( RULE_STRING ) )
            // InternalDbAdapterDsl.g:1465:2: ( RULE_STRING )
            {
            // InternalDbAdapterDsl.g:1465:2: ( RULE_STRING )
            // InternalDbAdapterDsl.g:1466:3: RULE_STRING
            {
             before(grammarAccess.getManagedLocalDatabaseAccess().getFilesSTRINGTerminalRuleCall_4_0_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getManagedLocalDatabaseAccess().getFilesSTRINGTerminalRuleCall_4_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManagedLocalDatabase__FilesAssignment_4_0_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000EC0002L});

}
