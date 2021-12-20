package com.timesheetmanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.timesheetmanagement.dto.RoleDTO;
import com.timesheetmanagement.model.Role;

public interface RoleDAO extends CrudRepository<Role, Integer> {

	void save(RoleDTO roleDto);

}
