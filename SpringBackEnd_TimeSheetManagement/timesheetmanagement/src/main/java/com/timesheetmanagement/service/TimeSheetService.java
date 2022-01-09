package com.timesheetmanagement.service;

import java.util.List;
import java.util.Optional;

import com.timesheetmanagement.exception.TimeSheetNotFoundException;
import com.timesheetmanagement.model.TimeSheet;

public interface TimeSheetService {

	public List<TimeSheet> getAllTimeSheet();

	public TimeSheet addTimeSheet(TimeSheet timeSheet) throws  TimeSheetNotFoundException;

	public Boolean updateTimeSheet(TimeSheet timeSheet);

	Optional<TimeSheet> getTimeSheet(Integer empId);

}
