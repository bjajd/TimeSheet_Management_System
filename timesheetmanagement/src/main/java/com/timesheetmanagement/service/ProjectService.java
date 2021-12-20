package com.timesheetmanagement.service;

import java.util.List;

import com.timesheetmanagement.dto.ProjectDTO;
import com.timesheetmanagement.model.Employee;
import com.timesheetmanagement.model.Project;

public interface ProjectService {
	
	public List<Project> getAllProject();
	public Boolean updateProject(ProjectDTO projectDto);
	public List<Employee> getAllEmployee();
	void delete(Integer projId);
	public Project addProject(ProjectDTO projectDto);

}
