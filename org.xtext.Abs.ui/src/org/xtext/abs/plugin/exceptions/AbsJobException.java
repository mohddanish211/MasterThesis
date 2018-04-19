package org.xtext.abs.plugin.exceptions;

public class AbsJobException extends Exception {

	public AbsJobException() {
		super();
	}
	
	public AbsJobException(String message) {
		super(message);
	}

	public AbsJobException(Exception e) {
		super(e);
	}

}
