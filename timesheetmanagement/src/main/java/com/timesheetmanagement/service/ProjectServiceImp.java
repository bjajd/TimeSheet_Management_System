package com.timesheetmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheetmanagement.dao.EmployeeDAO;
import com.timesheetmanagement.dao.ProjectDAO;
import com.timesheetmanagement.dto.ProjectDTO;
import com.timesheetmanagement.helper.ProjectDTOToModel;
import com.timesheetmanagement.model.Employee;
import com.timesheetmanagement.model.Project;

@Service
public class ProjectServiceImp implements ProjectService{

	@Autowired
	ProjectDAO projectDao;
	@Autowired
	EmployeeDAO employeeDao;
	@Autowired
	ProjectDTOToModel projectDtoToModel;
	
	
	@Override
	public List<Project> getAllProject() {
		return (List<Project>) projectDao.findAll();
	}

	@Override
	public Project addProject(ProjectDTO projectDto) {
		Project project = projectDtoToModel.convertProjectDTOToModel(projectDto);
		return projectDao.save(project);

	}

	@Override
	public Boolean updateProject(ProjectDTO projectDto) {

		Optional<Project> optional = projectDao.findById(projectDto.getProjId());
		if (optional.isEmpty()) {
			return false;
		}
		projectDao.save(projectDto);
		return true;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return  employeeDao.findAll();
	}
	@Override
	public void delete(Integer projId) {
		projectDao.deleteById(projId);
	}
	}
	

