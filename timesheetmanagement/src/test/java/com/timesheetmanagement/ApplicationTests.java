package com.timesheetmanagement;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.timesheetmanagement.dao.EmployeeDAO;
import com.timesheetmanagement.dao.ProjectDAO;
import com.timesheetmanagement.dao.RoleDAO;
import com.timesheetmanagement.dao.TeamDAO;
import com.timesheetmanagement.model.Employee;
import com.timesheetmanagement.model.Login;
import com.timesheetmanagement.model.Project;
import com.timesheetmanagement.model.Role;
import com.timesheetmanagement.model.Team;

@SpringBootTest
class ApplicationTests {
	@Autowired
	EmployeeDAO employeeDao;
	@Autowired
	ProjectDAO projectDao;
	@Autowired
	RoleDAO roleDao;
	@Autowired
	TeamDAO teamDao;

	@Test
	void employeeLoads() {
		assertNotNull(employeeDao.findAll());

	}

	
	@Test
	void projects() {
		assertNotNull((List<Project>) projectDao.findAll());
	}

	@Test
	void loginTest() {
		Login login = new Login();
		login.setUsername("NEERAC");
		login.setPassword("1972");
		assertNotNull(employeeDao.findByEmpUserName("NEERAC"));
	}

	@Test
	void role() {
		Role role = new Role();
		role.setRoleId(1);
		role.setRoleName("Employee");
		assertNotNull(roleDao.findById(1));
	}

	@Test
	void team() {
		Team team = new Team();
		team.setTeamId(1);
		team.setTeamLeader("Tejaswini");
		team.setTeamMembers("a,b,c");
		team.setTeamNotes("good");
		assertNotNull(teamDao.findById(1));

	}
	

}
