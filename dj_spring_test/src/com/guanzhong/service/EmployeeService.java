package com.guanzhong.service;

import java.util.List;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;

public interface EmployeeService
{
	void save(Employee employee);
	boolean update (Employee employee);
	boolean delete (Integer id);
	List<Employee> findAllDepartment(Integer id);
	Employee findbyEmployeeId(Integer did, Integer eid);
	public List<Employee> findAllEmployee();
	public Department getDepartmentById(Integer id);
	public Employee getEmployeeById(Integer id);

}
