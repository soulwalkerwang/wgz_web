package com.guanzhong.service;

import java.util.List;

import com.guanzhong.bean.Employee;

public interface EmployeeService
{
	public boolean add(Employee employee);
	
	public boolean delete(Employee employee);
	
	public boolean deleteById(Integer id);
	
	public boolean update(Employee employee);
	
	public boolean saveOrUpdate(Employee employee);
	
	public Employee getByID(Integer id);
	
	public List<Employee> findAll(Class<Employee> entityClass);
	
	

}
