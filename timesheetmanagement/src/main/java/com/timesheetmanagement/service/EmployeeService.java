package com.timesheetmanagement.service;

import java.util.List;

import com.timesheetmanagement.dto.EmployeeDTO;
import com.timesheetmanagement.exception.EmployeeNotFoundException;
import com.timesheetmanagement.exception.RoleNotFoundException;
import com.timesheetmanagement.exception.TimeSheetNotFoundException;
import com.timesheetmanagement.model.Employee;
import com.timesheetmanagement.model.Login;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	public Boolean addEmployee(EmployeeDTO employeeDto) throws EmployeeNotFoundException, RoleNotFoundException, TimeSheetNotFoundException;
	
	String login(Login login) throws EmployeeNotFoundException;
	void delete(Integer empId);
	public boolean updateEmployee(EmployeeDTO employeeDto)throws EmployeeNotFoundException;
	
	
	
}
