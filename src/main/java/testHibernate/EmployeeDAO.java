package testHibernate;

import java.util.Scanner;

public class EmployeeDAO {
	public static void main(String[] args) {

		Scanner operation = new Scanner(System.in);
		System.out.println("Enter the operation you want to perform- \n Press 1 for Add \n Press 2 for Read");
		String Operation = operation.next(); 
		
		if (Operation.equalsIgnoreCase("1")) {

			System.out.println("Insert Employee");
			System.out.println("Enter employee name");
			String employeenName = operation.next();
			System.out.println("Enter Employee Mobile number"); 
			String employeeMobileNo = operation.next();
			System.out.println("Enter Employee id");			
			int employeeId = operation.nextInt();
			Employee_Add.insert_data(employeenName, employeeId, employeeMobileNo);

		} else if (Operation.equalsIgnoreCase("2")) {

			System.out.println("Get Employee Data");
			System.out.println("Enter employee id for fetching employee data");
			int employeeid = operation.nextInt();
			Employee_read.get_data(employeeid);
		}
		
		
		
		
	}
}