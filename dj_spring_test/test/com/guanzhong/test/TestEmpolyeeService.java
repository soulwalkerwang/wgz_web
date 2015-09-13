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
public class TestEmpolyeeService
{
	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void testSaveOrUpdate()
	{
		Employee employee1 = new Employee();
		employee1.setEmployeeName("bella");
		employee1.setEmployeeAge(24);
		Department department1 = new Department();
		department1.setId(2);
		employee1.setEmployeeDepartment(department1);
	
		employeeService.save(employee1);
		
	}
}
