package com.timesheetmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Employee Not Found")
public class EmployeeNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException() {
		super();

	}

	public EmployeeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public EmployeeNotFoundException(String message) {
		super(message);

	}

	public EmployeeNotFoundException(Throwable cause) {
		super(cause);

	}

}