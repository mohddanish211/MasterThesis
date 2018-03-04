package org.xtext;

import org.antlr.runtime.MismatchedTokenException;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;


public class AbsSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider{
	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		System.out.println("Running syntax errrrrrrrrrrrrrrror");
		System.out.println(context.getTokenNames());
		if (context.getRecognitionException() instanceof MismatchedTokenException) {
			System.out.println("Running syntax eroor");
	        MismatchedTokenException exception = (MismatchedTokenException) context.getRecognitionException();
	        String value = exception.token.getText();
	        return new SyntaxErrorMessage("The type of " + value + " is wrong.", AbsIssueCodes.FALSE_PARAMETER_TYPE);
	    }
	    return null;
	}

	
}
