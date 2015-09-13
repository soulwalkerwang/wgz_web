package com.guanzhong.dao_test;

import java.util.List;

import org.junit.Test;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;
import com.guanzhong.bean.Project;
import com.guanzhong.dao.BaseDaoImpl;
import com.guanzhong.dao.EmployeeDao;
import com.guanzhong.service.EmployeeService;
import com.guanzhong.service.EmployeeServiceImpl;

public class EmployeeServiceImplTest
{
	private EmployeeService employeeService = new EmployeeServiceImpl();
	
	
	
	
	
	
	
	@Test
	public void testFindAll() throws Exception
	{
		
		List<Employee> list = employeeService.findAll(Employee.class);
		
		for(Employee employee : list)
		{
			System.out.println(employee.getEmployee_name());
		}
		
	}
	
	@Test
	public void testGetById() throws Exception
	{
		
		System.out.println(employeeService.getByID(6).getEmployee_name());
		
	}
	
	@Test
	public void testDeleteById() throws Exception
	{
		employeeService.deleteById(2);
		
	}
	
	@Test
	public void testSave() throws Exception
	{
		Employee employee1 = new Employee();
		employee1.setEmployee_name("max");
		
		Department department1 = new Department();
		department1.setDepartment_name("marketing");
		
		Project project1 = new Project();
		project1.setProject_name("java");
		
		employee1.setDepartment(department1);
		employee1.getProject().add(project1);
		
		employeeService.add(employee1);
		
	}
	
	@Test
	public void testSaveOrUpdate() throws Exception
	{
		Employee employee = employeeService.getByID(1);
		employee.setEmployee_name("guanzhong");
		employeeService.saveOrUpdate(employee);
	}
	
	

}
