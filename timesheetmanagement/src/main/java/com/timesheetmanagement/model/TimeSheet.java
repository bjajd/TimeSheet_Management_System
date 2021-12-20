package com.timesheetmanagement.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TimeSheet {

	@Id
	private Integer timeSheetId;
	private String timeSheetAct;
	private Date timeSheetDate;
	private String approved;
	private String approvedBy;
	private String timeSheetRejRes;
	private String timeSheetNotes;
	private String timeSheetFeedback;
	private String timeSheetSugges;
	private String timeSheetOtherAct;
	private String timeSheetNoOfHours;

	@OneToOne(mappedBy = "timeSheet")
	private Employee employee;

	public Integer getTimeSheetId() {
		return timeSheetId;
	}

	public void setTimeSheetId(Integer timeSheetId) {
		this.timeSheetId = timeSheetId;
	}

	public String getTimeSheetAct() {
		return timeSheetAct;
	}

	public void setTimeSheetAct(String timeSheetAct) {
		this.timeSheetAct = timeSheetAct;
	}

	public Date getTimeSheetDate() {
		return timeSheetDate;
	}

	public void setTimeSheetDate(Date timeSheetDate) {
		this.timeSheetDate = timeSheetDate;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getTimeSheetRejRes() {
		return timeSheetRejRes;
	}

	public void setTimeSheetRejRes(String timeSheetRejRes) {
		this.timeSheetRejRes = timeSheetRejRes;
	}

	public String getTimeSheetNotes() {
		return timeSheetNotes;
	}

	public void setTimeSheetNotes(String timeSheetNotes) {
		this.timeSheetNotes = timeSheetNotes;
	}

	public String getTimeSheetFeedback() {
		return timeSheetFeedback;
	}

	public void setTimeSheetFeedback(String timeSheetFeedback) {
		this.timeSheetFeedback = timeSheetFeedback;
	}

	public String getTimeSheetSugges() {
		return timeSheetSugges;
	}

	public void setTimeSheetSugges(String timeSheetSugges) {
		this.timeSheetSugges = timeSheetSugges;
	}

	public String getTimeSheetOtherAct() {
		return timeSheetOtherAct;
	}

	public void setTimeSheetOtherAct(String timeSheetOtherAct) {
		this.timeSheetOtherAct = timeSheetOtherAct;
	}

	public String getTimeSheetNoOfHours() {
		return timeSheetNoOfHours;
	}

	public void setTimeSheetNoOfHours(String timeSheetNoOfHours) {
		this.timeSheetNoOfHours = timeSheetNoOfHours;
	}

}
