package com.timesheetmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheetmanagement.constant.TimeSheetConstant;
import com.timesheetmanagement.dao.TimeSheetDAO;
import com.timesheetmanagement.exception.TimeSheetNotFoundException;
import com.timesheetmanagement.model.TimeSheet;

@Service
public class TimeSheetServiceImp implements TimeSheetService{
	@Autowired
	TimeSheetDAO timeSheetDao;
	@Override
	public List<TimeSheet> getAllTimeSheet() {

		return (List<TimeSheet>) timeSheetDao.findAll();
	}

	@Override
	public TimeSheet addTimeSheet(TimeSheet timeSheet) throws TimeSheetNotFoundException {
		
		
		if (timeSheet!= null) {
			return timeSheetDao.save(timeSheet);
		}
		throw new TimeSheetNotFoundException(TimeSheetConstant.TIMESHEET_NOT_FOUND);
	}

	@Override
	public Boolean updateTimeSheet(TimeSheet timeSheet) {
		Optional<TimeSheet> optional = timeSheetDao.findById(timeSheet.getTimeSheetId());
		if (optional.isEmpty()) {
			return false;
		}
		timeSheetDao.save(timeSheet);
		return true;
	}
	@Override
	public Optional<TimeSheet> getTimeSheet(Integer empId) {
		return timeSheetDao.findById(empId);
	}


}

