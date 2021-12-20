package com.timesheetmanagement.service;


import java.util.List;

import com.timesheetmanagement.dto.RoleDTO;
import com.timesheetmanagement.exception.RoleNotFoundException;
import com.timesheetmanagement.model.Role;

public interface RoleService {

	public Role addRole(Role role) throws  RoleNotFoundException;

	public Role updateRole(Role role) throws RoleNotFoundException;

	public List<Role> getAllRole();


	void delete(Integer empId);

	public boolean changeRole(RoleDTO roleDto);
	
}
