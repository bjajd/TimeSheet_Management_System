package com.timesheetmanagement.helper;

import org.springframework.stereotype.Component;

import com.timesheetmanagement.dto.TeamDTO;
import com.timesheetmanagement.model.Team;

@Component
public class TeamDTOToModel {
	public Team convertTeamDTOToModel(TeamDTO teamDto) {
		Team team = new Team();
		team.setTeamId(teamDto.getTeamId());
		team.setTeamLeader(teamDto.getTeamLeader());
		team.setTeamMembers(teamDto.getTeamMembers());
		team.setTeamName(teamDto.getTeamName());
		team.setTeamNotes(teamDto.getTeamNotes());
		return team;
	}
}
