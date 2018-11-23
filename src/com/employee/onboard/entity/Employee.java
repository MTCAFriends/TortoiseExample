/**
 * 
 */
package com.employee.onboard.entity;

import java.util.List;

import com.employee.onboard.exception.LaptopNotAvailable;

public class Employee {
	private long employeeId;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private int age;
	private String address;
	private long mobileNumber;
	private LaptopDeatils laptopDeatils;

	private Department departmentName;

	public Employee(long employeeId, String firstName, String lastName, String emailAddress, long mobileNumber,
			Department departmentName,List<LaptopDeatils> laptopList) throws LaptopNotAvailable {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.age = age;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.departmentName = departmentName;
		laptopDeatils = AssignLaptop.assignLaptopBasedOnDept(departmentName.getDepartmentName(), laptopList, employeeId);
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Department getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(Department departmentName) {
		this.departmentName = departmentName;
	}
	
	public LaptopDeatils getLaptopDeatils() {
		return laptopDeatils;
	}

	public void setLaptopDeatils(LaptopDeatils laptopDeatils) {
		this.laptopDeatils = laptopDeatils;
	}

	public String getEmployeeDetails() {
		return "Employee Id="+employeeId+", Employee Name="+firstName+" "+ lastName+" ,Department="+departmentName.getDepartmentName()+
				",Laptop Model="+laptopDeatils.getLaptopModel();
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailAddress=" + emailAddress + ", age=" + age + ", address=" + address + ", mobileNumber="
				+ mobileNumber + ", laptopDeatils=" + laptopDeatils + ", departmentName=" + departmentName
				+ ", getDepartmentName()=" + getDepartmentName() + ", getLaptopDeatils()=" + getLaptopDeatils() + "]";
	}
	



}
