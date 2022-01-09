package com.timesheetmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheetmanagement.constant.TimeSheetConstant;
import com.timesheetmanagement.dao.EmployeeDAO;
import com.timesheetmanagement.dto.EmployeeDTO;
import com.timesheetmanagement.exception.EmployeeNotFoundException;
import com.timesheetmanagement.exception.RoleNotFoundException;
import com.timesheetmanagement.exception.TimeSheetNotFoundException;
import com.timesheetmanagement.helper.EmployeeDTOToModel;
import com.timesheetmanagement.model.Employee;
import com.timesheetmanagement.model.Login;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	EmployeeDTOToModel employeeDtoToModel;
	@Autowired
	EmployeeDAO employeeDao;
	@Autowired
	RoleService roleService;
	@Autowired
	TimeSheetService timeSheetService;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Boolean addEmployee(EmployeeDTO employeeDto) throws EmployeeNotFoundException, RoleNotFoundException, TimeSheetNotFoundException {

		if (employeeDto != null) {
			Employee employee = employeeDtoToModel.convertEmployeeDTOToModel(employeeDto);
			roleService.addRole(employeeDto.getRoleId());
			timeSheetService.addTimeSheet(employee.getTimeSheet());
			employeeDao.save(employee);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(EmployeeDTO employeeDto) throws EmployeeNotFoundException {
		Employee employee = employeeDtoToModel.convertEmployeeDTOToModel(employeeDto);
		Optional<Employee> optional = employeeDao.findById(employeeDto.getEmpId());
		if (optional.isPresent()) {
			employeeDao.save(employee);
			return true;
		}
		return false;
	}

	@Override
	public String login(Login login) throws EmployeeNotFoundException {
		Employee employee = employeeDao.findByEmpUserName(login.getUsername());

		if (employee == null) {
			throw new EmployeeNotFoundException(TimeSheetConstant.EMPLOYEE_NOT_FOUND);
		}
		if (!employee.getEmpPassword().equals(login.getPassword())) {
			throw new EmployeeNotFoundException(TimeSheetConstant.EMPLOYEE_NOT_FOUND);
		}
		return TimeSheetConstant.LOGIN;
	}

	@Override
	public void delete(Integer empId) {
		employeeDao.deleteById(empId);
	}

	
}
