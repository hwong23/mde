package org.xtext.grupox.ide.contentassist.antlr.internal;

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
import org.xtext.grupox.services.TeamworkGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTeamworkParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTeamworkParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTeamworkParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTeamworkParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTeamwork.g"; }


    	private TeamworkGrammarAccess grammarAccess;

    	public void setGrammarAccess(TeamworkGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTeamwork"
    // InternalTeamwork.g:53:1: entryRuleTeamwork : ruleTeamwork EOF ;
    public final void entryRuleTeamwork() throws RecognitionException {
        try {
            // InternalTeamwork.g:54:1: ( ruleTeamwork EOF )
            // InternalTeamwork.g:55:1: ruleTeamwork EOF
            {
             before(grammarAccess.getTeamworkRule()); 
            pushFollow(FOLLOW_1);
            ruleTeamwork();

            state._fsp--;

             after(grammarAccess.getTeamworkRule()); 
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
    // $ANTLR end "entryRuleTeamwork"


    // $ANTLR start "ruleTeamwork"
    // InternalTeamwork.g:62:1: ruleTeamwork : ( ( rule__Teamwork__ElementsAssignment )* ) ;
    public final void ruleTeamwork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:66:2: ( ( ( rule__Teamwork__ElementsAssignment )* ) )
            // InternalTeamwork.g:67:2: ( ( rule__Teamwork__ElementsAssignment )* )
            {
            // InternalTeamwork.g:67:2: ( ( rule__Teamwork__ElementsAssignment )* )
            // InternalTeamwork.g:68:3: ( rule__Teamwork__ElementsAssignment )*
            {
             before(grammarAccess.getTeamworkAccess().getElementsAssignment()); 
            // InternalTeamwork.g:69:3: ( rule__Teamwork__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_INT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTeamwork.g:69:4: rule__Teamwork__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Teamwork__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTeamworkAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleTeamwork"


    // $ANTLR start "entryRuleProject"
    // InternalTeamwork.g:78:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalTeamwork.g:79:1: ( ruleProject EOF )
            // InternalTeamwork.g:80:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalTeamwork.g:87:1: ruleProject : ( ( rule__Project__Alternatives ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:91:2: ( ( ( rule__Project__Alternatives ) ) )
            // InternalTeamwork.g:92:2: ( ( rule__Project__Alternatives ) )
            {
            // InternalTeamwork.g:92:2: ( ( rule__Project__Alternatives ) )
            // InternalTeamwork.g:93:3: ( rule__Project__Alternatives )
            {
             before(grammarAccess.getProjectAccess().getAlternatives()); 
            // InternalTeamwork.g:94:3: ( rule__Project__Alternatives )
            // InternalTeamwork.g:94:4: rule__Project__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Project__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTask"
    // InternalTeamwork.g:103:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalTeamwork.g:104:1: ( ruleTask EOF )
            // InternalTeamwork.g:105:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTeamwork.g:112:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:116:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalTeamwork.g:117:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalTeamwork.g:117:2: ( ( rule__Task__Group__0 ) )
            // InternalTeamwork.g:118:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalTeamwork.g:119:3: ( rule__Task__Group__0 )
            // InternalTeamwork.g:119:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleHeader"
    // InternalTeamwork.g:128:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalTeamwork.g:129:1: ( ruleHeader EOF )
            // InternalTeamwork.g:130:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalTeamwork.g:137:1: ruleHeader : ( RULE_STRING ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:141:2: ( ( RULE_STRING ) )
            // InternalTeamwork.g:142:2: ( RULE_STRING )
            {
            // InternalTeamwork.g:142:2: ( RULE_STRING )
            // InternalTeamwork.g:143:3: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "rule__Project__Alternatives"
    // InternalTeamwork.g:152:1: rule__Project__Alternatives : ( ( ruleHeader ) | ( ruleTask ) );
    public final void rule__Project__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:156:1: ( ( ruleHeader ) | ( ruleTask ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTeamwork.g:157:2: ( ruleHeader )
                    {
                    // InternalTeamwork.g:157:2: ( ruleHeader )
                    // InternalTeamwork.g:158:3: ruleHeader
                    {
                     before(grammarAccess.getProjectAccess().getHeaderParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHeader();

                    state._fsp--;

                     after(grammarAccess.getProjectAccess().getHeaderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTeamwork.g:163:2: ( ruleTask )
                    {
                    // InternalTeamwork.g:163:2: ( ruleTask )
                    // InternalTeamwork.g:164:3: ruleTask
                    {
                     before(grammarAccess.getProjectAccess().getTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTask();

                    state._fsp--;

                     after(grammarAccess.getProjectAccess().getTaskParserRuleCall_1()); 

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
    // $ANTLR end "rule__Project__Alternatives"


    // $ANTLR start "rule__Task__Group__0"
    // InternalTeamwork.g:173:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:177:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalTeamwork.g:178:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalTeamwork.g:185:1: rule__Task__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:189:1: ( ( RULE_INT ) )
            // InternalTeamwork.g:190:1: ( RULE_INT )
            {
            // InternalTeamwork.g:190:1: ( RULE_INT )
            // InternalTeamwork.g:191:2: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalTeamwork.g:200:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:204:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalTeamwork.g:205:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalTeamwork.g:212:1: rule__Task__Group__1__Impl : ( ';' ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:216:1: ( ( ';' ) )
            // InternalTeamwork.g:217:1: ( ';' )
            {
            // InternalTeamwork.g:217:1: ( ';' )
            // InternalTeamwork.g:218:2: ';'
            {
             before(grammarAccess.getTaskAccess().getSemicolonKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalTeamwork.g:227:1: rule__Task__Group__2 : rule__Task__Group__2__Impl ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:231:1: ( rule__Task__Group__2__Impl )
            // InternalTeamwork.g:232:2: rule__Task__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__2__Impl();

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
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalTeamwork.g:238:1: rule__Task__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:242:1: ( ( RULE_STRING ) )
            // InternalTeamwork.g:243:1: ( RULE_STRING )
            {
            // InternalTeamwork.g:243:1: ( RULE_STRING )
            // InternalTeamwork.g:244:2: RULE_STRING
            {
             before(grammarAccess.getTaskAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSTRINGTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Teamwork__ElementsAssignment"
    // InternalTeamwork.g:254:1: rule__Teamwork__ElementsAssignment : ( ruleProject ) ;
    public final void rule__Teamwork__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamwork.g:258:1: ( ( ruleProject ) )
            // InternalTeamwork.g:259:2: ( ruleProject )
            {
            // InternalTeamwork.g:259:2: ( ruleProject )
            // InternalTeamwork.g:260:3: ruleProject
            {
             before(grammarAccess.getTeamworkAccess().getElementsProjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getTeamworkAccess().getElementsProjectParserRuleCall_0()); 

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
    // $ANTLR end "rule__Teamwork__ElementsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}