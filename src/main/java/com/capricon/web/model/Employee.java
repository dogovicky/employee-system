package com.capricon.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	private String employeeId;
	private String firstName;
	private String lastName;
	@ManyToOne
	private Department department;
	private String gender;
	private String email;
	private int phone;
	private String workingSite;
	private String workingTime;

	
	/*public Employee(String employeeId, String firstName, String lastName, Department department, String gender,
			String email, int phone, String workingSite, String workingTime) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.workingSite = workingSite;
		this.workingTime = workingTime;
	}*/
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getWorkingSite() {
		return workingSite;
	}
	public void setWorkingSite(String workingSite) {
		this.workingSite = workingSite;
	}
	public String getWorkingTime() {
		return workingTime;
	}
	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", department=" + department + ", gender=" + gender + ", email=" + email + ", phone=" + phone
				+ ", workingSite=" + workingSite + ", workingTime=" + workingTime + "]";
	}
	
	
	

}
