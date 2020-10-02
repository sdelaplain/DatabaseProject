package com.example;

import javax.persistence.Entity;

@Entity	//Tells Hibernate to make a table out of this class
public class Employee {
	
	private Integer employeeID;
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String supervisors;

	public Integer getEmployeeId() {
		return employeeID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getSupervisors() {
		return supervisors;
	}
	
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setSupervisors(String supervisors) {
		this.supervisors = supervisors;
	}

}
