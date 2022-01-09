
package com.timesheetmanagement.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	@OneToOne
	@JoinColumn(name = "role_id")
	private Role role;
	private String empName;
	private Integer empDesigId;
	private String empPhone;
	private String empEmail;
	private String empPassword;
	private Date joinDate;
	private String empSkills;
	private String empNotes;
	private String empDepartId;
	private String empUserName;

	@OneToOne
	@JoinColumn(name = "timesheetid")
	private TimeSheet timeSheet;

	public TimeSheet getTimeSheet() {
		return timeSheet;
	}

	public void setTimeSheet(TimeSheet timeSheet) {
		this.timeSheet = timeSheet;
	}

	@OneToOne
	@JoinColumn(name = "team")
	private Team team;

	public String getEmpUserName() {
		return empUserName;
	}

	public void setEmpUserName(String empUserName) {
		this.empUserName = empUserName;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getEmpSkills() {
		return empSkills;
	}

	public void setEmpSkills(String empSkills) {
		this.empSkills = empSkills;
	}

	public String getEmpNotes() {
		return empNotes;
	}

	public void setEmpNotes(String empNotes) {
		this.empNotes = empNotes;
	}

	public String getEmpDepartId() {
		return empDepartId;
	}

	public void setEmpDepartId(String empDepartId) {
		this.empDepartId = empDepartId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpDesigId() {
		return empDesigId;
	}

	public void setEmpDesigId(Integer empDesigId) {
		this.empDesigId = empDesigId;
	}

	public Role getRoleId() {
		return role;
	}

	public void setRoleId(Role role) {
		this.role = role;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

}
