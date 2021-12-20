package com.timesheetmanagement.service;

import java.util.List;

import com.timesheetmanagement.dto.TeamDTO;
import com.timesheetmanagement.model.Team;

public interface TeamService {

	List<Team> getAllTeam();

	void delete(Integer teamId);

	Team addTeam(TeamDTO teamDto);

	boolean updateTeam(TeamDTO teamDto);

}
