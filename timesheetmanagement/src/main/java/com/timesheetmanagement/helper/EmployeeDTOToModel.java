package com.timesheetmanagement.helper;

import org.springframework.stereotype.Component;

import com.timesheetmanagement.dto.EmployeeDTO;
import com.timesheetmanagement.model.Employee;

@Component
public class EmployeeDTOToModel {
	public Employee convertEmployeeDTOToModel(EmployeeDTO employeeDto) {
		Employee employee = new Employee();
		employee.setEmpId(employeeDto.getEmpId());
		employee.setEmpName(employeeDto.getEmpName());
		employee.setEmpDepartId(employeeDto.getEmpDepartId());
		employee.setEmpDesigId(employeeDto.getEmpDesigId());
		employee.setEmpEmail(employeeDto.getEmpEmail());
		employee.setEmpNotes(employeeDto.getEmpNotes());
		employee.setEmpPassword(employeeDto.getEmpPassword());
		employee.setEmpPhone(employeeDto.getEmpPhone());
		employee.setEmpSkills(employeeDto.getEmpSkills());
		employee.setEmpUserName(employeeDto.getEmpUserName());
		employee.setJoinDate(employeeDto.getJoinDate());
		employee.setRoleId(employeeDto.getRoleId());
		employee.setTimeSheet(employeeDto.getTimeSheet());
		return employee;
	}

}
