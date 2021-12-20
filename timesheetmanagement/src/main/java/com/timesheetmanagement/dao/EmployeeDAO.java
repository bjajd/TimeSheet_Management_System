package com.timesheetmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheetmanagement.dto.EmployeeDTO;
import com.timesheetmanagement.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

	Employee findByEmpUserName(String empUserName);

	void save(EmployeeDTO employeeDto);

}
