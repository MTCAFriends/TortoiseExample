/**
 * 
 */
package com.employee.onboard.entity;

/**
 * @author subbu
 *
 */
public class LaptopDeatils {
	
	private int laptopId;
	private String laptopModel;
	private Department department;
	private boolean assigned;
	private long employeeId;

	public LaptopDeatils(int laptopId, String laptopModel,Department department) {
		super();
		this.laptopId = laptopId;
		this.laptopModel = laptopModel;
		this.department = department;
	}	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopModel() {
		return laptopModel;
	}
	public void setLaptopModel(String laptopModel) {
		this.laptopModel = laptopModel;
	}
	
	public boolean isAssigned() {
		return assigned;
	}
	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "LaptopDeatils [laptopId=" + laptopId + ", laptopModel=" + laptopModel + ", department=" + department
				+ ", assigned=" + assigned + ", employeeId=" + employeeId + "]";
	}
	

}
