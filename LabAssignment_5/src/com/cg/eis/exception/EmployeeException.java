/**
 * 
 */
package com.cg.eis.exception;

/**
 * @author karan
 *
 */
public class EmployeeException extends Exception{
	String str;
	
	public EmployeeException() {
		str = "Salary is less than 3000";
	}
	
	@Override
	public String toString() {
		return str;
	}

}
