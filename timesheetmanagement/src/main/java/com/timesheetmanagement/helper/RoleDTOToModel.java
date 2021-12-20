package com.timesheetmanagement.helper;

import org.springframework.stereotype.Component;

import com.timesheetmanagement.dto.RoleDTO;
import com.timesheetmanagement.model.Role;

@Component
public class RoleDTOToModel {
	public Role convertRoleDTOToModel(RoleDTO roleDto) {
		Role role = new Role();
		role.setRoleId(roleDto.getRoleId());
		role.setRoleName(roleDto.getRoleName());
		return role;
	}
}