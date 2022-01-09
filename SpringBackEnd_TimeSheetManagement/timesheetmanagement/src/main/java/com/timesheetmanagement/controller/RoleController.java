package com.timesheetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheetmanagement.constant.TimeSheetConstant;
import com.timesheetmanagement.dto.RoleDTO;
import com.timesheetmanagement.model.Role;
import com.timesheetmanagement.service.RoleService;

@RestController
@CrossOrigin("*")
public class RoleController {

	@Autowired
	RoleService roleService;

	@GetMapping(value = "/roles")
	public List<Role> getAllRole() {
		return roleService.getAllRole();
	}

	@PostMapping("/changeRole")
	public String changeRole(@RequestBody RoleDTO roleDto) {
		boolean isChangeRole = roleService.changeRole(roleDto);
		if (isChangeRole) {
			return TimeSheetConstant.ROLE_CHANGE;
		} else {
			return TimeSheetConstant.ROLE_NOT_CHANGE;
		}
	}

	@GetMapping("/role/{empId}")
	public void deleteEmp(@PathVariable("empId") Integer empId) {
		roleService.delete(empId);
	}
}
