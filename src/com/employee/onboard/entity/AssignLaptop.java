/**
 * 
 */
package com.employee.onboard.entity;
import java.util.ArrayList;
import java.util.List;

import com.employee.onboard.exception.LaptopNotAvailable;
public class AssignLaptop {
	
	public static int avaLaptopsCount = 100;
	
	public static LaptopDeatils assignLaptopBasedOnDept(String departmentName,List<LaptopDeatils>
	laptopList,long employeeId) throws LaptopNotAvailable {
		LaptopDeatils assignedLaptop = null;
		
		List<LaptopDeatils> availableLaptopList = getAvailableLaptopsByDeptName(laptopList,departmentName);
		if(availableLaptopList != null && availableLaptopList.size() > 0) {
			assignedLaptop = availableLaptopList.get(0);
			availableLaptopList.get(0).setAssigned(true);
			availableLaptopList.get(0).setEmployeeId(employeeId);
			avaLaptopsCount --;
		}else {
			throw new LaptopNotAvailable("There is no Available Laptops this Department");
		}
		return assignedLaptop;
	}
	private static List<LaptopDeatils> getAvailableLaptopsByDeptName(List<LaptopDeatils> 
	laptopList,String departmentName) {
		List<LaptopDeatils> availableLaptopList = new ArrayList();
		if(laptopList != null && laptopList.size() > 0) {
			for(LaptopDeatils laptop : laptopList) {
				if(departmentName.equals(laptop.getDepartment().getDepartmentName()) && !laptop.isAssigned()) {
					availableLaptopList.add(laptop);
				}
			}
			return availableLaptopList;
		}
		
		return null;
	}
	

}
