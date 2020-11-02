/**
 * 
 * @author karan
 * 
 */

package com.eg.eis.service;
import java.util.*;

import com.cg.eis.exception.EmployeeException;
import com.eg.eis.bean.Employee;

/*
 * 
 * EmployeeServiceImpl implements the EmployeeService interface by providing business logic for the methods
 * 
 */
public class EmployeeServiceImpl implements EmployeeService{
	Scanner sc = new Scanner(System.in);
	
	/*
	 * setEmpDetails() takes an employee object and sets the necessary fields with appropriate values from the user
	 */
	@Override
	public void setEmpDetails(Employee employee) {
		try {
			System.out.println("Enter Employee name : ");
			String name = sc.next();
			System.out.println("Enter salary : ");
			double salary = sc.nextDouble();
			if(salary < 3000)
			{
				throw new EmployeeException();
			}
			System.out.println("Enter designation : ");
			String designation = sc.next();
			
			
			employee.setId(System.currentTimeMillis());
			employee.setName(name);
			employee.setSalary(salary);
			employee.setDesignation(designation);
			employee.setInsuranceScheme(findScheme(salary));
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		
		
	}

	/*
	 * findScheme() method calculates the appropriate insurance scheme based on the salary of the employee
	 * 
	 * There are 3 insurance schemes : Silver, Gold and Platinum with Silver being the worst and Platinum being the best
	 * 
	 */
	@Override
	public String findScheme(double salary) {
		String insurance;
		
		if(salary >=20000.0)
		{
			insurance = "Silver";
		}
		if(salary >=50000.0)
		{
			insurance = "Gold";
		}
		if(salary >=100000.0)
		{
			insurance = "Platinum";
		}
		else
			insurance = "No insurance available";
		
		return insurance;
		
	}

	/*
	 * displayDetails() method provides the user with all the Employee details
	 */
	@Override
	public void displayDetails(Employee employee) {
		System.out.println(employee.toString());
	}

}
