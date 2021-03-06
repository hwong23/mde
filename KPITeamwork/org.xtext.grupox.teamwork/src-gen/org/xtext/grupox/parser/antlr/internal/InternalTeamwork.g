/*
 * generated by Xtext 2.10.0
 */
grammar InternalTeamwork;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.grupox.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTeamwork
entryRuleTeamwork returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTeamworkRule()); }
	iv_ruleTeamwork=ruleTeamwork
	{ $current=$iv_ruleTeamwork.current; }
	EOF;

// Rule Teamwork
ruleTeamwork returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTeamworkAccess().getElementsProjectParserRuleCall_0());
			}
			lv_elements_0_0=ruleProject
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTeamworkRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.grupox.Teamwork.Project");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleProject
entryRuleProject returns [String current=null]:
	{ newCompositeNode(grammarAccess.getProjectRule()); }
	iv_ruleProject=ruleProject
	{ $current=$iv_ruleProject.current.getText(); }
	EOF;

// Rule Project
ruleProject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getProjectAccess().getHeaderParserRuleCall_0());
		}
		this_Header_0=ruleHeader
		{
			$current.merge(this_Header_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProjectAccess().getTaskParserRuleCall_1());
		}
		this_Task_1=ruleTask
		{
			$current.merge(this_Task_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTask
entryRuleTask returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current.getText(); }
	EOF;

// Rule Task
ruleTask returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getTaskAccess().getINTTerminalRuleCall_0());
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTaskAccess().getSemicolonKeyword_1());
		}
		this_STRING_2=RULE_STRING
		{
			$current.merge(this_STRING_2);
		}
		{
			newLeafNode(this_STRING_2, grammarAccess.getTaskAccess().getSTRINGTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleHeader
entryRuleHeader returns [String current=null]:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	iv_ruleHeader=ruleHeader
	{ $current=$iv_ruleHeader.current.getText(); }
	EOF;

// Rule Header
ruleHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
