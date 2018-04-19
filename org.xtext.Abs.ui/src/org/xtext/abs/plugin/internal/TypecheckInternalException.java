package org.xtext.abs.plugin.internal;

public class TypecheckInternalException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Exception wrappedException;
	
	public TypecheckInternalException(Exception wrapped){
		super(wrapped);
		wrappedException = wrapped;
	}
	
	public Exception getWrappedException(){
		return wrappedException;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nWrapped:\n" + wrappedException.toString();
	}
}
