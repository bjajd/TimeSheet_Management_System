package com.timesheetmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Project Not Found")
public class ProjectNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProjectNotFoundException() {
		super();

	}

	public ProjectNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public ProjectNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public ProjectNotFoundException(String message) {
		super(message);

	}

	public ProjectNotFoundException(Throwable cause) {
		super(cause);

	}

}