/*
 * generated by Xtext 2.10.0
 */
grammar InternalTeamwork;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.grupox.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleTeamwork
entryRuleTeamwork
:
{ before(grammarAccess.getTeamworkRule()); }
	 ruleTeamwork
{ after(grammarAccess.getTeamworkRule()); } 
	 EOF 
;

// Rule Teamwork
ruleTeamwork 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTeamworkAccess().getElementsAssignment()); }
		(rule__Teamwork__ElementsAssignment)*
		{ after(grammarAccess.getTeamworkAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProject
entryRuleProject
:
{ before(grammarAccess.getProjectRule()); }
	 ruleProject
{ after(grammarAccess.getProjectRule()); } 
	 EOF 
;

// Rule Project
ruleProject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProjectAccess().getAlternatives()); }
		(rule__Project__Alternatives)
		{ after(grammarAccess.getProjectAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTask
entryRuleTask
:
{ before(grammarAccess.getTaskRule()); }
	 ruleTask
{ after(grammarAccess.getTaskRule()); } 
	 EOF 
;

// Rule Task
ruleTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskAccess().getGroup()); }
		(rule__Task__Group__0)
		{ after(grammarAccess.getTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHeader
entryRuleHeader
:
{ before(grammarAccess.getHeaderRule()); }
	 ruleHeader
{ after(grammarAccess.getHeaderRule()); } 
	 EOF 
;

// Rule Header
ruleHeader 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProjectAccess().getHeaderParserRuleCall_0()); }
		ruleHeader
		{ after(grammarAccess.getProjectAccess().getHeaderParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getProjectAccess().getTaskParserRuleCall_1()); }
		ruleTask
		{ after(grammarAccess.getProjectAccess().getTaskParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__0__Impl
	rule__Task__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
	{ after(grammarAccess.getTaskAccess().getINTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__1__Impl
	rule__Task__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getSemicolonKeyword_1()); }
	';'
	{ after(grammarAccess.getTaskAccess().getSemicolonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getSTRINGTerminalRuleCall_2()); }
	RULE_STRING
	{ after(grammarAccess.getTaskAccess().getSTRINGTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Teamwork__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTeamworkAccess().getElementsProjectParserRuleCall_0()); }
		ruleProject
		{ after(grammarAccess.getTeamworkAccess().getElementsProjectParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;