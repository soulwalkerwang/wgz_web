package com.guanzhong.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;
import com.guanzhong.service.DepartmentService;
import com.guanzhong.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-services.xml"})
public class TestDepartmentService
{
	@Autowired
	DepartmentService departmentService;
	
	@Test
	public void testSaveOrUpdate()
	{
		
		Department department1 = new Department();
		department1.setId(1);
		department1.setDepartment_name("sale");
	
		departmentService.saveOrUpdate(department1);
		
	}
	
	@Test
	public void testDelete()
	{
		departmentService.delete(21);
		
	}

}
