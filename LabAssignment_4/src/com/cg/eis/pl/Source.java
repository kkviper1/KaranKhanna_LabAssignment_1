/**
 * 
 * @author karan
 * 
 *  Desc: Provides a menu user interface to add and display employee details
 *  
 */

package com.cg.eis.pl;

import com.eg.eis.bean.Employee;
import com.eg.eis.service.EmployeeService;
import com.eg.eis.service.EmployeeServiceImpl;

import java.util.Scanner;

/*
 * Driver and menu class
 * 
 */
public class Source {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeServiceImpl();
		int i = 1;
		Employee employee = new Employee();
		
		//Menu
		while(i!=0)
		{
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee Details");
			System.out.println("2. Display Employee Details and Insurance Scheme");
			System.out.println("3. Exit");
			int choice = sc.nextInt();
			switch (choice)
			{
			case 1 : 
				employeeService.setEmpDetails(employee);
				break;
			case 2 :
				employeeService.displayDetails(employee);
				break;
			case 3 :
				i = 0;
				break;
			default :
				System.out.println("Wrong choice");
				break;
			}
		}

	}

}
