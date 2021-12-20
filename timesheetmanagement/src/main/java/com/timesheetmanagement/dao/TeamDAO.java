package com.timesheetmanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.timesheetmanagement.dto.TeamDTO;
import com.timesheetmanagement.model.Team;

public interface TeamDAO extends CrudRepository<Team, Integer> {

	Team save(TeamDTO teamDto);

}
