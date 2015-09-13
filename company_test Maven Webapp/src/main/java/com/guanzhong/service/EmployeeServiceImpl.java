package com.guanzhong.service;

import java.util.List;

import com.guanzhong.bean.Employee;
import com.guanzhong.dao.BaseDaoImpl;
import com.guanzhong.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService
{
	private BaseDaoImpl<Employee> baseDaoImpl = new EmployeeDao();

	public boolean add(Employee employee)
	{
		boolean flag = false;
		flag = baseDaoImpl.save(employee);
		return flag;
		
	}

	public boolean delete(Employee employee)
	{
		boolean flag = false;
		flag = baseDaoImpl.delete(employee);
		return flag;
	}

	public boolean deleteById(Integer id)
	{
		boolean flag = false;
		flag = baseDaoImpl.deleteById(id);
		return flag;
	}

	public boolean update(Employee employee)
	{
		boolean flag = false;
		flag = baseDaoImpl.update(employee);
		return flag;
	}

	public boolean saveOrUpdate(Employee employee)
	{
		boolean flag = false;
		flag = baseDaoImpl.saveOrUpdate(employee);
		return flag;
	}

	public Employee getByID(Integer id)
	{
		
		return baseDaoImpl.getByID(id);
	}

	public List<Employee> findAll(Class<Employee> entityClass)
	{
		
		return baseDaoImpl.findAll(entityClass);
	}

}
