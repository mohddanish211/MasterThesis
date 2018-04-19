package org.xtext.abs.plugin.exceptions;

import abs.frontend.analyser.SemanticCondition;
import abs.frontend.analyser.SemanticConditionList;

public class TypeCheckerException extends Exception{

	public TypeCheckerException(){
	}
	
	public TypeCheckerException(SemanticConditionList typeErrors){
		super(getMessage(typeErrors));
	}
	
	private static String getMessage(SemanticConditionList typeErrors){
		StringBuffer result = new StringBuffer("Project contains parse errors: ");
		for(SemanticCondition error : typeErrors){
			//TODO: newline doesn't work ):
			result.append('\n');
			result.append(error.getFileName());
			result.append(':');
			result.append(error.getLine());
			result.append(':');
			result.append(error.getColumn());
			result.append(' ');
			result.append(error.getMessage());
		}
		return result.toString();
	}
}