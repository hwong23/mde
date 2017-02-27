/*
 * generated by Xtext 2.10.0
 */
package org.xtext.grupox.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.grupox.parser.antlr.internal.InternalTeamworkParser;
import org.xtext.grupox.services.TeamworkGrammarAccess;

public class TeamworkParser extends AbstractAntlrParser {

	@Inject
	private TeamworkGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTeamworkParser createParser(XtextTokenStream stream) {
		return new InternalTeamworkParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Teamwork";
	}

	public TeamworkGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TeamworkGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
