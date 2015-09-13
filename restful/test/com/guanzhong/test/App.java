package com.guanzhong.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;
import com.guanzhong.service.EmployeeService;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
		EmployeeService employeeService = (EmployeeService) appContext.getBean("employeeService");
		
//		Employee employee1 = new Employee();
//		employee1.setEmployee_name("claire");
//		
//		Department department = new Department();
//		department.setDepartment_name("human resource");
//		
//		employee1.setDepartment(department);
//		
//		employeeService.save(employee1);
		
		Employee employee = employeeService.getEmployeeById(1);
		System.out.println(employee.getEmployee_name());
		
		
		
		
	}

}
