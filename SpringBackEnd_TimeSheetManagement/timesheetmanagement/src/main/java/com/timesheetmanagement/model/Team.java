package com.timesheetmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer teamId;
	private String teamName;
	private String teamLeader;
	private String teamNotes;
	private String teamMembers;
	@OneToOne(mappedBy = "team")
	private Project project;
	@JoinColumn(name = "emplist")
	@OneToOne(mappedBy = "team")
	private Employee employee;

	public Integer getTeamId() {
		return teamId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}

	public String getTeamNotes() {
		return teamNotes;
	}

	public void setTeamNotes(String teamNotes) {
		this.teamNotes = teamNotes;
	}

	public String getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(String teamMembers) {
		this.teamMembers = teamMembers;
	}

}