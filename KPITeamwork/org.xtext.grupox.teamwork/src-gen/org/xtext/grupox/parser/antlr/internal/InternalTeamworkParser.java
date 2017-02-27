package org.xtext.grupox.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.grupox.services.TeamworkGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTeamworkParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
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

        public InternalTeamworkParser(TokenStream input, TeamworkGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Teamwork";
       	}

       	@Override
       	protected TeamworkGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTeamwork"
    // InternalTeamwork.g:64:1: entryRuleTeamwork returns [EObject current=null] : iv_ruleTeamwork= ruleTeamwork EOF ;
    public final EObject entryRuleTeamwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeamwork = null;


        try {
            // InternalTeamwork.g:64:49: (iv_ruleTeamwork= ruleTeamwork EOF )
            // InternalTeamwork.g:65:2: iv_ruleTeamwork= ruleTeamwork EOF
            {
             newCompositeNode(grammarAccess.getTeamworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeamwork=ruleTeamwork();

            state._fsp--;

             current =iv_ruleTeamwork; 
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
    // $ANTLR end "entryRuleTeamwork"


    // $ANTLR start "ruleTeamwork"
    // InternalTeamwork.g:71:1: ruleTeamwork returns [EObject current=null] : ( (lv_elements_0_0= ruleProject ) )* ;
    public final EObject ruleTeamwork() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalTeamwork.g:77:2: ( ( (lv_elements_0_0= ruleProject ) )* )
            // InternalTeamwork.g:78:2: ( (lv_elements_0_0= ruleProject ) )*
            {
            // InternalTeamwork.g:78:2: ( (lv_elements_0_0= ruleProject ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTeamwork.g:79:3: (lv_elements_0_0= ruleProject )
            	    {
            	    // InternalTeamwork.g:79:3: (lv_elements_0_0= ruleProject )
            	    // InternalTeamwork.g:80:4: lv_elements_0_0= ruleProject
            	    {

            	    				newCompositeNode(grammarAccess.getTeamworkAccess().getElementsProjectParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleProject();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTeamworkRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.grupox.Teamwork.Project");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleTeamwork"


    // $ANTLR start "entryRuleProject"
    // InternalTeamwork.g:100:1: entryRuleProject returns [String current=null] : iv_ruleProject= ruleProject EOF ;
    public final String entryRuleProject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProject = null;


        try {
            // InternalTeamwork.g:100:47: (iv_ruleProject= ruleProject EOF )
            // InternalTeamwork.g:101:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject.getText(); 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalTeamwork.g:107:1: ruleProject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Header_0= ruleHeader | this_Task_1= ruleTask ) ;
    public final AntlrDatatypeRuleToken ruleProject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Header_0 = null;

        AntlrDatatypeRuleToken this_Task_1 = null;



        	enterRule();

        try {
            // InternalTeamwork.g:113:2: ( (this_Header_0= ruleHeader | this_Task_1= ruleTask ) )
            // InternalTeamwork.g:114:2: (this_Header_0= ruleHeader | this_Task_1= ruleTask )
            {
            // InternalTeamwork.g:114:2: (this_Header_0= ruleHeader | this_Task_1= ruleTask )
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
                    // InternalTeamwork.g:115:3: this_Header_0= ruleHeader
                    {

                    			newCompositeNode(grammarAccess.getProjectAccess().getHeaderParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Header_0=ruleHeader();

                    state._fsp--;


                    			current.merge(this_Header_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTeamwork.g:126:3: this_Task_1= ruleTask
                    {

                    			newCompositeNode(grammarAccess.getProjectAccess().getTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Task_1=ruleTask();

                    state._fsp--;


                    			current.merge(this_Task_1);
                    		

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTask"
    // InternalTeamwork.g:140:1: entryRuleTask returns [String current=null] : iv_ruleTask= ruleTask EOF ;
    public final String entryRuleTask() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTask = null;


        try {
            // InternalTeamwork.g:140:44: (iv_ruleTask= ruleTask EOF )
            // InternalTeamwork.g:141:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask.getText(); 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTeamwork.g:147:1: ruleTask returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= ';' this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleTask() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalTeamwork.g:153:2: ( (this_INT_0= RULE_INT kw= ';' this_STRING_2= RULE_STRING ) )
            // InternalTeamwork.g:154:2: (this_INT_0= RULE_INT kw= ';' this_STRING_2= RULE_STRING )
            {
            // InternalTeamwork.g:154:2: (this_INT_0= RULE_INT kw= ';' this_STRING_2= RULE_STRING )
            // InternalTeamwork.g:155:3: this_INT_0= RULE_INT kw= ';' this_STRING_2= RULE_STRING
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getTaskAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,11,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTaskAccess().getSemicolonKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getTaskAccess().getSTRINGTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleHeader"
    // InternalTeamwork.g:178:1: entryRuleHeader returns [String current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final String entryRuleHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHeader = null;


        try {
            // InternalTeamwork.g:178:46: (iv_ruleHeader= ruleHeader EOF )
            // InternalTeamwork.g:179:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader.getText(); 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalTeamwork.g:185:1: ruleHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTeamwork.g:191:2: (this_STRING_0= RULE_STRING )
            // InternalTeamwork.g:192:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleHeader"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});

}