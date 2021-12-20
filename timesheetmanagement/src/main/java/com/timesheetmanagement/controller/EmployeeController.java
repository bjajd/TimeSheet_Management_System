package com.timesheetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheetmanagement.constant.TimeSheetConstant;
import com.timesheetmanagement.dto.EmployeeDTO;
import com.timesheetmanagement.exception.EmployeeNotFoundException;
import com.timesheetmanagement.exception.RoleNotFoundException;
import com.timesheetmanagement.exception.TimeSheetNotFoundException;
import com.timesheetmanagement.model.Employee;
import com.timesheetmanagement.model.Login;
import com.timesheetmanagement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployee();
	}

	@PostMapping("/addemployee")
	public String addEmployee(@RequestBody EmployeeDTO employee)
			throws EmployeeNotFoundException, RoleNotFoundException, TimeSheetNotFoundException {
		boolean isEmployeeAdded = employeeService.addEmployee(employee);
		if (isEmployeeAdded) {
			return TimeSheetConstant.EMPLOYEE_ADDED;
		} else {
			return TimeSheetConstant.EMPLOYEE_NOT_ADDED;
		}
	}

	@PostMapping("/updateemployee")
	public String updateEmployee(@RequestBody EmployeeDTO employeeDto) throws EmployeeNotFoundException {
		boolean isEmployeeUpdated = employeeService.updateEmployee(employeeDto);
		if (isEmployeeUpdated) {
			return TimeSheetConstant.EMPLOYEE_UPDATE;
		} else {
			return TimeSheetConstant.EMPLOYEE_NOT_UPDATED;
		}
	}

	@DeleteMapping("/employee/{empId}")
	public void deleteEmp(@PathVariable("empId") Integer empId) throws EmployeeNotFoundException {
		List<Employee> employeeList = employeeService.getAllEmployee();
		if (employeeList == null)
			throw new EmployeeNotFoundException("Employee not found");
		employeeService.delete(empId);
	}

	@PostMapping("/login")
	public String login(@RequestBody Login login) throws EmployeeNotFoundException {
		return employeeService.login(login);
	}
}
