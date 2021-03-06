/*
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.parser.antlr.internal.InternalAbsParser;
import org.xtext.services.AbsGrammarAccess;

public class AbsParser extends AbstractAntlrParser {

	@Inject
	private AbsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAbsParser createParser(XtextTokenStream stream) {
		return new InternalAbsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DomainModel";
	}

	public AbsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AbsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
