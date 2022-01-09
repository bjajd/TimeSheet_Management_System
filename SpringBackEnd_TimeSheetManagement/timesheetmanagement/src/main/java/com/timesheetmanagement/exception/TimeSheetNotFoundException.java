package com.timesheetmanagement.exception;

public class TimeSheetNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public TimeSheetNotFoundException() {
		super();

	}

	public TimeSheetNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public TimeSheetNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public TimeSheetNotFoundException(String message) {
		super(message);

	}

	public TimeSheetNotFoundException(Throwable cause) {
		super(cause);

	}

}
