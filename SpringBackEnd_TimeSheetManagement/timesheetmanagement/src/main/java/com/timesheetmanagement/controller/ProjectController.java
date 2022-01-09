package com.timesheetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheetmanagement.constant.TimeSheetConstant;
import com.timesheetmanagement.dto.ProjectDTO;
import com.timesheetmanagement.model.Project;
import com.timesheetmanagement.service.ProjectService;

@RestController
@CrossOrigin("*")
public class ProjectController {

	@Autowired
	ProjectService projectService;

	@GetMapping("/project")
	public List<Project> getAllProjects() {
		return projectService.getAllProject();
	}

	@PostMapping("/addprojects")
	public String addProject(@RequestBody ProjectDTO projectDto) {
		Project isProjectAdded = projectService.addProject(projectDto);
		if (isProjectAdded != null) {
			return TimeSheetConstant.PROJECT_ADDED;
		} else {
			return TimeSheetConstant.PROJECT_NOT_ADDED;
		}
	}

	@PostMapping("/updateproject")
	public String updateProject(@RequestBody ProjectDTO projectDto) {
		boolean isProjectUpdated = projectService.updateProject(projectDto);
		if (isProjectUpdated) {
			return TimeSheetConstant.PROJECT_ADDED;
		} else {
			return TimeSheetConstant.PROJECT_NOT_ADDED;
		}
	}

}
