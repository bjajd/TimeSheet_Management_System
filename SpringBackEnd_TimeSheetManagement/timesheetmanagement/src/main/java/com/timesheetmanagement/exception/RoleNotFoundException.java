package com.timesheetmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Role Not Found")
public class RoleNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public RoleNotFoundException() {
		super();
	}

	public RoleNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RoleNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public RoleNotFoundException(String message) {
		super(message);
	}

	public RoleNotFoundException(Throwable cause) {
		super(cause);
	}

}