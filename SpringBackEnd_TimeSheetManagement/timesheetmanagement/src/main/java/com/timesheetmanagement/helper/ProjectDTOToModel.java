package com.timesheetmanagement.helper;

import org.springframework.stereotype.Component;

import com.timesheetmanagement.dto.ProjectDTO;
import com.timesheetmanagement.model.Project;

@Component
public class ProjectDTOToModel {
	public Project convertProjectDTOToModel(ProjectDTO projectDto) {
		Project project = new Project();
		project.setProjId(projectDto.getProjId());
		project.setProjName(projectDto.getProjName());
		project.setProjDbId(projectDto.getProjDbId());
		project.setProjOsId(projectDto.getProjOsId());
		project.setProjClientBrief(projectDto.getProjClientBrief());
		project.setProjClientEmailId(projectDto.getProjClientEmailId());
		project.setProjClientManager(projectDto.getProjClientManager());
		project.setProjAppServerId(projectDto.getProjAppServerId());
		project.setProjClientName(projectDto.getProjClientName());
		project.setProjPl(projectDto.getProjPl());
		project.setProjPmName(projectDto.getProjPmName());
		project.setProjStatus(projectDto.getProjStatus());
		project.setStartDate(projectDto.getStartDate());
		project.setEndDate(projectDto.getEndDate());
		project.setNotes(projectDto.getNotes());
		project.setProjStatus(projectDto.getProjStatus());
		return project;
	}
}
