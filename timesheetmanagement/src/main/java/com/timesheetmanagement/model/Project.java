package com.timesheetmanagement.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer projId;
	private String projName;
	private String projClientName;
	private String projClientBrief;
	private String projClientManager;
	private String projClientEmailId;
	private String projOsId;
	private String projDbId;
	private String projAppServerId;
	private String projPmName;
	private String projPl;
	private String notes;
	private Date startDate;
	private Date endDate;
	private String projStatus;
	@OneToOne
	@JoinColumn(name = "teamid")
	private Team team;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getProjClientName() {
		return projClientName;
	}

	public void setProjClientName(String projClientName) {
		this.projClientName = projClientName;
	}

	public String getProjClientBrief() {
		return projClientBrief;
	}

	public void setProjClientBrief(String projClientBrief) {
		this.projClientBrief = projClientBrief;
	}

	public String getProjClientManager() {
		return projClientManager;
	}

	public void setProjClientManager(String projClientManager) {
		this.projClientManager = projClientManager;
	}

	public String getProjClientEmailId() {
		return projClientEmailId;
	}

	public void setProjClientEmailId(String projClientEmailId) {
		this.projClientEmailId = projClientEmailId;
	}

	public String getProjOsId() {
		return projOsId;
	}

	public void setProjOsId(String projOsId) {
		this.projOsId = projOsId;
	}

	public String getProjDbId() {
		return projDbId;
	}

	public void setProjDbId(String projDbId) {
		this.projDbId = projDbId;
	}

	public String getProjAppServerId() {
		return projAppServerId;
	}

	public void setProjAppServerId(String projAppServerId) {
		this.projAppServerId = projAppServerId;
	}

	public String getProjPmName() {
		return projPmName;
	}

	public void setProjPmName(String projPmName) {
		this.projPmName = projPmName;
	}

	public String getProjPl() {
		return projPl;
	}

	public void setProjPl(String projPl) {
		this.projPl = projPl;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getProjStatus() {
		return projStatus;
	}

	public void setProjStatus(String projStatus) {
		this.projStatus = projStatus;
	}

}
