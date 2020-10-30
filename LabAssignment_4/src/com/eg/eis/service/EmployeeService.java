/**
 * 
 *  @author karan
 */
package com.eg.eis.service;
import com.eg.eis.*;
import com.eg.eis.bean.Employee;

/*
 * 
 * EmployeeService is an interface that provides functionality for Setting employee details, finding the appropriate insurance scheme
 * and displaying the employee details
 * 
 */
public interface EmployeeService {
	public void setEmpDetails(Employee employee);
	public String findScheme(double salary);
	public void displayDetails(Employee employee);

}
