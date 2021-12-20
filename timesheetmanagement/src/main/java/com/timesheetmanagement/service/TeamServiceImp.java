package com.timesheetmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.timesheetmanagement.dao.TeamDAO;
import com.timesheetmanagement.dto.TeamDTO;
import com.timesheetmanagement.model.Team;
@Service
public class TeamServiceImp implements TeamService {
	@Autowired
	TeamDAO teamDao;
	@Autowired
	TeamDTO teamDto;
	
	
	
	@Override
	public List<Team> getAllTeam() {
		return (List<Team>) teamDao.findAll();
	}

	@Override
	public Team addTeam(TeamDTO teamDto) {
		return teamDao.save(teamDto);
	
	
	}

	@Override
	public boolean updateTeam(TeamDTO teamDto) {
		Optional<Team> optional = teamDao.findById(teamDto.getTeamId());
		if (optional.isEmpty()) {
			return false;
		}
		teamDao.save(teamDto);
		return true;
	}

	@Override
	public void delete(Integer teamId) {
		teamDao.deleteById(teamId);
	}
	
	
	}
	


