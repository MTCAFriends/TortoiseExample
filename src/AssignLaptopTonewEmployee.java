import java.util.ArrayList;
import java.util.List;

import com.employee.onboard.entity.AssignLaptop;
import com.employee.onboard.entity.Department;
import com.employee.onboard.entity.Employee;
import com.employee.onboard.entity.LaptopDeatils;
import com.employee.onboard.exception.LaptopNotAvailable;
public class AssignLaptopTonewEmployee {

	public static void main(String[] args) throws LaptopNotAvailable {

		Department xDepartment = new Department(1, "X");
		Department yDepartment = new Department(2, "Y");
		Department zDepartment = new Department(3, "Z");

		List<LaptopDeatils> lapTopList = new ArrayList<LaptopDeatils>();
		// Add Laptops for X Department
		int laptopId = 1;
		for (int i = 0; i < 30; i++) {
			LaptopDeatils laptop = new LaptopDeatils(laptopId++, "Dell Precision_001" + i, xDepartment);
			laptop.setAssigned(false);
			lapTopList.add(laptop);

		}
		// Add Laptops for Y Department
		for (int i = 0; i < 30; i++) {
			LaptopDeatils laptop = new LaptopDeatils(laptopId++, "Lenovo Thinkpad_001" + i, yDepartment);
			laptop.setAssigned(false);
			lapTopList.add(laptop);
		}
		// Add Laptops for Z Department
		for (int i = 0; i < 40; i++) {
			LaptopDeatils laptop = new LaptopDeatils(laptopId++, "Apple Mac Book_001" + i, zDepartment);
			laptop.setAssigned(false);
			lapTopList.add(laptop);
		}
		// Adding New Employee
		System.out.println("=====================================================================================================");
		Employee emp1 = new Employee(1, "Bharath", "V", "bharth@gmail.com", 1234567890, xDepartment, lapTopList);
		System.out.println(emp1.getEmployeeDetails());
		System.out.println("Available Laptops :"+AssignLaptop.avaLaptopsCount);
		System.out.println("=====================================================================================================");
		Employee emp2 = new Employee(2, "Purushotham", "p", "purushotham@gmail.com", 1234567890, xDepartment, lapTopList);
		System.out.println(emp2.getEmployeeDetails());
		System.out.println("Available Laptops :"+AssignLaptop.avaLaptopsCount);
		System.out.println("=====================================================================================================");
		Employee emp3 = new Employee(3, "Devaraja", "C", "deva@gmail.com", 1234567890, yDepartment, lapTopList);
		System.out.println(emp3.getEmployeeDetails());
		System.out.println("Available Laptops :"+AssignLaptop.avaLaptopsCount);
		System.out.println("=====================================================================================================");
		Employee emp4 = new Employee(4, "Subbu", "D", "subbu@gmail.com", 1234567890, zDepartment, lapTopList);
		System.out.println(emp4.getEmployeeDetails());
		System.out.println("Available Laptops :"+AssignLaptop.avaLaptopsCount);
		System.out.println("=====================================================================================================");
		

	}

}
