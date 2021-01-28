package org.innovds.data.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends FunctionalException {

	private static final long serialVersionUID = 1L;

	public BadRequestException() {
		super("bad_request");
	}

	public BadRequestException(String message) {
		super(message);
	}
	
}
