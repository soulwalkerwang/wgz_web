package com.guanzhong.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.guanzhong.Dao.EmployeeDao;
import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;


@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{   
	
	@Autowired
	EmployeeDao employeeDao;

	
	@Transactional("transactionManager")
	public void save(Employee employee)
	{
		this.employeeDao.save(employee);

	}

	public boolean update(Employee employee)
	{
		return this.employeeDao.update(employee);

	}

	public boolean delete(Integer id)
	{
		return this.employeeDao.delete(id);

	}
	
	public List<Employee> findAllEmployee()
	{
		return this.employeeDao.findAllEmployee();
	}

	public List<Employee> findAllDepartment(Integer id)
	{
		return this.employeeDao.findAllDepartment(id);
	}

	public Employee findbyEmployeeId(Integer did, Integer eid)
	{
		return this.employeeDao.findbyEmployeeId(did, eid);
	}
	
	public Department getDepartmentById(Integer id)
	{
		return this.employeeDao.getDepartmentById(id);
	}
	
	public Employee getEmployeeById(Integer id)
	{
		return this.employeeDao.getEmployeeById(id);
	}
	

}
