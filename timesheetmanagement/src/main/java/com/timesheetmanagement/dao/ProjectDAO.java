package com.timesheetmanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.timesheetmanagement.dto.ProjectDTO;
import com.timesheetmanagement.model.Project;

public interface ProjectDAO extends CrudRepository<Project, Integer> {

	void save(ProjectDTO projectDto);

}
