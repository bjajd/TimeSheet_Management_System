package com.timesheetmanagement.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.timesheetmanagement.constant.TimeSheetConstant;
import com.timesheetmanagement.exception.EmployeeNotFoundException;
import com.timesheetmanagement.exception.ProjectNotFoundException;
import com.timesheetmanagement.exception.RoleNotFoundException;
import com.timesheetmanagement.exception.TimeSheetNotFoundException;

@RestControllerAdvice
public class TimeManagementExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> handleNonExistingEmployee(EmployeeNotFoundException exception) {
		return new ResponseEntity<>(TimeSheetConstant.EMPLOYEE_NOT_FOUND, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ProjectNotFoundException.class)
	public ResponseEntity<Object> handleNonExistingProject(ProjectNotFoundException exception) {
		return new ResponseEntity<>(TimeSheetConstant.PROJECT_NOT_FOUND, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(RoleNotFoundException.class)
	public ResponseEntity<Object> handleNonExistingRole(RoleNotFoundException exception) {
		return new ResponseEntity<>(TimeSheetConstant.ROLE_NOT_FOUND, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(TimeSheetNotFoundException.class)
	public ResponseEntity<Object> handleNonExistingTimeSheet(TimeSheetNotFoundException exception) {
		return new ResponseEntity<>(TimeSheetConstant.TIMESHEET_NOT_FOUND, HttpStatus.NOT_FOUND);
	}
}