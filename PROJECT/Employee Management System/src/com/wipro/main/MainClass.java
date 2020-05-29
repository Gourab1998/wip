package com.wipro.main;

import com.wipro.bean.EmployeeBean;
import com.wipro.service.EmployeeService;

public class MainClass {

	public static void main(String[] args) {
		EmployeeBean emp1=new EmployeeBean(1, "Nitish", 100000.0f, "Labour");
		EmployeeBean emp2=new EmployeeBean(2, "Abhro", 500000.0f, "Reja");
		EmployeeBean emp3=new EmployeeBean(3, "Sameer", 200000.0f, "Kuli");
		EmployeeBean emp4=new EmployeeBean(4, "Ashwin", 1000.0f, "Data Scientist");
		EmployeeBean emp5=new EmployeeBean(5, "Sourav", 200.0f, "Ethical Hacker");
		EmployeeBean emp6=new EmployeeBean(6, "Kundan", 10000000.0f, "Microsoft CEO");
		
		EmployeeService empServ=new EmployeeService();
		empServ.insertEmployee(emp1);
		empServ.insertEmployee(emp2);
		empServ.insertEmployee(emp3);
		empServ.insertEmployee(emp4);
		empServ.insertEmployee(emp5);
		empServ.insertEmployee(emp6);
		
		EmployeeBean searchEmp = empServ.findEmployeeByEmpID(9);
		if(searchEmp != null) {
			System.out.println(searchEmp.getName()+" "+searchEmp.getSalary());
		}
	}
}
