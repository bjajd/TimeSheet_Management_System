package com.timesheetmanagement.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.timesheetmanagement.model.Employee;
@Component
public class TeamDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer teamId;
	private String teamName;
	private String teamLeader;
	private String teamNotes;
	private String teamMembers;
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