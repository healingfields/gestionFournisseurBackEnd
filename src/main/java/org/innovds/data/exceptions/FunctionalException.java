package org.innovds.data.exceptions;

public abstract class FunctionalException extends RuntimeException {

	public FunctionalException() {
		super();
	}
	public FunctionalException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;

}
