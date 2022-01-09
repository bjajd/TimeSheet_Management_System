package com.timesheetmanagement.helper;

import org.springframework.stereotype.Component;

import com.timesheetmanagement.dto.TimeSheetDTO;
import com.timesheetmanagement.model.TimeSheet;

@Component
public class TimeSheetDTOToModel {
	public TimeSheet convertTimeDTOToModel(TimeSheetDTO timeSheetDto) {
		TimeSheet timeSheet = new TimeSheet();
		timeSheet.setTimeSheetId(timeSheetDto.getTimeSheetId());
		timeSheet.setTimeSheetAct(timeSheetDto.getTimeSheetAct());
		timeSheet.setTimeSheetDate(timeSheetDto.getTimeSheetDate());
		timeSheet.setApproved(timeSheetDto.getApproved());
		timeSheet.setApprovedBy(timeSheetDto.getApprovedBy());
		timeSheet.setTimeSheetRejRes(timeSheetDto.getTimeSheetRejRes());
		timeSheet.setTimeSheetNotes(timeSheetDto.getTimeSheetNotes());
		timeSheet.setTimeSheetFeedback(timeSheetDto.getTimeSheetFeedback());
		timeSheet.setTimeSheetSugges(timeSheetDto.getTimeSheetSugges());
		timeSheet.setTimeSheetOtherAct(timeSheetDto.getTimeSheetOtherAct());
		timeSheet.setTimeSheetNoOfHours(timeSheetDto.getTimeSheetNoOfHours());
		return timeSheet;
	}
}
