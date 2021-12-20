package com.timesheetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheetmanagement.constant.TimeSheetConstant;
import com.timesheetmanagement.dto.TeamDTO;
import com.timesheetmanagement.model.Team;
import com.timesheetmanagement.service.TeamService;

@RestController
public class TeamController {
	@Autowired
	TeamService teamService;

	@GetMapping(value = "/teams")
	public List<Team> getAllProjects() {
		return teamService.getAllTeam();
	}

	@PostMapping("/addteamss")
	public String addProject(@RequestBody TeamDTO teamDto) {
		Team isTeamAdded = teamService.addTeam(teamDto);
		if (isTeamAdded != null) {
			return TimeSheetConstant.TEAM_ADDED;
		}
		return TimeSheetConstant.TEAM_NOT_ADDED;
	}

	@PostMapping("/updateteam")
	public String updateTeam(@RequestBody TeamDTO teamDto) {
		boolean isUpdated = teamService.updateTeam(teamDto);
		if (isUpdated) {
			return TimeSheetConstant.TEAM_UPDATE;
		}
		return TimeSheetConstant.TEAM_NOT_UPDATED;
	}
}
