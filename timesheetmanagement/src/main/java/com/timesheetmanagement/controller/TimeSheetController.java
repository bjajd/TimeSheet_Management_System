package com.timesheetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timesheetmanagement.constant.TimeSheetConstant;
import com.timesheetmanagement.exception.EmployeeNotFoundException;
import com.timesheetmanagement.model.TimeSheet;
import com.timesheetmanagement.service.TimeSheetService;

@RestController
public class TimeSheetController {

	@Autowired
	TimeSheetService timeSheetService;

	@GetMapping(value = "/timesheets")
	public List<TimeSheet> getAllTimeSheet() throws EmployeeNotFoundException {
		List<TimeSheet> timeSheetList = timeSheetService.getAllTimeSheet();
		if (timeSheetList == null)
			throw new EmployeeNotFoundException(TimeSheetConstant.EMPLOYEE_NOT_FOUND);
		return timeSheetList;
	}
}
