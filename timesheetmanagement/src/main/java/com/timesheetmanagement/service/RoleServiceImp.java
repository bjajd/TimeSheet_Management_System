package com.timesheetmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheetmanagement.constant.TimeSheetConstant;
import com.timesheetmanagement.dao.EmployeeDAO;
import com.timesheetmanagement.dao.RoleDAO;
import com.timesheetmanagement.dto.RoleDTO;
import com.timesheetmanagement.exception.RoleNotFoundException;
import com.timesheetmanagement.model.Role;

@Service
public class RoleServiceImp implements RoleService {
	@Autowired
	RoleDAO roleDao;
	@Autowired
	EmployeeDAO employeeDao;
	@Autowired
	RoleDTO roleDto;

	@Override
	public Role addRole(Role role) throws RoleNotFoundException {

		if (role != null) {
			role.setRoleId(null);
			return roleDao.save(role);
		}
		throw new RoleNotFoundException(TimeSheetConstant.ROLE_NOT_FOUND);
	}

	@Override
	public Role updateRole(Role role) throws RoleNotFoundException {
		Optional<Role> optional = roleDao.findById(role.getRoleId());
		if (optional.isPresent()) {
			role.setRoleId(null);
			return roleDao.save(role);
		}
		throw new RoleNotFoundException(TimeSheetConstant.ROLE_NOT_FOUND);
	}

	@Override
	public List<Role> getAllRole() {
		return (List<Role>) roleDao.findAll();
	}

	@Override
	public boolean changeRole(RoleDTO roleDto) {
		Optional<Role> optional = roleDao.findById(roleDto.getRoleId());
		if (optional.isEmpty()) {
			return false;
		}
		roleDao.save(roleDto);
		return true;
	}

	@Override
	public void delete(Integer empId) {
		employeeDao.deleteById(empId);
	}

}
