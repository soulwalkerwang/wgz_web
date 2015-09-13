package com.guanzhong.dao_test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.junit.Test;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;
import com.guanzhong.bean.Project;
import com.guanzhong.dao.BaseDaoImpl;
import com.guanzhong.dao.EmployeeDao;



public class DaoTest
{
	
	
	@Test
	public void testFindAll() throws Exception
	{
		BaseDaoImpl<Employee> baseDaoImpl = new EmployeeDao();
		List<Employee> list = baseDaoImpl.findAll(Employee.class);
		
		for(Employee employee : list)
		{
			System.out.println(employee.getEmployee_name());
		}
		
	}
	
	@Test
	public void testGetById() throws Exception
	{
		BaseDaoImpl<Employee> baseDaoImpl = new EmployeeDao();
		System.out.println(baseDaoImpl.getByID(6).getEmployee_name());
		
		
		
	}
	
	@Test
	public void testDeleteById() throws Exception
	{
		BaseDaoImpl<Employee> baseDaoImpl = new EmployeeDao();
		baseDaoImpl.deleteById(2);
		
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
		
		
	
		
		BaseDaoImpl<Employee> baseDaoImpl = new EmployeeDao();
		baseDaoImpl.save(employee1);
		
	}
	
	@Test
	public void testSaveOrUpdate() throws Exception
	{
		
		BaseDaoImpl<Employee> baseDaoImpl = new EmployeeDao();
		Employee employee = baseDaoImpl.getByID(2);
		employee.setEmployee_name("guanzhong");
		baseDaoImpl.saveOrUpdate(employee);
	}
	
	

}
